package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ap {
    private static final float[] a = new float[2];
    private static final PointF b = new PointF();
    private static final float[] c = new float[2];
    private static final Matrix d = new Matrix();

    public static int a(float f, float f2, ViewGroup viewGroup) {
        return a(f, f2, viewGroup, a, (int[]) null);
    }

    public static int a(float f, float f2, ViewGroup viewGroup, float[] fArr, @Nullable int[] iArr) {
        View a2;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View a3 = a(fArr, viewGroup);
        return (a3 == null || (a2 = a(a3)) == null) ? id : a(a2, fArr[0], fArr[1]);
    }

    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    private static View a(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        ai aiVar = viewGroup instanceof ai ? (ai) viewGroup : null;
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = viewGroup.getChildAt(aiVar != null ? aiVar.getZIndexMappedChildIndex(i) : i);
            PointF pointF = b;
            if (a(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View a2 = a(fArr, childAt);
                if (a2 != null) {
                    return a2;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return viewGroup;
    }

    private static boolean a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        if (view == null) {
            return false;
        }
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof com.facebook.react.touch.c) {
            com.facebook.react.touch.c cVar = (com.facebook.react.touch.c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                if (scrollX < (-hitSlopRect.left) || scrollX >= (view.getRight() - view.getLeft()) + hitSlopRect.right || scrollY < (-hitSlopRect.top) || scrollY >= (view.getBottom() - view.getTop()) + hitSlopRect.bottom) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < 0.0f || scrollX >= view.getRight() - view.getLeft() || scrollY < 0.0f || scrollY >= view.getBottom() - view.getTop()) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }

    @Nullable
    private static View a(float[] fArr, View view) {
        x pointerEvents = view instanceof ac ? ((ac) view).getPointerEvents() : x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == x.AUTO) {
                pointerEvents = x.BOX_NONE;
            } else if (pointerEvents == x.BOX_ONLY) {
                pointerEvents = x.NONE;
            }
        }
        if (pointerEvents == x.NONE) {
            return null;
        }
        if (pointerEvents == x.BOX_ONLY) {
            return view;
        }
        if (pointerEvents == x.BOX_NONE) {
            if (view instanceof ViewGroup) {
                View a2 = a(fArr, (ViewGroup) view);
                if (a2 != view) {
                    return a2;
                }
                if ((view instanceof aa) && ((aa) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                    return view;
                }
            }
            return null;
        } else if (pointerEvents == x.AUTO) {
            return (!((view instanceof ab) && ((ab) view).interceptsTouchEvent(fArr[0], fArr[1])) && (view instanceof ViewGroup)) ? a(fArr, (ViewGroup) view) : view;
        } else {
            throw new JSApplicationIllegalArgumentException("Unknown pointer event type: " + pointerEvents.toString());
        }
    }

    private static int a(View view, float f, float f2) {
        if (view instanceof aa) {
            return ((aa) view).reactTagForTouch(f, f2);
        }
        return view.getId();
    }
}
