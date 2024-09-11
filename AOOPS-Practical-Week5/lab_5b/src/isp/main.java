package isp;

public class main {
    public static void main(String[] args) {
        worker robot = new robot();
        worker human = new Human();
        eater humanEater = new Human();

        
        robot.work();  
        
        human.work();  
        humanEater.eat(); 
    }
}

