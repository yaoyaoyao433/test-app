package com.meituan.android.neohybrid.neo.bridge.presenter;

import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.neo.bridge.bean.NeoBridgeBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class o extends b {
    public static ChangeQuickRedirect a = null;
    public static final String n = "o";

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String k() {
        return "tunnel";
    }

    public o(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdc8e5b2cbeccb21cc88485a74acfdf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdc8e5b2cbeccb21cc88485a74acfdf6");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077705cdaec33dda27218ff33e973e14", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077705cdaec33dda27218ff33e973e14");
        }
        if ("all_params".equals(this.c)) {
            return new NeoBridgeBean(this.j, this.m, l(), a(false)).toString();
        }
        return d();
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String j() {
        return n;
    }

    private JsonObject l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca3716b76b76470b730d9ce88c6fa16", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca3716b76b76470b730d9ce88c6fa16");
        }
        JsonObject c = com.meituan.android.neohybrid.neo.tunnel.a.a().c(e());
        a("b_pay_wzw31ej1_sc", com.meituan.android.neohybrid.neo.report.a.c("keys", "all_params").b);
        Map<String, JsonObject> b = com.meituan.android.neohybrid.neo.params.a.b(e());
        for (String str : b.keySet()) {
            c.add(str, b.get(str));
        }
        return c;
    }
}
