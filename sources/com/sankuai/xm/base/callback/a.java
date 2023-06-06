package com.sankuai.xm.base.callback;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.j;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static <T> void a(Callback<T> callback, T t) {
        Object[] objArr = {callback, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e54fa32d6ff83f27214a2929d02353c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e54fa32d6ff83f27214a2929d02353c8");
        } else if (callback != null) {
            callback.onSuccess(t);
        }
    }

    public static <T> void a(Callback<T> callback, @TraceStatus int i, String str) {
        Object[] objArr = {callback, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c870d9aa8894173f0d30567a299480f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c870d9aa8894173f0d30567a299480f5");
            return;
        }
        com.sankuai.xm.log.a.b(j.a("error", "callback.fail:code=%d,msg=%s,%s", Integer.valueOf(i), str, callback));
        if (callback != null) {
            callback.onFailure(i, str);
        }
    }
}
