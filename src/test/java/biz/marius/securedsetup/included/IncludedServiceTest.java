package biz.marius.securedsetup.included;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncludedServiceTest {

    @Test
    void should_verify_doStuff() {
        var is = new IncludedService();
        assertDoesNotThrow(is::doStuff);
    }
}