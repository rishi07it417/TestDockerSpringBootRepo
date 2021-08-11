package com.test.jdbctemplate.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.test.jdbctemplate.modal.UniMaster;
import com.test.jdbctemplate.utils.TestJDBCTemplateUtils;

@Service
public class JDBCServices {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<UniMaster> getDivisions() {
		SqlRowSet rs = jdbctemplate.queryForRowSet(TestJDBCTemplateUtils.GET_UNI);
		List<UniMaster> division = new ArrayList<UniMaster>();
		UniMaster div;
		while(rs.next()){
			div = new UniMaster();
			div.setId(rs.getInt("ID"));
			div.setCollege(rs.getString("COLLEGE"));
			div.setStudent(rs.getString("STUDENT"));
			div.setStu_id(rs.getString("STU_ID"));
			division.add(div);
		}
				
		return division;
	}
	
}
