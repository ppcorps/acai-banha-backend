package com.banhaacai.banhaacai.services;
import com.banhaacai.banhaacai.dto.OrderDTO;
import com.banhaacai.banhaacai.entities.Order;
import com.banhaacai.banhaacai.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).get();
        return new OrderDTO(order);

    }

    @Transactional(readOnly = true)
    public Page<OrderDTO> findAll(Pageable pageable) {
        Page<Order> result = repository.findAll(pageable);
        return result.map(x -> new OrderDTO(x));
    }

    @Transactional
    public OrderDTO insert(OrderDTO dto) {
        Order entity = new Order();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new OrderDTO(entity);
    }


    @Transactional
    public OrderDTO update(Long id, OrderDTO dto) {
        Order entity = repository.getReferenceById(id);
        copyDtoToEntity(dto, entity);
        return new OrderDTO(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void copyDtoToEntity(OrderDTO dto, Order entity) {
        entity.setId(dto.getId());
        entity.getOrderDate();
        entity.getOrderAmount();
        entity = repository.save(entity);

    }
}
