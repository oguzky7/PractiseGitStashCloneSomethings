public class Main {
    public static void main(String[] args) {
        System.out.println("This is my main branch");
        System.out.println("I'm adding a new feature");
        System.out.println("Please add new features in new branches");
        System.out.println("Don't mess with the main branch");

        System.out.println("Not a conflict");

        System.out.println("This is my code for my new branch that I created");
        System.out.println("but after I created I forgot to switch to it");
        /*So, what I did is:
         git stash
         git checkout newBranch
         git stash apply 0
         */

    }
}
