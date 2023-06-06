package com.huawei.agconnect.config;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b {
    public final Context a;
    public InputStream b;

    public b(Context context) {
        this.a = context;
    }

    public abstract InputStream a(Context context);

    public final void a() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
        }
    }
}
