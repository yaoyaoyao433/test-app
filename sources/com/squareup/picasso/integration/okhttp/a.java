package com.squareup.picasso.integration.okhttp;

import com.squareup.okhttp.aa;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import com.squareup.picasso.model.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements com.squareup.picasso.load.data.a<InputStream> {
    private final v a;
    private final d b;
    private InputStream c;
    private aa d;

    @Override // com.squareup.picasso.load.data.a
    public void cancel() {
    }

    public a(v vVar, d dVar) {
        this.a = vVar;
        this.b = dVar;
    }

    @Override // com.squareup.picasso.load.data.a
    /* renamed from: d */
    public InputStream c() throws Exception {
        x.a a = new x.a().a(this.b.a());
        for (Map.Entry<String, String> entry : this.b.b().entrySet()) {
            a.b(entry.getKey(), entry.getValue());
        }
        z a2 = this.a.a(a.a()).a();
        this.d = a2.g;
        if (!a2.c()) {
            throw new IOException("Request failed with code: " + a2.c);
        }
        this.c = com.squareup.picasso.util.a.a(this.d.d(), this.d.b());
        return this.c;
    }

    @Override // com.squareup.picasso.load.data.a
    public final void a() {
        if (this.c != null) {
            try {
                this.c.close();
            } catch (IOException unused) {
            }
        }
        if (this.d != null) {
            try {
                this.d.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // com.squareup.picasso.load.data.a
    public final String b() {
        return this.b.c();
    }
}
