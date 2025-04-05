//import java.io.*;
//import java.sql.Timestamp;
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class Test {
//
//    static class Cache{
//        String data;
//        Timestamp update;
//
//        public Cache(String data){
//            this.data=data;
//            this.update=new Timestamp(System.currentTimeMillis());
//        }
//    }
//
//    static Map<String,Cache> cache = new HashMap<>();
//
//    public static String getData(String cacheKey){
//        var entryVal = cache.get(cacheKey);
//        if(entryVal!=null && ){
//
//        }
//        else{
//            //make a db call
//            getDb();
//        }
//    }
//
//    //working cache which is going to db  -- older than one hour or no data
//    public static void main(String[] args) {
//        String cache1 = "userdata from cache";
//        String cache2 = "userdata outdated";
//
//    }
//}
