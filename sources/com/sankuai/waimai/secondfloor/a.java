package com.sankuai.waimai.secondfloor;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.model.AdminInfo;
import com.sankuai.waimai.foundation.location.v2.h;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.net.c;
import com.sankuai.waimai.platform.net.e;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static MachMap a(Context context, MachMap machMap) {
        Object[] objArr = {context, machMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c4fe427755d70753683eba2bfdef566", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c4fe427755d70753683eba2bfdef566");
        }
        if (machMap == null) {
            machMap = new MachMap();
        }
        String[] f = g.f();
        if (f != null && f.length >= 2) {
            machMap.put(Constants.PRIVACY.KEY_LONGITUDE, f[1]);
            machMap.put(Constants.PRIVACY.KEY_LATITUDE, f[0]);
        }
        String i = g.i();
        if (!TextUtils.isEmpty(i)) {
            if (i.length() > 30) {
                i = i.substring(0, 30);
            }
            machMap.put(GearsLocator.ADDRESS, i);
        }
        machMap.put("f", "android");
        machMap.put("version", String.valueOf(b.A().j()));
        Map<String, String> g = c.a().g();
        for (String str : g.keySet()) {
            machMap.put(str, g.get(str));
        }
        Map<String, String> b = e.b();
        for (String str2 : b.keySet()) {
            machMap.put(str2, b.get(str2));
        }
        if (com.sankuai.waimai.business.knb.utils.c.a() != null) {
            Map<String, String> a2 = com.sankuai.waimai.business.knb.utils.c.a();
            for (String str3 : a2.keySet()) {
                machMap.put(str3, a2.get(str3));
            }
        }
        try {
            String str4 = "";
            List<AdminInfo> o = h.o();
            if (o != null && o.size() > 0) {
                for (AdminInfo adminInfo : o) {
                    if (adminInfo.adminLevel == 5) {
                        str4 = adminInfo.adminCode;
                    }
                }
            }
            machMap.put("poilist_wm_cityid", str4);
        } catch (Exception unused) {
        }
        return machMap;
    }
}
