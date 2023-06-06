package android.support.v7.widget;

import android.content.Context;
import android.support.constraint.R;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.widget.ListViewAutoScrollHelper;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class y extends ListViewCompat {
    private boolean g;
    private boolean h;
    private boolean i;
    private ViewPropertyAnimatorCompat j;
    private ListViewAutoScrollHelper k;

    public y(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.h = z;
        setCacheColorHint(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MotionEvent r11, int r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.y.a(android.view.MotionEvent, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.ListViewCompat
    public final boolean a() {
        return this.i || super.a();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.h && this.g) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.h || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.h || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.h || super.hasFocus();
    }
}
