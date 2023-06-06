package com.google.archivepatcher.applier;

import com.google.archivepatcher.shared.j;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements a {
    private final File a;

    public c() {
        this(null);
    }

    private c(File file) {
        this.a = new File(System.getProperty("java.io.tmpdir"));
    }

    @Override // com.google.archivepatcher.applier.a
    public final void a(File file, InputStream inputStream, OutputStream outputStream) throws IOException {
        if (!this.a.exists()) {
            this.a.mkdirs();
        }
        File createTempFile = File.createTempFile("gfbfv1", "old", this.a);
        try {
            a(file, createTempFile, inputStream, outputStream);
        } finally {
            createTempFile.delete();
        }
    }

    public final void a(File file, InputStream inputStream, OutputStream outputStream, File file2) throws IOException {
        if (file2.exists()) {
            try {
                a(file, file2, inputStream, outputStream);
                return;
            } finally {
                file2.delete();
            }
        }
        a(file, inputStream, outputStream);
    }

    private void a(File file, File file2, InputStream inputStream, OutputStream outputStream) throws IOException {
        new h();
        f a = h.a(inputStream);
        a(a, file, file2);
        long j = a.d.get(0).a;
        com.google.archivepatcher.applier.bsdiff.a aVar = new com.google.archivepatcher.applier.bsdiff.a();
        d dVar = new d(inputStream, j);
        e eVar = new e(a.b, outputStream, 32768);
        aVar.a(file2, dVar, eVar);
        eVar.flush();
    }

    private static void a(f fVar, File file, File file2) throws IOException {
        j jVar = null;
        try {
            j jVar2 = new j(file2, fVar.c);
            try {
                com.google.archivepatcher.shared.e.a(fVar.a, file, jVar2, false, 32768);
                try {
                    jVar2.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                jVar = jVar2;
                try {
                    jVar.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
