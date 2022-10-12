package de.egga.farmerschoice.progress.view;

import java.util.ArrayList;
import java.util.List;

public class EarlySquads {

    private List<EarlySquad> squads = new ArrayList<>();

    public void add(EarlySquad squad) {
        squads.add(squad);
    }

    @Override
    public String toString() {

        String body = "";
        for (EarlySquad squad : squads) {
            body += squad.toString();
        }

        return "<html><head>" +
                "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">\n" +
                "<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"+
                "</head><body>" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>\n"+
                "<h1>Early Squads</h1>\n" +
                "<div class=\"container\">\n" +
                "<div class=\"row\">\n" +
                 body +
                "</div>\n"+
                "</div>\n"+
                "</body></html>";
    }
}
