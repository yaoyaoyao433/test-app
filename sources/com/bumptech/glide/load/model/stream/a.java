package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.model.k;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements e<com.bumptech.glide.load.model.d> {
    private final k<com.bumptech.glide.load.model.d, com.bumptech.glide.load.model.d> a;

    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c a(Object obj, int i, int i2) {
        com.bumptech.glide.load.model.d dVar = (com.bumptech.glide.load.model.d) obj;
        if (this.a != null) {
            k<com.bumptech.glide.load.model.d, com.bumptech.glide.load.model.d> kVar = this.a;
            k.a<com.bumptech.glide.load.model.d> a = k.a.a(dVar, 0, 0);
            com.bumptech.glide.load.model.d b = kVar.a.b((com.bumptech.glide.util.e<k.a<com.bumptech.glide.load.model.d>, com.bumptech.glide.load.model.d>) a);
            a.a();
            com.bumptech.glide.load.model.d dVar2 = b;
            if (dVar2 == null) {
                k<com.bumptech.glide.load.model.d, com.bumptech.glide.load.model.d> kVar2 = this.a;
                kVar2.a.b(k.a.a(dVar, 0, 0), dVar);
            } else {
                dVar = dVar2;
            }
        }
        return new com.bumptech.glide.load.data.g(dVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.load.model.stream.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0043a implements m<com.bumptech.glide.load.model.d, InputStream> {
        private final k<com.bumptech.glide.load.model.d, com.bumptech.glide.load.model.d> a = new k<>(500);

        @Override // com.bumptech.glide.load.model.m
        public final l<com.bumptech.glide.load.model.d, InputStream> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new a(this.a);
        }
    }

    public a() {
        this(null);
    }

    public a(k<com.bumptech.glide.load.model.d, com.bumptech.glide.load.model.d> kVar) {
        this.a = kVar;
    }
}
