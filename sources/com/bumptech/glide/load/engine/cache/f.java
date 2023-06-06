package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.d;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends d {
    public f(Context context) {
        this(context, "image_manager_disk_cache", 209715200);
    }

    private f(final Context context, final String str, int i) {
        super(new d.a() { // from class: com.bumptech.glide.load.engine.cache.f.1
            @Override // com.bumptech.glide.load.engine.cache.d.a
            public final File a() {
                return q.a(context, "mtplatform_mtpicasso", str, u.b);
            }
        }, 209715200);
    }
}
