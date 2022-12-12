package cn.tuyucheng.taketoday.sonarqubeandjacoco.product;

import java.util.stream.Stream;

public class StreamGenerator {

    public static Stream<Integer> generateStream(int size) {
        return Stream.iterate(0, n -> n + 1).limit(size);
    }
}