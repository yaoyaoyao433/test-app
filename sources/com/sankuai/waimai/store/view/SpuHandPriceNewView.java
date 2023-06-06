package com.sankuai.waimai.store.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SpuHandPriceNewView extends LinearLayout {
    public static ChangeQuickRedirect a;
    protected View b;
    private View c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;

    public int getLayoutId() {
        return R.layout.wm_sc_hand_price_new_label;
    }

    public SpuHandPriceNewView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811e43e8bb4d4d90dbe8507c7e747823", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811e43e8bb4d4d90dbe8507c7e747823");
        }
    }

    public SpuHandPriceNewView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ad7e5d7fb369dd73c85bbbc332eb6bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ad7e5d7fb369dd73c85bbbc332eb6bb");
        }
    }

    public SpuHandPriceNewView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0877289d8fa1c64e71d7136c7205bfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0877289d8fa1c64e71d7136c7205bfc");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09f9d97888aa4941c5116bef5ec15b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09f9d97888aa4941c5116bef5ec15b45");
            return;
        }
        this.b = LayoutInflater.from(context).inflate(getLayoutId(), this);
        this.c = this.b.findViewById(R.id.fl_container);
        this.d = (TextView) this.b.findViewById(R.id.tv_hand_price_symbol);
        this.e = (TextView) this.b.findViewById(R.id.tv_hand_price_money);
        this.f = (TextView) findViewById(R.id.tv_hand_price_unit);
        this.g = (TextView) this.b.findViewById(R.id.tv_hand_price_desc);
    }

    public final void a(HandPriceInfo handPriceInfo, int i) {
        Object[] objArr = {handPriceInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ba6f9c3b9eee1d781c79169c994aa2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ba6f9c3b9eee1d781c79169c994aa2e");
        } else if (handPriceInfo == null) {
        } else {
            a(handPriceInfo.getHandActivityPriceText(), handPriceInfo.getHandActivityPriceSuffixText(), i);
        }
    }

    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd77ca27e90e3848f304fb9ccbe9c92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd77ca27e90e3848f304fb9ccbe9c92b");
            return;
        }
        u.a(this.e, str);
        if (i == 1) {
            u.a(this.g, "预估");
        } else {
            u.a(this.g, "预估到手价");
        }
        u.a(this.f, str2);
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fda5783ef7c9722ddf6311ebbd5dc7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fda5783ef7c9722ddf6311ebbd5dc7f");
            return;
        }
        u.a(this.e, str);
        u.a(this.g, str3);
        u.a(this.f, str2);
    }

    public void setTypeface(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962d0d825e1926c05acb7d32a9baf134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962d0d825e1926c05acb7d32a9baf134");
        } else if (typeface != null) {
            this.d.setTypeface(typeface);
            this.e.setTypeface(typeface);
        }
    }

    public void setContainerHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1e708aaab770b0acce24ad575332f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1e708aaab770b0acce24ad575332f09");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.height = i;
        this.c.setLayoutParams(layoutParams);
    }
}
