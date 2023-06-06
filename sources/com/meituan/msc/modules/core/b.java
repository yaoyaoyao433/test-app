package com.meituan.msc.modules.core;

import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.modules.core.JSDeviceEventEmitter;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ModuleName(name = DeviceEventManagerModule.NAME)
/* loaded from: classes3.dex */
public final class b extends k implements a {
    public static ChangeQuickRedirect a;
    private final Runnable b;

    public b(final com.meituan.msc.jse.modules.core.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb371c2b0a6eac219d39a0c674640900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb371c2b0a6eac219d39a0c674640900");
        } else {
            this.b = new Runnable() { // from class: com.meituan.msc.modules.core.b.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "503ad0b085218e38f021b8d558afe08e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "503ad0b085218e38f021b8d558afe08e");
                        return;
                    }
                    UiThreadUtil.assertOnUiThread();
                    bVar.a();
                }
            };
        }
    }

    @Override // com.meituan.msc.modules.core.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5efacfec0880a77623d3f0c3ec3ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5efacfec0880a77623d3f0c3ec3ea8");
        } else {
            ((JSDeviceEventEmitter) U_().a(JSDeviceEventEmitter.class)).emit("hardwareBackPress", null);
        }
    }

    @MSCMethod
    public final void invokeDefaultBackPressHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6136ae93dfd68e984bdb7dad7ed2f867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6136ae93dfd68e984bdb7dad7ed2f867");
        } else {
            UiThreadUtil.runOnUiThread(this.b);
        }
    }
}
