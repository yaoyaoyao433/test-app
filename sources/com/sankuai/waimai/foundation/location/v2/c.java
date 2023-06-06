package com.sankuai.waimai.foundation.location.v2;

import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmHistoryAddressList;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(List<WmHistoryAddressList.SimpleAddressItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7c9fb3e2fcf2c4f33621a7d902e6c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7c9fb3e2fcf2c4f33621a7d902e6c48");
            return;
        }
        WmHistoryAddressList wmHistoryAddressList = new WmHistoryAddressList();
        User user = UserCenter.getInstance(com.meituan.android.singleton.b.a).getUser();
        wmHistoryAddressList.setUserId(user == null ? 0L : user.id);
        wmHistoryAddressList.setUpdateTime(System.currentTimeMillis());
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            h.a(wmHistoryAddressList);
            return;
        }
        int size = list.size() <= 50 ? list.size() : 50;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        wmHistoryAddressList.setAddressItems(arrayList);
        h.a(wmHistoryAddressList);
    }
}
