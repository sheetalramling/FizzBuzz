public class MultipleThreeOrFive {



        private int number;

        public MultipleThreeOrFive(int number) {
            this.number=number;
        }

        public String check() {

           if(number>0)
                if (number%5==0)
                    return "Buzz";

                else if(number%3==0)
                    return "Fizz";

                return String.valueOf(number);


        }
    }


