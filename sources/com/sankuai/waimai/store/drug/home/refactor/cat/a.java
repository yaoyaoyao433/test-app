package com.sankuai.waimai.store.drug.home.refactor.cat;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.store.drug.home.util.b;
import com.sankuai.waimai.store.manager.judas.d;
import com.sankuai.waimai.store.util.monitor.c;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(@NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b28498dd2ee6e806f8a14a87f7d2ee2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b28498dd2ee6e806f8a14a87f7d2ee2")).booleanValue() : b(aVar) && ((Boolean) b.b(aVar, b.c, Boolean.TRUE)).booleanValue();
    }

    public static boolean b(@NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb378bed274874cabfdbfa4e5e44203b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb378bed274874cabfdbfa4e5e44203b")).booleanValue() : ((Integer) b.b(aVar, b.b, 0)).intValue() == 1;
    }

    public static void a(@NonNull com.sankuai.waimai.store.param.a aVar, @NonNull String str, int i) {
        Object[] objArr = {aVar, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5947f9f4cc49d10e004292bc8ce10589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5947f9f4cc49d10e004292bc8ce10589");
        } else if (a(aVar)) {
            b.a(aVar, b.c, Boolean.FALSE);
            HashMap hashMap = new HashMap();
            hashMap.put("error_reason", str);
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(i));
            c.a(new DrugHomeMonitor("DrugHomeRender"), null, null, hashMap);
        }
    }

    public static void a(@NonNull d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53e4f0bef0286e4431631d20c8b23c7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53e4f0bef0286e4431631d20c8b23c7c");
            return;
        }
        Object a2 = aVar.a("lx_location_info_monitor_status");
        if (a2 instanceof String) {
            String str = (String) a2;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("lx_location_status", str);
            if ("0".endsWith(str) || "#".equals(str)) {
                c.b(new DrugHomeMonitor("DrugHomepagePVLxReport"), null, null, hashMap);
            } else {
                c.a(new DrugHomeMonitor("DrugHomepagePVLxReport"), null, null, hashMap);
            }
        }
    }
}
