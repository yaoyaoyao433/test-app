package com.squareup.picasso;

import com.bumptech.glide.request.f;
import com.bumptech.glide.request.target.l;
import com.bumptech.glide.request.target.m;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class InternalRequestListener<T, R> implements f<T, R> {
    RequestListener<T, R> a;
    private MtPicassoRequestListener<T, R> b;
    private f<T, R> c;
    private String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InternalRequestListener(MtPicassoRequestListener<T, R> mtPicassoRequestListener, String str, f<T, R> fVar) {
        this.b = mtPicassoRequestListener;
        this.d = str;
        this.c = fVar;
    }

    @Override // com.bumptech.glide.request.f
    public final boolean a(Exception exc, T t, l<R> lVar, boolean z) {
        if (this.c != null) {
            this.c.a(exc, t, lVar, z);
        }
        Picasso.e.a(exc, t, lVar, z);
        if (this.a != null) {
            return this.a.a(exc, t, z);
        }
        return false;
    }

    @Override // com.bumptech.glide.request.f
    public final boolean a(R r, T t, l<R> lVar, boolean z, boolean z2) {
        if (this.b != null) {
            this.b.a(r, t, lVar instanceof m ? ((m) lVar).o_() : null, z, z2);
        }
        if (this.c != null) {
            this.c.a(r, t, lVar, z, z2);
        }
        Picasso.e.a(r, t, lVar, z, z2);
        if (this.a != null) {
            return this.a.a(r, t, z, z2);
        }
        return false;
    }
}
