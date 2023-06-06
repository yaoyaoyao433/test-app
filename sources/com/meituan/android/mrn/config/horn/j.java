package com.meituan.android.mrn.config.horn;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public static j b = new j();

    public j() {
        com.meituan.android.mrn.utils.config.b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c3f8471e02fe8550e51eddcd34403e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c3f8471e02fe8550e51eddcd34403e");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "465c18ddc1ae8974cb88b317ac16b3e4", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.mrn.utils.config.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "465c18ddc1ae8974cb88b317ac16b3e4");
        } else {
            a2 = com.meituan.android.mrn.utils.config.a.a();
            String e = com.meituan.android.mrn.config.c.a().e();
            if (a.a.equals(e)) {
                a2.c = "";
            } else if (a.b.equals(e)) {
                a2.c = a.d;
            }
        }
        com.meituan.android.mrn.utils.config.b bVar = a2;
        a("enablePreLoad", Boolean.TYPE, Boolean.FALSE, "是否开启预加载，总开关", bVar);
        a("preloadWhitelist", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.j.1
        }.getType(), null, "预加载白名单", bVar);
        a("deepPreloadWhitelist", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.j.2
        }.getType(), null, "深度预加载白名单", bVar);
        a("keepAliveWhitelist", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.j.3
        }.getType(), null, "引擎保活白名单", bVar);
    }

    private void a(String str, Type type, Object obj, String str2, com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, type, obj, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4217755fd6d594c427eba4e9c85376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4217755fd6d594c427eba4e9c85376");
        } else {
            t.a(str, type, obj, "mrn_preload_config_android", str2, bVar);
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "023c788cc56f66407aa9fb92cd758da8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "023c788cc56f66407aa9fb92cd758da8")).booleanValue();
        }
        boolean booleanValue = ((Boolean) t.b.a("enablePreLoad")).booleanValue();
        List list = (List) t.b.a("deepPreloadWhitelist");
        return booleanValue && list != null && list.contains(str);
    }
}
