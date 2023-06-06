package com.facebook.soloader;

import android.support.annotation.Nullable;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f implements Closeable {
    private final FileOutputStream a;
    @Nullable
    private final FileLock b;

    public static f a(File file) throws IOException {
        return new f(file);
    }

    private f(File file) throws IOException {
        this.a = new FileOutputStream(file);
        try {
            FileLock lock = this.a.getChannel().lock();
            if (lock == null) {
            }
            this.b = lock;
        } finally {
            this.a.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            if (this.b != null) {
                this.b.release();
            }
        } finally {
            this.a.close();
        }
    }
}
