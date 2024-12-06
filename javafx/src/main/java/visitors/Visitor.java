/*package visitors;

public class Visitor {
    private String Id;
    public String visitorType;
    public int totalHours;

    public Visitor(String visitorType,String Id) {
        this.visitorType = visitorType.toLowerCase();
        this.Id=Id;
        this.totalHours=0;
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public void displayAvailableSlots(String visitorType){
        System.out.println("Available Slots for "+visitorType);
        if(visitorType.equals("general"))
        {
            for(int i=0;i<3;i++){
                for(int j=0;j<12;j++){
                    if(generalRooms[i].slots[j].isAvailble==true)
                    {
                        System.out.println(generalRooms[i].slots[j]);
                    }
                }

            }
        }
        else if(visitorType.equals("formal"))
        {
            for(int i=0;i<3;i++){
                for(int j=0;j<12;j++){
                    if(meetingRooms[i].slots[j].isAvailble==true)
                    {
                        System.out.println(meetingRooms[i].slots[j]);
                    }
                }

            }
        }
        else if(visitorType.equals("instructor"))
        {
            for(int i=0;i<3;i++){
                for(int j=0;j<12;j++){
                    if(teachingRooms[i].slots[j].isAvailble==true)
                    {
                        System.out.println(teachingRooms[i].slots[j]);
                    }
                }

            }
        }
    }

    public void makeReservation(String visitorType,int roomNum,int slot){
        if(visitorType.equals("general"))
            generalRooms[roomNum].slots[slot].isAvailable=false;
        else if(visitorType.equals("formal"))
            meetingRooms[roomNum].slots[slot].isAvailable=false;
        else if(visitorType.equals("instructor"))
            teachingRooms[roomNum].slots[slot].isAvailable=false;
        this.totalHours++;
    }

    public double cancelReservation(String visitorType,int roomNum,int slot){
        if(visitorType.equals("general"))
            generalRooms[roomNum].slots[slot].isAvailable=true;
        else if(visitorType.equals("formal"))
            meetingRooms[roomNum].slots[slot].isAvailable=true;
        else if(visitorType.equals("instructor"))
            teachingRooms[roomNum].slots[slot].isAvailable=true;
        if(visitorType.equals("general"))
            return 0.05*20;
        else if(visitorType.equals("formal"))
            return 0.05*30;
        else
            return 0.05*25;
    }

    public void updateReservation(String visitorType,int oldSlot,int newSlot,int oldRoomNum,int newRoomNum){
        if(getVisitorType().equals("general"))
        {
            generalRooms[oldRoomNum].slots[oldSlot].isAvailable=true;
            generalRooms[newRoomNum].slots[newSlot].isAvailable=false;
        }
        else if(visitorType.equals("formal"))
        {
            meetingRooms[oldRoomNum].slots[oldSlot].isAvailable=true;
            meetingRooms[newRoomNum].slots[newSlot].isAvailable=false;
        }
        else if(visitorType.equals("instructor"))
        {
            teachingRooms[oldRoomNum].slots[oldSlot].isAvailable=true;
            teachingRooms[newRoomNum].slots[newSlot].isAvailable=false;
        }

    }

    public int reward(){
        if(!getVisitorType().equalsIgnoreCase("instructor") && this.totalHours>=6)
            return 1;
        else
            return 0;
    }

}*/

