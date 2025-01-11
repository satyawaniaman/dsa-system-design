package OOPs;

public class User {
        protected String username;
        protected String email;
        User(String username,String email){
            this.username=username;
            this.email=email;
        }
        public void login(){
            System.out.print(username+" User logged in.");
        }
        public void showDashboard() {
            System.out.println(username + "'s dashboard");
        }
    }
