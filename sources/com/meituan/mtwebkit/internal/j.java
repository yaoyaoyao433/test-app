package com.meituan.mtwebkit.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.mtwebkit.internal.reporter.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static c.a b;

    public static void a(PackageInfo packageInfo) {
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb36a00fa04e4d49b2cb82e6b9154220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb36a00fa04e4d49b2cb82e6b9154220");
        } else {
            new DexClassLoader(g.b(packageInfo.versionCode).getAbsolutePath(), g.e(packageInfo.versionCode).getAbsolutePath(), g.c(packageInfo.versionCode).getAbsolutePath(), Context.class.getClassLoader());
        }
    }

    public static void b(PackageInfo packageInfo) {
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb6e4fbfd8e5803ebeacf5b282f39ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb6e4fbfd8e5803ebeacf5b282f39ed3");
        } else if (packageInfo == null) {
        } else {
            h.k();
            a(packageInfo, "A");
            c(packageInfo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.pm.PackageInfo r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mtwebkit.internal.j.a
            java.lang.String r11 = "d011e3291a714cc2aab69d5317c06447"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1c
            r12 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            return
        L1c:
            if (r12 != 0) goto L1f
            return
        L1f:
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {x00ae: FILL_ARRAY_DATA  , data: [1, 0, 0} // fill-array
            java.lang.String r2 = com.meituan.mtwebkit.internal.h.h()
            int r3 = r12.versionCode
            java.io.File r3 = com.meituan.mtwebkit.internal.g.f(r3)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L40
            long r3 = r3.length()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L40
            r9 = 1
        L40:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 25
            if (r3 <= r4) goto L6f
            if (r9 != 0) goto L6f
            boolean r3 = com.meituan.mtwebkit.internal.h.t()
            if (r3 == 0) goto L6f
            java.lang.String r3 = "B"
            a(r12, r3)
            r1[r0] = r0
            java.lang.String r3 = "B"
            boolean r3 = r2.endsWith(r3)
            if (r3 != 0) goto L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r5 = "B"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            goto L70
        L6f:
            r3 = r2
        L70:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 <= r4) goto L9d
            if (r9 != 0) goto L9d
            boolean r4 = com.meituan.mtwebkit.internal.h.u()
            if (r4 == 0) goto L9d
            java.lang.String r4 = "C"
            a(r12, r4)
            r12 = 2
            r1[r12] = r0
            java.lang.String r12 = "C"
            boolean r12 = r3.endsWith(r12)
            if (r12 != 0) goto L9d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r0 = "C"
            r12.append(r0)
            java.lang.String r3 = r12.toString()
        L9d:
            java.lang.String r12 = a(r1)
            com.meituan.mtwebkit.internal.h.b(r12)
            boolean r12 = r3.equals(r2)
            if (r12 != 0) goto Lad
            com.meituan.mtwebkit.internal.h.c(r3)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.j.c(android.content.pm.PackageInfo):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r18.equals("C") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.pm.PackageInfo r17, java.lang.String r18) {
        /*
            r0 = r17
            r1 = r18
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r11 = 0
            r10[r11] = r0
            r12 = 1
            r10[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.mtwebkit.internal.j.a
            java.lang.String r14 = "5c1f2ad0cdd5e6b3a429ec3433b9bf03"
            r4 = 0
            r6 = 1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r5 = r13
            r7 = r14
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L23
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r0, r13, r12, r14)
            return
        L23:
            long r3 = java.lang.System.currentTimeMillis()
            r5 = -1
            int r6 = r18.hashCode()
            switch(r6) {
                case 65: goto L43;
                case 66: goto L39;
                case 67: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L4d
        L30:
            java.lang.String r6 = "C"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L4d
            goto L4e
        L39:
            java.lang.String r2 = "B"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4d
            r2 = 1
            goto L4e
        L43:
            java.lang.String r2 = "A"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4d
            r2 = 0
            goto L4e
        L4d:
            r2 = -1
        L4e:
            switch(r2) {
                case 0: goto L5a;
                case 1: goto L56;
                case 2: goto L52;
                default: goto L51;
            }
        L51:
            return
        L52:
            d(r17)
            goto L5d
        L56:
            e(r17)
            goto L5d
        L5a:
            a(r17)
        L5d:
            long r5 = java.lang.System.currentTimeMillis()
            int r0 = r0.versionCode
            java.io.File r0 = com.meituan.mtwebkit.internal.g.f(r0)
            r7 = 3000(0xbb8, double:1.482E-320)
            r9 = -1
            r11 = 0
            r13 = r11
        L6e:
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L8d
            boolean r2 = r0.exists()
            if (r2 == 0) goto L86
            long r15 = r0.length()
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 <= 0) goto L86
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r5
            r13 = r15
        L86:
            r15 = 100
            android.os.SystemClock.sleep(r15)
            long r7 = r7 - r15
            goto L6e
        L8d:
            com.meituan.mtwebkit.internal.reporter.c$a r2 = new com.meituan.mtwebkit.internal.reporter.c$a
            r2.<init>()
            com.meituan.mtwebkit.internal.j.b = r2
            long r5 = r5 - r3
            r2.a = r5
            com.meituan.mtwebkit.internal.reporter.c$a r2 = com.meituan.mtwebkit.internal.j.b
            r2.b = r9
            com.meituan.mtwebkit.internal.reporter.c$a r2 = com.meituan.mtwebkit.internal.j.b
            r2.c = r13
            com.meituan.mtwebkit.internal.reporter.c$a r2 = com.meituan.mtwebkit.internal.j.b
            r2.e = r1
            com.meituan.mtwebkit.internal.reporter.c$a r1 = com.meituan.mtwebkit.internal.j.b
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = a(r0, r2)
            r1.d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.j.a(android.content.pm.PackageInfo, java.lang.String):void");
    }

    public static c.a a() {
        c.a aVar = b;
        b = null;
        return aVar;
    }

    public static synchronized long b() {
        synchronized (j.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f2df8837dde3385f17d2ceef11362e2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f2df8837dde3385f17d2ceef11362e2")).longValue();
            }
            PackageInfo e = l.e();
            if (e == null) {
                return 0L;
            }
            try {
                return g.f(e.versionCode).length();
            } catch (Throwable unused) {
                return 0L;
            }
        }
    }

    public static synchronized String c() {
        synchronized (j.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd96ce5d49a7e32962bbe2f639c6f0df", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd96ce5d49a7e32962bbe2f639c6f0df");
            }
            PackageInfo e = l.e();
            if (e == null) {
                return "notMTWebView";
            }
            return a(g.f(e.versionCode), Build.VERSION.SDK_INT);
        }
    }

    private static String a(File file, int i) {
        int i2;
        int i3;
        boolean z = true;
        Object[] objArr = {file, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4a0f08b00001a34289ab7838700569e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4a0f08b00001a34289ab7838700569e");
        }
        if (i > 30 || i < 26) {
            return "notSupport";
        }
        if (!file.exists() || file.length() == 0) {
            return "notExist";
        }
        String str = "unknown";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, r.o);
            randomAccessFile.seek(4096L);
            byte[] bArr = new byte[3];
            randomAccessFile.read(bArr);
            if ("oat".equals(new String(bArr))) {
                if (i == 30) {
                    i2 = 56;
                } else if (i == 29) {
                    i2 = 52;
                } else {
                    if (i != 28 && i != 27) {
                        i2 = i == 26 ? 68 : 0;
                    }
                    i2 = 72;
                }
                long j = i2 + 4096;
                randomAccessFile.seek(j);
                byte[] bArr2 = new byte[4];
                randomAccessFile.read(bArr2, 0, 4);
                long a2 = a(bArr2);
                if (j + a2 < file.length()) {
                    int i4 = 15;
                    byte[] bArr3 = new byte[15];
                    long j2 = 0;
                    long j3 = 0;
                    int i5 = 0;
                    while (true) {
                        if (j2 >= a2) {
                            break;
                        }
                        byte readByte = randomAccessFile.readByte();
                        if (!z || i5 >= i4) {
                            i3 = i5;
                        } else {
                            i3 = i5 + 1;
                            bArr3[i5] = readByte;
                        }
                        if (readByte == 0) {
                            if (z) {
                                if ("compiler-filter".equals(new String(bArr3))) {
                                    j3 = randomAccessFile.getFilePointer();
                                }
                                i3 = 0;
                            }
                            if (j3 != 0 && !z) {
                                byte[] bArr4 = new byte[(int) ((randomAccessFile.getFilePointer() - j3) - 1)];
                                randomAccessFile.seek(j3);
                                randomAccessFile.read(bArr4);
                                str = new String(bArr4);
                                break;
                            }
                            z = !z;
                        }
                        i5 = i3;
                        j2++;
                        i4 = 15;
                    }
                }
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            i.a(th);
        }
        return str;
    }

    private static long a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dba068d3613e3b24f43f2efc9463ee47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dba068d3613e3b24f43f2efc9463ee47")).longValue();
        }
        long j = 0;
        for (int i = 3; i >= 0; i--) {
            j += (bArr[i] & 255) << (i * 8);
        }
        return j;
    }

    private static String a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36b89f7f841bbf4b0370494ceb9452e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36b89f7f841bbf4b0370494ceb9452e8");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    private static void d(PackageInfo packageInfo) {
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e3250be7aae5abe45979de7b5677a4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e3250be7aae5abe45979de7b5677a4b");
            return;
        }
        try {
            String packageName = a.a().getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                HashMap hashMap = new HashMap();
                hashMap.put(g.b(packageInfo.versionCode).getAbsolutePath(), "PCL[]");
                d.a("android.app.ActivityThread").a("getPackageManager", new Object[0]).a("notifyDexLoad", packageName, d.a(hashMap, Map.class), d.a("dalvik.system.VMRuntime").a("getRuntime", new Object[0]).a("vmInstructionSet", new Object[0]));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(PathClassLoader.class.getName());
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(g.b(packageInfo.versionCode).getAbsolutePath());
            d.a("android.app.ActivityThread").a("getPackageManager", new Object[0]).a("notifyDexLoad", packageName, d.a(arrayList, List.class), d.a(arrayList2, List.class), d.a("dalvik.system.VMRuntime").a("getRuntime", new Object[0]).a("vmInstructionSet", new Object[0]));
        } catch (Throwable th) {
            i.a(th);
        }
    }

    private static void e(PackageInfo packageInfo) {
        Object[] objArr = {packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2b54dc228a3ebecec10acfdb85f076b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2b54dc228a3ebecec10acfdb85f076b");
            return;
        }
        try {
            PackageManager packageManager = a.a().getPackageManager();
            String absolutePath = g.b(packageInfo.versionCode).getAbsolutePath();
            d.a(packageManager.getClass(), "registerDexModule", String.class, Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")).invoke(packageManager, absolutePath, null);
        } catch (Throwable th) {
            i.a(th);
        }
    }
}
