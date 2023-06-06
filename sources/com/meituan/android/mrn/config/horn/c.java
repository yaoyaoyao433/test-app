package com.meituan.android.mrn.config.horn;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static c b = new c();

    public c() {
        com.meituan.android.mrn.utils.config.b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ba260c3a1c60523c2b228a171a2504", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ba260c3a1c60523c2b228a171a2504");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "256ab53c279520415848ffee6e2d919b", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.mrn.utils.config.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "256ab53c279520415848ffee6e2d919b");
        } else {
            a2 = com.meituan.android.mrn.utils.config.a.a();
            if (a.a.equals(com.meituan.android.mrn.config.c.a().e())) {
                a2.c = "";
            }
        }
        com.meituan.android.mrn.utils.config.b bVar = a2;
        a(Constants.GestureData.KEY_TIME_INTERVAL, Long.TYPE, 7L, "清理间隔", bVar);
        a("block_list", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.c.1
        }.getType(), new ArrayList(), "清理白名单", bVar);
        a("storage_threshold", Long.TYPE, 0L, "清理阈值", bVar);
        a("should_manage_storage", Boolean.TYPE, Boolean.FALSE, "是否开启包内存治理", bVar);
        a("should_report_manage", Boolean.TYPE, Boolean.FALSE, "是否开启包管理上报", bVar);
    }

    private void a(String str, Type type, Object obj, String str2, com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, type, obj, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ba7a36e87279c9fda9cdee1f08c3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ba7a36e87279c9fda9cdee1f08c3b2");
        } else {
            t.a(str, type, obj, "mrn_bundle_manage_config_android", str2, bVar);
        }
    }
}
