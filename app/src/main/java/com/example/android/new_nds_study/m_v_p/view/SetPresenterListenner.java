package com.example.android.new_nds_study.m_v_p.view;

import com.example.android.new_nds_study.m_v_p.bean.ProvinceandCity;
import com.example.android.new_nds_study.m_v_p.bean.UserUpdate;
import com.example.android.new_nds_study.m_v_p.bean.UserinfoBean;

public interface SetPresenterListenner {
    public void onUser(UserinfoBean userinfoBean);
    public void onDefeated();
   public void accountUpdata(UserUpdate userUpdate);
   public void district(ProvinceandCity provinceandCity);

}

