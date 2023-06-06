package com.meituan.mtwebkit.internal.system;

import android.os.Build;
import android.webkit.WebResourceError;
import com.meituan.mtwebkit.MTWebResourceError;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends MTWebResourceError {
    public static ChangeQuickRedirect a;
    private WebResourceError b;

    public l(WebResourceError webResourceError) {
        Object[] objArr = {webResourceError};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a451edeb086140f9a077e7c02ace5ae5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a451edeb086140f9a077e7c02ace5ae5");
        } else {
            this.b = webResourceError;
        }
    }

    @Override // com.meituan.mtwebkit.MTWebResourceError
    public final int getErrorCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f41c9d7d766a22d9f0bfec367465f41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f41c9d7d766a22d9f0bfec367465f41")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return this.b.getErrorCode();
        }
        return 0;
    }

    @Override // com.meituan.mtwebkit.MTWebResourceError
    public final CharSequence getDescription() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47b41c2d4dae573e97e9f3ff9e1c0ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47b41c2d4dae573e97e9f3ff9e1c0ba");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return this.b.getDescription();
        }
        return null;
    }
}
