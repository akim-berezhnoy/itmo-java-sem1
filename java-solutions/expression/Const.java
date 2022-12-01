package expression;

public class Const implements GigachadExpression {
    private final int value;

    public Const(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(int x) {
        return value;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        return value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof final Const that) {
            return that.value == this.value;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}