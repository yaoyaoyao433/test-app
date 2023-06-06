package com.coloros.ocs.base.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.coloros.ocs.base.common.AuthResult;
import com.coloros.ocs.base.common.api.a.c;
/* loaded from: classes.dex */
public final class a<O extends c> {
    AbstractC0048a<?, O> a;
    private f<?> b;
    private String c;

    /* renamed from: com.coloros.ocs.base.common.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0048a<T extends e, O> extends d<T, O> {
        public abstract T a(Context context, Looper looper, com.coloros.ocs.base.internal.a aVar, O o);
    }

    /* loaded from: classes.dex */
    public static class b<C> {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static abstract class d<T, O> {
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void a(com.coloros.ocs.base.common.api.f fVar, @Nullable Handler handler);

        <T> void a(g<T> gVar);

        void a(l lVar);

        void b();

        boolean c();

        AuthResult d();
    }

    /* loaded from: classes.dex */
    public static class f<C extends e> extends b<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends e> a(String str, AbstractC0048a<C, O> abstractC0048a, f<C> fVar) {
        com.coloros.ocs.base.a.b.a(abstractC0048a, "can not construct whit the null AbstractClientBuilder");
        com.coloros.ocs.base.a.b.a(fVar, "can not construct with the null ClientKey");
        this.c = str;
        this.a = abstractC0048a;
        this.b = fVar;
    }

    public final f<?> a() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalStateException("This API was constructed with null clientKey.");
    }
}
