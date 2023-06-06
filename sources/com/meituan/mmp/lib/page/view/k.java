package com.meituan.mmp.lib.page.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.utils.au;
import com.meituan.mmp.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private com.meituan.mmp.lib.model.a e;
    private com.meituan.mmp.lib.config.a f;
    private View g;

    public k(Context context, com.meituan.mmp.lib.config.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cec325f6a04dff6dfaa8349129d87a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cec325f6a04dff6dfaa8349129d87a4");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2137dab44482753f9cc58ba7aed75e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2137dab44482753f9cc58ba7aed75e0");
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(au.a(28.0f), au.a(28.0f));
            layoutParams.topMargin = au.a(3.0f);
            this.b = new ImageView(context);
            layoutParams.addRule(14, -1);
            this.b.setId(View.generateViewId());
            this.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.b, layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            this.c = new TextView(context);
            layoutParams2.addRule(14, -1);
            layoutParams2.addRule(3, this.b.getId());
            this.c.setTextSize(12.0f);
            addView(this.c, layoutParams2);
        }
        this.f = aVar;
    }

    public final void setInfo(com.meituan.mmp.lib.model.a aVar) {
        this.e = aVar;
    }

    public final com.meituan.mmp.lib.model.a getInfo() {
        return this.e;
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac236082a096558a215d3bb9f700e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac236082a096558a215d3bb9f700e2f");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.e.e = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.e.c = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.e.d = str3;
    }

    public final String getPagePath() {
        return this.e != null ? this.e.f : "";
    }

    public final void setTop(boolean z) {
        int dimensionPixelSize;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3fbeace958653750d5a6643f7f3a508", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3fbeace958653750d5a6643f7f3a508");
            return;
        }
        if (z) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tab_bar_text_size_l);
            this.b.setVisibility(8);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.tab_bar_text_size_s);
            this.b.setVisibility(0);
        }
        this.c.setTextSize(0, dimensionPixelSize);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7417c647a59d8fcbdb0c0d3b1c253a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7417c647a59d8fcbdb0c0d3b1c253a");
            return;
        }
        c();
        if (this.g == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(au.a(8.0f), au.a(8.0f));
            layoutParams.addRule(5, this.b.getId());
            layoutParams.leftMargin = au.a(30.0f);
            this.g = new View(getContext());
            this.g.setBackground(getResources().getDrawable(R.drawable.mmp_red_dot));
            addView(this.g, layoutParams);
        }
        this.g.setVisibility(0);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13107e88c63625edcc55e304d608e701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13107e88c63625edcc55e304d608e701");
        } else if (this.g != null && this.g.getVisibility() == 0) {
            this.g.setVisibility(8);
        }
    }

    public final void setTabBarBadge(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d215d24b1e31b9329e7012fbab875618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d215d24b1e31b9329e7012fbab875618");
            return;
        }
        b();
        if (this.d == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(5, this.b.getId());
            layoutParams.leftMargin = au.a(20.0f);
            this.d = new TextView(getContext());
            this.d.setEllipsize(TextUtils.TruncateAt.END);
            this.d.setMaxLines(1);
            this.d.setSingleLine(true);
            this.d.setMaxEms(3);
            this.d.setTextSize(12.0f);
            this.d.setTextColor(getResources().getColor(R.color.mmp_white));
            this.d.setBackgroundResource(R.drawable.mmp_badge_bg);
            addView(this.d, layoutParams);
        }
        this.d.setVisibility(0);
        if (str.matches("[0-9]+") && Integer.valueOf(str).intValue() > 99) {
            this.d.setText("99+");
        } else {
            this.d.setText(str);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a780f426334d20cccad1f49b95be20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a780f426334d20cccad1f49b95be20");
        } else if (this.d != null && this.d.getVisibility() == 0) {
            this.d.setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        String str;
        String str2;
        RequestCreator c;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1351d04fd741a9d89f4b20fca4d26894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1351d04fd741a9d89f4b20fca4d26894");
            return;
        }
        super.setSelected(z);
        if (this.e == null) {
            return;
        }
        if (z) {
            str = this.e.b;
            str2 = this.e.d;
            if (TextUtils.isEmpty(str)) {
                str = "#3CC51F";
            }
        } else {
            str = this.e.a;
            str2 = this.e.c;
            if (TextUtils.isEmpty(str)) {
                str = "#7A7E83";
            }
        }
        this.c.setTextColor(com.meituan.mmp.lib.utils.i.a(str));
        this.c.setText(this.e.e);
        if (TextUtils.isEmpty(str2)) {
            setTop(true);
        }
        if (this.b.getVisibility() != 0 || (c = s.c(getContext(), str2, this.f)) == null) {
            return;
        }
        c.d().g().a(this.b);
    }
}
