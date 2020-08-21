package com.example.shoppingHome.shoppingHome.entities.user;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = Registeruser.COLLECTION_NAME)
public class Registeruser {

    public static final String COLLECTION_NAME ="userRegister";
    public static final String COLUMN_CREATED_AT="createdAt";
    public static final String COLUMN_STATUS="status";
    public static final String COLUMN_MODIFIED_AT="modifiedAt";
    public static final String COLUMN_ID="_id";
    public static final String USERNAME="userName";
    public static final String PASSWORD="password";
    public static final String EMAIL="email";


    @Id
    @Field(COLUMN_ID)
    private ObjectId id;

    @Field(USERNAME)
    private String userName;

    @Field(PASSWORD)
    private String password;

    @Field(EMAIL)
    private String email;

    @Indexed
    @Field(COLUMN_CREATED_AT)


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdAt;

    @Indexed
    @Field(COLUMN_MODIFIED_AT)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date modifiedAt;

    @Field(COLUMN_STATUS)
    private String status;

    public static String getCollectionName() {
        return COLLECTION_NAME;
    }

    public static String getColumnCreatedAt() {
        return COLUMN_CREATED_AT;
    }

    public static String getColumnStatus() {
        return COLUMN_STATUS;
    }

    public static String getColumnModifiedAt() {
        return COLUMN_MODIFIED_AT;
    }

    public static String getColumnId() {
        return COLUMN_ID;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Registeruser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", status=" + status +
                '}';
    }
}
