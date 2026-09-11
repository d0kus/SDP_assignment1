package gym;

public class GymMembership {
    private final String clientName;
    private final int durationMonth;
    private final String accessTier;
    private final String timeSlot;
    private final boolean hasPoolAccess;
    private final int guestPasses;
    private final int freezeDays;

    GymMembership(GymMembershipBuilder builder){
        this.clientName = builder.getClientName();
        this.durationMonth = builder.getDurationMonth();
        this.accessTier = builder.getAccessTier();
        this.timeSlot = builder.getTimeSlot();
        this.hasPoolAccess = builder.getHasPoolAccess();
        this.guestPasses = builder.getGuestPasses();
        this.freezeDays = builder.getFreezeDays();
    }

    public String getClientName() { return clientName; }
    public int getDurationMonth() { return durationMonth; }
    public String getAccessTier() { return accessTier; }
    public String getTimeSlot() { return timeSlot; }
    public Boolean getHasPoolAccess(){ return hasPoolAccess; }
    public int getGuestPasses() { return guestPasses; }
    public int getFreezeDays() { return freezeDays; }

    @Override
    public String toString(){
        return "GymMembership {" +
                "clientName='" + clientName + '\'' +
                ", durationMonth=" + durationMonth +
                ", accessTier='" + accessTier + '\'' +
                ", timeSlot='" + timeSlot + '\'' +
                ", hasPoolAccess=" + hasPoolAccess +
                ", guestPasses=" + guestPasses +
                ", freezeDays=" + freezeDays +
                '}';
    }
}
