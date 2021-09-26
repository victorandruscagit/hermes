package org.itsimulator.germes.app.rest.service;


import jersey.repackaged.com.google.common.collect.Lists;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cities")
/**
 *{@link CityResource} is REST web-service that handles city related
 *requests
 * @author Andrusca
 */
public class CityResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    private List<String> findCities() {
        return Lists.newArrayList("Odessa", "Kiyv");
    }

}
