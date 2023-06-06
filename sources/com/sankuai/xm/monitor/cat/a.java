package com.sankuai.xm.monitor.cat;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a93b90318c0a4269d3e022a20ba2a9d9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a93b90318c0a4269d3e022a20ba2a9d9")).intValue();
        }
        if (exc instanceof SocketException) {
            return -501;
        }
        if (exc instanceof BindException) {
            return -502;
        }
        if (exc instanceof ConnectException) {
            return -503;
        }
        if (exc instanceof HttpRetryException) {
            return BaseJsHandler.ERROR_CODE_METHOD_NOT_IMPLEMENTED;
        }
        if (exc instanceof MalformedURLException) {
            return -505;
        }
        if (exc instanceof NoRouteToHostException) {
            return -506;
        }
        if (exc instanceof PortUnreachableException) {
            return -507;
        }
        if (exc instanceof ProtocolException) {
            return -508;
        }
        if (exc instanceof SocketTimeoutException) {
            return -103;
        }
        if (exc instanceof UnknownHostException) {
            return -510;
        }
        if (exc instanceof UnknownServiceException) {
            return -511;
        }
        if (exc instanceof URISyntaxException) {
            return -512;
        }
        if (exc instanceof SSLException) {
            if (exc instanceof SSLHandshakeException) {
                return -552;
            }
            if (exc instanceof SSLKeyException) {
                return -553;
            }
            if (exc instanceof SSLPeerUnverifiedException) {
                return -554;
            }
            return exc instanceof SSLProtocolException ? -555 : -551;
        }
        return -599;
    }
}
