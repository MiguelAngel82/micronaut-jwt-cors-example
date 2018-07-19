package micronaut.jwt.cors.example.controllers

import groovy.transform.CompileStatic
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.security.Secured

import java.security.Principal

@CompileStatic
@Secured("isAuthenticated()")
@Controller("/user")
class HomeController {

    @Post("/")
    HttpResponse register(String username, String password){
        println("Username: $username - password: $password")
        HttpResponse.noContent()
    }
}
