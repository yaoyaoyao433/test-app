package com.sankuai.waimai.foundation.core.base.activity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.utils.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public f b;
    private List<WeakReference<Runnable>> c;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbaa9ebefd3e18befced4a2e4326eacf", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbaa9ebefd3e18befced4a2e4326eacf") : new d();
    }

    public List<WeakReference<Runnable>> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d4b016732d65dd4d231a2d7642bb35a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d4b016732d65dd4d231a2d7642bb35a");
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        return this.c;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08fb2ee0e800f44a86b06e64f232cd62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08fb2ee0e800f44a86b06e64f232cd62");
            return;
        }
        List<WeakReference<Runnable>> b = b();
        if (b.size() > 0) {
            for (WeakReference<Runnable> weakReference : b) {
                Runnable runnable = weakReference.get();
                if (runnable != null) {
                    this.b.a(runnable);
                }
            }
        }
    }
}
