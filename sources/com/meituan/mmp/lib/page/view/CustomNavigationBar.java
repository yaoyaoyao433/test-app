package com.meituan.mmp.lib.page.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public abstract class CustomNavigationBar extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected volatile Rect menuRect;
    protected View menuView;
    private a navigationBarButtonClickListener;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    public abstract void hideNavigationBarLoading();

    public abstract void hideNavigationBarMoreMenu(boolean z);

    public abstract boolean isMenuButtonShown();

    public abstract void setNavigationBarIconColor(int i);

    public abstract void setNavigationBarTextColor(int i);

    public abstract void setNavigationBarTitle(CharSequence charSequence);

    public abstract void showNavigationBarLoading();

    public abstract void showNavigationBarMoreMenu(boolean z);

    public CustomNavigationBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04a03cea3881aa572bc261e36fc3e213", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04a03cea3881aa572bc261e36fc3e213");
        }
    }

    public final void setNavigationBarButtonClickListener(a aVar) {
        this.navigationBarButtonClickListener = aVar;
    }

    public final void ensureNeedClickTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc117a2664a8d0983b859d9f5df0f9ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc117a2664a8d0983b859d9f5df0f9ae");
        } else {
            setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.page.view.CustomNavigationBar.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86e968276bf9708d2c020d11bcf88794", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86e968276bf9708d2c020d11bcf88794");
                    } else if (CustomNavigationBar.this.navigationBarButtonClickListener != null) {
                        CustomNavigationBar.this.navigationBarButtonClickListener.e();
                    }
                }
            });
        }
    }

    public static int getFixedHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70288a42b5fa84b59b6c0418b601e7f5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70288a42b5fa84b59b6c0418b601e7f5")).intValue() : p.d(45);
    }

    public final View attachMenuView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2344f3231acfdf1222abace4f3ff66e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2344f3231acfdf1222abace4f3ff66e9");
        }
        this.menuView = LayoutInflater.from(getContext()).inflate(R.layout.mmp_menu, (ViewGroup) this, false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = p.d(15);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(11, -1);
        addView(this.menuView, layoutParams);
        return this.menuView;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a9dcb44e91f310e55c6bb88349be8a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a9dcb44e91f310e55c6bb88349be8a0");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.menuRect = null;
    }

    public Rect getMenuRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81103984db2cb85ece62e88173d7630d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81103984db2cb85ece62e88173d7630d");
        }
        Rect rect = this.menuRect;
        if (rect == null) {
            Rect rect2 = new Rect();
            this.menuView.measure(0, 0);
            int measuredWidth = this.menuView.getMeasuredWidth();
            int measuredHeight = this.menuView.getMeasuredHeight();
            int a2 = p.a(getContext());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.menuView.getLayoutParams();
            rect2.right = a2 - layoutParams.rightMargin;
            rect2.left = (rect2.right - measuredWidth) - layoutParams.leftMargin;
            rect2.top = p.c() + ((getFixedHeight() - measuredHeight) / 2);
            rect2.bottom = rect2.top + measuredHeight;
            this.menuRect = rect2;
            return rect2;
        }
        return rect;
    }

    public final void onUserClickShareIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14b4c42f32c5494fef72989553d1d936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14b4c42f32c5494fef72989553d1d936");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.a();
        }
    }

    public final void onUserClickBackIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1acf48cb4572c43dc32f29716b41fad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1acf48cb4572c43dc32f29716b41fad");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.b();
        }
    }

    public final void onUserClickCloseIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3980b2a828eca974e35927db39034841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3980b2a828eca974e35927db39034841");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.c();
        }
    }

    public final void onUserClickAboutIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de8b1b671d77f219db9a236226e64710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de8b1b671d77f219db9a236226e64710");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.d();
        }
    }
}
