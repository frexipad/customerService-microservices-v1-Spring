package com.frexdel.customer.mapstruct;

import com.frexdel.customer.entity.Customer;

import java.util.List;
import java.util.UUID;

public interface IEntityMapper<D, E> {

   D toDto(E e);

   E toEntity(D d);

   List<D> toDto(List<E> eList);

   List<E> toEntity(List<D> dList);

   Customer fromId(UUID id);

}
