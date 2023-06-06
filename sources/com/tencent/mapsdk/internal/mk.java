package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class mk extends TextView {
    private boolean a;

    public mk(Context context, TencentMapContext tencentMapContext) {
        super(context);
        if (this.a || tencentMapContext == null) {
            return;
        }
        this.a = true;
        Typeface typeface = tencentMapContext.getTypeface();
        if (typeface != null) {
            setTypeface(typeface);
        }
    }

    private void a(TencentMapContext tencentMapContext) {
        if (this.a || tencentMapContext == null) {
            return;
        }
        this.a = true;
        Typeface typeface = tencentMapContext.getTypeface();
        if (typeface != null) {
            setTypeface(typeface);
        }
    }
}
