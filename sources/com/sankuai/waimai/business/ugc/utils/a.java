package com.sankuai.waimai.business.ugc.utils;

import android.content.Context;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final FileFilter b = new FileFilter() { // from class: com.sankuai.waimai.business.ugc.utils.a.1
        public static ChangeQuickRedirect a;

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ddb67331aed543224e56aaf4690d3b4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ddb67331aed543224e56aaf4690d3b4")).booleanValue();
            }
            String name = file.getName();
            if (name.startsWith(Constants.CPU)) {
                for (int i = 3; i < name.length(); i++) {
                    if (!Character.isDigit(name.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    };

    public static long a(Context context) {
        FileInputStream fileInputStream;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80ea8f7a7c0f68a429c01123ac69bc15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80ea8f7a7c0f68a429c01123ac69bc15")).longValue();
        }
        long j = -1;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/meminfo");
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                j = a("MemTotal", fileInputStream) * 1024;
                fileInputStream.close();
                return j;
            } catch (Throwable th) {
                fileInputStream2 = fileInputStream;
                th = th;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int a() {
        int i;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04355f5d429b7e2892517b583aaacc7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04355f5d429b7e2892517b583aaacc7f")).intValue();
        }
        int i2 = -1;
        while (i < b()) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    try {
                        fileInputStream2 = new FileInputStream(file);
                        try {
                            try {
                                fileInputStream2.read(bArr);
                                int i3 = 0;
                                while (Character.isDigit(bArr[i3]) && i3 < 128) {
                                    i3++;
                                }
                                int parseInt = Integer.parseInt(new String(bArr, 0, i3));
                                if (parseInt > i2) {
                                    i2 = parseInt;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream2 != null) {
                                    fileInputStream2.close();
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            i = fileInputStream2 == null ? i + 1 : 0;
                            fileInputStream2.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = null;
                    }
                    fileInputStream2.close();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                return -1;
            }
        }
        try {
            if (i2 == -1) {
                try {
                    fileInputStream = new FileInputStream("/proc/cpuinfo");
                } catch (Exception e4) {
                    e = e4;
                }
                try {
                    int a2 = a("cpu MHz", fileInputStream) * 1000;
                    if (a2 <= i2) {
                        a2 = i2;
                    }
                    fileInputStream.close();
                    return a2;
                } catch (Exception e5) {
                    fileInputStream3 = fileInputStream;
                    e = e5;
                    e.printStackTrace();
                    if (fileInputStream3 != null) {
                        fileInputStream3.close();
                    }
                    return i2;
                } catch (Throwable th3) {
                    fileInputStream3 = fileInputStream;
                    th = th3;
                    if (fileInputStream3 != null) {
                        fileInputStream3.close();
                    }
                    throw th;
                }
            }
            return i2;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "889759e4a15681baa0a3990f1b09d65c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "889759e4a15681baa0a3990f1b09d65c")).intValue();
        }
        try {
            int a2 = a("/sys/devices/system/cpu/possible");
            if (a2 == -1) {
                a2 = a("/sys/devices/system/cpu/present");
            }
            if (a2 == -1) {
                a2 = new File("/sys/devices/system/cpu/").listFiles(b).length;
            }
            return a2;
        } catch (Exception unused) {
            return -1;
        }
    }

    private static int a(String str) {
        FileInputStream fileInputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileInputStream fileInputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2dc07076704beb8ab149a0020b22d7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2dc07076704beb8ab149a0020b22d7d")).intValue();
        }
        int i = -1;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileInputStream = fileInputStream2;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Object[] objArr2 = {readLine};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8c05f72bfc36a79320e303c375a39788", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8c05f72bfc36a79320e303c375a39788")).intValue();
            } else if (readLine != null && readLine.matches("0-[\\d]+$")) {
                i = Integer.parseInt(readLine.substring(2)) + 1;
            }
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
            return i;
        } catch (Exception e2) {
            e = e2;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception unused2) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused3) {
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00af, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.String r21, java.io.FileInputStream r22) {
        /*
            r0 = r21
            r1 = r22
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r11 = 0
            r10[r11] = r0
            r12 = 1
            r10[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.sankuai.waimai.business.ugc.utils.a.a
            java.lang.String r14 = "a597fce22fa3cd1e01018017085a06da"
            r4 = 0
            r6 = 1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r5 = r13
            r7 = r14
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L29
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r4, r13, r12, r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L29:
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r3]
            r6 = -1
            int r1 = r1.read(r5)     // Catch: java.lang.Exception -> Lb1
            r7 = 0
        L33:
            if (r7 >= r1) goto Lb5
            r8 = r5[r7]     // Catch: java.lang.Exception -> Lb1
            r9 = 10
            if (r8 == r9) goto L3d
            if (r7 != 0) goto Laf
        L3d:
            r8 = r5[r7]     // Catch: java.lang.Exception -> Lb1
            if (r8 != r9) goto L43
            int r7 = r7 + 1
        L43:
            r8 = r7
        L44:
            if (r8 >= r1) goto Laf
            int r10 = r8 - r7
            r13 = r5[r8]     // Catch: java.lang.Exception -> Lb1
            char r14 = r0.charAt(r10)     // Catch: java.lang.Exception -> Lb1
            if (r13 != r14) goto Laf
            int r13 = r21.length()     // Catch: java.lang.Exception -> Lb1
            int r13 = r13 - r12
            if (r10 != r13) goto Lac
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lb1
            r0[r11] = r5     // Catch: java.lang.Exception -> Lb1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lb1
            r0[r12] = r1     // Catch: java.lang.Exception -> Lb1
            com.meituan.robust.ChangeQuickRedirect r1 = com.sankuai.waimai.business.ugc.utils.a.a     // Catch: java.lang.Exception -> Lb1
            java.lang.String r2 = "65e92e4905e1b781bd2468fc81466e96"
            r15 = 0
            r17 = 1
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            r14 = r0
            r16 = r1
            r18 = r2
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> Lb1
            if (r7 == 0) goto L80
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r4, r1, r12, r2)     // Catch: java.lang.Exception -> Lb1
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> Lb1
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Lb1
            return r0
        L80:
            if (r8 >= r3) goto Lab
            r0 = r5[r8]     // Catch: java.lang.Exception -> Lb1
            if (r0 == r9) goto Lab
            r0 = r5[r8]     // Catch: java.lang.Exception -> Lb1
            boolean r0 = java.lang.Character.isDigit(r0)     // Catch: java.lang.Exception -> Lb1
            if (r0 == 0) goto La8
            int r0 = r8 + 1
        L90:
            if (r0 >= r3) goto L9d
            r1 = r5[r0]     // Catch: java.lang.Exception -> Lb1
            boolean r1 = java.lang.Character.isDigit(r1)     // Catch: java.lang.Exception -> Lb1
            if (r1 == 0) goto L9d
            int r0 = r0 + 1
            goto L90
        L9d:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> Lb1
            int r0 = r0 - r8
            r1.<init>(r5, r11, r8, r0)     // Catch: java.lang.Exception -> Lb1
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> Lb1
            return r0
        La8:
            int r8 = r8 + 1
            goto L80
        Lab:
            return r6
        Lac:
            int r8 = r8 + 1
            goto L44
        Laf:
            int r7 = r7 + r12
            goto L33
        Lb1:
            r0 = move-exception
            r0.printStackTrace()
        Lb5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.utils.a.a(java.lang.String, java.io.FileInputStream):int");
    }
}
