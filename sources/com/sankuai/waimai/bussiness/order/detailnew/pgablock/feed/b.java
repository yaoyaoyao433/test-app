package com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed;

import android.content.Context;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.modular.blockimpl.empty.EmptyView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    EmptyView e;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_feed_flow_layout;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee83fe5b56aea463e46a09ef9ef17e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee83fe5b56aea463e46a09ef9ef17e1");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95a1f8651ea569229c3008ff3d2e2df7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95a1f8651ea569229c3008ff3d2e2df7");
            return;
        }
        super.b();
        this.e = (EmptyView) this.b.findViewById(R.id.wm_order_status_feed_flow_empty_view);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dba2674aa9dc0defc646866ffd1edd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dba2674aa9dc0defc646866ffd1edd6");
            return;
        }
        this.e.b();
        this.e.a(R.string.wm_common_loading);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2d3a267dfe651acff15f03239aff65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2d3a267dfe651acff15f03239aff65");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = i2;
            float f = i;
            marginLayoutParams.leftMargin = g.a(this.c, f) * (-1);
            marginLayoutParams.rightMargin = g.a(this.c, f) * (-1);
            this.b.setLayoutParams(marginLayoutParams);
        }
    }
}
