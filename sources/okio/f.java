package okio;

import com.meituan.robust.common.CommonConstant;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class f implements Serializable, Comparable<f> {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final f b = a(new byte[0]);
    private static final long serialVersionUID = 1;
    final byte[] c;
    transient int d;
    transient String e;

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(f fVar) {
        f fVar2 = fVar;
        int h = h();
        int h2 = fVar2.h();
        int min = Math.min(h, h2);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = fVar2.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (h == h2) {
            return 0;
        }
        return h < h2 ? -1 : 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(byte[] bArr) {
        this.c = bArr;
    }

    public static f a(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new f((byte[]) bArr.clone());
    }

    public static f a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(u.a));
        fVar.e = str;
        return fVar;
    }

    public static f a(String str, Charset charset) {
        if (str != null) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            return new f(str.getBytes(charset));
        }
        throw new IllegalArgumentException("s == null");
    }

    public String a() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.c, u.a);
        this.e = str2;
        return str2;
    }

    public String b() {
        return b.a(this.c);
    }

    public f c() {
        return d("MD5");
    }

    public f d() {
        return d("SHA-1");
    }

    public f e() {
        return d("SHA-256");
    }

    private f d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Nullable
    public static f b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] a2 = b.a(str);
        if (a2 != null) {
            return new f(a2);
        }
        return null;
    }

    public String f() {
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

    public static f c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
        }
        return a(bArr);
    }

    private static int a(char c) {
        if (c < '0' || c > '9') {
            if (c < 'a' || c > 'f') {
                if (c < 'A' || c > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c);
                }
                return (c - 'A') + 10;
            }
            return (c - 'a') + 10;
        }
        return c - '0';
    }

    public f g() {
        for (int i = 0; i < this.c.length; i++) {
            byte b2 = this.c[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr = (byte[]) this.c.clone();
                bArr[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr.length; i2++) {
                    byte b3 = bArr[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr[i2] = (byte) (b3 + 32);
                    }
                }
                return new f(bArr);
            }
        }
        return this;
    }

    public f a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (i2 > this.c.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.c.length + CommonConstant.Symbol.BRACKET_RIGHT);
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == this.c.length) {
            return this;
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.c, i, bArr, 0, i3);
        return new f(bArr);
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int h() {
        return this.c.length;
    }

    public byte[] i() {
        return (byte[]) this.c.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] j() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        cVar.c(this.c, 0, this.c.length);
    }

    public boolean a(int i, f fVar, int i2, int i3) {
        return fVar.a(0, this.c, 0, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return i >= 0 && i <= this.c.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && u.a(this.c, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.h() == this.c.length && fVar.a(0, this.c, 0, this.c.length)) {
                return true;
            }
        }
        return false;
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

    public String toString() {
        if (this.c.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int length = a2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a2.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = a2.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i == -1) {
            if (this.c.length <= 64) {
                return "[hex=" + f() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
            }
            return "[size=" + this.c.length + " hex=" + a(0, 64).f() + "…]";
        }
        String replace = a2.substring(0, i).replace(CommonConstant.Symbol.SLASH_RIGHT, "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < a2.length()) {
            return "[size=" + this.c.length + " text=" + replace + "…]";
        }
        return "[text=" + replace + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
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
        f fVar = new f(bArr);
        try {
            Field declaredField = f.class.getDeclaredField(com.huawei.hms.opendevice.c.a);
            declaredField.setAccessible(true);
            declaredField.set(this, fVar.c);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }
}
