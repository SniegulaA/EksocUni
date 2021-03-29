
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Objects;


@Getter
@Setter
@ToString
//@EqualsAndHashCode - dzięki tej linijce nie musimy ręcznie pisać metod equals i hash code
public class TestClass  {
    private int a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return a == testClass.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }


}
