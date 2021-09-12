public class Calculate{

public Calculate() {
		// TODO Auto-generated constructor stub
	}

public void cal (Employee em){
    double totalsalary=0;
    
    if (em.getmonthlysales()<= 50000){
        totalsalary = em.getSalary()+(em.getmonthlysales()*0.05);  
	  }
	    
    else if(em.getmonthlysales() >= 50001) {
        totalsalary = em.getSalary()+(em.getmonthlysales()*0.10);
        if(em.getSalary() < 15000 && em.getmonthlysales()>100000) {
        	totalsalary = totalsalary+5000;
        }
    }
    System.out.printf("%s get paid = %.2f Baht",em.getEmployeeName(),totalsalary);
}

}