public class Calculate{

public Calculate() {
		// TODO Auto-generated constructor stub
	}

public void cal (Employee em){
    double commision=0;
    if (em.getmonthlysales()<= 50000){
        commision = em.getSalary()+(em.getmonthlysales()*0.05);    }
	    if(commision < 12000) {
	    	commision = 12000;
	    }
    else if(em.getmonthlysales() >= 50001) {
        commision = em.getSalary()+(em.getmonthlysales()*0.10);
    }
    System.out.printf("%s get paid = %.2f Baht",em.getEmployeeName(),commision);
}

}