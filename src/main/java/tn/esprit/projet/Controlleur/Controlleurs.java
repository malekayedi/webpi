package tn.esprit.projet.Controlleur;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.Entity.*;
import tn.esprit.projet.Services.IService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/web")
@CrossOrigin
public class Controlleurs {
    IService iService;

    @GetMapping("/affichertoutMatch")
    public List<Matches> retrieveAllMatches() {
        return iService.retrieveAllMatches();
    }
    @GetMapping("/affichertoutNews")
    public List<News> retrieveAllNews() {
        return iService.retrieveAllNews();
    }
    @GetMapping("/affichertoutProducts")
    public List<Products> retrieveAllProducts(){
        return iService.retrieveAllProducts();
    }
    @GetMapping("/affichertoutUser")
    public List<User> retrieveAllUser(){
        return iService.retrieveAllUser();
    }
    @GetMapping("/affichertoutBooking")
    public List<Booking> retrieveAllBooking(){
        return iService.retrieveAllBooking();
    }
    @PostMapping("/ajouterUser")
    public User addUser(User f){
        return iService.addUser(f);
    }
    @PostMapping("/ajouterNews")
    public News addNews(News n){
        return iService.addNews(n);
    }
    @PostMapping("/ajouterMatch")
    public Matches addMatch(Matches f){
        return iService.addMatch(f);
    }
    @PostMapping("/ajouterBooking")
    public Booking addBooking(Booking f){
        return iService.addBooking(f);
    }
    @PostMapping("/ajouterProducts")
    public Products addProducts(Products f){
        return iService.addProducts(f);
    }
    @PutMapping("/modifierUser")
    public User updateUser(User f){
        return iService.updateUser(f);
    }
    @PutMapping("/modifierMatch")
    public Matches updateMatch(Matches f){
        return iService.updateMatch(f);
    }
    @PutMapping("/modifierBooking")
    public Booking updateFoyer(Booking f){
        return iService.updateFoyer(f);
    }
    @PutMapping("/modifierNews")
    public News updateNews(News f){
        return iService.updateNews(f);
    }
    @PutMapping("/modifierProducts")
    public Products updateFoyer(Products f){
        return iService.updateFoyer(f);
    }
    @GetMapping("/afficherUser/{idUser}")
    public User retrieveUser(@PathVariable("idUser") long idUser){
        return iService.retrieveUser(idUser);
    }
    @GetMapping("/afficherMatch/{idMatch}")
    public Matches retrieveMatch(@PathVariable("idMatch") long idMatch){
        return iService.retrieveMatch(idMatch);
    }

    @GetMapping("/afficherNews/{idNews}")
    public News retrieveNews(@PathVariable("idNews") long idNews){
        return iService.retrieveNews(idNews);
    }
    @GetMapping("/afficherBooking/{idBooking}")
    public Booking retrieveBooking(@PathVariable("idBooking") long idBooking){
        return iService.retrieveBooking(idBooking);
    }
    @GetMapping("/afficherProducts/{idProducts}")
    public Products retrieveProducts(@PathVariable("idProducts") long idProducts){
        return iService.retrieveProducts(idProducts);
    }
    @DeleteMapping("/supprimerUser/{idUser}")
    public void removeUser(@PathVariable("idUser") long idUser){
        iService.removeUser(idUser);
    }
    @DeleteMapping("/supprimerNews/{idNews}")
    public void removeNews(@PathVariable("idNews") long idNews){
        iService.removeNews(idNews);
    }
    @DeleteMapping("/supprimerMatch/{idMatch}")
    public void removeMatch(@PathVariable("idMatch") long idMatch){
        iService.removeMatch(idMatch);
    }
    @DeleteMapping("/supprimerProducts/{idProducts}")
    public void removeProducts(@PathVariable("idProducts") long idProducts){
        iService.removeProducts(idProducts);
    }
    @DeleteMapping("/supprimerBooking/{idBooking}")
    public void removeBooking(@PathVariable("idBooking") long idBooking){
        iService.removeBooking(idBooking);
    }
}
