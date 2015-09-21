package com.eligible.model;

import com.eligible.exception.APIConnectionException;
import com.eligible.exception.APIException;
import com.eligible.exception.AuthenticationException;
import com.eligible.exception.InvalidRequestException;
import com.eligible.net.APIResource;
import com.eligible.net.RequestMethod;
import com.eligible.net.RequestOptions;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class Payer extends APIResource {
    String payerId;
    List<String> names;
    String createdAt;
    String updatedAt;
    List<Endpoint> supportedEndpoints;

    public static Payer retrieve(String id)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        return retrieve(id, null);
    }

    public static List<Payer> all()
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        return all(null);
    }

    public static List<SearchOptions> searchOptions()
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        return searchOptions((RequestOptions) null);
    }

    public static SearchOptions searchOptions(String payerId)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        return searchOptions(payerId, null);
    }

    public static Payer retrieve(String id, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        return request(RequestMethod.GET, instanceURL(Payer.class, id), null, Payer.class, options);
    }

    public static List<Payer> all(RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        Type listType = new TypeToken<List<Payer>>(){}.getType();
        return request(RequestMethod.GET, classURL(Payer.class), null, listType, options);
    }

    public static List<SearchOptions> searchOptions(RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        return SearchOptions.all(options);
    }

    public static SearchOptions searchOptions(String payerId, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, APIException {
        return SearchOptions.retrieve(payerId, options);
    }


    public String getPayerId() {
        return payerId;
    }

    public String getId() {
        return getPayerId();
    }

    public List<String> getNames() {
        return names;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public List<Endpoint> getSupportedEndpoints() {
        return supportedEndpoints;
    }



    public static class SearchOptions extends APIResource {
        String payerId;
        List<SearchOptionList> searchOptions;

        public static List<SearchOptions> all()
                throws AuthenticationException, InvalidRequestException,
                APIConnectionException, APIException {
            return all(null);
        }

        public static SearchOptions retrieve(String payerId)
                throws AuthenticationException, InvalidRequestException,
                APIConnectionException, APIException {
            return retrieve(payerId, null);
        }

        public static List<SearchOptions> all(RequestOptions options)
                throws AuthenticationException, InvalidRequestException,
                APIConnectionException, APIException {
            Type listType = new TypeToken<List<SearchOptions>>(){}.getType();
            return request(RequestMethod.GET, classURL(SearchOptions.class), null, listType, options);
        }

        public static SearchOptions retrieve(String payerId, RequestOptions options)
                throws AuthenticationException, InvalidRequestException,
                APIConnectionException, APIException {
            return request(RequestMethod.GET, instanceURL(SearchOptions.class, payerId), null, SearchOptions.class, options);
        }

        protected static String classURL(Class<?> clazz) {
            return String.format("%s/%s", APIResource.classURL(Payer.class), className(clazz));
        }

        protected static String instanceURL(Class<?> clazz, String id) throws InvalidRequestException {
            return String.format("%s/%s", APIResource.instanceURL(Payer.class, id), className(clazz));
        }


        public String getPayerId() {
            return payerId;
        }

        public String getId() {
            return getPayerId();
        }

        public List<SearchOptionList> getSearchOptions() {
            return searchOptions;
        }

    }

    public interface SearchOptionList extends List<String> {

    }

}