package Organizing.Code;

import java.text.DecimalFormat;

class Product {

    Product(String name, int valueInCents) {
        this.name = name;
        this.valueInCents = valueInCents;
        this.currency = new Currency(this.valueInCents);
    }

    private String name;
    private int valueInCents;

    public String getName() {
        return name;
    }

    public int getValueInCents() {
        return valueInCents;
    }

    //declare your class here
    private Currency currency;

    public Currency getCurrency() {
        return this.currency;
    }

    static class Currency {
        private int valueInCents;
        public Currency(int valueInCents){
            this.valueInCents = valueInCents;
        }
        public Currency(Product product){
            this.valueInCents = product.valueInCents;
        }
        public String getUSD() {

            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            String numberAsString = decimalFormat.format(this.valueInCents / 100.0);
            System.out.println(numberAsString);
            String dollars = "$" + numberAsString;

            //String dollars = "$" + String.format("%.2f",(this.valueInCents / 100.0));
            System.out.println(dollars);
            return dollars;
        }
    }

}
