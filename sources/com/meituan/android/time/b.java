package com.meituan.android.time;

import android.os.SystemClock;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    long b;
    long c;
    private long d;
    private long e;
    private c.a f;

    public b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7742e50919a263cc727887ee91457d88", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7742e50919a263cc727887ee91457d88");
        } else {
            this.f = aVar;
        }
    }

    public final boolean a(String str, int i) {
        DatagramSocket datagramSocket;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1724d4d5feccd157adced6337152aba3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1724d4d5feccd157adced6337152aba3")).booleanValue();
        }
        DatagramSocket datagramSocket2 = null;
        try {
            datagramSocket = new DatagramSocket();
        } catch (Throwable th) {
            th = th;
        }
        try {
            datagramSocket.setSoTimeout(i);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, InetAddress.getByName(str), 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object[] objArr2 = {bArr, 40, new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f80b7902e5205e24c2532d6cae9adc9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f80b7902e5205e24c2532d6cae9adc9");
            } else {
                long j = currentTimeMillis / 1000;
                long j2 = currentTimeMillis - (j * 1000);
                long j3 = j + 2208988800L;
                bArr[40] = (byte) (j3 >> 24);
                bArr[41] = (byte) (j3 >> 16);
                bArr[42] = (byte) (j3 >> 8);
                bArr[43] = (byte) (j3 >> 0);
                long j4 = (j2 * 4294967296L) / 1000;
                bArr[44] = (byte) (j4 >> 24);
                bArr[45] = (byte) (j4 >> 16);
                bArr[46] = (byte) (j4 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j5 = elapsedRealtime2 - elapsedRealtime;
            long j6 = currentTimeMillis + j5;
            long b = b(bArr, 24);
            long b2 = b(bArr, 32);
            long b3 = b(bArr, 40);
            long j7 = ((b2 - b) + (b3 - j6)) / 2;
            this.b = j6 + j7;
            this.d = elapsedRealtime2;
            this.e = j5 - (b3 - b2);
            this.c = j7;
            if (this.f != null) {
                StringBuilder sb = new StringBuilder("clockOffset from ");
                sb.append(str);
                sb.append(" is: ");
                sb.append(j7);
            }
            try {
                datagramSocket.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        } catch (Throwable th2) {
            th = th2;
            datagramSocket2 = datagramSocket;
            try {
                if (this.f != null) {
                    StringBuilder sb2 = new StringBuilder("clockOffset from ");
                    sb2.append(str);
                    sb2.append(" fail: ");
                    sb2.append(th.getMessage());
                }
                if (datagramSocket2 != null) {
                    try {
                        datagramSocket2.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th3) {
                DatagramSocket datagramSocket3 = datagramSocket2;
                if (datagramSocket3 != null) {
                    try {
                        datagramSocket3.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                throw th3;
            }
        }
    }

    private long a(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd510f34cf72e12a552e8cc2297d6f22", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd510f34cf72e12a552e8cc2297d6f22")).longValue();
        }
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    private long b(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c31df5de96c953159ada75d64f6f8d4", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c31df5de96c953159ada75d64f6f8d4")).longValue() : ((a(bArr, i) - 2208988800L) * 1000) + ((a(bArr, i + 4) * 1000) / 4294967296L);
    }
}
