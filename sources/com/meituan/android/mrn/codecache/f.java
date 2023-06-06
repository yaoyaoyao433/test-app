package com.meituan.android.mrn.codecache;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    Map<String, e> b;

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beaad957c6f95ab9a8faa4ee4b6233e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beaad957c6f95ab9a8faa4ee4b6233e9");
        } else {
            this.b = new com.meituan.android.mrn.utils.collection.c(context, com.meituan.android.mrn.common.b.a(context), "CodeCacheStorageInfo", com.meituan.android.mrn.utils.collection.b.c, new com.meituan.android.mrn.utils.collection.b<e>() { // from class: com.meituan.android.mrn.codecache.f.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.utils.collection.b
                public final /* synthetic */ e a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "586a04b0c35389a04816968ca27b4605", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "586a04b0c35389a04816968ca27b4605") : (e) com.meituan.android.mrn.utils.g.a(str, e.class);
                }

                @Override // com.meituan.android.mrn.utils.collection.b
                public final /* synthetic */ String a(e eVar) {
                    e eVar2 = eVar;
                    Object[] objArr2 = {eVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "900c773f41ffb316bdb59b218e7f7fee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "900c773f41ffb316bdb59b218e7f7fee") : com.meituan.android.mrn.utils.g.a(eVar2);
                }
            });
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4eeb280e63f3f64f459cf2d5c6866e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4eeb280e63f3f64f459cf2d5c6866e0");
        } else {
            this.b.remove(str);
        }
    }

    public final long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b98b479b11159c89df6f925ceae6c6c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b98b479b11159c89df6f925ceae6c6c6")).longValue();
        }
        long j = 0;
        for (e eVar : this.b.values()) {
            j += eVar.d;
        }
        return j;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44ad8bb76172679e66b106e77ecffcf3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44ad8bb76172679e66b106e77ecffcf3")).intValue() : this.b.size();
    }

    public final Collection<e> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e68d86e0fc3c4949125116ffb1998fa", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e68d86e0fc3c4949125116ffb1998fa") : this.b.values();
    }
}
