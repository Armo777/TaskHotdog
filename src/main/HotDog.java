package main;

import java.io.Serializable;
import java.util.Objects;

public class HotDog implements Serializable {
    private int mayonnaiseCount;
    private int mustardCount;
    private int ketchupCount;
    private int onionCount;
    private int jalapenoCount;
    private int chileCount;
    private int cucumberCount;

    public int getMayonnaiseCount() {
        return mayonnaiseCount;
    }

    public int getMustardCount() {
        return mustardCount;
    }

    public int getKetchupCount() {
        return ketchupCount;
    }

    public int getOnionCount() {
        return onionCount;
    }

    public int getJalapenoCount() {
        return jalapenoCount;
    }

    public int getChileCount() {
        return chileCount;
    }

    public int getCucumberCount() {
        return cucumberCount;
    }

    public void setMayonnaiseCount(int mayonnaiseCount) {
        this.mayonnaiseCount = mayonnaiseCount;
    }

    public void setMustardCount(int mustardCount) {
        this.mustardCount = mustardCount;
    }

    public void setKetchupCount(int ketchupCount) {
        this.ketchupCount = ketchupCount;
    }

    public void setOnionCount(int onionCount) {
        this.onionCount = onionCount;
    }

    public void setJalapenoCount(int jalapenoCount) {
        this.jalapenoCount = jalapenoCount;
    }

    public void setChileCount(int chileCount) {
        this.chileCount = chileCount;
    }

    public void setCucumberCount(int cucumberCount) {
        this.cucumberCount = cucumberCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDog hotDog = (HotDog) o;
        return mayonnaiseCount == hotDog.mayonnaiseCount && mustardCount == hotDog.mustardCount && ketchupCount == hotDog.ketchupCount && onionCount == hotDog.onionCount && jalapenoCount == hotDog.jalapenoCount && chileCount == hotDog.chileCount && cucumberCount == hotDog.cucumberCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mayonnaiseCount, mustardCount, ketchupCount, onionCount, jalapenoCount, chileCount, cucumberCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HotDog{");
        sb.append("mayonnaiseCount=").append(mayonnaiseCount);
        sb.append(", mustardCount=").append(mustardCount);
        sb.append(", ketchupCount=").append(ketchupCount);
        sb.append(", onionCount=").append(onionCount);
        sb.append(", jalapenoCount=").append(jalapenoCount);
        sb.append(", chileCount=").append(chileCount);
        sb.append(", cucumberCount=").append(cucumberCount);
        sb.append('}');
        return sb.toString();
    }
}
