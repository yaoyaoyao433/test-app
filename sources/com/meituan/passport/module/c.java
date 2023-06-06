package com.meituan.passport.module;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class c implements a {
    public static ChangeQuickRedirect a;
    private List<WeakReference<b>> b;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "383624220c8f3bc63433c72d723825cb", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "383624220c8f3bc63433c72d723825cb") : new c();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc1b6f5043017aa88acf5484a402b48a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc1b6f5043017aa88acf5484a402b48a");
        } else if (this.b != null) {
            Iterator<WeakReference<b>> it = this.b.iterator();
            while (it.hasNext()) {
                b bVar = it.next().get();
                if (bVar != null) {
                    bVar.a(z);
                } else {
                    it.remove();
                }
            }
        }
    }

    @Override // com.meituan.passport.module.a
    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be183f9f30be2df3563fd626b094916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be183f9f30be2df3563fd626b094916");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(new WeakReference<>(bVar));
    }
}
