package com.meituan.mtwebkit.internal.system;

import android.webkit.WebView;
import android.widget.FrameLayout;
import com.meituan.mtwebkit.MTWebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q extends WebView {
    public static ChangeQuickRedirect a;
    public MTWebView b;
    private MTWebView.PrivateAccess c;

    public q(MTWebView mTWebView, MTWebView.PrivateAccess privateAccess) {
        super(mTWebView.getContext());
        Object[] objArr = {mTWebView, privateAccess};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dc517ed816a4154298f66bea27d0c3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dc517ed816a4154298f66bea27d0c3c");
            return;
        }
        this.b = mTWebView;
        this.c = privateAccess;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20abe68e14890b1d67253556d1c85378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20abe68e14890b1d67253556d1c85378");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        layoutParams.rightMargin = -i;
        layoutParams.bottomMargin = -i2;
        requestLayout();
        this.b.scrollTo(i, i2);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb69363e0e6c327aeda32feb6730c54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb69363e0e6c327aeda32feb6730c54");
            return;
        }
        super.onOverScrolled(i, i2, z, z2);
        this.c.onOverScrolled(i, i2, z, z2);
    }
}
