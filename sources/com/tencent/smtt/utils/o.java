package com.tencent.smtt.utils;

import android.content.Context;
import com.tencent.smtt.sdk.QbSdk;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
/* loaded from: classes6.dex */
public class o {
    private static o e;
    private Context b;
    private File c = null;
    public boolean a = false;
    private boolean d = false;
    private File f = null;

    private o(Context context) {
        this.b = null;
        this.b = context.getApplicationContext();
        b();
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            oVar = e;
        }
        return oVar;
    }

    public static synchronized o a(Context context) {
        o oVar;
        synchronized (o.class) {
            if (e == null) {
                e = new o(context);
            }
            oVar = e;
        }
        return oVar;
    }

    private File d() {
        try {
            if (this.c == null) {
                this.c = new File(QbSdk.getTbsFolderDir(this.b), "core_private");
                if (this.c == null || !this.c.isDirectory()) {
                    return null;
                }
            }
            File file = new File(this.c, "debug.conf");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void a(boolean z) {
        this.d = z;
        c();
    }

    public synchronized void b() {
        BufferedInputStream bufferedInputStream = null;
        try {
            if (this.f == null) {
                this.f = d();
            }
            if (this.f == null) {
                return;
            }
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(this.f));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream2);
                String property = properties.getProperty("setting_forceUseSystemWebview", "");
                if (!"".equals(property)) {
                    this.a = Boolean.parseBoolean(property);
                }
                try {
                    bufferedInputStream2.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                th.printStackTrace();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void c() {
        /*
            r7 = this;
            java.io.File r0 = r7.d()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L60
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L60
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L60
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L60
            java.util.Properties r2 = new java.util.Properties     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
            r2.load(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "setting_forceUseSystemWebview"
            boolean r5 = r7.a     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch: java.lang.Throwable -> L59
            r2.setProperty(r4, r5)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "result_systemWebviewForceUsed"
            boolean r5 = r7.d     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch: java.lang.Throwable -> L59
            r2.setProperty(r4, r5)     // Catch: java.lang.Throwable -> L59
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L59
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L59
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L59
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L59
            r2.store(r0, r1)     // Catch: java.lang.Throwable -> L53
            r3.close()     // Catch: java.lang.Exception -> L41
            goto L45
        L41:
            r1 = move-exception
            r1.printStackTrace()
        L45:
            r0.close()     // Catch: java.lang.Exception -> L49
            return
        L49:
            r0 = move-exception
            r0.printStackTrace()
            return
        L4e:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L79
        L53:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L5b
        L57:
            r0 = move-exception
            goto L79
        L59:
            r0 = move-exception
            r2 = r1
        L5b:
            r1 = r3
            goto L62
        L5d:
            r0 = move-exception
            r3 = r1
            goto L79
        L60:
            r0 = move-exception
            r2 = r1
        L62:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L76
            r1.close()     // Catch: java.lang.Exception -> L69
            goto L6d
        L69:
            r0 = move-exception
            r0.printStackTrace()
        L6d:
            r2.close()     // Catch: java.lang.Exception -> L71
            return
        L71:
            r0 = move-exception
            r0.printStackTrace()
            return
        L76:
            r0 = move-exception
            r3 = r1
            r1 = r2
        L79:
            r3.close()     // Catch: java.lang.Exception -> L7d
            goto L81
        L7d:
            r2 = move-exception
            r2.printStackTrace()
        L81:
            r1.close()     // Catch: java.lang.Exception -> L85
            goto L89
        L85:
            r1 = move-exception
            r1.printStackTrace()
        L89:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.o.c():void");
    }
}
