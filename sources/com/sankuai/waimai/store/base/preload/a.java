package com.sankuai.waimai.store.base.preload;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.mrn.preload.l;
import com.sankuai.waimai.store.mrn.preload.m;
import com.sankuai.waimai.store.mrn.preload.n;
import com.sankuai.waimai.store.mrn.preload.o;
import com.sankuai.waimai.store.mrn.preload.p;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;

    public final boolean a(String str, j<T> jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb4b022668449f13c48aaca387d9e04e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb4b022668449f13c48aaca387d9e04e")).booleanValue() : a(str, false, jVar);
    }

    public final boolean a(String str, final boolean z, final j<T> jVar) {
        com.sankuai.waimai.store.repository.net.b bVar;
        boolean z2 = false;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aeba5aa86c2d74db0854a05e4af83f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aeba5aa86c2d74db0854a05e4af83f0")).booleanValue();
        }
        if (jVar == null) {
            return false;
        }
        o a2 = l.a().a(p.a(str), new l.a<T>() { // from class: com.sankuai.waimai.store.base.preload.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mrn.preload.l.a
            public final void a(@NonNull m<T> mVar) {
                Object[] objArr2 = {mVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b1861750f8e87ae4441d4720023e462", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b1861750f8e87ae4441d4720023e462");
                    return;
                }
                jVar.a((j) mVar.d);
                if (z) {
                    jVar.b();
                }
            }

            @Override // com.sankuai.waimai.store.mrn.preload.l.a
            public final void b(@NonNull m mVar) {
                Object[] objArr2 = {mVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c87bb12f6c8120896343e1667285bb42", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c87bb12f6c8120896343e1667285bb42");
                    return;
                }
                if (mVar.d != null) {
                    jVar.a((com.sankuai.waimai.store.repository.net.b) mVar.d);
                } else {
                    jVar.a(new com.sankuai.waimai.store.repository.net.b(""));
                }
                if (z) {
                    jVar.b();
                }
            }
        });
        if (a2.b != null) {
            if (a2.b == n.SUCCESS) {
                if (a2.c != null && a2.c.d != null) {
                    jVar.a((j<T>) a2.c.d);
                } else {
                    bVar = new com.sankuai.waimai.store.repository.net.b("");
                    jVar.a(bVar);
                }
            } else if (a2.b == n.FAILED) {
                if (a2.c != null && (a2.c.d instanceof com.sankuai.waimai.store.repository.net.b)) {
                    z2 = true;
                }
                bVar = z2 ? (com.sankuai.waimai.store.repository.net.b) a2.c.d : null;
                if (!z2) {
                    bVar = new com.sankuai.waimai.store.repository.net.b("");
                }
                jVar.a(bVar);
            }
            if (z) {
                jVar.b();
            }
            return true;
        }
        return false;
    }
}
