package com.meituan.android.paybase.widgets.keyboard;

import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ViewTreeObserver.OnGlobalLayoutListener {
    public static ChangeQuickRedirect a;
    private final SafeEditText b;

    private f(SafeEditText safeEditText) {
        this.b = safeEditText;
    }

    public static ViewTreeObserver.OnGlobalLayoutListener a(SafeEditText safeEditText) {
        Object[] objArr = {safeEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c57dcf16deb97fbfd97dbf478cfb3c27", RobustBitConfig.DEFAULT_VALUE) ? (ViewTreeObserver.OnGlobalLayoutListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c57dcf16deb97fbfd97dbf478cfb3c27") : new f(safeEditText);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c886cc95bd0af2bce8b83a600f6d809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c886cc95bd0af2bce8b83a600f6d809");
        } else {
            SafeEditText.b(this.b);
        }
    }
}
