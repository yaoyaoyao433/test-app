package com.squareup.okhttp.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.m;
import okio.r;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface a {
    public static final a a = new a() { // from class: com.squareup.okhttp.internal.io.a.1
        @Override // com.squareup.okhttp.internal.io.a
        public final s a(File file) throws FileNotFoundException {
            return m.a(file);
        }

        @Override // com.squareup.okhttp.internal.io.a
        public final r b(File file) throws FileNotFoundException {
            try {
                return m.b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return m.b(file);
            }
        }

        @Override // com.squareup.okhttp.internal.io.a
        public final r c(File file) throws FileNotFoundException {
            try {
                return m.c(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return m.c(file);
            }
        }

        @Override // com.squareup.okhttp.internal.io.a
        public final void d(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        @Override // com.squareup.okhttp.internal.io.a
        public final boolean e(File file) throws IOException {
            return file.exists();
        }

        @Override // com.squareup.okhttp.internal.io.a
        public final long f(File file) {
            return file.length();
        }

        @Override // com.squareup.okhttp.internal.io.a
        public final void a(File file, File file2) throws IOException {
            d(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        @Override // com.squareup.okhttp.internal.io.a
        public final void g(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                throw new IOException("not a readable directory: " + file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    g(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete " + file2);
                }
            }
        }
    };

    s a(File file) throws FileNotFoundException;

    void a(File file, File file2) throws IOException;

    r b(File file) throws FileNotFoundException;

    r c(File file) throws FileNotFoundException;

    void d(File file) throws IOException;

    boolean e(File file) throws IOException;

    long f(File file);

    void g(File file) throws IOException;
}
