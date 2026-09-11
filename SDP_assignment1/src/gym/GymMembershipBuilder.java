package gym;

public class GymMembershipBuilder{

    private static final int MIN_DURATION_MONTH = 1;
    private static final int MAX_DURATION_MONTH = 12;


    private String clientName;
    private int durationMonth = 1;
    private String accessTier = "STANDART";
    private String timeSlot = "Full-Day";
    private boolean hasPoolAccess = false;
    private int guestPasses = 0;
    private int freezeDays = 0;

    public GymMembershipBuilder setClientName(String clientName){
        this.clientName = clientName;
        return this;
    }

    public GymMembershipBuilder setDurationMonth(int durationMonth){
        this.durationMonth=durationMonth;
        return this;
    }

    public GymMembershipBuilder setAccessTier(String accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    public GymMembershipBuilder setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
        return this;
    }

    public GymMembershipBuilder setHasPoolAccess(boolean hasPoolAccess) {
        this.hasPoolAccess = hasPoolAccess;
        return this;
    }

    public GymMembershipBuilder setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
        return this;
    }

    public GymMembershipBuilder setFreezeDays(int freezeDays) {
        this.freezeDays = freezeDays;
        return this;
    }

    public String getClientName(){ return clientName;}
    public int getDurationMonth() { return durationMonth; }
    public String getAccessTier() { return accessTier; }
    public String getTimeSlot() { return timeSlot; }
    public boolean getHasPoolAccess() { return hasPoolAccess; }
    public int getGuestPasses() { return guestPasses; }
    public int getFreezeDays() { return freezeDays; }

    private void validate(){
        if (clientName == null || clientName.trim().isEmpty()){
            throw new IllegalStateException("Client name must not be empty");
        }
        if (durationMonth < MIN_DURATION_MONTH || durationMonth > MAX_DURATION_MONTH){
            throw new IllegalStateException(
                    "Duration must be between "+ MIN_DURATION_MONTH +" and "+MAX_DURATION_MONTH+" months"
            );
        }
        if (guestPasses<0){
            throw new IllegalStateException("Guest passes cannot be negative");
        }
        if (freezeDays<0){
            throw new IllegalStateException("Freeze days cannot be negative");
        }
    }

    public GymMembership build(){
        validate();
        return new GymMembership(this);
    }

}
