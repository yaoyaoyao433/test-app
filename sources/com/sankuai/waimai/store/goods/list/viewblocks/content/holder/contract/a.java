package com.sankuai.waimai.store.goods.list.viewblocks.content.holder.contract;

import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    public TextView b;

    public a(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872f47a032491e81a7ce3c15e3ff11f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872f47a032491e81a7ce3c15e3ff11f1");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12bdb2f75c05f9338de1a3f5c59d85be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12bdb2f75c05f9338de1a3f5c59d85be");
        } else {
            this.b = (TextView) view.findViewById(R.id.wm_sc_tv_floor_title);
        }
    }
}
