package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/* loaded from: classes6.dex */
public abstract class TbsBaseConfig {
    public static final String TAG = "TbsBaseConfig";
    Map<String, String> a;
    private Context b;

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

    public void clear() {
        this.a.clear();
        commit();
    }

    public synchronized void commit() {
        writeTbsDownloadInfo();
    }

    public abstract String getConfigFileName();

    public void init(Context context) {
        this.a = new HashMap();
        this.b = context.getApplicationContext();
        if (this.b == null) {
            this.b = context;
        }
        refreshSyncMap(context);
    }

    public synchronized void refreshSyncMap(Context context) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            File a = a(this.b, getConfigFileName());
            if (a == null) {
                return;
            }
            this.a.clear();
            bufferedInputStream = new BufferedInputStream(new FileInputStream(a));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                for (String str : properties.stringPropertyNames()) {
                    this.a.put(str, properties.getProperty(str));
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
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsBaseConfig.writeTbsDownloadInfo():void");
    }
}
