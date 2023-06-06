package com.sankuai.waimai.store.cell.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private TextView c;
    private TextView d;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0f55b58167ebf5c37896331d119050", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0f55b58167ebf5c37896331d119050");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53692f632de0fa35b7b2744a3e20df47", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53692f632de0fa35b7b2744a3e20df47") : layoutInflater.inflate(R.layout.wm_sc_default_estimated_price_label, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bab9ac276ac78572507c5fa9ad66e554", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bab9ac276ac78572507c5fa9ad66e554");
            return;
        }
        super.onViewCreated();
        this.b = (LinearLayout) findView(R.id.ll_estimated_price_money_symbol);
        this.c = (TextView) findView(R.id.tv_goods_estimated_price);
        this.d = (TextView) findView(R.id.tv_estimated_price_of_text_hint);
        float a2 = h.a(getContext(), 4.0f);
        this.b.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_color_FF720D), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_color_FF2C50)}).a(a2, 0.0f, 0.0f, a2).a());
        this.d.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_color_FFF5F5), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_color_FFE7E7)}).a(0.0f, a2, a2, 0.0f).a());
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f0b4663706bad7c4e55942bd9f8315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f0b4663706bad7c4e55942bd9f8315");
        } else if (t.a(str2) || t.a(str)) {
            u.c(getView());
        } else {
            u.a(getView());
            u.a(this.c, str);
            u.a(this.d, str2);
        }
    }
}
