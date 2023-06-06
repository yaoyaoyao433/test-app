package com.sankuai.xm.base.util;

import android.content.Context;
import android.hardware.SensorPrivacyManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class u {
    public static ChangeQuickRedirect a;
    private static Map<Byte, Integer> b;
    private static Boolean c;
    private static Boolean d;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put((byte) 4, 13);
        b.put(Byte.valueOf((byte) com.tencent.mapsdk.internal.p.ZERO_TAG), 14);
        b.put((byte) 20, 16);
        b.put((byte) 28, 18);
        b.put((byte) 36, 20);
        b.put((byte) 44, 21);
        b.put((byte) 52, 27);
        b.put((byte) 60, 32);
        c = null;
        d = null;
    }

    private static void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5868f90626f2577d99d2e5e7c8c4a43f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5868f90626f2577d99d2e5e7c8c4a43f");
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            SensorPrivacyManager sensorPrivacyManager = (SensorPrivacyManager) context.getSystemService(SensorPrivacyManager.class);
            if (sensorPrivacyManager != null) {
                c = Boolean.valueOf(sensorPrivacyManager.supportsSensorToggle(1));
                d = Boolean.valueOf(sensorPrivacyManager.supportsSensorToggle(2));
            }
        } else {
            c = Boolean.FALSE;
            d = Boolean.FALSE;
        }
        com.sankuai.xm.log.c.b("MediaUtils", "setupToggle:%s,%s", c, d);
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60f8e6f69782f7099c3ae6959fe2d10b", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60f8e6f69782f7099c3ae6959fe2d10b")).booleanValue();
        }
        if (c == null) {
            c(context);
        }
        return c.booleanValue();
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62433b6b4dd148ba751c4c69491d24b5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62433b6b4dd148ba751c4c69491d24b5")).booleanValue();
        }
        if (d == null) {
            c(context);
        }
        return d.booleanValue();
    }

    public static boolean a(String str) {
        InputStream inputStream;
        String str2;
        String str3;
        Object[] objArr;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "3bb02dd0263dc265eb82de62f00620ea", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "3bb02dd0263dc265eb82de62f00620ea")).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        try {
            try {
                inputStream = k.q(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            inputStream = inputStream2;
        }
        try {
            byte[] bArr = new byte[6];
            int read = inputStream.read(bArr, 0, 6);
            j = 0 + read;
            if (read != 6) {
                m.a(inputStream);
                str2 = "MediaUtils";
                str3 = "checkSliceAmr: time = %s, len = %s.";
                objArr = new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j)};
            } else if (new String(bArr).equals("#!AMR\n")) {
                byte[] bArr2 = new byte[32];
                byte[] bArr3 = new byte[1];
                do {
                    Arrays.fill(bArr3, (byte) 0);
                    int read2 = inputStream.read(bArr3);
                    long j2 = j + read2;
                    if (read2 != 1) {
                        m.a(inputStream);
                        str2 = "MediaUtils";
                        str3 = "checkSliceAmr: time = %s, len = %s.";
                        objArr = new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j2)};
                    } else {
                        Integer num = b.get(Byte.valueOf(bArr3[0]));
                        if (num == null) {
                            m.a(inputStream);
                            str2 = "MediaUtils";
                            str3 = "checkSliceAmr: time = %s, len = %s.";
                            objArr = new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j2)};
                        } else {
                            Arrays.fill(bArr2, (byte) 0);
                            int read3 = inputStream.read(bArr2, 0, num.intValue() - 1);
                            j = j2 + read3;
                            if (num.intValue() - 1 == read3 && bArr3[0] == 60) {
                                if (bArr2[15] == Byte.MIN_VALUE || bArr2[15] == -64) {
                                    for (int i = 16; i < 32; i++) {
                                        if (bArr2[i] != 0) {
                                            m.a(inputStream);
                                            str2 = "MediaUtils";
                                            str3 = "checkSliceAmr: time = %s, len = %s.";
                                            objArr = new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j)};
                                        }
                                    }
                                } else {
                                    m.a(inputStream);
                                    str2 = "MediaUtils";
                                    str3 = "checkSliceAmr: time = %s, len = %s.";
                                    objArr = new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j)};
                                }
                            }
                            m.a(inputStream);
                            str2 = "MediaUtils";
                            str3 = "checkSliceAmr: time = %s, len = %s.";
                            objArr = new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j)};
                        }
                    }
                } while (inputStream.available() > 0);
                m.a(inputStream);
                com.sankuai.xm.log.c.b("MediaUtils", "checkSliceAmr: time = %s, len = %s.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j));
                return true;
            } else {
                m.a(inputStream);
                str2 = "MediaUtils";
                str3 = "checkSliceAmr: time = %s, len = %s.";
                objArr = new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j)};
            }
            com.sankuai.xm.log.c.b(str2, str3, objArr);
            return false;
        } catch (Exception e2) {
            e = e2;
            inputStream2 = inputStream;
            com.sankuai.xm.log.c.a("MediaUtils", e, "checkSliceAmr: %s", str);
            m.a(inputStream2);
            com.sankuai.xm.log.c.b("MediaUtils", "checkSliceAmr: time = %s, len = %s.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j));
            return false;
        } catch (Throwable th2) {
            th = th2;
            m.a(inputStream);
            com.sankuai.xm.log.c.b("MediaUtils", "checkSliceAmr: time = %s, len = %s.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Long.valueOf(j));
            throw th;
        }
    }
}
