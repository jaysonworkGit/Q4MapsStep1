package kalpesh.mac.com.raandroid_header.services;

import kalpesh.mac.com.raandroid_header.constants.Constants;
import kalpesh.mac.com.raandroid_header.observables.IRestaurant;
import kalpesh.mac.com.raandroid_header.utilities.APIErrorHandler;
import retrofit.RestAdapter;

/**
 * Created by kalpesh on 27/12/2015.
 */
public class Services {
    public static IRestaurant _createRestruentshubApi() {

        RestAdapter.Builder builder= new RestAdapter.Builder()
                .setEndpoint(Constants.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setErrorHandler(new APIErrorHandler());


        return builder.build().create(IRestaurant.class);
    }
}
