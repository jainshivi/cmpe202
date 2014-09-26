

import java.util.Random;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    int total;
    //int extra;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.total = 0;
        //this.extra = 0;
    }
  
    public void insertQuarter() {
        if(total < 50)
        {
            total = total + 25;
        }
         else
             System.out.println("You can't insert another coin.Please turn crank!!");
    }
    
    public void insertDime() {
        if(total < 50)
        {
            total = total + 10;
        }
         else
             System.out.println("You can't insert another coin.Please turn crank!!");
    }
    
    public void insertNickel() {
        if(total < 50)
        {
            total = total + 5;
        }
         else
             System.out.println("You can't insert another coin.Please turn crank!!");
    }
//     public void insertQuarter(Coin c) {
//         if(total < 50)
//         {
//             total = total + c.cost;
//             System.out.println("total = "+total +c.cost);
//         }
//         else
//             System.out.println("You can't insert another coin.Please turn crank!!");
//            
//     }
 
    public void ejectQuarter() {
        //System.out.println("Quarter returned");
        total -= 25 ;
        if(total < 0)
            System.out.println("You cannot eject quarter before inserting one");
            
        else if(total == 0)
        {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            System.out.println("Quarter returned");
        }
        else if(total > 0)
            System.out.println("Quarter returned");
    }
     public void ejectDime() {
        //System.out.println("Dime returned");
        total -= 10 ;
         if(total < 0)
            System.out.println("You cannot eject dime before inserting one");
         else if(total == 0)
         {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            System.out.println("Dime returned");
         }
         else if(total > 0)
            System.out.println("Dime returned");
        
    }
     public void ejectNickel() {
        //System.out.println("Nickel returned");
        total -= 5 ;
        if(total < 0)
            System.out.println("You cannot eject nickel before inserting one");
        else if(total == 0)
        {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            System.out.println("Nickel returned");
        }
        else if(total > 0)
            System.out.println("Nickel returned");
    }
//  
    public void turnCrank() {
        int extra = 0;
        if(total >= 50)
        {
            extra = total - 50;
            System.out.println("You turned... and the remaining change is : " +extra);
            total = 0;
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        else
        {
            extra = 50 - total;
            System.out.println("You need to enter more cents . Atleast " + extra);
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
