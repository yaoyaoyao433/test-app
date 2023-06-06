package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.model.l;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements l<com.bumptech.glide.gifdecoder.a, com.bumptech.glide.gifdecoder.a> {
    @Override // com.bumptech.glide.load.model.l
    public final /* synthetic */ com.bumptech.glide.load.data.c<com.bumptech.glide.gifdecoder.a> a(com.bumptech.glide.gifdecoder.a aVar, int i, int i2) {
        return new a(aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements com.bumptech.glide.load.data.c<com.bumptech.glide.gifdecoder.a> {
        private final com.bumptech.glide.gifdecoder.a a;

        @Override // com.bumptech.glide.load.data.c
        public final void a() {
        }

        @Override // com.bumptech.glide.load.data.c
        public final void cancel() {
        }

        public a(com.bumptech.glide.gifdecoder.a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.data.c
        public final String b() {
            return String.valueOf(this.a.d());
        }

        @Override // com.bumptech.glide.load.data.c
        public final /* bridge */ /* synthetic */ com.bumptech.glide.gifdecoder.a a(int i) throws Exception {
            return this.a;
        }
    }
}
