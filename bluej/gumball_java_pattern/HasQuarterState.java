

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
 
//     public void ejectQuarter(Coin c) {
//         System.out.println("Quarter returned");
//         total -= c.cost ;
//         if(total == 0)
//             gumballMachine.setState(gumballMachine.getNoQuarterState());
//     }
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
