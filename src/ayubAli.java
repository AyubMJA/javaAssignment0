public class ayubAli {

    /**
     *  Assignment 0. Get to know you program.
     *  Projected created: May 13th/2019
     *
     * @author Ayub Ali
     */

    public static void main(String[] args) throws InterruptedException {

        // Variables for name, student number, and program of choice.
        String name = "Ayub Ali";
        String studentNumber = "000354446\n";
        String program = "Computer Systems Technology - Software Development - 559\n";

        // Print statements for name, student number
        System.out.println(name);

        for (int index = 0; index < studentNumber.length(); index++){
            Thread.sleep(250);
            System.out.print(studentNumber.charAt(index));
        }

        System.out.println(program);
        //Question 3 variable
        String q3 = "\tAns: Sorry you do not have the clearance for that information.\n";

        Thread.sleep(10000);

        // Question 1.
        System.out.println("\n1.\tDid you take any computer science courses before coming to Mohawk? \n\tIf yes, " +
                "where did you take them and what did you learn?\n");
        System.out.println("\tAns: I have taken Udemy course for ios development.\n");

        Thread.sleep(1000);

        // Question 2.
        System.out.println("2. \tHave you ever programmed in a language other than Python before? \n\tIf yes," +
                "list the languages you have had experience with.\n");
        System.out.println("\tAns: I only have experience with Swift programming language for iphone app development.\n");

        Thread.sleep(1000);

        // Question 3.
        System.out.println("3. Have you have ever done any computer programming for a job? \n\tIf so," +
                "what did you do?\n");
        for (int index = 0; index < q3.length(); index++){
            Thread.sleep(250);
            System.out.print(q3.charAt(index));
        }

        Thread.sleep(1000);

        //Question 4.
        System.out.println("4. What are your main interests or hobbies? What do you do in your spare time.\n");
        System.out.println("Ans: My hobby is programming cool stuff and learning something new I guess.\n " +
                "\tIt's not magic, it's talent and sweat. So what do I do in my spare time? \n\tI make sure that one bad config on" +
                "\tone key component does't destroy a company or give my location away. \n\tThat's what I do!\n  ");

        Thread.sleep(1000);

        //Question 5.
        System.out.println("5.What was your favourite thing about Python programming course.\n");
        System.out.println("Ans: My favourite thing about python was how useful the text book was." +
                "\n\tEven though I never used the textbook. I am sure that this won't happen in java right?\n");

        Thread.sleep(1000);

        //Question 6.
        System.out.println("6. What challenges did you face in your Python Course?\n");
        System.out.println("Ans: Keeping my eyes open mainly. Other than that smooth sailing I guess.\n");

        Thread.sleep(1000);

        //Question 7.
        System.out.println("7. What are you looking forward to and/or what are you concerned about for this course in Java?\n");
        System.out.println("Ans: My main thing is to get good enough so I can get a coop job with the skills I picked up. \n\tNot really concerned why are you?\n");

        Thread.sleep(1000);

        //Question 8.
        System.out.println("8. What else (if anything) would you like me to know about you?\n");
        System.out.println("Ans: Since you asked...\n");
        System.out.println("\t1. I got top secret clearance I can't talk about.");
        System.out.println("\t2. I started learning computer programming at 13-14 years old. My first language was c++.");
        System.out.println("\t3. I am a dragon slayer.");
        System.out.println("\t4. I am also a white hat hacker.");
        System.out.println("\t5. This is a serious answer I promise!: I want to create my own startup. You can think of me as the black Mark Zuckerberg \n" +
                "\twithout wanting to sell user data to corporations or to Russia.");


    }
}
