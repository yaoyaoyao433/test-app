package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class av extends ak {
    private final WeakReference<Context> a;

    public av(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.a = new WeakReference<>(context);
    }

    @Override // android.support.v7.widget.ak, android.content.res.Resources
    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.a.get();
        if (drawable != null && context != null) {
            g.a();
            g.a(context, i, drawable);
        }
        return drawable;
    }
}
