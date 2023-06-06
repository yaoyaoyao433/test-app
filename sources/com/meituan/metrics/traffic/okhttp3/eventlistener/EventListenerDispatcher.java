package com.meituan.metrics.traffic.okhttp3.eventlistener;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
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
public class EventListenerDispatcher extends EventListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<EventListener> listeners;

    public EventListenerDispatcher(List<EventListener> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "386cc6e380cf3457c495b209819d010c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "386cc6e380cf3457c495b209819d010c");
        } else if (list == null) {
            this.listeners = new ArrayList();
        } else {
            this.listeners = list;
        }
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc6ee8aefd75ff452a669cd227b69f84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc6ee8aefd75ff452a669cd227b69f84");
            return;
        }
        super.callStart(call);
        for (EventListener eventListener : this.listeners) {
            eventListener.callStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        Object[] objArr = {call, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25b9e002ce5069e384e208c6e80a0d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25b9e002ce5069e384e208c6e80a0d37");
            return;
        }
        super.dnsStart(call, str);
        for (EventListener eventListener : this.listeners) {
            eventListener.dnsStart(call, str);
        }
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        Object[] objArr = {call, str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e140551ccb440dbff7f4e886826d168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e140551ccb440dbff7f4e886826d168");
            return;
        }
        super.dnsEnd(call, str, list);
        for (EventListener eventListener : this.listeners) {
            eventListener.dnsEnd(call, str, list);
        }
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Object[] objArr = {call, inetSocketAddress, proxy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42d9d87ae0d684885f5e37048c88ef91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42d9d87ae0d684885f5e37048c88ef91");
            return;
        }
        super.connectStart(call, inetSocketAddress, proxy);
        for (EventListener eventListener : this.listeners) {
            eventListener.connectStart(call, inetSocketAddress, proxy);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a984defcae85a81af43d74534aa90a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a984defcae85a81af43d74534aa90a7");
            return;
        }
        super.secureConnectStart(call);
        for (EventListener eventListener : this.listeners) {
            eventListener.secureConnectStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        Object[] objArr = {call, handshake};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc44b16d195f72797f5cbd3eb02c0b09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc44b16d195f72797f5cbd3eb02c0b09");
            return;
        }
        super.secureConnectEnd(call, handshake);
        for (EventListener eventListener : this.listeners) {
            eventListener.secureConnectEnd(call, handshake);
        }
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Object[] objArr = {call, inetSocketAddress, proxy, protocol};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b45f8373ef59a6e746afd7f06d5c52f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b45f8373ef59a6e746afd7f06d5c52f3");
            return;
        }
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        for (EventListener eventListener : this.listeners) {
            eventListener.connectEnd(call, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        Object[] objArr = {call, inetSocketAddress, proxy, protocol, iOException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b680cb39af73a1fa98bb60bc64c77d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b680cb39af73a1fa98bb60bc64c77d4");
            return;
        }
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        for (EventListener eventListener : this.listeners) {
            eventListener.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        }
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        Object[] objArr = {call, connection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1418d0ffffd93380e4960de70aa3cffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1418d0ffffd93380e4960de70aa3cffe");
            return;
        }
        super.connectionAcquired(call, connection);
        for (EventListener eventListener : this.listeners) {
            eventListener.connectionAcquired(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        Object[] objArr = {call, connection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "300301d3336884ac8077eece370ea4f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "300301d3336884ac8077eece370ea4f5");
            return;
        }
        super.connectionReleased(call, connection);
        for (EventListener eventListener : this.listeners) {
            eventListener.connectionReleased(call, connection);
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aea2c6d7fa48b0a342efccaf4d98d17b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aea2c6d7fa48b0a342efccaf4d98d17b");
            return;
        }
        super.requestHeadersStart(call);
        for (EventListener eventListener : this.listeners) {
            eventListener.requestHeadersStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        Object[] objArr = {call, request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47a685f0c18406296572812b13d783d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47a685f0c18406296572812b13d783d2");
            return;
        }
        super.requestHeadersEnd(call, request);
        for (EventListener eventListener : this.listeners) {
            eventListener.requestHeadersEnd(call, request);
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a649b9b20a1244304cb0c4e1b9796d67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a649b9b20a1244304cb0c4e1b9796d67");
            return;
        }
        super.requestBodyStart(call);
        for (EventListener eventListener : this.listeners) {
            eventListener.requestBodyStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j) {
        Object[] objArr = {call, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a3a8e25f818f705f22e8ba91b9ee60e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a3a8e25f818f705f22e8ba91b9ee60e");
            return;
        }
        super.requestBodyEnd(call, j);
        for (EventListener eventListener : this.listeners) {
            eventListener.requestBodyEnd(call, j);
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c75ead948653b84fd3634c15e3421040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c75ead948653b84fd3634c15e3421040");
            return;
        }
        super.responseHeadersStart(call);
        for (EventListener eventListener : this.listeners) {
            eventListener.responseHeadersStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        Object[] objArr = {call, response};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0312585e65608155a6c2e07f268ca8b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0312585e65608155a6c2e07f268ca8b7");
            return;
        }
        super.responseHeadersEnd(call, response);
        for (EventListener eventListener : this.listeners) {
            eventListener.responseHeadersEnd(call, response);
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e42eb9ed6324318df900ee032e85c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e42eb9ed6324318df900ee032e85c7b");
            return;
        }
        super.responseBodyStart(call);
        for (EventListener eventListener : this.listeners) {
            eventListener.responseBodyStart(call);
        }
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j) {
        Object[] objArr = {call, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7a2b78f9486f43f75fe5cfa3d0ed91d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7a2b78f9486f43f75fe5cfa3d0ed91d");
            return;
        }
        super.responseBodyEnd(call, j);
        for (EventListener eventListener : this.listeners) {
            eventListener.responseBodyEnd(call, j);
        }
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53242c87a327e5153f1c9a4f0ad02167", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53242c87a327e5153f1c9a4f0ad02167");
            return;
        }
        super.callEnd(call);
        for (EventListener eventListener : this.listeners) {
            eventListener.callEnd(call);
        }
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        Object[] objArr = {call, iOException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "138946a78396c29a77d80101212b56e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "138946a78396c29a77d80101212b56e3");
            return;
        }
        super.callFailed(call, iOException);
        for (EventListener eventListener : this.listeners) {
            eventListener.callFailed(call, iOException);
        }
    }
}
