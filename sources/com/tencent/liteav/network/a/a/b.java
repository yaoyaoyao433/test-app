package com.tencent.liteav.network.a.a;

import com.meituan.robust.common.CommonConstant;
import com.tencent.liteav.network.a.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static byte[] a(String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        com.tencent.liteav.network.a.b.a aVar = new com.tencent.liteav.network.a.b.a();
        aVar.a(8);
        try {
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeShort((short) aVar.a());
            dataOutputStream.writeShort(1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
            b(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static void a(OutputStream outputStream, String str) throws IOException {
        for (String str2 : str.split("[.。．｡]")) {
            byte[] bytes = IDN.toASCII(str2).getBytes();
            outputStream.write(bytes.length);
            outputStream.write(bytes, 0, bytes.length);
        }
        outputStream.write(0);
    }

    private static void b(OutputStream outputStream, String str) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        a(outputStream, str);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(1);
    }

    public static e[] a(byte[] bArr, int i, String str) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        if (readUnsignedShort != i) {
            throw new com.tencent.liteav.network.a.a(str, "the answer id " + readUnsignedShort + " is not match " + i);
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        boolean z = ((readUnsignedShort2 >> 8) & 1) == 1;
        if (!(((readUnsignedShort2 >> 7) & 1) == 1) || !z) {
            throw new com.tencent.liteav.network.a.a(str, "the dns server cant support recursion ");
        }
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        int readUnsignedShort4 = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        a(dataInputStream, bArr, readUnsignedShort3);
        return b(dataInputStream, bArr, readUnsignedShort4);
    }

    private static String a(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            int readUnsignedByte2 = ((readUnsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte2));
            return a(bArr, readUnsignedByte2, hashSet);
        } else if (readUnsignedByte == 0) {
            return "";
        } else {
            byte[] bArr2 = new byte[readUnsignedByte];
            dataInputStream.readFully(bArr2);
            String unicode = IDN.toUnicode(new String(bArr2));
            String a = a(dataInputStream, bArr);
            if (a.length() > 0) {
                return unicode + CommonConstant.Symbol.DOT + a;
            }
            return unicode;
        }
    }

    private static String a(byte[] bArr, int i, HashSet<Integer> hashSet) throws IOException {
        while (true) {
            int i2 = bArr[i] & 255;
            if ((i2 & 192) != 192) {
                if (i2 == 0) {
                    return "";
                }
                int i3 = i + 1;
                String str = new String(bArr, i3, i2);
                String a = a(bArr, i3 + i2, hashSet);
                if (a.length() > 0) {
                    return str + CommonConstant.Symbol.DOT + a;
                }
                return str;
            }
            i = (bArr[i + 1] & 255) + ((i2 & 63) << 8);
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new com.tencent.liteav.network.a.a("", "Cyclic offsets detected.");
            }
            hashSet.add(Integer.valueOf(i));
        }
    }

    private static void a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            a(dataInputStream, bArr);
            dataInputStream.readUnsignedShort();
            dataInputStream.readUnsignedShort();
            i = i2;
        }
    }

    private static e[] b(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        e[] eVarArr = new e[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return eVarArr;
            }
            eVarArr[i2] = b(dataInputStream, bArr);
            i2++;
            i = i3;
        }
    }

    private static e b(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        String hostAddress;
        a(dataInputStream, bArr);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        long readUnsignedShort2 = (dataInputStream.readUnsignedShort() << 16) + dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        if (readUnsignedShort == 1) {
            byte[] bArr2 = new byte[4];
            dataInputStream.readFully(bArr2);
            hostAddress = InetAddress.getByAddress(bArr2).getHostAddress();
        } else if (readUnsignedShort != 5) {
            for (int i = 0; i < readUnsignedShort3; i++) {
                dataInputStream.readByte();
            }
            hostAddress = null;
        } else {
            hostAddress = a(dataInputStream, bArr);
        }
        if (hostAddress == null) {
            throw new UnknownHostException("no record");
        }
        return new e(hostAddress, readUnsignedShort, (int) readUnsignedShort2, System.currentTimeMillis() / 1000);
    }
}
