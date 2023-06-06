package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.am;
/* compiled from: ProGuard */
@RequiresApi(17)
/* loaded from: classes.dex */
public final class n extends p {
    @Override // android.support.v7.widget.p, android.support.v7.widget.r
    public final void a() {
        am.a = new am.a() { // from class: android.support.v7.widget.n.1
            @Override // android.support.v7.widget.am.a
            public final void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
