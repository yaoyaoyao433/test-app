package com.meituan.mtmap.rendersdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import com.meituan.mtmap.rendersdk.HttpCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class InnerInitializer {
    private static String MAP_KEY;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static InnerInitializer sInnerInitializer;
    private HttpCallback.HttpRequestInject httpRequestInject;
    private final Context mContext;
    private boolean soLoaded;

    public InnerInitializer(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93ebc66cdb453306479d3513e83141b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93ebc66cdb453306479d3513e83141b9");
            return;
        }
        this.soLoaded = false;
        this.mContext = context != null ? context.getApplicationContext() : null;
        this.soLoaded = false;
    }

    public static void initInnerSDK(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f8451118d99899e2f084eaae57beb58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f8451118d99899e2f084eaae57beb58");
        } else if (sInnerInitializer == null) {
            sInnerInitializer = new InnerInitializer(context);
        }
    }

    public static String getMapKey() {
        return MAP_KEY;
    }

    public static void setMapKey(String str) {
        MAP_KEY = str;
    }

    public static boolean isSoLoaded() {
        return sInnerInitializer != null && sInnerInitializer.soLoaded;
    }

    public static void setSoLoaded(boolean z) {
        if (sInnerInitializer != null) {
            sInnerInitializer.soLoaded = z;
        }
    }

    public static void setHttpRequestInject(HttpCallback.HttpRequestInject httpRequestInject) {
        if (sInnerInitializer != null) {
            sInnerInitializer.httpRequestInject = httpRequestInject;
        }
    }

    public static HttpCallback.HttpRequest getHttpRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "32f06371d837b7585251708aba1b6322", RobustBitConfig.DEFAULT_VALUE)) {
            return (HttpCallback.HttpRequest) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "32f06371d837b7585251708aba1b6322");
        }
        if (sInnerInitializer == null || sInnerInitializer.httpRequestInject == null) {
            return null;
        }
        return sInnerInitializer.httpRequestInject.getHttpRequest();
    }

    public static boolean networkAvailable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f153fba36995aa25df021f6614fb131f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f153fba36995aa25df021f6614fb131f")).booleanValue();
        }
        try {
            checkState();
            ConnectivityManager connectivityManager = (ConnectivityManager) sInnerInitializer.mContext.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return false;
        }
    }

    private static void checkState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30402464c657846469fe22df202b7dbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30402464c657846469fe22df202b7dbf");
        } else if (sInnerInitializer == null) {
            throw new NullPointerException("innerInitializer is null");
        }
    }

    public static boolean canNativeBeUsed(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48d0777b74c98ee230cc3610f9586cc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48d0777b74c98ee230cc3610f9586cc7")).booleanValue();
        }
        if (isSoLoaded()) {
            return true;
        }
        String.format("You're calling `%s` method, but SO file were not loaded!", str);
        return false;
    }
}
