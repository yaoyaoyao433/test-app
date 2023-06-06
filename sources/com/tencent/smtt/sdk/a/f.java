package com.tencent.smtt.sdk.a;

import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
/* loaded from: classes6.dex */
public class f {
    private static String a = "EmergencyManager";
    private final File b;
    private final FileOutputStream c;
    private final FileLock d;

    private f(File file, FileOutputStream fileOutputStream, FileLock fileLock) {
        this.b = file;
        this.c = fileOutputStream;
        this.d = fileLock;
    }

    public static f a(File file) {
        FileOutputStream fileOutputStream;
        String str;
        StringBuilder sb;
        FileLock tryLock;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            tryLock = fileOutputStream.getChannel().tryLock();
        } catch (Throwable th2) {
            th = th2;
            try {
                TbsLog.e(a, "Failed to try to acquire lock: " + file.getAbsolutePath() + " error: " + th.getMessage());
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e = e;
                        str = a;
                        sb = new StringBuilder("Failed to close: ");
                        sb.append(e.getMessage());
                        TbsLog.e(str, sb.toString());
                        return null;
                    }
                }
                return null;
            } catch (Throwable th3) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e2) {
                        TbsLog.e(a, "Failed to close: " + e2.getMessage());
                    }
                }
                throw th3;
            }
        }
        if (tryLock == null) {
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                e = e3;
                str = a;
                sb = new StringBuilder("Failed to close: ");
                sb.append(e.getMessage());
                TbsLog.e(str, sb.toString());
                return null;
            }
            return null;
        }
        TbsLog.i(a, "Created lock file: " + file.getAbsolutePath());
        f fVar = new f(file, fileOutputStream, tryLock);
        try {
            fileOutputStream.close();
        } catch (IOException e4) {
            TbsLog.e(a, "Failed to close: " + e4.getMessage());
        }
        return fVar;
    }

    public void a() throws IOException {
        String str = a;
        TbsLog.i(str, "Deleting lock file: " + this.b.getAbsolutePath());
        this.d.release();
        this.c.close();
        if (this.b.delete()) {
            return;
        }
        throw new IOException("Failed to delete lock file: " + this.b.getAbsolutePath());
    }

    public void b() {
        try {
            a();
        } catch (IOException unused) {
        }
    }
}
