package com.example.shoppingHome.shoppingHome.constants;

public  class HttpConstants {

    public static final class HttpCodes {
       public static  final Integer  Success = 200;
        public static  final Integer  failed = 100;
        public static  final Integer  dbError = 500;
    }


    public static final class HttpMessages {
        public static  final String  Success = "Process Successful";
        public static  final String  failed = "Failed Process";


    }

    public static final class UserExistMessages{
        public static  final String  emailExists = "Email Already Exist Please Try Another";
        public static  final String  userNameExists = "UserName Already Exist Please Try Another";
        public static  final String  userNameValid = "userName is Valid";

    }

    public static final class UserErrorMessages{
        public static  final String  UserNotExist = "User Does Not Exist Please Try Different UserName";
    }
}
