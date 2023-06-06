package com.sankuai.eh.component.web.plugins;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.a;
import com.tencent.connect.common.Constants;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class m extends b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "01";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "urlRewrite";
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1412f0498a184ddcc796e8d421bce50b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1412f0498a184ddcc796e8d421bce50b")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(d(), "enabled"), true).booleanValue();
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beebf1d29e4c4f6890fbc3a26fa42345", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beebf1d29e4c4f6890fbc3a26fa42345") : com.sankuai.eh.component.service.utils.b.a(this.d.j, "data", "urlRewrite");
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8a23c7fd2fa8fccb750b88bba95b57", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8a23c7fd2fa8fccb750b88bba95b57") : new String[]{"onComponentInit"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8244095588bfca9f608b9a9ffd7e8bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8244095588bfca9f608b9a9ffd7e8bdb");
        } else if (g()) {
            String a2 = aVar.a();
            char c = 65535;
            if (a2.hashCode() == -1732242418 && a2.equals("onComponentInit")) {
                c = 0;
            }
            if (c == 0 && (aVar.d() instanceof Bundle)) {
                Bundle bundle = (Bundle) aVar.d();
                Iterator<JsonElement> it = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(d(), "group")).iterator();
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    if (com.sankuai.eh.component.service.utils.f.b(next)) {
                        h();
                        String b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(next, "path"), this.d.h);
                        if (!b.startsWith("http")) {
                            String a3 = com.sankuai.eh.component.service.utils.e.a(com.sankuai.eh.component.service.utils.e.g(this.d.h), NetLogConstants.Details.SCHEME);
                            String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.a(this.d.j, Constants.PARAM_SCOPE), "");
                            if (!TextUtils.isEmpty(a3) || !TextUtils.isEmpty(b2)) {
                                b = a3 + "://" + b2 + b;
                            }
                        }
                        bundle.putString("url", com.sankuai.eh.component.service.utils.e.a(a(b, next), "ehcrewrite", String.valueOf(a.C0548a.a.b())));
                        bundle.putString("eh_rewrite", this.d.h);
                        this.d.a("rewriteFrom", this.d.h);
                        a(true);
                        return;
                    }
                }
            }
        }
    }

    private String a(String str, JsonElement jsonElement) {
        Object[] objArr = {str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9210a03199d07da57c42aa559d6a759e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9210a03199d07da57c42aa559d6a759e");
        }
        int a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "queryMode"), 0);
        Uri g = com.sankuai.eh.component.service.utils.e.g(str);
        Uri.Builder buildUpon = com.sankuai.eh.component.service.utils.e.g(str).buildUpon();
        Uri g2 = com.sankuai.eh.component.service.utils.e.g(this.d.h);
        switch (a2) {
            case 1:
                for (String str2 : g2.getQueryParameterNames()) {
                    if (g.getQueryParameter(str2) == null) {
                        buildUpon.appendQueryParameter(str2, g2.getQueryParameter(str2));
                    }
                }
                break;
        }
        return buildUpon.toString();
    }
}
