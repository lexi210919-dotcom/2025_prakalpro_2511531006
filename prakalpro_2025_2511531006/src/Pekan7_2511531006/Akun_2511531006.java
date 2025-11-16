package Pekan7_2511531006;

public class Akun_2511531006 {
        private String username;
	    private String email;
	    private String password;
	    private int pinAngka;

       public void Akun(String username, String email, String password, int pinAngka) {
	        this.username = username;
	        this.email = email;
	        this.password = password;
	        this.pinAngka = pinAngka;
	    }

	    public static void main(String[] args) {
	        
	    
	    }
        public String getEmail() {
	      return this.email;
	    }

	   
	   public String getUsername() {
	     return this.username;
	    }
	    
	    
	   public int getPinAngka() {
	     return this.pinAngka;
	    }

	    
	  
	   public boolean isPasswordValid() {
	      return this.password != null && this.password.length() >= 8;
	    }
	    
	 
		
	   public boolean isEmailValid() {
		return this.email != null && this.email.contains("@");
		}

		public void getUsername1() {
		
		


	}

}

