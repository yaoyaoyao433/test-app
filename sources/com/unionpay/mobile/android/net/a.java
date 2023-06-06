package com.unionpay.mobile.android.net;

import android.content.Context;
import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
/* loaded from: classes6.dex */
public class a {
    private SSLContext a = null;
    private Context b;

    public a(Context context) {
        this.b = context;
    }

    private static SSLContext a(Context context) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new b(context)}, null);
            return sSLContext;
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public final SSLContext a() throws IOException {
        if (this.a == null) {
            this.a = a(this.b);
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass().equals(a.class);
    }

    public int hashCode() {
        return a.class.hashCode();
    }
}
