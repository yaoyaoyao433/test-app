package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
/* loaded from: classes6.dex */
public abstract class ju implements Runnable {
    private Context a;
    private File b;
    private Runnable c;

    private ju(Context context, File file) {
        this.a = context;
        this.b = file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ju(Context context, File file, jv jvVar) {
        this(context, file);
    }

    protected abstract void a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        jt a;
        jt jtVar = null;
        try {
            try {
                if (this.b == null) {
                    this.b = new File(this.a.getFilesDir(), "default_locker");
                }
                a = jt.a(this.a, this.b);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (this.c != null) {
                this.c.run();
            }
            a(this.a);
            a.a();
        } catch (IOException e2) {
            e = e2;
            jtVar = a;
            e.printStackTrace();
            if (jtVar != null) {
                jtVar.a();
            }
        } catch (Throwable th2) {
            th = th2;
            jtVar = a;
            if (jtVar != null) {
                jtVar.a();
            }
            throw th;
        }
    }
}
