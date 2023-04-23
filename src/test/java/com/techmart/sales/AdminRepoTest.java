package com.techmart.sales;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.techmart.sales.model.Admin;
import com.techmart.sales.repository.AdminRepo;




@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class AdminRepoTest {

	@Autowired
	private AdminRepo repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateAdmin() {
		Admin admin = new Admin();
		admin.setEmail("abdul@gmail.com");
		admin.setPassword("abdul2022");
		admin.setFirstName("Abdul");
		admin.setLastName("Nazardeen");

		
		
		Admin saveAdmin = repo.save(admin);
		
		Admin existAdmin = entityManager.find(Admin.class, saveAdmin.getAdmin_id());
	
		assertThat(existAdmin.getEmail()).isEqualTo(admin.getEmail());
	
	}
	
	@Test
	public void testFindUserByEmail() {
		String email = "abdul@gmail.com";
		
		Admin admin = repo.findByEmail(email);
		
		assertThat(admin).isNotNull();
	}
	
	
}
