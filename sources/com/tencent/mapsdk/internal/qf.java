package com.tencent.mapsdk.internal;

import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.core.utils.cache.DiskCache;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qf implements DiskCache.a {
    private final int a = 128;
    private String b;

    public qf(String str) {
        this.b = str;
    }

    @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
    public final File a(String str, String str2, byte[] bArr) {
        if (TextUtils.isEmpty(this.b)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf >= 0) {
            String substring = str.substring(0, lastIndexOf);
            if (!TextUtils.isEmpty(substring)) {
                str2 = str2 + File.separator + substring;
            }
            str = str.substring(lastIndexOf + 1);
        }
        int[] a = a(str);
        if (a == null) {
            return new File(str2, str);
        }
        String str3 = str2 + a(a[0], a[1], a[2]);
        if (!a(str3, a[0], a[1], bArr)) {
            return new File(str2, str);
        }
        return new File(str3 + ".dat");
    }

    @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
    public final byte[] a(String str, File file) {
        String str2 = this.b;
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf >= 0) {
            String substring = str.substring(0, lastIndexOf);
            if (!TextUtils.isEmpty(substring)) {
                str2 = str2 + File.separator + substring;
            }
            str = str.substring(lastIndexOf + 1);
        }
        int[] a = a(str);
        if (a == null) {
            return null;
        }
        return a(str2 + a(a[0], a[1], a[2]), a[0], a[1]);
    }

    @Override // com.tencent.mapsdk.core.utils.cache.DiskCache.a
    public final boolean a(File file) {
        return kc.b(new File(this.b));
    }

    private static int[] a(String str) {
        String[] split = str.split(CommonConstant.Symbol.MINUS);
        if (split.length < 3) {
            return null;
        }
        int[] iArr = new int[3];
        for (int i = 0; i < 3; i++) {
            try {
                iArr[i] = Integer.parseInt(split[i]);
            } catch (NumberFormatException e) {
                kj.a(Log.getStackTraceString(e));
                return null;
            }
        }
        return iArr;
    }

    private static boolean a(String str, int i, int i2, byte[] bArr) {
        int length;
        RandomAccessFile randomAccessFile;
        long j;
        RandomAccessFile randomAccessFile2;
        long j2;
        if (bArr != null && (length = bArr.length) > 0) {
            String[] strArr = {str + ".idx", str + ".dat"};
            File file = new File(strArr[1]);
            if (file.exists() || kc.a(file)) {
                try {
                    randomAccessFile = new RandomAccessFile(file, "rws");
                } catch (Exception unused) {
                    randomAccessFile = null;
                }
                if (randomAccessFile == null) {
                    return false;
                }
                byte[] a = a(length);
                a(a);
                try {
                    try {
                        j = randomAccessFile.length();
                        try {
                            randomAccessFile.seek(j);
                            randomAccessFile.write(a);
                            randomAccessFile.write(bArr);
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        j = 0;
                    }
                    kd.a(randomAccessFile);
                    File file2 = new File(strArr[0]);
                    if (file2.exists() || kc.a(file2)) {
                        try {
                            randomAccessFile2 = new RandomAccessFile(file2, "rws");
                        } catch (Exception unused4) {
                            randomAccessFile2 = null;
                        }
                        if (randomAccessFile == null) {
                            return false;
                        }
                        try {
                            j2 = randomAccessFile.length();
                        } catch (Exception unused5) {
                            j2 = 0;
                        }
                        if (j2 == 0) {
                            byte[] bArr2 = new byte[65536];
                            Arrays.fill(bArr2, (byte) -1);
                            try {
                                randomAccessFile.write(bArr2);
                            } catch (Exception unused6) {
                            }
                        }
                        long a2 = a(i, i2);
                        if (a2 < 0) {
                            return false;
                        }
                        try {
                            randomAccessFile.seek(a2 * 4);
                        } catch (Exception unused7) {
                        }
                        byte[] a3 = a((int) j);
                        a(a3);
                        try {
                            randomAccessFile.write(a3);
                        } catch (Exception unused8) {
                        } catch (Throwable th) {
                            throw th;
                        }
                        return true;
                    }
                    return false;
                } finally {
                    kd.a(randomAccessFile);
                }
            }
            return false;
        }
        return false;
    }

    private static byte[] a(String str, int i, int i2) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        String[] strArr = {str + ".idx", str + ".dat"};
        File file = new File(strArr[0]);
        RandomAccessFile randomAccessFile3 = null;
        if (!file.exists() || file.length() == 0) {
            return null;
        }
        long a = a(i, i2);
        if (a < 0) {
            return null;
        }
        byte[] bArr = new byte[4];
        try {
            randomAccessFile = new RandomAccessFile(file, com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
            try {
                randomAccessFile.seek(a * 4);
                randomAccessFile.read(bArr, 0, 4);
                kd.a(randomAccessFile);
                a(bArr);
                int b = b(bArr);
                if (b < 0) {
                    return null;
                }
                File file2 = new File(strArr[1]);
                if (!file2.exists()) {
                    return null;
                }
                try {
                    randomAccessFile2 = new RandomAccessFile(file2, com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
                    try {
                        randomAccessFile2.seek(b);
                        randomAccessFile2.read(bArr, 0, 4);
                        a(bArr);
                        int b2 = b(bArr);
                        if (b2 <= 0) {
                            return null;
                        }
                        try {
                            byte[] bArr2 = new byte[b2];
                            randomAccessFile2.read(bArr2, 0, b2);
                            return bArr2;
                        } catch (Throwable th) {
                            try {
                                kj.b("读取瓦片缓存的大小异常", th);
                                return null;
                            } finally {
                                kd.a(randomAccessFile2);
                            }
                        }
                    } catch (Exception unused) {
                        return null;
                    }
                } catch (Exception unused2) {
                    randomAccessFile2 = null;
                }
            } catch (Exception unused3) {
                kd.a(randomAccessFile);
                return null;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile3 = randomAccessFile;
                kd.a(randomAccessFile3);
                throw th;
            }
        } catch (Exception unused4) {
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static String a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        int i4 = i / 128;
        int i5 = i2 / 128;
        sb.append(File.separatorChar);
        sb.append("glGrid");
        sb.append(File.separatorChar);
        sb.append(i3);
        sb.append(File.separatorChar);
        sb.append(i4 / 10);
        sb.append(File.separatorChar);
        sb.append(i5 / 10);
        sb.append(File.separatorChar);
        sb.append(i3);
        sb.append(CommonConstant.Symbol.UNDERLINE);
        sb.append(i4);
        sb.append(CommonConstant.Symbol.UNDERLINE);
        sb.append(i5);
        return sb.toString();
    }

    private static byte[] a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & (-16777216)) >> 24)};
    }

    private static void a(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            return;
        }
        byte b = bArr[0];
        bArr[0] = bArr[3];
        bArr[3] = b;
        byte b2 = bArr[1];
        bArr[1] = bArr[2];
        bArr[2] = b2;
    }

    private static int b(byte[] bArr) {
        return ((bArr[3] << 24) & (-16777216)) | (bArr[0] & 255) | ((bArr[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[2] << 16) & 16711680);
    }

    private static long a(int i, int i2) {
        return ((i % 128) * 128) + (i2 % 128);
    }
}
