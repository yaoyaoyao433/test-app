package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.TextView;
/* compiled from: ProGuard */
@RequiresApi(17)
/* loaded from: classes.dex */
public final class l extends k {
    private au c;
    private au d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(TextView textView) {
        super(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.k
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.a.getContext();
        g a = g.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667}, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.c = a(context, a, obtainStyledAttributes.getResourceId(5, 0));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.d = a(context, a, obtainStyledAttributes.getResourceId(6, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.k
    public final void a() {
        super.a();
        if (this.c == null && this.d == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.c);
        a(compoundDrawablesRelative[2], this.d);
    }
}
