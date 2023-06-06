package com.sankuai.waimai.platform.capacity.network.cdn;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
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
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final Map<String, Integer> b = new HashMap<String, Integer>() { // from class: com.sankuai.waimai.platform.capacity.network.cdn.c.1
        {
            put(Exception.class.getName(), -599);
            put(IOException.class.getName(), -500);
            put(SocketException.class.getName(), -501);
            put(BindException.class.getName(), -502);
            put(ConnectException.class.getName(), -503);
            put(HttpRetryException.class.getName(), Integer.valueOf((int) BaseJsHandler.ERROR_CODE_METHOD_NOT_IMPLEMENTED));
            put(MalformedURLException.class.getName(), -505);
            put(NoRouteToHostException.class.getName(), -506);
            put(PortUnreachableException.class.getName(), -507);
            put(ProtocolException.class.getName(), -508);
            put(SocketTimeoutException.class.getName(), -608);
            put(UnknownHostException.class.getName(), -510);
            put(UnknownServiceException.class.getName(), -511);
            put(URISyntaxException.class.getName(), -512);
            put(InterruptedIOException.class.getName(), -513);
            put(SSLException.class.getName(), -551);
            put(SSLHandshakeException.class.getName(), -552);
            put(SSLKeyException.class.getName(), -553);
            put(SSLPeerUnverifiedException.class.getName(), -554);
            put(SSLProtocolException.class.getName(), -555);
        }
    };

    public static final int a() {
        return -598;
    }

    public static final int a(Exception exc) {
        int i;
        int i2;
        int i3 = 0;
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ead3292dc524088dce918d8ea5741d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ead3292dc524088dce918d8ea5741d9")).intValue();
        }
        Object[] objArr2 = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f20b225db44f78437a47b4febcb9877b", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f20b225db44f78437a47b4febcb9877b")).intValue();
        } else {
            i = (IOException.class.getName().equals(exc.getClass().getName()) && "Canceled".equalsIgnoreCase(exc.getMessage())) ? -596 : 0;
        }
        if (i < 0) {
            return i;
        }
        Object[] objArr3 = {exc};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ad5c460d5cd5cb731ebb7ead834a3a36", RobustBitConfig.DEFAULT_VALUE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ad5c460d5cd5cb731ebb7ead834a3a36")).intValue();
        } else {
            i2 = (InterruptedIOException.class.getName().equals(exc.getClass().getName()) && "thread interrupted".equalsIgnoreCase(exc.getMessage())) ? -597 : 0;
        }
        if (i2 < 0) {
            return i2;
        }
        Object[] objArr4 = {exc};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "27c229756636ef5b4c88638ba461c22f", RobustBitConfig.DEFAULT_VALUE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "27c229756636ef5b4c88638ba461c22f")).intValue();
        } else if (SocketException.class.getName().equals(exc.getClass().getName()) && "Socket Closed".equalsIgnoreCase(exc.getMessage())) {
            i3 = -595;
        }
        if (i3 < 0) {
            return i3;
        }
        Integer num = b.get(exc.getClass().getName());
        if (num == null) {
            return -599;
        }
        return num.intValue();
    }
}
