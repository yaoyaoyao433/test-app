package com.meituan.android.legwork.mrn.bridge;

import android.support.v4.content.Loader;
import com.facebook.react.bridge.Promise;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class LocationBridgeModule$$Lambda$7 implements Loader.OnLoadCompleteListener {
    public static ChangeQuickRedirect a;
    private final Promise b;

    private LocationBridgeModule$$Lambda$7(Promise promise) {
        this.b = promise;
    }

    public static Loader.OnLoadCompleteListener a(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3828a4b792a18dc7c0da109741a6b9a", RobustBitConfig.DEFAULT_VALUE) ? (Loader.OnLoadCompleteListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3828a4b792a18dc7c0da109741a6b9a") : new LocationBridgeModule$$Lambda$7(promise);
    }

    @Override // android.support.v4.content.Loader.OnLoadCompleteListener
    public final void onLoadComplete(Loader loader, Object obj) {
        Object[] objArr = {loader, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33cdb4ec29119293107f079e25a3cd4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33cdb4ec29119293107f079e25a3cd4e");
        } else {
            LocationBridgeModule.lambda$null$33(this.b, loader, (MtLocation) obj);
        }
    }
}
