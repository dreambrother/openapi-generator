package controllers;

import java.util.Map;
import apimodels.Order;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", comments = "Generator version: 7.5.0-SNAPSHOT")
public class StoreApiControllerImp extends StoreApiControllerImpInterface {
    @Override
    public void deleteOrder(Http.Request request, String orderId)  {
        //Do your magic!!!
    }

    @Override
    public Map<String, Integer> getInventory(Http.Request request)  {
        //Do your magic!!!
        return new HashMap<String, Integer>();
    }

    @Override
    public Order getOrderById(Http.Request request,  @Min(1) @Max(5)Long orderId)  {
        //Do your magic!!!
        return new Order();
    }

    @Override
    public Order placeOrder(Http.Request request, Order body)  {
        //Do your magic!!!
        return new Order();
    }

}
