////////////////////////////////////////////////////////////////////////////////
//Shaolun Zhang
//hw 02
//Arithmetic Java Programe
//Calculate the cost of purchases (including tax)
//
public class Arithmetic {
    //main method
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        double totalSockCost$,totalGlassCost$,totalEnvelopeCost$,totalCost$;
        double socktax$,glasstax$,envelopetax$,totaltax$,totalCostwithtax$;
        System.out.println("I bought "+nSocks+" pairs of socks for "+
               sockCost$+" dollars each pairs.");
        System.out.println("I bought "+nGlasses+" drinking glasses for "+
               glassCost$+" dollars each.");
        System.out.println("I bought "+nEnvelopes+" box of envelope for "+
               envelopeCost$+" dollars.");
        totalSockCost$=nSocks*sockCost$;
        socktax$=((int)(totalSockCost$*taxPercent*100)/100.0);
        totalGlassCost$=nGlasses*glassCost$;
        glasstax$=((int)(totalGlassCost$*taxPercent*100)/100.0);
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        envelopetax$=((int)(totalEnvelopeCost$*taxPercent*100)/100.0);
        totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totaltax$=socktax$+glasstax$+envelopetax$;
        totalCostwithtax$=totalCost$+totaltax$;
        System.out.println("The cost of socks is "+totalSockCost$+" dollars.");
        System.out.println("The tax for socks is "+socktax$+" dollars.");
        System.out.println("The cost of drinking glasses is "+totalGlassCost$+
               " dollars.");
        System.out.println("The tax for drinking glasses is "+glasstax$+
               " dollars.");
        System.out.println("The cost of envelopes is "+totalEnvelopeCost$+
               " dollars.");
        System.out.println("The tax for envelopes is "+envelopetax$+
               " dollars.");
        System.out.println("The total cost before tax is "+totalCost$+
               " dollars.");
        System.out.println("The total sales tax is "+totaltax$+" dollars.");
        System.out.println("The total cost including tax is "+totalCostwithtax$+
               " dollars.");
    }
}
    