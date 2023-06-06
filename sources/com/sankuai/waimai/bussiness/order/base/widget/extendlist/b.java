package com.sankuai.waimai.bussiness.order.base.widget.extendlist;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.model.c;
import com.sankuai.waimai.foundation.utils.ah;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends d<c.a> {
    public static ChangeQuickRedirect a;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b94cde4b75595b4d1c44d64c3dc36fe7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b94cde4b75595b4d1c44d64c3dc36fe7");
            return;
        }
        this.f = -32768;
        this.g = -14539738;
        this.h = -11052967;
        this.i = -4408131;
        this.j = this.e.getResources().getColor(R.color.wm_order_confirm_time_highlight);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        String str;
        String str2;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30731d1b23c3e27970d8307995613e56", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30731d1b23c3e27970d8307995613e56");
        }
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.e).inflate(R.layout.wm_order_base_adapter_delivery_time_item_sub, viewGroup, false);
            aVar.a = (TextView) view2.findViewById(R.id.txt_delivery_time_item);
            aVar.b = (TextView) view2.findViewById(R.id.txt_adapter_ship_fee);
            aVar.c = (ImageView) view2.findViewById(R.id.img_pre_delivery_time_check);
            view2.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        c.a aVar2 = (c.a) this.d.get(i);
        aVar.a.setText(aVar2.b);
        if (aVar2.a()) {
            TextView textView = aVar.b;
            if (TextUtils.isEmpty(aVar2.k)) {
                str2 = "";
            } else {
                str2 = CommonConstant.Symbol.BRACKET_LEFT + aVar2.k + CommonConstant.Symbol.BRACKET_RIGHT;
            }
            ah.a(textView, str2);
            aVar.a.setTextColor(this.i);
            aVar.b.setTextColor(this.i);
            aVar.c.setVisibility(4);
        } else {
            TextView textView2 = aVar.b;
            if (TextUtils.isEmpty(aVar2.h)) {
                str = "";
            } else {
                str = CommonConstant.Symbol.BRACKET_LEFT + aVar2.h + CommonConstant.Symbol.BRACKET_RIGHT;
            }
            ah.a(textView2, str);
            if (this.c == i) {
                aVar.a.setTextColor(this.f);
                aVar.b.setTextColor(this.f);
                aVar.c.setVisibility(0);
                aVar.c.setContentDescription("已选中");
            } else {
                aVar.a.setTextColor(this.g);
                aVar.c.setVisibility(4);
                if (aVar2.i == 1) {
                    aVar.b.setTextColor(this.j);
                } else {
                    aVar.b.setTextColor(this.h);
                }
            }
        }
        return view2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a {
        public TextView a;
        public TextView b;
        public ImageView c;

        public a() {
        }
    }
}
