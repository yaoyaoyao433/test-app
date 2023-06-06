package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends b {
        @Override // android.support.v7.widget.helper.c.b, android.support.v7.widget.helper.b
        public final void a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(ViewCompat.getElevation(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        float elevation = ViewCompat.getElevation(childAt);
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                ViewCompat.setElevation(view, 1.0f + f3);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            super.a(canvas, recyclerView, view, f, f2, i, z);
        }

        @Override // android.support.v7.widget.helper.c.b, android.support.v7.widget.helper.b
        public final void a(View view) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                ViewCompat.setElevation(view, ((Float) tag).floatValue());
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            super.a(view);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b implements android.support.v7.widget.helper.b {
        @Override // android.support.v7.widget.helper.b
        public void a(View view) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        @Override // android.support.v7.widget.helper.b
        public void a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }
    }
}
