package com.starwars;

import appdata.YodaData;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Yoda implements RequestHandler<YodaData, String> {
        /*
          Method to handle AWS Lambda requests
        */
        @Override
        //     return-type  method-name(object-with-request-data, aws-lambda-context-object)
        public String  handleRequest(YodaData yodaData,  Context context) {
                // an aws-lambda-context-object supplies methods and properties that provide
                //    information about the invocation, function, and execution environment.

                System.out.println("Patience you must have my young Padawan");

                // Use/Access the data in the object we were sent
                System.out.println("Yoda, here!");
                System.out.println("I see the number you sent was: " + yodaData.getNumber());
                System.out.println("I see the planet you sent was: " + yodaData.getPlanet());

                return "Do or do not. There is no try";
        }
}
