class Bank {
    double getRateOfInterest() {
        return 0.0;      }
}
class SBI extends Bank {
    double rateOfInterest;
    
    SBI(double rate) {
        this.rateOfInterest = rate;
    }

    @Override
    double getRateOfInterest() {
        return rateOfInterest;
    }
}

class ICICI extends Bank {
    double rateOfInterest;
    
    ICICI(double rate) {
        this.rateOfInterest = rate;
    }

    @Override
    double getRateOfInterest() {
        return rateOfInterest;
    }
}

class AXIS extends Bank {
    double rateOfInterest;
    
    AXIS(double rate) {
        this.rateOfInterest = rate;
    }

    @Override
    double getRateOfInterest() {
        return rateOfInterest;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi1 = new SBI(8.3);
        System.out.println("SBI Rate of Interest: " + sbi1.getRateOfInterest() + "%");

        Bank icici = new ICICI(7.3);
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest() + "%");

        Bank axis1 = new AXIS(9.7);
        System.out.println("AXIS Rate of Interest: " + axis1.getRateOfInterest() + "%");

        Bank sbi2 = new SBI(8.6);
        System.out.println("SBI Rate of Interest: " + sbi2.getRateOfInterest() + "%");

        Bank axis2 = new AXIS(7.6);
        System.out.println("AXIS Rate of Interest: " + axis2.getRateOfInterest() + "%");
    }
}
