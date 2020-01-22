package com.facker.examp;

import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.BaseProducer;
import com.devskiller.jfairy.producer.company.Company;
import com.devskiller.jfairy.producer.net.NetworkProducer;
import com.devskiller.jfairy.producer.payment.CreditCard;
import com.devskiller.jfairy.producer.person.Person;
import com.devskiller.jfairy.producer.person.PersonProperties;

public class JFairyExamp {
public static void main(String[] args) {
	Fairy fairy = Fairy.create();
	Person person = fairy.person();

	System.out.println("Firstname " + person.getFirstName());            
	System.out.println("Lastname " + person.getLastName());
	System.out.println("Fullname " + person.getFullName());               
    System.out.println("Middlename " + person.getMiddleName());
    System.out.println(person.getEmail());
	System.out.println(person.getTelephoneNumber());     
	System.out.println(person.getAge());
	System.out.println(person.getNationalIdentificationNumber());
	System.out.println(person.getNationalIdentityCardNumber());
	System.out.println(person.getPassportNumber());
	System.out.println(person.getCompanyEmail());
	System.out.println(person.getTelephoneNumber());
	System.out.println(person.getUsername());
	Person pass = fairy.person(PersonProperties.withPassword(""));
	System.out.println(person.getPassword());
	System.out.println(person.getSex());
	System.out.println(person.getDateOfBirth());
	Person adultMale = fairy.person(PersonProperties.male(), PersonProperties.minAge(21));
	System.out.println(adultMale.isMale());           
	System.out.println(adultMale.getDateOfBirth()); 
	
	Company company = fairy.company();
	System.out.println(company.getName());          
	System.out.println(company.getUrl());           

	Person salesman = fairy.person(PersonProperties.withCompany(company));
	System.out.println(salesman.getFullName());     
	System.out.println(salesman.getCompanyEmail()); 
	
	CreditCard cc = fairy.creditCard();
	System.out.println(cc.getExpiryDateAsString());
	System.out.println(cc.getVendor());
	
	NetworkProducer np = fairy.networkProducer();
	System.out.println(np.ipAddress());
	System.out.println(np.url(false));
	
    BaseProducer bp = fairy.baseProducer();
    System.out.println(bp.randomBetween(1000, 5000));
}
}
