package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T> implements c<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    protected abstract T a(AssetManager assetManager, String str) throws IOException;

    protected abstract void a(T t) throws IOException;

    @Override // com.bumptech.glide.load.data.c
    public void cancel() {
    }

    public a(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // com.bumptech.glide.load.data.c
    public final T a(int i) throws Exception {
        this.c = a(this.b, this.a);
        return this.c;
    }

    @Override // com.bumptech.glide.load.data.c
    public final void a() {
        if (this.c == null) {
            return;
        }
        try {
            a((a<T>) this.c);
        } catch (IOException e) {
            if (Log.isLoggable("AssetUriFetcher", 2)) {
                Log.v("AssetUriFetcher", "Failed to close data", e);
            }
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final String b() {
        return this.a;
    }
}
