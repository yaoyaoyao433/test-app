package android.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m extends View {
    final CharSequence a;
    final Drawable b;
    final int c;

    public m(Context context) {
        this(context, null);
    }

    private m(Context context, AttributeSet attributeSet) {
        super(context, null);
        aw a = aw.a(context, (AttributeSet) null, new int[]{16842754, 16842994, 16843087});
        this.a = a.c(2);
        this.b = a.a(0);
        this.c = a.g(1, 0);
        a.a.recycle();
    }
}
