package com.meituan.msc.modules.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n implements b {
    public static ChangeQuickRedirect a;
    private final a b;
    private final int c;
    private boolean d;

    public n(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96b49070c7be187ee173d853ca6b701f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96b49070c7be187ee173d853ca6b701f");
            return;
        }
        this.b = aVar;
        this.c = i;
        this.d = false;
    }

    @Override // com.meituan.msc.modules.manager.b
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69d8958d9346ce27f6073088a3509f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69d8958d9346ce27f6073088a3509f7e");
        } else if (this.d) {
        } else {
            if (this.b == null) {
                com.meituan.msc.modules.reporter.g.e("MSCNativeCompletableCallback when mExecutorContext is null");
                return;
            }
            this.b.b(this.c, obj);
            this.d = true;
        }
    }
}
