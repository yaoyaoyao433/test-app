package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements BaseTransientBottomBar.a {
    private TextView a;
    private Button b;
    private int c;
    private int d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843039, R.attr.elevation, R.attr.maxActionInlineWidth});
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    public TextView getMessageView() {
        return this.a;
    }

    public Button getActionView() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (a(1, r0, r0 - r1) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        if (a(0, r0, r0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        r4 = false;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.c
            if (r0 <= 0) goto L1a
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.c
            if (r0 <= r1) goto L1a
            int r8 = r7.c
            r0 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            super.onMeasure(r8, r9)
        L1a:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131296285(0x7f09001d, float:1.8210482E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131296651(0x7f09018b, float:1.8211225E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L40
            r2 = 1
            goto L41
        L40:
            r2 = 0
        L41:
            if (r2 == 0) goto L5a
            int r5 = r7.d
            if (r5 <= 0) goto L5a
            android.widget.Button r5 = r7.b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.d
            if (r5 <= r6) goto L5a
            int r1 = r0 - r1
            boolean r0 = r7.a(r4, r0, r1)
            if (r0 == 0) goto L65
            goto L66
        L5a:
            if (r2 == 0) goto L5d
            goto L5e
        L5d:
            r0 = r1
        L5e:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L65
            goto L66
        L65:
            r4 = 0
        L66:
            if (r4 == 0) goto L6b
            super.onMeasure(r8, r9)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.internal.SnackbarContentLayout.onMeasure(int, int):void");
    }

    private boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        a(this.a, i2, i3);
        return true;
    }

    private static void a(View view, int i, int i2) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // android.support.design.widget.BaseTransientBottomBar.a
    public final void a(int i, int i2) {
        this.a.setAlpha(0.0f);
        this.a.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
        }
    }

    @Override // android.support.design.widget.BaseTransientBottomBar.a
    public final void b(int i, int i2) {
        this.a.setAlpha(1.0f);
        this.a.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
        }
    }
}
