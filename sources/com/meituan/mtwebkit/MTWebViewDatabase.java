package com.meituan.mtwebkit;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MTWebViewDatabase {
    protected static final String LOGTAG = "webviewdatabase";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public abstract void clearFormData();

    public abstract void clearHttpAuthUsernamePassword();

    @Deprecated
    public abstract void clearUsernamePassword();

    public abstract String[] getHttpAuthUsernamePassword(String str, String str2);

    @Deprecated
    public abstract boolean hasFormData();

    public abstract boolean hasHttpAuthUsernamePassword();

    @Deprecated
    public abstract boolean hasUsernamePassword();

    public abstract void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);

    public static MTWebViewDatabase getInstance(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1b7073d368f6c0b6d3bface1387e3eb", RobustBitConfig.DEFAULT_VALUE) ? (MTWebViewDatabase) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1b7073d368f6c0b6d3bface1387e3eb") : MTWebViewFactory.getProvider().getWebViewDatabase(context);
    }
}
