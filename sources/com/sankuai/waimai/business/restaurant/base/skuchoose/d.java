package com.sankuai.waimai.business.restaurant.base.skuchoose;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.stepper.RooStepper;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.q;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends a {
    public static ChangeQuickRedirect a;
    final Activity b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public ViewGroup j;
    public TextView k;
    public ImageView l;
    public TextView m;
    public TextView n;
    RooStepper o;
    TagCanvasView p;
    TagCanvasView q;
    com.sankuai.waimai.platform.widget.tag.virtualtag.g r;
    com.sankuai.waimai.platform.widget.tag.virtualtag.g s;
    Boolean t;
    private final View u;
    private TextView v;
    private RelativeLayout w;
    private ImageView x;
    private ImageView y;
    private TextView z;

    public d(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33dc7c15677dbeff3ce222cd17df5b8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33dc7c15677dbeff3ce222cd17df5b8a");
            return;
        }
        this.t = Boolean.valueOf(com.sankuai.waimai.business.restaurant.poicontainer.b.P());
        this.b = activity;
        this.u = view;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce740f7eff0509f0182f4cafeec970ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce740f7eff0509f0182f4cafeec970ba");
            return;
        }
        this.c = (TextView) view.findViewById(R.id.txt_price);
        this.d = (TextView) view.findViewById(R.id.tv_rmb_total);
        this.e = (TextView) view.findViewById(R.id.txt_price_start);
        new q().a(this.c);
        this.f = (TextView) view.findViewById(R.id.txt_price_unit);
        this.g = (TextView) view.findViewById(R.id.txt_origin_price);
        this.h = (TextView) view.findViewById(R.id.txt_sale_out);
        this.i = (TextView) view.findViewById(R.id.txt_sale_cant);
        this.k = (TextView) view.findViewById(R.id.txt_promotion_info);
        this.m = (TextView) view.findViewById(R.id.txt_add_shopcart);
        this.n = (TextView) view.findViewById(R.id.txt_skufood_count);
        this.l = (ImageView) view.findViewById(R.id.img_promotion_icon);
        this.o = (RooStepper) view.findViewById(R.id.roo_stepper);
        this.j = (ViewGroup) view.findViewById(R.id.ll_promotion_container);
        this.v = (TextView) view.findViewById(R.id.tv_coupon_price_hint);
        this.p = (TagCanvasView) view.findViewById(R.id.ai_promotion_tag);
        this.q = (TagCanvasView) view.findViewById(R.id.ai_full_discount_tag);
        f.a((TextView) view.findViewById(R.id.tv_rmb_sign));
        f.a(this.c);
        if (this.t.booleanValue()) {
            this.d.setTextSize(24.0f);
            ((TextView) view.findViewById(R.id.tv_rmb_sign)).setTextSize(18.0f);
            this.c.setTextSize(24.0f);
            this.g.setTextSize(18.0f);
            this.m.setTextSize(20.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            marginLayoutParams.topMargin = com.sankuai.waimai.foundation.utils.g.a(this.b, 13.0f);
            this.p.setLayoutParams(marginLayoutParams);
            this.q.setVisibility(8);
            this.w = (RelativeLayout) this.o.findViewById(R.id.roo_stepper_layout);
            this.x = (ImageView) this.o.findViewById(R.id.img_foodCount_dec);
            this.z = (TextView) this.o.findViewById(R.id.txt_foodCount_number);
            this.y = (ImageView) this.o.findViewById(R.id.img_foodCount_add);
            this.w.getLayoutParams().width = com.meituan.roodesign.widgets.internal.a.a(this.b, 90.0f);
            this.z.setTextSize(18.0f);
            this.o.setPadding(0, com.meituan.roodesign.widgets.internal.a.a(this.b, 10.0f), com.meituan.roodesign.widgets.internal.a.a(this.b, 16.0f), 0);
            this.x.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.y.setScaleType(ImageView.ScaleType.FIT_CENTER);
            a(this.x, 29);
            a(this.y, 29);
        }
    }

    private void a(View view, int i) {
        Object[] objArr = {view, 29};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3b568e932c2ec88298d131c87b36337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3b568e932c2ec88298d131c87b36337");
            return;
        }
        view.getLayoutParams().width = com.meituan.roodesign.widgets.internal.a.a(this.b, 29.0f);
        view.getLayoutParams().height = com.meituan.roodesign.widgets.internal.a.a(this.b, 29.0f);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.a
    public final void a(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885f90fc1cdc86f0d6a5b045d35c2f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885f90fc1cdc86f0d6a5b045d35c2f82");
            return;
        }
        a(d);
        if (d2 > 0.0d && d < d2) {
            String string = this.b.getString(R.string.wm_restaurant_origin_price, new Object[]{com.sankuai.waimai.foundation.utils.h.a(d2)});
            this.g.setText(string);
            this.g.setVisibility(0);
            String a2 = com.sankuai.waimai.foundation.utils.h.a(d);
            TextView textView = this.c;
            textView.setContentDescription("现价￥" + a2);
            TextView textView2 = this.g;
            textView2.setContentDescription("原价" + string);
            return;
        }
        this.g.setVisibility(8);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.a
    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d705ab3271388c2071e3e9cca08e969", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d705ab3271388c2071e3e9cca08e969");
            return;
        }
        String a2 = com.sankuai.waimai.foundation.utils.h.a(d);
        this.c.setText(a2);
        TextView textView = this.c;
        textView.setContentDescription("￥" + a2);
        if (this.e != null) {
            this.e.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ee12421febf81f489dcc09297a78d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ee12421febf81f489dcc09297a78d5");
        } else if (this.v != null) {
            if (aa.a(str)) {
                this.v.setVisibility(8);
                return;
            }
            this.v.setVisibility(0);
            this.v.setText(str);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7caf9c685757c7e77c7b6805a8ecad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7caf9c685757c7e77c7b6805a8ecad6");
            return;
        }
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.o.setVisibility(0);
        this.o.a(i);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.a
    public final void a(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45cfcf683d9bafe311d13e959f1aefd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45cfcf683d9bafe311d13e959f1aefd2");
            return;
        }
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.o.setVisibility(4);
        this.m.setVisibility(0);
        this.m.setText(str);
        this.m.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(com.meituan.android.singleton.b.a, R.drawable.wm_restaurant_icon_add_good_plus), (Drawable) null, (Drawable) null, (Drawable) null);
        this.m.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 6.0f));
        this.m.setOnClickListener(onClickListener);
        this.n.setVisibility(8);
    }

    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.a
    public final void b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b77e84c83a3bf36a0abe1072a74e3cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b77e84c83a3bf36a0abe1072a74e3cd");
            return;
        }
        this.i.setVisibility(8);
        this.h.setVisibility(0);
        this.o.setVisibility(4);
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        if (!aa.a(str)) {
            this.h.setText(str);
        } else {
            this.h.setText(R.string.wm_restaurant_foodList_adapter_sold_out);
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.a
    public final void a(int i, boolean z, int i2, boolean z2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        Object[] objArr = {Integer.valueOf(i), (byte) 0, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), null, onClickListener2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf7c376d7921729338eda55ba95d4ab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf7c376d7921729338eda55ba95d4ab0");
        } else if (z2) {
            a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_min_order_count_tip, Integer.valueOf(i2)), onClickListener2);
        } else if (i != 0) {
            a(i);
        } else {
            a(com.meituan.android.singleton.b.a.getString(R.string.wm_shop_add_good_to_shopping_cart), onClickListener2);
        }
    }

    public final void a(boolean z) {
        Drawable drawable;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ce683e5335ac694ec81686041f53fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ce683e5335ac694ec81686041f53fd");
            return;
        }
        if (z) {
            drawable = ContextCompat.getDrawable(com.meituan.android.singleton.b.a, R.drawable.wm_restaurant_icon_add_good_plus_white);
        } else {
            drawable = ContextCompat.getDrawable(com.meituan.android.singleton.b.a, R.drawable.wm_restaurant_icon_add_good_plus);
        }
        this.m.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        this.m.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 6.0f));
    }
}
