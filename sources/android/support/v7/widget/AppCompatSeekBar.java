package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {
    private final j a;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new j(this);
        this.a.a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        j jVar = this.a;
        if (jVar.c != null) {
            int max = jVar.b.getMax();
            if (max > 1) {
                int intrinsicWidth = jVar.c.getIntrinsicWidth();
                int intrinsicHeight = jVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                jVar.c.setBounds(-i, -i2, i, i2);
                float width = ((jVar.b.getWidth() - jVar.b.getPaddingLeft()) - jVar.b.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(jVar.b.getPaddingLeft(), jVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    jVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        j jVar = this.a;
        Drawable drawable = jVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(jVar.b.getDrawableState())) {
            jVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    @RequiresApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        j jVar = this.a;
        if (jVar.c != null) {
            jVar.c.jumpToCurrentState();
        }
    }
}
