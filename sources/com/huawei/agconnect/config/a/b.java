package com.huawei.agconnect.config.a;

import android.content.Context;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.huawei.agconnect.config.a {
    private final Context a;
    private final String b;
    private com.huawei.agconnect.config.b c;
    private volatile c d;
    private final Object e = new Object();
    private Map<String, String> f = new HashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a extends com.huawei.agconnect.config.b {
        final /* synthetic */ InputStream c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, InputStream inputStream) {
            super(context);
            this.c = inputStream;
        }

        @Override // com.huawei.agconnect.config.b
        public final InputStream a(Context context) {
            return this.c;
        }
    }

    public b(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // com.huawei.agconnect.config.a
    public final String a(String str) {
        return a(str, (String) null);
    }

    private String a(String str, String str2) {
        if (str != null) {
            if (this.d == null) {
                synchronized (this.e) {
                    if (this.d == null) {
                        if (this.c != null) {
                            com.huawei.agconnect.config.b bVar = this.c;
                            if (bVar.b == null) {
                                bVar.b = bVar.a(bVar.a);
                            }
                            this.d = new e(bVar.b);
                            this.c.a();
                            this.c = null;
                        } else {
                            this.d = new h(this.a, this.b);
                        }
                    }
                }
            }
            int i = 0;
            if (str.length() > 0) {
                while (str.charAt(i) == '/') {
                    i++;
                }
            }
            String str3 = "/" + str.substring(i);
            return this.f.containsKey(str3) ? this.f.get(str3) != null ? this.f.get(str3) : str2 : this.d.a(str3, null);
        }
        throw new NullPointerException("path must not be null.");
    }

    @Override // com.huawei.agconnect.config.a
    public final void a(InputStream inputStream) {
        this.c = new a(this.a, inputStream);
    }
}
