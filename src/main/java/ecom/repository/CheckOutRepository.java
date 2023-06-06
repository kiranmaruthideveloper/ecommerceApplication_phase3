package ecom.repository;

import ecom.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckOutRepository extends JpaRepository<Checkout, Integer> {

}
