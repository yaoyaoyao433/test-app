package com.meizu.cloud.pushsdk.c.g;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class e implements Serializable, Comparable<e> {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final e b = a(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] c;
    transient int d;
    public transient String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(byte[] bArr) {
        this.c = bArr;
    }

    public static e a(String str) {
        if (str != null) {
            e eVar = new e(str.getBytes(o.a));
            eVar.e = str;
            return eVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static e a(byte... bArr) {
        if (bArr != null) {
            return new e((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private e b(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public final String a() {
        byte[] bArr;
        char[] cArr = new char[this.c.length * 2];
        int i = 0;
        for (byte b2 : this.c) {
            int i2 = i + 1;
            cArr[i] = a[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = a[b2 & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.c.length == this.c.length) {
                byte[] bArr = this.c;
                int length = this.c.length;
                if (eVar.c.length - length >= 0 && bArr.length - length >= 0 && o.a(eVar.c, 0, bArr, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return this.c.length == 0 ? "ByteString[size=0]" : this.c.length <= 16 ? String.format("ByteString[size=%s data=%s]", Integer.valueOf(this.c.length), a()) : String.format("ByteString[size=%s md5=%s]", Integer.valueOf(this.c.length), b("MD5").a());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (readInt < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + readInt);
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        e eVar = new e(bArr);
        try {
            Field declaredField = e.class.getDeclaredField(com.huawei.hms.opendevice.c.a);
            declaredField.setAccessible(true);
            declaredField.set(this, eVar.c);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        e eVar2 = eVar;
        int length = this.c.length;
        int length2 = eVar2.c.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            int i2 = this.c[i] & 255;
            int i3 = eVar2.c[i] & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (length == length2) {
            return 0;
        }
        return length < length2 ? -1 : 1;
    }
}
