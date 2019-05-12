public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Бекнур","Куандык", 25);
        Person p2 = new Person("Бекнур","Куандык",25);
        System.out.println(p1.equals(p2));
    }
}
