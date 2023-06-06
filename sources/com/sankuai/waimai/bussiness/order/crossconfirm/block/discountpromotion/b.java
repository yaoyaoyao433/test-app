package com.sankuai.waimai.bussiness.order.crossconfirm.block.discountpromotion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.bussiness.order.confirm.adapter.c;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    LinearLayoutForList e;
    com.sankuai.waimai.bussiness.order.confirm.adapter.c f;
    c.b g;
    private c.a h;
    private f i;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_discount_promotion_list;
    }

    public b(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a628f3b8e1f2b0141869a4fe86782531", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a628f3b8e1f2b0141869a4fe86782531");
        } else {
            this.i = fVar;
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d0e8cb09045ea962affb64b0133ccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d0e8cb09045ea962affb64b0133ccb");
            return;
        }
        super.b();
        this.e = (LinearLayoutForList) this.b.findViewById(R.id.lv_discount_list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<DiscountItem> list, long j, String str) {
        Object[] objArr = {list, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64cfe32b177f21965e0732913cee3d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64cfe32b177f21965e0732913cee3d1f");
        } else if (list != null && list.size() > 0) {
            this.f = new com.sankuai.waimai.bussiness.order.confirm.adapter.c(this.c, list, this.i, j, str);
            this.e.setAdapter(this.f);
            this.e.setVisibility(0);
            this.f.e = this.g;
            this.f.f = this.h;
        } else {
            this.e.setVisibility(8);
        }
    }
}
