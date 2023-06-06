package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class JavaScriptModuleRegistry {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HashMap<Class<? extends JavaScriptModule>, JavaScriptModule> mModuleInstances;

    public JavaScriptModuleRegistry() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d1f67e78f90c56a1b0d8b0108ab03a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d1f67e78f90c56a1b0d8b0108ab03a4");
        } else {
            this.mModuleInstances = new HashMap<>();
        }
    }

    public final synchronized <T extends JavaScriptModule> T getJavaScriptModule(JSFunctionCaller jSFunctionCaller, Class<T> cls) {
        Object[] objArr = {jSFunctionCaller, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eae95994763828cf208a424026d8e4ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eae95994763828cf208a424026d8e4ce");
        }
        T t = (T) this.mModuleInstances.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new JavaScriptModuleInvocationHandler(jSFunctionCaller, cls));
        this.mModuleInstances.put(cls, t2);
        return t2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class JavaScriptModuleInvocationHandler implements InvocationHandler {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Boolean enableLog;
        private final JSFunctionCaller mCatalystInstance;
        private final Class<? extends JavaScriptModule> mModuleInterface;
        @Nullable
        private String mName;

        public JavaScriptModuleInvocationHandler(JSFunctionCaller jSFunctionCaller, Class<? extends JavaScriptModule> cls) {
            Object[] objArr = {jSFunctionCaller, cls};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbbfcf6a5f82c01ee9d6bf0b97384522", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbbfcf6a5f82c01ee9d6bf0b97384522");
                return;
            }
            this.mCatalystInstance = jSFunctionCaller;
            this.mModuleInterface = cls;
        }

        private String getJSModuleName() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "675e6e6ea05a2eb23f884125eb4f9340", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "675e6e6ea05a2eb23f884125eb4f9340");
            }
            if (this.mName == null) {
                this.mName = JavaScriptModuleRegistry.getJSModuleName(this.mModuleInterface);
            }
            return this.mName;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            Object[] objArr2 = {obj, method, objArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7330b33c550bdac4940aed74f305c3e", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7330b33c550bdac4940aed74f305c3e");
            }
            JSONArray jSArgs = Arguments.getJSArgs(objArr);
            if (checkLogEnable(method)) {
                g.d("JSModule call:", getJSModuleName(), CommonConstant.Symbol.COMMA, method.getName(), CommonConstant.Symbol.COMMA, jSArgs);
            }
            this.mCatalystInstance.callFunction(getJSModuleName(), method.getName(), jSArgs);
            return null;
        }

        private boolean checkLogEnable(Method method) {
            Object[] objArr = {method};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef0a10eb6995ec663063e6108292757c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef0a10eb6995ec663063e6108292757c")).booleanValue();
            }
            if (this.enableLog == null) {
                this.enableLog = Boolean.valueOf(LogMethodInvokeModule.class.isAssignableFrom(method.getDeclaringClass()));
            }
            return this.enableLog.booleanValue();
        }
    }

    public static String getJSModuleName(Class<? extends JavaScriptModule> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ceed37685690e3939cc8756945306334", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ceed37685690e3939cc8756945306334");
        }
        String simpleName = cls.getSimpleName();
        int lastIndexOf = simpleName.lastIndexOf(36);
        return lastIndexOf != -1 ? simpleName.substring(lastIndexOf + 1) : simpleName;
    }
}
