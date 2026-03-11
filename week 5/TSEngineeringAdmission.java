// User-defined exception for Engineering
class NotEligibleForEngineering extends RuntimeException {
    NotEligibleForEngineering(String s) {
        super(s);
    }
}

// User-defined exception for VJIT
class NotEligibleForVJIT extends RuntimeException {
    NotEligibleForVJIT(String s) {
        super(s);
    }
}

// Main class
class TSEngineeringAdmission {

    public static void main(String args[]) {

        try {
            int score = Integer.parseInt(args[0]);

            if (score < 50) {
                throw new NotEligibleForEngineering("Not Eligible for Engineering Admission");
            }

            if (score < 70) {
                throw new NotEligibleForVJIT("Eligible for Engineering but Not Eligible for VJIT");
            }

            System.out.println("Welcome to VJIT-Thanks For Your Registration!");
        }

        catch (NotEligibleForEngineering | NotEligibleForVJIT e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

        System.out.println("Rest of the Code");
    }
}