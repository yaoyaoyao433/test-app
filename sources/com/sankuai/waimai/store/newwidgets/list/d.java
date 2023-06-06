package com.sankuai.waimai.store.newwidgets.list;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.newwidgets.list.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d<T, Contract extends b> extends f<T, Contract> {
    public static ChangeQuickRedirect b;

    public e a(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    public d(@NonNull Contract contract) {
        super(contract);
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7302765e1e4766329f9b514478147da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7302765e1e4766329f9b514478147da");
        }
    }

    public int[] e() {
        return new int[0];
    }
}
