package com.cbfacademy;

import java.util.List;

public class FileExtension {
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename == "") {
            throw new FilenameException("File shouldn't be null or empty");
        }
        return filename.endsWith(".java");
    }

//   public Map<String, int> map(List<String> filenames){

// try {
    
// } catch (Exception e) {
//     // TODO: handle exception
// }
//     }
//     return map
}
