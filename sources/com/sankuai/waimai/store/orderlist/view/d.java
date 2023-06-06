package com.sankuai.waimai.store.orderlist.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.store.orderlist.view.base.OrderReportBaseProductWithImgBlock;
import com.sankuai.waimai.store.util.m;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends OrderReportBaseProductWithImgBlock {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;
    private ImageView i;
    private TextView j;
    private ImageView k;

    @Override // com.sankuai.waimai.store.orderlist.view.base.a
    public final int a() {
        return R.layout.wm_sc_order_list_item_report_one_product_with_img;
    }

    public d(@NonNull Context context, com.sankuai.waimai.store.orderlist.viewholder.b bVar) {
        super(context, bVar);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70db913542669a2d6230800c12220c97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70db913542669a2d6230800c12220c97");
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.view.base.OrderReportBaseProductWithImgBlock, com.sankuai.waimai.store.orderlist.view.base.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c619f4f1c4c72c1ad624270b53f1a02d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c619f4f1c4c72c1ad624270b53f1a02d");
            return;
        }
        super.a(view);
        this.b = (TextView) view.findViewById(R.id.wm_sc_order_list_item_report_one_product_with_img_product_desc);
        this.c = (TextView) view.findViewById(R.id.wm_sc_order_list_item_report_one_product_with_img_product_state);
        this.i = (ImageView) view.findViewById(R.id.wm_sc_order_list_item_report_one_product_with_img_product_img);
        this.j = (TextView) view.findViewById(R.id.wm_sc_order_list_item_report_one_product_delivery_desc);
        this.k = (ImageView) view.findViewById(R.id.wm_sc_order_list_item_presale_icon);
    }

    @Override // com.sankuai.waimai.store.orderlist.view.base.a
    public final void a(Order order, int i) {
        Order.b bVar;
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9308283e8a5f833a30bb51c520c5b2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9308283e8a5f833a30bb51c520c5b2db");
        } else if (com.sankuai.shangou.stone.util.a.b(order.productList) || (bVar = order.productList.get(0)) == null) {
        } else {
            if (TextUtils.isEmpty(bVar.c)) {
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
                b.C0608b a2 = m.a(bVar.c).a(this.g, this.h);
                a2.i = R.drawable.wm_sc_common_poi_error;
                a2.a(this.i);
            }
            if (TextUtils.isEmpty(bVar.f)) {
                this.k.setVisibility(8);
                this.b.setMaxLines(2);
            } else {
                this.k.setVisibility(0);
                this.b.setMaxLines(1);
                m.a(bVar.f).a(this.k);
            }
            if (!TextUtils.isEmpty(bVar.f) && order != null && order.arrivalTime > 0) {
                String string = this.mContext.getString(R.string.wm_sc_order_list_arrive_time);
                Date date = new Date(order.arrivalTime * 1000);
                Object[] objArr2 = {date, "MM月dd日 HH:mm"};
                ChangeQuickRedirect changeQuickRedirect2 = t.a;
                u.a(this.j, this.mContext.getString(R.string.wm_sc_order_list_order_deliver, string, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2e9f9e28f77c7ba0642ec3697e6ea820", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2e9f9e28f77c7ba0642ec3697e6ea820") : new SimpleDateFormat("MM月dd日 HH:mm").format(date)));
            } else {
                u.a(this.j, bVar.e);
            }
            this.b.setText(this.mContext.getString(R.string.wm_sc_order_list_order_count, bVar.b, Integer.valueOf(bVar.d)));
        }
    }
}
