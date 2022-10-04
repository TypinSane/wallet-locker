package generate;

import com.yyy.WalletLocker.model.BillTb;

public interface BillTbDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BillTb record);

    int insertSelective(BillTb record);

    BillTb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BillTb record);

    int updateByPrimaryKey(BillTb record);
}