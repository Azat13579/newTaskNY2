package ru.khaliullin.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.khaliullin.model.TableWordInH2DB;
import java.util.List;

@Repository
public interface TableWordInH2DBDAO extends CrudRepository<TableWordInH2DB, Long> {
    List<TableWordInH2DB> findAll();
}
