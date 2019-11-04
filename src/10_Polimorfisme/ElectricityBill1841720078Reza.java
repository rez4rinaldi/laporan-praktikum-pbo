package jti.polinema.polimorfisme._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class ElectricityBill1841720078Reza implements IPayable1841720078Reza
{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720078Reza(int mKwh, String mCategory) 
    {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getKwhReza() 
    {
        return mKwh;
    }

    public void setKwhReza(int mKwh) 
    {
        this.mKwh = mKwh;
    }

    public String getCategoryReza() 
    {
        return mCategory;
    }

    public void setCategoryReza(String mCategory) 
    {
        this.mCategory = mCategory;
    }
    
    @Override
    public int getPaymentAmountReza() 
    {
        return mKwh * getBasePriceReza();
    }
    
    public int getBasePriceReza()
    {
        int bPrice = 0;
        switch(mCategory)
        {
            case "R-1" : bPrice = 100;
            break;
            
            case "R-2" : bPrice = 200;
            break;
        }
        return bPrice;
    }
    
    public String getBillInfoReza()
    {
        return "kWH = "+ mKwh + "\n" +
                "Category = " + mCategory + "(" + getBasePriceReza() + " per kWH)\n";
    }
}
