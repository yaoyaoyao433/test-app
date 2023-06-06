package com.squareup.picasso.progressive;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.d;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f extends com.bumptech.glide.load.engine.cache.d {
    public f(Context context) {
        this(context, "progressive_disk_cache", 209715200);
    }

    public f(Context context, int i) {
        this(context, "progressive_disk_cache", i);
    }

    private f(final Context context, final String str, int i) {
        super(new d.a() { // from class: com.squareup.picasso.progressive.f.1
            @Override // com.bumptech.glide.load.engine.cache.d.a
            public final File a() {
                return q.a(context, "mtplatform_mtpicasso", str, u.b);
            }
        }, i);
    }
}
