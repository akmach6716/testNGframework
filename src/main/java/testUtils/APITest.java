package testUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class APITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String tallianceExportId = "5d19cf0323d8aa6e1c53508b";
	        String api_url = "http://localhost:8080/";
	        CloseableHttpClient httpClient = HttpClientBuilder.create()
	                .build();
	        try {

	            //Start API
	            String sbody = "{\n" +
	                    "\t\"organization\":\"Oriane\",\n" +
	                    "\t\"email\":\"admin@oriane.com\",\n" +
	                    "\t\"password\":\"password1!\",\n" +
	                    "\t\"provider\":\"Oriane\",\n" +
	                    "\t\"withRelationships\":true,\n" +
	                    "\t\"nbEntities\": 3\n" +
	                    "}";

	            HttpPost httpPost = new HttpPost(api_url+"/export/start");

	            StringEntity entity = new StringEntity(sbody);
	            httpPost.setEntity(entity);
	            httpPost.setHeader("Accept", "application/json");
	            httpPost.setHeader("Content-type", "application/json");

	            CloseableHttpResponse response = httpClient.execute(httpPost);
	            HttpEntity responseEntity = response.getEntity();
	            String responseString = EntityUtils.toString(responseEntity, "UTF-8");
	            JSONObject myObject = new JSONObject(responseString);
	            final String exportId = myObject.getString("exportId");

	            /// Start Uploading
	            List<File> files = listFilesForFolder(new File("E:\\data\\Investment 1 data\\Investment 1 data"));
	            for (File filetemp:files) {
	                CloseableHttpClient client = HttpClientBuilder.create()
	                        .build();
	                byte[] file = readBytesFromFile(filetemp.getPath());
	                HttpEntity requestEntity =
	                        MultipartEntityBuilder.create()
	                                .addBinaryBody("file", file, ContentType.APPLICATION_JSON, filetemp.getName())
//	                        .addBinaryBody("entity_21", new File("src/test/resources/datasheets/data/" + file))
	                                .build();
	                HttpPost post =
	                        new HttpPost(api_url + "export/" +
	                                exportId +
	                                "/upload");
	                post.setEntity(requestEntity);
	                CloseableHttpResponse exportResponse = httpClient.execute(post);
	                printResponse(exportResponse);
	                exportResponse.close();
	                client.close();
	            }


	            // End Call ::
	            String ebody = "{\n" +
	                    "\t\"email\":\"admin@oriane.com\",\n" +
	                    "\t\"password\":\"password1!\"" +
	                    "}";

	            HttpPost ehttpPost =  new HttpPost(api_url + "export/" +
	                    exportId +
	                    "/end");
	            StringEntity eentity = new StringEntity(ebody);
	            ehttpPost.setEntity(eentity);
	            ehttpPost.setHeader("Accept", "application/json");
	            ehttpPost.setHeader("Content-type", "application/json");

	            CloseableHttpResponse eresponse = httpClient.execute(ehttpPost);
	            System.out.println("END CAL ");
	            printResponse(eresponse);
	            httpClient.close();
	        } catch (Exception e) {
	            e.getStackTrace();
	        }
	    }
	    private static List<File> listFilesForFolder(final File folder) {
	        List<File> files = new ArrayList<File>();
	        for (final File fileEntry : folder.listFiles()) {
	            if (fileEntry.isDirectory()) {
	                listFilesForFolder(fileEntry);
	            } else {
	                files.add(fileEntry);
	               // System.out.println(fileEntry.getName()+" path "+fileEntry.getPath());
	            }
	        }
	        return files;
	    }
	    private static byte[] readBytesFromFile(String filePath) {
	        FileInputStream fileInputStream = null;
	        byte[] bytesArray = null;
	        try {
	            File file = new File(filePath);
	            bytesArray = new byte[(int) file.length()];
	            //read file into bytes[]
	            fileInputStream = new FileInputStream(file);
	            fileInputStream.read(bytesArray);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (fileInputStream != null) {
	                try {
	                    fileInputStream.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return bytesArray;
	    }
	    public static void printResponse(CloseableHttpResponse response) throws IOException {
	        System.out.println("start status "+response.getStatusLine().getStatusCode());
	        HttpEntity responseEntity = response.getEntity();
	        String responseString = EntityUtils.toString(responseEntity, "UTF-8");
	        System.out.println(responseString);
	    }
	}


