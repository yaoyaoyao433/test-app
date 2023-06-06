package com.sankuai.waimai.touchmatrix.rebuild.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.utils.g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    public static String a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ade09e6ed75b48984b82a81c1113d5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ade09e6ed75b48984b82a81c1113d5a");
        }
        String str = "";
        if (activity instanceof com.sankuai.waimai.foundation.core.base.activity.c) {
            Map<String, String> Z_ = ((com.sankuai.waimai.foundation.core.base.activity.c) activity).Z_();
            if (Z_ != null && !Z_.isEmpty() && b != null && !b.isEmpty()) {
                str = b.get(Z_.get("page_id"));
            }
        } else {
            String b2 = com.sankuai.waimai.touchmatrix.utils.c.a().b();
            if (!TextUtils.isEmpty(b2)) {
                str = b.get(b2);
            }
        }
        StringBuilder sb = new StringBuilder("CidUtils  获取CID = ");
        sb.append(str);
        sb.append(" Activity: ");
        sb.append(activity != null ? activity.getClass().getSimpleName() : "");
        c.b(sb.toString(), new Object[0]);
        return str;
    }

    public static String a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eee714d548c998e109c421becb6e0359", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eee714d548c998e109c421becb6e0359");
        }
        String str = "";
        Activity c = com.sankuai.waimai.touchmatrix.rebuild.message.a.c(aVar);
        if (c instanceof com.sankuai.waimai.foundation.core.base.activity.c) {
            Map<String, String> Z_ = ((com.sankuai.waimai.foundation.core.base.activity.c) c).Z_();
            if (!g.a(Z_) && !g.a(b)) {
                str = b.get(Z_.get("page_id"));
            }
        } else {
            String b2 = com.sankuai.waimai.touchmatrix.utils.c.a().b();
            if (!TextUtils.isEmpty(b2)) {
                str = b.get(b2);
            }
        }
        return (!TextUtils.isEmpty(str) || c == null) ? str : c.getComponentName().getClassName();
    }

    public static void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1970c4eac0951a43dc9296a09660a102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1970c4eac0951a43dc9296a09660a102");
        } else {
            b.putAll(hashMap);
        }
    }

    public static ConcurrentHashMap<String, String> a() {
        return b;
    }
}
