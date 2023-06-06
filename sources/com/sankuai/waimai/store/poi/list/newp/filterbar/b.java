package com.sankuai.waimai.store.poi.list.newp.filterbar;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final c b;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd86281625cab0c6972c3ed83af45f70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd86281625cab0c6972c3ed83af45f70");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_sc_sugoo_sort_view, (ViewGroup) null, false);
        this.b = new e(context, Integer.MAX_VALUE);
        this.b.a().bindView(inflate);
    }
}
