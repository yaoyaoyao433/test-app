package com.meituan.android.mrn.module;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.update.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
@ReactModule(name = MRNWarmUpModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNWarmUpModule extends ReactContextBaseJavaModule {
    public static final String MODULE_NAME = "MRNWarmUpModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNWarmUpModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfee7c75ac971e56eb077a848e4e641b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfee7c75ac971e56eb077a848e4e641b");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactMethod
    public void warmUpByTags(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5190a903740d00882f47b50827fc1da7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5190a903740d00882f47b50827fc1da7");
            return;
        }
        try {
            k.a().a((ArrayList<String>) readableArray.toArrayList());
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ReactMethod
    public void warmUpByBundleNames(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cb673758ba1eef259238b57ae805438", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cb673758ba1eef259238b57ae805438");
            return;
        }
        try {
            k.a().a((ArrayList<String>) readableArray.toArrayList(), false);
        } catch (Throwable unused) {
        }
    }
}
