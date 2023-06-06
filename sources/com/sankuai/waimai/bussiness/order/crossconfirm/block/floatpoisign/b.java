package com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public Button e;
    public Button f;
    TextView g;
    TextView h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public int a;
        public int b;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_corss_order_float_poi_sign_layout;
    }

    public b(Context context, @Nullable ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e80bae921270d1754d66abe570dbb475", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e80bae921270d1754d66abe570dbb475");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c467069fbce301eff7edface01dd1de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c467069fbce301eff7edface01dd1de");
            return;
        }
        super.b();
        this.b.setBackgroundColor(Color.red((int) MapConstant.ANIMATION_DURATION_SHORT));
        this.g = (TextView) this.b.findViewById(R.id.indexLabel);
        this.h = (TextView) this.b.findViewById(R.id.totalCountLabel);
        this.e = (Button) this.b.findViewById(R.id.leftButton);
        this.f = (Button) this.b.findViewById(R.id.rightButton);
    }
}
