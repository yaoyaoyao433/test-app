package com.meituan.metrics.traffic.report;

import com.meituan.metrics.traffic.TrafficRecord;
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
/* loaded from: classes3.dex */
public final class NetExceptionCodeUtil {
    private static final String CRONET_INTERNAL_ERROR_CODE = "internal_error_code";
    private static final String INTERRUPTEDIOEXCEPTION_THREAD_INTERRUPTED = "thread interrupted";
    private static final String IOEXCEPTION_CANCELED = "Canceled";
    private static final int NETEXCEPTIONCODE_BINDEXCEPTION = -502;
    private static final int NETEXCEPTIONCODE_CONNECTEXCEPTION = -503;
    private static final int NETEXCEPTIONCODE_EXCEPTION = -599;
    private static final int NETEXCEPTIONCODE_HTTPRETRYEXCEPTION = -504;
    private static final int NETEXCEPTIONCODE_INTERRUPTEDIOEXCEPTION = -513;
    private static final int NETEXCEPTIONCODE_INTERRUPTEDIOEXCEPTION_THREAD_INTERRUPTED = -597;
    private static final int NETEXCEPTIONCODE_IOEXCEPTION = -500;
    private static final int NETEXCEPTIONCODE_IOEXCEPTION_CANCELED = -596;
    private static final int NETEXCEPTIONCODE_MALFORMEDURLEXCEPTION = -505;
    private static final int NETEXCEPTIONCODE_NOROUTETOHOSTEXCEPTION = -506;
    private static final int NETEXCEPTIONCODE_NULL_RESPONSE = -598;
    private static final int NETEXCEPTIONCODE_PORTUNREACHABLEEXCEPTION = -507;
    private static final int NETEXCEPTIONCODE_PROTOCOLEXCEPTION = -508;
    private static final int NETEXCEPTIONCODE_SOCKETEXCEPTION = -501;
    private static final int NETEXCEPTIONCODE_SOCKETEXCEPTION_SOCKET_CLOSED = -595;
    private static final int NETEXCEPTIONCODE_SOCKETTIMEOUTEXCEPTION = -509;
    private static final int NETEXCEPTIONCODE_SSLEXCEPTION = -551;
    private static final int NETEXCEPTIONCODE_SSLHANDSHAKEEXCEPTION = -552;
    private static final int NETEXCEPTIONCODE_SSLKEYEXCEPTION = -553;
    private static final int NETEXCEPTIONCODE_SSLPEERUNVERIFIEDEXCEPTION = -554;
    private static final int NETEXCEPTIONCODE_SSLPROTOCOLEXCEPTION = -555;
    private static final int NETEXCEPTIONCODE_UNKNOWNHOSTEXCEPTION = -510;
    private static final int NETEXCEPTIONCODE_UNKNOWNSERVICEEXCEPTION = -511;
    private static final int NETEXCEPTIONCODE_URISYNTAXEXCEPTION = -512;
    public static final int NOT_CRONET_ERROR = 0;
    private static final String SOCKETEXCEPTION_SOCKET_CLOSED = "Socket Closed";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, Integer> exceptionCodeMap = new HashMap<String, Integer>() { // from class: com.meituan.metrics.traffic.report.NetExceptionCodeUtil.1
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            put(Exception.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_EXCEPTION));
            put(IOException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_IOEXCEPTION));
            put(SocketException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_SOCKETEXCEPTION));
            put(BindException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_BINDEXCEPTION));
            put(ConnectException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_CONNECTEXCEPTION));
            put(HttpRetryException.class.getName(), -504);
            put(MalformedURLException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_MALFORMEDURLEXCEPTION));
            put(NoRouteToHostException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_NOROUTETOHOSTEXCEPTION));
            put(PortUnreachableException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_PORTUNREACHABLEEXCEPTION));
            put(ProtocolException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_PROTOCOLEXCEPTION));
            put(SocketTimeoutException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_SOCKETTIMEOUTEXCEPTION));
            put(UnknownHostException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_UNKNOWNHOSTEXCEPTION));
            put(UnknownServiceException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_UNKNOWNSERVICEEXCEPTION));
            put(URISyntaxException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_URISYNTAXEXCEPTION));
            put(InterruptedIOException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_INTERRUPTEDIOEXCEPTION));
            put(SSLException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_SSLEXCEPTION));
            put(SSLHandshakeException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_SSLHANDSHAKEEXCEPTION));
            put(SSLKeyException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_SSLKEYEXCEPTION));
            put(SSLPeerUnverifiedException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_SSLPEERUNVERIFIEDEXCEPTION));
            put(SSLProtocolException.class.getName(), Integer.valueOf((int) NetExceptionCodeUtil.NETEXCEPTIONCODE_SSLPROTOCOLEXCEPTION));
        }
    };

    public static final int getDefaultExceptionCode() {
        return NETEXCEPTIONCODE_EXCEPTION;
    }

    public static final boolean isCronetException(int i) {
        return i != 0;
    }

    public static final int responseNullVerification(Object obj) {
        if (obj == null) {
            return NETEXCEPTIONCODE_NULL_RESPONSE;
        }
        return 0;
    }

    public static final int getExceptionCode(TrafficRecord.Detail detail) {
        Exception exc;
        Object[] objArr = {detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a14a703eee10a73e5fd992f7b0903ade", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a14a703eee10a73e5fd992f7b0903ade")).intValue();
        }
        if (detail == null || (exc = (Exception) detail.exception) == null) {
            return NETEXCEPTIONCODE_EXCEPTION;
        }
        int ioExceptionCanceled = ioExceptionCanceled(exc);
        if (ioExceptionCanceled < 0) {
            return ioExceptionCanceled;
        }
        int interruptedIoExceptionThreadInterrupted = interruptedIoExceptionThreadInterrupted(exc);
        if (interruptedIoExceptionThreadInterrupted < 0) {
            return interruptedIoExceptionThreadInterrupted;
        }
        int socketExceptionSocketClosed = socketExceptionSocketClosed(exc);
        if (socketExceptionSocketClosed < 0) {
            return socketExceptionSocketClosed;
        }
        Integer num = exceptionCodeMap.get(exc.getClass().getName());
        if (num == null) {
            int cronetExceptionCode = getCronetExceptionCode(detail);
            return isCronetException(cronetExceptionCode) ? cronetExceptionCode : NETEXCEPTIONCODE_EXCEPTION;
        }
        return num.intValue();
    }

    public static final int getCronetExceptionCode(TrafficRecord.Detail detail) {
        Object[] objArr = {detail};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b21c848b2589e21edf923ad954e7dc9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b21c848b2589e21edf923ad954e7dc9")).intValue();
        }
        if (detail.extra == null || !detail.extra.containsKey(CRONET_INTERNAL_ERROR_CODE)) {
            return 0;
        }
        try {
            return ((Integer) detail.extra.get(CRONET_INTERNAL_ERROR_CODE)).intValue() - 1000;
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static final int ioExceptionCanceled(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1bd06f6ce56fa8b3847aff881e2d7f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1bd06f6ce56fa8b3847aff881e2d7f5")).intValue();
        }
        if (IOException.class.getName().equals(exc.getClass().getName()) && IOEXCEPTION_CANCELED.equalsIgnoreCase(exc.getMessage())) {
            return NETEXCEPTIONCODE_IOEXCEPTION_CANCELED;
        }
        return 0;
    }

    public static final int interruptedIoExceptionThreadInterrupted(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be477c6a588ca1965b0935e2c41f9f67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be477c6a588ca1965b0935e2c41f9f67")).intValue();
        }
        if (InterruptedIOException.class.getName().equals(exc.getClass().getName()) && INTERRUPTEDIOEXCEPTION_THREAD_INTERRUPTED.equalsIgnoreCase(exc.getMessage())) {
            return NETEXCEPTIONCODE_INTERRUPTEDIOEXCEPTION_THREAD_INTERRUPTED;
        }
        return 0;
    }

    public static final int socketExceptionSocketClosed(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5fc856cb9430095488286b4e8d5720f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5fc856cb9430095488286b4e8d5720f8")).intValue();
        }
        if (SocketException.class.getName().equals(exc.getClass().getName()) && SOCKETEXCEPTION_SOCKET_CLOSED.equalsIgnoreCase(exc.getMessage())) {
            return NETEXCEPTIONCODE_SOCKETEXCEPTION_SOCKET_CLOSED;
        }
        return 0;
    }

    public static boolean isHttpSuccess(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09c626adebf31ae53fa8f207289180eb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09c626adebf31ae53fa8f207289180eb")).booleanValue() : 2 == i / 100;
    }
}
