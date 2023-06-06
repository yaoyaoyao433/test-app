package com.sankuai.waimai.mach.recycler;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends a {
    public static ChangeQuickRedirect d;
    public WeakReference<ViewGroup> e;

    public g(String str, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbb8266a10b68e3d9ed708c664817e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbb8266a10b68e3d9ed708c664817e3");
            return;
        }
        this.e = null;
        this.b = str;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.mach.recycler.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de65fde6ff653655cd0cd50d9561c54b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de65fde6ff653655cd0cd50d9561c54b");
        } else if (this.c != null) {
            this.c.f.onExpose(this.c);
        }
    }
}
