package com.dianping.live.addressBridge;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LiveAddressModule extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "LiveAddressModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return MODULE_NAME;
    }

    public LiveAddressModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "422b62fbd14a1a76a1cc790ea94dd7c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "422b62fbd14a1a76a1cc790ea94dd7c0");
        }
    }
}
