package com.meituan.android.neohybrid.neo.bridge;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.JavascriptInterface;
import com.meituan.android.neohybrid.neo.bridge.presenter.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NeoSessionStorageBridge extends NeoBridge {
    public static ChangeQuickRedirect a;

    public NeoSessionStorageBridge(com.meituan.android.neohybrid.core.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9231510ccaa15a8f30e01a149b96b06b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9231510ccaa15a8f30e01a149b96b06b");
        }
    }

    @Keep
    @JavascriptInterface
    public String storage(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1fd5e03bd7e124d20143cddf734c0e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1fd5e03bd7e124d20143cddf734c0e5");
        }
        String checkSecure = checkSecure();
        if (Boolean.TRUE.toString().equals(checkSecure)) {
            return new n(this.mNeoCompat, str, str2, str3).c();
        }
        return failResult("storage" + checkSecure);
    }
}
