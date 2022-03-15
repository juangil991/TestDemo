package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long rest(Long number1, Long number2){
        logger.info("subtracting {} - {}",number1,number2);
        return number1 - number2;
    }

    public Float div(Float number1 , Float number2){
        logger.info("dividing {} / {}",number1,number2);
        if(number2 !=0 ){return  number1/number2;}
        else {
            System.out.println("no se puede dividir por 0");
            return 0f;
        }
    }

    public Long mul(Long number1,Long number2){
        logger.info("multiplying {} * {} ",number1,number2);
        return number1*number2;
    }

}