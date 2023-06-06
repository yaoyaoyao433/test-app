package com.sankuai.waimai.business.restaurant.poicontainer.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.domain.core.goods.GoodsRemind;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private Context b;
    private List<GoodsRemind> c;

    public m(Context context, List<GoodsRemind> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f19fe649ccdd072a6f9421efa70733f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f19fe649ccdd072a6f9421efa70733f");
            return;
        }
        this.b = context;
        this.c = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04bf0447d3f8f1b017c6c32d5a90ac41", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04bf0447d3f8f1b017c6c32d5a90ac41");
        } else if (this.c != null && this.c.size() > 0) {
            LinearLayout linearLayout = new LinearLayout(this.b);
            if (this.c.size() > 1) {
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                TextView textView = new TextView(this.b);
                textView.setHeight(com.sankuai.waimai.foundation.utils.g.a(this.b, 30.0f));
                linearLayout.addView(textView);
                for (int i = 0; i < this.c.size(); i++) {
                    View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_sold_status_mul_layout, (ViewGroup) null);
                    ((LinearLayout) inflate.findViewById(R.id.ll_singleline)).setVisibility(8);
                    ((TextView) inflate.findViewById(R.id.multiline_takeout_sold_status_title)).setText(this.c.get(i).getTitle());
                    ((TextView) inflate.findViewById(R.id.multiline_takeout_sold_status_content)).setText(this.c.get(i).getContent());
                    linearLayout.addView(inflate);
                }
            } else {
                linearLayout = (LinearLayout) LayoutInflater.from(this.b).inflate(R.layout.wm_restaurant_sold_status_mul_layout, (ViewGroup) null);
                ((LinearLayout) linearLayout.findViewById(R.id.ll_multiline)).setVisibility(8);
                ((TextView) linearLayout.findViewById(R.id.singleline_takeout_sold_status_title)).setText(this.c.get(0).getTitle());
                ((TextView) linearLayout.findViewById(R.id.singleline_takeout_sold_status_content)).setText(this.c.get(0).getContent());
            }
            new CustomDialog.a(this.b).a(linearLayout).b(this.b.getString(R.string.wm_restaurant_i_know), (DialogInterface.OnClickListener) null).a().show();
        }
    }
}
