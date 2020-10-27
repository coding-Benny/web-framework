package kr.ac.hansung.cse.csemall;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("offerDao")
public class OfferDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public int getRowCount() {
    	String sqlStatement = "select count(*) from offers";
    	return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
    }
}
