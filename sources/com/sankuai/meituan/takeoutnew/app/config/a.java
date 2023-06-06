package com.sankuai.meituan.takeoutnew.app.config;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.v2.LocationSPKeysV2;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.foundation.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a133e55b12daff7d3c747bd53899b87b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a133e55b12daff7d3c747bd53899b87b");
        }
        String str = "";
        String str2 = "";
        try {
            for (AdminInfo adminInfo : (List) k.a().fromJson(h.a(LocationSPKeysV2.GB_CITY_INFO), new TypeToken<List<AdminInfo>>() { // from class: com.sankuai.meituan.takeoutnew.app.config.a.11
            }.getType())) {
                if (adminInfo.adminLevel == 5) {
                    str = adminInfo.adminCode;
                }
                if (adminInfo.adminLevel == 6) {
                    str2 = adminInfo.adminCode;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("key", "prefectureLevelId");
            hashMap.put("value", str);
            hashMap.put("type", "LONG");
            arrayList.add(hashMap);
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("key", "countyLevelId");
            hashMap2.put("value", str2);
            hashMap2.put("type", "LONG");
            arrayList.add(hashMap2);
        }
        return k.a().toJson(arrayList);
    }
}
