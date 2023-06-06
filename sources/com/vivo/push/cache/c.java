package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ContextDelegate;
import com.vivo.push.util.g;
import com.vivo.push.util.p;
import com.vivo.push.util.w;
import com.vivo.push.util.y;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class c<T> {
    protected static final Object a = new Object();
    protected List<T> b = new ArrayList();
    protected Context c;
    private byte[] d;
    private byte[] e;

    protected abstract String a();

    protected abstract List<T> a(String str);

    abstract String b(String str) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context) {
        this.c = ContextDelegate.getContext(context);
        w b = w.b();
        b.a(this.c);
        this.d = b.c();
        this.e = b.d();
        c();
    }

    public final void c() {
        synchronized (a) {
            g.a(a());
            this.b.clear();
            c(b());
        }
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            p.d("CacheSettings", "ClientManager init " + a() + " strApps empty.");
        } else if (str.length() > 10000) {
            p.d("CacheSettings", "sync " + a() + " strApps lenght too large");
            d();
        } else {
            try {
                p.d("CacheSettings", "ClientManager init " + a() + " strApps : " + str);
                List<T> a2 = a(b(str));
                if (a2 != null) {
                    this.b.addAll(a2);
                }
            } catch (Exception e) {
                d();
                p.d("CacheSettings", p.a(e));
            }
        }
    }

    private String b() {
        return y.b(this.c).a(a(), null);
    }

    private void d(String str) {
        y.b(this.c).b(a(), str);
    }

    public final void d() {
        synchronized (a) {
            this.b.clear();
            d("");
            p.d("CacheSettings", "clear " + a() + " strApps");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] e() {
        if (this.d != null && this.d.length > 0) {
            return this.d;
        }
        return w.b().c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byte[] f() {
        if (this.e != null && this.e.length > 0) {
            return this.e;
        }
        return w.b().d();
    }
}
