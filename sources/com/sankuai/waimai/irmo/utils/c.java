package com.sankuai.waimai.irmo.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.j;
import com.sankuai.waimai.irmo.resource.bean.IrmoResource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.zip.ZipFile;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    private static boolean a(File file, String str, String str2) {
        boolean z;
        boolean z2;
        Throwable th;
        boolean a2;
        Object[] objArr = {file, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str3 = "1f9265f37f7e9738e7f1cf03e20699dd";
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, str3, RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f9265f37f7e9738e7f1cf03e20699dd")).booleanValue();
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            int i = 0;
            boolean z3 = false;
            z = str3;
            while (true) {
                try {
                    try {
                        a2 = a(zipFile, str, str2);
                        if (a2) {
                            break;
                        }
                        i++;
                        try {
                            com.sankuai.waimai.foundation.utils.log.a.e("INF_LOG", "unzipFileWithRetry | retryCount =  " + i, new Object[0]);
                            if (i > 3) {
                                break;
                            }
                            z3 = a2;
                            z = a2;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        com.sankuai.waimai.foundation.utils.log.a.e("INF_LOG", "unzipFileWithRetry | " + file + " | " + e.getMessage(), new Object[0]);
                        z2 = z;
                        return z2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            zipFile.close();
            z2 = a2;
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        return z2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static boolean a(java.util.zip.ZipFile r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.irmo.utils.c.a(java.util.zip.ZipFile, java.lang.String, java.lang.String):boolean");
    }

    private static boolean a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c37145eed5a2e90f16ca00041b81d3cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c37145eed5a2e90f16ca00041b81d3cd")).booleanValue();
        }
        boolean a2 = a(file);
        if (!a2) {
            com.sankuai.waimai.foundation.utils.log.a.e("INF_LOG", "创建目录失败 " + str, new Object[0]);
        }
        return a2;
    }

    private static boolean a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "895439c7cc54386e011ae7ad55cc462a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "895439c7cc54386e011ae7ad55cc462a")).booleanValue();
        }
        if (file.exists()) {
            return true;
        }
        int i = 0;
        while (!file.mkdirs()) {
            i++;
            com.sankuai.waimai.foundation.utils.log.a.e("INF_LOG", "mkdirsWithRetry | retryCount =  " + i, new Object[0]);
            if (i > 3) {
                break;
            }
        }
        return i <= 3;
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "311adfbb4b1e64a34868f445dc0d2997", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "311adfbb4b1e64a34868f445dc0d2997")).longValue();
        }
        long j = 0;
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                outputStream.flush();
                return j;
            }
        }
    }

    public static boolean a(IrmoResource irmoResource) {
        Object[] objArr = {irmoResource};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ea2f1d7172b33e6f1ad9652be3a8cb5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ea2f1d7172b33e6f1ad9652be3a8cb5")).booleanValue();
        }
        if (irmoResource == null || TextUtils.isEmpty(irmoResource.rootPath)) {
            d.a("检查缓存与解压失败,无效数据 resource : " + irmoResource, new Object[0]);
            return false;
        }
        File file = new File(irmoResource.rootPath);
        try {
            if (file.exists() && file.isDirectory() && file.list() != null) {
                return ((String[]) Objects.requireNonNull(file.list())).length > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x001a, B:11:0x0029, B:13:0x0031, B:15:0x0039, B:18:0x0042, B:19:0x004d, B:21:0x0053, B:23:0x0059, B:25:0x005f, B:32:0x0073, B:35:0x0097), top: B:44:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean b(com.sankuai.waimai.irmo.resource.bean.IrmoResource r13) {
        /*
            java.lang.Class<com.sankuai.waimai.irmo.utils.c> r0 = com.sankuai.waimai.irmo.utils.c.class
            monitor-enter(r0)
            r1 = 1
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Laf
            r10 = 0
            r9[r10] = r13     // Catch: java.lang.Throwable -> Laf
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.irmo.utils.c.a     // Catch: java.lang.Throwable -> Laf
            java.lang.String r12 = "06d65c28adb2609e6ea461a036bba8a0"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L27
            r13 = 0
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r9, r13, r11, r1, r12)     // Catch: java.lang.Throwable -> Laf
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> Laf
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r0)
            return r13
        L27:
            if (r13 == 0) goto L97
            java.lang.String r2 = r13.irmoBundleId     // Catch: java.lang.Throwable -> Laf
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Laf
            if (r2 != 0) goto L97
            java.lang.String r2 = r13.zipPath     // Catch: java.lang.Throwable -> Laf
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Laf
            if (r2 != 0) goto L97
            java.lang.String r2 = r13.rootPath     // Catch: java.lang.Throwable -> Laf
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L42
            goto L97
        L42:
            java.lang.String r2 = r13.irmoBundleId     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r13.zipPath     // Catch: java.lang.Throwable -> Laf
            java.lang.String r13 = r13.rootPath     // Catch: java.lang.Throwable -> Laf
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> Laf
            r4.<init>(r13)     // Catch: java.lang.Throwable -> Laf
            boolean r5 = r4.exists()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> Laf
            if (r5 == 0) goto L6e
            boolean r5 = r4.isDirectory()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> Laf
            if (r5 == 0) goto L6e
            java.lang.String[] r5 = r4.list()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> Laf
            if (r5 == 0) goto L6e
            java.lang.String[] r4 = r4.list()     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> Laf
            java.lang.Object r4 = java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> Laf
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> Laf
            int r4 = r4.length     // Catch: java.lang.Exception -> L6e java.lang.Throwable -> Laf
            if (r4 <= 0) goto L6e
            r4 = 1
            goto L6f
        L6e:
            r4 = 0
        L6f:
            if (r4 == 0) goto L73
            monitor-exit(r0)
            return r1
        L73:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = "处理DD 预加载资源 irmobundleId: "
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Laf
            r1.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = "  未解压 执行解压操作"
            r1.append(r4)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Laf
            java.lang.Object[] r4 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> Laf
            com.sankuai.waimai.irmo.utils.d.e(r1, r4)     // Catch: java.lang.Throwable -> Laf
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Laf
            r1.<init>(r3)     // Catch: java.lang.Throwable -> Laf
            boolean r13 = a(r1, r13, r2)     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r0)
            return r13
        L97:
            java.lang.String r1 = "INF_LOG"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = "检查缓存与解压失败,无效数据 resource : "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Laf
            r2.append(r13)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r13 = r2.toString()     // Catch: java.lang.Throwable -> Laf
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> Laf
            com.sankuai.waimai.foundation.utils.log.a.b(r1, r13, r2)     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r0)
            return r10
        Laf:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.irmo.utils.c.b(com.sankuai.waimai.irmo.resource.bean.IrmoResource):boolean");
    }

    public static synchronized void c(IrmoResource irmoResource) {
        synchronized (c.class) {
            Object[] objArr = {irmoResource};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575fafcf54589d0e16cf2546a9e8a9e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575fafcf54589d0e16cf2546a9e8a9e3");
            } else if (irmoResource == null || TextUtils.isEmpty(irmoResource.rootPath)) {
                com.sankuai.waimai.foundation.utils.log.a.e("INF_LOG", "删除文件失败 无效 irmoResource 或无效路径 : " + irmoResource, new Object[0]);
            } else {
                try {
                    File file = new File(irmoResource.rootPath);
                    if (file.exists() && file.isDirectory()) {
                        j.b(irmoResource.rootPath);
                        j.a(irmoResource.rootPath);
                        return;
                    }
                    d.e("FileUtils 删除本地资源失败, 文件不存在或非文件夹  path : " + irmoResource.rootPath, new Object[0]);
                } catch (Exception e) {
                    d.e("删除资源 exception " + e.getMessage(), new Object[0]);
                }
            }
        }
    }
}
