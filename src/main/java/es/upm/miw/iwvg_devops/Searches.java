package es.upm.miw.iwvg_devops;

import org.apache.logging.log4j.LogManager;

import java.util.stream.Stream;

public class Searches {

    //0
    public Stream<String> findUserFamilyNameInitialBySomeProperFraction(String properFraction){
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> properFraction.equals(fraction.isProper(fraction.getNumerator(),fraction.getDenominator()))))
                .map(User::getFamilyName);
    }


}
