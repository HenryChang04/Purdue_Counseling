import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PurdueCounselor {
    static ArrayList<String> courses = new ArrayList<String>(); // Required courses FORMAT : (NAME)
    static ArrayList<String> allCoursesList = new ArrayList<String>(); // List of every Purdue course FORMAT : (NAME CREDITS)
    static ArrayList<String> classesTaken = new ArrayList<>(); // Classes already taken.
    static ArrayList<Courses> classesWithCredits = new ArrayList<>(); // Classes you need to take with credits

    static ArrayList<Courses> classesWithEarnedCredits = new ArrayList<>(); // Classes you have taken with credits
    static double creditsNeeded;
    static double creditsEarned;

    public static void main(String[] args) {
        allClasses();
        initialPrompt();
    }

    public static void initialPrompt() {
        System.out.println("How Can I Help You? (Enter: 1 / 2 / 3)");
        System.out.println("(1) Undergraduate Class Scheduling"); // only Bachelors Degree
        System.out.println("(2) Tutoring / Extra Class Help");
        System.out.println("(3) Emotional Support Resources");

        Scanner scanner = new Scanner(System.in);
        int helpDecision = scanner.nextInt(); // Takes input of initial question
        scanner.nextLine();
        switch (helpDecision) {
            case 1 -> {
                System.out.println("You have chosen 'Class Scheduling'");
                classScheduling();
            }
            case 2 -> {
                System.out.println("You have chosen 'Tutoring / Extra Class Help'");
                extraHelp();
            }
            case 3 -> {
                System.out.println("You have chosen 'Emotional Support Resources'");
                healthSupport();
            }
            default -> {
                System.out.println("Invalid input, please enter input in format: 1 / 2 / 3");
                initialPrompt();
            }
        }
    }

    public static void classScheduling() {
        System.out.println("What college are you in");
        System.out.println("(1) College of Agriculture (2) College of Education (3) College of Engineering");
        System.out.println("(4) Exploratory Studies (5) College of Health and Human Sciences (6) College of Liberal Arts");
        System.out.println("(7) Krannert School of Management (8) College of Pharmacy (9) Purdue Polytechnic Institute");
        System.out.println("(10) College of Science (11) College of Veterinary Medicine");
        Scanner scanner = new Scanner(System.in);
        int chosenCollege = scanner.nextInt();
        scanner.nextLine();
        switch (chosenCollege) {
            case 1 -> {
                System.out.println("You have chosen 'College of Agriculture'");
                collegeAgriculture();
            }
            case 2 -> {
                System.out.println("You have chosen 'College of Education'");
                collegeUnfinished();
            }
            case 3 -> {
                System.out.println("You have chosen 'College of Engineering'");
                collegeUnfinished();
            }
            case 4 -> {
                System.out.println("You have chosen 'Exploratory Studies'");
                collegeUnfinished();
            }
            case 5 -> {
                System.out.println("You have chosen 'College of Health and Human Sciences'");
                collegeUnfinished();
            }
            case 6 -> {
                System.out.println("You have chosen 'College of Liberal Arts'");
                collegeUnfinished();
            }
            case 7 -> {
                System.out.println("You have chosen 'Krannert School of Management'");
                collegeUnfinished();
            }
            case 8 -> {
                System.out.println("You have chosen 'College of Pharmacy'");
                collegeUnfinished();
            }
            case 9 -> {
                System.out.println("You have chosen 'Purdue Polytechnic Institute'");
                collegeUnfinished();
            }
            case 10 -> {
                System.out.println("You have chosen 'College of Science'");
                collegeUnfinished();
            }
            case 11 -> {
                System.out.println("You have chosen 'College of Veterinary Medicine'");
                collegeUnfinished();
            }
            default -> {
                System.out.println("Invalid input, please enter input in format: 1-11");
                classScheduling();
            }
        }
    }
    public static void collegeUnfinished(){
        System.out.println("Not yet implemented! Check back another time.");
    }

    public static void collegeAgriculture(){
        System.out.println("What is your agriculture major? (1) Agribusiness (2) Agricultural Communication (3) Agricultural Economics");
        System.out.println("(4) Agricultural Education (5) Agricultural Engineering (6) Agricultural Systems Management");
        System.out.println("(7) Agronomy (8) Animal Sciences (9) Applied Meteorology and Climatology");
        System.out.println("(10) Aquatic Sciences (11) Biochemistry (12) Biological Engineering");
        System.out.println("(13) Crop Science (14) Environmental Science (15) Farm Management");
        System.out.println("(16) Fermentation Science (17) Food Science (18) Forestry");
        System.out.println("(19) Horticulture (20) Insect Biology (21) Landscape Architecture");
        System.out.println("(22) Natural Resources (23) Plant Genetics (24) Plant Science");
        System.out.println("(25) Plant Studies (26) Pre-veterinary Medicine (27) Sales and Marketing");
        System.out.println("(28) Soil and Water Sciences (29) Sustainable Food and Farming Systems (30) Turf Management and Science");
        System.out.println("(31) Wildlife");
        Scanner scanner= new Scanner(System.in);
        int chosenAgrMajor= scanner.nextInt();
        scanner.nextLine();
        switch (chosenAgrMajor) {
            case 1 -> {
                System.out.println("You have chosen 'Agribusiness'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGEC 20201", "AGEC 20300", "AGEC 21700 ", "AGEC 22000", "AGEC 29800", "AGEC 32700", "AGEC 33000", "AGEC 35200", "AGEC 45100", "AGEC 42400"); // Major in Agribusiness
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 2 -> {
                System.out.println("You have chosen 'Agricultural Communication'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "ASEC 15200", "ASEC 28000", "ASEC 38000", "ASEC 48000", "COM 20400", "COM 25200", "COM 31100", "COM 31800");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 3 -> {
                System.out.println("You have chosen 'Agricultural Economics'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGEC 20201", "AGEC 20300", "AGEC 21700", "AGEC 22000", "AGEC 29800");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 4 -> {
                System.out.println("You have chosen 'Agricultural Education'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "ASEC 24000", "ASEC 31800", "ASEC 31900", "ASEC 34000", "ASEC 34100", "ASEC 44000");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 5 -> {
                System.out.println("You have chosen 'Agricultural Engineering'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "ABE 20500", "ABE 21000", "ABE 29000", "ABE 30500", "ABE 31400", "ABE 32000", "ABE 32500", "ABE 33000", "ABE 43500", "ABE 45000", "ABE 48400", "ABE 48600", "ABE 49000");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 6 -> {
                System.out.println("You have chosen 'Agricultural Systems Management'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "ASM 10400", "ASM 10500", "ASM 21100", "ASM 22100", "ASM 22000", "ASM 33300", "ASM 35000", "ASM 42100", "ASM 49400", "ASM 49500", "ASM 34500", "ASM 42000", "ASM 23600", "ASM 24500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 7 -> {
                System.out.println("You have chosen 'Agronomy'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGRY 25500", "AGRY 32000", "AGRY 36500", "AGRY 39800", "AGRY 49800");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 8 -> {
                System.out.println("You have chosen 'Animal Sciences'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "ANSC 10200", "ANSC 12100", "ANSC 18100", "ANSC 22100", "ANSC 23000", "ANSC 24000", "ANSC 25500", "ANSC 31100", "ANSC 33300", "ANSC 48100", "ANSC 44000");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 9 -> {
                System.out.println("You have chosen 'Applied Meteorology and Climatology'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGRY 28500", "AGRY 33500", "AGRY 33700", "AGRY 39800", "AGRY 43100", "AGRY 43200", "AGRY 43300", "AGRY 44100", "AGRY 44200", "AGRY 44300", "AGRY 49800", "AGRY 53500", "AGRY 53600", "AGRY 54500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 10 -> {
                System.out.println("You have chosen 'Aquatic Sciences'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "FNR 12500", "FNR 20100", "FNR 21000", "FNR 22310", "FNR 23000", "FNR 24150", "FNR 24250", "FNR 25150", "FNR 25250", "FNR 27000", "FNR 30500", "FNR 35100", "FNR 37010", "FNR 37100", "FNR 37500", "FNR 38400", "FNR 38500", "FNR 40100", "FNR 45600", "FNR 52700");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 11 -> {
                System.out.println("You have chosen 'Biochemistry'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "BCHM 10000", "BCHM 22100", "BCHM 29000", "BCHM 32200", "BCHM 36100", "BCHM 39000", "BCHM 46200", "BCHM 46500", "BCHM 49000", "BCHM 49800", "BCHM 42100", "BCHM 42200");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 12 -> {
                System.out.println("You have chosen 'Biological Engineering'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "ABE 20100", "ABE 20200", "ABE 29000", "ABE 30100", "ABE 30300", "ABE 30400", "ABE 30700", "ABE 30800", "ABE 37000", "ABE 45700", "ABE 46000", "ABE 49000", "ABE 55700", "ABE 55800", "ABE 31400", "BIOL 11000", "ABE 22700", "ABE 22700");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 13 -> {
                System.out.println("You have chosen 'Crop Science'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGRY 10500", "AGRY 25500", "AGRY 32000", "AGR 32100", "AGRY 33500", "AGRY 36500", "AGRY 39800", "AGRY 49800", "AGRY 51500", "AGRY 52500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 14 -> {
                System.out.println("You have chosen 'Environmental Sciences'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "NRES 12500", "NRES 20000", "FNR 21000", "NRES 25500", "NRES 42000", "NRES 49700");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 15 -> {
                System.out.println("You have chosen 'Farm Management'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGEC 20201", "AGEC 20300", "AGEC 21700", "AGEC 22000", "AGEC 29800", "AGEC 31000", "AGEC 32100", "AGEC 35200", "AGEC 41100", "AGEC 42400");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 16 -> {
                System.out.println("You have chosen 'Fermentation Science'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "FS 16100", "FS 16300", "FS 29800", "FS 34100", "FS 36100", "FS 36200", "FS 36300", "FS 37200", "FS 37300", "FS 40100", "FS 40200", "FS 44400", "FS 48200", "FS 48300", "FS 38100", "ABE 30400");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 17 -> {
                System.out.println("You have chosen 'Food Science'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "FS 16100", "FS 24500", "FS 29800", "FS 34000", "FS 36100", "FS 36200", "FS 36300", "FS 43500", "FS 44200", "FS 44700", "FS 44300", "FS 44400", "FS 26700", "FS 46900", "FS 48200", "FS 53000", "NUTR 31500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 18 -> {
                System.out.println("You have chosen 'Forestry'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "FNR 12500", "FNR 21000", "FNR 22500", "FNR 33100", "FNR 35300", "FNR 35700", "FNR 37010", "FNR 37050", "FNR 37200", "FNR 37500", "FNR 40700", "FNR 43400", "FNR 43900");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 19 -> {
                System.out.println("You have chosen 'Horticulture'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "HORT 10100", "HORT 20100", "HORT 30100", "HORT 31800", "HORT 31900", "HORT 42700");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 20 -> {
                System.out.println("You have chosen 'Insect Biology'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "BTNY 35000", "CHM 11100", "CHM 11200", "ENTM 10100", "ENTM 10200", "ENTM 20100", "ENTM 20600", "ENTM 20700", "ENTM 21000", "ENTM 25300", "ENTM 30100", "ENTM 31100", "ENTM 31200", "ENTM 33500", "ENTM 39300", "ENTM 40100", "ENTM 41001", "ENTM 41000", "ENTM 49310", "ENTM 49390", "ENTM 49390", "PHYS 21400");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 21 -> {
                System.out.println("You have chosen 'Landscape Architecture'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "LA 10110", "LA 11600", "LA 11700", "LA 16100", "LA 16600", "LA 21600", "LA 22600", "LA 22700", "LA 24600", "LA 30900", "LA 31600", "LA 32500", "LA 32600", "LA 34600", "LA 35600", "LA 39000", "LA 41600", "LA 42600", "LA 47600", "LA 48200", "LA 50100", "HORT 21000");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 22 -> {
                System.out.println("You have chosen 'Natural Resources'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "NRES 12500", "NRES 20000", "FNR 21000", "NRES 25500", "NRES 42000", "NRES 49700");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 23 -> {
                System.out.println("You have chosen 'Plant Genetics'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGRY 25500","AGRY 28500","AGRY 32000","AGRY 32100","AGRY 39800","AGRY 48000","AGRY 49800","AGRY 52000","AGRY 52500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 24 -> {
                System.out.println("You have chosen 'Plant Science'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "BTNY 12000","BTNY 12100","BTNY 20700","BTNY 20800","BTNY 26200","BTNY 30200","BTNY 30500","BTNY 42000","BTNY 49700","BTNY 49800");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 25 -> {
                System.out.println("You have chosen 'Plant Studies'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGRY 25500","AGRY 28500","AGRY 32000","AGRY 32100","AGRY 39800","AGRY 48000","AGRY 49800","AGRY 52000","AGRY 52500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 26 -> {
                System.out.println("You have chosen 'Pre-veterinary Medicine'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGR 12400", "AGRY 32000", "AGRY 32100", "ANSC 22100", "VM 10200");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 27 -> {
                System.out.println("You have chosen 'Sales and Marketing'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGEC 20201", "AGEC 20300", "AGEC 21700", "AGEC 22000", "AGEC 29800", "AGEC 32700", "AGEC 33000", "AGEC 33100", "AGEC 35200", "AGEC 42400", "AGEC 42700", "AGEC 43000", "AGEC 43100", "COM 21200", "BIOL 11000", "AGEC 30500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 28 -> {
                System.out.println("You have chosen 'Soil and Water Sciences'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "AGRY 25500", "AGRY 12500", "AGRY 33500", "AGRY 33700", "AGRY 34900", "AGRY 36500", "AGRY 39800", "AGRY 45000", "AGRY 46500", "AGRY 49800", "AGRY 56500", "AGRY 10500");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 29 -> {
                System.out.println("You have chosen 'Sustainable Food and Farming Systems'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "SFS 21000","SFS 21100","SFS 30100","SFS 30200","SFS 35100","AGRY 12500","BTNY 30100","HORT 12100");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 30 -> {
                System.out.println("You have chosen 'Turf Management and Science'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "HORT 10100", "HORT 11000", "HORT 21000", "HORT 21100", "HORT 30100", "HORT 51000", "HORT 51200", "AGRY 51400");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            case 31 -> {
                System.out.println("You have chosen 'Wildlife'");
                Collections.addAll(courses, "AGR 10100", "AGR 11200", "CHM 11100", "MGMT 20000"); // Agriculture CORE requirements
                Collections.addAll(courses, "FNR 21000", "FNR 22310", "FNR 24150", "FNR 24250", "FNR 25150", "FNR 25250", "FNR 27000", "FNR 30500", "FNR 33100", "FNR 34100", "FNR 34800", "FNR 35910", "FNR 35910", "FNR 35950", "FNR 37010", "FNR 37050", "FNR 37300", "FNR 37500", "FNR 38400", "FNR 44700", "FNR 46500", "FNR 52700");
                promptClassesTaken();
                removeClassesTaken();
                addCreditsToArray();
                addCreditsEarnedToArray();
                sumCreditsNeeded();
                sumCreditsEarned();
                closingStatement();
            }
            default -> {
                System.out.println("Invalid input, please enter input in format: 1-31");
                collegeAgriculture();
            }
        }
    }
    public static void extraHelp() {
        System.out.println("What subject do you need help with? (Math) (Science) (English)");
        Scanner scanner = new Scanner(System.in);
        String subject = scanner.nextLine();
        switch (subject) {
            case "Math" -> {
                System.out.println("COSINE TUTORING: https://www.purdue.edu/science/Current_Students/cosine/index.html");
                System.out.println("SI (SUPPLEMENTAL INSTRUCTION): https://www.purdue.edu/asc/si/si-schedule.html");
                System.out.println("CHENFLIX: https://www.math.purdue.edu/~chenjk/");
                System.out.println("Office hours can be found on Brightspace for all professors!");
            }
            case "Science" -> {
                System.out.println("COSINE TUTORING: https://www.purdue.edu/science/Current_Students/cosine/index.html");
                System.out.println("SI (SUPPLEMENTAL INSTRUCTION): https://www.purdue.edu/asc/si/si-schedule.html");
                System.out.println("Biology Help Room: https://www.bio.purdue.edu/Academic/undergrad/brc.html");
                System.out.println("Chemistry Resource Room: https://www.chem.purdue.edu/academic_programs/resource-room/");
                System.out.println("Physics Help Center: https://www.physics.purdue.edu/academic-programs/courses/help_center.html");
                System.out.println("Office hours can be found on Brightspace for all professors!");
            }
            case "English" -> {
                System.out.println("Purdue Writing Lab: https://owl.purdue.edu/");
                System.out.println("Purdue Library: https://www.lib.purdue.edu/");
                System.out.println("Academic Consultations: https://www.purdue.edu/asc/consultations.html");
                System.out.println("Office hours can be found on Brightspace for all professors!");
            }
            default -> {
                System.out.println("Invalid input, please enter input in format: (Math),(Science),(English)");
                extraHelp();
            }
        }
    }
    public static void healthSupport(){
        System.out.println("Counseling and Psychological Services (CSPS): https://www.purdue.edu/caps/");
        System.out.println("Purdue University Student Health (PUSH): https://www.purdue.edu/push/");
        System.out.println("After Hours Crisis Information: https://www.purdue.edu/caps/contact/crisis/index.html");
        System.out.println("Community Providers (thrivingcampus): https://purdue.thrivingcampus.com/?_ga=2.63464815.1541405017.1658492721-1645890424.1559749004");
    }
    public static void promptClassesTaken(){
        System.out.println("What classes have you already taken? (Please enter one at a time in form: (MA 26100))");
        Scanner scanner = new Scanner(System.in);
        String classTaken = scanner.nextLine();
        classesTaken.add(classTaken);

        System.out.println("Do you have more classes? (y/n)");
        String isClassListDone = scanner.nextLine();
        switch (isClassListDone) {
            case "y":
                promptClassesTaken();
                break;
            case "n":
                break;
                default:
                System.out.println("Invalid input! Please try again");
                promptClassesTaken();
                break;
        }
    }
    public static void removeClassesTaken(){
        for (int i = 0;i < classesTaken.size();i++)
            for (int j = 0; j < courses.size(); j++) {
                if(classesTaken.get(i).equals(courses.get(j))) {
                    courses.remove(j);
                    j--;
                }
            }
    }

    public static void addCreditsToArray() {

        for (int i = 0; i < courses.size(); i++) {
            for (int j = 0; j < allCoursesList.size(); j++) {
                if (courses.get(i).equals(allCoursesList.get(j).substring(0, allCoursesList.get(j).lastIndexOf(' ')))) {
                    Courses subject = new Courses(allCoursesList.get(j));
                    classesWithCredits.add(subject);
                }
            }
        }
    }

    public static void addCreditsEarnedToArray(){
        for (int i = 0; i < classesTaken.size(); i++) {
            for (int j = 0; j < allCoursesList.size(); j++) {
                if (classesTaken.get(i).equals(allCoursesList.get(j).substring(0, allCoursesList.get(j).lastIndexOf(' ')))) {
                    Courses subject = new Courses(allCoursesList.get(j));
                    classesWithEarnedCredits.add(subject);
                }
            }
        }
    }
    public static void sumCreditsNeeded() {
        for (int i = 0; i < classesWithCredits.size(); i++) {
            creditsNeeded += classesWithCredits.get(i).getNumberOfCredits();
        }
    }
    public static void sumCreditsEarned(){
        for (int i = 0; i < classesWithEarnedCredits.size(); i++) {
            creditsEarned += classesWithEarnedCredits.get(i).getNumberOfCredits();
        }
    }

    public static void allClasses(){
        Collections.addAll(allCoursesList, "AGRY 25500 3","AGRY 28500 3","AGRY 32000 3","AGRY 32100 1","AGRY 39800 1","AGRY 48000 3","AGRY 49800 1","AGRY 52000 3","AGRY 52500 3","SFS 21000 3","SFS 21100 3","SFS 30100 3","SFS 30200 3","SFS 35100 1","AGRY 12500 3","BTNY 30100 3","HORT 12100 1","BTNY 12000 4","BTNY 12100 4","BTNY 20700 3","BTNY 20800 1","BTNY 26200 3","BTNY 30200 3","BTNY 30500 3","BTNY 42000 3","BTNY 49700 1","BTNY 49800 1","NRES 12500 3","NRES 20000 1","FNR 21000 3","NRES 25500 3","NRES 42000 1","NRES 49700 2","NRES 12500 3","NRES 20000 1","FNR 21000 3","NRES 25500 3","NRES 42000 1","NRES 49700 2","HORT 10100 3","HORT 11000 1","HORT 21000 3","HORT 21100 1","HORT 30100 4","HORT 51000 0","HORT 51200 0","AGRY 51400 1","AGR 12400 0.5","AGRY 32000 3","AGRY 32100 1","ANSC 22100 3","VM 10200 1","AGR 12400 0.5","AGRY 32000 3","AGRY 32100 1","ANSC 22100 3","VM 10200 1","AGRY 25500 3","AGRY 12500 3","AGRY 33500 3","AGRY 33700 3","AGRY 34900 3","AGRY 36500 3","AGRY 39800 1","AGRY 45000 3","AGRY 46500 3","AGRY 49800 1","AGRY 56500 3","AGRY 10500 3","FNR 21000 3","FNR 22310 3","FNR 24150 3","FNR 24250 1","FNR 25150 3","FNR 25250 1","FNR 27000 1","FNR 30500 3","FNR 33100 3","FNR 34100 3","FNR 34800 3","FNR 35910 2","FNR 35910 2", "FNR 35950 1","FNR 37010 1","FNR 37050 1","FNR 37300 4","FNR 37500 3","FNR 38400 3","FNR 44700 4","FNR 46500 1","FNR 52700 2","AGEC 20201 3","AGEC 20300 3","AGEC 21700 3","AGEC 22000 3","AGEC 32700 3","AGEC 33000 3","AGEC 33100 3","AGEC 35200 3","AGEC 42400 3","AGEC 42700 3","AGEC 43000 3","AGEC 43100 4","COM 21200 3","BIOL 11000 4","AGEC 305003","LA 10110 2","LA 11600 3","LA 11700 3","LA 16100 1","LA 16600 3","LA 21600 3","LA 22600 4","LA 22700 3","LA 24600 4","LA 30900 1","LA 31600 4","LA 32500 3","LA 32600 4","LA 34600 3","LA 35600 4","LA 39000 0","LA 41600 4","LA 42600 4","LA 47600 2","LA 48200 2","LA 50100 1","HORT 21000 3","BTNY 35000 3","CHM 11100 3", "CHM 11200 3","ENTM 10100 1","ENTM 10200 2","ENTM 20100 3","ENTM 20600 2","ENTM 20700 1","ENTM 21000 3","ENTM 25300 4","ENTM 30100 3","ENTM 31100 3","ENTM 31200 3","ENTM 33500 4","ENTM 39300 3","ENTM 40100 1","ENTM 41001 1","ENTM 41000 2","ENTM 49310 2","ENTM 49390 1","ENTM 49390 1","PHYS 21400 3", "FNR 22500 3", "FNR 33100 3", "FNR 35300 3", "FNR 35700 3", "FNR 37010 1", "FNR 37050 1", "FNR 37200 4", "FNR 37500 3", "FNR 40700 3", "FNR 43400 3", "FNR 43900 3","HORT 10100 3","HORT 20100 3","HORT 30100 4","HORT 31800 3","HORT 31900 3","HORT 42700 1","FS 16100 3", "FS 24500 1","FS 29800 1","FS 34000 1","FS 36100 1","FS 36200 3","FS 36300 2","FS 43500 1","FS 44200 2","FS 44700 1","FS 44300 3","FS 44400 1", "FS 26700 3","FS 46900 2","FS 48200 1","FS 53000 1","NUTR 31500 3","FS 16100 3","FS 16300 3","FS 29800 1","FS 34100 2","FS 36100 1","FS 36200 3","FS 36300 2","FS 37200 3","FS 37300 2","FS 40100 2","FS 40200 1","FS 44400 1","FS 48200 1","FS 48300 3","FS 38100 1", "ABE 30400 3","AGEC 29800 1", "AGEC 31000 3","AGEC 32100 3","AGEC 41100 4","AGEC 42400 3", "AGRY 10500 3","AGRY 25500 3","AGRY 32000 3","AGR 32100 1","AGRY 33500 3","AGRY 36500 3","AGRY 39800 1","AGRY 49800 1","AGRY 51500 1", "AGRY 52500 3", "ABE 20100 4","ABE 20200 3","ABE 29000 1","ABE 30100 3","ABE 30300 3","ABE 30400 3","ABE 30700 3","ABE 30800 3","ABE 37000 3","ABE 45700 3","ABE 46000 3","ABE 49000 1","ABE 55700 3","ABE 55800 3","ABE 31400 3","BIOL 11000 4","ABE 22700 2","ABE 22700 2","BCHM 10000 2","BCHM 22100 3","BCHM 29000 2","BCHM 32200 2","BCHM 36100 3","BCHM 39000 1","BCHM 46200 3","BCHM 46500 2","BCHM 49000 1","BCHM 49800 1","BCHM 42100 3","BCHM 42200 3","FNR 12500 3","FNR 20100 3","FNR 21000 3","FNR 22310 3","FNR 23000 3","FNR 24150 3","FNR 24250 1","FNR 25150 3","FNR 25250 1","FNR 27000 1","FNR 30500 3","FNR 35100 3","FNR 37010 1","FNR 37100 5","FNR 37500 3","FNR 38400 3","FNR 38500 4","FNR 40100 3","FNR 45600 4","FNR 52700 2","AGRY 28500 3","AGRY 33500 3","AGRY 33700 3","AGRY 39800 1","AGRY 43100 3","AGRY 43200 3","AGRY 43300 3","AGRY 44100 1","AGRY 44200 1","AGRY 44300 1","AGRY 49800 1","AGRY 53500 3","AGRY 53600 3","AGRY 54500 3","ANSC 10200 3","ANSC 12100 2","ANSC 18100 1","ANSC 22100 3","ANSC 23000 4","ANSC 24000 3","ANSC 25500 3","ANSC 31100 4","ANSC 33300 3","ANSC 48100 1","ANSC 44000 3","AGRY 25500 3","AGRY 32000 3","AGRY 36500 3","AGRY 39800 1","AGRY 49800 1","ASM 10400 3","ASM 10500 3","ASM 21100 3","ASM 22100 1","ASM 22000 3","ASM 33300 3","ASM 35000 1","ASM 42100 1","ASM 49400 1","ASM 49500 3","ASM 34500 3","ASM 42000 3","ASM 23600 3","ASM 24500 3","ABE 20500 3","ABE 21000 3","ABE 30500 3","ABE 31400 3","ABE 32000 3","ABE 32500 4","ABE 33000 3","ABE 43500 3","ABE 45000 3","ABE 48400 1","ABE 48600 3","ABE 49000 1","ASEC 24000 1", "ASEC 31800 2", "ASEC 31900 2", "ASEC 34000 2", "ASEC 34100 2", "ASEC 44000 3","AAS 27100 3","ASEC 15200 3","ASEC 28000 3","ASEC 38000 3","ASEC 48000 3","COM 31100 3","COM 31800 3","COM 25200 3","AGR 11200 0.5","MGMT 20000 3","AGEC 32700 3","AGEC 33000 3","AGEC 35200 3","AGEC 45100 3","AGEC 42400 3","AGR 10100 0.5","ABE 22600 2","ABE 29000 0","AD 22700 3","AD 27500 3","AD  11300 3","AD 11700 3","AD 12500 3","AD 22600 3","AD 24200 3","AD 25100 3","AD 25500 3","AD 26500 3","AD 26600 3","AD 38300 3","AD 38400 3","AD 33900 3","AD 39500 3","AGEC 20400 3","AGEC 25000 3","AGR 20100 3","AGRY 12500 3","AGRY 28500 3","AGRY 29000 3","AMST 10100 3","AMST 21000 3","AMST 21000 3","AMST 25000 3","AMST 31000 3","AMST 32500 3","ANSC 10200 3","ANSC 33100 3","ANTH 10000 3","ANTH 20100 3","ANTH 20300 3","ANTH 20400 3","ANTH 20500 3","ANTH 21000 3","ANTH 23000 3","ANTH 37900 3","ARAB 10100 3","ARAB 10200 3","ARAB 20100 3","ARAB 20200 3","ARAB 23900 3","ARAB 28000 3","ARAB 30100 3","ARAB 30200 3","ASAM 24000 3","ASEC 30100 3","ASEC 33100 3","ASEC 35500 3","ASL 10100","ASL 10200","ASL 20100","ASL 20200","ASM 23600 3","ASTR 26300 3","ASTR 26400 3","BCHM 10000 2","BCM 10001 3","BIOL 11000 4","BIOL 11200 2","BIOL 11300 2","BIOL 11500 1","BIOL 12100 2","BIOL 13100 3","BIOL 13500 2","BIOL 14501 2","BIOL 14502 2","BIOL 14600 3","BIOL 20100 2","BIOL 20200 2","BIOL 20300 4","BIOL 20400 4","BIOL 20500 3","BIOL 20600 3","BIOL 30200 3","BIOL 31200 3","BTNY 11000 4","BTNY 20100 3","BTNY 21100 3","BTNY 28500 3","CE 35500 3","CGT 17208 3","CHM 11200 3","CHM 11500 4","CHM 11600 4","CHM 12500 5","CHM 12600 5","CHM 12901 5","CHM 13600 4","CHM 20000 2","CHNS 10100 4","CHNS 10200 4","CHNS 20100 4","CHNS 20200 4","CHNS 24100 3","CHNS 28000 3","CHNS 30100 3","CHNS 30200 3","CHNS 33000 3","CHNS 40100 3","CHNS 40200 3","CLCS 18100 3","CLCS 23010 3","CLCS 23100 3","CLCS 23200 3","CLCS 23300 3","CLCS 23500 3","CLCS 23700 3","CLCS 23800 3","CLCS 23900 3","CLCS 33900 3","CLCS 38000 3","CLCS 38500 3","CM 10000 3","CMPL 26600 3","CMPL 26700 3","COM 11400 3","COM 20400 3","COM 21200 3","COM 21700 3","COM 22400 3","COM 25100 3","COM 25100 3","CS 10100 3","DANC 25000 3","DANC 37800 3","EAPS 10000 3","EAPS 10200 3","EAPS 10400 3","EAPS 10500 3","EAPS 10600 3","EAPS 10900 3","EAPS 11100 3","EAPS 11200 3","EAPS 11300 3","EAPS 11600 3","EAPS 11700 3","EAPS 12000 3","EAPS 12500 3","EAPS 12900 3","EAPS 13800 3","EAPS 20000 3","EAPS 22100 3","EAPS 22500 3","EAPS 24300 4","EAPS 24400 4","EAPS 31201 3","ECON 21000 3","ECON 25100 3","ECON 25200 3","ECON 51400 3","EDCI 20500 3","EDCI 22200 3","EDCI 27000 3","EDCI 28500 3","EDCI 49600 12","EDCI 49800 12","EDPS 10500 3","EDPS 23500 3","EDPS 26500 3","EDPS 31500 3","EDPS 31600 3","EDPS 49800 12","EDST 20000 3","EDST 20010 3","EDST 24800 3","EEE 35500 3","ENGL 10600 4","ENGL 10800 3","ENGL 11000 3","ENGL 20200 3","ENGL 21700 3","ENGL 21800 3","ENGL 21900 3","ENGL 22300 3","ENGL 22500 3","ENGL 22600 3","ENGL 22700 3","ENGL 22800 3","ENGL 23000 3","ENGL 23400 3","ENGL 23700 3","ENGL 23800 3","ENGL 24000 3","ENGL 24100 3","ENGL 25000 3","ENGL 26400 3","ENGL 26600 3","ENGL 26700 3","ENGL 28600 3","ENGL 30400 3","ENGL 32200 3","ENGL 35000 3","ENGL 35100 3","ENGL 36000 3","ENGL 36500 3","ENGL 36700 3","ENGL 37300 3","ENGL 38000 3","ENGL 38100 3","ENGL 38200 3","ENGL 38900 3","ENGR 13100 2","ENGR 13300 2","ENGR 14100 3.5","ENGR 16100 4","ENGR 20100 3","ENGR 27920 2","ENGR 31000 3","ENGR 37920 2","ENGR 47920 2","ENTM 10500 3","ENTM 12800","ENTM 20600 2","ENTM 21000 3","ENTM 21800 3","ENTM 22810 4","ENTM 22820 4","EPCS 10100 1","EPCS 10200 2","EPCS 11100 1","EPCS 12100 1","ECPS 20100 1","EPCS 20200 2","EPCS 30100 1","EPCS 30200 2","EPCS 40100 1","EPCS 40200 2","FNR 10300 3","FNR 12500 3","FNR 22310 3","FNR 23000 3","FNR 24000 3","FR 10100 3","FR 10200 3","FR 10500 4","FR 20100 3","FR 20200 3","FR 20500 4","FR 30100 3","FR 30200 3","FR 33000 3","FR 40100 3","FR 40200 3","FS 16100 3","GER 10100 3","GER 10200 3","GER 10500 4","GER 20100 3","GER 20200 3","GER 20500 4","GER 23000 3","GER 30100 3","GER 30200 3","GER 33000 3","GER 40100 3","GER 40200 2","GREK 10100 3","GREK 10200 3","GREK 20100 3","GREK 20200 3","GS 10000 3","GSLA 30100 3","HDFS 20100 3","HDFS 21000 3","HDFS 28000 3","HDFS 45000 12","HEBR 10100 3","HEBR 10200 3","HEBR 12100 3","HEBR 12200 3","HEBR 20100 3","HEBR 20200 3","HEBR 22100 3","HEBR 22200 3","HEBR 28000 3","HEBR 38000 0","HIST 10300 3","HIST 10400 3", "HIST 10500 3", "HIST 15100 3", "HIST 15200 3", "HIST 21000 3", "HIST 21100 3", "HIST 23800 3","HIST 23900 3","HIST 24000 3","HIST 24100 3", "HIST 24300 3","HIST 24500 3", "HIST 24600 3","HIST 25000 3","HIST 27100 3","HIST 27200 3", "HIST 30000 3","HIST 30305 3","HIST 30400 3","HIST 30505 3","HIST 30605 3","HIST 31005 3","HIST 31305 3","HIST 31405 3","HIST 31505 3","HIST 32300 3","HIST 32400 3","HIST 32900 3","HIST 33205 3","HIST 33300 3","HIST 33400 3","HIST 33805 3","HIST 34000 3","HIST 34100 3","HIST 34300 3","HIST 34400 3","HIST 34901 3","HIST 35000 3","HIST 35100 3","HIST 35205 3","HIST 35400 3","HIST 35500 3","HIST 35900 3","HIST 36305 3","HIST 37100 3","HIST 37500 3","HIST 37700 3","HIST 38001 3","HIST 38200 3","HIST 38300 3","HIST 38400 3","HIST 38505 3","HIST 38700 3","HIST 39400 3","HIST 39600 3","HIST 39800 3","HIST 41005 3","HIST 47005 3","HONR 19901 1","HONR 19903 3","HONR 46000 3","HORT 10100 3","HORT 12100 1","HORT 30600 3","HSCI 20100 3","HSCI 20200 3","HTM 37200 0","ILS 17500 1","IT 22600 2","ITAL 10100 3","ITAL 10200 3","ITAL 10500 3","ITAL 20100 3","ITAL 20200 3","ITAL 20500 3","ITAL 28000 3","ITAL 28100 3","ITAL 30100 3","ITAL 30200 3","ITAL 33000 3","ITAL 33300 3","ITAL 38000 3","JPNS 10100 4","JPNS 10200 4", "JPNS 20100 4","JPNS 20200 4","JPNS 30100 3","JPNS 30200 3","JPNS 40100 3","JPNS 40200 2","JWST 33000 3","LA 16100 1","LATN 10100 3","LATN 10200 3","LATN 20100 3","LATN 20200 3","LATN 34300 3","LATN 34400 3","LATN 34500 3","LATN 34600 3","LATN 34700 3","LATN 44200 3","LATN 44300 3","LATN 44400 3","LATN 44500 3","LATN 44600 3","LC 23900 3","LC 26100 3","LC 33300 3","LING 20100 3","MA 13800 3","MA 15300 3","MA 15400 3","MA 15555 3","MA 15800 3","MA 15910 3","MA 16010 3","MA 16020 3","MA 16021 0","MA 16100 5","MA 16200 5","MA 16500 4","MA 16600 4","MA 17300 5","MA 17400 4","MA 18100 5","MA 18200 5","MA 19000 3","MA 22000 3","MA 22100 3","MA 22200 3", "MA 22300 3","MA 22400 3","MA 23100 3","MA 23200 3","MA 26100 4","MA 26200 4","MA 26500 3","MA 26600 3", "MA 27100 5","MA 27101 5","MA35100 3","MA 36600 4","ME 29000 1","MGMT 17500 1","MUS 11200 3","MUS 13200 3","MUS 25000 3","MUS 26100 3","MUS 36100 3","MUS 37600 3","MUS 37800 3","NRES 12500 3","NRES 23000 3","NRES 29000 3","NUR 22301 4","NUTR 20200 4","NUTR 30300 3","NUTUR 39800 3", "PHIL 11000 3","PHIL 11100 3","PHIL 11400 3","PHIL 12000 3", "PHIL 15000 3","PHIL 20600 3","PHIL 20700 3","PHIL 20800 3", "PHIL 21900 3","PHIL 22100 3","PHIL 22300 3","PHIL 22500 3","PHIL 23000 3","PHIL 23100 3","PHIL 24000 3","PHIL 24200 3","PHIL 24200 3","PHIL 26000 3","PHIL 27000 3","PHIL 27500 3","PHIL 28000 3","PHIL 29000 3","PHIL 30100 3","PHIL 30200 3","PHIL 30300 3","PHIL 30400 3","PHIL 33000 0","PHIL 41100 3","PHIL 42400 3","PHYS 15200 4","PHYS 17200 4","PHYS 21400 3","PHYS 21500 2","PHYS 21800 4","PHYS 21900 4","PHYS 22000 4","PHYS 22100 4","PHYS 23000 3","PHYS 24100 3","PHYS 27200 4","POL 10100 3","POL 12000 3","POL 13000 3","POL 14100 3","POL 22200 3","POL 22300 3","POL 23000 3","POL 23100 3","POL 23500 3","POL 23700 3","POL 30000 3","POL 32600 3", "POL 32700 3","POL 33500 3","POL 36000 3","POL 37200 3","PSY 10000 1","PSY 12000 3","PSY 12300 3","PTGS 10100 3","PTGS 10200 3","PTGS 10500 3","PTGS 20100 3","PTGS 20200 3","PTGS 30100 3","PTGS 30200 3","PUBH 20200 3","REL 20000 3","REL 23000 3","REL 23100 3","RUSS 10100 4","RUSS 10200 4","RUSS 20100 4","RUSS 20200 4","RUSS 28100 3","RUSS 30100 3","RUSS 30200 3","RUSS 33000 3","RUSS 40100 3","RUSS 40200 2","SA 10202 3","SCLA 10100 3","SCLA 10200 3","SCLA 20000 3","SLHS 21500 3","SLHS 21500 3","SLHS 22700 3","SLHS 30600 3","SLHS 30900 3","SOC 10000 3","SOC 22000 3","SOC 27500 3","SOC 32600 3","SOC 33500 3","SOC 34400 3","SOC 35200 3","SOC 37400 3","SOC 42900 3","SPAN 10100 3","SPAN 10200 3","SPAN 10500 4","SPAN 20100 3","SPAN 20200 3","SPAN 20500 4","SPAN 23500 3","SPAN 30100 3","SPAN 30200 3","SPAN 30500 3","SPAN 30801 3","SPAN 33000 3","SPAN 40100 3","SPAN 40200 3","STAT 11300 3","STAT 30100 3","SYS 30000 3","SYS 35000 3","SYS 40000 3","TECH 12000 3","THTR 20100 3","VIP 17911 3","VIP 17920 2","VIP 27920","VIP 37920","VIP 47920","WGSS 28000","WGSS 28200 3","WGSS 38000");

    }
    public static void closingStatement(){
        System.out.println("You have earned " + creditsEarned + " credits, but still need " + creditsNeeded + " credits in order to graduate.");
        System.out.println("Do you want to see the classes you still need to take in order to graduate? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("y")) {
            System.out.println("Classes Taken: ");
            for (int i = 0; i < classesWithEarnedCredits.size(); i++) {
                System.out.print(classesWithEarnedCredits.get(i).getTitleOfCourse()+", ");
            }
            System.out.println("");
            System.out.println("Classes Needed: ");
            for (int i = 0; i < classesWithCredits.size(); i++) {
                System.out.print(classesWithCredits.get(i).getTitleOfCourse()+", ");
            }
        }
        return;
    }

}
