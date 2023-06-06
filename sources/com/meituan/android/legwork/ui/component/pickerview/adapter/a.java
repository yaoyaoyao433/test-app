package com.meituan.android.legwork.ui.component.pickerview.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a<T> implements b {
    public static ChangeQuickRedirect a;
    private List<T> b;
    private int c;

    public a(List<T> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26f947f3bc5370ae1c911d2b64f6d60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26f947f3bc5370ae1c911d2b64f6d60");
            return;
        }
        this.b = list;
        this.c = i;
    }

    public a(List<T> list) {
        this(list, 4);
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deaa1728615960f75e15f39c1e004b27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deaa1728615960f75e15f39c1e004b27");
        }
    }

    @Override // com.meituan.android.legwork.ui.component.pickerview.adapter.b
    public final Object a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a846f4318a5c8d4d7aaa2124f1aba11", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a846f4318a5c8d4d7aaa2124f1aba11") : (i < 0 || i >= this.b.size()) ? "" : this.b.get(i);
    }

    @Override // com.meituan.android.legwork.ui.component.pickerview.adapter.b
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1befc901e546a863fbcf1676332616", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1befc901e546a863fbcf1676332616")).intValue() : this.b.size();
    }

    @Override // com.meituan.android.legwork.ui.component.pickerview.adapter.b
    public final int a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b9a12809312df3ec666721b2fbe195", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b9a12809312df3ec666721b2fbe195")).intValue() : this.b.indexOf(obj);
    }
}
