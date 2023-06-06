package com.coloros.ocs.base.common.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coloros.ocs.base.common.api.a;
import com.coloros.ocs.base.common.api.a.c;
import com.coloros.ocs.base.common.api.c;
import com.coloros.ocs.base.common.api.g;
/* loaded from: classes.dex */
public abstract class c<O extends a.c, R extends c> {
    a<O> a;
    O b;
    private Context c;
    private j d;
    private com.coloros.ocs.base.internal.a e;

    public c(@NonNull Context context, a<O> aVar, @Nullable O o, com.coloros.ocs.base.internal.a aVar2) {
        com.coloros.ocs.base.a.b.a(context, "Null context is not permitted.");
        com.coloros.ocs.base.a.b.a(aVar, "Api must not be null.");
        this.c = context.getApplicationContext();
        com.coloros.ocs.base.a.a.a(this.c);
        this.a = aVar;
        this.b = null;
        this.e = aVar2;
        this.d = j.a(this.c);
        this.d.a(this, this.e);
    }

    public final R a(f fVar) {
        this.d.a(this, fVar, new Handler(Looper.getMainLooper()));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <TResult> com.coloros.ocs.base.task.a<TResult> a(Looper looper, g.b<TResult> bVar, g.a<TResult> aVar) {
        com.coloros.ocs.base.a.a.a("color doRegisterListener");
        com.coloros.ocs.base.task.b bVar2 = new com.coloros.ocs.base.task.b();
        j.a(this, new g(looper, bVar2, bVar, aVar));
        return bVar2;
    }
}
