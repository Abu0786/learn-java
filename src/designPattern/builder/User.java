package designPattern.builder;

public class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder userBuilder){
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;

    }
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.userName + " : " + this.userId + " : " + this.emailId;
    }

    // inner class to create object

    static class UserBuilder{
        private  String userId;
        private  String userName;
        private  String emailId;

        public UserBuilder(){

        }

        public String getUserId() {
            return userId;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public String getUserName() {
            return userName;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public String getEmailId() {
            return emailId;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }
        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
