package com.sankuai.waimai.mmp;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements com.meituan.msi.location.b {
    public static ChangeQuickRedirect a;
    com.meituan.msi.location.a b;
    private c c;
    private com.meituan.mmp.lib.map.b d;

    public d(Activity activity, com.meituan.msi.provider.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca2157a5907186e7598b7f1a9662559", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca2157a5907186e7598b7f1a9662559");
            return;
        }
        this.c = null;
        this.b = null;
        this.d = new com.meituan.mmp.lib.map.b() { // from class: com.sankuai.waimai.mmp.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.map.b
            public final void a(int i, com.meituan.msi.api.location.a aVar, String str) {
                Object[] objArr2 = {Integer.valueOf(i), aVar, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "960b7a94cc00c0d622ecbb602f82c47c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "960b7a94cc00c0d622ecbb602f82c47c");
                } else if (d.this.b != null) {
                    d.this.b.a(i, aVar, str);
                }
            }
        };
        this.c = new c(activity, cVar);
    }

    @Override // com.meituan.msi.location.b
    public final void a(com.meituan.msi.location.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef090ffdb81fb805fc911c0632ea268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef090ffdb81fb805fc911c0632ea268");
            return;
        }
        this.b = aVar;
        this.c.a(this.d, str);
    }

    @Override // com.meituan.msi.location.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e6160e20f6c43ddae707a8bce554d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e6160e20f6c43ddae707a8bce554d0");
            return;
        }
        this.b = null;
        this.c.a();
    }
}
