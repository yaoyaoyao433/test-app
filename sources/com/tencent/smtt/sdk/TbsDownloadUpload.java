package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.smtt.sdk.TbsListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/* loaded from: classes6.dex */
public class TbsDownloadUpload {
    private static TbsDownloadUpload b;
    Map<String, Object> a = new HashMap();
    private Context c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    public SharedPreferences mPreferences;

    /* loaded from: classes6.dex */
    public interface TbsUploadKey {
        public static final String KEY_LOCAL_CORE_VERSION = "tbs_local_core_version";
        public static final String KEY_NEEDDOWNLOAD_CODE = "tbs_needdownload_code";
        public static final String KEY_NEEDDOWNLOAD_RETURN = "tbs_needdownload_return";
        public static final String KEY_NEEDDOWNLOAD_SENT = "tbs_needdownload_sent";
        public static final String KEY_STARTDOWNLOAD_CODE = "tbs_startdownload_code";
        public static final String KEY_STARTDOWNLOAD_SENT = "tbs_startdownload_sent";
    }

    public TbsDownloadUpload(Context context) {
        this.mPreferences = context.getSharedPreferences("tbs_download_upload", 4);
        this.c = context.getApplicationContext();
        if (this.c == null) {
            this.c = context;
        }
    }

    private static File a(Context context, String str) {
        p.a();
        File t = p.t(context);
        if (t == null) {
            return null;
        }
        File file = new File(t, str);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static synchronized void clear() {
        synchronized (TbsDownloadUpload.class) {
            b = null;
        }
    }

    public static synchronized TbsDownloadUpload getInstance() {
        TbsDownloadUpload tbsDownloadUpload;
        synchronized (TbsDownloadUpload.class) {
            tbsDownloadUpload = b;
        }
        return tbsDownloadUpload;
    }

    public static synchronized TbsDownloadUpload getInstance(Context context) {
        TbsDownloadUpload tbsDownloadUpload;
        synchronized (TbsDownloadUpload.class) {
            if (b == null) {
                b = new TbsDownloadUpload(context);
            }
            tbsDownloadUpload = b;
        }
        return tbsDownloadUpload;
    }

    public void clearUploadCode() {
        this.a.put(TbsUploadKey.KEY_NEEDDOWNLOAD_CODE, 0);
        this.a.put(TbsUploadKey.KEY_STARTDOWNLOAD_CODE, 0);
        this.a.put(TbsUploadKey.KEY_NEEDDOWNLOAD_RETURN, 0);
        this.a.put(TbsUploadKey.KEY_NEEDDOWNLOAD_SENT, 0);
        this.a.put(TbsUploadKey.KEY_STARTDOWNLOAD_SENT, 0);
        this.a.put(TbsUploadKey.KEY_LOCAL_CORE_VERSION, 0);
        writeTbsDownloadInfo();
    }

    public synchronized void commit() {
        writeTbsDownloadInfo();
    }

    public synchronized int getLocalCoreVersion() {
        return this.i;
    }

    public synchronized int getNeedDownloadCode() {
        if (this.g == 1) {
            return TbsListener.ErrorCode.NEEDDOWNLOAD_9;
        }
        return this.d;
    }

    public synchronized int getNeedDownloadReturn() {
        return this.f;
    }

    public synchronized int getStartDownloadCode() {
        if (this.h == 1) {
            return TbsListener.ErrorCode.STARTDOWNLOAD_9;
        }
        return this.e;
    }

    public synchronized void readTbsDownloadInfo(Context context) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            File a = a(this.c, "download_upload");
            if (a == null) {
                return;
            }
            bufferedInputStream = new BufferedInputStream(new FileInputStream(a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                String property = properties.getProperty(TbsUploadKey.KEY_NEEDDOWNLOAD_CODE, "");
                if (!"".equals(property)) {
                    this.d = Math.max(Integer.parseInt(property), 0);
                }
                String property2 = properties.getProperty(TbsUploadKey.KEY_STARTDOWNLOAD_CODE, "");
                if (!"".equals(property2)) {
                    this.e = Math.max(Integer.parseInt(property2), 0);
                }
                String property3 = properties.getProperty(TbsUploadKey.KEY_NEEDDOWNLOAD_RETURN, "");
                if (!"".equals(property3)) {
                    this.f = Math.max(Integer.parseInt(property3), 0);
                }
                String property4 = properties.getProperty(TbsUploadKey.KEY_NEEDDOWNLOAD_SENT, "");
                if (!"".equals(property4)) {
                    this.g = Math.max(Integer.parseInt(property4), 0);
                }
                String property5 = properties.getProperty(TbsUploadKey.KEY_STARTDOWNLOAD_SENT, "");
                if (!"".equals(property5)) {
                    this.h = Math.max(Integer.parseInt(property5), 0);
                }
                String property6 = properties.getProperty(TbsUploadKey.KEY_LOCAL_CORE_VERSION, "");
                if (!"".equals(property6)) {
                    this.i = Math.max(Integer.parseInt(property6), 0);
                }
                try {
                    bufferedInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
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
    public synchronized void writeTbsDownloadInfo() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadUpload.writeTbsDownloadInfo():void");
    }
}
