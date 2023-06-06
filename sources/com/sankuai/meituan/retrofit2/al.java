package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class al {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public static ak a(byte[] bArr, String str) {
        Object[] objArr = {bArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "013b7f78da7f6c9a91013de6820caa92", 6917529027641081856L) ? (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "013b7f78da7f6c9a91013de6820caa92") : a(ad.a(str), bArr);
    }

    public static ak a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01935060160f1def08325109768394ab", 6917529027641081856L) ? (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01935060160f1def08325109768394ab") : a(file, str, null);
    }

    private static ak a(final File file, String str, a aVar) {
        Object[] objArr = {file, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "398d9685080beb88c47ae0bb3604b94e", 6917529027641081856L)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "398d9685080beb88c47ae0bb3604b94e");
        }
        if (file == null) {
            throw new NullPointerException("file == null");
        }
        final ad a2 = ad.a(str);
        return new ak() { // from class: com.sankuai.meituan.retrofit2.al.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.ak
            public final String contentType() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e37035515b6e506816d8e6a2856030a", 6917529027641081856L)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e37035515b6e506816d8e6a2856030a");
                }
                if (ad.this == null) {
                    return null;
                }
                return ad.this.toString();
            }

            @Override // com.sankuai.meituan.retrofit2.ak
            public final long contentLength() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b07fffa073077457671369d79902fa7", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b07fffa073077457671369d79902fa7")).longValue() : file.length();
            }

            @Override // com.sankuai.meituan.retrofit2.ak
            public final void writeTo(OutputStream outputStream) throws IOException {
                Object[] objArr2 = {outputStream};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b82d5b24ab6e4976319fdcc45a182b03", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b82d5b24ab6e4976319fdcc45a182b03");
                    return;
                }
                contentLength();
                FileInputStream fileInputStream = null;
                byte[] bArr = new byte[2048];
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    while (true) {
                        try {
                            int read = fileInputStream2.read(bArr);
                            if (read != -1) {
                                outputStream.write(bArr, 0, read);
                                a aVar2 = r3;
                            } else {
                                try {
                                    fileInputStream2.close();
                                    return;
                                } catch (Throwable unused) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        };
    }

    public static ak a(ad adVar, byte[] bArr) {
        Object[] objArr = {adVar, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fbc19cbc686cb3d6e149421fcf1dc86", 6917529027641081856L)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fbc19cbc686cb3d6e149421fcf1dc86");
        }
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        return a(adVar, bArr, 0, bArr.length);
    }

    private static ak a(final ad adVar, final byte[] bArr, int i, final int i2) {
        Object[] objArr = {adVar, bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19c2d73712eec5f7ab35b60e758408a1", 6917529027641081856L)) {
            return (ak) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19c2d73712eec5f7ab35b60e758408a1");
        }
        av.a(bArr.length, 0L, i2);
        return new ak() { // from class: com.sankuai.meituan.retrofit2.al.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.ak
            public final String contentType() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef9b32e989ff57dd3f8f11a54b5d11ad", 6917529027641081856L)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef9b32e989ff57dd3f8f11a54b5d11ad");
                }
                if (ad.this == null) {
                    return null;
                }
                return ad.this.toString();
            }

            @Override // com.sankuai.meituan.retrofit2.ak
            public final long contentLength() {
                return i2;
            }

            @Override // com.sankuai.meituan.retrofit2.ak
            public final void writeTo(OutputStream outputStream) throws IOException {
                Object[] objArr2 = {outputStream};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35e4123fc491decac6f82941ff4d8408", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35e4123fc491decac6f82941ff4d8408");
                } else {
                    outputStream.write(bArr, r4, i2);
                }
            }
        };
    }
}
