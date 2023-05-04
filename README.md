# public-transport-regulator
Short java problem solving

Problem:
When covid hit there needed to be regulations on the number of people in the
waiting station where they get taxis & has to be less than 50,
Also checking the number of passengers to regulate  social distancing
where they had to be less than 10 in the taxi
ensuring peoples health is prioritised using technology.


Code Observations

After initialising the Scanner object &
before assigning the object to a variable
there must be a print statement below immediately
when using the Scanner object more than once because
the program does not prompt when running the application,
therefore not it does not run accordingly.

In practicality.
The Wrong Way:

        Scanner obj = new Scanner(System.in);
        int numPpl = obj.nextInt();
        System.out.println("How many passengers?");
        int numPasseng = obj.nextInt();
        System.out.println("How many passengers?");

The Right Way:

           Scanner obj = new Scanner(System.in);
           System.out.println("How many people?");
           int numPpl = obj.nextInt();
           System.out.println("How many passengers?");
           int numPasseng = obj.nextInt();
          

How to install and Run the Project:

You can clone the project, open your ide and make sure you are on the project directory and on the terminal run flutter update of you already have flutter installed, if not then dun flutter install then flutter update. All the red error messeges should be gone at this point then run the command 'flutter run d chrome' for the debbug screen to appear to see the progress.
