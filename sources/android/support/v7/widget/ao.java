package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ao {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.State state, ai aiVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int max;
        if (layoutManager.getChildCount() == 0 || state.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        int max2 = Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2));
        if (z2) {
            max = Math.max(0, (state.c() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(aiVar.b(view2) - aiVar.a(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (aiVar.b() - aiVar.a(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RecyclerView.State state, ai aiVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || state.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return Math.min(aiVar.e(), aiVar.b(view2) - aiVar.a(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(RecyclerView.State state, ai aiVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.getChildCount() == 0 || state.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return state.c();
        }
        return (int) (((aiVar.b(view2) - aiVar.a(view)) / (Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * state.c());
    }
}
