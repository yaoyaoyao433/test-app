package com.sankuai.waimai.store.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements com.sankuai.waimai.store.i.share.b {
    public static ChangeQuickRedirect a;
    private WeakReference<com.sankuai.waimai.store.i.share.b> b;

    public d(com.sankuai.waimai.store.i.share.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acd480a0feb2127295127e775f11b4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acd480a0feb2127295127e775f11b4c");
        } else {
            this.b = new WeakReference<>(bVar);
        }
    }

    @Override // com.sankuai.waimai.store.i.share.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e35727e08ab71822b4fa74c2364ff2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e35727e08ab71822b4fa74c2364ff2e");
        } else if (this.b.get() != null) {
            this.b.get().a(i, i2);
        }
    }
}
