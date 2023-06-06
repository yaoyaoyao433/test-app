package com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a e;
    a.InterfaceC0897a f;
    c g;
    private ViewGroup h;
    private f i;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_product_list;
    }

    public b(@NonNull Context context, @NonNull f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b46c0bd8c91dc45ff78403bdc605b817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b46c0bd8c91dc45ff78403bdc605b817");
            return;
        }
        this.i = fVar;
        this.e = new com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a(context, this.h, this.i);
        this.e.h = this.f;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed8a43c079b041c046c08131cd7a12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed8a43c079b041c046c08131cd7a12b");
            return;
        }
        super.b();
        this.h = (ViewGroup) this.b.findViewById(R.id.layout_product_list);
    }

    @NonNull
    public final List<OrderedFood> e() {
        List<OrderedFood> requestOrderedList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1abff6074c40a1ad8d7ad0ab875424", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1abff6074c40a1ad8d7ad0ab875424");
        }
        ArrayList arrayList = new ArrayList();
        if (this.g != null && this.g.g != null && (requestOrderedList = GlobalCartManager.getInstance().getRequestOrderedList(this.g.c, SubmitOrderManager.getInstance().getSourceType())) != null && requestOrderedList.size() > 0) {
            for (OrderedFood orderedFood : requestOrderedList) {
                if (orderedFood != null) {
                    Iterator<OrderedFood> it = this.g.g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (orderedFood.getSpuId() == it.next().getSpuId()) {
                                arrayList.add(orderedFood);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
