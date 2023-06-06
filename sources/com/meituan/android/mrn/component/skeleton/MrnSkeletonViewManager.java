package com.meituan.android.mrn.component.skeleton;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MrnSkeletonViewManager extends SimpleViewManager<a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNSkeletonDrawerView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0866bccff1c200254ef47ac9ac039d0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0866bccff1c200254ef47ac9ac039d0") : new a(aoVar);
    }

    @ReactProp(name = "config")
    public void setConfig(a aVar, ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "661b2030cee065ae0e3d66f44d1731d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "661b2030cee065ae0e3d66f44d1731d6");
            return;
        }
        try {
            String string = readableMap.hasKey("data") ? readableMap.getString("data") : "";
            if (!TextUtils.isEmpty(string)) {
                if (readableMap.hasKey("loadAsynchronous")) {
                    aVar.b(string, readableMap.getBoolean("loadAsynchronous"));
                } else {
                    aVar.b(string, true);
                }
            } else if (readableMap.hasKey("file")) {
                if (readableMap.hasKey("loadAsynchronous")) {
                    aVar.a(readableMap.getString("file"), readableMap.getBoolean("loadAsynchronous"));
                } else {
                    aVar.a(readableMap.getString("file"), true);
                }
            }
            if (readableMap.hasKey("needAnim")) {
                aVar.setOpenAnim(readableMap.getBoolean("needAnim"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
