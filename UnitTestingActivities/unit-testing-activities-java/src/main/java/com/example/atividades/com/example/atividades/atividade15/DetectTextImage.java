package com.example.atividades.atividade15;

/**
*  To run this code example, ensure that you perform the Prerequisites as stated in the Amazon Rekognition Guide:
*  https://docs.aws.amazon.com/rekognition/latest/dg/video-analyzing-with-sqs.html
*
* Also, ensure that set up your development environment, including your credentials.
*
* For information, see this documentation topic:
*
* https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html
*/

/**
 * Link for the code example
 * https://docs.aws.amazon.com/rekognition/latest/dg/text-detecting-text-procedure.html
*/

//snippet-start:[rekognition.java2.detect_text.import]
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.rekognition.RekognitionClient;
import software.amazon.awssdk.services.rekognition.model.DetectTextRequest;
import software.amazon.awssdk.services.rekognition.model.Image;
import software.amazon.awssdk.services.rekognition.model.DetectTextResponse;
import software.amazon.awssdk.services.rekognition.model.TextDetection;
import software.amazon.awssdk.services.rekognition.model.RekognitionException;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
//snippet-end:[rekognition.java2.detect_text.import]

/**
* Before running this Java V2 code example, set up your development environment, including your credentials.
*
* For more information, see the following documentation topic:
*
* https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/get-started.html
*/

import software.amazon.awssdk.services.rekognition.RekognitionClient;

public class DetectTextImage {

    String sourceImage;
    Region region;
    RekognitionClient rekClient;

    // Constructor with parameters
    public DetectTextImage(String sourceImage, RekognitionClient rekClient) {
        this.sourceImage = sourceImage;
        this.rekClient = rekClient;
        this.region = Region.US_WEST_2; // Set default region
    }

    // Default constructor
    public DetectTextImage() {
        this.sourceImage = "data/img-example-for-aws-task.jpg"; // Default image path
        this.region = Region.US_WEST_2; // Default region
        this.rekClient = RekognitionClient.builder().region(region).build(); // Default RekognitionClient
    }

    // Method to detect text labels
    public void detectTextLabels(String resultFilePath) {
        // Implementation for detecting text labels
    }

    // Method to save results to a text file
    public void saveResultToTextFile(List<TextDetection> textCollection, String fileName) throws IOException {
        // Implementation for saving results to a text file
    }
}
