package com.tencent.mapsdk.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pt extends Drawable {
    private static final int a = -12028419;
    private Paint b = new Paint();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public pt() {
        this.b.setAntiAlias(true);
        if (sd.c.equals(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE)) {
            this.b.setColor(-16531104);
        } else {
            this.b.setColor(a);
        }
    }

    private void a(int i) {
        this.b.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        canvas.drawCircle(getBounds().width() / 2.0f, getBounds().height() / 2.0f, getBounds().width() / 2.0f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }
}
