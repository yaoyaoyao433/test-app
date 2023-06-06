package com.google.archivepatcher.applier.bsdiff;

import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements com.google.archivepatcher.applier.a {
    @Override // com.google.archivepatcher.applier.a
    public final void a(File file, InputStream inputStream, OutputStream outputStream) throws IOException {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, r.o);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 4096);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 16384);
                b.a(randomAccessFile, bufferedOutputStream, bufferedInputStream);
                bufferedOutputStream.flush();
                try {
                    randomAccessFile.close();
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                th = th;
                try {
                    randomAccessFile.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }
}
