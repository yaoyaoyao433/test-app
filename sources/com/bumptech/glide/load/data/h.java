package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class h<T> implements c<T> {
    private final Uri a;
    private final Context b;
    private T c;

    protected abstract T a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    protected abstract void a(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.c
    public void cancel() {
    }

    public h(Context context, Uri uri) {
        this.b = context.getApplicationContext();
        this.a = uri;
    }

    @Override // com.bumptech.glide.load.data.c
    public final T a(int i) throws Exception {
        this.c = a(this.a, this.b.getContentResolver());
        return this.c;
    }

    @Override // com.bumptech.glide.load.data.c
    public final void a() {
        if (this.c != null) {
            try {
                a((h<T>) this.c);
            } catch (IOException e) {
                if (Log.isLoggable("LocalUriFetcher", 2)) {
                    Log.v("LocalUriFetcher", "failed to close data", e);
                }
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final String b() {
        return this.a.toString();
    }
}
