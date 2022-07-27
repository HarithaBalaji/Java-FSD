package program;
	class Sender 
	{ 
	  public void sendMessage(String message)
	  { 
	    System.out.println("\nSending "  + message);
	    try
	    { 
	      Thread.sleep(1000); 
	    } 
	    catch (Exception e) 
	    { 
	      System.out.println("Thread interrupted."); 
	    } 
	    System.out.println("\n" +message+ "Sent");
	  }
	} 

	class SendUsingThreads extends Thread 
	{ 
	  private String message; 
	  Sender sender; 
	  
	  SendUsingThreads(String msg, Sender object)
	  { 
	    message = msg;
	    sender = object; 
	  } 
	  public void run() 
	  { 
	    
	    synchronized(sender) 
	    { 
	       
	      sender.sendMessage(message);
	    } 
	  } 
	} 
	public class Sender2 {

		public static void main(String[] args) {
			Sender sender = new Sender(); 
		    SendUsingThreads sender1 = new SendUsingThreads( "welcome to new world " , sender);
		SendUsingThreads sender2 =  new SendUsingThreads( "Java Practice Program ", sender);
		     
		    sender1.start(); 
		    sender2.start(); 
		     
		    try
		    { 
		      sender1.join(); 
		      sender2.join(); 
		    } 
		    catch(Exception e) 
		    { 
		      System.out.println("Interrupted"); 
		    } 

		}

	}

