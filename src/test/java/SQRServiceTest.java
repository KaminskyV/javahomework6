import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    void searchforsquarenumbers(int begin, int end, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(begin, end);
        Assertions.assertEquals(expected, actual);
    }
}
