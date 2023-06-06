package com.sankuai.eh.component.web.plugins.core;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.tools.e;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.web.plugins.api.a;
import com.sankuai.eh.component.web.plugins.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.sankuai.eh.component.web.plugins.b implements Handler.Callback {
    public static ChangeQuickRedirect a;
    private Handler b;
    private List<String> f;
    private boolean g;
    private boolean h;
    private boolean i;
    private long j;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "10";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04dd688e1c5cb55ed9f7c26a9586f17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04dd688e1c5cb55ed9f7c26a9586f17");
            return;
        }
        super.a(cVar);
        this.b = new e(this);
        this.f = new ArrayList();
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa613899568ecfbbc7e1b610314dd83", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa613899568ecfbbc7e1b610314dd83") : new String[]{"onPageStart", "onPageLoad", "onKNBJSCall", "onCustomMessage", "onPageClose"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0173, code lost:
        if (com.sankuai.eh.component.service.utils.b.a(r1, r0, false) == false) goto L42;
     */
    @Override // com.sankuai.eh.component.web.plugins.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.eh.component.web.plugins.api.a r14) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.web.plugins.core.c.a(com.sankuai.eh.component.web.plugins.api.a):void");
    }

    private void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2188699bbd1d72f9a4dd0e917e425587", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2188699bbd1d72f9a4dd0e917e425587");
        } else {
            com.sankuai.eh.component.service.tools.d.a("eh_show", new d.b().a("name", "ehc.page.load").a(new d.b().a("timeout", Boolean.valueOf(this.i)).a("loadType", str).a("routeValue", Long.valueOf(f.a(((Long) this.d.c("route_startTime", 0L)).longValue()))).a(map).a(this.d.a()).b).b, Long.valueOf(f.a(this.j)));
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd22f26a7e064ebe124bb7dc4151636a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd22f26a7e064ebe124bb7dc4151636a");
        }
        if (this.d != null) {
            return f.a(str, (String) this.e.d("scopeKey", "unknown"), (String) this.e.d("pageKey", "unknown"));
        }
        return str + ".unknown";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e59986e1f540fe40efec56dad3fc9ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e59986e1f540fe40efec56dad3fc9ae")).booleanValue();
        }
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onCustomMessage";
        c0556a.c = "force";
        b.a(c0556a.a(), this.d);
        String a2 = a("showTimeout");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        com.dianping.codelog.b.b(k.class, a2, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f02b02cae3de1bf13517098da12f0d1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f02b02cae3de1bf13517098da12f0d1") : (String) this.d.d("webInfo", ""));
        new d.c().a(a("showTimeout")).b();
        return false;
    }
}
