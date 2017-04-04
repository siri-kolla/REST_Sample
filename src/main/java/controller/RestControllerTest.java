package controller;

import java.io.File;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RestControllerTest {

	//http://localhost:8080/RestTest
    @RequestMapping("/RestTest")
    String home() {
        return "Hello World!.....  Your calling the restful api";
    }

    @RequestMapping(value="/UploadFileTest")
    String uploadFileTest() {
        return "Uploading file.......";
    }


/*    //    @RequestMapping(value="/UploadFid", method=RequestMapping.Post)
    @RequestMapping(value="/UploadFid" , method = RequestMethod.POST)
    public @ResponseBody String handleFileUpload(
            @RequestParam(value="file", required=true) InputStream uploadedInputStream,
            @RequestParam(value="person" , required=true) FormDataContentDisposition person,
            @RequestParam(value="date", required=true) Date date) {
       try {
         Document document = new Document(file.getBytes(), file.getOriginalFilename(), date, person );
         getArchiveService().save(document);
         document.getMetadata();
         
    	   
    	   
         return "";
       } catch (Exception e) {
         // .. exception handling
       }*/
    
    
   @RequestMapping(value = "/uploadMultiFile", method = RequestMethod.POST)     
    public String submit(@RequestParam("fileName") File files, ModelMap modelMap) {
        modelMap.addAttribute("files", files);
        return "fileUploadView";
    }
 
    
    
}