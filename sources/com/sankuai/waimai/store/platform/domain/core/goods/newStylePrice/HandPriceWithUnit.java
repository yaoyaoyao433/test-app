package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HandPriceWithUnit extends LinearLayout {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    private TextView d;
    private TextView e;
    private View f;
    private TextView g;
    private TextView h;
    private TextView i;

    public HandPriceWithUnit(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e4d57a7372f0c52d406a9df9d09c840", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e4d57a7372f0c52d406a9df9d09c840");
        }
    }

    public HandPriceWithUnit(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8735b51f5e03b266efb4366e5f394d23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8735b51f5e03b266efb4366e5f394d23");
        }
    }

    public HandPriceWithUnit(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81704fb402d6f34c404013658a33c22d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81704fb402d6f34c404013658a33c22d");
            return;
        }
        this.b = -1.0f;
        this.c = -1.0f;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf077a8771da6da983f5d2acee052f2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf077a8771da6da983f5d2acee052f2b");
            return;
        }
        z.a(context, R.layout.wm_drug_hand_price_with_unit, this, true);
        setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(context, R.color.wm_sg_color_FEF5F4)).a(h.a(context, 4.0f)).a());
        this.d = (TextView) findViewById(R.id.hand_price_label);
        this.e = (TextView) findViewById(R.id.hand_price_text);
        this.f = findViewById(R.id.hand_price_divider);
        this.g = (TextView) findViewById(R.id.hand_price_unit);
        this.h = (TextView) findViewById(R.id.hand_price_money_symbol);
        this.i = (TextView) findViewById(R.id.price_update_hand_price_money_symbol);
    }

    public final void a(HandPriceInfo handPriceInfo, boolean z) {
        Object[] objArr = {handPriceInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4698239725a0e75ace9c86a10d387a17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4698239725a0e75ace9c86a10d387a17");
        } else if (handPriceInfo == null) {
            u.c(this);
        } else {
            a();
            if (z) {
                a(handPriceInfo);
                return;
            }
            u.c(this.i);
            setHandLabelMarginRight(0);
            setHandPriceTextBold(true);
            u.c(this.d, this.f, this.e, this.g, this.h);
            if (!TextUtils.isEmpty(handPriceInfo.getHandPriceUnit())) {
                u.a(this.d, this.f, this.e, this.g);
                u.a(this.e, com.sankuai.waimai.foundation.utils.h.a(handPriceInfo.getHandActivityPrice()));
                u.a(this.d, handPriceInfo.getHandPriceLabel());
                u.a(this.g, getContext().getString(R.string.wm_sc_nox_search_hand_price_unit, handPriceInfo.getHandPriceUnit()));
                u.a(this.h);
            } else if (TextUtils.isEmpty(handPriceInfo.getHandPriceLabel())) {
                u.c(this);
            } else if (handPriceInfo.isShowNewStyle()) {
                u.a(this.d);
                u.a(this.d, handPriceInfo.getHandPriceLabel());
            } else {
                u.a(this.d);
                u.a(this.d, handPriceInfo.getHandPriceLabel());
                if (com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(handPriceInfo.getHandActivityPrice()), Double.valueOf(0.0d))) {
                    u.a(this.e);
                    u.a(this.f);
                    u.a(this.h);
                    u.a(this.e, com.sankuai.waimai.foundation.utils.h.a(handPriceInfo.getHandActivityPrice()));
                }
            }
        }
    }

    private void a(HandPriceInfo handPriceInfo) {
        Object[] objArr = {handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8370caf0b20e3e7620940ed95531d57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8370caf0b20e3e7620940ed95531d57");
            return;
        }
        u.c(this.f);
        u.c(this.h);
        setHandLabelMarginRight(h.a(getContext(), 2.0f));
        u.a(this.d, handPriceInfo.getHandPriceLabel());
        setHandPriceTextBold(false);
        if (com.sankuai.waimai.foundation.utils.h.d(Double.valueOf(handPriceInfo.getHandActivityPrice()), Double.valueOf(0.0d))) {
            u.a(this.i);
            u.a(this.e, com.sankuai.waimai.foundation.utils.h.a(handPriceInfo.getHandActivityPrice()));
        } else {
            u.c(this.i);
            u.c(this.e);
        }
        if (TextUtils.isEmpty(handPriceInfo.getHandPriceUnit())) {
            u.c(this.g);
        } else {
            u.a(this.g, getContext().getString(R.string.wm_sc_nox_search_hand_price_unit, handPriceInfo.getHandPriceUnit()));
        }
    }

    private void setHandPriceTextBold(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0b4aa60ada1e57dfb38c75123a9330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0b4aa60ada1e57dfb38c75123a9330");
        } else if (z) {
            this.g.setTypeface(Typeface.DEFAULT_BOLD);
            this.h.setTypeface(Typeface.DEFAULT_BOLD);
            this.e.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            this.g.setTypeface(this.g.getTypeface(), 0);
            this.h.setTypeface(this.h.getTypeface(), 0);
            this.e.setTypeface(this.e.getTypeface(), 0);
        }
    }

    private void setHandLabelMarginRight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d58efb35fe44aad0bf4d96acb04481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d58efb35fe44aad0bf4d96acb04481");
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8feabf83f4849c1c43ddc997af9c6c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8feabf83f4849c1c43ddc997af9c6c51");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.h.b(Double.valueOf(this.b), Double.valueOf(0.0d)) || com.sankuai.waimai.foundation.utils.h.b(Double.valueOf(this.c), Double.valueOf(0.0d))) {
            this.b = 3.0f;
            this.c = 0.5f;
        }
        int a2 = h.a(getContext(), this.b);
        int a3 = h.a(getContext(), this.c);
        setPadding(a2, a3, a2, a3);
    }
}
