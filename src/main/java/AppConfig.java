

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Model.Employee;

@Configuration
public class AppConfig {
  @Bean
	public Employee empObj() {
		Employee emp = new Employee();
		emp.setEmpId(16);
		emp.setEmpName("Amit Bapudas Mahant");
		emp.setEmpSal(12000.00);
		return emp;
	}

}
