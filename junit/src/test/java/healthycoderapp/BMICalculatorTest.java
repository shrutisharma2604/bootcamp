package healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void should_ReturnFalse_When_DietRecommended(){
        //given
        double weight=89.0;
        double height=1.72;

        //when
        boolean recommended=BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(recommended);
    }
    /*void should_ThrowsArithmeticException_When_HeightZero(){
        //given
        double weight =50.0;
        double height=0.0;
        //when
        Executable executable=()->BMICalculator.isDietRecommended(weight,height);
        //then
        assertThrows(ArithmeticException.class,executable);
    }
    void should_ReturnCodersWithWorstBMI_when_CoderListNoEmpty(){
        //given
        List<Coder> coders=new ArrayList<>();
        coders.add(new Coder(1.89,60.0));
        coders.add(new Coder(1.82,90.0));
        coders.add(new Coder(1.82,64.7));

        //when
        Coder coderWorstBMI=BMICalculator.findCoderWithWorstBMI(coders);


    }
*/


}