package com.toolmarket.toolmarket.domain.repository;

import com.toolmarket.toolmarket.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
