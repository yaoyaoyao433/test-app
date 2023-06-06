package com.sankuai.waimai.restaurant.shopcart.popup;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNDialogContainerModule.NAME)
/* loaded from: classes5.dex */
public class MRNDialogContainerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "MRNDialogContainerModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return NAME;
    }

    public MRNDialogContainerModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af8f7fc858e8a41a53f319240092c401", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af8f7fc858e8a41a53f319240092c401");
        }
    }

    @ReactMethod
    public void closeDialog(final String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67a52d8bf23a0a06778ab7708d350f96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67a52d8bf23a0a06778ab7708d350f96");
        } else {
            ai.a(new Runnable() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.MRNDialogContainerModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb8ce4a5f9637f2bfbf807e46ea0b079", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb8ce4a5f9637f2bfbf807e46ea0b079");
                        return;
                    }
                    MRNDialog a2 = com.sankuai.waimai.business.restaurant.base.skuchoose.c.a().a(str);
                    if (a2 != null) {
                        if (z) {
                            a2.dismiss();
                        } else {
                            a2.q();
                        }
                    }
                }
            });
        }
    }
}
