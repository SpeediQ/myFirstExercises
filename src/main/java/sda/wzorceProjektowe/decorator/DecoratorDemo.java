package sda.wzorceProjektowe.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        AbstractMessage message = new Message("Hello World!");
        System.out.println(message.getMessage());
        System.out.println(new StarsDecorator(message).getMessage());

        AbstractMessage decoratorMessage = new StarsDecorator(message);
        System.out.println(decoratorMessage.getMessage());
        System.out.println(new StarsDecorator(message).getMessage());
    }
}
