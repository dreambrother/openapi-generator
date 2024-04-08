/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.oprg
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;
import org.openapitools.client.api.BodyApi;
import org.openapitools.client.api.FormApi;
import org.openapitools.client.api.QueryApi;
import org.openapitools.client.model.Category;
import org.openapitools.client.model.DataQuery;
import org.openapitools.client.model.DefaultValue;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.Query;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.client.model.TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter;
import org.openapitools.client.model.TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * API tests for QueryApi
 */
public class CustomTest {

   private final QueryApi api = new QueryApi();
   private final BodyApi bodyApi = new BodyApi();
   private final FormApi formApi = new FormApi();

   /**
    * Test body parameter(s)
    * <p>
    * Test body parameter(s)
    *
    * @throws ApiException if the Api call fails
    */
   @Test
   public void testEchoBodyPet() throws ApiException {
      final Pet queryObject = new Pet().id( 12345L ).name( "Hello World" ).
            photoUrls( Arrays.asList( new String[] { "http://a.com", "http://b.com" } ) ).category( new Category().id( 987L ).name( "new category" ) );

      final Pet p = bodyApi.testEchoBodyPet( queryObject );
      Assert.assertNotNull( p );
      Assert.assertEquals( "Hello World", p.getName() );
      Assert.assertEquals( Long.valueOf( 12345L ), p.getId() );

      // response is empty body
      final Pet p2 = bodyApi.testEchoBodyPet( null );
      Assert.assertNull( p2 );
   }

   /**
    * Test allOf body parameter(s)
    * <p>
    * Test allOf body parameter(s)
    *
    * @throws ApiException if the Api call fails
    */
   @Test
   public void testEchoBodyAllOfPet() throws ApiException {
      final Pet queryObject = new Pet().id( 12345L ).name( "Hello World" ).
            photoUrls( Arrays.asList( new String[] { "http://a.com", "http://b.com" } ) ).category( new Category().id( 987L ).name( "new category" ) );

      final Pet p = bodyApi.testEchoBodyAllOfPet( queryObject );
      Assert.assertNotNull( p );
      Assert.assertEquals( "Hello World", p.getName() );
      Assert.assertEquals( Long.valueOf( 12345L ), p.getId() );

      // response is empty body
      final Pet p2 = bodyApi.testEchoBodyPet( null );
      Assert.assertNull( p2 );
   }

