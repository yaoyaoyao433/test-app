package android.support.v4.graphics;

import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class PaintCompat {
    public static boolean hasGlyph(@NonNull Paint paint, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        return PaintCompatApi14.hasGlyph(paint, str);
    }

    private PaintCompat() {
    }
}
