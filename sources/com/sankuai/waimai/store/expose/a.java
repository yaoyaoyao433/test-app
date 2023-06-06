package com.sankuai.waimai.store.expose;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect c;
    private Set<T> a;

    public abstract boolean a(View view, T t);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1d29c6e8c5a9fedd298f8dd5c23262", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1d29c6e8c5a9fedd298f8dd5c23262");
        } else {
            this.a = new HashSet();
        }
    }

    public final void b(View view, T t) {
        Object[] objArr = {view, t};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "837c4fb1b64b5b993f853cc309b8a029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "837c4fb1b64b5b993f853cc309b8a029");
        } else if (this.a.contains(t) || !a(view, t)) {
        } else {
            this.a.add(t);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c142c472c2730897cc3b63a48da73406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c142c472c2730897cc3b63a48da73406");
        } else {
            this.a.clear();
        }
    }
}
