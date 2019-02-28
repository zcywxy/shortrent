package com.zhou.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;


import com.opensymphony.xwork2.ActionSupport;

@Entity
public class OgnlAction extends ActionSupport implements ServletRequestAware, SessionAware, ServletContextAware  {
    @Id
	@GeneratedValue
	private static final long serialVersionUID = 1L;
    
    private HttpServletRequest request;
    private Map<String, String> session;
    private ServletContext application;
   /* private List<Book> books;*/
            
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;    
    }

    @SuppressWarnings("unchecked")
    public void setSession(Map session) {
        this.session = session;        
    }

    public void setServletContext(ServletContext application) {
        this.application = application;
    }
    
  /*  public List<Book> getBooks() {
        return books;
    }*/

    @Override
    public String execute() {
        request.setAttribute("userName", "Max From request");
        session.put("userName", "Max From session");
        application.setAttribute("userName", "Max From application");
        
/*        books = new LinkedList<Book>();
        books.add(new Book("978-0735619678", "Code Complete, Second Edition", 32.99));
        books.add(new Book("978-0596007867", "The Art of Project Management", 35.96));
        books.add(new Book("978-0201633610", "Design Patterns: Elements of Reusable Object-Oriented Software", 43.19));
        books.add(new Book("978-0596527341", "Information Architecture for the World Wide Web: Designing Large-Scale Web Sites", 25.19));
        books.add(new Book("978-0735605350", "Software Estimation: Demystifying the Black Art", 25.19));*/
        
        return SUCCESS;
    }
}