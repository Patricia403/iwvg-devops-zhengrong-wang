package es.upm.miw.iwvg_devops.rest;

import es.upm.miw.iwvg_devops.Searches;
import es.upm.miw.iwvg_devops.Fraction;
import es.upm.miw.iwvg_devops.User;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    //0
    @Test
    void testFindUserFamilyNameInitialBySomeProperFraction(){
        assertEquals(List.of("López"), new Searches().findUserFamilyNameInitialBySomeProperFraction("1,5;-3,6;1,2")
                .collect(Collectors.toList()));
    }
    //e
    @Test
    void testFindFractionAddByUserId() {
        assertEquals(List.of(2, 4, 2, 4), new Searches().findFractionAdditionByUserId("Paula")
                .getClass());
    }

}
