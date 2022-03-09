import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultipleThreeOrFiveTest {




    @Test
    void ShouldPrintFizzIfMultipleOf3(){
            MultipleThreeOrFive multiples=new MultipleThreeOrFive(9);


            assertEquals("Fizz",multiples.check());

        }

    @Test

    void ShouldPrintBuzzIfMultipleOf5(){
        MultipleThreeOrFive multiples=new MultipleThreeOrFive(15);


        assertEquals("Buzz",multiples.check());
    }

    @Test
    void ShouldPrintNumber(){
        MultipleThreeOrFive multiples=new MultipleThreeOrFive(8);


        assertEquals("8",multiples.check());
    }




    }

