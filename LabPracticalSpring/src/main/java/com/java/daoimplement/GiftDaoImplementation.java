package com.java.daoimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.java.daointerface.GiftDaoInterface;
import com.java.entity.Gift;

@Repository
public class GiftDaoImplementation implements GiftDaoInterface {

	@Autowired
	JdbcTemplate jt;

	@Override
	public int addGift(Gift g) {
		String query = "insert into gift values(?,?,?,?)";
		return jt.update(query, g.getGiftId(), g.getGiftName(), g.getCategory(), g.getPrice());
	}

	@Override
	public int updateGift(Gift g) {
		String query = "update gift set giftname=?, category=?, price=? where giftid=?";
		return jt.update(query, g.getGiftName(), g.getCategory(), g.getPrice(), g.getGiftId());
	}

	@Override
	public int deleteGift(int giftid) {
		String query = "delete from gift where giftid=?";
		return jt.update(query, giftid);
	}

	@Override
	public List<Gift> getAllGift() {
		String query = "select * from gift";
		return jt.query(query, (rs, rowNum) -> {
			Gift g = new Gift();
			g.setGiftId(rs.getInt("giftid"));
			g.setGiftName(rs.getString("giftname"));
			g.setCategory(rs.getString("category"));
			g.setPrice(rs.getDouble("price"));
			return g;
		});
	}
}