package de.egga.farmerschoice.progress.view;

import de.egga.farmerschoice.progress.repository.ToonProgress;
import de.egga.farmerschoice.toons.ToonId;
import de.egga.farmerschoice.toons.repository.ToonCategory;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EarlySquad {

    private final ToonCategory category;
    private final List<ToonProgress> progress = new ArrayList<>();

    public EarlySquad(ToonCategory category) {
        this.category = category;
    }

    public void add(ToonProgress toon) {
        progress.add(toon);
    }

    public ToonCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {

        Comparator<ToonProgress> compareByStats = Comparator
                .comparing(ToonProgress::actualRarity)
                .thenComparing(ToonProgress::actualLevel)
                .thenComparing(ToonProgress::actualGear)
                .thenComparing(ToonProgress::actualAbility)
                .reversed();

        String body = "<div class=\"col s12 m12 l5\">\n" +
                "<div class=\"card cyan accent-1\">\n" +
                "<div class=\"card-content\">\n" +
                "<span class=\"card-title\">" + category + "</span>\n";


        int i = 1;
        List<ToonProgress> progresses = progress.stream().sorted(compareByStats).toList();
        for (ToonProgress toon : progresses) {
            body += serialize(toon);

            if (i == 6 && progresses.size() > 6) {
                body +=
                        "<a class=\"btn-floating halfway-fab activator waves-effect waves-light purple accent-1\"><i class=\"material-icons\">add</i></a>\n" +
                        "</div>\n" +
                        "<div class=\"card-reveal purple accent-1\">" +
                        "<span class=\"card-title grey-text text-darken-4\">" +
                        category +
                        "<i class=\"material-icons right\">close</i>" +
                        "</span>\n";
            }
            i++;
        }

        return body +
                "</div>\n" +
                "</div>\n" +
                "</div>\n";
    }

    private String serialize(ToonProgress toon) {
        String screenName = toon.name();
        if (toon.name().contains("Old Ben")) {
            screenName = "Old Ben";
        }
        if (toon.name().contains("Farmboy")) {
            screenName = "Farmboy Luke";
        }
        if (toon.id().equals(new ToonId("FIRSTORDERTROOPER"))) {
            screenName = "First Order Trooper";
        }
        if (toon.id().equals(new ToonId("SMUGGLERCHEWBACCA"))) {
            screenName = "Veteran Chewbacca";
        }
        if (toon.id().equals(new ToonId("SMUGGLERHAN"))) {
            screenName = "Veteran Han Solo";
        }
        if (toon.id().equals(new ToonId("CLONEWARSCHEWBACCA"))) {
            screenName = "CW Chewbacca";
        }
        return screenName + "\n" +
                getColored("", toon.actualPower(), toon.perfectPower(), toon.minimumPower()) +
                getColored("A", toon.actualAbility(), toon.perfectAbility(), toon.minimumAbility()) +
                getColored("G", toon.actualGear(), toon.perfectGear(), toon.minimumGear()) +
                getColored("L", toon.actualLevel(), toon.perfectLevel(), toon.minimumLevel()) +
                getColored("⭐", toon.actualRarity(), toon.perfectRarity(), toon.minimumRarity()) +
                "<br>\n";
    }

    @NotNull
    private String getColored(String label, long actual, int recommended, int minimum) {
        String color = "deep-orange";
        if (actual >= recommended) {
            color = "light-green";
        } else if (actual >= minimum) {
            color = "amber";
        }
        String value = String.valueOf(actual);
        if (actual > 10000) {
            value = value.substring(0, 2) + "k";
        } else if (actual > 1000) {
            value = value.substring(0, 1) + "," + value.substring(1, 2) + "k";
        }

        return "<span class=\"badge " + color + " lighten-3\" data-badge-caption=\"" + label + "\">" +
                value +
                "</span>\n";
    }
}
