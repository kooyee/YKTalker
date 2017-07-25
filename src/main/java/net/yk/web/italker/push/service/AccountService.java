package net.yk.web.italker.push.service;

import net.yk.web.italker.push.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Administrator on 2017/6/19.
 */
@Path("/account")
public class AccountService {

    @GET
    @Path("/login")
    public String Get(){
        return "you get login";
    }
    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User Post(){
        User u=new User();
        u.setName("小妞");
        u.setSex(2);
        return u;
    }
}
