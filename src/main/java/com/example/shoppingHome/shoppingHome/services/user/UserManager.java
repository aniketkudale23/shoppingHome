package com.example.shoppingHome.shoppingHome.services.user;

import com.example.shoppingHome.shoppingHome.constants.HttpConstants;
import com.example.shoppingHome.shoppingHome.dao.user.UserDAO;
import com.example.shoppingHome.shoppingHome.dto.User;
import com.example.shoppingHome.shoppingHome.entities.user.Registeruser;
import com.example.shoppingHome.shoppingHome.requests.user.UserEmail;
import com.example.shoppingHome.shoppingHome.response.RegisterResponse;
import com.example.shoppingHome.shoppingHome.response.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserManager {

    @Autowired
    UserDAO userDao;

    public RegisterResponse saveUser(Registeruser user) {

        try {
            List<Registeruser> val = userDao.findByEmailAndUserName(user.getEmail(), user.getUserName());
            if (val.size() > 0) {

                return setResponse("user Already Exist");

            } else {
                Registeruser user_ = userDao.save(user);
                return ResponseRegister(user_);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return setResponse("Register Process Failed Please Try Again Later");
        }

    }

    public RegisterResponse ResponseRegister(Registeruser user) {
        RegisterResponse response = new RegisterResponse();
        response.setId(user.getId());
        response.setEmail(user.getEmail());
        response.setName(user.getUserName());
        response.setResponse(HttpConstants.HttpCodes.Success);
        response.setMessage(HttpConstants.HttpMessages.Success);

        return response;
    }

    public RegisterResponse setResponse(String message) {
        RegisterResponse response = new RegisterResponse();
        response.setResponse(HttpConstants.HttpCodes.failed);
        response.setMessage(message);
        return response;
    }

    public RegisterResponse emailExist(UserEmail userEmail) {
        List<Registeruser> val = userDao.findByEmail(userEmail.getEmail());
        if (val.size() > 0) {

            return setResponse("user Already Exist");

        } else {

            RegisterResponse response = new RegisterResponse();
            response.setResponse(HttpConstants.HttpCodes.Success);
            response.setMessage(HttpConstants.UserExistMessages.emailExists);
            return response;
        }

    }

    public ResponseMessage existByUserNamePassword(String userName, String password)
    {
        List<Registeruser> val =  userDao.findByUserNameAndPassword(userName,password);
        ResponseMessage response = new ResponseMessage();
        if(val.size() > 0)
        {
            response.setResponse(HttpConstants.HttpCodes.Success);
            response.setMessage(HttpConstants.HttpMessages.Success);

        }else{

            response.setResponse(HttpConstants.HttpCodes.failed);
            response.setMessage(HttpConstants.UserErrorMessages.UserNotExist);
        }
        return response;
    }


    public ResponseMessage ExistByUserName(String userName) {
        List<Registeruser> exits =  userDao.findByUserName(userName);
        ResponseMessage response = new ResponseMessage();
        if (exits.size() > 0) {


                    response.setResponse(HttpConstants.HttpCodes.failed);
                    response.setMessage(HttpConstants.UserExistMessages.userNameExists);

        } else {

            response.setResponse(HttpConstants.HttpCodes.Success);
            response.setMessage(HttpConstants.UserExistMessages.userNameValid);

        }
        return response;

    }

}