   /**
    * Test query parameter(s)
    * <p>
    * Test query parameter(s)
    *
    * @throws ApiException if the Api call fails
    */
   @Test
   public void testQueryStyleFormExplodeTrueObjectTest() throws ApiException {
      final Pet queryObject = new Pet().id( 12345L ).name( "Hello World" ).
            photoUrls( Arrays.asList( new String[] { "http://a.com", "http://b.com" } ) ).category( new Category().id( 987L ).name( "new category" ) );

      final String response = api.testQueryStyleFormExplodeTrueObject( queryObject );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );
      Assert.assertEquals(
            "/query/style_form/explode_true/object?id=12345&name=Hello%20World&category=class%20Category%20%7B%0A%20%20%20%20id%3A%20987%0A%20%20%20%20name%3A%20new%20category%0A%7D&photoUrls=http%3A%2F%2Fa.com&photoUrls=http%3A%2F%2Fb.com",
            p.path );
   }

   /**
    * Test query parameter(s)
    * <p>
    * Test query parameter(s)
    *
    * @throws ApiException if the Api call fails
    */
   @Test
   public void testQueryStyleFormExplodeTrueObjectAllOfTest() throws ApiException {
      final DataQuery queryObject = new DataQuery().text( "Hello World" );
      queryObject.setId( 3487L );
      queryObject.setOutcomes( Arrays.asList( Query.OutcomesEnum.SKIPPED, Query.OutcomesEnum.FAILURE ) );

      final String response = api.testQueryStyleFormExplodeTrueObjectAllOf( queryObject );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );
      Assert.assertEquals( "/query/style_form/explode_true/object/allOf?id=3487&outcomes=SKIPPED&outcomes=FAILURE&text=Hello%20World", p.path );
   }

   /**
    * Test query parameter(s)
    * <p>
    * Test query parameter(s)
    *
    * @throws ApiException if the Api call fails
    */
   @Test
   public void testQueryStyleDeepObjectExplodeTrueObject() throws ApiException {
      final Pet queryObject = new Pet().id( 12345L ).name( "Hello World" ).
            photoUrls( Arrays.asList( new String[] { "http://a.com", "http://b.com" } ) ).category( new Category().id( 987L ).name( "new category" ) );

      Assert.assertEquals(
            "query_object[id]=12345&query_object[name]=Hello%20World&query_object[category][id]=987&query_object[category][name]=new%20category&query_object[photoUrls][0]=http%3A%2F%2Fa.com&query_object[photoUrls][1]=http%3A%2F%2Fb.com",
            queryObject.toUrlQueryString( "query_object" ) );

      final String response = api.testQueryStyleDeepObjectExplodeTrueObject( queryObject );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );
      Assert.assertEquals(
            "/query/style_deepObject/explode_true/object?query_object[id]=12345&query_object[name]=Hello%20World&query_object[category][id]=987&query_object[category][name]=new%20category&query_object[photoUrls][0]=http%3A%2F%2Fa.com&query_object[photoUrls][1]=http%3A%2F%2Fb.com",
            p.path );
   }

   /**
    * Test query parameter(s)
    * <p>
    * Test query parameter(s)
    *
    * @throws ApiException if the Api call fails
    */
   @Test
   public void testQueryStyleDeepObjectExplodeTrueObjectAllOf() throws ApiException {
      final TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter queryObject = new TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter().id(
                  12345L ).name( "Hello World" ).
            color( "red" ).size( "small" );

      Assert.assertEquals( "query_object[size]=small&query_object[color]=red&query_object[id]=12345&query_object[name]=Hello%20World",
            queryObject.toUrlQueryString( "query_object" ) );

      final String response = api.testQueryStyleDeepObjectExplodeTrueObjectAllOf( queryObject );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );
      Assert.assertEquals(
            "/query/style_deepObject/explode_true/object/allOf?query_object[size]=small&query_object[color]=red&query_object[id]=12345&query_object[name]=Hello%20World",
            p.path );
   }

   /**
    * Test query parameter(s)
    * <p>
    * Test query parameter(s)
    *
    * @throws ApiException if the Api call fails
    */
   @Test
   public void testQueryStyleFormExplodeTrueArrayString() throws ApiException {
      final TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter q = new TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter()
            .values( Arrays.asList( new String[] { "hello world 1", "hello world 2" } ) );

      final String response = api.testQueryStyleFormExplodeTrueArrayString( q );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );
      Assert.assertEquals( "/query/style_form/explode_true/array_string?values=hello%20world%201&values=hello%20world%202", p.path );
   }

   @Test
   public void testArrayDefaultValues() {
      // test array default values
      final DefaultValue d = new DefaultValue();
      Assert.assertEquals( d.getArrayStringEnumRefDefault().size(), 2 );
      Assert.assertEquals( d.getArrayStringEnumRefDefault().get( 0 ), StringEnumRef.SUCCESS );
      Assert.assertEquals( d.getArrayStringEnumRefDefault().get( 1 ), StringEnumRef.FAILURE );

      Assert.assertEquals( d.getArrayStringEnumDefault().size(), 2 );
      Assert.assertEquals( d.getArrayStringEnumDefault().get( 0 ), DefaultValue.ArrayStringEnumDefaultEnum.SUCCESS );
      Assert.assertEquals( d.getArrayStringEnumDefault().get( 1 ), DefaultValue.ArrayStringEnumDefaultEnum.FAILURE );

      Assert.assertEquals( d.getArrayStringDefault().size(), 2 );
      Assert.assertEquals( d.getArrayStringDefault().get( 0 ), "failure" );
      Assert.assertEquals( d.getArrayStringDefault().get( 1 ), "skipped" );

      Assert.assertEquals( d.getArrayIntegerDefault().size(), 2 );
      Assert.assertEquals( d.getArrayIntegerDefault().get( 0 ), Integer.valueOf( 1 ) );
      Assert.assertEquals( d.getArrayIntegerDefault().get( 1 ), Integer.valueOf( 3 ) );

      Assert.assertNull( d.getArrayStringNullable() );
      Assert.assertNull( d.getArrayStringExtensionNullable() );
      Assert.assertEquals( d.getArrayString(), List.of() );

      // test addItem
      d.addArrayStringEnumDefaultItem( DefaultValue.ArrayStringEnumDefaultEnum.UNCLASSIFIED );
      Assert.assertEquals( d.getArrayStringEnumDefault().size(), 3 );
      Assert.assertEquals( d.getArrayStringEnumDefault().get( 2 ), DefaultValue.ArrayStringEnumDefaultEnum.UNCLASSIFIED );

      d.addArrayStringDefaultItem( "new item" );
      Assert.assertEquals( d.getArrayStringDefault().size(), 3 );
      Assert.assertEquals( d.getArrayStringDefault().get( 2 ), "new item" );

      d.addArrayIntegerDefaultItem( 5 );
      Assert.assertEquals( d.getArrayIntegerDefault().size(), 3 );
      Assert.assertEquals( d.getArrayIntegerDefault().get( 2 ), Integer.valueOf( 5 ) );
   }

   @Test
   public void testDefaultValuesSerializationWithEmptyPayload() throws IOException {
      final ApiClient apiClient = new ApiClient();

      final String str = "{}";

      final DefaultValue d = apiClient.getObjectMapper().readValue( str, new TypeReference<>() {
      } );

      Assert.assertEquals( d.getArrayStringEnumRefDefault().size(), 2 );
      Assert.assertEquals( d.getArrayStringEnumRefDefault().get( 0 ), StringEnumRef.SUCCESS );
      Assert.assertEquals( d.getArrayStringEnumRefDefault().get( 1 ), StringEnumRef.FAILURE );

      Assert.assertEquals( d.getArrayStringEnumDefault().size(), 2 );
      Assert.assertEquals( d.getArrayStringEnumDefault().get( 0 ), DefaultValue.ArrayStringEnumDefaultEnum.SUCCESS );
      Assert.assertEquals( d.getArrayStringEnumDefault().get( 1 ), DefaultValue.ArrayStringEnumDefaultEnum.FAILURE );

      Assert.assertEquals( d.getArrayStringDefault().size(), 2 );
      Assert.assertEquals( d.getArrayStringDefault().get( 0 ), "failure" );
      Assert.assertEquals( d.getArrayStringDefault().get( 1 ), "skipped" );

      Assert.assertEquals( d.getArrayIntegerDefault().size(), 2 );
      Assert.assertEquals( d.getArrayIntegerDefault().get( 0 ), Integer.valueOf( 1 ) );
      Assert.assertEquals( d.getArrayIntegerDefault().get( 1 ), Integer.valueOf( 3 ) );

      Assert.assertNull( d.getArrayStringNullable() );
      Assert.assertNull( d.getArrayStringExtensionNullable() );
      Assert.assertEquals( d.getArrayString(), List.of() );

      Assert.assertEquals( apiClient.getObjectMapper().writeValueAsString( d ),
            "{\"array_string_enum_ref_default\":[\"success\",\"failure\"],\"array_string_enum_default\":[\"success\",\"failure\"],\"array_string_default\":[\"failure\",\"skipped\"],\"array_integer_default\":[1,3],\"array_string\":[]}" );
   }

   @Test
   public void testDefaultValuesSerializationWithJSONString() throws IOException {
      final ApiClient apiClient = new ApiClient();

      final String str = "{ \"array_string_enum_ref_default\": [\"unclassified\"], \"array_string_enum_default\": [\"unclassified\"], \"array_string_default\": [\"failure\"] }";

      final DefaultValue d = apiClient.getObjectMapper().readValue( str, new TypeReference<>() {
      } );

      Assert.assertEquals( d.getArrayStringEnumRefDefault().size(), 1 );
      Assert.assertEquals( d.getArrayStringEnumRefDefault().get( 0 ), StringEnumRef.UNCLASSIFIED );

      Assert.assertEquals( d.getArrayStringEnumDefault().size(), 1 );
      Assert.assertEquals( d.getArrayStringEnumDefault().get( 0 ), DefaultValue.ArrayStringEnumDefaultEnum.UNCLASSIFIED );

      Assert.assertEquals( d.getArrayStringDefault().size(), 1 );
      Assert.assertEquals( d.getArrayStringDefault().get( 0 ), "failure" );

      Assert.assertEquals( d.getArrayIntegerDefault().size(), 2 );
      Assert.assertEquals( d.getArrayIntegerDefault().get( 0 ), Integer.valueOf( 1 ) );
      Assert.assertEquals( d.getArrayIntegerDefault().get( 1 ), Integer.valueOf( 3 ) );

      Assert.assertNull( d.getArrayStringNullable() );
      Assert.assertNull( d.getArrayStringExtensionNullable() );
      Assert.assertEquals( d.getArrayString(), List.of() );

      Assert.assertEquals( apiClient.getObjectMapper().writeValueAsString( d ),
            "{\"array_string_enum_ref_default\":[\"unclassified\"],\"array_string_enum_default\":[\"unclassified\"],\"array_string_default\":[\"failure\"],\"array_integer_default\":[1,3],\"array_string\":[]}" );
   }

   @Test
   public void testDefaultValuesSerializationWithIncorrectDefaultValues() throws IOException {
      final ApiClient apiClient = new ApiClient();

      final String str = "{ \"array_string_enum_default\": [\"invalid\"] }";

      try {
         final DefaultValue d = apiClient.getObjectMapper().readValue( str, new TypeReference<>() {
         } );
         Assert.assertTrue( false ); // the test should not reach this line
      } catch ( final com.fasterxml.jackson.databind.exc.ValueInstantiationException e ) {
         Assert.assertEquals( e.getMessage(),
               "Cannot construct instance of `org.openapitools.client.model.DefaultValue$ArrayStringEnumDefaultEnum`, problem: Unexpected value 'invalid'\n" +
                     " at [Source: (String)\"{ \"array_string_enum_default\": [\"invalid\"] }\"; line: 1, column: 33] (through reference chain: org.openapitools.client.model.DefaultValue[\"array_string_enum_default\"]->java.util.ArrayList[0])" );
      }
   }

   /**
    * Test form parameter(s)
    *
    * Test form parameter(s)
    *
    * @throws ApiException
    *          if the Api call fails
    */
   @Test
   public void testFormIntegerBooleanStringTest() throws ApiException {
      final Integer integerForm = 1337;
      final Boolean booleanForm = true;
      final String stringForm = "Hello World";
      final String response = formApi.testFormIntegerBooleanString( integerForm, booleanForm, stringForm );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );
      Assert.assertEquals( "/form/integer/boolean/string", p.path );
      Assert.assertEquals( "3b\ninteger_form=1337&boolean_form=true&string_form=Hello+World\n0\n\n", p.body );
   }

   @Test
   public void testFormOneOf() throws ApiException {
      final String form1 = "form1_example"; // String |
      final Integer form2 = 56; // Integer |
      final String form3 = "form3  example"; // String |
      final Boolean form4 = true;
      final String response = formApi.testFormOneof( form1, form2, form3, form4, null, null );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );
      Assert.assertEquals( "/form/oneof", p.path );
      Assert.assertEquals( "3c\nform1=form1_example&form2=56&form3=form3++example&form4=true\n0\n\n", p.body );
   }

   @Test
   public void testBodyMultipartFormdataArrayOfBinary() throws ApiException {
      final File file1 = Objects.requireNonNull( getFile( "Hello" ) );
      final File file2 = Objects.requireNonNull( getFile( "World" ) );

      final String response = bodyApi.testBodyMultipartFormdataArrayOfBinary( List.of( file1, file2 ) );
      final org.openapitools.client.EchoServerResponseParser p = new org.openapitools.client.EchoServerResponseParser( response );

      Assert.assertEquals( "/body/application/octetstream/array_of_binary", p.path );

      Assert.assertTrue( p.body.contains( file1.getName() ) );
      Assert.assertTrue( p.body.contains( "Hello" ) );
      Assert.assertTrue( p.body.contains( file2.getName() ) );
      Assert.assertTrue( p.body.contains( "World" ) );
   }

   private File getFile( final String content ) {
      try {
         final File tempFile = Files.createTempFile( "tempFile", ".txt" ).toFile();
         final BufferedWriter writer = new BufferedWriter( new FileWriter( tempFile ) );
         writer.write( content );
         writer.close();

         return tempFile;
      } catch ( final IOException e ) {
         return null;
      }
   }
}
