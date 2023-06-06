package com.meituan.msc.modules.engine.requestPrefetch;

import com.meituan.msc.modules.engine.requestPrefetch.f;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements Runnable {
    public static ChangeQuickRedirect a;
    b b;
    public final e c;
    public d d;
    public f.a e;

    public g(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec2852b5411d3f4400a68740e45a3e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec2852b5411d3f4400a68740e45a3e0");
        } else {
            this.c = eVar;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f361c38f21255aea63a4c8ed62357ce6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f361c38f21255aea63a4c8ed62357ce6");
            return;
        }
        PerfTrace.end("request_prefetch_locate");
        this.c.a(this.d, this.e, this.b);
    }
}
