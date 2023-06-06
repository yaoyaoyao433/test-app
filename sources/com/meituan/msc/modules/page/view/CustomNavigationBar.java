package com.meituan.msc.modules.page.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Keep;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.msc.common.utils.n;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42f0eaf061ced3e4504e9da2175c7a91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42f0eaf061ced3e4504e9da2175c7a91");
        }
    }

    public final void setNavigationBarButtonClickListener(a aVar) {
        this.navigationBarButtonClickListener = aVar;
    }

    public final void ensureNeedClickTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38c6c7ff043583aa6dadc7704c940983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38c6c7ff043583aa6dadc7704c940983");
        } else {
            setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.page.view.CustomNavigationBar.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f9ba54f4dbcd3668be28ce191d4eaf42", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f9ba54f4dbcd3668be28ce191d4eaf42");
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8df81d6fbe93a8fffac75e4518078431", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8df81d6fbe93a8fffac75e4518078431")).intValue() : n.b(45);
    }

    public final View attachMenuView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28edf9603447f8991044eaf00646c4fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28edf9603447f8991044eaf00646c4fb");
        }
        this.menuView = LayoutInflater.from(getContext()).inflate(R.layout.msc_menu, (ViewGroup) this, false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = n.b(15);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(11, -1);
        addView(this.menuView, layoutParams);
        return this.menuView;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "346615a8256c74a5068665e6ceb77e95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "346615a8256c74a5068665e6ceb77e95");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.menuRect = null;
    }

    public Rect getMenuRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "442d5c0a69e5f0cc9662bfb40fede682", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "442d5c0a69e5f0cc9662bfb40fede682");
        }
        Rect rect = this.menuRect;
        if (rect == null) {
            Rect rect2 = new Rect();
            this.menuView.measure(0, 0);
            int measuredWidth = this.menuView.getMeasuredWidth();
            int measuredHeight = this.menuView.getMeasuredHeight();
            int a2 = n.a(getContext());
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.menuView.getLayoutParams();
            rect2.right = a2 - layoutParams.rightMargin;
            rect2.left = (rect2.right - measuredWidth) - layoutParams.leftMargin;
            rect2.top = n.c() + ((getFixedHeight() - measuredHeight) / 2);
            rect2.bottom = rect2.top + measuredHeight;
            this.menuRect = rect2;
            return rect2;
        }
        return rect;
    }

    public final void onUserClickShareIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f34e89b3358ae65dcee02fb00c00aaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f34e89b3358ae65dcee02fb00c00aaf");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.a();
        }
    }

    public final void onUserClickBackIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52d3a44491637e316920c941aeceb415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52d3a44491637e316920c941aeceb415");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.b();
        }
    }

    public final void onUserClickCloseIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f70e2807790544aff06f86b55e858329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f70e2807790544aff06f86b55e858329");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.c();
        }
    }

    public final void onUserClickAboutIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b2da46f7661380439661963ef7cde97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b2da46f7661380439661963ef7cde97");
        } else if (this.navigationBarButtonClickListener != null) {
            this.navigationBarButtonClickListener.d();
        }
    }
}
