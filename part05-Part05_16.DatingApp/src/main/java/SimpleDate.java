
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    //advance month
    public void advanceMonth(int howManyMonths){
        this.month+=howManyMonths;
    }
    
    //advance year
    public void advanceYear(int howManyYears){
        this.year+=howManyYears;
    }
    
    //advance day by number of days
    public void advance(int howManyDays){
        if (this.day+howManyDays<=30){
            this.day+=howManyDays;
        }else {
            this.day=this.day+howManyDays-30;
            if (this.month<12){
                this.advanceMonth(1);
            }else{
                this.advanceYear(1);
                this.month=0;
                this.advanceMonth(1);
            }
        }
    }
    

    //advance day by one day
    public void advance() {
        this.advance(1);
    }
    
    public SimpleDate afterNumberOfDays(int days){        
        SimpleDate newDate=new SimpleDate (this.day,this.month,this.year);
        
        newDate.advance(days);
        
        return newDate;
    }

}
