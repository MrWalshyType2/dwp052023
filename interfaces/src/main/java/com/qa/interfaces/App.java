package com.qa.interfaces;

public class App {
    public static void main(String[] args) {
        KeyPair keyPair = new ConcreteKeyPair("morgan", "j9f8e9wj8j8978u4734yryh78yh87");
        System.out.println(keyPair.getKeyValuePair());
        System.out.println(keyPair.getKey());
        System.out.println(keyPair.getValue());
    }
}

interface KeyPair {
    // we don't need to specify the public and abstract modifiers
    public abstract String getKey();
    String getValue();

    // a default method has an implementation
    default String getKeyValuePair() {
        return getKey() + ":" + getValue();
    }
}

class ConcreteKeyPair implements KeyPair {

    private String key;
    private String value;

    public ConcreteKeyPair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return value;
    }
}


