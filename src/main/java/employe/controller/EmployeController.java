package employe.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

	import employe.dao.EmployeeDao;
	import employe.dto.Employee;

	@Controller
	public class EmployeController 
	{
		@Autowired
		Employee employee;
		
		@Autowired
		EmployeeDao dao;
		
		@RequestMapping("load")
		public ModelAndView loadEmployee()
		{
			ModelAndView andView=new ModelAndView("signup.jsp");
//			or	andView.setViewName("signup.jsp");
//			Employee employee=new Employee(); to avoid this we take Autowired bcz spring will create the object
			andView.addObject("emp", employee);
			return andView;
		}
		
		@RequestMapping("signup")
		public ModelAndView saveEmployee(@ModelAttribute Employee emp)
		{
			dao.signup(emp);
			ModelAndView andView=new ModelAndView("login.jsp");
			andView.addObject("msg","Account created Successfully");
			return andView;
		}
		@PostMapping("login")
		public ModelAndView login(@RequestParam String email,@RequestParam String password)
		{
			ModelAndView modelAndView= new ModelAndView();
			Employee employee=dao.login(email);
			if(employee==null)
			{
				modelAndView.setViewName("login.jsp");
				modelAndView.addObject("msg","Invalid Email");
			}
			else
			{
				if(password.equals(employee.getPassword()))
				{
					modelAndView.setViewName("result.jsp");
					modelAndView.addObject("list",dao.fetchAll() );
					modelAndView.addObject("msg","Logged in Successfully");
				}
				else
				{
					modelAndView.setViewName("login.jsp");
					modelAndView.addObject("msg","Invalid Email");
				}
			}
			return modelAndView;
		}
		@RequestMapping("delete")
		 public ModelAndView delete(@RequestParam int id)
		 {
			dao.delete(id);
			ModelAndView andView=new ModelAndView("result.jsp");
			andView.addObject(" list",dao.fetchAll());
			andView.addObject("msg","Deleted Succesfully..");
			 return andView;
		 }
		@RequestMapping("edit")
		public ModelAndView edit(@RequestParam int id)
		{
			ModelAndView andView=new ModelAndView("edit.jsp");
			andView.addObject("emp", dao.find(id));
			return andView;
		}
		@RequestMapping("update")
		public ModelAndView update(@ModelAttribute Employee emp)
		{
			dao.update(emp);
			ModelAndView andView=new ModelAndView("result.jsp");
			andView.addObject("list",dao.fetchAll());
			andView.addObject("msg","Account Updated Successfully");
			return andView;
		}
		}



