package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.meituan.robust.common.CommonConstant;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public class cn implements com.xiaomi.channel.commonutils.logger.a {
    private static volatile cn h;
    private String c;
    private Context d;
    private String e = "";
    private Handler g;
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");
    public static String a = "/MiPushLog";
    private static List<Pair<String, Throwable>> f = Collections.synchronizedList(new ArrayList());

    private cn(Context context) {
        this.d = context;
        if (context.getApplicationContext() != null) {
            this.d = context.getApplicationContext();
        }
        this.c = this.d.getPackageName() + CommonConstant.Symbol.MINUS + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.g = new Handler(handlerThread.getLooper());
    }

    public static cn a(Context context) {
        if (h == null) {
            synchronized (cn.class) {
                if (h == null) {
                    h = new cn(context);
                }
            }
        }
        return h;
    }

    @Override // com.xiaomi.channel.commonutils.logger.a
    public final void a(String str) {
        a(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.a
    public final void a(String str, Throwable th) {
        this.g.post(new co(this, str, th));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(cn cnVar) {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        File externalFilesDir;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                if (TextUtils.isEmpty(cnVar.e) && (externalFilesDir = cnVar.d.getExternalFilesDir(null)) != null) {
                    cnVar.e = externalFilesDir.getAbsolutePath();
                }
                File file = new File(cnVar.e + a);
                if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
                    return;
                }
                File file2 = new File(file, "log.lock");
                if (!file2.exists() || file2.isDirectory()) {
                    file2.createNewFile();
                }
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                            while (!f.isEmpty()) {
                                try {
                                    Pair<String, Throwable> remove = f.remove(0);
                                    String str = (String) remove.first;
                                    if (remove.second != null) {
                                        str = (str + "\n") + Log.getStackTraceString((Throwable) remove.second);
                                    }
                                    bufferedWriter2.write(str + "\n");
                                } catch (Exception e) {
                                    e = e;
                                    bufferedWriter = bufferedWriter2;
                                    Log.e(cnVar.c, "", e);
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e2) {
                                            Log.e(cnVar.c, "", e2);
                                        }
                                    }
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e3) {
                                            Log.e(cnVar.c, "", e3);
                                        }
                                    }
                                    if (randomAccessFile != null) {
                                        randomAccessFile.close();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedWriter = bufferedWriter2;
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e4) {
                                            Log.e(cnVar.c, "", e4);
                                        }
                                    }
                                    if (fileLock != null && fileLock.isValid()) {
                                        try {
                                            fileLock.release();
                                        } catch (IOException e5) {
                                            Log.e(cnVar.c, "", e5);
                                        }
                                    }
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                        } catch (IOException e6) {
                                            Log.e(cnVar.c, "", e6);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                            File file3 = new File(file, "log1.txt");
                            if (file3.length() >= 1048576) {
                                File file4 = new File(file, "log0.txt");
                                if (file4.exists() && file4.isFile()) {
                                    file4.delete();
                                }
                                file3.renameTo(file4);
                            }
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e7) {
                                    Log.e(cnVar.c, "", e7);
                                }
                            }
                            randomAccessFile.close();
                        } catch (Exception e8) {
                            e = e8;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e9) {
                    e = e9;
                    fileLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileLock = null;
                }
            } catch (IOException e10) {
                Log.e(cnVar.c, "", e10);
            }
        } catch (Exception e11) {
            e = e11;
            fileLock = null;
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            fileLock = null;
            randomAccessFile = null;
        }
    }
}
