package ecom.service;

import ecom.model.Checkout;
import ecom.repository.CheckOutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckOutService {
    @Autowired
    CheckOutRepository checkOutRepository;

    public void saveOrder(Checkout checkout){
        checkOutRepository.save(checkout);
    }

    public Optional<Checkout> getOrderById(int id){
        return checkOutRepository.findById(id);
    }

    public List<Checkout> getAllOrders(){
        return checkOutRepository.findAll();
    }
}
