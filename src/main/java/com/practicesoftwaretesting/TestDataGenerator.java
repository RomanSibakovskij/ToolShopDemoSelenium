package com.practicesoftwaretesting;

import org.openqa.selenium.*;

import java.security.SecureRandom;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDataGenerator extends BasePage{

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final Random RANDOM = new SecureRandom();

    public TestDataGenerator(WebDriver driver) {super(driver);}

    private static String firstName;
    private static String lastName;
    private static String emailAddress;
    private static String password;
    private static String address;;
    private static int phone;
    private static int birthdate;

    //Illinois street types array
    private static final String[] STREET_TYPES = {"St.", "Ave.", "Blvd.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl."};

    //first names array
    private static final String[] firstNames = {
            "Aiden", "Olivia", "Liam", "Emma", "Noah", "Ava", "Elijah", "Sophia", "Lucas", "Isabella",
            "Mason", "Mia", "Ethan", "Amelia", "James", "Harper", "Benjamin", "Evelyn", "Jack", "Abigail",
            "Henry", "Ella", "Alexander", "Avery", "Jackson", "Scarlett", "Sebastian", "Grace", "Owen", "Lily",
            "Matthew", "Chloe", "William", "Zoey", "Joseph", "Penelope", "Luke", "Hannah", "Daniel", "Aria",
            "Logan", "Ellie", "David", "Madison", "Samuel", "Nora", "John", "Riley", "Ryan", "Lillian",
            "Leo", "Paisley", "Nathan", "Aurora", "Isaac", "Addison", "Joshua", "Brooklyn", "Caleb", "Leah",
            "Hunter", "Savannah", "Andrew", "Sofia", "Connor", "Lucy", "Carter", "Victoria", "Eli", "Willow",
            "Wyatt", "Violet", "Dylan", "Zoe", "Grayson", "Stella", "Landon", "Hazel", "Gabriel", "Emilia",
            "Jayden", "Claire", "Anthony", "Bella", "Christian", "Maya", "Julian", "Elena", "Aaron", "Piper",
            "Dominic", "Ariana", "Adam", "Ruby", "Evan", "Madelyn", "Nicholas", "Alice", "Isaiah", "Skylar",
            "Thomas", "Eva", "Charles", "Everly", "Christopher", "Naomi", "Miles", "Quinn", "Zachary", "Aubrey",
            "Ezra", "Peyton", "Jeremiah", "Serenity", "Nathaniel", "Isla", "Robert", "Kennedy", "Jonathan", "Cora"
    };

    //last names array
    private static final String[] lastNames = {
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
            "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
            "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "King", "Wright",
            "Scott", "Torres", "Nguyen", "Hill", "Flores", "Green", "Adams", "Nelson", "Baker", "Gonzalez",
            "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards",
            "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy",
            "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray",
            "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
            "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores",
            "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz",
            "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West",
            "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "McDonald", "Cruz", "Marshall"
    };

    //random first name picker method
    public static String getRandomFirstName() {
        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        return firstName;
    }
    //random last name picker method
    public static String getRandomLastName() {
        Random random = new Random();
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return lastName;
    }

    //generate random string methods
    private static String generateRandomString(String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }


    //string generator methods
    private static String generateRandomNumberString(int length) {return generateRandomString(DIGITS, length);}

    private static String generateRandomSpecialString(int length) {return generateRandomString(SPECIAL, length);}

    //randomizer (for username) methods
    public static String generateRandomUsername(int length) {return generateRandomString(UPPER + LOWER, length);}

    //random email generator
    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@example.com";
    }
    //generate a random address with a given length for the street name
    public static String generateRandomAddress(int length) {
        int streetNumber = RANDOM.nextInt(9999) + 1; // street number between 1 and 9999
        String streetName = generateRandomString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", length);
        String streetType = STREET_TYPES[RANDOM.nextInt(STREET_TYPES.length)];
        return streetNumber + " " + streetName + " " + streetType;
    }
    //random password generator
    public static String generateRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "Stoker";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    //random phone number generator
    public static String generatePhoneNumber(int length) {
        if (length < 1) {throw new IllegalArgumentException("Phone number length must be at least 1.");}

        Random random = new Random();
        String phoneNumber = "";
        //generate the specified number of random digits
        for (int i = 0; i < length; i++) {
            phoneNumber += random.nextInt(10); //generate a random digit (0-9)
        }
        return phoneNumber;
    }

    public static String generateBirthdate() {
        Random random = new Random();

        //generate a random year between 1950 and 2005
        int year = 1950 + random.nextInt(2005 - 1950 + 1);

        //generate a random month between 1 and 12
        int month = 1 + random.nextInt(12);

        //generate a random day based on the month and year (to ensure valid dates)
        int day;
        switch (month) {
            case 4: case 6: case 9: case 11:
                day = 1 + random.nextInt(30); // 30 days for April, June, September, November
                break;
            case 2:
                //assert it's a leap year for February
                day = 1 + random.nextInt(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28);
                break;
            default:
                day = 1 + random.nextInt(31);
        }

        //generate thedate with LocalDate for accurate formatting
        LocalDate birthdate = LocalDate.of(year, month, day);

        //format required by <input type="date">
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //formatter for log/display (dd/MM/yyyy)
        DateTimeFormatter logFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //log the visually swapped date format (this most likely due to the developer oversight that the similar date input format is not present)
        String logFormattedDate = birthdate.format(logFormatter);
        logger.info("Valid user birthdate: " + logFormattedDate);

        return birthdate.format(formatter); //return in yyyy-MM-dd format - required for internal input
    }

    //array of Illinois state cities
    private static final String[] ILLINOIS_CITIES = {
            "Chicago", "Aurora", "Naperville", "Joliet", "Rockford", "Springfield",
            "Elgin", "Peoria", "Champaign", "Waukegan", "Cicero", "Bloomington",
            "Arlington Heights", "Evanston", "Decatur", "Schaumburg", "Bolingbrook",
            "Palatine", "Skokie", "Des Plaines", "Orland Park", "Tinley Park",
            "Oak Lawn", "Berwyn", "Mount Prospect", "Normal", "Wheaton", "Hoffman Estates",
            "Oak Park", "Downers Grove", "Elmhurst", "Glenview", "DeKalb", "Lombard",
            "Moline", "Buffalo Grove", "Bartlett", "Urbana", "Crystal Lake", "Quincy",
            "Streamwood", "Carol Stream", "Romeoville", "Plainfield", "Hanover Park",
            "Carpentersville", "Wheeling", "Park Ridge", "Addison", "Calumet City"
    };

    //cities rnd instance
    private static final Random rndIllinoisCities = new Random();

    //method to get a random city from the array
    public static String getRandomCity() {
        int index = rndIllinoisCities.nextInt(ILLINOIS_CITIES.length);
        return ILLINOIS_CITIES[index];
    }

    //generate random postal code for Illinois
    public static int getRandomPostalCode() {return 60000 + RANDOM.nextInt(30000);}

    public static String getFirstName(){return firstName;}
    public static String getLastName(){return lastName;}
    public static String getEmailAddress() {return emailAddress;}
    public static String getAddress(){return address;}
    public static String getPassword() {return password;}
}
