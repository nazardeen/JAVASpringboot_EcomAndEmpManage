package com.techmart.sales.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.techmart.sales.model.Stock;
import com.techmart.sales.repository.StockRepo;


@Service
public class StockService {

	@Autowired
    private StockRepo stockRepository;    
	
	
	public void saveProductTODb(MultipartFile file, String name, String type, 
			String description, int price)
	{
		Stock p= new Stock();
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a valid file");
		}
		try {
			p.setMainImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.setDescription(description);
		p.setStockName(name);
		p.setPrice(price);
		p.setType(type);
		
		stockRepository.save(p);
	}
	
	
	// READ
	public List<Stock> getAllProduct() {
	    return stockRepository.findAll();
	}
	
	// DELETE
	public void deleteStock(Long id) {
		stockRepository.deleteById(id);
	}
	
	
	// CREATE 
//	public Stock createStock(Stock stk) {
//	    return stockRepository.save(stk);
//	}
	

	
    public void chageStocktName(Long id ,String stockName)
    {
    	Stock p = new Stock();
    	p = stockRepository.findById(id).get();
    	p.setStockName(stockName);
    	stockRepository.save(p);    
    }
    public void changeStockDescription(Long id , String description)
    {
    	Stock p = new Stock();;
    	p = stockRepository.findById(id).get();
    	p.setDescription(description);
    	stockRepository.save(p);
    }
    public void changeStockPrice(Long id,int price)
    {
    	Stock p = new Stock();
    	p = stockRepository.findById(id).get();
    	p.setPrice(price);
    	stockRepository.save(p);
    }
    public void changeStockType(Long id,String type)
    {
    	Stock p = new Stock();
    	p = stockRepository.findById(id).get();
    	p.setType(type);
    	stockRepository.save(p);
    }
	
//public List<Stock> searchProductByNameLike(String value) {
//		
//		return stockRepository.findByNameContainingIgnoreCase(value);
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	/*// UPDATE
	public Stock updateStock(Long stkId, Stock stockDetails) {
			Stock stk = stockRepository.findById(stkId).get();
			stk.setStockName(stockDetails.getStockName());
			stk.setType(stockDetails.getType());
			stk.setDescription(stockDetails.getDescription());
	        
	        return stockRepository.save(stk);  
		
	*/
}


	

