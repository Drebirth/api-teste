package api.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import api.teste.entity.Store;
import api.teste.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
    
    @Autowired
    private StoreService store;

    public StoreController(StoreService store){
        this.store = store;
    }

    @GetMapping("/")
    public List<Store> getAll(){
        return store.getAll();
    }

    @PostMapping("/")
    public void post(@RequestBody Store s){
        store.post(s);
    }
}
