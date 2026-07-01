package org.example;

import java.util.Objects;

public class Test {
    private String mew = new String();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(mew, test.mew);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mew);
    }

    @Override
    public String toString() {
        return "Test{" +
                "mew='" + mew + '\'' +
                '}';
    }

    public String getMew() {
        return mew;
    }

    public void setMew(String mew) {
        this.mew = mew;
    }
}
