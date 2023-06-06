package com.sankuai.meituan.kernel.net.nvnetwork;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements r {
    public static ChangeQuickRedirect a;
    private final Context b;
    private String c;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90e20b824260004f38cc2d822313ed0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90e20b824260004f38cc2d822313ed0");
            return;
        }
        this.c = "";
        this.b = context;
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b000add1fc255b5c5a958274f50a3792", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b000add1fc255b5c5a958274f50a3792");
        }
        Request a2 = aVar.a();
        if (TextUtils.isEmpty(this.c)) {
            try {
                this.c = com.sankuai.meituan.kernel.net.utils.b.e(com.sankuai.meituan.kernel.net.base.a.a());
            } catch (Exception unused) {
            }
        }
        if (a2 != null) {
            Request.Builder a3 = a2.a();
            if (a2.g == null || TextUtils.isEmpty(a2.g.get("pragma-os"))) {
                a3.addHeaders("pragma-os", this.c);
            }
            if (a2.g == null || TextUtils.isEmpty(a2.g.get("pragma-mtid"))) {
                a3.addHeaders("pragma-mtid", com.sankuai.meituan.kernel.net.utils.b.a(this.b));
            }
            a2 = a3.build();
        }
        return aVar.a(a2);
    }
}
