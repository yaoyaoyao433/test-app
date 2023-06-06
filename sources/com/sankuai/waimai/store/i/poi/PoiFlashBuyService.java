package com.sankuai.waimai.store.i.poi;

import android.support.v4.app.Fragment;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface PoiFlashBuyService {
    public static final String KEY_SG = "poi_communication_sg";

    void dealWithAddShopCart(SCBaseActivity sCBaseActivity, com.sankuai.waimai.store.mach.event.a aVar, Map<String, Object> map);

    Fragment getOrderListFragment();
}
