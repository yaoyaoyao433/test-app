package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public class p {
    private static p d;
    private FileLock f;
    private FileOutputStream g;
    private static final ReentrantLock i = new ReentrantLock();
    private static final Lock j = new ReentrantLock();
    private static FileLock l = null;
    public static ThreadLocal<Integer> a = new ThreadLocal<Integer>() { // from class: com.tencent.smtt.sdk.p.1
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public final Integer initialValue() {
            return 0;
        }
    };
    private static Handler m = null;
    private static final Long[][] n = {new Long[]{44006L, 39094008L}, new Long[]{44005L, 39094008L}, new Long[]{43910L, 38917816L}, new Long[]{44027L, 39094008L}, new Long[]{44028L, 39094008L}, new Long[]{44029L, 39094008L}, new Long[]{44030L, 39094008L}, new Long[]{44032L, 39094008L}, new Long[]{44033L, 39094008L}, new Long[]{44034L, 39094008L}, new Long[]{43909L, 38917816L}};
    static boolean b = false;
    static final FileFilter c = new FileFilter() { // from class: com.tencent.smtt.sdk.p.2
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (name == null || name.endsWith(".jar_is_first_load_dex_flag_file")) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 21 || !name.endsWith(".dex")) {
                if (Build.VERSION.SDK_INT < 26 || !name.endsWith(".prof")) {
                    return Build.VERSION.SDK_INT < 26 || !name.equals("oat");
                }
                return false;
            }
            return false;
        }
    };
    private static int o = 0;
    private static boolean p = false;
    private int e = 0;
    private boolean h = false;
    private boolean k = false;

    private p() {
        if (m == null) {
            m = new Handler(o.a().getLooper()) { // from class: com.tencent.smtt.sdk.p.3
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    QbSdk.setTBSInstallingStatus(true);
                    switch (message.what) {
                        case 1:
                            TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE");
                            Object[] objArr = (Object[]) message.obj;
                            p.this.b((Context) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue());
                            return;
                        case 2:
                            TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_COPY_TBS_CORE");
                            Object[] objArr2 = (Object[]) message.obj;
                            p.this.a((Context) objArr2[0], (Context) objArr2[1], ((Integer) objArr2[2]).intValue());
                            return;
                        case 3:
                            TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE_EX");
                            Object[] objArr3 = (Object[]) message.obj;
                            p.this.b((Context) objArr3[0], (Bundle) objArr3[1]);
                            return;
                        case 4:
                            TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_UNZIP_TBS_CORE");
                            Object[] objArr4 = (Object[]) message.obj;
                            p.this.b((Context) objArr4[0], (File) objArr4[1], ((Integer) objArr4[2]).intValue());
                            QbSdk.setTBSInstallingStatus(false);
                            super.handleMessage(message);
                            return;
                        default:
                            return;
                    }
                }
            };
        }
    }

    private void A(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy");
        if (!x(context)) {
            TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
            return;
        }
        try {
            B(context);
            D(context);
            if (TbsShareManager.isThirdPartyApp(context)) {
                TbsShareManager.writeCoreInfoForThirdPartyApp(context, n(context), true);
            } else {
                TbsShareManager.a(context);
            }
            n.a(context).a(0, 3);
            n.a(context).a("tpatch_num", 0);
            if (!TbsShareManager.isThirdPartyApp(context)) {
                int i2 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
                if (i2 <= 0 || i2 == a().i(context) || i2 != a().j(context)) {
                    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy #1 deCoupleCoreVersion is " + i2 + " getTbsCoreShareDecoupleCoreVersion is " + a().i(context) + " getTbsCoreInstalledVerInNolock is " + a().j(context));
                } else {
                    o(context);
                }
            }
            a.set(0);
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.RENAME_EXCEPTION, "exception when renameing from copy:" + e.toString());
        }
        h(context);
    }

    private void B(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--deleteOldCore");
        FileUtil.a(r(context), false);
    }

    private void C(Context context) {
        TbsLogReport tbsLogReport;
        int i2;
        TbsLog.i("TbsInstaller", "TbsInstaller--renameShareDir");
        File f = f(context, 0);
        File r = r(context);
        if (f == null || r == null) {
            TbsLog.i("TbsInstaller", "renameTbsCoreShareDir return,tmpTbsCoreUnzipDir=" + f + "tbsSharePath=" + r);
            return;
        }
        boolean renameTo = f.renameTo(r);
        TbsLog.i("TbsInstaller", "renameTbsCoreShareDir rename success=" + renameTo);
        com.tencent.smtt.utils.r.a("8is" + renameTo);
        if (context != null && "com.tencent.mm".equals(context.getApplicationContext().getApplicationInfo().packageName)) {
            if (renameTo) {
                tbsLogReport = TbsLogReport.getInstance(context);
                i2 = TbsListener.ErrorCode.RENAME_SUCCESS;
            } else {
                tbsLogReport = TbsLogReport.getInstance(context);
                i2 = TbsListener.ErrorCode.RENAME_FAIL;
            }
            tbsLogReport.setInstallErrorCode(i2, StringUtil.SPACE);
        }
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #07");
        g(context, false);
    }

    private void D(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--renameTbsCoreCopyDir");
        File f = f(context, 1);
        File r = r(context);
        if (f == null || r == null) {
            return;
        }
        f.renameTo(r);
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #08");
        g(context, false);
    }

    private void E(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--renameTbsTpatchCoreDir");
        File f = f(context, 5);
        File r = r(context);
        if (f == null || r == null) {
            return;
        }
        f.renameTo(r);
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #09");
        g(context, false);
    }

    private void F(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--clearNewTbsCore");
        File f = f(context, 0);
        if (f != null) {
            FileUtil.a(f, false);
        }
        n.a(context).c(0, 5);
        n.a(context).c(-1);
        QbSdk.a(context, "TbsInstaller::clearNewTbsCore forceSysWebViewInner!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            if (d == null) {
                synchronized (p.class) {
                    if (d == null) {
                        d = new p();
                    }
                }
            }
            pVar = d;
        }
        return pVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void a(int r5, java.lang.String r6, android.content.Context r7) {
        /*
            r4 = this;
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            r5.delete()
            java.lang.String r5 = "TbsInstaller"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Local tbs apk("
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = ") is deleted!"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 1
            com.tencent.smtt.utils.TbsLog.i(r5, r6, r0)
            java.io.File r5 = com.tencent.smtt.sdk.QbSdk.getTbsFolderDir(r7)
            java.io.File r6 = new java.io.File
            java.lang.String r7 = "core_unzip_tmp"
            r6.<init>(r5, r7)
            boolean r5 = r6.canRead()
            if (r5 == 0) goto Lb3
            java.io.File r5 = new java.io.File
            java.lang.String r7 = "tbs.conf"
            r5.<init>(r6, r7)
            java.util.Properties r6 = new java.util.Properties
            r6.<init>()
            r7 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L83
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L83
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L83
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L83
            r6.load(r2)     // Catch: java.lang.Throwable -> L7e
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L7e
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "tbs_local_installation"
            java.lang.String r3 = "true"
            r6.setProperty(r1, r3)     // Catch: java.lang.Throwable -> L7b
            r6.store(r5, r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = "TbsInstaller"
            java.lang.String r7 = "TBS_LOCAL_INSTALLATION is set!"
            com.tencent.smtt.utils.TbsLog.i(r6, r7, r0)     // Catch: java.lang.Throwable -> L7b
            r5.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r5 = move-exception
            r5.printStackTrace()
        L6f:
            r2.close()     // Catch: java.io.IOException -> L73
            return
        L73:
            r5 = move-exception
            r5.printStackTrace()
            return
        L78:
            r6 = move-exception
            r7 = r5
            goto L9e
        L7b:
            r6 = move-exception
            r7 = r5
            goto L85
        L7e:
            r6 = move-exception
            goto L85
        L80:
            r6 = move-exception
            r2 = r7
            goto L9e
        L83:
            r6 = move-exception
            r2 = r7
        L85:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L9d
            if (r7 == 0) goto L92
            r7.close()     // Catch: java.io.IOException -> L8e
            goto L92
        L8e:
            r5 = move-exception
            r5.printStackTrace()
        L92:
            if (r2 == 0) goto Lb3
            r2.close()     // Catch: java.io.IOException -> L98
            return
        L98:
            r5 = move-exception
            r5.printStackTrace()
            return
        L9d:
            r6 = move-exception
        L9e:
            if (r7 == 0) goto La8
            r7.close()     // Catch: java.io.IOException -> La4
            goto La8
        La4:
            r5 = move-exception
            r5.printStackTrace()
        La8:
            if (r2 == 0) goto Lb2
            r2.close()     // Catch: java.io.IOException -> Lae
            goto Lb2
        Lae:
            r5 = move-exception
            r5.printStackTrace()
        Lb2:
            throw r6
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p.a(int, java.lang.String, android.content.Context):void");
    }

    public static void a(Context context) {
        String str;
        String str2;
        if (w(context)) {
            return;
        }
        if (a(context, "core_unzip_tmp")) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_UNZIP_FOLDER_NAME"));
            str = "TbsInstaller";
            str2 = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_UNZIP_FOLDER_NAME";
        } else if (!a(context, "core_share_backup_tmp")) {
            if (a(context, "core_copy_tmp")) {
                TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_COPY_FOLDER_NAME"));
                TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_COPY_FOLDER_NAME");
                return;
            }
            return;
        } else {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_BACKUP_TBSCORE_FOLDER_NAME"));
            str = "TbsInstaller";
            str2 = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_BACKUP_TBSCORE_FOLDER_NAME";
        }
        TbsLog.e(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0452, code lost:
        if (r4 == r7) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ef A[Catch: Exception -> 0x0511, all -> 0x053f, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03f7 A[Catch: Exception -> 0x0511, all -> 0x053f, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0409 A[Catch: Exception -> 0x0511, all -> 0x053f, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0418 A[Catch: Exception -> 0x0511, all -> 0x053f, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0462 A[Catch: Exception -> 0x0511, all -> 0x053f, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046c A[Catch: Exception -> 0x0511, all -> 0x053f, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0495 A[Catch: Exception -> 0x0511, all -> 0x053f, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x049e A[Catch: Exception -> 0x0511, all -> 0x053f, TRY_LEAVE, TryCatch #2 {Exception -> 0x0511, blocks: (B:75:0x0219, B:77:0x0241, B:78:0x0244, B:80:0x0260, B:82:0x0269, B:97:0x02c6, B:119:0x02ef, B:120:0x02fd, B:122:0x0300, B:124:0x030e, B:126:0x031a, B:128:0x0326, B:130:0x032c, B:132:0x0338, B:134:0x034e, B:136:0x0354, B:137:0x0371, B:140:0x039f, B:143:0x03b6, B:146:0x03e0, B:148:0x03f7, B:150:0x03fd, B:154:0x040f, B:156:0x0418, B:159:0x0454, B:153:0x0409, B:160:0x0457, B:162:0x0462, B:163:0x0468, B:165:0x0473, B:167:0x0495, B:173:0x04be, B:174:0x04d5, B:168:0x049e, B:164:0x046c, B:138:0x039a, B:101:0x02cc, B:179:0x04de, B:184:0x04e7, B:183:0x04e4, B:112:0x02e3, B:116:0x02e9, B:185:0x04e8, B:189:0x0516, B:191:0x052a), top: B:213:0x0215 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r22, android.content.Context r23, int r24) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p.a(android.content.Context, android.content.Context, int):void");
    }

    private boolean a(Context context, File file, boolean z) {
        TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs start isDecoupleCore is " + z);
        if (!FileUtil.c(file)) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.APK_INVALID, "apk is invalid!");
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-520);
            return false;
        }
        try {
            File tbsFolderDir = QbSdk.getTbsFolderDir(context);
            File file2 = z ? new File(tbsFolderDir, "core_share_decouple") : new File(tbsFolderDir, "core_unzip_tmp");
            if (file2.exists() && !TbsDownloader.a(context)) {
                FileUtil.b(file2);
            }
        } catch (Throwable th) {
            TbsLog.e("TbsInstaller", "TbsInstaller-unzipTbs -- delete unzip folder if exists exception" + Log.getStackTraceString(th));
        }
        File f = z ? f(context, 2) : f(context, 0);
        if (f == null) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_DIR_ERROR, "tmp unzip dir is null!");
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-521);
            return false;
        }
        boolean z2 = true;
        try {
            FileUtil.a(f);
            if (z) {
                FileUtil.a(f, true);
            }
            boolean a2 = FileUtil.a(file, f);
            if (a2) {
                a2 = a(f, context);
            }
            if (z) {
                for (String str : f.list()) {
                    File file3 = new File(f, str);
                    if (file3.getName().endsWith(".dex")) {
                        file3.delete();
                    }
                }
                try {
                    new File(t(context), "x5.tbs").delete();
                } catch (Exception unused) {
                }
            }
            if (a2) {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #05");
                g(context, true);
                if (z) {
                    File q = q(context);
                    FileUtil.a(q, true);
                    f.renameTo(q);
                    TbsShareManager.b(context);
                }
            } else {
                FileUtil.b(f);
                TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-522);
                TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#1! exist:" + f.exists());
            }
            return a2;
        } catch (IOException e) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_IO_ERROR, e);
            if (((f == null || !f.exists()) ? false : false) && f != null) {
                try {
                    FileUtil.b(f);
                    TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + f.exists());
                } catch (Throwable th2) {
                    TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:" + Log.getStackTraceString(th2));
                }
            }
            return false;
        } catch (Exception e2) {
            TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_OTHER_ERROR, e2);
            if (((f == null || !f.exists()) ? false : false) && f != null) {
                try {
                    FileUtil.b(f);
                    TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + f.exists());
                } catch (Throwable th3) {
                    TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:" + Log.getStackTraceString(th3));
                }
            }
            return false;
        } finally {
            TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs done");
            com.tencent.smtt.utils.r.a("11");
        }
    }

    static boolean a(Context context, String str) {
        String str2;
        StringBuilder sb;
        File file = new File(QbSdk.getTbsFolderDir(context), str);
        if (!file.exists()) {
            str2 = "TbsInstaller";
            sb = new StringBuilder("#1# ");
        } else if (new File(file, "tbs.conf").exists()) {
            TbsLog.i("TbsInstaller", "isPrepareTbsCore", "#3# " + str);
            return true;
        } else {
            str2 = "TbsInstaller";
            sb = new StringBuilder("#2# ");
        }
        sb.append(str);
        TbsLog.i(str2, "isPrepareTbsCore", sb.toString());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.File r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p.a(java.io.File, android.content.Context):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Context r17, java.lang.String r18, int r19) {
        /*
            Method dump skipped, instructions count: 1697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p.b(android.content.Context, java.lang.String, int):void");
    }

    private boolean b(Context context, File file) {
        return a(context, file, false);
    }

    private int c(Context context, Bundle bundle) {
        int i2;
        int i3;
        int a2;
        TbsLogReport tbsLogReport;
        int i4;
        String str;
        TbsDownloadConfig tbsDownloadConfig;
        try {
            Bundle a3 = QbSdk.a(context, bundle);
            TbsLog.i("TbsInstaller", "tpatch finished,ret is" + a3);
            i2 = a3.getInt("patch_result");
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, "patch exception" + Log.getStackTraceString(e));
        }
        if (i2 != 0) {
            String string = bundle.getString("new_apk_location");
            if (!TextUtils.isEmpty(string)) {
                FileUtil.b(new File(string));
            }
            TbsLogReport.getInstance(context).setInstallErrorCode(i2, "tpatch fail,patch error_code=" + i2);
            return 1;
        }
        String string2 = bundle.getString("new_apk_location");
        int i5 = bundle.getInt("new_core_ver");
        try {
            i3 = bundle.getInt("for_stable_core");
        } catch (Throwable unused) {
            i3 = 0;
        }
        if (i3 == 1) {
            File file = new File(FileUtil.a(context, "com.tencent.mm", 4, true));
            int i6 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_CPUTYPE_OTHER_STABLE_CORE, 0);
            File[] listFiles = file.listFiles();
            Pattern compile = Pattern.compile(com.tencent.smtt.utils.a.a(false, i6));
            for (File file2 : listFiles) {
                if (compile.matcher(file2.getName()).find() && file2.isFile() && file2.exists()) {
                    file2.delete();
                }
            }
            File file3 = new File(file, com.tencent.smtt.utils.a.a(false, i6) + CommonConstant.Symbol.DOT + tbsDownloadConfig.mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0));
            if (!file3.exists()) {
                file3.createNewFile();
            }
            a2 = TbsShareManager.getTbsStableCoreVersion(context, i6);
            com.tencent.smtt.utils.r.b(context, "tpatch_mid_bundle_ok", ("patchVersion=is=" + a2) + "_targetVersion=is=" + i5);
        } else {
            a2 = a(new File(string2));
            if (TbsShareManager.isThirdPartyApp(context)) {
                com.tencent.smtt.utils.r.a(context, "tpatch_mid_bundle_ok", ("patchVersion=is=" + a2) + "_targetVersion=is=" + i5);
            }
        }
        TbsLog.i("TbsInstaller", "doTpatch wholeFile is " + i3 + " version is " + i5 + " patchVersion is " + a2);
        if (i5 != a2) {
            TbsLog.i("TbsInstaller", "version not equals!!!" + i5 + "patchVersion:" + a2);
            TbsLogReport.getInstance(context).setInstallErrorCode(240, "version=" + i5 + ",patchVersion=" + a2);
            return 1;
        }
        if (i3 == 1) {
            com.tencent.smtt.utils.r.b(context, "tpatch_last_bundle_ok", "coreversion=is=" + a2);
        }
        if (TbsShareManager.isThirdPartyApp(context)) {
            com.tencent.smtt.utils.r.a(context, "tpatch_last_bundle_ok", "coreversion=is=" + a2);
        }
        if (TbsDownloader.a(context)) {
            TbsLog.i("TbsInstaller", "Tpatch decouple success!");
            tbsLogReport = TbsLogReport.getInstance(context);
            i4 = TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS;
            str = "";
        } else {
            TbsLog.i("TbsInstaller", "Tpatch success!");
            tbsLogReport = TbsLogReport.getInstance(context);
            i4 = TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS;
            str = "";
        }
        tbsLogReport.setInstallErrorCode(i4, str);
        return 0;
    }

    private boolean c(Context context, File file) {
        try {
            File[] listFiles = file.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.p.5
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2.getName().endsWith(".jar");
                }
            });
            int length = listFiles.length;
            if (Build.VERSION.SDK_INT < 16 && context.getPackageName() != null && context.getPackageName().equalsIgnoreCase(TbsConfig.APP_DEMO)) {
                try {
                    Thread.sleep(MetricsAnrManager.ANR_THRESHOLD);
                } catch (Exception unused) {
                }
            }
            ClassLoader classLoader = context.getClassLoader();
            for (int i2 = 0; i2 < length; i2++) {
                TbsLog.i("TbsInstaller", "jarFile: " + listFiles[i2].getAbsolutePath());
                new DexClassLoader(listFiles[i2].getAbsolutePath(), file.getAbsolutePath(), null, classLoader);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOPT_EXCEPTION, e.toString());
            TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            return false;
        }
    }

    private synchronized boolean c(Context context, boolean z) {
        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch");
        boolean z2 = false;
        if (u(context)) {
            boolean tryLock = i.tryLock();
            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch Locked =" + tryLock);
            if (tryLock) {
                try {
                    int b2 = n.a(context).b("tpatch_status");
                    int a2 = a(false, context);
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch copyStatus =" + b2);
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer =" + a2);
                    if (b2 == 1) {
                        if (a2 == 0) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer = 0", true);
                        } else if (z) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer != 0", true);
                        }
                        z(context);
                        z2 = true;
                    }
                    i.unlock();
                } catch (Throwable th) {
                    i.unlock();
                    throw th;
                }
            }
            b();
            return z2;
        }
        return false;
    }

    private boolean d(Context context, File file) {
        File[] listFiles;
        try {
            File file2 = new File(file, "tbs_sdk_extension_dex.jar");
            File file3 = new File(file, "tbs_sdk_extension_dex.dex");
            new DexClassLoader(file2.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
            String a2 = f.a(context, file3.getAbsolutePath());
            if (TextUtils.isEmpty(a2)) {
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOAT_EXCEPTION, "can not find oat command");
                return false;
            }
            for (File file4 : file.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.p.6
                @Override // java.io.FileFilter
                public boolean accept(File file5) {
                    return file5.getName().endsWith(".jar");
                }
            })) {
                String substring = file4.getName().substring(0, file4.getName().length() - 4);
                Runtime.getRuntime().exec("/system/bin/dex2oat " + a2.replaceAll("tbs_sdk_extension_dex", substring) + " --dex-location=" + a().r(context) + File.separator + substring + ".jar").waitFor();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOAT_EXCEPTION, e);
            return false;
        }
    }

    private synchronized boolean d(Context context, boolean z) {
        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy");
        boolean z2 = false;
        if (u(context)) {
            boolean tryLock = i.tryLock();
            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy Locked =" + tryLock);
            if (tryLock) {
                try {
                    int b2 = n.a(context).b("copy_status");
                    int a2 = a(false, context);
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy copyStatus =" + b2);
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy tbsCoreInstalledVer =" + a2);
                    if (b2 == 1) {
                        if (a2 == 0) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy tbsCoreInstalledVer = 0", true);
                        } else if (z) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromCopy tbsCoreInstalledVer != 0", true);
                        }
                        A(context);
                        z2 = true;
                    }
                    i.unlock();
                } catch (Throwable th) {
                    i.unlock();
                    throw th;
                }
            }
            b();
            return z2;
        }
        return false;
    }

    private boolean e(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    private synchronized boolean e(Context context, boolean z) {
        if (context != null) {
            if ("com.tencent.mm".equals(context.getApplicationContext().getApplicationInfo().packageName)) {
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.INSTALL_FROM_UNZIP, StringUtil.SPACE);
            }
        }
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "canRenameTmpDir =" + z);
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#1#");
        boolean z2 = false;
        try {
        } catch (Exception e) {
            QbSdk.a(context, "TbsInstaller::enableTbsCoreFromUnzip Exception: " + e);
            e.printStackTrace();
        }
        if (u(context)) {
            TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#2# getInstallFileLock Success!!");
            boolean tryLock = i.tryLock();
            TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "locked=" + tryLock);
            if (tryLock) {
                try {
                    int c2 = n.a(context).c();
                    TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip installStatus=" + c2);
                    int a2 = a(false, context);
                    if (c2 == 2) {
                        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#4# In Rename Logic");
                        if (a2 == 0) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer = 0", false);
                        } else if (z) {
                            TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer != 0", false);
                        }
                        y(context);
                        z2 = true;
                    }
                    i.unlock();
                } catch (Throwable th) {
                    i.unlock();
                    throw th;
                }
            }
            b();
            return z2;
        }
        return false;
    }

    private synchronized boolean f(Context context, boolean z) {
        return false;
    }

    private void g(Context context, boolean z) {
        if (context == null) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, "setTmpFolderCoreToRead context is null");
            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner return #01");
            return;
        }
        try {
            File file = new File(QbSdk.getTbsFolderDir(context), "tmp_folder_core_to_read.conf");
            if (!z) {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file delete #01");
                FileUtil.b(file);
            } else if (file.exists()) {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file already exist #01");
            } else {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file create #01");
                file.createNewFile();
            }
        } catch (Exception e) {
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, "setTmpFolderCoreToRead Exception message is " + e.getMessage() + " Exception cause is " + e.getCause());
            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner exception #01");
        }
    }

    private void h(Context context, int i2) {
        TbsLog.i("TbsInstaller", "proceedTpatchStatus,result=" + i2);
        if (i2 == 0) {
            if (TbsDownloader.a(context)) {
                i(context, 6);
            } else {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #03");
                g(context, true);
                n.a(context).b(TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0), 1);
            }
        }
        QbSdk.setTBSInstallingStatus(false);
    }

    private void i(Context context, int i2) {
        File f = a().f(context, i2);
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #06");
        a().g(context, true);
        File q = q(context);
        FileUtil.a(q, true);
        f.renameTo(q);
        TbsShareManager.b(context);
    }

    private boolean j(Context context, int i2) {
        File f;
        boolean z;
        TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt start - dirMode: " + i2);
        boolean z2 = false;
        try {
            switch (i2) {
                case 0:
                    if (!TbsDownloader.a(context)) {
                        f = f(context, 0);
                        break;
                    } else {
                        return true;
                    }
                case 1:
                    f = f(context, 1);
                    break;
                case 2:
                    f = r(context);
                    break;
                default:
                    TbsLog.e("TbsInstaller", "doDexoptOrDexoat mode error: " + i2);
                    return false;
            }
            String property = System.getProperty("java.vm.version");
            z = property != null && property.startsWith("2");
            boolean z3 = Build.VERSION.SDK_INT == 23;
            boolean z4 = TbsDownloadConfig.getInstance(context).mPreferences.getBoolean(TbsDownloadConfig.TbsConfigKey.KEY_STOP_PRE_OAT, false);
            if (z && z3 && !z4) {
                z2 = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOPT_EXCEPTION, e.toString());
        }
        if (z2 && d(context, f)) {
            TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoatForArtVm");
            return true;
        } else if (!z) {
            TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoptForDavlikVM");
            return c(context, f);
        } else {
            TbsLog.i("TbsInstaller", "doTbsDexOpt -- is ART mode, skip!");
            TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File t(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_private");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    private int v(Context context) {
        boolean z = n.a(context).d() == 1;
        boolean a2 = TbsDownloader.a(context);
        if (z) {
            return a2 ? TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS : TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS;
        } else if (a2) {
            return TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS;
        } else {
            return 200;
        }
    }

    private static boolean w(Context context) {
        String str;
        String str2;
        if (context == null) {
            str = "TbsInstaller";
            str2 = "#1#";
        } else {
            try {
                if (new File(QbSdk.getTbsFolderDir(context), "tmp_folder_core_to_read.conf").exists()) {
                    TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", "#2#");
                    return true;
                }
                TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", "#3#");
                return false;
            } catch (Exception unused) {
                str = "TbsInstaller";
                str2 = "#4#";
            }
        }
        TbsLog.i(str, "getTmpFolderCoreToRead", str2);
        return true;
    }

    private boolean x(Context context) {
        TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock #1 ");
        FileLock f = FileUtil.f(context);
        l = f;
        if (f == null) {
            TbsLog.i("TbsInstaller", "getTbsCoreRenameFileLock## failed!");
            return false;
        }
        TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock true ");
        return true;
    }

    private void y(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip");
        if (!x(context)) {
            TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
            return;
        }
        try {
            B(context);
            C(context);
            TbsLog.i("TbsInstaller", "after renameTbsCoreShareDir");
            if (TbsShareManager.isThirdPartyApp(context)) {
                TbsLog.i("TbsInstaller", "is thirdapp and not chmod");
            } else {
                TbsLog.i("TbsInstaller", "prepare to shareTbsCore");
                TbsShareManager.a(context);
            }
            n.a(context).a(0);
            n.a(context).b(0);
            n.a(context).d(0);
            n.a(context).a("incrupdate_retry_num", 0);
            n.a(context).c(0, 3);
            n.a(context).a("");
            n.a(context).a("tpatch_num", 0);
            n.a(context).c(-1);
            if (!TbsShareManager.isThirdPartyApp(context)) {
                int i2 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
                if (i2 <= 0 || i2 == a().i(context) || i2 != a().j(context)) {
                    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip #1 deCoupleCoreVersion is " + i2 + " getTbsCoreShareDecoupleCoreVersion is " + a().i(context) + " getTbsCoreInstalledVerInNolock is " + a().j(context));
                } else {
                    o(context);
                }
            }
            if (TbsShareManager.isThirdPartyApp(context)) {
                TbsShareManager.writeCoreInfoForThirdPartyApp(context, n(context), true);
            }
            a.set(0);
            o = 0;
        } catch (Throwable th) {
            th.printStackTrace();
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.RENAME_EXCEPTION, "exception when renameing from unzip:" + th.toString());
            TbsLog.e("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip Exception", true);
        }
        h(context);
    }

    private void z(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromTpatch");
        if (!x(context)) {
            TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
            return;
        }
        try {
            B(context);
            E(context);
            if (TbsShareManager.isThirdPartyApp(context)) {
                TbsShareManager.writeCoreInfoForThirdPartyApp(context, n(context), true);
            } else {
                TbsShareManager.a(context);
            }
            n.a(context).b(0, -1);
            n.a(context).a("tpatch_num", 0);
            a.set(0);
        } catch (Exception e) {
            e.printStackTrace();
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, "exception when renameing from tpatch:" + e.toString());
        }
        h(context);
    }

    int a(File file) {
        BufferedInputStream bufferedInputStream = null;
        try {
            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsVersion  tbsShareDir is " + file);
            File file2 = new File(file, "tbs.conf");
            if (file2.exists()) {
                Properties properties = new Properties();
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                try {
                    properties.load(bufferedInputStream2);
                    bufferedInputStream2.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        return 0;
                    }
                    int parseInt = Integer.parseInt(property);
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    return parseInt;
                } catch (Exception unused3) {
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
            }
            return 0;
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(String str) {
        BufferedInputStream bufferedInputStream;
        if (str == null) {
            return 0;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            File file = new File(new File(str), "tbs.conf");
            if (file.exists()) {
                Properties properties = new Properties();
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused) {
                        }
                        return 0;
                    }
                    int parseInt = Integer.parseInt(property);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                    return parseInt;
                } catch (Exception unused3) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
            }
            return 0;
        } catch (Exception unused6) {
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int a(boolean z, Context context) {
        if (z || a.get().intValue() <= 0) {
            a.set(Integer.valueOf(j(context)));
        }
        return a.get().intValue();
    }

    File a(Context context, int i2, boolean z) {
        String str;
        String str2;
        File tbsFolderDir = QbSdk.getTbsFolderDir(context);
        String str3 = "";
        switch (i2) {
            case 0:
                str3 = "core_unzip_tmp";
                break;
            case 1:
                str3 = "core_copy_tmp";
                break;
            case 2:
                str3 = "core_unzip_tmp_decouple";
                break;
            case 3:
                str3 = "core_share_backup";
                break;
            case 4:
                str3 = "core_share_backup_tmp";
                break;
            case 5:
                str3 = "tpatch_tmp";
                break;
            case 6:
                str3 = "tpatch_decouple_tmp";
                break;
        }
        TbsLog.i("TbsInstaller", "type=" + i2 + "needMakeDir=" + z + "folder=" + str3);
        File file = new File(tbsFolderDir, str3);
        if (!file.isDirectory()) {
            if (!z) {
                str = "TbsInstaller";
                str2 = "getCoreDir,no need mkdir";
            } else if (!file.mkdir()) {
                str = "TbsInstaller";
                str2 = "getCoreDir,mkdir false";
            }
            TbsLog.i(str, str2);
            return null;
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File a(Context context, File file) {
        File file2 = new File(file, "core_share_decouple");
        if (file2.isDirectory() || file2.mkdir()) {
            return file2;
        }
        return null;
    }

    public void a(Context context, int i2) {
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #01 ");
        g(context, true);
        n.a(context).c(i2, 2);
    }

    void a(Context context, Bundle bundle) {
        if (bundle == null || context == null) {
            return;
        }
        Object[] objArr = {context, bundle};
        Message message = new Message();
        message.what = 3;
        message.obj = objArr;
        m.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, File file, int i2) {
        TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmp,ctx=" + context + "File=" + file + "coreVersion=" + i2);
        if (file == null || context == null) {
            return;
        }
        Object[] objArr = {context, file, Integer.valueOf(i2)};
        Message message = new Message();
        message.what = 4;
        message.obj = objArr;
        m.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, String str, int i2) {
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsApkPath=" + str);
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsCoreTargetVer=" + i2);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentThreadName=" + Thread.currentThread().getName());
        Object[] objArr = {context, str, Integer.valueOf(i2)};
        Message message = new Message();
        message.what = 1;
        message.obj = objArr;
        m.sendMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context, boolean z) {
        int b2;
        String d2;
        int c2;
        int b3;
        boolean z2 = true;
        if (z) {
            this.k = true;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentThreadName=" + Thread.currentThread().getName());
        if (u(context)) {
            int i2 = -1;
            if (i.tryLock()) {
                try {
                    i2 = n.a(context).c();
                    b2 = n.a(context).b();
                    d2 = n.a(context).d("install_apk_path");
                    c2 = n.a(context).c("copy_core_ver");
                    b3 = n.a(context).b("copy_status");
                } finally {
                    i.unlock();
                }
            } else {
                d2 = null;
                b2 = 0;
                c2 = 0;
                b3 = -1;
            }
            b();
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore installStatus=" + i2);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreInstallVer=" + b2);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsApkPath=" + d2);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreCopyVer=" + c2);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore copyStatus=" + b3);
            if (TbsShareManager.isThirdPartyApp(context)) {
                c(context, TbsShareManager.a(context, false));
                return;
            }
            int i3 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
            if (i3 != 1 && i3 != 2 && i3 != 4) {
                z2 = false;
            }
            if (!z2 && i3 != 0 && i3 != 5) {
                Bundle bundle = new Bundle();
                bundle.putInt("operation", 10001);
                a(context, bundle);
            }
            if (i2 >= 0 && i2 < 2) {
                a(context, d2, b2);
            }
            if (b3 == 0) {
                b(context, c2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.smtt.sdk.p$4] */
    public synchronized boolean a(final Context context, final Context context2) {
        TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp");
        if (p) {
            return true;
        }
        p = true;
        new Thread() { // from class: com.tencent.smtt.sdk.p.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                p pVar;
                Context context3;
                File r;
                TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp thread start");
                try {
                    if (context2 == null) {
                        r = new File(TbsShareManager.getHostCorePathAppDefined());
                    } else {
                        if (!TbsShareManager.isThirdPartyApp(context)) {
                            pVar = p.this;
                            context3 = context2;
                        } else if (TbsShareManager.c(context) == null || !TbsShareManager.c(context).contains("decouple")) {
                            pVar = p.this;
                            context3 = context2;
                        } else {
                            r = p.this.q(context2);
                        }
                        r = pVar.r(context3);
                    }
                    File r2 = p.this.r(context);
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 != 19 && i2 < 21) {
                        FileUtil.a(r, r2, new FileFilter() { // from class: com.tencent.smtt.sdk.p.4.1
                            @Override // java.io.FileFilter
                            public boolean accept(File file) {
                                return file.getName().endsWith(".dex");
                            }
                        });
                    }
                    FileUtil.a(r, r2, new FileFilter() { // from class: com.tencent.smtt.sdk.p.4.2
                        @Override // java.io.FileFilter
                        public boolean accept(File file) {
                            return file.getName().endsWith("tbs.conf");
                        }
                    });
                    TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp thread done");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
        return true;
    }

    public boolean a(Context context, File[] fileArr) {
        return false;
    }

    public int b(Context context) {
        if (w(context)) {
            if (a(context, "core_unzip_tmp")) {
                return -1;
            }
            if (a(context, "core_share_backup_tmp")) {
                return -2;
            }
            if (a(context, "core_copy_tmp")) {
                return -3;
            }
            return a(context, "tpatch_tmp") ? -4 : 1;
        }
        return 0;
    }

    Context b(Context context, String str) {
        try {
            if (context.getPackageName() == str || !TbsPVConfig.getInstance(context).isEnableNoCoreGray()) {
                return context.createPackageContext(str, 2);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File b(Context context, Context context2) {
        File file = new File(QbSdk.getTbsFolderDir(context2), "core_share");
        if (file.isDirectory() || ((context != null && TbsShareManager.isThirdPartyApp(context)) || file.mkdir())) {
            return file;
        }
        TbsLog.i("TbsInstaller", "getTbsCoreShareDir,mkdir false");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        if (this.e <= 0) {
            TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock currentTbsFileLockStackCount=" + this.e + "call stack:" + Log.getStackTraceString(new Throwable()));
        } else if (this.e > 1) {
            TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock with skip");
            this.e--;
        } else {
            if (this.e == 1) {
                TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock without skip");
                FileUtil.a(this.f, this.g);
                this.e = 0;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x031a, Exception -> 0x031f, TryCatch #12 {Exception -> 0x031f, all -> 0x031a, blocks: (B:26:0x00cd, B:28:0x00d3, B:40:0x00ee, B:42:0x00fa, B:44:0x0119, B:45:0x0121, B:47:0x0127, B:48:0x012f, B:50:0x0135, B:51:0x013d, B:58:0x0175, B:60:0x0185, B:62:0x0193, B:103:0x02fe), top: B:212:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175 A[Catch: all -> 0x031a, Exception -> 0x031f, TRY_ENTER, TryCatch #12 {Exception -> 0x031f, all -> 0x031a, blocks: (B:26:0x00cd, B:28:0x00d3, B:40:0x00ee, B:42:0x00fa, B:44:0x0119, B:45:0x0121, B:47:0x0127, B:48:0x012f, B:50:0x0135, B:51:0x013d, B:58:0x0175, B:60:0x0185, B:62:0x0193, B:103:0x02fe), top: B:212:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0290  */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.tencent.smtt.sdk.p] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13, types: [int] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Context r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p.b(android.content.Context, android.os.Bundle):void");
    }

    public void b(Context context, File file, int i2) {
        FileOutputStream b2 = FileUtil.b(context, true, "core_unzip.lock");
        FileLock a2 = FileUtil.a(context, b2);
        if (a2 == null) {
            TbsLog.i("TbsInstaller", "can not get Core unzip FileLock,skip!!!");
            return;
        }
        TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread #1");
        boolean a3 = a(context, file, false);
        TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread result is " + a3);
        com.tencent.smtt.utils.r.a(context, "copy_host_core_v3", ("coreVersionIs" + i2) + "_ret=is=" + a3);
        if (a3) {
            a().a(context, i2);
        }
        FileUtil.a(a2, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context, boolean z) {
        if (QbSdk.b) {
            return;
        }
        if (Build.VERSION.SDK_INT < 8) {
            TbsLog.e("TbsInstaller", "android version < 2.1 no need install X5 core", true);
            return;
        }
        TbsLog.i("TbsInstaller", "installTbsCoreIfNeeded", "#1# check local x5core prepared to install");
        if (TbsShareManager.isThirdPartyApp(context) && n.a(context).b("remove_old_core") == 1 && z) {
            try {
                FileUtil.b(a().r(context));
                TbsLog.i("TbsInstaller", "installTbsCoreIfNeeded", "thirdAPP success--> delete old core_share Directory");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            n.a(context).a("remove_old_core", 0);
        }
        if (w(context)) {
            if (TbsShareManager.isThirdPartyApp(context)) {
                com.tencent.smtt.utils.r.a(context, "has_tmpfile_torename", "");
            }
            TbsLog.i("TbsInstaller", "installTbsCoreIfNeeded", "#2# try to install tbs core from tmp dir");
            if (a(context, "core_unzip_tmp") && e(context, z)) {
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromUnzip !!", true);
                if (TbsShareManager.isThirdPartyApp(context)) {
                    com.tencent.smtt.utils.r.a(context, "rename_ok", "enableTbsCoreFromUnzip");
                }
            } else if (a(context, "core_share_backup_tmp") && f(context, z)) {
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromBackup !!", true);
                if (TbsShareManager.isThirdPartyApp(context)) {
                    com.tencent.smtt.utils.r.a(context, "rename_ok", "enableTbsCoreFromBackup");
                }
            } else if (a(context, "core_copy_tmp") && d(context, z)) {
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromCopy !!", true);
                if (TbsShareManager.isThirdPartyApp(context)) {
                    com.tencent.smtt.utils.r.a(context, "rename_ok", "enableTbsCoreFromCopy");
                }
            } else if (!a(context, "tpatch_tmp") || !c(context, z)) {
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, error !!", true);
            } else {
                TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromTpatch !!", true);
                if (TbsShareManager.isThirdPartyApp(context)) {
                    com.tencent.smtt.utils.r.a(context, "rename_ok", "enableTbsCoreFromTpatch");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Context context, int i2) {
        if (TbsDownloader.getOverSea(context)) {
            return false;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore targetTbsCoreVer=" + i2);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentThreadName=" + Thread.currentThread().getName());
        Context d2 = d(context, i2);
        if (d2 == null) {
            TbsLog.i("TbsInstaller", "TbsInstaller--installLocalTbsCore copy from null");
            return false;
        }
        Object[] objArr = {d2, context, Integer.valueOf(i2)};
        Message message = new Message();
        message.what = 2;
        message.obj = objArr;
        m.sendMessage(message);
        return true;
    }

    int c(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.versionCode;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File c(Context context, Context context2) {
        File file = new File(QbSdk.getTbsFolderDir(context2), "core_share_decouple");
        if (file.isDirectory() || ((context != null && TbsShareManager.isThirdPartyApp(context)) || file.mkdir())) {
            return file;
        }
        return null;
    }

    public void c(Context context) {
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #02");
        g(context, true);
        n.a(context).c(i(context), 2);
    }

    void c(Context context, int i2) {
        int j2;
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreForThirdPartyApp");
        if (i2 > 0 && (j2 = j(context)) < i2) {
            Context e = TbsShareManager.e(context);
            if (e != null || TbsShareManager.getHostCorePathAppDefined() != null) {
                TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp hostContext != null");
                a(context, e);
            } else if (j2 <= 0) {
                TbsLog.i("TbsInstaller", "TbsInstaller--installTbsCoreForThirdPartyApp hostContext == null");
                QbSdk.a(context, "TbsInstaller::installTbsCoreForThirdPartyApp forceSysWebViewInner #2");
            }
        }
    }

    public Context d(Context context, int i2) {
        Context b2;
        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreHostContext tbsCoreTargetVer=" + i2);
        if (i2 <= 0) {
            return null;
        }
        String[] coreProviderAppList = TbsShareManager.getCoreProviderAppList();
        for (int i3 = 0; i3 < coreProviderAppList.length; i3++) {
            if (!context.getPackageName().equalsIgnoreCase(coreProviderAppList[i3]) && e(context, coreProviderAppList[i3]) && (b2 = b(context, coreProviderAppList[i3])) != null) {
                if (g(b2)) {
                    int j2 = j(b2);
                    TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext hostTbsCoreVer=" + j2);
                    if (j2 != 0 && j2 == i2) {
                        TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext targetApp=" + coreProviderAppList[i3]);
                        return b2;
                    }
                } else {
                    TbsLog.e("TbsInstaller", "TbsInstaller--getTbsCoreHostContext " + coreProviderAppList[i3] + " illegal signature go on next");
                }
            }
        }
        return null;
    }

    public String d(Context context, String str) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            File file = new File(r(context), "tbs.conf");
            if (file.exists()) {
                Properties properties = new Properties();
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    String property = properties.getProperty(str);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return property;
                } catch (Exception unused2) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
            return null;
        } catch (Exception unused5) {
            bufferedInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: IOException -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0071, blocks: (B:17:0x006d, B:31:0x0085), top: B:44:0x0019 }] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.content.Context r10) {
        /*
            r9 = this;
            java.io.File r10 = r9.r(r10)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "tbs.conf"
            r0.<init>(r10, r1)
            boolean r10 = r0.exists()
            r1 = 0
            if (r10 != 0) goto L13
            return r1
        L13:
            java.util.Properties r10 = new java.util.Properties
            r10.<init>()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L7e
            r10.load(r4)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "tbs_local_installation"
            java.lang.String r3 = "false"
            java.lang.String r10 = r10.getProperty(r2, r3)     // Catch: java.lang.Throwable -> L78
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L78
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L78
            r2 = 1
            if (r10 == 0) goto L4f
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4c
            long r7 = r0.lastModified()     // Catch: java.lang.Throwable -> L4c
            r0 = 0
            long r5 = r5 - r7
            r7 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L4f
            r1 = 1
            goto L4f
        L4c:
            r0 = move-exception
            r2 = r4
            goto L80
        L4f:
            java.lang.String r0 = "TbsInstaller"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = "TBS_LOCAL_INSTALLATION is:"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L4c
            r3.append(r10)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r5 = " expired="
            r3.append(r5)     // Catch: java.lang.Throwable -> L4c
            r3.append(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            com.tencent.smtt.utils.TbsLog.i(r0, r3)     // Catch: java.lang.Throwable -> L4c
            r0 = r1 ^ 1
            r10 = r10 & r0
            r4.close()     // Catch: java.io.IOException -> L71
            goto L88
        L71:
            r0 = move-exception
            r0.printStackTrace()
            goto L88
        L76:
            r10 = move-exception
            goto L89
        L78:
            r0 = move-exception
            r2 = r4
            goto L7f
        L7b:
            r10 = move-exception
            r4 = r2
            goto L89
        L7e:
            r0 = move-exception
        L7f:
            r10 = 0
        L80:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L88
            r2.close()     // Catch: java.io.IOException -> L71
        L88:
            return r10
        L89:
            if (r4 == 0) goto L93
            r4.close()     // Catch: java.io.IOException -> L8f
            goto L93
        L8f:
            r0 = move-exception
            r0.printStackTrace()
        L93:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p.d(android.content.Context):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(Context context, int i2) {
        return a(f(context, i2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void e(android.content.Context r6) {
        /*
            r5 = this;
            java.io.File r6 = r5.r(r6)     // Catch: java.lang.Throwable -> L5c
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = "tbs.conf"
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L5c
            java.util.Properties r6 = new java.util.Properties     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L51
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L51
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L51
            r6.load(r3)     // Catch: java.lang.Throwable -> L40
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L40
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L40
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "tbs_local_installation"
            java.lang.String r4 = "false"
            r6.setProperty(r2, r4)     // Catch: java.lang.Throwable -> L3c
            r6.store(r0, r1)     // Catch: java.lang.Throwable -> L3c
            r0.close()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L5c
        L35:
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L5c
        L39:
            r6 = move-exception
            r1 = r0
            goto L44
        L3c:
            r1 = r0
            goto L52
        L3e:
            r6 = move-exception
            goto L44
        L40:
            goto L52
        L42:
            r6 = move-exception
            r3 = r1
        L44:
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.io.IOException -> L4a
            goto L4b
        L4a:
        L4b:
            if (r3 == 0) goto L50
            r3.close()     // Catch: java.io.IOException -> L50
        L50:
            throw r6     // Catch: java.lang.Throwable -> L5c
        L51:
            r3 = r1
        L52:
            if (r1 == 0) goto L59
            r1.close()     // Catch: java.io.IOException -> L58
            goto L59
        L58:
        L59:
            if (r3 == 0) goto L5c
            goto L35
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.p.e(android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File f(Context context, int i2) {
        return a(context, i2, true);
    }

    public boolean f(Context context) {
        try {
            File file = new File(FileUtil.a(context, 4), TbsDownloader.getBackupFileName(true));
            File f = a().f(context, 2);
            FileUtil.a(f);
            FileUtil.a(f, true);
            FileUtil.a(file, f);
            for (String str : f.list()) {
                File file2 = new File(f, str);
                if (file2.getName().endsWith(".dex")) {
                    file2.delete();
                }
            }
            i(context, 2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(Context context) {
        if (TbsShareManager.getHostCorePathAppDefined() != null) {
            return true;
        }
        try {
            Signature signature = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0];
            if (context.getPackageName().equals(TbsConfig.APP_QB)) {
                if (!signature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
                    return false;
                }
            } else if (context.getPackageName().equals("com.tencent.mm")) {
                if (!signature.toCharsString().equals("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499")) {
                    return false;
                }
            } else if (context.getPackageName().equals("com.tencent.mobileqq")) {
                if (!signature.toCharsString().equals("30820253308201bca00302010202044bbb0361300d06092a864886f70d0101050500306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b30090603550403130251513020170d3130303430363039343831375a180f32323834303132303039343831375a306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b300906035504031302515130819f300d06092a864886f70d010101050003818d0030818902818100a15e9756216f694c5915e0b529095254367c4e64faeff07ae13488d946615a58ddc31a415f717d019edc6d30b9603d3e2a7b3de0ab7e0cf52dfee39373bc472fa997027d798d59f81d525a69ecf156e885fd1e2790924386b2230cc90e3b7adc95603ddcf4c40bdc72f22db0f216a99c371d3bf89cba6578c60699e8a0d536950203010001300d06092a864886f70d01010505000381810094a9b80e80691645dd42d6611775a855f71bcd4d77cb60a8e29404035a5e00b21bcc5d4a562482126bd91b6b0e50709377ceb9ef8c2efd12cc8b16afd9a159f350bb270b14204ff065d843832720702e28b41491fbc3a205f5f2f42526d67f17614d8a974de6487b2c866efede3b4e49a0f916baa3c1336fd2ee1b1629652049")) {
                    return false;
                }
            } else if (context.getPackageName().equals(TbsConfig.APP_DEMO)) {
                if (!signature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a")) {
                    return false;
                }
            } else if (context.getPackageName().equals("com.qzone")) {
                if (!signature.toCharsString().equals("308202ad30820216a00302010202044c26cea2300d06092a864886f70d010105050030819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d301e170d3130303632373034303830325a170d3335303632313034303830325a30819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d30819f300d06092a864886f70d010101050003818d003081890281810082d6aca037a9843fbbe88b6dd19f36e9c24ce174c1b398f3a529e2a7fe02de99c27539602c026edf96ad8d43df32a85458bca1e6fbf11958658a7d6751a1d9b782bf43a8c19bd1c06bdbfd94c0516326ae3cf638ac42bb470580e340c46e6f306a772c1ef98f10a559edf867f3f31fe492808776b7bd953b2cba2d2b2d66a44f0203010001300d06092a864886f70d0101050500038181006003b04a8a8c5be9650f350cda6896e57dd13e6e83e7f891fc70f6a3c2eaf75cfa4fc998365deabbd1b9092159edf4b90df5702a0d101f8840b5d4586eb92a1c3cd19d95fbc1c2ac956309eda8eef3944baf08c4a49d3b9b3ffb06bc13dab94ecb5b8eb74e8789aa0ba21cb567f538bbc59c2a11e6919924a24272eb79251677")) {
                    return false;
                }
            } else if (context.getPackageName().equals("com.tencent.qqpimsecure") && !signature.toCharsString().equals("30820239308201a2a00302010202044c96f48f300d06092a864886f70d01010505003060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e57753020170d3130303932303035343334335a180f32303635303632333035343334335a3060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e577530819f300d06092a864886f70d010101050003818d0030818902818100b56e79dbb1185a79e52d792bb3d0bb3da8010d9b87da92ec69f7dc5ad66ab6bfdff2a6a1ed285dd2358f28b72a468be7c10a2ce30c4c27323ed4edcc936080e5bedc2cbbca0b7e879c08a631182793f44bb3ea284179b263410c298e5f6831032c9702ba4a74e2ccfc9ef857f12201451602fc8e774ac59d6398511586c83d1d0203010001300d06092a864886f70d0101050500038181002475615bb65b8d8786b890535802948840387d06b1692ff3ea47ef4c435719ba1865b81e6bfa6293ce31747c3cd6b34595b485cc1563fd90107ba5845c28b95c79138f0dec288940395bc10f92f2b69d8dc410999deb38900974ce9984b678030edfba8816582f56160d87e38641288d8588d2a31e20b89f223d788dd35cc9c8")) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore getPackageInfo fail");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(Context context, int i2) {
        File r;
        String str;
        String str2;
        Long[][] lArr;
        try {
            boolean isThirdPartyApp = TbsShareManager.isThirdPartyApp(context);
            if (!isThirdPartyApp) {
                r = r(context);
            } else if (!TbsShareManager.j(context)) {
                TbsLog.e("TbsInstaller", "321");
                return false;
            } else {
                r = new File(TbsShareManager.c(context));
                if (r.getAbsolutePath().contains(TbsConfig.APP_DEMO)) {
                    return true;
                }
            }
            if (r != null) {
                for (Long[] lArr2 : n) {
                    if (i2 == lArr2[0].intValue()) {
                        File file = new File(r, "libmttwebview.so");
                        if (file.exists() && file.length() == lArr2[1].longValue()) {
                            TbsLog.d("TbsInstaller", "check so success: " + i2 + "; file: " + file);
                            return true;
                        }
                        if (!isThirdPartyApp) {
                            FileUtil.b(QbSdk.getTbsFolderDir(context));
                        }
                        a.set(0);
                        str = "TbsInstaller";
                        str2 = "322";
                    }
                }
                return true;
            }
            str = "TbsInstaller";
            str2 = "323";
            TbsLog.e(str, str2);
        } catch (Throwable th) {
            TbsLog.e("TbsInstaller", "ISTBSCORELEGAL exception getMessage is " + th.getMessage());
            TbsLog.e("TbsInstaller", "ISTBSCORELEGAL exception getCause is " + th.getCause());
        }
        return false;
    }

    public void h(Context context) {
        if (l != null) {
            FileUtil.a(context, l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(Context context) {
        BufferedInputStream bufferedInputStream = null;
        try {
            File file = new File(q(context), "tbs.conf");
            if (file.exists()) {
                Properties properties = new Properties();
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream2);
                    bufferedInputStream2.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                        }
                        return 0;
                    }
                    int parseInt = Integer.parseInt(property);
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    return parseInt;
                } catch (Exception unused3) {
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
            }
            return 0;
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Context context) {
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                File file = new File(r(context), "tbs.conf");
                if (file.exists()) {
                    TbsLog.i("TbsInstaller", "getTbsCoreInstalledVerInNolock tbsPropFile is " + file.getAbsolutePath());
                    Properties properties = new Properties();
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        properties.load(bufferedInputStream2);
                        bufferedInputStream2.close();
                        String property = properties.getProperty("tbs_core_version");
                        if (property == null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e) {
                                TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e.toString());
                            }
                            return 0;
                        }
                        int parseInt = Integer.parseInt(property);
                        if (o == 0) {
                            o = parseInt;
                        }
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e2) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e2.toString());
                        }
                        return parseInt;
                    } catch (Exception e3) {
                        e = e3;
                        bufferedInputStream = bufferedInputStream2;
                        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock Exception=" + e.toString());
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e4) {
                                TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e4.toString());
                            }
                        }
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e5) {
                                TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock IOException=" + e5.toString());
                            }
                        }
                        throw th;
                    }
                }
                return 0;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k(Context context) {
        return o != 0 ? o : j(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Context context) {
        if (o != 0) {
            return;
        }
        o = j(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m(Context context) {
        return new File(r(context), "tbs.conf").exists();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n(Context context) {
        if (!u(context)) {
            return -1;
        }
        boolean tryLock = i.tryLock();
        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock locked=" + tryLock);
        if (!tryLock) {
            b();
            return 0;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                File file = new File(r(context), "tbs.conf");
                if (!file.exists()) {
                    try {
                        if (i.isHeldByCurrentThread()) {
                            i.unlock();
                        }
                    } catch (Throwable th) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th);
                    }
                    b();
                    return 0;
                }
                Properties properties = new Properties();
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream2);
                    bufferedInputStream2.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e.toString());
                        }
                        try {
                            if (i.isHeldByCurrentThread()) {
                                i.unlock();
                            }
                        } catch (Throwable th2) {
                            TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th2);
                        }
                        b();
                        return 0;
                    }
                    a.set(Integer.valueOf(Integer.parseInt(property)));
                    int intValue = a.get().intValue();
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e2) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e2.toString());
                    }
                    try {
                        if (i.isHeldByCurrentThread()) {
                            i.unlock();
                        }
                    } catch (Throwable th3) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th3);
                    }
                    b();
                    return intValue;
                } catch (Exception e3) {
                    e = e3;
                    bufferedInputStream = bufferedInputStream2;
                    TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock Exception=" + e.toString());
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e4) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e4.toString());
                        }
                    }
                    try {
                        if (i.isHeldByCurrentThread()) {
                            i.unlock();
                        }
                    } catch (Throwable th4) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th4);
                    }
                    b();
                    return 0;
                } catch (Throwable th5) {
                    th = th5;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e5) {
                            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock IOException=" + e5.toString());
                        }
                    }
                    try {
                        if (i.isHeldByCurrentThread()) {
                            i.unlock();
                        }
                    } catch (Throwable th6) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th6);
                    }
                    b();
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public boolean o(Context context) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--cleanStatusAndTmpDir");
        n.a(context).a(0);
        n.a(context).b(0);
        n.a(context).d(0);
        n.a(context).a("incrupdate_retry_num", 0);
        if (TbsDownloader.a(context)) {
            return;
        }
        n.a(context).c(0, -1);
        n.a(context).a("");
        n.a(context).a("copy_retry_num", 0);
        n.a(context).c(-1);
        n.a(context).a(0, -1);
        FileUtil.a(f(context, 0), true);
        FileUtil.a(f(context, 1), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File q(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_share_decouple");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File r(Context context) {
        return b((Context) null, context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File s(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "share");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean u(Context context) {
        if (this.e > 0) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= true");
            this.e++;
            return true;
        }
        this.g = FileUtil.b(context, true, "tbslock.txt");
        if (this.g == null) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock get install fos failed");
            return false;
        }
        this.f = FileUtil.a(context, this.g);
        if (this.f == null) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock tbsFileLockFileLock == null");
            return false;
        }
        TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= false");
        this.e++;
        return true;
    }
}
