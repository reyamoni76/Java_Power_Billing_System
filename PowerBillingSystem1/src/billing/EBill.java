package billing;

public class EBill {

    private int ConsumerNo;
    private String ConsumerName;
    private int PrevReading;
    private int CurrReading;
    private String EBConn;
    private double Bill;

    public void setData(int no, String name, int prev, int curr, String type) {
        ConsumerNo = no;
        ConsumerName = name;
        PrevReading = prev;
        CurrReading = curr;
        EBConn = type;
    }

    public void calculate_bill() {
        int units = CurrReading - PrevReading;

        if (EBConn.equalsIgnoreCase("domestic")) {
            if (units <= 100)
                Bill = units * 1;
            else if (units <= 200)
                Bill = (100 * 1) + ((units - 100) * 2.5);
            else if (units <= 500)
                Bill = (100 * 1) + (100 * 2.5) + ((units - 200) * 4);
            else
                Bill = (100 * 1) + (100 * 2.5) + (300 * 4) + ((units - 500) * 6);
        } else {
            if (units <= 100)
                Bill = units * 2;
            else if (units <= 200)
                Bill = (100 * 2) + ((units - 100) * 4.5);
            else if (units <= 500)
                Bill = (100 * 2) + (100 * 4.5) + ((units - 200) * 6);
            else
                Bill = (100 * 2) + (100 * 4.5) + (300 * 6) + ((units - 500) * 7);
        }
    }

    // GETTERS (important fix)
    public int getConsumerNo() { return ConsumerNo; }
    public String getConsumerName() { return ConsumerName; }
    public int getPrevReading() { return PrevReading; }
    public int getCurrReading() { return CurrReading; }
    public String getEBConn() { return EBConn; }
    public double getBill() { return Bill; }
}