package com.meituan.android.mrn.config.horn;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static b b = new b();

    public b() {
        com.meituan.android.mrn.utils.config.b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b684228c28595a621bf1f621a5b73ada", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b684228c28595a621bf1f621a5b73ada");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "748b4ae113cf666f75d258213ffa629c", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (com.meituan.android.mrn.utils.config.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "748b4ae113cf666f75d258213ffa629c");
        } else {
            a2 = com.meituan.android.mrn.utils.config.a.a();
            if (a.a.equals(com.meituan.android.mrn.config.c.a().e())) {
                a2.c = "";
            }
        }
        com.meituan.android.mrn.utils.config.b bVar = a2;
        a("singleBridgeRate", new TypeToken<JsonObject>() { // from class: com.meituan.android.mrn.config.horn.b.1
        }.getType(), null, "", bVar);
        a("commonBridgeRate", Float.TYPE, Float.valueOf(0.0f), "公共桥采样率", bVar);
    }

    private void a(String str, Type type, Object obj, String str2, com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, type, obj, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15bd0ce901dcd9ef4034efecd1c6b0d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15bd0ce901dcd9ef4034efecd1c6b0d8");
        } else {
            t.a(str, type, obj, "mrn_bridge_report_config_android", str2, bVar);
        }
    }

    public final float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d555dfdc4c950bf6def0b66d1e658a51", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d555dfdc4c950bf6def0b66d1e658a51")).floatValue() : ((Float) t.b.a("commonBridgeRate")).floatValue();
    }
}
