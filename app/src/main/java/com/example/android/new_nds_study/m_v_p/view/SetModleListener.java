package com.example.android.new_nds_study.m_v_p.view;

import com.example.android.new_nds_study.m_v_p.bean.ProvinceandCity;
import com.example.android.new_nds_study.m_v_p.bean.UserUpdate;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;

public interface SetModleListener {
    void success(UserinfoBean userinfoBean);
    void accountUpdata(UserUpdate userUpdate);
    void district(ProvinceandCity provinceandCity);
}
