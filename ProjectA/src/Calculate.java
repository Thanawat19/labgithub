public class Calculate{

public Calculate() {
		// TODO Auto-generated constructor stub
	}

public void cal (Employee em){
    double ommision=0;
    if (em.getProfit()<= 50000){
        ommision = em.getProfit()+(em.getProfit()*0.05);    }
    else if(em.getProfit() >= 50001) {
        ommision = em.getProfit()+(em.getProfit()*0.10);
    }
    System.out.printf("Name %s Profit = %f",em.getEmployeeName(),ommision);
}

}