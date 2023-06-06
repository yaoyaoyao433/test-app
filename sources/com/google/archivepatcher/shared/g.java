package com.google.archivepatcher.shared;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g implements Closeable {
    private final d a = new d();
    private final com.google.archivepatcher.shared.a b;
    private final byte[] c;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {a, b, c};
    }

    public g(OutputStream outputStream, int i) {
        this.b = new com.google.archivepatcher.shared.a(outputStream);
        this.a.a = true;
        this.c = new byte[i];
    }

    public final long a(InputStream inputStream, int i) throws IOException {
        long j = this.b.a;
        if (i == a.a) {
            while (true) {
                int read = inputStream.read(this.c);
                if (read < 0) {
                    break;
                }
                this.b.write(this.c, 0, read);
            }
        } else {
            this.a.a(i == a.c);
            this.a.a(inputStream, this.b);
        }
        this.b.flush();
        return this.b.a - j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.a();
        this.b.close();
    }
}
