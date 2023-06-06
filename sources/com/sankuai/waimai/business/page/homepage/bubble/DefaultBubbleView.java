package com.sankuai.waimai.business.page.homepage.bubble;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DefaultBubbleView extends RelativeLayout implements a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "DefaultBubbleView";
    private Context c;
    private RelativeLayout d;
    private TextView e;
    private ImageView f;
    private float g;
    private float h;

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void a() {
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public View getView() {
        return this;
    }

    public DefaultBubbleView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef2da93bc245751cc8c87067d6175b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef2da93bc245751cc8c87067d6175b2");
        }
    }

    public DefaultBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efd551f77e307de20f619d022b3061b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efd551f77e307de20f619d022b3061b");
        }
    }

    public DefaultBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e400f32001df0e996e3a6da3b47bafb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e400f32001df0e996e3a6da3b47bafb0");
            return;
        }
        this.g = 0.5f;
        this.h = 11.0f;
        this.c = context;
        this.d = new RelativeLayout(context);
        this.d.setId(View.generateViewId());
        this.d.setMinimumWidth(a(50.0f));
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FFD161"));
        gradientDrawable.setCornerRadius(a(50.0f));
        this.d.setBackground(gradientDrawable);
        this.d.setPaddingRelative(a(10.0f), a(8.5f), a(10.0f), a(8.5f));
        addView(this.d, layoutParams);
        this.e = new TextView(context);
        this.e.setId(View.generateViewId());
        this.e.setTextSize(this.h);
        this.e.setSingleLine();
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        this.e.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(15);
        this.d.addView(this.e, layoutParams2);
        this.f = new ImageView(context);
        this.f.setImageResource(R.drawable.bubble_view_arrow_default);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, this.d.getId());
        addView(this.f, layoutParams3);
    }

    public void setArrowPosition(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d53eeb048d33269eb11eba473a06b07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d53eeb048d33269eb11eba473a06b07c");
            return;
        }
        this.g = f;
        invalidate();
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void a(int[] iArr, View view) {
        Object[] objArr = {iArr, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e036389ce7636dd330acbab48da9e7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e036389ce7636dd330acbab48da9e7e");
            return;
        }
        view.getLocationInWindow(iArr);
        measure(0, 0);
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        int min = Math.min(Math.max((iArr[0] + (view.getWidth() / 2)) - (getMeasuredWidth() / 2), a(8.0f)), (displayMetrics.widthPixels - getMeasuredWidth()) - a(8.0f));
        int min2 = Math.min(Math.max(iArr[1] - getMeasuredHeight(), 0), displayMetrics.heightPixels - getMeasuredHeight());
        setArrowPosition(Math.abs(min - (iArr[0] + (view.getMeasuredWidth() / 2))) / getMeasuredWidth());
        if (com.sankuai.waimai.foundation.core.a.d()) {
            min2 += com.sankuai.waimai.foundation.utils.g.a(this.c, 14.0f);
        }
        iArr[0] = min;
        iArr[1] = min2;
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public int getBubbleWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8da8825c48f230e0ea52a1ed44dffa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8da8825c48f230e0ea52a1ed44dffa")).intValue() : getMeasuredWidth();
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public int getBubbledHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1711f7e2e851990414b11303678dde2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1711f7e2e851990414b11303678dde2")).intValue() : getMeasuredHeight();
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public int getBigBubbleMeasuredHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01babc1730dda14b2330b6c56c0108f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01babc1730dda14b2330b6c56c0108f1")).intValue() : getMeasuredHeight();
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11339b8a1bdf3328f1325abe276db105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11339b8a1bdf3328f1325abe276db105");
            return;
        }
        this.e.setText(charSequence);
        measure(0, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bbee96256ab72e873852fe25f307dd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bbee96256ab72e873852fe25f307dd2");
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), a(160.0f)), View.MeasureSpec.getMode(i)), i2);
        this.f.setX((this.d.getMeasuredWidth() * this.g) - (this.f.getMeasuredWidth() / 2));
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e111735b31f5685ea3dd25445286407", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e111735b31f5685ea3dd25445286407")).intValue() : (int) ((f * this.c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41dd99b783911172abb81f7499499abb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41dd99b783911172abb81f7499499abb");
            return;
        }
        ((GradientDrawable) this.d.getBackground()).setColor(Color.parseColor("#F8D723"));
        this.f.setImageResource(R.drawable.bubble_view_arrow_default_a);
    }
}
