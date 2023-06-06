package com.tencent.open.a;

import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private Response a;
    private String b = null;
    private int c;
    private int d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Response response, int i) {
        this.a = response;
        this.d = i;
        this.c = response.code();
        ResponseBody body = this.a.body();
        if (body != null) {
            this.e = (int) body.contentLength();
        } else {
            this.e = 0;
        }
    }

    public String a() throws IOException {
        if (this.b == null) {
            ResponseBody body = this.a.body();
            if (body != null) {
                this.b = body.string();
            }
            if (this.b == null) {
                this.b = "";
            }
        }
        return this.b;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }
}
