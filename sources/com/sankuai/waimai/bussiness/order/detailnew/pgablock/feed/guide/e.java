package com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    LinearLayout e;
    TextView f;
    c g;
    long h;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_feed_flow_guide;
    }

    public e(Context context, @Nullable ViewStub viewStub, c cVar) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub, cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "129c57b135b6e91ca22a4edd595cdad0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "129c57b135b6e91ca22a4edd595cdad0");
            return;
        }
        this.h = -1L;
        this.g = cVar;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd70573b2485156f0805ccea821609e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd70573b2485156f0805ccea821609e");
            return;
        }
        super.b();
        this.f = (TextView) this.b.findViewById(R.id.feed_flow_guide_text);
        this.e = (LinearLayout) this.b.findViewById(R.id.feed_flow_guide);
    }
}
