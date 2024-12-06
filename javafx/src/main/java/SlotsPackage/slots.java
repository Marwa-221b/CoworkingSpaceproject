package SlotsPackage;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;import java.util.Date;
import java.time.LocalDate;
public class slots {
    private int StartTime;
    private int EndTime;
    private LocalDate date;
    private String RoomType;
    private boolean IsAvailble=true;
    private int Fees;
    public slots(int startTime,int endTime,String date,String RoomType){
        this.date = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd MM uuuu"));
        this.StartTime=startTime;        this.EndTime=endTime;
        this.RoomType=RoomType;
    }
    public boolean isWithinSameMonth(){
        LocalDate today=LocalDate.now();
        return this.date.getMonth()==today.getMonth()&&this.date.getYear()==today.getYear();
    }
    public int FeesCalculations(){
        int Duration=this.EndTime-this.StartTime;
        int ret=0;
        if(RoomType.equals("General")){
            ret= Duration*20;//Note that 20 stands for the price of the room per hour
        }
        else if(RoomType.equals("Meeting")){
            ret= Duration*30;
        }
        else if(RoomType.equals("Teaching")) {
            ret= Duration * 25;
        }
        this.Fees=ret;
        return ret;
    }
}
