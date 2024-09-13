package dip;

class MyApplication {
    private message messageService;

    
    public MyApplication(message messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        messageService.sendMessage(message);
    }
}
