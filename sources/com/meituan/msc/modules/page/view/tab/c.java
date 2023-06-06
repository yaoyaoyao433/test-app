package com.meituan.msc.modules.page.view.tab;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.msc.common.utils.ar;
import com.meituan.msc.common.utils.g;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.modules.update.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public b c;
    public View d;
    private TextView e;
    private TextView f;
    private f g;

    public c(Context context, f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824c90a3c13cd1c823aeb882be12b305", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824c90a3c13cd1c823aeb882be12b305");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4803e8ccb75faad313b6959e30f7ad81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4803e8ccb75faad313b6959e30f7ad81");
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ar.a(28.0f), ar.a(28.0f));
            layoutParams.topMargin = ar.a(3.0f);
            this.b = new ImageView(context);
            layoutParams.addRule(14, -1);
            this.b.setId(View.generateViewId());
            this.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.b, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            this.e = new TextView(context);
            layoutParams2.addRule(14, -1);
            layoutParams2.addRule(3, this.b.getId());
            this.e.setTextSize(12.0f);
            addView(this.e, layoutParams2);
        }
        this.g = fVar;
    }

    public final void setInfo(b bVar) {
        this.c = bVar;
    }

    public final b getInfo() {
        return this.c;
    }

    public final String getPagePath() {
        return this.c != null ? this.c.f : "";
    }

    public final void setTop(boolean z) {
        int dimensionPixelSize;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "308ca5a9fa4db1901bdae807ada5b6de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "308ca5a9fa4db1901bdae807ada5b6de");
            return;
        }
        if (z) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tab_bar_text_size_l);
            this.b.setVisibility(8);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tab_bar_text_size_s);
            this.b.setVisibility(0);
        }
        this.e.setTextSize(0, dimensionPixelSize);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b3c0320cf08e7b286a75845341ae55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b3c0320cf08e7b286a75845341ae55");
        } else if (this.d != null && this.d.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
    }

    public final void setTabBarBadge(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff0fba98649694b2afd3553bd3a912ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff0fba98649694b2afd3553bd3a912ba");
            return;
        }
        a();
        if (this.f == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(5, this.b.getId());
            layoutParams.leftMargin = ar.a(20.0f);
            this.f = new TextView(getContext());
            this.f.setEllipsize(TextUtils.TruncateAt.END);
            this.f.setMaxLines(1);
            this.f.setSingleLine(true);
            this.f.setMaxEms(3);
            this.f.setTextSize(12.0f);
            this.f.setTextColor(getResources().getColor(R.color.msc_white));
            this.f.setBackgroundResource(R.drawable.msc_badge_bg);
            addView(this.f, layoutParams);
        }
        this.f.setVisibility(0);
        if (str.matches("[0-9]+") && Integer.valueOf(str).intValue() > 99) {
            this.f.setText("99+");
        } else {
            this.f.setText(str);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1925a9046a4d4daa7a4457965d9e419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1925a9046a4d4daa7a4457965d9e419");
        } else if (this.f != null && this.f.getVisibility() == 0) {
            this.f.setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        String str;
        String str2;
        RequestCreator a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad76078e17fec13953b71cab4df3803a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad76078e17fec13953b71cab4df3803a");
            return;
        }
        super.setSelected(z);
        if (this.c == null) {
            return;
        }
        if (z) {
            str = this.c.b;
            str2 = this.c.d;
            if (TextUtils.isEmpty(str)) {
                str = "#3CC51F";
            }
        } else {
            str = this.c.a;
            str2 = this.c.c;
            if (TextUtils.isEmpty(str)) {
                str = "#7A7E83";
            }
        }
        this.e.setTextColor(g.a(str));
        this.e.setText(this.c.e);
        if (TextUtils.isEmpty(str2)) {
            setTop(true);
        }
        if (this.b.getVisibility() != 0 || (a2 = r.a(getContext(), str2, this.g.U_().d())) == null) {
            return;
        }
        a2.d().g().a(this.b);
    }
}
