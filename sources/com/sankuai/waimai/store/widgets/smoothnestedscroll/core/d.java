package com.sankuai.waimai.store.widgets.smoothnestedscroll.core;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.core.b;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5dc09e1d44eb978812ce614355e276", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5dc09e1d44eb978812ce614355e276");
            return;
        }
        this.d = new b();
        this.b = view;
        this.c = this.b.getContext();
    }

    public final void a(View view, int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "244a7cf9c27a8cbc7bf400fa8ce35b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "244a7cf9c27a8cbc7bf400fa8ce35b52");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54de988d7357bf583930155991dd39dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54de988d7357bf583930155991dd39dc");
        } else if (i2 != 0 || i4 != 0) {
            for (ViewParent parent = this.b.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof e) {
                    ((e) parent).a_(view, i, i2, i3, i4);
                    return;
                }
            }
        }
    }

    private void b(final View view, final int i, final int i2, int i3, int i4, final c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e9f764b608efb8ba6eaf939e0da509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e9f764b608efb8ba6eaf939e0da509");
            return;
        }
        b bVar = this.d;
        Context context = this.c;
        b.d dVar = new b.d(view) { // from class: com.sankuai.waimai.store.widgets.smoothnestedscroll.core.d.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.core.b.AbstractC1345b
            public final void a(@NonNull b bVar2, int i5, int i6) {
                Object[] objArr2 = {bVar2, Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6735ab271be56bd595eaf4969aa48217", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6735ab271be56bd595eaf4969aa48217");
                } else {
                    cVar.a(view, i, i2, i5, i6);
                }
            }
        };
        Object[] objArr2 = {context, dVar, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "be0c1e5f200a8557af44f3f6ea98c0aa", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "be0c1e5f200a8557af44f3f6ea98c0aa")).booleanValue();
        } else if (context != null) {
            if (i3 == 0 && i4 == 0) {
                return;
            }
            bVar.cancel();
            com.sankuai.shangou.stone.util.log.a.a("Flinger", "fling start: remainedPixels = %d, v = %d, scroller = %s", Integer.valueOf(i3), Integer.valueOf(i4), dVar);
            bVar.b = new b.a(context, bVar, dVar, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, int i4, c cVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d5438c934726741bc05cf61e5ff7bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d5438c934726741bc05cf61e5ff7bf");
        } else {
            b(this.b, i, i2, i3, i4, cVar);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc9d281e8919c4439b136d3192469db9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc9d281e8919c4439b136d3192469db9");
        } else {
            this.d.cancel();
        }
    }
}
