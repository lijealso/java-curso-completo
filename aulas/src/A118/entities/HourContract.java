package A118.entities;

import java.util.Date;

public class HourContract
{
    private Date date;
    private Double valuePerHOur;
    private Integer hours;

    public HourContract()
    {}

    public HourContract(Date date, Double valuePerHOur, Integer hours) {
        this.date = date;
        this.valuePerHOur = valuePerHOur;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHOur() {
        return valuePerHOur;
    }

    public void setValuePerHOur(Double valuePerHOur) {
        this.valuePerHOur = valuePerHOur;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue()
    {
        return valuePerHOur * hours;
    }


}
