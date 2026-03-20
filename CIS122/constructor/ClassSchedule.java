public class ClassSchedule {
    private String title;
    private String days;
    private String startTime;
    private String endTime;
    private String room;

    
    public ClassSchedule(String classTitle, String meetingDays, String aStartTime, String anEndTime, String classRoom){        
        this.title = classTitle;
        this.days = meetingDays;
        this.startTime = aStartTime;
        this.endTime = anEndTime;
        this.room = classRoom;
    }

    public String getRoom() {
        return room;
    }
    public String getTitle(){
        return title;
    }
    public String getTime(){
        return days +" "+ startTime + "-" + endTime;
    }

}

