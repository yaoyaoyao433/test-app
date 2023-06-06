package com.tencent.map.geolocation.a.a;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    static d c;
    Context a;
    Map<String, FileChannel> b;

    private d(Context context) {
        this.a = null;
        this.b = null;
        this.a = context;
        this.b = new HashMap(5);
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (c == null) {
                c = new d(context);
            }
            dVar = c;
        }
        return dVar;
    }

    public final synchronized boolean a(String str) {
        if (str.trim().length() <= 0) {
            return false;
        }
        File c2 = c(str);
        if (c2 == null) {
            return true;
        }
        FileChannel fileChannel = this.b.get(str);
        if (fileChannel == null || !fileChannel.isOpen()) {
            fileChannel = new FileOutputStream(c2).getChannel();
            this.b.put(str, fileChannel);
        }
        FileLock lock = fileChannel.lock();
        if (lock != null) {
            if (lock.isValid()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void b(String str) {
        if (str.trim().length() <= 0) {
            return;
        }
        FileChannel fileChannel = this.b.get(str);
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    private synchronized File c(String str) {
        File file;
        try {
            File filesDir = this.a.getFilesDir();
            file = new File(filesDir, "TencentLocationCoverSDK_" + str + ".lock");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException unused) {
            file = null;
        }
        return file;
    }
}
