package com.sankuai.android.spawn.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MtToolbar extends Toolbar {
    public static ChangeQuickRedirect p;
    public static Field q;
    public static Field r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private View.OnClickListener x;

    public MtToolbar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60756b1074d727af10434d1922c7b93a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60756b1074d727af10434d1922c7b93a");
        } else {
            a(context, null, 0);
        }
    }

    public MtToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e9bf497b26766cdac13784371acf45e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e9bf497b26766cdac13784371acf45e");
        } else {
            a(context, attributeSet, i);
        }
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2623c148b819f1fd8c6ca2f2d7284929", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2623c148b819f1fd8c6ca2f2d7284929");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.navPaddingLeft, R.attr.navPaddingRight, R.attr.navUseTitle, R.attr.toolbarActionPaddingLeft, R.attr.toolbarActionPaddingRight}, i, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.t = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.u = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1080f51dd5a791c803e6d7748d3b1555", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1080f51dd5a791c803e6d7748d3b1555");
            return;
        }
        super.onMeasure(i, i2);
        if (this.v || this.s < 0 || this.t < 0) {
            return;
        }
        TextView titleView = getTitleView();
        ImageButton navButton = getNavButton();
        boolean z = titleView != null && titleView.getMeasuredWidth() > 0;
        boolean z2 = navButton != null && navButton.getMeasuredWidth() > 0;
        if (z && z2) {
            if (this.u) {
                navButton.setVisibility(8);
                titleView.setPadding(this.s, 0, this.t, 0);
                titleView.setCompoundDrawablesWithIntrinsicBounds(navButton.getDrawable(), (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                navButton.setPadding(this.s, 0, 0, 0);
                titleView.setPadding(0, 0, this.t, 0);
            }
        } else if (z) {
            titleView.setPadding(this.s, 0, this.t, 0);
        } else if (z2) {
            navButton.setPadding(this.s, 0, this.t, 0);
        }
        this.v = true;
        super.onMeasure(i, i2);
    }

    @Override // android.support.v7.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee439e565d76dbf800491605d58aa8bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee439e565d76dbf800491605d58aa8bc");
            return;
        }
        super.setNavigationIcon(drawable);
        this.v = false;
    }

    @Override // android.support.v7.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504ff25894f22e68f719317469980cee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504ff25894f22e68f719317469980cee");
            return;
        }
        super.setTitle(charSequence);
        this.v = false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        TextView titleView;
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41955c268c59ff093ebb92dccc6c62ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41955c268c59ff093ebb92dccc6c62ba");
            return;
        }
        super.addView(view, i, layoutParams);
        if (this.u) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = p;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f9d2c8590ddf223360581a6e38904fd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f9d2c8590ddf223360581a6e38904fd");
            } else if (!this.w && (titleView = getTitleView()) != null) {
                ViewGroup.LayoutParams layoutParams2 = titleView.getLayoutParams();
                layoutParams2.height = -1;
                titleView.setLayoutParams(layoutParams2);
                titleView.setGravity(16);
                titleView.setOnClickListener(this.x);
                this.w = true;
            }
        }
        this.v = false;
    }

    @Override // android.support.v7.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e128c6c7c9af2b954f56701450cd8e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e128c6c7c9af2b954f56701450cd8e5");
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        this.x = onClickListener;
    }

    private ImageButton getNavButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c970c7f1e46c05a40329451e95e99b", 6917529027641081856L)) {
            return (ImageButton) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c970c7f1e46c05a40329451e95e99b");
        }
        if (q == null) {
            try {
                Field declaredField = Toolbar.class.getDeclaredField("d");
                q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        if (q != null) {
            try {
                return (ImageButton) q.get(this);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private TextView getTitleView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61442216ff3f3875267af6a24b25865", 6917529027641081856L)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61442216ff3f3875267af6a24b25865");
        }
        if (r == null) {
            try {
                Field declaredField = Toolbar.class.getDeclaredField("b");
                r = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        if (r != null) {
            try {
                return (TextView) r.get(this);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
