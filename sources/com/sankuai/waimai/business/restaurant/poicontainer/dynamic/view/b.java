package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view;

import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.d;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.e;
import com.sankuai.waimai.foundation.utils.q;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends LinearLayout {
    public static ChangeQuickRedirect a;
    public TagCanvasView b;
    public TextView c;
    public TextView d;
    private TextView e;
    private TextView f;

    public b(Context context) {
        super(context);
        View inflate;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a24bbf8c7cff0286b036e29f659a49d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a24bbf8c7cff0286b036e29f659a49d3");
            return;
        }
        if (d.a(context)) {
            inflate = e.a(context, R.layout.wm_dynamic_price_widget);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.wm_dynamic_price_widget, (ViewGroup) null);
        }
        this.b = (TagCanvasView) inflate.findViewById(R.id.price_coupang_tags);
        this.e = (TextView) inflate.findViewById(R.id.tv_coupon_price_hint);
        this.c = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_price);
        this.f = (TextView) inflate.findViewById(R.id.txt_stickyfood_price_postfix);
        this.d = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_original_price);
        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
            this.d.setVisibility(8);
            this.d = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_original_price_old_style);
            this.d.setVisibility(0);
        }
        new q().a(this.c);
        addView(inflate);
    }

    public final TagCanvasView getPriceTags() {
        return this.b;
    }

    public final TextView getPrice_text() {
        return this.c;
    }

    public final TextView getPrice_hint_text() {
        return this.e;
    }

    public final TextView getPrice_origin_text() {
        return this.d;
    }

    public final TextView getPrice_trail_text() {
        return this.f;
    }
}
