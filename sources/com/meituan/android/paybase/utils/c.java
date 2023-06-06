package com.meituan.android.paybase.utils;

import android.support.v4.view.MotionEventCompat;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
@MTPaySuppressFBWarnings
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean b = !c.class.desiredAssertionStatus();
    private static final byte[] c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.tencent.mapsdk.internal.p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] e = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, com.tencent.mapsdk.internal.p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] g = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] h = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, com.tencent.mapsdk.internal.p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    public static /* synthetic */ byte[] a(byte[] bArr, byte[] bArr2, int i, int i2) {
        Object[] objArr = {bArr, bArr2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3570886bd2682b1c7f3f44fd0007255", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3570886bd2682b1c7f3f44fd0007255");
        }
        b(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    private static final byte[] b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7aa21c550e080a8cedb8560b89d92c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7aa21c550e080a8cedb8560b89d92c9");
        }
        if ((i & 16) == 16) {
            return e;
        }
        if ((i & 32) == 32) {
            return g;
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c755fe050c08bdc115a2d87f43036f80", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c755fe050c08bdc115a2d87f43036f80");
        }
        if ((i & 16) == 16) {
            return f;
        }
        if ((i & 32) == 32) {
            return h;
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] b(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), bArr2, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa578f9f7594f6232be38b0c49b99904", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa578f9f7594f6232be38b0c49b99904");
        }
        byte[] b2 = b(i4);
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        switch (i2) {
            case 1:
                bArr2[i3] = b2[i5 >>> 18];
                bArr2[i3 + 1] = b2[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = 61;
                bArr2[i3 + 3] = 61;
                return bArr2;
            case 2:
                bArr2[i3] = b2[i5 >>> 18];
                bArr2[i3 + 1] = b2[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = b2[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = 61;
                return bArr2;
            case 3:
                bArr2[i3] = b2[i5 >>> 18];
                bArr2[i3 + 1] = b2[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = b2[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = b2[i5 & 63];
                return bArr2;
            default:
                return bArr2;
        }
    }

    public static String a(byte[] bArr) {
        String str;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e13aae37f8b4b58f08ece8773675f6cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e13aae37f8b4b58f08ece8773675f6cd");
        }
        try {
            str = a(bArr, 0, bArr.length, 0);
        } catch (IOException e2) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytes").a("message", e2.getMessage()).b);
            str = null;
        }
        if (b || str != null) {
            return str;
        }
        throw new AssertionError();
    }

    private static String a(byte[] bArr, int i, int i2, int i3) throws IOException {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3087233468ad7d913cc2258e81dc3be5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3087233468ad7d913cc2258e81dc3be5");
        }
        byte[] b2 = b(bArr, 0, i2, 0);
        try {
            return new String(b2, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytes").a("message", e2.getMessage()).b);
            return new String(b2);
        }
    }

    private static byte[] b(byte[] bArr, int i, int i2, int i3) throws IOException {
        Throwable th;
        b bVar;
        GZIPOutputStream gZIPOutputStream;
        Throwable th2;
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51ea9caf3d6c34640fe02dd67b5a88b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51ea9caf3d6c34640fe02dd67b5a88b5");
        }
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i2);
        } else if (i + i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        } else {
            if ((i3 & 2) == 0) {
                boolean z = (i3 & 8) != 0;
                int i4 = ((i2 / 3) * 4) + (i2 % 3 > 0 ? 4 : 0);
                if (z) {
                    i4 += i4 / 76;
                }
                byte[] bArr2 = new byte[i4];
                int i5 = i2 - 2;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i5) {
                    b(bArr, i6 + i, 3, bArr2, i7, i3);
                    int i9 = i8 + 4;
                    if (!z || i9 < 76) {
                        i8 = i9;
                    } else {
                        bArr2[i7 + 4] = 10;
                        i7++;
                        i8 = 0;
                    }
                    i6 += 3;
                    i7 += 4;
                }
                if (i6 < i2) {
                    b(bArr, i6 + i, i2 - i6, bArr2, i7, i3);
                    i7 += 4;
                }
                if (i7 <= bArr2.length - 1) {
                    byte[] bArr3 = new byte[i7];
                    System.arraycopy(bArr2, 0, bArr3, 0, i7);
                    return bArr3;
                }
                return bArr2;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    bVar = new b(byteArrayOutputStream2, i3 | 1);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bVar);
                        try {
                            gZIPOutputStream.write(bArr, i, i2);
                            gZIPOutputStream.close();
                            try {
                                gZIPOutputStream.close();
                            } catch (Exception e2) {
                                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytesToBytes").a("message", e2.getMessage()).b);
                            }
                            try {
                                bVar.close();
                            } catch (Exception e3) {
                                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytesToBytes").a("message", e3.getMessage()).b);
                            }
                            try {
                                byteArrayOutputStream2.close();
                            } catch (Exception e4) {
                                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytesToBytes").a("message", e4.getMessage()).b);
                            }
                            return byteArrayOutputStream2.toByteArray();
                        } catch (IOException e5) {
                            e = e5;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            try {
                                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytesToBytes").a("message", e.getMessage()).b);
                                throw e;
                            } catch (Throwable th3) {
                                th2 = th3;
                                th = th2;
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception e6) {
                                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytesToBytes").a("message", e6.getMessage()).b);
                                }
                                try {
                                    bVar.close();
                                } catch (Exception e7) {
                                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytesToBytes").a("message", e7.getMessage()).b);
                                }
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Exception e8) {
                                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeBytesToBytes").a("message", e8.getMessage()).b);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            th = th2;
                            gZIPOutputStream.close();
                            bVar.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        gZIPOutputStream = null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        gZIPOutputStream = null;
                    }
                } catch (IOException e10) {
                    e = e10;
                    bVar = null;
                    gZIPOutputStream = null;
                } catch (Throwable th6) {
                    th2 = th6;
                    bVar = null;
                    gZIPOutputStream = null;
                }
            } catch (IOException e11) {
                e = e11;
                bVar = null;
                gZIPOutputStream = null;
            } catch (Throwable th7) {
                th = th7;
                bVar = null;
                gZIPOutputStream = null;
                gZIPOutputStream.close();
                bVar.close();
                byteArrayOutputStream.close();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        int i5;
        Object[] objArr = {bArr, Integer.valueOf(i), bArr2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c1ccadcfcfa99d687b6f7e7316ee4ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c1ccadcfcfa99d687b6f7e7316ee4ca")).intValue();
        }
        if (bArr != null) {
            if (bArr2 == null) {
                throw new NullPointerException("Destination array was null.");
            }
            if (i < 0 || (i4 = i + 3) >= bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i)));
            }
            if (i2 < 0 || (i5 = i2 + 2) >= bArr2.length) {
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i2)));
            }
            byte[] c2 = c(i3);
            int i6 = i + 2;
            if (bArr[i6] == 61) {
                bArr2[i2] = (byte) ((((c2[bArr[i + 1]] & 255) << 12) | ((c2[bArr[i]] & 255) << 18)) >>> 16);
                return 1;
            } else if (bArr[i4] == 61) {
                int i7 = ((c2[bArr[i6]] & 255) << 6) | ((c2[bArr[i + 1]] & 255) << 12) | ((c2[bArr[i]] & 255) << 18);
                bArr2[i2] = (byte) (i7 >>> 16);
                bArr2[i2 + 1] = (byte) (i7 >>> 8);
                return 2;
            } else {
                int i8 = (c2[bArr[i4]] & 255) | ((c2[bArr[i + 1]] & 255) << 12) | ((c2[bArr[i]] & 255) << 18) | ((c2[bArr[i6]] & 255) << 6);
                bArr2[i2] = (byte) (i8 >> 16);
                bArr2[i2 + 1] = (byte) (i8 >> 8);
                bArr2[i5] = (byte) i8;
                return 3;
            }
        }
        throw new NullPointerException("Source array was null.");
    }

    public static byte[] b(byte[] bArr) throws IOException {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e258fc5dbedd2e9c7698ac220649bc28", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e258fc5dbedd2e9c7698ac220649bc28") : c(bArr, 0, bArr.length, 0);
    }

    private static byte[] c(byte[] bArr, int i, int i2, int i3) throws IOException {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d23b34da27f51e3a7f1ac8d730735ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d23b34da27f51e3a7f1ac8d730735ec");
        }
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        int i4 = i2 + 0;
        if (i4 <= bArr.length) {
            if (i2 == 0) {
                return new byte[0];
            }
            if (i2 < 4) {
                throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i2);
            }
            byte[] c2 = c(i3);
            byte[] bArr2 = new byte[(i2 * 3) / 4];
            byte[] bArr3 = new byte[4];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                byte b2 = c2[bArr[i7] & 255];
                if (b2 < -5) {
                    throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i7] & 255), Integer.valueOf(i7)));
                }
                if (b2 >= -1) {
                    int i8 = i5 + 1;
                    bArr3[i5] = bArr[i7];
                    if (i8 > 3) {
                        i6 += b(bArr3, 0, bArr2, i6, i3);
                        if (bArr[i7] == 61) {
                            break;
                        }
                        i5 = 0;
                    } else {
                        i5 = i8;
                    }
                }
            }
            byte[] bArr4 = new byte[i6];
            System.arraycopy(bArr2, 0, bArr4, 0, i6);
            return bArr4;
        }
        throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
    }

    public static byte[] a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74580c1799ccb7d1c993e42432342180", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74580c1799ccb7d1c993e42432342180") : a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static byte[] a(String str, int i) throws IOException {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fdcd6d215e468fdcfda708d00c37a6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fdcd6d215e468fdcfda708d00c37a6a");
        }
        if (str == null) {
            throw new NullPointerException("Input string was null.");
        }
        try {
            bytes = str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_decode").a("message", e2.getMessage()).b);
            bytes = str.getBytes();
        }
        byte[] c2 = c(bytes, 0, bytes.length, 0);
        if (c2 == null || c2.length < 4 || 35615 != ((c2[0] & 255) | ((c2[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
            return c2;
        }
        byte[] bArr = new byte[2048];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException e3) {
            e = e3;
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(c2);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                while (true) {
                    try {
                        try {
                            int read = gZIPInputStream.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (IOException e4) {
                            e = e4;
                            com.meituan.android.paybase.common.analyse.a.a(e, "Base64_decode", (Map<String, Object>) null);
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e5) {
                                com.meituan.android.paybase.common.analyse.a.a(e5, "Base64_decode", (Map<String, Object>) null);
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Exception e6) {
                                com.meituan.android.paybase.common.analyse.a.a(e6, "Base64_decode", (Map<String, Object>) null);
                            }
                            try {
                                byteArrayInputStream.close();
                                return c2;
                            } catch (Exception e7) {
                                com.meituan.android.paybase.common.analyse.a.a(e7, "Base64_decode", (Map<String, Object>) null);
                                return c2;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception e8) {
                            com.meituan.android.paybase.common.analyse.a.a(e8, "Base64_decode", (Map<String, Object>) null);
                        }
                        try {
                            gZIPInputStream.close();
                        } catch (Exception e9) {
                            com.meituan.android.paybase.common.analyse.a.a(e9, "Base64_decode", (Map<String, Object>) null);
                        }
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception e10) {
                            com.meituan.android.paybase.common.analyse.a.a(e10, "Base64_decode", (Map<String, Object>) null);
                        }
                        throw th;
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e11) {
                    com.meituan.android.paybase.common.analyse.a.a(e11, "Base64_decode", (Map<String, Object>) null);
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception e12) {
                    com.meituan.android.paybase.common.analyse.a.a(e12, "Base64_decode", (Map<String, Object>) null);
                }
                try {
                    byteArrayInputStream.close();
                } catch (Exception e13) {
                    com.meituan.android.paybase.common.analyse.a.a(e13, "Base64_decode", (Map<String, Object>) null);
                }
                return byteArray;
            } catch (IOException e14) {
                e = e14;
                gZIPInputStream = 0;
            } catch (Throwable th3) {
                th = th3;
                gZIPInputStream = 0;
                byteArrayOutputStream.close();
                gZIPInputStream.close();
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e15) {
            e = e15;
            byteArrayInputStream = null;
            gZIPInputStream = byteArrayInputStream;
            com.meituan.android.paybase.common.analyse.a.a(e, "Base64_decode", (Map<String, Object>) null);
            byteArrayOutputStream.close();
            gZIPInputStream.close();
            byteArrayInputStream.close();
            return c2;
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
            gZIPInputStream = byteArrayInputStream;
            byteArrayOutputStream.close();
            gZIPInputStream.close();
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static String b(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30b6b50f56aabed015fd6d8ae2fcd7cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30b6b50f56aabed015fd6d8ae2fcd7cd");
        }
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 1);
                int i = 0;
                while (true) {
                    try {
                        int read = aVar2.read(bArr, i, 4096);
                        if (read < 0) {
                            break;
                        }
                        i += read;
                    } catch (IOException e2) {
                        e = e2;
                        aVar = aVar2;
                        v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeFromFile").a("message", e.getMessage()).b);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        try {
                            aVar.close();
                        } catch (Exception e3) {
                            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeFromFile").a("message", e3.getMessage()).b);
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i, "US-ASCII");
                try {
                    aVar2.close();
                } catch (Exception e4) {
                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Base64_encodeFromFile").a("message", e4.getMessage()).b);
                }
                return str2;
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends FilterInputStream {
        public static ChangeQuickRedirect a;
        private boolean b;
        private int c;
        private byte[] d;
        private int e;
        private int f;
        private int g;
        private boolean h;
        private int i;
        private byte[] j;

        public a(InputStream inputStream, int i) {
            super(inputStream);
            Object[] objArr = {inputStream, 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88bb5fe3ecad9f7f8576444127dd04d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88bb5fe3ecad9f7f8576444127dd04d9");
                return;
            }
            this.i = 1;
            this.h = false;
            this.b = true;
            this.e = this.b ? 4 : 3;
            this.d = new byte[this.e];
            this.c = -1;
            this.g = 0;
            this.j = c.c(1);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int read;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d3b4a6fb9802228323ae3d548c9858", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d3b4a6fb9802228323ae3d548c9858")).intValue();
            }
            if (this.c < 0) {
                if (this.b) {
                    byte[] bArr = new byte[3];
                    int i = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int read2 = this.in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) read2;
                        i++;
                    }
                    if (i <= 0) {
                        return -1;
                    }
                    c.b(bArr, 0, i, this.d, 0, this.i);
                    this.c = 0;
                    this.f = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i3 = 0;
                    while (i3 < 4) {
                        do {
                            read = this.in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.j[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i3] = (byte) read;
                        i3++;
                    }
                    if (i3 != 4) {
                        if (i3 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.f = c.b(bArr2, 0, this.d, 0, this.i);
                    this.c = 0;
                }
            }
            if (this.c >= 0) {
                if (this.c >= this.f) {
                    return -1;
                }
                if (this.b && this.h && this.g >= 76) {
                    this.g = 0;
                    return 10;
                }
                this.g++;
                byte[] bArr3 = this.d;
                int i4 = this.c;
                this.c = i4 + 1;
                byte b = bArr3[i4];
                if (this.c >= this.e) {
                    this.c = -1;
                }
                return b & 255;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53aa137a69e09fcbc6ef3af093ff9766", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53aa137a69e09fcbc6ef3af093ff9766")).intValue();
            }
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i + i3] = (byte) read;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends FilterOutputStream {
        public static ChangeQuickRedirect a;
        private boolean b;
        private int c;
        private byte[] d;
        private int e;
        private int f;
        private boolean g;
        private byte[] h;
        private boolean i;
        private int j;
        private byte[] k;

        public b(OutputStream outputStream, int i) {
            super(outputStream);
            Object[] objArr = {outputStream, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5064a752c2e338e510a41c755c8668", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5064a752c2e338e510a41c755c8668");
                return;
            }
            this.g = (i & 8) != 0;
            this.b = (i & 1) != 0;
            this.e = this.b ? 3 : 4;
            this.d = new byte[this.e];
            this.c = 0;
            this.f = 0;
            this.i = false;
            this.h = new byte[4];
            this.j = i;
            this.k = c.c(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d36c70948fc9c5c8a82903ed1997547", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d36c70948fc9c5c8a82903ed1997547");
            } else if (this.i) {
                this.out.write(i);
            } else if (this.b) {
                byte[] bArr = this.d;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) i;
                if (this.c >= this.e) {
                    this.out.write(c.a(this.h, this.d, this.e, this.j));
                    this.f += 4;
                    if (this.g && this.f >= 76) {
                        this.out.write(10);
                        this.f = 0;
                    }
                    this.c = 0;
                }
            } else {
                int i3 = i & 127;
                if (this.k[i3] > -5) {
                    byte[] bArr2 = this.d;
                    int i4 = this.c;
                    this.c = i4 + 1;
                    bArr2[i4] = (byte) i;
                    if (this.c >= this.e) {
                        this.out.write(this.h, 0, c.b(this.d, 0, this.h, 0, this.j));
                        this.c = 0;
                    }
                } else if (this.k[i3] != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbb2542f02f0dca9d967ceb5607d211", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbb2542f02f0dca9d967ceb5607d211");
            } else if (this.i) {
                this.out.write(bArr, i, i2);
            } else {
                for (int i3 = 0; i3 < i2; i3++) {
                    write(bArr[i + i3]);
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4882b1792d55a2c48efa1ca14009f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4882b1792d55a2c48efa1ca14009f9");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8e8571ed04f6a310cd2d7ed71d4cf05", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8e8571ed04f6a310cd2d7ed71d4cf05");
            } else if (this.c > 0) {
                if (this.b) {
                    this.out.write(c.a(this.h, this.d, this.c, this.j));
                    this.c = 0;
                } else {
                    throw new IOException("Base64 input not properly padded.");
                }
            }
            super.close();
            this.d = null;
            this.out = null;
        }
    }
}
