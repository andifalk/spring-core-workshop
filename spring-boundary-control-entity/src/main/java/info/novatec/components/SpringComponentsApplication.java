package info.novatec.components;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringComponentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringComponentsApplication.class, args);
        
        
        ExpressionParser parser = new SpelExpressionParser();        
        Expression expression = parser.parseExpression("T(java.lang.Math).random() * 100.0");
        double value = (Double) expression.getValue();
        
        System.out.println(value);
    }
}
