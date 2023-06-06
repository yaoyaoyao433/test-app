package com.tencent.mapsdk.internal;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mj extends Paint {
    private WeakReference<TencentMapContext> a;

    public mj(TencentMapContext tencentMapContext) {
        this.a = new WeakReference<>(tencentMapContext);
    }

    @Override // android.graphics.Paint
    public final Typeface setTypeface(Typeface typeface) {
        TencentMapContext tencentMapContext;
        if (this.a == null || (tencentMapContext = this.a.get()) == null) {
            return super.setTypeface(typeface);
        }
        Typeface typeface2 = tencentMapContext.getTypeface();
        if (typeface2 != null && (Typeface.DEFAULT == typeface || Typeface.DEFAULT_BOLD == typeface)) {
            return super.setTypeface(typeface2);
        }
        return super.setTypeface(typeface);
    }
}
