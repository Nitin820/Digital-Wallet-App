package dip;

class email implements message {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
