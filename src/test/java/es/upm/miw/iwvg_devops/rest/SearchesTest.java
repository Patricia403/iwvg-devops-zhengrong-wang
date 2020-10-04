package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    //0
    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction(){
        assertEquals(List.of("López"), new Searches().findUserFamilyNameInitialBySomeProperFraction("1,5;-3,6;1,2")
                .collect(Collectors.toList()));
    }

}
