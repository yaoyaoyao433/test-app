package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    private static final int[] a = {R.attr.colorPrimary};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
