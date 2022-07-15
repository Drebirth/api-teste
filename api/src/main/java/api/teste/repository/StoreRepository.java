package api.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import api.teste.entity.Store;

public interface StoreRepository extends JpaRepository<Store, Long> {
    
}
