package com.meituan.android.common.weaver.interfaces;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.ffp.IExtension;
import com.meituan.android.common.weaver.interfaces.tracer.EmptyTracer;
import com.meituan.android.common.weaver.interfaces.tracer.ITracer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Weaver {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static volatile IExtension sExtension;
    public static volatile IWeaver sImpl;
    public static volatile ITracer sTracer;

    @NonNull
    public static IWeaver getWeaver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "871de07eacaa5c1b96019952fe1b1e30", RobustBitConfig.DEFAULT_VALUE)) {
            return (IWeaver) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "871de07eacaa5c1b96019952fe1b1e30");
        }
        if (sImpl == null) {
            return new EmptyWeaver();
        }
        return sImpl;
    }

    @NonNull
    public static IExtension getExtension() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bcf26e97ee93ec9f191a003a3d46be72", RobustBitConfig.DEFAULT_VALUE) ? (IExtension) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bcf26e97ee93ec9f191a003a3d46be72") : sExtension == null ? (IExtension) Proxy.newProxyInstance(IExtension.class.getClassLoader(), new Class[]{IExtension.class}, new InvocationHandler() { // from class: com.meituan.android.common.weaver.interfaces.Weaver.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr2) throws Throwable {
                return null;
            }
        }) : sExtension;
    }

    public static boolean isInit() {
        return sImpl != null;
    }

    @NonNull
    public static ITracer getTracer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e4e6c005e6aa5a47fba33a62b26b01e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITracer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e4e6c005e6aa5a47fba33a62b26b01e");
        }
        if (sTracer == null) {
            return new EmptyTracer();
        }
        return sTracer;
    }
}
