package com.example.shoppingHome.shoppingHome.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class Utils {

    private static String key = "shoppingNew";

    public void createJwt()
    {
        Algorithm algorithmHS = Algorithm.HMAC256(key.getBytes());


    }

//    public static String createJWT(UserModel user) {
//
//        Algorithm algorithm;
//        String token = null;
//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.MONTH, 2);
//        try {
//            algorithm = Algorithm.HMAC256(SECRET.getBytes());
//            token = JWT.create().withIssuer(JWT_ISSUER).withClaim(USER_ID, user.getId())
//                    .withClaim(USER_EMAIL, user.getUserEmail()).withClaim(FIRST_NAME, user.getUserFname())
//                    .withClaim(LAST_NAME, user.getUserLname())
//                    .withClaim(USER_ROLE, user.getRoleId()).withExpiresAt(cal.getTime()).sign(algorithm);
//        } catch (IllegalArgumentException e) {
//            logger.error("Exception in JWT creation", e);
//            return null;
//        }
//        return token;
//    }
//
//    /**
//     * This method authenticates an access token. <br/>
//     * It checks for its expiration time as well as its authenticity.
//     *
//     * @param authToken
//     *            String authToken
//     * @return Boolean
//     */
//    public static Boolean authenticateToken(String token) {
//
//        DecodedJWT jwt = JWT.decode(token);
//
//        Map<String, Claim> claims = jwt.getClaims();
//        if (claims == null || claims.isEmpty()) {
//            return false;
//        }
//        Calendar cal = Calendar.getInstance();
//        if (JWT_ISSUER.equals(jwt.getIssuer()) && jwt.getExpiresAt().compareTo(cal.getTime()) > 0) {
//            return true;
//        }
//        logger.info("Access token authentication failed");
//
//        return false;
//    }
}
