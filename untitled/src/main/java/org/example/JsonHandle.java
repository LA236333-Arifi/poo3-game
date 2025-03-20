package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class JsonHandle
{
    public static void ReadJson()
    {
        Entity obj = new Entity("New Entity");
        ObjectMapper mapper = new ObjectMapper();

        try
        {
            String jsonString = mapper.writeValueAsString(obj);
            System.out.println("JSON Representation: " + jsonString);

            Document document = Document.parse(jsonString);

            try (var mongoClient = MongoClients.create("mongodb://localhost:27017"))
            {
                MongoDatabase database = mongoClient.getDatabase("testDatabase");

                MongoCollection<Document> collection = database.getCollection("testmarh");

                for (Document doc : collection.find()) {
                    // Print each document in the collection
                    System.out.println(doc.toJson());
                }
                // Insert the document into the collection
                collection.insertOne(document);

                System.out.println("Document inserted successfully!");
            }
        }
        catch (JsonProcessingException e)
        {
            throw new RuntimeException(e);
        }
    }
    public static void WriteJson()
    {

    }
}
