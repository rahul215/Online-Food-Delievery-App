package in.training.billingdetail.exception;

public class OrderDetailNotFoundException extends Exception{
	
	private static final long serialVersionUID=1L;

    /**
     * This will create the trainingNotfoundException object without error message
     */
    public OrderDetailNotFoundException() {
        super();
    }

    /**
     * This will create the trainingNotFoundException object with error message
     */
    public OrderDetailNotFoundException(String errMsg) {
        super();
    }

}
