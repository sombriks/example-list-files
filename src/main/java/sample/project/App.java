package sample.project;

import io.github.sombriks.simpleruncmd.SyncRunCmd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SyncRunCmd cmd = new SyncRunCmd("ls");
        cmd.exec();
        System.out.println(cmd.getOutResult());
    }
}
