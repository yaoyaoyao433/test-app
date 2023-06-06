package com.sankuai.common.utils;

import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.p;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class Base64 {
    public static final int DECODE = 0;
    public static final int DONT_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    public static final int GZIP = 2;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    private static final String PREFERRED_ENCODING = "UTF-8";
    private static final String TAG = "Base64";
    public static final int URL_SAFE = 16;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final byte[] _STANDARD_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    private static final byte[] _STANDARD_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, EQUALS_SIGN_ENC, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9};
    private static final byte[] _URL_SAFE_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] _URL_SAFE_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, EQUALS_SIGN_ENC, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9};
    private static final byte[] _ORDERED_ALPHABET = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] _ORDERED_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, EQUALS_SIGN_ENC, -9, -9, -9, 11, p.ZERO_TAG, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, 62, 63, -9, -9, -9, -9};

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getAlphabet(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cd37520e488ae62783ee3f1d0fbed8e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cd37520e488ae62783ee3f1d0fbed8e6");
        }
        if ((i & 16) == 16) {
            return _URL_SAFE_ALPHABET;
        }
        if ((i & 32) == 32) {
            return _ORDERED_ALPHABET;
        }
        return _STANDARD_ALPHABET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDecodabet(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ffd08329549dc6d608b6d46f0a2c2eeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ffd08329549dc6d608b6d46f0a2c2eeb");
        }
        if ((i & 16) == 16) {
            return _URL_SAFE_DECODABET;
        }
        if ((i & 32) == 32) {
            return _ORDERED_DECODABET;
        }
        return _STANDARD_DECODABET;
    }

    public static final void main(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c408a8f6661b9c33f65a51b873d607c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c408a8f6661b9c33f65a51b873d607c");
        } else if (strArr.length < 3) {
            usage("Not enough arguments.");
        } else {
            String str = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            if (TextUtils.equals(str, "-e")) {
                encodeFileToFile(str2, str3);
            } else if (TextUtils.equals(str, "-d")) {
                decodeFileToFile(str2, str3);
            } else {
                usage("Unknown flag: " + str);
            }
        }
    }

    private static final void usage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "201386c76b4e997534fc59c728bdb6ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "201386c76b4e997534fc59c728bdb6ac");
            return;
        }
        Log.e(TAG, str);
        Log.e(TAG, "Usage: java Base64 -e|-d inputfile outputfile");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, byte[] bArr2, int i, int i2) {
        Object[] objArr = {bArr, bArr2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f74d9f2d1fcc98f68763d1d388b397f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f74d9f2d1fcc98f68763d1d388b397f");
        }
        encode3to4(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), bArr2, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4786075efcab26ee8d037ce9fc778860", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4786075efcab26ee8d037ce9fc778860");
        }
        byte[] alphabet = getAlphabet(i4);
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        switch (i2) {
            case 1:
                bArr2[i3] = alphabet[i5 >>> 18];
                bArr2[i3 + 1] = alphabet[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = EQUALS_SIGN;
                bArr2[i3 + 3] = EQUALS_SIGN;
                return bArr2;
            case 2:
                bArr2[i3] = alphabet[i5 >>> 18];
                bArr2[i3 + 1] = alphabet[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = alphabet[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = EQUALS_SIGN;
                return bArr2;
            case 3:
                bArr2[i3] = alphabet[i5 >>> 18];
                bArr2[i3 + 1] = alphabet[(i5 >>> 12) & 63];
                bArr2[i3 + 2] = alphabet[(i5 >>> 6) & 63];
                bArr2[i3 + 3] = alphabet[i5 & 63];
                return bArr2;
            default:
                return bArr2;
        }
    }

    public static String encodeObject(Serializable serializable) {
        Object[] objArr = {serializable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74b7eacc5a18744436148f05adaef317", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74b7eacc5a18744436148f05adaef317") : encodeObject(serializable, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.meituan.robust.ChangeQuickRedirect] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.OutputStream, com.sankuai.common.utils.Base64$OutputStream] */
    public static String encodeObject(Serializable serializable, int i) {
        GZIPOutputStream gZIPOutputStream;
        ObjectOutputStream objectOutputStream;
        GZIPOutputStream gZIPOutputStream2;
        Object[] objArr = {serializable, Integer.valueOf((int) i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ObjectOutputStream objectOutputStream2 = null;
        ?? r4 = 1;
        ?? r3 = changeQuickRedirect2;
        if (PatchProxy.isSupport(objArr, null, r3, true, "c9f81c7a6e005faa0f37a414be9480e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9f81c7a6e005faa0f37a414be9480e8");
        }
        int i2 = i & 2;
        try {
            try {
                r3 = new ByteArrayOutputStream();
                try {
                    r4 = new OutputStream(r3, i | 1);
                    try {
                        if (i2 == 2) {
                            gZIPOutputStream = new GZIPOutputStream(r4);
                            try {
                                gZIPOutputStream2 = gZIPOutputStream;
                                objectOutputStream = new ObjectOutputStream(gZIPOutputStream);
                            } catch (IOException e) {
                                e = e;
                                gZIPOutputStream2 = gZIPOutputStream;
                                objectOutputStream = null;
                                e.printStackTrace();
                                try {
                                    objectOutputStream.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    gZIPOutputStream2.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    r4.close();
                                } catch (Exception unused3) {
                                }
                                try {
                                    r3.close();
                                } catch (Exception unused4) {
                                }
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    objectOutputStream2.close();
                                } catch (Exception unused5) {
                                }
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused6) {
                                }
                                try {
                                    r4.close();
                                } catch (Exception unused7) {
                                }
                                try {
                                    r3.close();
                                } catch (Exception unused8) {
                                }
                                throw th;
                            }
                        } else {
                            objectOutputStream = new ObjectOutputStream(r4);
                            gZIPOutputStream2 = null;
                        }
                        try {
                            objectOutputStream.writeObject(serializable);
                            try {
                                objectOutputStream.close();
                            } catch (Exception unused9) {
                            }
                            try {
                                gZIPOutputStream2.close();
                            } catch (Exception unused10) {
                            }
                            try {
                                r4.close();
                            } catch (Exception unused11) {
                            }
                            try {
                                r3.close();
                            } catch (Exception unused12) {
                            }
                            try {
                                return new String(r3.toByteArray(), "UTF-8");
                            } catch (UnsupportedEncodingException unused13) {
                                return new String(r3.toByteArray());
                            }
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                            objectOutputStream.close();
                            gZIPOutputStream2.close();
                            r4.close();
                            r3.close();
                            return null;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        objectOutputStream = null;
                        gZIPOutputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream = null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    objectOutputStream = null;
                    gZIPOutputStream2 = null;
                    r4 = 0;
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                    r4 = 0;
                }
            } catch (Throwable th4) {
                th = th4;
                objectOutputStream2 = i;
                gZIPOutputStream = 2;
            }
        } catch (IOException e5) {
            e = e5;
            objectOutputStream = null;
            gZIPOutputStream2 = null;
            r3 = 0;
            r4 = 0;
        } catch (Throwable th5) {
            th = th5;
            gZIPOutputStream = null;
            r3 = 0;
            r4 = 0;
        }
    }

    public static String encodeBytes(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9de4ff8b8b903fb34f398b4409c99f72", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9de4ff8b8b903fb34f398b4409c99f72") : encodeBytes(bArr, 0, bArr.length, 0);
    }

    public static String encodeBytes(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e4fdf9cc445ec61455f0a40e8956eba", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e4fdf9cc445ec61455f0a40e8956eba") : encodeBytes(bArr, 0, bArr.length, i);
    }

    public static String encodeBytes(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a99fb793fd0d946065246f477a363d6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a99fb793fd0d946065246f477a363d6") : encodeBytes(bArr, i, i2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.sankuai.common.utils.Base64$OutputStream] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.OutputStream, com.sankuai.common.utils.Base64$OutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.sankuai.common.utils.Base64$OutputStream] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static String encodeBytes(byte[] bArr, int i, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r2;
        GZIPOutputStream gZIPOutputStream;
        int i4;
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9a3a99e8108861c21b2e8a7acf3cb33", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9a3a99e8108861c21b2e8a7acf3cb33");
        }
        int i5 = i3 & 8;
        if ((i3 & 2) == 2) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                e = e;
                byteArrayOutputStream = null;
                r2 = 0;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
                r2 = 0;
            }
            try {
                r2 = new OutputStream(byteArrayOutputStream, i3 | 1);
            } catch (IOException e2) {
                e = e2;
                r2 = 0;
                gZIPOutputStream = r2;
                e.printStackTrace();
                try {
                    gZIPOutputStream.close();
                } catch (Exception unused) {
                }
                try {
                    r2.close();
                } catch (Exception unused2) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused3) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                r2 = 0;
            }
            try {
                gZIPOutputStream = new GZIPOutputStream(r2);
                try {
                    try {
                        gZIPOutputStream.write(bArr, i, i2);
                        gZIPOutputStream.close();
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused4) {
                        }
                        try {
                            r2.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        } catch (UnsupportedEncodingException unused7) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        gZIPOutputStream.close();
                        r2.close();
                        byteArrayOutputStream.close();
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream2 = gZIPOutputStream;
                    try {
                        gZIPOutputStream2.close();
                    } catch (Exception unused8) {
                    }
                    try {
                        r2.close();
                    } catch (Exception unused9) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused10) {
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream2.close();
                r2.close();
                byteArrayOutputStream.close();
                throw th;
            }
        } else {
            boolean z = i5 == 0;
            int i6 = (i2 * 4) / 3;
            byte[] bArr2 = new byte[(i2 % 3 > 0 ? 4 : 0) + i6 + (z ? i6 / 76 : 0)];
            int i7 = i2 - 2;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i7) {
                encode3to4(bArr, i8 + i, 3, bArr2, i9, i3);
                int i11 = i10 + 4;
                if (z && i11 == 76) {
                    bArr2[i9 + 4] = 10;
                    i9++;
                    i10 = 0;
                } else {
                    i10 = i11;
                }
                i8 += 3;
                i9 += 4;
            }
            if (i8 < i2) {
                encode3to4(bArr, i8 + i, i2 - i8, bArr2, i9, i3);
                i9 += 4;
            }
            int i12 = i9;
            try {
                i4 = 0;
                try {
                    return new String(bArr2, 0, i12, "UTF-8");
                } catch (UnsupportedEncodingException unused11) {
                    return new String(bArr2, i4, i12);
                }
            } catch (UnsupportedEncodingException unused12) {
                i4 = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int decode4to3(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        Object[] objArr = {bArr, Integer.valueOf(i), bArr2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d99037fbee868c0dd419f3b8db2a990", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d99037fbee868c0dd419f3b8db2a990")).intValue();
        }
        byte[] decodabet = getDecodabet(i3);
        int i4 = i + 2;
        if (bArr[i4] == 61) {
            bArr2[i2] = (byte) ((((decodabet[bArr[i + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i]] & EQUALS_SIGN_ENC) << 18)) >>> 16);
            return 1;
        }
        int i5 = i + 3;
        if (bArr[i5] == 61) {
            int i6 = ((decodabet[bArr[i4]] & EQUALS_SIGN_ENC) << 6) | ((decodabet[bArr[i + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i]] & EQUALS_SIGN_ENC) << 18);
            bArr2[i2] = (byte) (i6 >>> 16);
            bArr2[i2 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        try {
            int i7 = (decodabet[bArr[i5]] & EQUALS_SIGN_ENC) | ((decodabet[bArr[i + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i]] & EQUALS_SIGN_ENC) << 18) | ((decodabet[bArr[i4]] & EQUALS_SIGN_ENC) << 6);
            bArr2[i2] = (byte) (i7 >> 16);
            bArr2[i2 + 1] = (byte) (i7 >> 8);
            bArr2[i2 + 2] = (byte) i7;
            return 3;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ef2f43e828eb80211f48b6fbf008482", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ef2f43e828eb80211f48b6fbf008482");
        }
        byte[] decodabet = getDecodabet(i3);
        byte[] bArr2 = new byte[(i2 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < i + i2; i6++) {
            byte b = (byte) (bArr[i6] & Byte.MAX_VALUE);
            byte b2 = decodabet[b];
            if (b2 < -5) {
                return null;
            }
            if (b2 >= -1) {
                int i7 = i4 + 1;
                bArr3[i4] = b;
                if (i7 > 3) {
                    i5 += decode4to3(bArr3, 0, bArr2, i5, i3);
                    if (b == 61) {
                        break;
                    }
                    i4 = 0;
                } else {
                    i4 = i7;
                }
            }
        }
        byte[] bArr4 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr4, 0, i5);
        return bArr4;
    }

    public static byte[] decode(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03ab205529c7e1ed2cfeaf8227f5ed20", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03ab205529c7e1ed2cfeaf8227f5ed20") : decode(str, 0);
    }

    public static byte[] decode(String str, int i) {
        byte[] bytes;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        GZIPInputStream gZIPInputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a079ed2bdf4366cbe965644700aedd4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a079ed2bdf4366cbe965644700aedd4f");
        }
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        byte[] decode = decode(bytes, 0, bytes.length, i);
        if (decode == null || decode.length < 4 || 35615 != ((decode[0] & EQUALS_SIGN_ENC) | ((decode[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
            return decode;
        }
        byte[] bArr = new byte[2048];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayInputStream = new ByteArrayInputStream(decode);
                try {
                    GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream);
                    while (true) {
                        try {
                            int read = gZIPInputStream2.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (IOException unused2) {
                            gZIPInputStream = gZIPInputStream2;
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused3) {
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Exception unused4) {
                            }
                            try {
                                byteArrayInputStream.close();
                                return decode;
                            } catch (Exception unused5) {
                                return decode;
                            }
                        } catch (Throwable th) {
                            th = th;
                            gZIPInputStream = gZIPInputStream2;
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused6) {
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Exception unused7) {
                            }
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused8) {
                            }
                            throw th;
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused9) {
                    }
                    try {
                        gZIPInputStream2.close();
                    } catch (Exception unused10) {
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused11) {
                    }
                    return byteArray;
                } catch (IOException unused12) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused13) {
                byteArrayInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = null;
            }
        } catch (IOException unused14) {
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    public static Object decodeToObject(String str) {
        ObjectInputStream objectInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = 1;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        ObjectInputStream objectInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f52a517f45550e277c6081bbd5325df0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f52a517f45550e277c6081bbd5325df0");
        }
        byte[] decode = decode(str);
        try {
            try {
                byteArrayInputStream2 = new ByteArrayInputStream(decode);
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = decode;
            }
        } catch (IOException e) {
            e = e;
            objectInputStream = null;
            byteArrayInputStream2 = null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            objectInputStream = null;
            byteArrayInputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream2 = 0;
        }
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream2);
            try {
                Object readObject = objectInputStream.readObject();
                try {
                    byteArrayInputStream2.close();
                } catch (Exception unused) {
                }
                try {
                    objectInputStream.close();
                } catch (Exception unused2) {
                }
                return readObject;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                byteArrayInputStream = byteArrayInputStream2;
                try {
                    byteArrayInputStream.close();
                } catch (Exception unused3) {
                }
                try {
                    objectInputStream.close();
                    return null;
                } catch (Exception unused4) {
                    return null;
                }
            } catch (ClassNotFoundException e4) {
                e = e4;
                e.printStackTrace();
                byteArrayInputStream = byteArrayInputStream2;
                byteArrayInputStream.close();
                objectInputStream.close();
                return null;
            }
        } catch (IOException e5) {
            e = e5;
            objectInputStream = null;
        } catch (ClassNotFoundException e6) {
            e = e6;
            objectInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            try {
                byteArrayInputStream2.close();
            } catch (Exception unused5) {
            }
            try {
                objectInputStream2.close();
            } catch (Exception unused6) {
            }
            throw th;
        }
    }

    public static boolean encodeToFile(byte[] bArr, String str) {
        OutputStream outputStream;
        Object[] objArr = {bArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        OutputStream outputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1cee7cc1aa11e4fdfde0741bda4e9cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1cee7cc1aa11e4fdfde0741bda4e9cf")).booleanValue();
        }
        try {
            outputStream = new OutputStream(new FileOutputStream(str), 1);
            try {
                outputStream.write(bArr);
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
                return true;
            } catch (IOException unused2) {
                try {
                    outputStream.close();
                    return false;
                } catch (Exception unused3) {
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                outputStream2 = outputStream;
                try {
                    outputStream2.close();
                } catch (Exception unused4) {
                }
                throw th;
            }
        } catch (IOException unused5) {
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean decodeToFile(String str, String str2) {
        OutputStream outputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        OutputStream outputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "427b0468984941091d3f647432c7b34c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "427b0468984941091d3f647432c7b34c")).booleanValue();
        }
        try {
            outputStream = new OutputStream(new FileOutputStream(str2), 0);
        } catch (IOException unused) {
            outputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            outputStream.write(str.getBytes("UTF-8"));
            try {
                outputStream.close();
            } catch (Exception unused2) {
            }
            return true;
        } catch (IOException unused3) {
            try {
                outputStream.close();
                return false;
            } catch (Exception unused4) {
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            try {
                outputStream2.close();
            } catch (Exception unused5) {
            }
            throw th;
        }
    }

    public static byte[] decodeFromFile(String str) {
        InputStream inputStream;
        byte[] bArr;
        File file;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b62dfabf239de497deaecc3da0c0f251", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b62dfabf239de497deaecc3da0c0f251");
        }
        try {
            file = new File(str);
        } catch (IOException unused) {
            inputStream = null;
            bArr = null;
        } catch (Throwable th) {
            th = th;
        }
        if (file.length() <= 2147483647L) {
            byte[] bArr2 = new byte[(int) file.length()];
            inputStream = new InputStream(new BufferedInputStream(new FileInputStream(file)), 0);
            int i = 0;
            while (true) {
                try {
                    try {
                        int read = inputStream.read(bArr2, i, 4096);
                        if (read < 0) {
                            break;
                        }
                        i += read;
                    } catch (IOException unused2) {
                        bArr = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    try {
                        inputStream2.close();
                    } catch (Exception unused3) {
                    }
                    throw th;
                }
            }
            bArr = new byte[i];
            try {
                System.arraycopy(bArr2, 0, bArr, 0, i);
            } catch (IOException unused4) {
            }
            try {
                inputStream.close();
            } catch (Exception unused5) {
                return bArr;
            }
        } else {
            try {
                inputStream2.close();
            } catch (Exception unused6) {
            }
            return null;
        }
    }

    public static String encodeFromFile(String str) {
        InputStream inputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b5b7627477bd2ee8965181cd0c1f0994", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b5b7627477bd2ee8965181cd0c1f0994");
        }
        try {
            File file = new File(str);
            byte[] bArr = new byte[Math.max((int) (file.length() * 1.4d), 40)];
            inputStream = new InputStream(new BufferedInputStream(new FileInputStream(file)), 1);
            int i = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr, i, 4096);
                    if (read < 0) {
                        String str2 = new String(bArr, 0, i, "UTF-8");
                        try {
                            inputStream.close();
                            return str2;
                        } catch (Exception unused) {
                            return str2;
                        }
                    }
                    i += read;
                } catch (IOException unused2) {
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    try {
                        inputStream2.close();
                    } catch (Exception unused4) {
                    }
                    throw th;
                }
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean encodeFileToFile(String str, String str2) {
        InputStream inputStream;
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedOutputStream bufferedOutputStream2 = null;
        bufferedOutputStream2 = null;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "73b3680cb1c9c29647b206b362080fdf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "73b3680cb1c9c29647b206b362080fdf")).booleanValue();
        }
        try {
            inputStream = new InputStream(new BufferedInputStream(new FileInputStream(str)), 1);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (IOException e) {
                e = e;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                }
                inputStream.close();
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused4) {
                }
                return true;
            } catch (IOException e2) {
                e = e2;
                inputStream2 = inputStream;
                try {
                    e.printStackTrace();
                    try {
                        inputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        bufferedOutputStream.close();
                        return false;
                    } catch (Exception unused6) {
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    inputStream.close();
                    bufferedOutputStream2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream2 = bufferedOutputStream;
                inputStream.close();
                bufferedOutputStream2.close();
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    public static boolean decodeFileToFile(String str, String str2) {
        InputStream inputStream;
        BufferedOutputStream bufferedOutputStream;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedOutputStream bufferedOutputStream2 = null;
        bufferedOutputStream2 = null;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af01b56f914dd29bd3d334b02179a8b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af01b56f914dd29bd3d334b02179a8b0")).booleanValue();
        }
        try {
            inputStream = new InputStream(new BufferedInputStream(new FileInputStream(str)), 0);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (IOException e) {
                e = e;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read >= 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (Exception unused3) {
                        }
                    }
                }
                inputStream.close();
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused4) {
                }
                return true;
            } catch (IOException e2) {
                e = e2;
                inputStream2 = inputStream;
                try {
                    e.printStackTrace();
                    try {
                        inputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        bufferedOutputStream.close();
                        return false;
                    } catch (Exception unused6) {
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    inputStream.close();
                    bufferedOutputStream2.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream2 = bufferedOutputStream;
                inputStream.close();
                bufferedOutputStream2.close();
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class InputStream extends FilterInputStream {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected byte[] alphabet;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public InputStream(java.io.InputStream inputStream) {
            this(inputStream, 0);
            Object[] objArr = {inputStream};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8648d163051ca3e9ac413aec6683670e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8648d163051ca3e9ac413aec6683670e");
            }
        }

        public InputStream(java.io.InputStream inputStream, int i) {
            super(inputStream);
            Object[] objArr = {inputStream, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "840419087e93d70268a08de9df3d14aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "840419087e93d70268a08de9df3d14aa");
                return;
            }
            this.breakLines = (i & 8) != 8;
            this.encode = (i & 1) == 1;
            this.bufferLength = this.encode ? 4 : 3;
            this.buffer = new byte[this.bufferLength];
            this.position = -1;
            this.lineLength = 0;
            this.options = i;
            this.alphabet = Base64.getAlphabet(i);
            this.decodabet = Base64.getDecodabet(i);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1a1401efd55444ec2e361ebf464e5cb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1a1401efd55444ec2e361ebf464e5cb")).intValue();
            }
            if (this.position < 0) {
                if (this.encode) {
                    byte[] bArr = new byte[3];
                    int i = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        try {
                            int read2 = this.in.read();
                            if (read2 >= 0) {
                                bArr[i2] = (byte) read2;
                                i++;
                            }
                        } catch (IOException e) {
                            if (i2 == 0) {
                                throw e;
                            }
                        }
                    }
                    if (i <= 0) {
                        return -1;
                    }
                    Base64.encode3to4(bArr, 0, i, this.buffer, 0, this.options);
                    this.position = 0;
                    this.numSigBytes = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i3 = 0;
                    while (i3 < 4) {
                        do {
                            read = this.in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.decodabet[read & 127] <= -5);
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
                    this.numSigBytes = Base64.decode4to3(bArr2, 0, this.buffer, 0, this.options);
                    this.position = 0;
                }
            }
            if (this.position >= 0) {
                if (this.position >= this.numSigBytes) {
                    return -1;
                }
                if (this.encode && this.breakLines && this.lineLength >= 76) {
                    this.lineLength = 0;
                    return 10;
                }
                this.lineLength++;
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                byte b = bArr3[i4];
                if (this.position >= this.bufferLength) {
                    this.position = -1;
                }
                return b & Base64.EQUALS_SIGN_ENC;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23cddb9136c3b3b6efb5084bb1eb353a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23cddb9136c3b3b6efb5084bb1eb353a")).intValue();
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
    /* loaded from: classes3.dex */
    public static class OutputStream extends FilterOutputStream {
        public static ChangeQuickRedirect changeQuickRedirect;
        protected byte[] alphabet;
        private byte[] b4;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
            Object[] objArr = {outputStream};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a907f440365af91282fd7027c6fb71c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a907f440365af91282fd7027c6fb71c0");
            }
        }

        public OutputStream(java.io.OutputStream outputStream, int i) {
            super(outputStream);
            Object[] objArr = {outputStream, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb56fc9b5991b66348dd4e7c8d085917", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb56fc9b5991b66348dd4e7c8d085917");
                return;
            }
            this.breakLines = (i & 8) != 8;
            this.encode = (i & 1) == 1;
            this.bufferLength = this.encode ? 3 : 4;
            this.buffer = new byte[this.bufferLength];
            this.position = 0;
            this.lineLength = 0;
            this.suspendEncoding = false;
            this.b4 = new byte[4];
            this.options = i;
            this.alphabet = Base64.getAlphabet(i);
            this.decodabet = Base64.getDecodabet(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "143f85424a581c97e30cad26df6745e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "143f85424a581c97e30cad26df6745e4");
            } else if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(i);
            } else if (this.encode) {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                if (this.position >= this.bufferLength) {
                    this.out.write(Base64.encode3to4(this.b4, this.buffer, this.bufferLength, this.options));
                    this.lineLength += 4;
                    if (this.breakLines && this.lineLength >= 76) {
                        this.out.write(10);
                        this.lineLength = 0;
                    }
                    this.position = 0;
                }
            } else {
                int i3 = i & 127;
                if (this.decodabet[i3] > -5) {
                    byte[] bArr2 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    bArr2[i4] = (byte) i;
                    if (this.position >= this.bufferLength) {
                        this.out.write(this.b4, 0, Base64.decode4to3(this.buffer, 0, this.b4, 0, this.options));
                        this.position = 0;
                    }
                } else if (this.decodabet[i3] != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5b27b1fb8d03bda189a5a65c59afd00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5b27b1fb8d03bda189a5a65c59afd00");
            } else if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
            } else {
                for (int i3 = 0; i3 < i2; i3++) {
                    write(bArr[i + i3]);
                }
            }
        }

        public void flushBase64() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e806040ddedb17c76cedc317f61f01", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e806040ddedb17c76cedc317f61f01");
            } else if (this.position > 0) {
                if (this.encode) {
                    this.out.write(Base64.encode3to4(this.b4, this.buffer, this.position, this.options));
                    this.position = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7032715008d2e8a509f2698f3c0084e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7032715008d2e8a509f2698f3c0084e");
                return;
            }
            flushBase64();
            super.close();
            this.buffer = null;
            this.out = null;
        }

        public void suspendEncoding() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9b469ea7e4f45c10bf706fcc2226853", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9b469ea7e4f45c10bf706fcc2226853");
                return;
            }
            flushBase64();
            this.suspendEncoding = true;
        }

        public void resumeEncoding() {
            this.suspendEncoding = false;
        }
    }
}
