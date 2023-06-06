package com.meituan.metrics.util;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RequestContext {
    public static final String KEY_NET_CHANNEL = "network_tunnel";
    public static final String KEY_NET_END = "net_end";
    public static final String KEY_NET_LIB = "network_lib";
    public static final String KEY_NET_START = "net_start";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ThreadLocal<RequestContext> sThreadLocal = new ThreadLocal<>();
    private final Map<String, Object> data;

    public RequestContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2552b4ed162182059fe4106ae467497", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2552b4ed162182059fe4106ae467497");
        } else {
            this.data = new ConcurrentHashMap();
        }
    }

    @NonNull
    public Map<String, Object> getData() {
        return this.data;
    }

    public static RequestContext create() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e58a6d482e763de7488524c2d1378fb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestContext) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e58a6d482e763de7488524c2d1378fb3");
        }
        RequestContext requestContext = new RequestContext();
        sThreadLocal.set(requestContext);
        return requestContext;
    }

    public static RequestContext get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "602f82af43265fe82ed606bbc4a4d77e", RobustBitConfig.DEFAULT_VALUE) ? (RequestContext) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "602f82af43265fe82ed606bbc4a4d77e") : sThreadLocal.get();
    }

    public static void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "367002518755ea7323d57309beb86f16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "367002518755ea7323d57309beb86f16");
        } else {
            sThreadLocal.remove();
        }
    }
}
