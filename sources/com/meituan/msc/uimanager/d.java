package com.meituan.msc.uimanager;

import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.modules.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class d extends a.AbstractC0445a {
    public static ChangeQuickRedirect b;
    private final WeakReference<ReactContext> c;

    public abstract void b(long j);

    public d(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2387b1d3173aebd88c17444a67549011", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2387b1d3173aebd88c17444a67549011");
        } else {
            this.c = new WeakReference<>(reactContext);
        }
    }

    @Override // com.meituan.msc.jse.modules.core.a.AbstractC0445a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f54c9021e508320b5b26fc4ad521fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f54c9021e508320b5b26fc4ad521fe3");
            return;
        }
        try {
            b(j);
        } catch (RuntimeException e) {
            ReactContext reactContext = this.c.get();
            if (reactContext != null) {
                reactContext.handleException(e);
            } else {
                com.meituan.msc.modules.reporter.g.b("[GuardedFrameCallback@doFrame]", e, "runtime exception occurred, ReactContext null");
            }
        }
    }
}
