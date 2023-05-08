public class Me implements Tourist {

    static int budget = 400;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
    
        if (budget < boracay.airFare){
            System.out.println("You cannot enter Boracay! Your budget isn't enough.");
        } else {
            budget-=boracay.airFare;
            System.out.println("Welcome to Boracay!");
            System.out.println("My skin hurts from all the activities I did in the sun!");
            checkBudget();
        }
        
    }
    public void visit(Batanes batanes) {
       
        if (budget < batanes.airFare){
            System.out.println("You cannot enter Batanes! Your budget isn't enough.");
        } else {
            budget-=batanes.airFare;
            System.out.println("Welcome to Batanes!");
            System.out.println("I want to live here! It feels so peaceful here.");
            checkBudget();
        }
    }
    public void visit(Cebu cebu) {
        
        if (budget < cebu.airFare){
            System.out.println("You cannot enter Cebu! Your budget isn't enough.");
        } else {
            budget-=cebu.airFare;
            System.out.println("Welcome to Cebu!");
            System.out.println("I can't believe there's a lot of things to do in Cebu!");
            checkBudget();
        }
    }
    public void visit(Palawan palawan) {
        
        if (budget < palawan.airFare){
            System.out.println("You cannot enter Palawan! Your budget isn't enough.");
        } else {
            budget-=palawan.airFare;
            System.out.println("Welcome to Palawan!");
            System.out.println("I wish I could stay here forever.");
            checkBudget();
        }
        
    }
    public void visit(Siargao siargao) {
        
        if (budget < siargao.airFare){
            System.out.println("You cannot enter Siargao! Your budget isn't enough.");
        } else {
            budget-=siargao.airFare;
            System.out.println("Welcome to Siargao!");
            System.out.println("I love surfing here!");
            checkBudget();
        }
    }
    public void visit(Siquijor siquijor) {
        
        if (budget < siquijor.airFare){
            System.out.println("You cannot enter Siquijor! Your budget isn't enough.");
        } else {
            budget-=siquijor.airFare;
            System.out.println("Welcome to Siquijor!");
            System.out.println("Good thing I didn't get cursed here!");
            checkBudget();
        }
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}