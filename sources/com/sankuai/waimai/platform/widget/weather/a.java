package com.sankuai.waimai.platform.widget.weather;

import android.animation.TypeEvaluator;
import android.graphics.Point;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements TypeEvaluator<Point> {
    public static ChangeQuickRedirect a;
    public float b;
    private Point c;

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Point evaluate(float f, Point point, Point point2) {
        int i;
        Point point3 = point;
        Point point4 = point2;
        Object[] objArr = {Float.valueOf(f), point3, point4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5616162dd5ce36ed9e42997ae3bc77", RobustBitConfig.DEFAULT_VALUE)) {
            return (Point) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5616162dd5ce36ed9e42997ae3bc77");
        }
        if (point3.x == point4.x && point3.y == point4.y) {
            return point3;
        }
        int i2 = (int) ((point4.y - this.c.y) * f);
        int i3 = ((int) ((point4.x - point3.x) * f)) + point3.x;
        int i4 = this.c.y;
        if (this.c.y + i2 < point3.y) {
            i = (int) (i4 + (i2 * (1.0f - f)));
            this.b = f;
        } else {
            i = (int) (point3.y - (i2 * (f - this.b)));
        }
        return new Point(i3, i);
    }

    public a(Point point) {
        Object[] objArr = {point};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64b104c7afa87506f29f8a1e4d994926", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64b104c7afa87506f29f8a1e4d994926");
        } else {
            this.c = point;
        }
    }
}
