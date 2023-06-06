package com.dianping.picassocontroller.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picassocontroller.module.NavigatorModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BaseNavBar extends FrameLayout implements b {
    public static ChangeQuickRedirect a;
    private NavigationItemView b;
    private ViewGroup c;
    private ViewGroup d;
    private TextView e;

    public BaseNavBar(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c19ddac765d76c9cc53d0598ae9e0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c19ddac765d76c9cc53d0598ae9e0e");
        }
    }

    public BaseNavBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "738887dbd6a83ece1001eb78c9ad298a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "738887dbd6a83ece1001eb78c9ad298a");
        }
    }

    public BaseNavBar(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51415c86fca3711f08159cc82a5180c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51415c86fca3711f08159cc82a5180c8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a297d8ce6efad28963c43a78182881df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a297d8ce6efad28963c43a78182881df");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.pcs_navigator, this);
        this.b = (NavigationItemView) findViewById(R.id.title_container);
        this.d = (ViewGroup) findViewById(R.id.left_container);
        this.c = (ViewGroup) findViewById(R.id.right_container);
        this.e = (TextView) findViewById(R.id.tv_back);
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.widget.BaseNavBar.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d18cf1e849526c37fa6a14ccaeca8544", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d18cf1e849526c37fa6a14ccaeca8544");
                } else if (BaseNavBar.this.getContext() instanceof Activity) {
                    ((Activity) BaseNavBar.this.getContext()).finish();
                }
            }
        });
    }

    public void setBackIconDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5465f30a0f2b3196290853f55eca870d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5465f30a0f2b3196290853f55eca870d");
        } else if (this.e == null || drawable == null) {
        } else {
            this.e.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    @Override // com.dianping.picassocontroller.widget.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3864d87fcae9c798e346b8445adc28f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3864d87fcae9c798e346b8445adc28f")).booleanValue() : getVisibility() != 0;
    }

    @Override // com.dianping.picassocontroller.widget.b
    public void setHidden(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886b9cad0ec03b0aea98216ecd3381c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886b9cad0ec03b0aea98216ecd3381c7");
        } else {
            setVisibility(z ? 8 : 0);
        }
    }

    @Override // com.dianping.picassocontroller.widget.b
    public final void a(NavigatorModule.NavItemArgument navItemArgument, View.OnClickListener onClickListener) {
        Object[] objArr = {navItemArgument, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8c34a3baa7e1b7484a41ef0f441e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8c34a3baa7e1b7484a41ef0f441e88");
            return;
        }
        this.b.a(navItemArgument);
        this.b.setOnClickListener(onClickListener);
        requestLayout();
    }

    @Override // com.dianping.picassocontroller.widget.b
    public final void a(NavigatorModule.NavItemArgument[] navItemArgumentArr, View.OnClickListener onClickListener) {
        Object[] objArr = {navItemArgumentArr, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48cc5578e05403f60f01e5241395e20a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48cc5578e05403f60f01e5241395e20a");
            return;
        }
        this.c.removeAllViews();
        if (navItemArgumentArr == null || navItemArgumentArr.length == 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = PicassoUtils.dp2px(getContext(), 8.0f);
        for (int length = navItemArgumentArr.length - 1; length >= 0; length--) {
            NavigationItemView navigationItemView = new NavigationItemView(getContext());
            navigationItemView.setOnClickListener(onClickListener);
            navigationItemView.setTag(R.id.id_picasso_index, Integer.valueOf(length));
            navigationItemView.a(navItemArgumentArr[length]);
            this.c.addView(navigationItemView, layoutParams);
        }
        requestLayout();
    }

    @Override // com.dianping.picassocontroller.widget.b
    public final void b(NavigatorModule.NavItemArgument[] navItemArgumentArr, View.OnClickListener onClickListener) {
        Object[] objArr = {navItemArgumentArr, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9292389bdc35260bd73cd8a4df8733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9292389bdc35260bd73cd8a4df8733");
            return;
        }
        this.d.removeAllViews();
        if (navItemArgumentArr == null || navItemArgumentArr.length == 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = PicassoUtils.dp2px(getContext(), 8.0f);
        for (int length = navItemArgumentArr.length - 1; length >= 0; length--) {
            NavigationItemView navigationItemView = new NavigationItemView(getContext());
            navigationItemView.setOnClickListener(onClickListener);
            navigationItemView.setTag(R.id.id_picasso_index, Integer.valueOf(length));
            navigationItemView.a(navItemArgumentArr[length]);
            this.d.addView(navigationItemView, layoutParams);
        }
        requestLayout();
    }

    @Override // com.dianping.picassocontroller.widget.b
    public void setShadowColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f75b4ae7e643fcaef1786fbfe53a1df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f75b4ae7e643fcaef1786fbfe53a1df");
        } else {
            findViewById(R.id.iv_title_shadow).setBackgroundColor(i);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0f8f775571e9083429192fb228b1c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0f8f775571e9083429192fb228b1c63");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b491d18170d67d6753f060e5f39e9006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b491d18170d67d6753f060e5f39e9006");
            return;
        }
        try {
            int right = this.c.getRight() - this.d.getLeft();
            int width = this.d.getWidth();
            int width2 = this.c.getWidth();
            int max = Math.max(width, width2);
            if (width + width2 > right) {
                this.b.setVisibility(8);
                return;
            }
            this.b.setVisibility(0);
            StaticLayout staticLayout = new StaticLayout(this.b.getText(), this.b.getTextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (right - (max * 2) >= (staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f)) {
                this.b.setPadding(max, 0, max, 0);
            } else {
                this.b.setPadding(width, 0, width2, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
