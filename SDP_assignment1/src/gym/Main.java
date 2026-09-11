package gym;


public class Main {
    public static void main(String[] args){
        GymMembershipDirector director = new GymMembershipDirector();

        GymMembership testStandardPass = director.constructStandardMorningPass(new GymMembershipBuilder(), "Batman");

        System.out.println("1. Standard pass:");
        System.out.println(testStandardPass);
        System.out.println();

        GymMembership testStandardPlusPass = director.constructStandardFullDayPass(new GymMembershipBuilder(), "Roronoa Zoro");

        System.out.println("2. Standard plus pass:");
        System.out.println(testStandardPlusPass);
        System.out.println();

        GymMembership testGoldPass = director.constructGoldFullDayPass(new GymMembershipBuilder(), "Jotaro Kujo");

        System.out.println("3. Gold pass:");
        System.out.println(testGoldPass);
        System.out.println();

        GymMembership testDiamondPass = director.constructDiamondFullDayPass(new GymMembershipBuilder(), "Monkey d Luffy");

        System.out.println("4. Diamond pass:");
        System.out.println(testDiamondPass);
        System.out.println();

        GymMembership customPass = new GymMembershipBuilder()
                .setClientName("Satoru Gojo")
                .setDurationMonth(9)
                .setAccessTier("PREMIUM")
                .setTimeSlot("Full-Day")
                .setHasPoolAccess(true)
                .setGuestPasses(15)
                .setFreezeDays(60)
                .build();

        System.out.println("5. Custom pass (through Builder):");
        System.out.println(customPass);
        System.out.println();

        System.out.println("6. Validation check:");
        try {
            GymMembership brokenPass = new GymMembershipBuilder()
                    .setClientName("    ")
                    .setDurationMonth(100)
                    .build();
            System.out.println(brokenPass);
        } catch (IllegalStateException e){
            System.out.println("Validation successful, error: "+ e.getMessage());
        }
    }
}
