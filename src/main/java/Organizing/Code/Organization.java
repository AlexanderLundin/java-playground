package Organizing.Code;

public class Organization {

    class Product {
        Product(String name, int valueInCents) {
            this.name = name;
            this.valueInCents = valueInCents;
        }

        private String name;
        private int valueInCents;
        private Currency currency;

        public Currency getCurrency(){
            return this.currency;
        }

        public String getName() {
            return name;
        }

        public int getValueInCents() {
            return valueInCents;
        }

        //declare your class here
        class Currency{
            public String getUSD(){
                String dollars = "$" + (valueInCents / 100);
                return dollars;
            }
        }
    }
}
