package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.q;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.p;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends PopupWindow {
    public static ChangeQuickRedirect a;
    String b;
    long c;
    String d;
    InterfaceC0922a e;
    private LinearLayout f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0922a {
        void a(View view, ButtonItem buttonItem);
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c113b4e7d6ceb1c46ec6e31a4d3568a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c113b4e7d6ceb1c46ec6e31a4d3568a0");
            return;
        }
        this.f = new LinearLayout(context);
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f.setBackgroundResource(R.drawable.wm_order_detail_bottom_button);
        this.f.setOrientation(1);
        setContentView(this.f);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void a(String str, View view, List<ButtonItem> list) {
        TextView textView;
        q qVar;
        char c = 0;
        int i = 1;
        Object[] objArr = {str, view, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd1aabd845a2624a987a1ecdec70df87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd1aabd845a2624a987a1ecdec70df87");
            return;
        }
        this.f.removeAllViews();
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            return;
        }
        for (final ButtonItem buttonItem : list) {
            if (buttonItem != null) {
                Context context = view.getContext();
                Object[] objArr2 = new Object[i];
                objArr2[c] = context;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09c5a5d2a200d20446cb7d7f4adbcd37", RobustBitConfig.DEFAULT_VALUE)) {
                    textView = (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09c5a5d2a200d20446cb7d7f4adbcd37");
                } else {
                    textView = new TextView(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    int a2 = g.a(context, 12.0f);
                    layoutParams.rightMargin = a2;
                    layoutParams.leftMargin = a2;
                    int a3 = g.a(context, 7.0f);
                    layoutParams.bottomMargin = a3;
                    layoutParams.topMargin = a3;
                    textView.setLayoutParams(layoutParams);
                    textView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                    textView.setMaxLines(1);
                    textView.setTextSize(14.0f);
                    textView.setTextColor(-13421773);
                    textView.setGravity(17);
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr3 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5995577cefc2e9f93e480505177c846", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5995577cefc2e9f93e480505177c846");
                            return;
                        }
                        if (a.this.e != null) {
                            a.this.e.a(view2, buttonItem);
                        }
                        p.b(a.this);
                    }
                });
                textView.setText(buttonItem.title);
                if (buttonItem.code == 3112) {
                    String str2 = "-999";
                    if (str != null && !aa.a(str) && (qVar = (q) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(str, (Class<Object>) q.class)) != null && !aa.a(qVar.a)) {
                        str2 = qVar.a;
                    }
                    JudasManualManager.b("b_waimai_88scjqid_mv").a("c_hgowsqb").a("poi_id", i.a(this.c, this.d)).a("stid", str2).a(view.getContext()).a();
                }
                this.f.addView(textView);
                c = 0;
                i = 1;
            }
        }
        this.f.measure(0, 0);
        setHeight(this.f.getMeasuredHeight());
        setWidth(this.f.getMeasuredWidth());
        super.showAsDropDown(view, (view.getMeasuredWidth() - this.f.getMeasuredWidth()) / 2, 0, 48);
        com.sankuai.waimai.bussiness.order.detailnew.controller.b.a(list, this.b, this.c, this.d, view.getContext());
    }
}
