package com.sankuai.waimai.store.orderlist.view.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.store.orderlist.viewholder.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class OrderReportBaseProductWithImgBlock extends a {
    public static ChangeQuickRedirect f;
    private TextView a;
    private TextView b;
    public BitmapTransformation[] g;
    public String[] h;

    public OrderReportBaseProductWithImgBlock(@NonNull Context context, b bVar) {
        super(context, bVar);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4e8742ebd372d0e501f750ca83e022", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4e8742ebd372d0e501f750ca83e022");
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.view.base.a
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9926c7939208861c0a89f88e0c1457c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9926c7939208861c0a89f88e0c1457c9");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3342394bb7aa3c6a9a0cd387cb7afd50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3342394bb7aa3c6a9a0cd387cb7afd50");
        } else if (this.g == null || this.g.length == 0) {
            this.g = new BitmapTransformation[]{new ColorBitmapTransformation()};
            this.h = new String[]{"coverColor_0x08000000"};
        }
        this.a = (TextView) view.findViewById(R.id.wm_sc_order_list_item_report_many_products_money);
        this.b = (TextView) view.findViewById(R.id.wm_sc_order_list_item_report_many_products_num);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class ColorBitmapTransformation implements BitmapTransformation {
        public static ChangeQuickRedirect a;

        public ColorBitmapTransformation() {
        }

        @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
        public Bitmap transform(Bitmap bitmap, int i, int i2) {
            Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1feb4b2ad26bfd540544695fdc037431", RobustBitConfig.DEFAULT_VALUE)) {
                return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1feb4b2ad26bfd540544695fdc037431");
            }
            Bitmap a2 = com.sankuai.shangou.stone.util.b.a(bitmap, i, i2);
            new Canvas(a2).drawColor(134217728);
            return a2;
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.view.base.a
    public final void a(Order order) {
        boolean z;
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cc9dea4325c3d841c58e3876a6c820c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cc9dea4325c3d841c58e3876a6c820c");
        } else if (this.b == null) {
        } else {
            Object[] objArr2 = {order};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9faa70af4c3d1ceefa0820b3f23f81de", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9faa70af4c3d1ceefa0820b3f23f81de")).booleanValue();
            } else {
                z = !com.sankuai.shangou.stone.util.a.b(order.productList) && order.productCount > 0;
            }
            if (z) {
                this.b.setVisibility(0);
                this.b.setText(this.mContext.getString(R.string.wm_sc_order_list_order_all_count_desc, Integer.valueOf(order.productCount)));
                return;
            }
            this.b.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.orderlist.view.base.a
    public final void b(Order order) {
        Object[] objArr = {order};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f3a29bd1747bfeace1be7d3eee47672", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f3a29bd1747bfeace1be7d3eee47672");
        } else if (this.a != null) {
            this.a.setText(this.mContext.getString(R.string.wm_sc_order_list_order_total_price, i.a(order.getTotal())));
        }
    }
}
