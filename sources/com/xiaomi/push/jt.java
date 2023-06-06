package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes6.dex */
public final class jt {
    private static final Set<String> e = Collections.synchronizedSet(new HashSet());
    private Context a;
    private FileLock b;
    private String c;
    private RandomAccessFile d;

    private jt(Context context) {
        this.a = context;
    }

    public static jt a(Context context, File file) {
        com.xiaomi.channel.commonutils.logger.c.c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (e.add(str)) {
            jt jtVar = new jt(context);
            jtVar.c = str;
            try {
                jtVar.d = new RandomAccessFile(file2, "rw");
                jtVar.b = jtVar.d.getChannel().lock();
                com.xiaomi.channel.commonutils.logger.c.c("Locked: " + str + " :" + jtVar.b);
                return jtVar;
            } finally {
                if (jtVar.b == null) {
                    if (jtVar.d != null) {
                        b.a(jtVar.d);
                    }
                    e.remove(jtVar.c);
                }
            }
        }
        throw new IOException("abtain lock failure");
    }

    public final void a() {
        com.xiaomi.channel.commonutils.logger.c.c("unLock: " + this.b);
        if (this.b != null && this.b.isValid()) {
            try {
                this.b.release();
            } catch (IOException unused) {
            }
            this.b = null;
        }
        if (this.d != null) {
            b.a(this.d);
        }
        e.remove(this.c);
    }
}
