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
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice.HandPriceWithUnit;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private HandPriceWithUnit c;
    private LinearLayout d;
    private TextView e;
    private TextView f;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5abe40a6696f74ec052cc465eb55ed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5abe40a6696f74ec052cc465eb55ed3");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc8b9a5d7815861843749ea7e89a5de", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc8b9a5d7815861843749ea7e89a5de") : layoutInflater.inflate(R.layout.wm_sc_drug_estimated_price_label, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e073a8fabbf7ee1aa9081cb3ff3c41a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e073a8fabbf7ee1aa9081cb3ff3c41a5");
            return;
        }
        super.onViewCreated();
        this.b = (LinearLayout) findView(R.id.ll_drug_label_container);
        this.c = (HandPriceWithUnit) findView(R.id.multi_price_unit);
        this.d = (LinearLayout) findView(R.id.ll_estimated_price_money_symbol);
        this.e = (TextView) findView(R.id.tv_goods_estimated_price);
        this.f = (TextView) findView(R.id.tv_estimated_price_of_text_hint);
        float a2 = h.a(getContext(), 4.0f);
        this.f.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_FFF3F2)).a(a2, 0.0f, 0.0f, a2).a());
        this.d.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_color_FF720D), com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sc_color_FF4060)}).a(0.0f, a2, a2, 0.0f).a());
    }

    public final void a(HandPriceInfo handPriceInfo, float f, float f2) {
        Object[] objArr = {handPriceInfo, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ac60ed941c6c6b3936e1b4db1c5e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ac60ed941c6c6b3936e1b4db1c5e5e");
        } else if (p.a(handPriceInfo)) {
            u.c(getView());
        } else {
            String a2 = i.a(handPriceInfo.getHandActivityPrice());
            String handPriceLabel = handPriceInfo.getHandPriceLabel();
            if (t.a(handPriceLabel) || t.a(a2)) {
                u.c(getView());
                return;
            }
            u.a(getView());
            if (handPriceInfo.isShowNewMultiUnitStyle()) {
                u.a(this.c);
                u.c(this.b);
                HandPriceWithUnit handPriceWithUnit = this.c;
                handPriceWithUnit.b = f;
                handPriceWithUnit.c = f2;
                this.c.a(handPriceInfo, false);
                return;
            }
            u.a(this.b);
            u.c(this.c);
            u.a(this.e, a2);
            u.a(this.f, handPriceLabel);
        }
    }
}
