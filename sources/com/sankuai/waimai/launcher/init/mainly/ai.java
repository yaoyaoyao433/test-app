package com.sankuai.waimai.launcher.init.mainly;

import android.annotation.TargetApi;
import android.app.Application;
import android.os.Build;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ai extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 1;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "WebviewDirectoryLockInit";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void a(com.sankuai.waimai.launcher.init.mainly.ai r12, java.io.File r13) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.launcher.init.mainly.ai.a
            java.lang.String r11 = "c475e6f776f350f237269332b1d9d65e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            r1 = 0
            boolean r2 = r13.exists()     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L4a
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "rw"
            r0.<init>(r13, r2)     // Catch: java.lang.Throwable -> L66
            java.nio.channels.FileChannel r2 = r0.getChannel()     // Catch: java.lang.Throwable -> L47
            java.nio.channels.FileLock r2 = r2.tryLock()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3e
            boolean r1 = r13.delete()     // Catch: java.lang.Throwable -> L48
            r12.a(r13, r1)     // Catch: java.lang.Throwable -> L48
            goto L41
        L3c:
            r12 = move-exception
            goto L45
        L3e:
            r2.release()     // Catch: java.lang.Throwable -> L48
        L41:
            r1 = r2
            goto L4e
        L43:
            r12 = move-exception
            r2 = r1
        L45:
            r1 = r0
            goto L8b
        L47:
            r2 = r1
        L48:
            r1 = r0
            goto L67
        L4a:
            r12.a(r13, r0)     // Catch: java.lang.Throwable -> L66
            r0 = r1
        L4e:
            if (r0 == 0) goto L58
            r0.close()     // Catch: java.io.IOException -> L54
            goto L58
        L54:
            r12 = move-exception
            r12.printStackTrace()
        L58:
            if (r1 == 0) goto L89
            r1.release()     // Catch: java.io.IOException -> L5e
            return
        L5e:
            r12 = move-exception
            r12.printStackTrace()
            return
        L63:
            r12 = move-exception
            r2 = r1
            goto L8b
        L66:
            r2 = r1
        L67:
            boolean r0 = r13.exists()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L71
            boolean r9 = r13.delete()     // Catch: java.lang.Throwable -> L8a
        L71:
            r12.a(r13, r9)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L7e
            r1.close()     // Catch: java.io.IOException -> L7a
            goto L7e
        L7a:
            r12 = move-exception
            r12.printStackTrace()
        L7e:
            if (r2 == 0) goto L89
            r2.release()     // Catch: java.io.IOException -> L84
            return
        L84:
            r12 = move-exception
            r12.printStackTrace()
            return
        L89:
            return
        L8a:
            r12 = move-exception
        L8b:
            if (r1 == 0) goto L95
            r1.close()     // Catch: java.io.IOException -> L91
            goto L95
        L91:
            r13 = move-exception
            r13.printStackTrace()
        L95:
            if (r2 == 0) goto L9f
            r2.release()     // Catch: java.io.IOException -> L9b
            goto L9f
        L9b:
            r13 = move-exception
            r13.printStackTrace()
        L9f:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.launcher.init.mainly.ai.a(com.sankuai.waimai.launcher.init.mainly.ai, java.io.File):void");
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    @TargetApi(28)
    public final void init(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef410b596bc3e482ad55cb851176f8c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef410b596bc3e482ad55cb851176f8c7");
            return;
        }
        super.init(application);
        com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.ai.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7272f9d602b5cb990a663fc5affdd789", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7272f9d602b5cb990a663fc5affdd789");
                    return;
                }
                File dataDir = application.getDataDir();
                if ("huawei".equalsIgnoreCase(Build.BRAND)) {
                    ai.a(ai.this, new File(dataDir.getAbsolutePath() + "/app_hws_webview/webview_data.lock"));
                }
                ai.a(ai.this, new File(dataDir.getAbsolutePath() + "/app_webview/webview_data.lock"));
                if ("xiaomi".equalsIgnoreCase(Build.BRAND)) {
                    com.sankuai.waimai.foundation.utils.ad.c(new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.ai.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1d8f8be06125145b021e8618d58f7f7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1d8f8be06125145b021e8618d58f7f7");
                                return;
                            }
                            try {
                                new WebView(application.getApplicationContext());
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(File file, boolean z) {
        Object[] objArr = {file, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052e993a5ccd4f5cfe94c631e5063940", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052e993a5ccd4f5cfe94c631e5063940");
        } else if (z) {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
