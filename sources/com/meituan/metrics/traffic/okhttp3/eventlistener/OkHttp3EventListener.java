package com.meituan.metrics.traffic.okhttp3.eventlistener;

import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.okhttp3.OkHttp3RequestInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OkHttp3EventListener extends EventListener {
    private static String TAG = "OkHttp3EventListener";
    public static ChangeQuickRedirect changeQuickRedirect;
    private long callStart;
    private int connectFailedTimes;
    private long connectStart;
    private int connectTimes;
    private long dnsStart;
    private OkHttp3RequestInterceptor interceptor;
    private TrafficRecord.Detail mData;
    private long requestBodyEnd;
    private long requestBodyStart;
    private long requestHeadersEnd;
    private long requestHeadersStart;
    private long responseBodyEnd;
    private long responseBodyStart;
    private long responseHeadersEnd;
    private long responseHeadersStart;
    private long secureConnectStart;

    public OkHttp3EventListener(OkHttp3RequestInterceptor okHttp3RequestInterceptor) {
        Object[] objArr = {okHttp3RequestInterceptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6075864efb9157ae16937140719d2320", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6075864efb9157ae16937140719d2320");
        } else {
            this.interceptor = okHttp3RequestInterceptor;
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afe5da66c8ae48a41669386bb9ad25a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afe5da66c8ae48a41669386bb9ad25a6");
            return;
        }
        super.callStart(call);
        this.callStart = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        Object[] objArr = {call, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36a894d76ae579511f03ba94fdfc1189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36a894d76ae579511f03ba94fdfc1189");
            return;
        }
        super.dnsStart(call, str);
        this.dnsStart = System.nanoTime();
        getData().requestReuse = 0;
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        Object[] objArr = {call, str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c69ff07ff464b76dfb4427c85905cd45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c69ff07ff464b76dfb4427c85905cd45");
            return;
        }
        super.dnsEnd(call, str, list);
        getData().dnsTime = System.nanoTime() - this.dnsStart;
        getData().ipList = list;
        getData().dnsType = 0;
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Object[] objArr = {call, inetSocketAddress, proxy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da0c3518a679d24c9761bb257e1ed4e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da0c3518a679d24c9761bb257e1ed4e7");
            return;
        }
        super.connectStart(call, inetSocketAddress, proxy);
        this.connectTimes++;
        getData().connectTryNum = this.connectTimes;
        if (this.connectTimes == 1) {
            this.connectStart = System.nanoTime();
        }
        getData().requestReuse = 0;
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c87eacd7a584eadcd184661e6272c14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c87eacd7a584eadcd184661e6272c14");
            return;
        }
        super.secureConnectStart(call);
        this.secureConnectStart = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        Object[] objArr = {call, handshake};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e2b1a96230ad802d285a2925bc72185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e2b1a96230ad802d285a2925bc72185");
            return;
        }
        super.secureConnectEnd(call, handshake);
        getData().tlsTime = System.nanoTime() - this.secureConnectStart;
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Object[] objArr = {call, inetSocketAddress, proxy, protocol};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6be790a6a6159aa940fecb924824ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6be790a6a6159aa940fecb924824ef4");
            return;
        }
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        getData().connTime = System.nanoTime() - this.connectStart;
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        Object[] objArr = {call, inetSocketAddress, proxy, protocol, iOException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "982446bd29f25a3de17d13f15afed159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "982446bd29f25a3de17d13f15afed159");
            return;
        }
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        getData().connTime = System.nanoTime() - this.connectStart;
        this.connectFailedTimes++;
        getData().connectFailedNum = this.connectFailedTimes;
        getData().connectIp = inetSocketAddress;
        getData().proxy = proxy.toString();
        if (protocol != null) {
            TrafficRecord.Detail data = getData();
            StringBuilder sb = new StringBuilder();
            sb.append(protocol);
            data.protocol = sb.toString();
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        Object[] objArr = {call, connection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6858caf9dbf27c0832c133852b99110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6858caf9dbf27c0832c133852b99110");
            return;
        }
        super.connectionAcquired(call, connection);
        if (connection != null) {
            if (connection.socket() != null && connection.socket().getRemoteSocketAddress() != null) {
                getData().localIp = (InetSocketAddress) connection.socket().getLocalSocketAddress();
                getData().connectIp = (InetSocketAddress) connection.socket().getRemoteSocketAddress();
                if (getData().requestReuse != 0) {
                    getData().requestReuse = 1;
                }
                if (getData().connectTryNum < 0) {
                    getData().connectTryNum = 0;
                }
                if (getData().connectFailedNum < 0) {
                    getData().connectFailedNum = 0;
                }
            }
            if (connection.protocol() != null) {
                TrafficRecord.Detail data = getData();
                StringBuilder sb = new StringBuilder();
                sb.append(connection.protocol());
                data.protocol = sb.toString();
            }
            if (connection.route() != null && connection.route().proxy() != null) {
                getData().proxy = connection.route().proxy().toString();
            }
            if (connection.handshake() != null) {
                getData().tlsVersion = connection.handshake().tlsVersion().javaName();
            }
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecb6d369b19286606eecd8ab8e66b2e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecb6d369b19286606eecd8ab8e66b2e4");
            return;
        }
        super.requestHeadersStart(call);
        this.requestHeadersStart = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        Object[] objArr = {call, request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c83912901c83fab6b717d34a419d08dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c83912901c83fab6b717d34a419d08dd");
            return;
        }
        super.requestHeadersEnd(call, request);
        this.requestHeadersEnd = System.nanoTime();
        getData().requestHeaderTime = this.requestHeadersEnd - this.requestHeadersStart;
        getData().requestTime = getData().requestHeaderTime;
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f98c9e5145f23f8d27dca4825511171", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f98c9e5145f23f8d27dca4825511171");
            return;
        }
        super.requestBodyStart(call);
        this.requestBodyStart = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
        Object[] objArr = {call, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5127a0dc9e71d88f4fc6ccb7bdf15211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5127a0dc9e71d88f4fc6ccb7bdf15211");
            return;
        }
        super.requestBodyEnd(call, j);
        this.requestBodyEnd = System.nanoTime();
        getData().requestBodyTime = this.requestBodyEnd - this.requestBodyStart;
        getData().requestTime = this.requestBodyEnd - this.requestHeadersStart;
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6e134f71b850c22c2ca142b4b50309b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6e134f71b850c22c2ca142b4b50309b");
            return;
        }
        super.responseHeadersStart(call);
        this.responseHeadersStart = System.nanoTime();
        if (this.dnsStart > 0) {
            getData().ttfbTime = this.responseHeadersStart - this.dnsStart;
        } else if (this.connectStart > 0) {
            getData().ttfbTime = this.responseHeadersStart - this.connectStart;
        } else if (this.requestHeadersStart > 0) {
            getData().ttfbTime = this.responseHeadersStart - this.requestHeadersStart;
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        Object[] objArr = {call, response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6641a220ae041076b5c03e14c5463caf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6641a220ae041076b5c03e14c5463caf");
            return;
        }
        super.responseHeadersEnd(call, response);
        this.responseHeadersEnd = System.nanoTime();
        getData().responseHeaderTime = this.responseHeadersEnd - this.responseHeadersStart;
        getData().responseTime = getData().responseHeaderTime;
        if (response.isRedirect()) {
            getData().redirect = true;
            clearAllStatus();
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bce0c6992112b809c2a91df6298a9f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bce0c6992112b809c2a91df6298a9f0");
            return;
        }
        super.responseBodyStart(call);
        this.responseBodyStart = System.nanoTime();
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
        Object[] objArr = {call, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be3d5da5e43dbdaadf8edfe35bb6a104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be3d5da5e43dbdaadf8edfe35bb6a104");
            return;
        }
        super.responseBodyEnd(call, j);
        this.responseBodyEnd = System.nanoTime();
        getData().responseBodyTime = this.responseBodyEnd - this.responseBodyStart;
        getData().responseTime = this.responseBodyEnd - this.responseHeadersStart;
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e196c57fd40b1df1c3009f8ce04ebe2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e196c57fd40b1df1c3009f8ce04ebe2b");
        } else {
            super.callEnd(call);
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        Object[] objArr = {call, iOException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56dcf4ce7bdead29d63832301fcd97f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56dcf4ce7bdead29d63832301fcd97f3");
        } else {
            super.callFailed(call, iOException);
        }
    }

    private void clearAllStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f66983d51d0c0336373c7c29bdbc62ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f66983d51d0c0336373c7c29bdbc62ab");
            return;
        }
        this.dnsStart = 0L;
        this.connectStart = 0L;
        this.secureConnectStart = 0L;
        this.requestHeadersStart = 0L;
        this.requestHeadersEnd = 0L;
        this.requestBodyStart = 0L;
        this.requestBodyEnd = 0L;
        this.responseHeadersStart = 0L;
        this.responseHeadersEnd = 0L;
        this.responseBodyStart = 0L;
        this.responseBodyEnd = 0L;
        this.connectTimes = 0;
        this.connectFailedTimes = 0;
        getData().requestReuse = -1;
        getData().dnsType = -1;
        getData().ipList = null;
        getData().connectTryNum = -1;
        getData().connectFailedNum = -1;
        getData().localIp = null;
        getData().connectIp = null;
        getData().proxy = null;
        getData().protocol = null;
        getData().tlsVersion = null;
        getData().dnsTime = -1L;
        getData().connTime = -1L;
        getData().tlsTime = -1L;
        getData().requestTime = -1L;
        getData().requestHeaderTime = -1L;
        getData().requestBodyTime = -1L;
        getData().responseTime = -1L;
        getData().responseHeaderTime = -1L;
        getData().responseBodyTime = -1L;
        getData().ttfbTime = -1L;
    }

    private TrafficRecord.Detail getData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea36113fbb1e39a0c19ed979504a121d", RobustBitConfig.DEFAULT_VALUE)) {
            return (TrafficRecord.Detail) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea36113fbb1e39a0c19ed979504a121d");
        }
        if (this.mData == null) {
            this.mData = this.interceptor.getDetail();
        }
        return this.mData;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Factory implements EventListener.Factory {
        public static ChangeQuickRedirect changeQuickRedirect;
        private OkHttp3RequestInterceptor interceptor;

        public Factory(OkHttp3RequestInterceptor okHttp3RequestInterceptor) {
            Object[] objArr = {okHttp3RequestInterceptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f89c8a1b68b26ffe631977595420523", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f89c8a1b68b26ffe631977595420523");
            } else {
                this.interceptor = okHttp3RequestInterceptor;
            }
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            Object[] objArr = {call};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed595808de8ccda4334be94105768198", RobustBitConfig.DEFAULT_VALUE) ? (EventListener) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed595808de8ccda4334be94105768198") : new OkHttp3EventListener(this.interceptor);
        }
    }
}
