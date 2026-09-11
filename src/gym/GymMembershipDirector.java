package gym;

public class GymMembershipDirector {

    public GymMembership constructStandardMorningPass(GymMembershipBuilder builder, String clientName){
        return builder
                .setClientName(clientName)
                .setDurationMonth(1)
                .setAccessTier("STANDARD")
                .setTimeSlot("Morning (07:00-12:00)")
                .setHasPoolAccess(false)
                .setGuestPasses(0)
                .setFreezeDays(0)
                .build();
    }
    public GymMembership constructStandardFullDayPass(GymMembershipBuilder builder, String clientName){
        return builder
                .setClientName(clientName)
                .setDurationMonth(3)
                .setAccessTier("STANDARD")
                .setTimeSlot("Full-Day")
                .setHasPoolAccess(false)
                .setGuestPasses(0)
                .setFreezeDays(0)
                .build();
    }
    public GymMembership constructGoldFullDayPass(GymMembershipBuilder builder, String clientName){
        return builder
                .setClientName(clientName)
                .setDurationMonth(6)
                .setAccessTier("GOLD")
                .setTimeSlot("Full-Day")
                .setHasPoolAccess(false)
                .setGuestPasses(10)
                .setFreezeDays(30)
                .build();
    }
    public GymMembership constructDiamondFullDayPass(GymMembershipBuilder builder, String clientName){
        return builder
                .setClientName(clientName)
                .setDurationMonth(12)
                .setAccessTier("DIAMOND")
                .setTimeSlot("Full-Day")
                .setHasPoolAccess(true)
                .setGuestPasses(30)
                .setFreezeDays(90)
                .build();
    }




}
