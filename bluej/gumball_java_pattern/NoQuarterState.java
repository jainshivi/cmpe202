

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
//         if(c.getClass() == Quarter.class)
//         System.out.println("You inserted a quarter");
//         else if(c.getClass() == Nickel.class)
//         System.out.println("You inserted a nickel");
//         else if(c.getClass() == Dime.class)
//         System.out.println("You inserted a dime");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        gumballMachine.getState().insertQuarter();
    }
 
    public void insertNickel() {
          gumballMachine.setState(gumballMachine.getHasQuarterState());
        gumballMachine.getState().insertNickel();
    }
    
    public void insertDime() {
          gumballMachine.setState(gumballMachine.getHasQuarterState());
        gumballMachine.getState().insertDime();
    }
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void ejectDime() {
        System.out.println("You haven't inserted a dime");
    }
    
    public void ejectNickel() {
        System.out.println("You haven't inserted a nickel");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
