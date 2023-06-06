package com.sankuai.waimai.store.mach.page;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.BaseTile;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d<T> {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public T d;
    public BaseTile.LayoutInfo e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public CharSequence[] a;
        public Integer[] b;

        public a(CharSequence[] charSequenceArr, Integer[] numArr, int i) {
            this.a = charSequenceArr;
            this.b = numArr;
        }
    }

    public final <D> d<D> a(D d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7b3194ab8bb310c17b1671fc80f610d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7b3194ab8bb310c17b1671fc80f610d");
        }
        d<D> dVar = new d<>();
        dVar.b = this.b;
        dVar.c = this.c;
        dVar.d = d;
        dVar.e = this.e;
        return dVar;
    }
}
