package com.sankuai.eh.component.web.plugins;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class j extends b implements Handler.Callback {
    public static ChangeQuickRedirect a = null;
    public static String b = "transfer";
    private com.sankuai.eh.component.service.tools.e<j> f;

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
        return b;
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4009f3f05e675ad249c538e68cbefde", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4009f3f05e675ad249c538e68cbefde") : com.sankuai.eh.component.service.utils.b.a(this.d.j, "data", b);
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a660e1e19cb40639668d2f0c0c23179a", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a660e1e19cb40639668d2f0c0c23179a") : new String[]{"onModuleLoad", "onComponentClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21f4532707d2e2c451447b63239eff8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21f4532707d2e2c451447b63239eff8d");
            return;
        }
        super.a(cVar);
        this.f = new com.sankuai.eh.component.service.tools.e<>(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r13.equals("onComponentClose") == false) goto L26;
     */
    @Override // com.sankuai.eh.component.web.plugins.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.eh.component.web.plugins.api.a r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.eh.component.web.plugins.j.a
            java.lang.String r11 = "71f4eb7b2f56a44b51599f691a075358"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            java.lang.String r13 = r13.a()
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1824773967(0xffffffff933c28b1, float:-2.3748998E-27)
            if (r2 == r3) goto L39
            r3 = 2129465018(0x7eed0eba, float:1.5755175E38)
            if (r2 == r3) goto L2f
            goto L44
        L2f:
            java.lang.String r2 = "onComponentClose"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L44
            goto L45
        L39:
            java.lang.String r0 = "onModuleLoad"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L44
            r0 = 0
            goto L45
        L44:
            r0 = -1
        L45:
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L49;
                default: goto L48;
            }
        L48:
            goto L93
        L49:
            com.sankuai.eh.component.service.tools.e<com.sankuai.eh.component.web.plugins.j> r13 = r12.f
            r13.removeMessages(r9)
            goto L93
        L4f:
            com.sankuai.eh.component.web.module.c r13 = r12.d
            java.lang.String r0 = "redirectUrl"
            java.lang.String r1 = ""
            java.lang.Object r13 = r13.c(r0, r1)
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L76
            java.lang.Class<com.sankuai.eh.component.web.plugins.j> r13 = com.sankuai.eh.component.web.plugins.j.class
            java.lang.String r0 = "fup_redirect fail"
            com.sankuai.eh.component.web.module.c r1 = r12.d
            java.lang.String r1 = r1.g
            com.dianping.codelog.b.b(r13, r0, r1)
            com.sankuai.eh.component.web.module.c r13 = r12.d
            android.app.Activity r13 = r13.i
            r13.finish()
            return
        L76:
            com.google.gson.JsonElement r13 = r12.d()
            java.lang.String r0 = "delay"
            com.google.gson.JsonElement r13 = com.sankuai.eh.component.service.utils.b.c(r13, r0)
            r0 = 300(0x12c, float:4.2E-43)
            int r13 = com.sankuai.eh.component.service.utils.b.a(r13, r0)
            if (r13 > 0) goto L8c
            r12.i()
            return
        L8c:
            com.sankuai.eh.component.service.tools.e<com.sankuai.eh.component.web.plugins.j> r0 = r12.f
            long r1 = (long) r13
            r0.sendEmptyMessageDelayed(r9, r1)
            return
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.web.plugins.j.a(com.sankuai.eh.component.web.plugins.api.a):void");
    }

    public static void a(Activity activity) {
        String builder;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a9e5beff4375eeadfa8ec578af6ba0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a9e5beff4375eeadfa8ec578af6ba0b");
            return;
        }
        String a2 = com.sankuai.waimai.platform.utils.f.a(activity.getIntent(), "originUrl");
        if (TextUtils.isEmpty(a2) || !com.sankuai.waimai.platform.utils.f.a(activity.getIntent(), "eh_fup_redirect", false)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(activity.getPackageName());
        intent.putExtra("eh_back_redirect", true);
        if (a2.startsWith("http")) {
            builder = com.sankuai.eh.component.service.utils.e.a(a2, "isReturn", "true");
        } else {
            Uri.Builder appendQueryParameter = Uri.parse(com.sankuai.eh.component.service.utils.e.a(a2, "url")).buildUpon().appendQueryParameter("url", com.sankuai.eh.component.service.utils.e.a(com.sankuai.eh.component.service.utils.e.b(a2, "url"), "isReturn", "true"));
            com.sankuai.eh.component.service.a.c();
            Uri g = com.sankuai.eh.component.service.utils.e.g(KNBWebManager.IEnvironment.WEBVIEW_URI);
            builder = appendQueryParameter.scheme(com.sankuai.eh.component.service.utils.e.a(g, NetLogConstants.Details.SCHEME)).authority(com.sankuai.eh.component.service.utils.e.a(g, "authority")).path(com.sankuai.eh.component.service.utils.e.a(g, "path")).toString();
        }
        intent.setData(Uri.parse(com.sankuai.eh.component.service.utils.f.a(builder)));
        activity.startActivity(intent);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250d7ae81712c4a0aafd789fe500354f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250d7ae81712c4a0aafd789fe500354f");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(this.d.i.getPackageName());
        intent.setData(Uri.parse(com.sankuai.eh.component.service.utils.f.a((String) this.d.c("redirectUrl", ""))));
        intent.putExtra("originUrl", (String) this.d.c("originUrl", ""));
        intent.putExtra("eh_fup_redirect", true);
        this.d.i.startActivity(intent);
        this.d.i.finish();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1889d8a56e987701aa352ae056d31a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1889d8a56e987701aa352ae056d31a6")).booleanValue();
        }
        i();
        return false;
    }
}
