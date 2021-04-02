package sda.wzorceProjektowe.strategy;

import java.math.BigDecimal;

public interface Bonus {
    BigDecimal calculate(BigDecimal price);

}
