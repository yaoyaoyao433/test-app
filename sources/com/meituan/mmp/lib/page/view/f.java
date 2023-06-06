package com.meituan.mmp.lib.page.view;

import android.content.res.ColorStateList;
import android.graphics.Color;
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
import com.meituan.mmp.lib.page.MenuDialog;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends CustomNavigationBar implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private View b;
    private RelativeLayout c;
    private RelativeLayout d;
    private ImageView e;
    private ImageView f;
    private View g;
    private View h;
    private TextView i;
    private View j;
    private TextView k;
    private RelativeLayout.LayoutParams l;
    private ImageView m;
    private ProgressBar n;
    private com.meituan.mmp.lib.engine.m o;
    private com.meituan.mmp.lib.config.a p;
    private String q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;

    /* JADX WARN: Removed duplicated region for block: B:23:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r19, boolean r20, com.meituan.mmp.lib.engine.m r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.page.view.f.<init>(android.content.Context, boolean, com.meituan.mmp.lib.engine.m, boolean):void");
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final void setNavigationBarTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd2d066f38ee7729e6333cbf115ff0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd2d066f38ee7729e6333cbf115ff0f");
        } else if (this.k != null) {
            this.k.setText(charSequence);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final void setNavigationBarTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f211e4d06d27a3551a9acda7ca53d103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f211e4d06d27a3551a9acda7ca53d103");
        } else if (this.k != null) {
            this.k.setTextColor(i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final void setNavigationBarIconColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbf03f085b39a37dcb061054fb79c02e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbf03f085b39a37dcb061054fb79c02e");
            return;
        }
        if (this.m != null && this.m.getVisibility() == 0) {
            this.m.setImageDrawable(a(this.m.getDrawable(), ColorStateList.valueOf(i)));
            com.meituan.mmp.lib.utils.k.a(this.m);
        }
        if (this.c != null) {
            if (this.e.getDrawable() == null) {
                this.e.setImageResource(R.drawable.mmp_more);
            }
            this.e.setImageDrawable(a(this.e.getDrawable(), ColorStateList.valueOf(i)));
            com.meituan.mmp.lib.utils.k.a(this.e);
        }
        if (this.d != null) {
            this.f.setImageDrawable(a(this.f.getDrawable(), ColorStateList.valueOf(i)));
            com.meituan.mmp.lib.utils.k.a(this.f);
        }
        if (i != -1) {
            if (this.g != null) {
                try {
                    this.g.setBackgroundColor(Color.parseColor("#2d727272"));
                } catch (IllegalArgumentException e) {
                    com.meituan.mmp.lib.trace.b.c(e.toString());
                }
            }
            if (this.c != null) {
                this.c.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_more_white));
            }
            if (this.d != null) {
                this.d.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_close_white));
            }
            if (this.i != null) {
                this.i.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_share_white));
            }
        } else {
            if (this.g != null) {
                this.g.setBackgroundResource(R.drawable.dark_separate);
            }
            if (this.c != null) {
                this.c.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_more_dark));
            }
            if (this.d != null) {
                this.d.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_close_dark));
            }
            if (this.i != null) {
                this.i.setBackground(getResources().getDrawable(R.drawable.mmp_toolbar_share_dark));
            }
        }
        if (this.i != null) {
            this.i.setTextColor(i);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final void showNavigationBarLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e0e938ae56a2b1236489d7913ab9e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e0e938ae56a2b1236489d7913ab9e6");
        } else if (this.n != null) {
            this.n.setVisibility(0);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final void hideNavigationBarLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1023b12eece634bae4b8b5616afd399c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1023b12eece634bae4b8b5616afd399c");
        } else if (this.n != null) {
            this.n.setVisibility(4);
        }
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final void showNavigationBarMoreMenu(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018433af0cc3b5127729896752ebcf3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018433af0cc3b5127729896752ebcf3c");
        } else if (z) {
            b();
        } else if (this.u) {
        } else {
            b();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b21576935cb5f6279fee88cb060da3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b21576935cb5f6279fee88cb060da3");
            return;
        }
        this.w = true;
        if (this.i == null || this.i.getVisibility() == 0) {
            return;
        }
        this.i.setVisibility(0);
        this.menuRect = null;
        MMPEnvHelper.getLogger().mgeView(this.p.c(), "c_group_ynsk9teh", "b_group_r1dy9rr4_mv", null);
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final void hideNavigationBarMoreMenu(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f6ff06b009a9c619c96dce1f173d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f6ff06b009a9c619c96dce1f173d8e");
        } else if (z) {
            c();
        } else if (this.u) {
        } else {
            c();
        }
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final boolean isMenuButtonShown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7578d97e4e4e3f86781d51ec8ad6ec9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7578d97e4e4e3f86781d51ec8ad6ec9")).booleanValue() : this.i.getVisibility() == 0 || this.h.getVisibility() == 0;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af438353ce91887468861a18c8f57faf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af438353ce91887468861a18c8f57faf");
            return;
        }
        this.w = false;
        if (this.i == null) {
            return;
        }
        this.i.setVisibility(8);
        this.menuRect = null;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4fb4af41d9b11ed1c0f3fb038b60f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4fb4af41d9b11ed1c0f3fb038b60f7");
        } else if (this.t) {
            e();
        } else {
            if (this.s) {
                if (MMPEnvHelper.needHideFirstPageNavigationBarBackImage()) {
                    e();
                    return;
                } else if (!this.u && this.r) {
                    e();
                    return;
                }
            }
            this.m.setOnClickListener(this);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71bc4f1d0bfb03e3985343b9d9a7316", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71bc4f1d0bfb03e3985343b9d9a7316");
            return;
        }
        this.m.setVisibility(8);
        if (this.s) {
            this.k.setPadding(p.d(15), 0, 0, 0);
        }
        this.l.addRule(9);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b279ee45feaff356504861a41c817dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b279ee45feaff356504861a41c817dd3");
        } else if (this.h == null || this.u) {
        } else {
            if (!this.v) {
                this.h.setVisibility(0);
            } else if (this.r) {
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
        }
    }

    private static Drawable a(Drawable drawable, ColorStateList colorStateList) {
        Object[] objArr = {drawable, colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "caf59a9f15e9fbea4e2d61a7c03db92a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "caf59a9f15e9fbea4e2d61a7c03db92a");
        }
        if (drawable == null) {
            com.meituan.mmp.lib.trace.b.d("drawable can't be nil!");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746a9130d841e2b1850c3803ccedd500", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746a9130d841e2b1850c3803ccedd500");
            return;
        }
        int id = view.getId();
        if (id == R.id.img_back) {
            onUserClickBackIcon();
        } else if (id == R.id.close_button) {
            onUserClickCloseIcon();
        } else if (id == R.id.more_button) {
            MenuDialog menuDialog = new MenuDialog(getContext(), this.o, this);
            if (!menuDialog.isShowing()) {
                menuDialog.show();
            }
            MMPEnvHelper.getLogger().mgeClick(this.p.c(), "c_group_fv80awch", "b_group_id3aebzy_mc", new Logger.a().a("title", this.p.d()).b);
        } else if (id == R.id.mmp_share) {
            onUserClickShareIcon();
            MMPEnvHelper.getLogger().mgeClick(this.p.c(), "c_group_fv80awch", "b_group_j2u4fz2u_mc", new Logger.a().a("title", getAppName()).a("button_name", "分享").b);
            MMPEnvHelper.getLogger().mgeClick(this.p.c(), "c_group_ynsk9teh", "b_group_r1dy9rr4_mc", null);
        }
    }

    public final String getAppName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2757e1f270e6617b4b32f51f0e331f04", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2757e1f270e6617b4b32f51f0e331f04") : this.p.d();
    }

    public final String getAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba14fc94e7a6f2b5c00b088c1e350afa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba14fc94e7a6f2b5c00b088c1e350afa") : this.p.c();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1414b9fc61551d51a1785d48f96399c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1414b9fc61551d51a1785d48f96399c");
        } else if (this.i == null || this.i.getVisibility() != 0) {
        } else {
            MMPEnvHelper.getLogger().mgeView(this.p.c(), "c_group_ynsk9teh", "b_group_r1dy9rr4_mv", null);
        }
    }

    public final com.meituan.mmp.lib.config.a getAppConfig() {
        return this.p;
    }

    public final void setUrl(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1740b22343f012d3cf0467392190351d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1740b22343f012d3cf0467392190351d");
            return;
        }
        this.q = str;
        if (this.p != null) {
            com.meituan.mmp.lib.config.a aVar = this.p;
            String str2 = this.q;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.config.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ab272e2601bdefd0ce789f037f0262c7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ab272e2601bdefd0ce789f037f0262c7")).booleanValue() : "true".equalsIgnoreCase(aVar.a(str2, "hideCapsuleButtons"))) {
                z = false;
            }
        }
        this.r = z;
        d();
        f();
    }

    @Override // com.meituan.mmp.lib.page.view.CustomNavigationBar
    public final Rect getMenuRect() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "856ff82db17db9cd23404293383541e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "856ff82db17db9cd23404293383541e1");
        }
        Rect rect = this.menuRect;
        if (rect == null) {
            rect = new Rect();
            this.menuView.measure(0, 0);
            int i2 = this.i != null ? ((LinearLayout.LayoutParams) this.i.getLayoutParams()).rightMargin : 0;
            int measuredWidth = this.menuView.getMeasuredWidth() - ((this.r || !this.w) ? 0 : i2);
            int measuredHeight = this.menuView.getMeasuredHeight();
            int a2 = p.a(getContext()) - ((RelativeLayout.LayoutParams) this.menuView.getLayoutParams()).rightMargin;
            if (!this.r && this.w) {
                i = i2;
            }
            rect.right = a2 - i;
            rect.left = rect.right - measuredWidth;
            if (measuredHeight == 0) {
                rect.top = p.c() + (p.d(15) / 2);
                rect.bottom = rect.top + p.d(30);
            } else {
                rect.top = p.c() + ((getFixedHeight() - measuredHeight) / 2);
                rect.bottom = rect.top + measuredHeight;
            }
            this.menuRect = rect;
        }
        return rect;
    }
}
