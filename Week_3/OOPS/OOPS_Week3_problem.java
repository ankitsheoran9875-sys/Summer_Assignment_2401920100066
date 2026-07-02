package Week3;

public abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment{
    public String notice(){
        return "This is the first class compartment of train";
    }
}

class Ladies extends Compartment{
    public String notice(){
        return "This compartment is set for Ladies passenger";
    }
}

class General extends Compartment{
    public String notice(){
        return "Compartment for General Passenger";
    }
}

class Luggage extends Compartment{
    public String notice(){
        return "Luggage Compartment";
    }
}

class TestCompartment{
    public static void main(String[] args){
        int[] Compartment = new int[10];
        FirstClass f1;
        Ladies l1;
        General g1;
        Luggage lg1;

        for(int i=0; i<10; i++){
            Compartment[i] = (int)(Math.random() * 10) % 4 + 1;

            if(Compartment[i] == 1){
                f1 = new FirstClass();
                System.out.println(i+1 + ". " + f1.notice());
            }
            else if(Compartment[i] == 2) {
                l1 = new Ladies();
                System.out.println(i+1 + ". " + l1.notice());
            }
            else if(Compartment[i] == 3){
                g1 = new General();
                System.out.println(i+1 + ". " + g1.notice());
            }
            else{
                lg1 = new Luggage();
                System.out.println(i+1 + ". " + lg1.notice());
            }  
        }
    } 
}

