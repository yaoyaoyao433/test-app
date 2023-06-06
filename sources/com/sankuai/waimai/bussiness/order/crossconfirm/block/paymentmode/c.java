package com.sankuai.waimai.bussiness.order.crossconfirm.block.paymentmode;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.PaymentItem;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    LinearLayout e;
    View f;
    TextView g;
    TextView h;
    List<PaymentItem> i;
    int j;
    private f k;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_pay_info;
    }

    public c(Context context, f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ac393a3e1ade2755276de757101bb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ac393a3e1ade2755276de757101bb1");
            return;
        }
        this.k = fVar;
        this.j = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "wm_order_pay_type", 0);
        this.b.setBackground(context.getResources().getDrawable(R.drawable.wm_order_confirm_base_shape_bg));
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2004b403370b82463f777dd9d50e9402", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2004b403370b82463f777dd9d50e9402");
            return;
        }
        super.b();
        this.e = (LinearLayout) this.b.findViewById(R.id.layout_pay_type);
        this.f = this.b.findViewById(R.id.img_arrow_pay_type);
        this.g = (TextView) this.b.findViewById(R.id.txt_pay_type_sub_title);
        this.h = (TextView) this.b.findViewById(R.id.txt_pay_type);
    }
}
