package com.meituan.mtwebkit.internal.system;

import android.webkit.HttpAuthHandler;
import com.meituan.mtwebkit.MTHttpAuthHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends MTHttpAuthHandler {
    public static ChangeQuickRedirect a;
    private HttpAuthHandler b;

    public e(HttpAuthHandler httpAuthHandler) {
        Object[] objArr = {httpAuthHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3045d7833cf2ebafa2c99813a6c7678f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3045d7833cf2ebafa2c99813a6c7678f");
        } else {
            this.b = httpAuthHandler;
        }
    }

    @Override // com.meituan.mtwebkit.MTHttpAuthHandler
    public final boolean useHttpAuthUsernamePassword() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1e79c3aefe1dc0519631b4c251e7c56", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1e79c3aefe1dc0519631b4c251e7c56")).booleanValue() : this.b.useHttpAuthUsernamePassword();
    }

    @Override // com.meituan.mtwebkit.MTHttpAuthHandler
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1489063ed8c02de9b7a6a870abe65deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1489063ed8c02de9b7a6a870abe65deb");
        } else {
            this.b.cancel();
        }
    }

    @Override // com.meituan.mtwebkit.MTHttpAuthHandler
    public final void proceed(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dabaec16c29a1544c09453f41c99ded3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dabaec16c29a1544c09453f41c99ded3");
        } else {
            this.b.proceed(str, str2);
        }
    }
}
