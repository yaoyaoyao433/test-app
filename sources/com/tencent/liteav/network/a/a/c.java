package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.d;
import com.tencent.liteav.network.a.e;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements com.tencent.liteav.network.a.c {
    private static final Random b = new Random();
    final InetAddress a;
    private final int c;

    public c(InetAddress inetAddress) {
        this(inetAddress, 10);
    }

    public c(InetAddress inetAddress, int i) {
        this.a = inetAddress;
        this.c = i;
    }

    @Override // com.tencent.liteav.network.a.c
    public final e[] a(com.tencent.liteav.network.a.b bVar, d dVar) throws IOException {
        int nextInt;
        synchronized (b) {
            nextInt = b.nextInt() & 255;
        }
        byte[] a = a(b.a(bVar.a, nextInt));
        if (a == null) {
            throw new com.tencent.liteav.network.a.a(bVar.a, "cant get answer");
        }
        return b.a(a, nextInt, bVar.a);
    }

    private byte[] a(byte[] bArr) throws IOException {
        DatagramSocket datagramSocket;
        try {
            datagramSocket = new DatagramSocket();
        } catch (Throwable th) {
            th = th;
            datagramSocket = null;
        }
        try {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, this.a, 53);
            datagramSocket.setSoTimeout(this.c * 1000);
            datagramSocket.send(datagramPacket);
            DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1500], 1500);
            datagramSocket.receive(datagramPacket2);
            byte[] data = datagramPacket2.getData();
            datagramSocket.close();
            return data;
        } catch (Throwable th2) {
            th = th2;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }
}
