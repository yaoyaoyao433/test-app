package com.sankuai.waimai.store.orderlist.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.orderlist.view.OrderClickCustomRecyclerView;
import com.sankuai.waimai.store.orderlist.view.base.OrderReportBaseProductWithImgBlock;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends OrderReportBaseProductWithImgBlock {
    public static ChangeQuickRedirect a;
    Order b;
    int c;
    private OrderClickCustomRecyclerView i;
    private f<Order.b, com.sankuai.waimai.store.newwidgets.list.b> j;

    @Override // com.sankuai.waimai.store.orderlist.view.base.a
    public final int a() {
        return R.layout.wm_sc_order_list_item_report_many_products;
    }

    public c(@NonNull Context context, com.sankuai.waimai.store.orderlist.viewholder.b bVar) {
        super(context, bVar);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db5a0200f10430df97816bf7292a803", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db5a0200f10430df97816bf7292a803");
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.view.base.OrderReportBaseProductWithImgBlock, com.sankuai.waimai.store.orderlist.view.base.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a20a014890f1080a7e9277567dabdbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a20a014890f1080a7e9277567dabdbf");
            return;
        }
        super.a(view);
        this.i = (OrderClickCustomRecyclerView) view.findViewById(R.id.wm_sc_order_list_item_report_many_products_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.i.setLayoutManager(linearLayoutManager);
        this.j = new a(new com.sankuai.waimai.store.newwidgets.list.b() { // from class: com.sankuai.waimai.store.orderlist.view.c.1
        });
        this.i.setAdapter(this.j);
        this.i.setCustomRecyclerViewClick(new OrderClickCustomRecyclerView.c() { // from class: com.sankuai.waimai.store.orderlist.view.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.orderlist.view.OrderClickCustomRecyclerView.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a173d62c24b954603730d4bde42f910", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a173d62c24b954603730d4bde42f910");
                } else if (c.this.e == null || c.this.b == null) {
                } else {
                    c.this.e.a(c.this.b, c.this.c);
                }
            }

            @Override // com.sankuai.waimai.store.orderlist.view.OrderClickCustomRecyclerView.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9c9dcc9d1484b8db5907968a9a783ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9c9dcc9d1484b8db5907968a9a783ff");
                } else if (c.this.e == null || c.this.b == null) {
                } else {
                    c.this.e.b(c.this.b, c.this.c);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.orderlist.view.base.a
    public final void a(Order order, int i) {
        Object[] objArr = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8549992c79b125ff09cb41e01d605a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8549992c79b125ff09cb41e01d605a");
        } else if (com.sankuai.shangou.stone.util.a.b(order.productList)) {
        } else {
            this.b = order;
            this.c = i;
            this.j.b_(order.productList);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends f<Order.b, com.sankuai.waimai.store.newwidgets.list.b> {
        public static ChangeQuickRedirect a;

        public a(@NonNull com.sankuai.waimai.store.newwidgets.list.b bVar) {
            super(bVar);
            Object[] objArr = {c.this, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a3547bbcc58218a7ec5697f684833f5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a3547bbcc58218a7ec5697f684833f5");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.f
        @NonNull
        public final g a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1faa540153f8cc975659ed97d9d09e0e", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1faa540153f8cc975659ed97d9d09e0e") : new b();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends g<Order.b, com.sankuai.waimai.store.newwidgets.list.b> {
        public static ChangeQuickRedirect a;
        public ImageView b;
        public TextView c;

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final int a() {
            return R.layout.wm_sc_order_list_item_report_many_products_item;
        }

        private b() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f48b7ba8a6990bc72d2e1c573a9e207", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f48b7ba8a6990bc72d2e1c573a9e207");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final /* synthetic */ void a(Order.b bVar, int i) {
            Order.b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99b393b65aac6f5d212437f9c6e335c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99b393b65aac6f5d212437f9c6e335c9");
            } else if (bVar2 != null) {
                if (TextUtils.isEmpty(bVar2.c)) {
                    this.c.setVisibility(0);
                    return;
                }
                this.c.setVisibility(8);
                b.C0608b a2 = m.a(bVar2.c).a(c.this.g, c.this.h);
                a2.i = R.drawable.wm_sc_common_poi_error;
                a2.a(this.b);
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2faf1941a771275214327cabce48cede", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2faf1941a771275214327cabce48cede");
                return;
            }
            this.b = (ImageView) view.findViewById(R.id.wm_sc_order_list_item_report_many_products_item_img);
            this.c = (TextView) view.findViewById(R.id.wm_sc_order_list_item_report_many_products_item_state);
        }
    }
}
