package com.sankuai.waimai.platform.widget.smoothnestedscroll.core;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    @NonNull
    private final View b;
    @NonNull
    private final Context c;
    @NonNull
    private final b d;

    public d(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aecbd0f9c901d064f4be7751a647a6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aecbd0f9c901d064f4be7751a647a6c");
            return;
        }
        this.d = new b();
        this.b = view;
        this.c = this.b.getContext();
    }

    public final void a(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4377d7b9c9c570ce69be695d2f4f0222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4377d7b9c9c570ce69be695d2f4f0222");
            return;
        }
        if (i2 != 0 || i4 != 0) {
            for (ViewParent parent = this.b.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof e) {
                    ((e) parent).a(view, i, i2, i3, i4, cVar);
                    return;
                }
            }
        }
        cVar.a(view, i, i2, i3, i4);
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "002264f9e21a6195bbb2fda2b8211e6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "002264f9e21a6195bbb2fda2b8211e6b");
        } else if (i2 != 0 || i4 != 0) {
            for (ViewParent parent = this.b.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof e) {
                    ((e) parent).b(view, i, i2, i3, i4);
                    return;
                }
            }
        }
    }

    private void b(final View view, final int i, final int i2, int i3, int i4, final c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58776f642710bdba9fc6319e0b6603e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58776f642710bdba9fc6319e0b6603e1");
        } else {
            this.d.a(this.c, new b.d(view) { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.core.d.1
                public static ChangeQuickRedirect c;

                @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
                public final void a(@NonNull b bVar, int i5, int i6) {
                    Object[] objArr2 = {bVar, Integer.valueOf(i5), Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d962b5e4c1f2e002dfa0eb3a98e93445", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d962b5e4c1f2e002dfa0eb3a98e93445");
                    } else {
                        cVar.a(view, i, i2, i5, i6);
                    }
                }
            }, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50035617b5bd8eadbc9dbfab97324a4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50035617b5bd8eadbc9dbfab97324a4e");
        } else {
            b(this.b, i, i2, i3, i4, cVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a19bfec1d88c75fd75c742c2b54ea61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a19bfec1d88c75fd75c742c2b54ea61");
        } else {
            this.d.cancel();
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846e0846392d4a970b1d17ce255b7d24", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846e0846392d4a970b1d17ce255b7d24")).booleanValue() : this.d != null && this.d.a();
    }
}
