package com.dzhatdoev.emarket.repo;

import com.dzhatdoev.emarket.model.Desktop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopRepository extends CrudRepository<Desktop, Long> {

}
