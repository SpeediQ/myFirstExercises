package sda.wzorceProjektowe.strategy;

import java.math.BigDecimal;
import java.util.List;

public class TenPercentForSecound implements Bonus {
    private List<BigDecimal> order;

    public TenPercentForSecound(List<BigDecimal> order) {
        this.order = order;
    }


    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(new BigDecimal(0.9));
    }
}
