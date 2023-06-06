package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: ProGuard */
@NotThreadSafe
/* loaded from: classes.dex */
public final class z {
    public static void a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof y) {
            y yVar = (y) parent;
            if (yVar.getRemoveClippedSubviews()) {
                Rect rect2 = new Rect();
                yVar.getClippingRect(rect2);
                if (!rect2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.setEmpty();
                    return;
                }
                rect2.offset(-view.getLeft(), -view.getTop());
                rect2.offset(view.getScrollX(), view.getScrollY());
                rect.set(rect2);
                return;
            }
        }
        view.getDrawingRect(rect);
    }

    public static boolean a(View view, Rect rect, Point point, View view2, String str) {
        RectF rectF = new RectF();
        rectF.set(rect);
        view.getMatrix().mapRect(rectF);
        int left = view.getLeft() - view2.getScrollX();
        int top = view.getTop() - view2.getScrollY();
        rectF.offset(left, top);
        boolean z = true;
        if (point != null) {
            float[] fArr = {point.x, point.y};
            view.getMatrix().mapPoints(fArr);
            point.x = Math.round(fArr[0]) + left;
            point.y = Math.round(fArr[1]) + top;
        }
        int right = view2.getRight() - view2.getLeft();
        int bottom = view2.getBottom() - view2.getTop();
        ViewParent parent = view2.getParent();
        if (parent == null || "hidden".equals(str)) {
            z = rectF.intersect(0.0f, 0.0f, right, bottom);
        }
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        return (!z || parent == null) ? z : parent.getChildVisibleRect(view2, rect, point);
    }
}
