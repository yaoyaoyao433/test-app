package com.meituan.android.soloader;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements Closeable {
    public static ChangeQuickRedirect a;
    private final FileOutputStream b;
    @Nullable
    private final FileLock c;

    public static g a(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c0ab16385503e247b4fcd71d69aba8a", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c0ab16385503e247b4fcd71d69aba8a") : new g(file);
    }

    private g(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6affcf48f8bb2b1e0b8df122a141d368", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6affcf48f8bb2b1e0b8df122a141d368");
            return;
        }
        this.b = new FileOutputStream(file);
        try {
            FileLock lock = this.b.getChannel().lock();
            if (lock == null) {
            }
            this.c = lock;
        } finally {
            this.b.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e423eb2dd3d79f43f640e4ad9faf73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e423eb2dd3d79f43f640e4ad9faf73");
            return;
        }
        try {
            if (this.c != null) {
                this.c.release();
            }
        } finally {
            this.b.close();
        }
    }
}
