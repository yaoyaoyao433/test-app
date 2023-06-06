package com.sankuai.meituan.kernel.net.nvnetwork;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k implements r {
    public static ChangeQuickRedirect a;
    private String b;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b574a485273ca1df454ee6aa1d888813", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b574a485273ca1df454ee6aa1d888813");
        } else {
            this.b = null;
        }
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399131f614b1cadceb33f63bfc713926", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399131f614b1cadceb33f63bfc713926");
        }
        Request a2 = aVar.a();
        if (TextUtils.isEmpty(this.b)) {
            this.b = com.sankuai.meituan.kernel.net.singleton.g.a();
        }
        if (!TextUtils.isEmpty(this.b)) {
            a2 = a2.a().addHeaders("User-Agent", this.b).build();
        }
        return aVar.a(a2);
    }
}
