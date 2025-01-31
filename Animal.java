class Animal {
    public void sound() {  
        System.out.println("Animal makes sound!");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {  
        System.out.println("bark!");
    }

    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.sound();  
    }
}
