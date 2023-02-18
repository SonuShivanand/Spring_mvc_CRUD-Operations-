package employe.dto;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	import org.springframework.stereotype.Component;
	@Entity
	@Component
	public class Employee {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		String name;
		long mobile;
		String email;
		String password;
		
		public void setMobile(long mobile) 
		{
			this.mobile = mobile;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		
		public long getMobile()
		{
			return mobile;
		}
		public String getEmail() 
		{
			return email;
		}
		public void setEmail(String email)
		{
			this.email = email;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", password="
					+ password + "]";
		}
		public String getPassword() 
		{
			return password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
	}

