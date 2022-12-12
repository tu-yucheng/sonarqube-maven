package cn.tuyucheng.taketoday.sonarqubeandjacoco.product;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StreamGeneratorTest{

    // 当生成的流的大小为5时，然后对元素进行求和，结果应该正确

    @Test
    public void whenGenerateStreamWithFiveEle_thenSumTheEleShouldCorrect() {
        StreamGenerator.generateStream(5)
                .reduce(Integer::sum)
                .ifPresent(sum -> assertEquals(10, sum.intValue()));
    }
}