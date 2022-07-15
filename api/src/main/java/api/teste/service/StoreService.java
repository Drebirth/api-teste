package api.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.teste.entity.Store;
import api.teste.repository.StoreRepository;

@Service
public class StoreService {

    @Autowired
    private StoreRepository store;

    public StoreService(StoreRepository store){
        this.store = store;
    }

    public List<Store> getAll(){
        return store.findAll();
    }
    
    public Store post(Store s){
        return store.save(s);
    }
}
