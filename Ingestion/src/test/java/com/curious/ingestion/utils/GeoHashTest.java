package com.curious.ingestion.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by hritupon on 2/2/20.
 */
@SpringBootTest
class GeoHashTest {
    @Test
    void getGeoHash() {
        assertEquals("s1zzhyd03y07", GeoHash.getGeoHash(11.11, 11.11));
        assertEquals("s1zzhy", GeoHash.getGeoHash(11.11, 11.11,6));
    }

}