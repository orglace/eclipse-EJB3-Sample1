import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

import com.example.ejb.entity.Customer;
import com.example.ejb.service.AccountServiceRemote;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! I'm an EJB Client");
		//List<Customer> customers = accountService.findAllCustomers();
		InitialContext ctx;
		try {
			Properties properties = new Properties();
			properties.setProperty("java.naming.factory.initial",
                    "com.sun.enterprise.naming.SerialInitContextFactory");
			properties.setProperty("java.naming.factory.url.pkgs",
                    "com.sun.enterprise.naming");
			properties.setProperty("java.naming.factory.state",
                    "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
			
			ctx = new InitialContext(properties);
			NamingEnumeration namingEnum = ctx.list("");

			while (namingEnum.hasMoreElements()) {
				System.out.println("properties: " + namingEnum.nextElement());
				
			}
			
			AccountServiceRemote accountService = (AccountServiceRemote) ctx.lookup("mappedAccountService");
			List<Customer> customers = accountService.findAllCustomers(); 
			
			for (Customer customer : customers) {
				System.out.println(customer.getFirstName()+" "+customer.getLastName());
			}
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}