package kalpesh.mac.com.raandroid_header.observables;

import kalpesh.mac.com.raandroid_header.model.Example;
import retrofit.http.GET;
import retrofit.http.Headers;
import rx.Observable;

/**
 * Created by kalpesh on 27/12/2015.
 */
public interface IRestaurant {
    @Headers({
            "Accept-Tenant: uk",
            "Accept-Language: en-GB",
            "Authorization: Basic VGVjaFRlc3RBUEk6dXNlcjI=",
            "Host: public.je-apis.com"
    })
    @GET("/restaurants?q=E14")
    Observable<Example> getRestraurent();
}
