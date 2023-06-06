package com.sankuai.waimai.bussiness.order.crossconfirm.block.root;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i extends com.meituan.android.cube.pga.view.a<ObservableScrollView> {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_corss_order_scrollview;
    }

    public i(Context context, @Nullable ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ffd26a36395026401b37a89bab6a6d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ffd26a36395026401b37a89bab6a6d9");
        }
    }
}
