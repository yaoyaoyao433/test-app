package com.dianping.jscore.model;

import android.support.annotation.Keep;
import android.support.v4.internal.view.SupportMenu;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class Unarchived {
    private static final int STRING_JAVA_DECODE_LIMIT = 1500;
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte[] __strBuf;
    protected ByteBuffer byteBuffer;
    private Charset charset;

    public Unarchived(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "284d2b8d9bcbb812491a0c2c17a74f89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "284d2b8d9bcbb812491a0c2c17a74f89");
            return;
        }
        this.charset = Charset.forName("utf-16le");
        this.byteBuffer = ByteBuffer.wrap(bArr);
        this.byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public byte[] rawData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e90f9bf4d807d2fba16f538f97b7a27", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e90f9bf4d807d2fba16f538f97b7a27") : this.byteBuffer.array();
    }

    public boolean eof() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1808e9e079b799362e1b35103d1eff3b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1808e9e079b799362e1b35103d1eff3b")).booleanValue() : !this.byteBuffer.hasRemaining();
    }

    public byte peek() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ba85edb1709adca5302c19bbe150f33", RobustBitConfig.DEFAULT_VALUE) ? ((Byte) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ba85edb1709adca5302c19bbe150f33")).byteValue() : this.byteBuffer.get();
    }

    public void rewind() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec39d1277ed0e27de57e6f08f9fb6849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec39d1277ed0e27de57e6f08f9fb6849");
        } else {
            this.byteBuffer.rewind();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
        r1.append("(EOF)");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.dianping.jscore.model.Unarchived.changeQuickRedirect
            java.lang.String r10 = "2b23b52d45d295045c56b096b61fa020"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1b:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r2 = 20
            r1.<init>(r2)
            java.nio.ByteBuffer r2 = r11.byteBuffer
            r2.mark()
            java.lang.String r2 = "@"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.nio.ByteBuffer r2 = r11.byteBuffer     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.String r2 = "(x"
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.nio.ByteBuffer r2 = r11.byteBuffer     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.lang.String r2 = "): "
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
        L4c:
            r2 = 6
            if (r0 >= r2) goto L7c
            java.nio.ByteBuffer r2 = r11.byteBuffer     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            boolean r2 = r2.hasRemaining()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            if (r2 == 0) goto L69
            java.nio.ByteBuffer r2 = r11.byteBuffer     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            byte r2 = r2.get()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r1.append(r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            int r0 = r0 + 1
            goto L4c
        L69:
            java.lang.String r0 = "(EOF)"
            r1.append(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            goto L7c
        L6f:
            r0 = move-exception
            goto L86
        L71:
            boolean r0 = r11.eof()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L7c
            java.lang.String r0 = "EOF"
            r1.append(r0)     // Catch: java.lang.Throwable -> L6f
        L7c:
            java.nio.ByteBuffer r0 = r11.byteBuffer
            r0.reset()
            java.lang.String r0 = r1.toString()
            return r0
        L86:
            java.nio.ByteBuffer r1 = r11.byteBuffer
            r1.reset()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.jscore.model.Unarchived.toString():java.lang.String");
    }

    public boolean readBoolean() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "779a70bc8ab9bb80948e43c3b173cec2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "779a70bc8ab9bb80948e43c3b173cec2")).booleanValue();
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return false;
        }
        if (b == 66) {
            return this.byteBuffer.get() == 1;
        }
        throw new ArchiveException("unable to read boolean: " + this);
    }

    public double readDouble() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20fb0b2bc50d8287afce63c3ccd3b485", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20fb0b2bc50d8287afce63c3ccd3b485")).doubleValue();
        }
        byte b = this.byteBuffer.get();
        if (b == 68) {
            return this.byteBuffer.getDouble();
        }
        if (b == 78) {
            return 0.0d;
        }
        throw new ArchiveException("unable to read double: " + this);
    }

    public String readString() throws ArchiveException {
        CharBuffer decode;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d07bbf770db290fc1fb1713f4f3430f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d07bbf770db290fc1fb1713f4f3430f6");
        }
        byte b = this.byteBuffer.get();
        if (b != 83) {
            if (b == 78) {
                return "";
            }
            throw new ArchiveException("unable to read string: " + this);
        }
        int i = this.byteBuffer.getInt();
        int i2 = ((i / 4096) + 1) * 4096;
        if (this.__strBuf == null || this.__strBuf.length < i2) {
            this.__strBuf = new byte[i2];
        }
        this.byteBuffer.get(this.__strBuf, 0, i);
        try {
            if (i > STRING_JAVA_DECODE_LIMIT) {
                decode = this.charset.decode(ByteBuffer.wrap(this.__strBuf, 0, i));
            } else {
                decode = new UnicodeDecoder(this.charset, 2).decode(ByteBuffer.wrap(this.__strBuf, 0, i));
            }
            return String.valueOf(decode.array(), 0, decode.length());
        } catch (Exception unused) {
            throw new ArchiveException("unable to encode string");
        }
    }

    public int readMemberHash16() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6d4fb5d71f0070dac873129edd15ef3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6d4fb5d71f0070dac873129edd15ef3")).intValue() : this.byteBuffer.getInt() & SupportMenu.USER_MASK;
    }

    public double[] readDoubleArray() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6052465d01098682f2ee4a8752550705", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6052465d01098682f2ee4a8752550705");
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return new double[0];
        }
        if (b == 65) {
            int i = this.byteBuffer.getInt();
            double[] dArr = new double[i];
            for (int i2 = 0; i2 < i; i2++) {
                dArr[i2] = readDouble();
            }
            return dArr;
        }
        throw new ArchiveException("unable to read array (object): " + this);
    }

    public boolean[] readBoolArray() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40d953b2c3f0c07f182fbb9d2873b8fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (boolean[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40d953b2c3f0c07f182fbb9d2873b8fb");
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return new boolean[0];
        }
        if (b == 65) {
            int i = this.byteBuffer.getInt();
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < i; i2++) {
                zArr[i2] = readBoolean();
            }
            return zArr;
        }
        throw new ArchiveException("unable to read array (object): " + this);
    }

    public String[] readStringArray() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2644b3a03bd160013b9b7d538a8d476b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2644b3a03bd160013b9b7d538a8d476b");
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return new String[0];
        }
        if (b == 65) {
            int i = this.byteBuffer.getInt();
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                strArr[i2] = readString();
            }
            return strArr;
        }
        throw new ArchiveException("unable to read array (object): " + this);
    }

    public <T> T[] readArray(DecodingFactory<T> decodingFactory) throws ArchiveException {
        Object[] objArr = {decodingFactory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d77796276311eb4e4a3e57f2161fefe", RobustBitConfig.DEFAULT_VALUE)) {
            return (T[]) ((Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d77796276311eb4e4a3e57f2161fefe"));
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return decodingFactory.createArray(0);
        }
        if (b == 65) {
            int i = this.byteBuffer.getInt();
            T[] createArray = decodingFactory.createArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                createArray[i2] = readObject(decodingFactory);
            }
            return createArray;
        }
        throw new ArchiveException("unable to read array (object): " + this);
    }

    public <T> T readObject(DecodingFactory<T> decodingFactory) throws ArchiveException {
        Object[] objArr = {decodingFactory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd07baafec8dec74ee3cf6d052399ccb", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd07baafec8dec74ee3cf6d052399ccb");
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return decodingFactory.createInstance();
        }
        if (b == 79) {
            T createInstance = decodingFactory.createInstance();
            if (createInstance == null) {
                throw new ArchiveException("unable to create instance");
            }
            if (createInstance instanceof Decoding) {
                ((Decoding) createInstance).decode(this);
                return createInstance;
            }
            throw new ArchiveException("unable to decode class: " + createInstance.getClass().getSimpleName());
        }
        throw new ArchiveException("unable to read object: " + this);
    }

    public void skipAny() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abecc3754778f2e8532f11ebeef5d142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abecc3754778f2e8532f11ebeef5d142");
            return;
        }
        switch (this.byteBuffer.get()) {
            case 65:
                int i = this.byteBuffer.getInt();
                for (int i2 = 0; i2 < i; i2++) {
                    skipAny();
                }
                return;
            case 66:
                this.byteBuffer.get();
                return;
            case 68:
                this.byteBuffer.getDouble();
                return;
            case 78:
                return;
            case 79:
                break;
            case BorderTopLeftRadius.INDEX_ID /* 83 */:
                this.byteBuffer.position(this.byteBuffer.position() + this.byteBuffer.getInt());
                return;
            default:
                throw new ArchiveException("unable to skip object: " + this);
        }
        while (readMemberHash16() > 0) {
            skipAny();
        }
    }
}
