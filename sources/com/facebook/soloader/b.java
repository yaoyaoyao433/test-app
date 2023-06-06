package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends i {
    private Context a;
    private int b;
    private c c;

    public b(Context context, int i) {
        this.a = context.getApplicationContext();
        if (this.a == null) {
            this.a = context;
        }
        this.b = i;
        this.c = new c(new File(this.a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.i
    public final void a(int i) throws IOException {
        this.c.a(i);
    }

    @Override // com.facebook.soloader.i
    public final String toString() {
        return this.c.toString();
    }
}
