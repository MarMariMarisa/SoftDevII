package unit08;

import java.util.ArrayList;
import java.util.List;

public class changeMaking {
    public static List<Currency> makeChange(double price, double payment){
        List<Currency> change = new ArrayList<>();
        int difference = (int)((payment - price)*100);
        Currency[] currencys = {Currency.DOLLAR,Currency.QUARTER,Currency.DIME,Currency.NICKEL,Currency.PENNY};
        //dollar first
        for(Currency currency : currencys){
            int value = (int)(currency.getValue() *100);
            while(difference>=  value){
                difference -= value;
                change.add(currency);
            }
        }
        return change;
    }

    public static void main(String[] args){
        List<Currency> list = makeChange(5.32,10);
        System.out.println(list);
    }
}
