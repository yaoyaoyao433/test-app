package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class r extends b {
    public static ChangeQuickRedirect a = null;
    public static final String o = "r";

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String k() {
        return "tunnel";
    }

    public r(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89dce95ae75189ec17a2baf4696cf4ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89dce95ae75189ec17a2baf4696cf4ae");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13298d50a92c2f034bc3eec8a2ed1dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13298d50a92c2f034bc3eec8a2ed1dd");
        }
        if ("all_params".equals(this.c)) {
            return new NeoBridgeBean(this.k, this.n, l(), a(false)).toString();
        }
        return d();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return o;
    }

    private JsonObject l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eda326768a7db6c9b12d7e405258d2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eda326768a7db6c9b12d7e405258d2f");
        }
        JsonObject c = com.meituan.android.neohybrid.v2.neo.tunnel.a.a().c(e());
        a("b_pay_wzw31ej1_sc", com.meituan.android.neohybrid.neo.report.a.c("keys", "all_params").b);
        Map<String, JsonObject> b = com.meituan.android.neohybrid.v2.neo.params.a.b(e());
        for (String str : b.keySet()) {
            c.add(str, b.get(str));
        }
        return c;
    }
}
