package com.meituan.android.neohybrid.v2.neo.bridge;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.webkit.JavascriptInterface;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NeoSessionStorageBridge extends NeoBridge {
    public static ChangeQuickRedirect a;

    public NeoSessionStorageBridge(com.meituan.android.neohybrid.v2.core.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4abca021c338eb7c85374efa00960c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4abca021c338eb7c85374efa00960c1");
        }
    }

    @Keep
    @JavascriptInterface
    public String storage(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b1d06ee8f6aa15cf41355a7984d078", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b1d06ee8f6aa15cf41355a7984d078");
        }
        if (isInsecure()) {
            return failResult("post: context error.");
        }
        return new q(this.mNeoCompat, str, str2, str3).c();
    }
}
