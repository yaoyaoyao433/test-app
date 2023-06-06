package com.sankuai.waimai.business.im.group.theme;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    private final int b;
    private final int c;
    private Paint d;
    private String e;
    private final int f;
    private final int g;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public a(@NonNull String str, @NonNull Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a819c02002f8957bc5a9dd6358014697", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a819c02002f8957bc5a9dd6358014697");
            return;
        }
        this.b = -18;
        this.c = 11;
        this.d = new Paint();
        this.e = str;
        this.f = Color.parseColor("#D3D3D3");
        this.g = Color.parseColor("#EFEFEF");
        this.d.setColor(this.f);
        this.d.setAntiAlias(true);
        this.d.setTextSize(g.a(context, 11.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5843b0b7b6d4305ed89d0ba68a7c0506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5843b0b7b6d4305ed89d0ba68a7c0506");
            return;
        }
        int i2 = getBounds().right;
        int i3 = getBounds().bottom;
        canvas.drawColor(this.g);
        canvas.save();
        canvas.rotate(-18.0f);
        float measureText = this.d.measureText(this.e);
        int i4 = i3 / 10;
        int i5 = i4;
        while (i5 <= i3) {
            float f = -i2;
            int i6 = i + 1;
            float f2 = i % 2;
            while (true) {
                f += f2 * measureText;
                if (f < i2) {
                    canvas.drawText(this.e, f, i5, this.d);
                    f2 = 2.0f;
                }
            }
            i5 += i4 + 80;
            i = i6;
        }
        canvas.restore();
    }
}
