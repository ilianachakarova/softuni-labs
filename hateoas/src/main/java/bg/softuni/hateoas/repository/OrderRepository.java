package bg.softuni.hateoas.repository;

import bg.softuni.hateoas.model.Course;
import bg.softuni.hateoas.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}