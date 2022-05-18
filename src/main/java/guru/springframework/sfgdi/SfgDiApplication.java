package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ContructorInjectionController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectionController;
import guru.springframework.sfgdi.controllers.SetterInjectionController;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jca.cci.CciOperationNotSupportedException;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------Profile EN ------");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("------property Injection ------");

		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());

		System.out.println("------setter Injection ------");

		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("------constructor Injection ------");

		ContructorInjectionController  contructorInjectionController = (ContructorInjectionController) ctx.getBean("contructorInjectionController");
		System.out.println(contructorInjectionController.getGreeting()	);


	}

}
