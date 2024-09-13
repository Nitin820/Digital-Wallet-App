package dip;

public class main {
    public static void main(String[] args) {
        
        message emailService = new email();
        message smsService = new sms();

       
        MyApplication appWithEmail = new MyApplication(emailService);
        MyApplication appWithSMS = new MyApplication(smsService);

        
        appWithEmail.send("Hello via Email!"); // Sending email with message: Hello via Email!
        appWithSMS.send("Hello via SMS!");     // Sending SMS with message: Hello via SMS!
    }
}
