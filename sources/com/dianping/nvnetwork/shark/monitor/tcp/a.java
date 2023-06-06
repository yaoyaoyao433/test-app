package com.dianping.nvnetwork.shark.monitor.tcp;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public final c a(@NonNull b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0a9538bfa4cd48cb17eb488884f60f", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0a9538bfa4cd48cb17eb488884f60f");
        }
        c cVar = new c();
        if (!TextUtils.isEmpty(bVar.b)) {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(bVar.b);
                if (allByName != null && allByName.length > 0) {
                    long a2 = a(new InetSocketAddress(allByName[(i < 0 || i >= allByName.length) ? 0 : 0], bVar.d), bVar.c);
                    Object[] objArr2 = {new Long(a2)};
                    ChangeQuickRedirect changeQuickRedirect2 = c.a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "fdc41475d61d9011e56c56bbc54bd5f5", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "fdc41475d61d9011e56c56bbc54bd5f5");
                    } else {
                        cVar.d = a2;
                    }
                    cVar.b = true;
                } else {
                    cVar.b = false;
                    cVar.c = "IOException";
                }
            } catch (Exception unused) {
                cVar.b = false;
                cVar.c = "IOException";
            }
        }
        return cVar;
    }

    private long a(@NonNull SocketAddress socketAddress, @IntRange(from = 0) int i) throws IOException {
        Object[] objArr = {socketAddress, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643fd24e25cde49389e7c8ed7675c719", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643fd24e25cde49389e7c8ed7675c719")).longValue();
        }
        Socket socket = new Socket();
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                socket.connect(socketAddress, i);
                return System.currentTimeMillis() - currentTimeMillis;
            } catch (Exception unused) {
                throw new IOException();
            }
        } finally {
            socket.close();
        }
    }
}
