package com.sankuai.meituan.kernel.net.nvnetwork;

import android.content.Context;
import com.dianping.nvnetwork.r;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.cipstorage.x;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h implements r, ah {
    public static ChangeQuickRedirect a;
    private static final String[] h = {".jpg", ".jpeg", ".png", ".webp", ".gif", ".ico", ".icon", ".svg", ".bmp"};
    private static final String[] i = {MRNBundleManager.MRN_BUNDLE_SUFFIX, ".js", ".css", ".map", ".html", ".ttf", ".eot", ".otf", ".woff"};
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private String g;

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455868fe4db183b230e94c20b1716a1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455868fe4db183b230e94c20b1716a1c");
            return;
        }
        this.b = false;
        this.c = true;
        this.d = true;
        String str = com.sankuai.meituan.kernel.net.base.c.b.getPackageName() + "_preferences";
        q a2 = com.sankuai.meituan.kernel.net.utils.d.a(com.sankuai.meituan.kernel.net.base.c.b);
        a2.a(this);
        x a3 = x.a(a2);
        b(a3, null, str);
        a(a3, (q) null, str);
        c(a3, null, str);
        d(a3, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    @Override // com.dianping.nvnetwork.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rx.d<com.dianping.nvnetwork.q> intercept(com.dianping.nvnetwork.r.a r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.nvnetwork.h.intercept(com.dianping.nvnetwork.r$a):rx.d");
    }

    private void a(x xVar, q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d166779c5c49bc67c96aa0e55c71817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d166779c5c49bc67c96aa0e55c71817");
            return;
        }
        String str2 = "";
        if (xVar != null) {
            str2 = xVar.b("meituan_portm_url", (String) null, str);
        } else if (qVar != null) {
            str2 = qVar.b("meituan_portm_url", (String) null);
        }
        Map<String, String> a2 = com.sankuai.meituan.kernel.net.utils.c.a(str2);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        this.e = a2.get("portm_host");
        this.f = a2.get("Portm-Token");
        this.g = a2.get("Portm-User");
    }

    private void b(x xVar, q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6305ea8c6d638674738251fc336c3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6305ea8c6d638674738251fc336c3b9");
        } else if (xVar != null) {
            this.b = xVar.b("enable_meituan_portm", false, str);
        } else if (qVar != null) {
            this.b = qVar.b("enable_meituan_portm", false);
        }
    }

    private void c(x xVar, q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65128ff93093bd346e3523993dc8b965", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65128ff93093bd346e3523993dc8b965");
        } else if (xVar != null) {
            this.c = xVar.b("enable_filter_pic_res", true, str);
        } else if (qVar != null) {
            this.c = qVar.b("enable_filter_pic_res", true);
        }
    }

    private void d(x xVar, q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2346c805cb117a5d285406727021b312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2346c805cb117a5d285406727021b312");
        } else if (xVar != null) {
            this.d = xVar.b("enable_filter_other_res", true, str);
        } else if (qVar != null) {
            this.d = qVar.b("enable_filter_other_res", true);
        }
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, u uVar, String str2) {
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "215444d521cd5f548773a0e421758ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "215444d521cd5f548773a0e421758ada");
            return;
        }
        q a2 = q.a(com.sankuai.meituan.kernel.net.base.c.b, str);
        if ("enable_meituan_portm".equals(str2)) {
            b(null, a2, null);
        } else if ("meituan_portm_url".equals(str2)) {
            a((x) null, a2, (String) null);
        } else if ("enable_filter_pic_res".equals(str2)) {
            c(null, a2, null);
        } else if ("enable_filter_other_res".equals(str2)) {
            d(null, a2, null);
        }
    }
}
