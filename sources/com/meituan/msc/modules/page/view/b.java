package com.meituan.msc.modules.page.view;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.msc.common.utils.g;
import com.meituan.msc.common.utils.i;
import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.engine.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends CustomNavigationBar implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private View b;
    private RelativeLayout c;
    private RelativeLayout d;
    private ImageView e;
    private ImageView f;
    private View g;
    private View h;
    private TextView i;
    private LinearLayout j;
    private TextView k;
    private RelativeLayout.LayoutParams l;
    private ImageView m;
    private h n;
    private String o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private ProgressBar u;
    private Integer v;

    /* JADX WARN: Removed duplicated region for block: B:52:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r22, boolean r23, com.meituan.msc.modules.engine.h r24, boolean r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.page.view.b.<init>(android.content.Context, boolean, com.meituan.msc.modules.engine.h, boolean, java.lang.String):void");
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final void setNavigationBarTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd2abd5652a14e6f27bd695908575d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd2abd5652a14e6f27bd695908575d5c");
        } else if (this.k != null) {
            this.k.setText(charSequence);
        }
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final void setNavigationBarTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0729761bf149d02c898ec956914a15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0729761bf149d02c898ec956914a15");
        } else if (this.k != null) {
            this.k.setTextColor(i);
        }
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    @SuppressLint({"ParseColorDetector"})
    public final void setNavigationBarIconColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e5ebc36498c42ea80988d3f8e388c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e5ebc36498c42ea80988d3f8e388c1");
            return;
        }
        this.v = Integer.valueOf(i);
        if (this.m != null && this.m.getVisibility() == 0) {
            this.m.setImageDrawable(a(this.m.getDrawable(), ColorStateList.valueOf(i)));
            i.a(this.m);
        }
        if (this.c != null) {
            if (this.e.getDrawable() == null) {
                this.e.setImageResource(R.drawable.msc_more);
            }
            this.e.setImageDrawable(a(this.e.getDrawable(), ColorStateList.valueOf(i)));
            i.a(this.e);
        }
        if (this.d != null) {
            this.f.setImageDrawable(a(this.f.getDrawable(), ColorStateList.valueOf(i)));
            i.a(this.f);
        }
        if (i != -1) {
            if (this.g != null) {
                this.g.setBackgroundColor(g.a("#2d727272"));
            }
            if (this.c != null) {
                this.c.setBackground(getResources().getDrawable(R.drawable.msc_toolbar_more_white));
            }
            if (this.d != null) {
                this.d.setBackground(getResources().getDrawable(R.drawable.msc_toolbar_close_white));
            }
        } else {
            if (this.g != null) {
                this.g.setBackgroundResource(R.drawable.msc_dark_separate);
            }
            if (this.c != null) {
                this.c.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_more_dark));
            }
            if (this.d != null) {
                this.d.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_close_dark));
            }
        }
        setShareButtonStyle(Integer.valueOf(i));
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final void showNavigationBarMoreMenu(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54ef602069a49dc0e5d674956a56b77f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54ef602069a49dc0e5d674956a56b77f");
        } else if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7df32d925ebfec060cd23d06cbb39000", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7df32d925ebfec060cd23d06cbb39000");
                return;
            }
            this.t = true;
            if (this.b == null) {
                this.b = attachMenuView();
                this.i = (TextView) findViewById(R.id.mmp_share);
                this.i.setOnClickListener(this);
                this.h = findViewById(R.id.capsule);
                if (this.s || !this.p) {
                    this.h.setVisibility(8);
                }
            }
            if (this.i == null || this.i.getVisibility() == 0) {
                return;
            }
            this.i.setVisibility(0);
            setShareButtonStyle(this.v);
            this.menuRect = null;
        }
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final void showNavigationBarLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50b4b61448c86224067d0d3c5925692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50b4b61448c86224067d0d3c5925692");
            return;
        }
        if (this.u == null) {
            this.u = new ProgressBar(getContext());
            this.u.setIndeterminateDrawable(getContext().getDrawable(R.drawable.msc_anim_navigation_loading));
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.msc_navigation_bar_loading_size);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            layoutParams.gravity = 16;
            layoutParams.setMarginStart(-dimensionPixelSize);
            this.j.addView(this.u, layoutParams);
        }
        if (this.u != null) {
            this.u.setVisibility(0);
        }
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final void hideNavigationBarLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50768b780dc06e2edcc0141655bbc90f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50768b780dc06e2edcc0141655bbc90f");
        } else if (this.u != null) {
            this.u.setVisibility(8);
        }
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final void hideNavigationBarMoreMenu(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8fd21eeef4478e5eb9c386196368ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8fd21eeef4478e5eb9c386196368ac7");
        } else if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c66bde74fedaacf4a57da3be104790b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c66bde74fedaacf4a57da3be104790b");
                return;
            }
            this.t = false;
            if (this.i != null) {
                this.i.setVisibility(8);
                this.menuRect = null;
            }
        }
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final boolean isMenuButtonShown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f58da9bbd13678faca24915d15b519", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f58da9bbd13678faca24915d15b519")).booleanValue() : (this.i != null && this.i.getVisibility() == 0) || (this.h != null && this.h.getVisibility() == 0);
    }

    private static Drawable a(Drawable drawable, ColorStateList colorStateList) {
        Object[] objArr = {drawable, colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6454afc04fd0299705dc31399fe318ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6454afc04fd0299705dc31399fe318ad");
        }
        if (drawable == null) {
            com.meituan.msc.modules.reporter.g.c("drawable can't be nil!");
            return null;
        }
        Drawable mutate = DrawableCompat.wrap(drawable).mutate();
        DrawableCompat.setTintList(mutate, colorStateList);
        return mutate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba04544de308d7e4620ef1219fe9d5f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba04544de308d7e4620ef1219fe9d5f");
            return;
        }
        int id = view.getId();
        if (id == R.id.img_back) {
            onUserClickBackIcon();
        } else if (id == R.id.close_button) {
            onUserClickCloseIcon();
        } else if (id != R.id.more_button) {
            if (id == R.id.mmp_share) {
                onUserClickShareIcon();
            }
        } else {
            MenuDialog menuDialog = new MenuDialog(getContext(), this.n, this);
            if (menuDialog.isShowing()) {
                return;
            }
            menuDialog.show();
        }
    }

    public final String getAppName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "483a5f6e3ff0907e92d1cf2809ba566e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "483a5f6e3ff0907e92d1cf2809ba566e") : this.n.r.k();
    }

    public final String getAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b11c1fa46f83e7100143154034aaefbd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b11c1fa46f83e7100143154034aaefbd") : this.n.r.j();
    }

    @Override // com.meituan.msc.modules.page.view.CustomNavigationBar
    public final Rect getMenuRect() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb1fc3bd7a8abb95d10f0c29312978c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb1fc3bd7a8abb95d10f0c29312978c");
        }
        Rect rect = this.menuRect;
        if (rect == null) {
            rect = new Rect();
            this.menuView.measure(0, 0);
            int i2 = this.i != null ? ((LinearLayout.LayoutParams) this.i.getLayoutParams()).rightMargin : 0;
            int measuredWidth = this.menuView.getMeasuredWidth() - ((this.p || !this.t) ? 0 : i2);
            int measuredHeight = this.menuView.getMeasuredHeight();
            int a2 = n.a(getContext()) - ((RelativeLayout.LayoutParams) this.menuView.getLayoutParams()).rightMargin;
            if (!this.p && this.t) {
                i = i2;
            }
            rect.right = a2 - i;
            rect.left = rect.right - measuredWidth;
            if (measuredHeight == 0) {
                rect.top = n.c() + (n.b(15) / 2);
                rect.bottom = rect.top + n.b(30);
            } else {
                rect.top = n.c() + ((getFixedHeight() - measuredHeight) / 2);
                rect.bottom = rect.top + measuredHeight;
            }
            this.menuRect = rect;
        }
        return rect;
    }

    private void setShareButtonStyle(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1145f9ad98dcdcb4dfd85e92ca541427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1145f9ad98dcdcb4dfd85e92ca541427");
        } else if (this.i == null || this.i.getVisibility() != 0 || num == null) {
        } else {
            if (num.intValue() != -1) {
                this.i.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_share_white));
            } else {
                this.i.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_share_dark));
            }
            this.i.setTextColor(num.intValue());
        }
    }
}
