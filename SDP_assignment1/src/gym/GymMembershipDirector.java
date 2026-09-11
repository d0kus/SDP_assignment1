package gym;

public class GymMembershipDirector {

    public GymMembership constructStandartMorningPass(GymMembershipBuilder builder, String clientName){
        return builder
                .setClientName(clientName)
                .setDurationMonth(1)
                .setAccessTier("STANDART")
                .setTimeSlot("Morning (07:00-12:00)")
                .setHasPoolAccess(false)
                .setGuestPasses(0)
                .setFreezeDays(0)
                .build();
    }
    public GymMembership constructStandartFulldayPass(GymMembershipBuilder builder, String clientName){
        return builder
                .setClientName(clientName)
                .setDurationMonth(3)
                .setAccessTier("STANDART")
                .setTimeSlot("Full-Day")
                .setHasPoolAccess(false)
                .setGuestPasses(0)
                .setFreezeDays(0)
                .build();
    }
    public GymMembership constructGoldFulldayPass(GymMembershipBuilder builder, String clientName){
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
    public GymMembership constructDiamondFulldayPass(GymMembershipBuilder builder, String clientName){
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
