import com.mycompany.calculator2.SimpleCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    // Menguji metode penjumlahan
    @Test
    public void testTambah() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.tambah(3, 2);
        assertEquals(5, result, "3 + 2 harusnya 5");
    }

    // Menguji metode pengurangan
    @Test
    public void testKurang() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.kurang(5, 3);
        assertEquals(2, result, "5 - 3 harusnya 2");
    }

    // Menguji metode perkalian
    @Test
    public void testKali() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.kali(4, 2);
        assertEquals(8, result, "4 * 2 harusnya 8");
    }

    // Menguji metode pembagian
    @Test
    public void testBagi() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.bagi(10, 2);
        assertEquals(5.0, result, "10 / 2 harusnya 5.0");
    }

    // Menguji pembagian dengan nol
    @Test
    public void testBagiDenganNol() {
        SimpleCalculator calculator = new SimpleCalculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.bagi(10, 0);  // Harus melempar ArithmeticException
        });
        assertEquals("Pembagian dengan nol tidak diperbolehkan.", exception.getMessage());
    }
}
