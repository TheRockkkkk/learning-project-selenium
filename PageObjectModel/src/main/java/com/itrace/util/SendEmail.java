package com.itrace.util;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	
	public static void main(String args[]) throws EmailException {
		
	
	Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("hitesh.rao.67@gmail.com", ""));
	email.setSSLOnConnect(true);
	email.setFrom("hiteshy@dewsolutions.in");
	email.setSubject("Selenium Test Report");
	email.setMsg("This is a test mail from Selenium");
	email.addTo("hitesh.rao.67@gmail.com");
	email.send();

}
}
