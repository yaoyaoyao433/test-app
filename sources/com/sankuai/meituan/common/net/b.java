package com.sankuai.meituan.common.net;

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
/* loaded from: classes4.dex */
public final class b extends SocketFactory {
    public static ChangeQuickRedirect a;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8d05e12c167a1a314a87657a978c6d", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8d05e12c167a1a314a87657a978c6d") : new a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77aad31255e5dacb0ce23529cba40d63", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77aad31255e5dacb0ce23529cba40d63") : new a(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i), inetAddress, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "753675e5a3a84ba4f729242c96dab235", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "753675e5a3a84ba4f729242c96dab235") : new a(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e30a1a6fbccaa94d2272dc443b5801", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e30a1a6fbccaa94d2272dc443b5801") : new a(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i), inetAddress2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3fdb70e980e7c46693756d6ebe42a28", RobustBitConfig.DEFAULT_VALUE) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3fdb70e980e7c46693756d6ebe42a28") : new a(inetAddress, i, inetAddress2, i2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends Socket {
        public static ChangeQuickRedirect a;

        @Override // java.net.Socket
        public final void connect(SocketAddress socketAddress) throws IOException {
            Object[] objArr = {socketAddress};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc264314f4db176a5f3fb0f36b4a891e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc264314f4db176a5f3fb0f36b4a891e");
                return;
            }
            com.sankuai.meituan.common.net.a.a().a(socketAddress);
            super.connect(socketAddress);
        }

        @Override // java.net.Socket
        public final void connect(SocketAddress socketAddress, int i) throws IOException {
            Object[] objArr = {socketAddress, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666a358a7f13d3469588f01b01b0755e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666a358a7f13d3469588f01b01b0755e");
                return;
            }
            com.sankuai.meituan.common.net.a.a().a(socketAddress);
            super.connect(socketAddress, i);
        }

        public a() {
        }

        public a(String str, int i) throws IOException {
            super(str, i);
            Object[] objArr = {b.this, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56f575b6eddcd0aedadd0932b9550e9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56f575b6eddcd0aedadd0932b9550e9");
            }
        }

        public a(InetAddress inetAddress, int i) throws IOException {
            super(inetAddress, i);
            Object[] objArr = {b.this, inetAddress, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f080844b74d7602690aa572c62ca08de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f080844b74d7602690aa572c62ca08de");
            }
        }

        public a(String str, int i, InetAddress inetAddress, int i2) throws IOException {
            super(str, i, inetAddress, i2);
            Object[] objArr = {b.this, str, Integer.valueOf(i), inetAddress, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1241d08611ef4148d12da65fc04734", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1241d08611ef4148d12da65fc04734");
            }
        }

        public a(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            super(inetAddress, i, inetAddress2, i2);
            Object[] objArr = {b.this, inetAddress, Integer.valueOf(i), inetAddress2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d8c2d8b98bd9bc458ac8c13fe3d2d6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d8c2d8b98bd9bc458ac8c13fe3d2d6");
            }
        }
    }
}
