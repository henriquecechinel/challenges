import javax.swing.*;

public class ChallengeMain {
    public static void main(String[] args){
        Person person = new Person("Henrique Cechinel", "Brazilian", "Become successful in life, by having a great family, enjoying my job, and being able to travel around the world to discover new cultures and to meet new people");

        JOptionPane.showMessageDialog(null, "Hello! My name is " + person.getName());
        JOptionPane.showMessageDialog(null, "I am " + person.getNationality());
        JOptionPane.showMessageDialog(null, "And my dream is to " + person.getDream());
    }
}

