package com.bumptech.glide.load.model;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o implements com.bumptech.glide.load.b<InputStream> {
    @Override // com.bumptech.glide.load.b
    public final String a() {
        return "";
    }

    @Override // com.bumptech.glide.load.b
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, OutputStream outputStream) {
        return a2(inputStream, outputStream);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static boolean a2(InputStream inputStream, OutputStream outputStream) {
        byte[] b = com.bumptech.glide.util.a.a().b();
        while (true) {
            try {
                try {
                    int read = inputStream.read(b);
                    if (read != -1) {
                        outputStream.write(b, 0, read);
                    } else {
                        com.bumptech.glide.util.a.a().a(b);
                        return true;
                    }
                } catch (IOException e) {
                    if (Log.isLoggable("StreamEncoder", 3)) {
                        Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                    }
                    com.bumptech.glide.util.a.a().a(b);
                    return false;
                }
            } catch (Throwable th) {
                com.bumptech.glide.util.a.a().a(b);
                throw th;
            }
        }
    }
}
