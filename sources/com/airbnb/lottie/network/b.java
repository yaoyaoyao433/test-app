package com.airbnb.lottie.network;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.v4.util.Pair;
import com.airbnb.lottie.d;
import com.meituan.android.mrn.engine.MRNBundleManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    final Context a;
    final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    @Nullable
    public final Pair<a, InputStream> a() {
        a aVar;
        try {
            String str = this.b;
            File file = new File(this.a.getCacheDir(), a(str, a.Json, false));
            if (!file.exists()) {
                file = new File(this.a.getCacheDir(), a(str, a.Zip, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.getAbsolutePath().endsWith(MRNBundleManager.MRN_BUNDLE_SUFFIX)) {
                    aVar = a.Zip;
                } else {
                    aVar = a.Json;
                }
                d.a("Cache hit for " + this.b + " at " + file.getAbsolutePath());
                return new Pair<>(aVar, fileInputStream);
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File a(InputStream inputStream, a aVar) throws IOException {
        File file = new File(this.a.getCacheDir(), a(this.b, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, a aVar, boolean z) {
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? aVar.c : aVar.a());
        return sb.toString();
    }
}
