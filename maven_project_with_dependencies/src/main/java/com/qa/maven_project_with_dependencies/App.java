package com.qa.maven_project_with_dependencies;

import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class App {

    public static void main(String[] args) {
        DefaultTerminalFactory factory = new
                DefaultTerminalFactory();
        Terminal terminal = null;

        try {
            terminal = factory.createTerminal();
            terminal.putCharacter('H');
            terminal.putCharacter('i');
            terminal.flush();
            Thread.sleep(5000);
            terminal.bell();
            terminal.flush();
            Thread.sleep(200);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (terminal != null) try {
                terminal.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
