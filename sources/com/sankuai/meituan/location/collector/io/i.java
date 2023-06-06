package com.sankuai.meituan.location.collector.io;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.io.e;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    Context b;
    private h c;
    private e d;

    public i(Context context, h hVar, e eVar) {
        Object[] objArr = {context, hVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909a1a8d5d9f7c5d6a2d9c4d80285793", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909a1a8d5d9f7c5d6a2d9c4d80285793");
            return;
        }
        this.b = context;
        this.c = hVar;
        this.d = eVar;
    }

    private static String a(File[] fileArr) {
        Object[] objArr = {fileArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adb32af779227615873d7192dcf5832b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adb32af779227615873d7192dcf5832b");
        }
        long j = 0;
        for (File file : fileArr) {
            try {
                long parseLong = Long.parseLong(file.getName());
                if (parseLong > j) {
                    j = parseLong;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (j == 0) {
            return null;
        }
        return String.valueOf(j);
    }

    private ArrayList<File> a(File file, long j) {
        String a2;
        Object[] objArr = {file, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5bf789c6555d35e021891c0610b5738", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5bf789c6555d35e021891c0610b5738");
        }
        if (file == null) {
            return null;
        }
        ArrayList<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0 || (a2 = a(listFiles)) == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (!a2.equals(file2.getName()) || file2.length() > j) {
                arrayList.add(file2);
            }
        }
        return arrayList;
    }

    @SuppressLint({"MissingPermission"})
    private static boolean a(Context context) {
        NetworkInfo networkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2b099e276b5cf26209763dbcf88871c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2b099e276b5cf26209763dbcf88871c")).booleanValue();
        }
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
            networkInfo = null;
        }
        if (networkInfo == null) {
            LogUtils.a("network info is null");
            return false;
        } else if (networkInfo.getType() == 1) {
            return false;
        } else {
            LogUtils.a("network info getSubtype: " + networkInfo.getSubtype());
            switch (networkInfo.getSubtype()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                case 20:
                    return true;
                case 4:
                case 7:
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r15 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (r15 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
        com.sankuai.meituan.location.collector.io.g.b.unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
        r11.c.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r12, java.io.File r14, boolean r15) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            r8 = 0
            r0[r8] = r1
            r1 = 1
            r0[r1] = r14
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r2 = 2
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.location.collector.io.i.a
            java.lang.String r10 = "95b84a159249c199a5b661766a6a95b0"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L2a
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "collector UploadManager doUploadFileBySize:"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.meituan.android.common.locate.util.LogUtils.a(r0)
            if (r14 == 0) goto Ld9
            boolean r0 = r14.exists()
            if (r0 == 0) goto Ld9
            boolean r0 = r14.isDirectory()
            if (r0 != 0) goto L4b
            goto Ld9
        L4b:
            java.lang.String r0 = "collector UploadManager  upload dir not exsit "
            com.meituan.android.common.locate.util.LogUtils.a(r0)
            if (r15 == 0) goto L5a
            java.util.concurrent.locks.ReentrantLock r0 = com.sankuai.meituan.location.collector.io.g.b
            r0.lock()
            com.sankuai.meituan.location.collector.io.f.a()
        L5a:
            java.util.ArrayList r12 = r11.a(r14, r12)     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r14 = "collector UploadManager  files2Upload.size() = "
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lc0
            r14 = 0
            if (r12 != 0) goto L6a
            r0 = r14
            goto L72
        L6a:
            int r0 = r12.size()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lc0
        L72:
            r13.append(r0)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lc0
            com.meituan.android.common.locate.util.LogUtils.a(r13)     // Catch: java.lang.Throwable -> Lc0
            if (r12 != 0) goto L86
            if (r15 == 0) goto L85
            java.util.concurrent.locks.ReentrantLock r12 = com.sankuai.meituan.location.collector.io.g.b
            r12.unlock()
        L85:
            return
        L86:
            android.content.Context r13 = r11.b     // Catch: java.lang.Throwable -> Lc0
            boolean r13 = a(r13)     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> Lc0
        L90:
            boolean r0 = r12.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto Lbb
            java.lang.Object r0 = r12.next()     // Catch: java.lang.Throwable -> Lc0
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "collector UploadManager  file.dir = "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r0 != 0) goto La7
            r2 = r14
            goto Lab
        La7:
            java.lang.String r2 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc0
        Lab:
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc0
            com.meituan.android.common.locate.util.LogUtils.a(r1)     // Catch: java.lang.Throwable -> Lc0
            com.sankuai.meituan.location.collector.io.e r1 = r11.d     // Catch: java.lang.Throwable -> Lc0
            r11.a(r0, r13, r1)     // Catch: java.lang.Throwable -> Lc0
            goto L90
        Lbb:
            if (r15 == 0) goto Lcb
            goto Lc6
        Lbe:
            r12 = move-exception
            goto Ld1
        Lc0:
            r12 = move-exception
            com.meituan.android.common.locate.util.LogUtils.a(r12)     // Catch: java.lang.Throwable -> Lbe
            if (r15 == 0) goto Lcb
        Lc6:
            java.util.concurrent.locks.ReentrantLock r12 = com.sankuai.meituan.location.collector.io.g.b
            r12.unlock()
        Lcb:
            com.sankuai.meituan.location.collector.io.h r12 = r11.c
            r12.b()
            return
        Ld1:
            if (r15 == 0) goto Ld8
            java.util.concurrent.locks.ReentrantLock r13 = com.sankuai.meituan.location.collector.io.g.b
            r13.unlock()
        Ld8:
            throw r12
        Ld9:
            java.lang.String r12 = "collector UploadManager  upload dir exsit "
            com.meituan.android.common.locate.util.LogUtils.a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.location.collector.io.i.a(long, java.io.File, boolean):void");
    }

    private boolean a(File file, boolean z, e eVar) {
        e.a a2;
        boolean z2;
        Object[] objArr = {file, Byte.valueOf(z ? (byte) 1 : (byte) 0), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115511d4989e8770e8591db14f5bced9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115511d4989e8770e8591db14f5bced9")).booleanValue();
        }
        LogUtils.a("collector UploadManager processSingleFile. ismobile:" + z);
        if (file == null || !file.exists()) {
            return false;
        }
        if (z) {
            h hVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "b4c0cb3263a00bf9b9f9ea30da2023f0", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "b4c0cb3263a00bf9b9f9ea30da2023f0")).booleanValue();
            } else {
                LogUtils.a("collector strategy configed data:" + hVar.c + " has consume:" + hVar.e);
                z2 = hVar.e < hVar.c;
            }
            if (!z2) {
                return false;
            }
        }
        long j = 0;
        try {
            a2 = eVar.a(file);
        } catch (Throwable th) {
            LogUtils.a(th);
        }
        if (!a2.a) {
            LogUtils.a("collector UploadManager upload failed.response failed!");
            return false;
        }
        LogUtils.a("collector UploadManager upload" + file.getName() + "ok");
        file.delete();
        LogUtils.a("collector UploadManager upload ok,del local file");
        j = a2.b;
        h hVar2 = this.c;
        Object[] objArr3 = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar2, changeQuickRedirect3, false, "0fbae2634a889d135532ed209d04946c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar2, changeQuickRedirect3, false, "0fbae2634a889d135532ed209d04946c");
            return true;
        }
        LogUtils.a("collector strategy onReportOneFileSuccess");
        hVar2.d = System.currentTimeMillis();
        hVar2.f++;
        if (z) {
            hVar2.e += j;
            LogUtils.a("collector strategy mHasConsumeMobileDataSize " + hVar2.e);
            return true;
        }
        return true;
    }
}
