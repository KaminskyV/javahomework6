import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    void searchforsquarenumbers(int x, int y, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(x, y);
        Assertions.assertEquals(expected, actual);
    }
}
