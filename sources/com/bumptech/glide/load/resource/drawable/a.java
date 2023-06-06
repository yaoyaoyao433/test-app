package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.l;
import com.squareup.picasso.MonitorData;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T extends Drawable> implements l<T> {
    protected final T a;
    protected MonitorData b;

    public a(T t) {
        if (t == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.a = t;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final MonitorData e() {
        return this.b;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final void a(MonitorData monitorData) {
        this.b = monitorData;
    }

    @Override // com.bumptech.glide.load.engine.l
    public final /* synthetic */ Object a() {
        return this.a.getConstantState().newDrawable();
    }
}
