package com.sankuai.waimai.addrsdk.manager;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.CityListBean;
import com.sankuai.waimai.addrsdk.utils.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(CityListBean.City city) {
        Object[] objArr = {city};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73fc27f74873ca568d636f3784bbf4b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73fc27f74873ca568d636f3784bbf4b1");
        } else if (city != null) {
            f fVar = new f(com.sankuai.waimai.addrsdk.utils.b.a, "waimai_addrsdk");
            try {
                List list = (List) com.sankuai.waimai.addrsdk.utils.c.a().fromJson(fVar.a("clicked_city"), new TypeToken<List<CityListBean.City>>() { // from class: com.sankuai.waimai.addrsdk.manager.b.1
                }.getType());
                if (list == null) {
                    list = new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(city);
                for (int i = 0; i < list.size(); i++) {
                    if (!TextUtils.equals(((CityListBean.City) list.get(i)).getCityName(), city.getCityName())) {
                        arrayList.add(list.get(i));
                        if (arrayList.size() >= 4) {
                            break;
                        }
                    }
                }
                fVar.a("clicked_city", com.sankuai.waimai.addrsdk.utils.c.a().toJson(arrayList));
            } catch (Exception unused) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(city);
                fVar.a("clicked_city", com.sankuai.waimai.addrsdk.utils.c.a().toJson(arrayList2));
            }
        }
    }
}
