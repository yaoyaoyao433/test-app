package com.sankuai.waimai.mach.widget.decorations;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private Path b;
    private Paint c;

    public a(com.sankuai.waimai.mach.model.value.a aVar, int i, int i2, float[] fArr) {
        Paint paint;
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2), fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded2654704d4da7a09a6e0d4a69ee3ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded2654704d4da7a09a6e0d4a69ee3ae");
            return;
        }
        this.b = new Path();
        float f = aVar.b * 0.5f;
        this.b.addRoundRect(new RectF(f, f, i - f, i2 - f), fArr, Path.Direction.CW);
        Path path = this.b;
        Object[] objArr2 = {aVar, path};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d1b2738379adefaae7a505e39944561", RobustBitConfig.DEFAULT_VALUE)) {
            paint = (Paint) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d1b2738379adefaae7a505e39944561");
        } else {
            float f2 = aVar.b;
            float f3 = 0.5f * f2;
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(true);
            paint2.setColor(aVar.d);
            paint2.setStrokeWidth(f2);
            String str = aVar.c;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1338941519) {
                if (hashCode != -1325970902) {
                    if (hashCode == 109618859 && str.equals("solid")) {
                        c = 2;
                    }
                } else if (str.equals("dotted")) {
                    c = 0;
                }
            } else if (str.equals("dashed")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    Path path2 = new Path();
                    path2.addCircle(f3, f3, f3, Path.Direction.CW);
                    paint2.setPathEffect(new PathDashPathEffect(path2, f2 * 1.4f, 0.0f, PathDashPathEffect.Style.TRANSLATE));
                    Matrix matrix = new Matrix();
                    float f4 = -f3;
                    matrix.setTranslate(f4, f4);
                    path.transform(matrix);
                    break;
                case 1:
                    paint2.setPathEffect(new DashPathEffect(new float[]{1.4f * f2, f2 * 0.8f}, 0.0f));
                    break;
            }
            paint = paint2;
        }
        this.c = paint;
    }

    @Override // com.sankuai.waimai.mach.widget.decorations.c
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51b9b3abe785e00f7cab852a6f1add75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51b9b3abe785e00f7cab852a6f1add75");
        } else {
            canvas.drawPath(this.b, this.c);
        }
    }
}
