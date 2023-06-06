package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.m;
import com.bumptech.glide.load.model.n;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends n<InputStream> implements e<Integer> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements m<Integer, InputStream> {
        @Override // com.bumptech.glide.load.model.m
        public final l<Integer, InputStream> a(Context context, com.bumptech.glide.load.model.c cVar) {
            return new f(context, cVar.a(Uri.class, InputStream.class));
        }
    }

    public f(Context context, l<Uri, InputStream> lVar) {
        super(context, lVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.model.n, com.bumptech.glide.load.model.l
    public final com.bumptech.glide.load.data.c<InputStream> a(Integer num, int i, int i2) {
        com.bumptech.glide.load.data.l lVar = null;
        if (num != null) {
            int intValue = num.intValue();
            int i3 = intValue >> 24;
            boolean z = true;
            if (intValue != 0 && i3 != 127 && i3 != 1) {
                z = false;
            }
            if (!z) {
                lVar = new com.bumptech.glide.load.data.l(this.a, num.intValue());
            }
        }
        return lVar != null ? lVar : super.a(num, i, i2);
    }
}
