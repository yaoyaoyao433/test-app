package com.meituan.android.mrn.component.list.turbo;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    final SparseArray<LinkedList<TurboNode>> b;
    final int c;

    public i(int i) {
        Object[] objArr = {100};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b030ec9128c571c41c799129d3e771c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b030ec9128c571c41c799129d3e771c2");
            return;
        }
        this.b = new SparseArray<>();
        this.c = 100;
    }
}
