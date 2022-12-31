package sample.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.github.sombriks.simpleruncmd.SyncRunCmd;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        SyncRunCmd cmd = new SyncRunCmd("ls");
        cmd.exec();
        String result = cmd.getOutResult();
        String expected = Stream
                .of("LICENSE", "mvnw", "mvnw.cmd", "pom.xml", "README.md", "src", "target")
                .collect(Collectors.joining(System.lineSeparator()));
        expected += System.lineSeparator();
        assertEquals(expected, result);
    }
}
