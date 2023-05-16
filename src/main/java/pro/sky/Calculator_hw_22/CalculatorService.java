package pro.sky.Calculator_hw_22;

import org.springframework.stereotype.Service;
import pro.sky.Calculator_hw_22.exception.DivByZeroException;

@Service
public class CalculatorService {
    public Number plus(int a, int b) {
        return a + b;
    }

    public Number minus(int a, int b) {
        return a - b;
    }

    public Number multiply(int a, int b) {
        return a * b;
    }

    public Number divide(int a, int b) {
        if(b==0){
            throw new DivByZeroException(); 
        }
        return (double) a / b;
    }

}
