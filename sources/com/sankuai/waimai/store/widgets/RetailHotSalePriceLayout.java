package com.sankuai.waimai.store.widgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.util.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RetailHotSalePriceLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    protected int b;
    protected int c;
    private Context d;
    private TextView e;
    private TextView f;
    private View g;

    private void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c69b78e8f4b22ac35ac2638998a55b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c69b78e8f4b22ac35ac2638998a55b");
            return;
        }
        this.d = context;
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.wm_sc_layout_price, (ViewGroup) this, true);
        this.e = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_price_fix);
        this.f = (TextView) inflate.findViewById(R.id.txt_stickyfoodList_adapter_food_original_price_fix);
        this.g = inflate.findViewById(R.id.iv_member_price_tag);
        this.b = b.b(this.d, R.color.wm_sc_price_red);
        this.c = b.b(this.d, R.color.wm_sg_color_603f23);
    }

    public void setOriginPrice(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814f2a38c356ac2c4fa7bbb11c5ca05f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814f2a38c356ac2c4fa7bbb11c5ca05f");
        } else {
            this.f.setText(str);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a8ba018fb2842451375c80e33906050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a8ba018fb2842451375c80e33906050");
            return;
        }
        u.a(this.e, this.f);
        u.c(this.g);
        this.e.setTextColor(this.b);
        this.e.setText(a(str));
    }

    public final void b(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1885292cd05468b214133fae512cf099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1885292cd05468b214133fae512cf099");
            return;
        }
        u.a(this.e, this.g);
        u.c(this.f);
        this.e.setTextColor(this.c);
        this.e.setText(a(str));
    }

    private CharSequence a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c15ab25a013d2b134df14e8dbf5e0b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c15ab25a013d2b134df14e8dbf5e0b2");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(h.a(this.d, 12.0f)), 0, 1, 33);
        return spannableStringBuilder;
    }

    public RetailHotSalePriceLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf27d49876de2299e51edfab5ea46b89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf27d49876de2299e51edfab5ea46b89");
        } else {
            a(context);
        }
    }

    public RetailHotSalePriceLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f679ed85e2eb8c1911dedc2b1cdd3ddc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f679ed85e2eb8c1911dedc2b1cdd3ddc");
        } else {
            a(context);
        }
    }

    public RetailHotSalePriceLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf0aaac719de9893bd01ce151606d70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf0aaac719de9893bd01ce151606d70");
        } else {
            a(context);
        }
    }
}
