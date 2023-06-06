package com.sankuai.waimai.router.core;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;

    public abstract void a(@NonNull T t, @NonNull j jVar, @NonNull g gVar);

    public final void a(Iterator<T> it, @NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {it, jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038a73f357cb43be7fe910d73a18bc7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038a73f357cb43be7fe910d73a18bc7d");
        } else {
            b(it, jVar, gVar);
        }
    }

    void b(@NonNull final Iterator<T> it, @NonNull final j jVar, @NonNull final g gVar) {
        Object[] objArr = {it, jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6160156b804d78a85c39d412a810151", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6160156b804d78a85c39d412a810151");
        } else if (it.hasNext()) {
            a((a<T>) it.next(), jVar, new g() { // from class: com.sankuai.waimai.router.core.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.g
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8d0ae85ba3c84fbcc1665daf8145156", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8d0ae85ba3c84fbcc1665daf8145156");
                    } else {
                        a.this.b(it, jVar, gVar);
                    }
                }

                @Override // com.sankuai.waimai.router.core.g
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54e1a19b84061179d9ec6c58f8861197", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54e1a19b84061179d9ec6c58f8861197");
                    } else {
                        gVar.a(i);
                    }
                }
            });
        } else {
            gVar.a();
        }
    }
}
