package com.sankuai.waimai.platform.net.interceptor.okhttp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import javax.net.SocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends SocketFactory {
    public static ChangeQuickRedirect a;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3576b58749e58f923999a39e911c6c8", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3576b58749e58f923999a39e911c6c8") : new a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d6161127b92788a3cceaf3fe217186", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d6161127b92788a3cceaf3fe217186") : new a(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i), inetAddress, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dd67d2715d77965562724333ee8669", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dd67d2715d77965562724333ee8669") : new a(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab260fd2d930bf76f5bf371fca9c144", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab260fd2d930bf76f5bf371fca9c144") : new a(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i), inetAddress2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9bfb75d8e8983e3cfe2213e466fd04", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9bfb75d8e8983e3cfe2213e466fd04") : new a(inetAddress, i, inetAddress2, i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends Socket {
        public static ChangeQuickRedirect a;

        @Override // java.net.Socket
        public final void connect(SocketAddress socketAddress) throws IOException {
            Object[] objArr = {socketAddress};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8ba4600e159429345f406c536490934", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8ba4600e159429345f406c536490934");
                return;
            }
            f.a().a(socketAddress);
            super.connect(socketAddress);
        }

        @Override // java.net.Socket
        public final void connect(SocketAddress socketAddress, int i) throws IOException {
            Object[] objArr = {socketAddress, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2c8e75b82482227410ad2242f43e15", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2c8e75b82482227410ad2242f43e15");
                return;
            }
            f.a().a(socketAddress);
            super.connect(socketAddress, i);
        }

        public a() {
        }

        public a(String str, int i) throws IOException {
            super(str, i);
            Object[] objArr = {j.this, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b912e671327485de640865604e0c36c3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b912e671327485de640865604e0c36c3");
            }
        }

        public a(InetAddress inetAddress, int i) throws IOException {
            super(inetAddress, i);
            Object[] objArr = {j.this, inetAddress, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35c082c3735ee5f336e42c44c9c38a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35c082c3735ee5f336e42c44c9c38a6");
            }
        }

        public a(String str, int i, InetAddress inetAddress, int i2) throws IOException {
            super(str, i, inetAddress, i2);
            Object[] objArr = {j.this, str, Integer.valueOf(i), inetAddress, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555ba63c43f0b915be23560e532d5ce8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555ba63c43f0b915be23560e532d5ce8");
            }
        }

        public a(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            super(inetAddress, i, inetAddress2, i2);
            Object[] objArr = {j.this, inetAddress, Integer.valueOf(i), inetAddress2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb83c825a2f982b31d8877b123af158d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb83c825a2f982b31d8877b123af158d");
            }
        }
    }
}
