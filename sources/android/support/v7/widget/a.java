package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;
/* compiled from: ProGuard */
@RequiresApi(9)
/* loaded from: classes.dex */
public class a extends Drawable {
    final ActionBarContainer a;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public a(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a.d) {
            if (this.a.c != null) {
                this.a.c.draw(canvas);
                return;
            }
            return;
        }
        if (this.a.a != null) {
            this.a.a.draw(canvas);
        }
        if (this.a.b == null || !this.a.e) {
            return;
        }
        this.a.b.draw(canvas);
    }
}
