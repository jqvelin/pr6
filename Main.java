class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        sayHi();
        Calculator.add(1, 2);
    }

    public static void sayHi() {
        System.out.println("Hello World");
    }
}