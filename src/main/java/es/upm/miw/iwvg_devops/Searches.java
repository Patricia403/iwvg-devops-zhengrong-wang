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

    //e
    public Fraction findFractionAdditionByUserId(String id) {
        return (Fraction) new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream());
                //.map(Fraction::add);
    }

    //b
    public Stream<String> findUserFamilyNameByAllNegativeSignFractionDistinct(String negativeSignFraction) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> negativeSignFraction.equals(fraction.isNegativeSign(fraction.decimal))))
                .map(User::getFamilyName)
                .distinct();
    }

}
