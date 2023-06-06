package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final c b;

    public e(c cVar) {
        this.b = cVar;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "260e0f7b8eeae0df7f34c1501178a897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "260e0f7b8eeae0df7f34c1501178a897");
            return;
        }
        c cVar = this.b;
        Boolean bool = (Boolean) obj;
        Object[] objArr2 = {cVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9848135f655314468c800f41050eb0eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9848135f655314468c800f41050eb0eb");
        } else if (bool == null) {
            u.c(cVar.J);
        } else {
            boolean booleanValue = bool.booleanValue();
            Object[] objArr3 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b1233300f381e5261cc871e1ce853296", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b1233300f381e5261cc871e1ce853296");
                return;
            }
            View findViewById = cVar.y.findViewById(R.id.shop_cart_view);
            View findViewById2 = cVar.y.findViewById(R.id.mrn_shopcart_layout);
            if (!booleanValue) {
                u.c(cVar.J);
                u.a(findViewById, findViewById2);
                return;
            }
            if (cVar.J == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.sankuai.shangou.stone.util.h.a(cVar.y, 90.0f));
                layoutParams.addRule(12);
                cVar.J = new FrameLayout(cVar.y);
                float a2 = com.sankuai.shangou.stone.util.h.a(cVar.y, 12.0f);
                cVar.J.setBackground(new e.a().c(-1).a(a2, a2, 0.0f, 0.0f).a());
                cVar.J.setOnClickListener(k.a(cVar));
                TextView textView = new TextView(cVar.y);
                textView.setText(R.string.wm_st_shop_cart_im);
                textView.setTextColor(-32766);
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(Typeface.defaultFromStyle(1));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 1;
                layoutParams2.topMargin = com.sankuai.shangou.stone.util.h.a(cVar.y, 17.0f);
                cVar.J.addView(textView, layoutParams2);
                cVar.C.addView(cVar.J, layoutParams);
            }
            u.c(findViewById, findViewById2);
            u.a(cVar.J);
        }
    }
}
