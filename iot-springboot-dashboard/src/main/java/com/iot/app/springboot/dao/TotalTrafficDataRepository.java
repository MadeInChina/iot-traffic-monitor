package com.iot.app.springboot.dao;

import com.iot.app.springboot.dao.entity.TotalTrafficData;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * DAO class for total_traffic
 *
 * @author abaghel
 */
@Repository
public interface TotalTrafficDataRepository extends CassandraRepository<TotalTrafficData> {

    @Query("SELECT * FROM traffickeyspace.total_traffic WHERE recorddate = ?0 ALLOW FILTERING")
    Iterable<TotalTrafficData> findTrafficDataByDate(String date);
}
