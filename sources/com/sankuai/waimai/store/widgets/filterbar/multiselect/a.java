package com.sankuai.waimai.store.widgets.filterbar.multiselect;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends b {
    public static ChangeQuickRedirect a;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bf3a6ccaf265b570b86831ce552e4e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bf3a6ccaf265b570b86831ce552e4e2");
        }
    }
}
