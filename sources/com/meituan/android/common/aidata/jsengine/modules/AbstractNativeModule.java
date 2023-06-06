package com.meituan.android.common.aidata.jsengine.modules;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbstractNativeModule extends AbstractInvokeCallback implements IJSNativeModule {
    private static final String UN_SUPPORT_NATIVE_MODULE = "error_method_not_supported";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, IJSNativeMethod> mNativeMethods;

    public AbstractNativeModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bcb8d6b2ce88e03a0f111e8ff890950", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bcb8d6b2ce88e03a0f111e8ff890950");
        } else {
            this.mNativeMethods = new HashMap();
        }
    }

    public void addNativeMethod(String str, IJSNativeMethod iJSNativeMethod) {
        Object[] objArr = {str, iJSNativeMethod};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a699bc7fd6eb0531229971e321b32834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a699bc7fd6eb0531229971e321b32834");
        } else {
            this.mNativeMethods.put(str, iJSNativeMethod);
        }
    }

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeModule
    public Map<String, IJSNativeMethod> getAllMethods() {
        return this.mNativeMethods;
    }

    @Override // com.meituan.android.common.aidata.jsengine.modules.IJSNativeModule
    public void invoke(String str, String str2, String str3, String str4, IJSNativeModuleCallback iJSNativeModuleCallback) {
        Object[] objArr = {str, str2, str3, str4, iJSNativeModuleCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e428dc01c1d98403d083e2b3ee65a975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e428dc01c1d98403d083e2b3ee65a975");
            return;
        }
        Map<String, IJSNativeMethod> allMethods = getAllMethods();
        if (allMethods != null && allMethods.containsKey(str2)) {
            try {
                allMethods.get(str2).invoke(str, str3, str4, iJSNativeModuleCallback);
                return;
            } catch (Exception e) {
                callFailed(iJSNativeModuleCallback, str4, e.getMessage());
                return;
            }
        }
        callFailed(iJSNativeModuleCallback, str4, UN_SUPPORT_NATIVE_MODULE);
    }
}
