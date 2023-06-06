package android.support.design.widget;

import android.graphics.PorterDuff;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i == 9) {
                    return PorterDuff.Mode.SRC_ATOP;
                }
                switch (i) {
                    case 14:
                        return PorterDuff.Mode.MULTIPLY;
                    case 15:
                        return PorterDuff.Mode.SCREEN;
                    default:
                        return null;
                }
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
