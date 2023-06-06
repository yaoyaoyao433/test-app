package com.meituan.android.common.weaver.impl.natives.matchers;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.android.common.weaver.impl.natives.GridsChecker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbstractViewMatcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashSet<View> filledViews;

    public boolean match(View view) {
        return false;
    }

    public AbstractViewMatcher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a81614ee5ebe963f453a41e7e253a4c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a81614ee5ebe963f453a41e7e253a4c1");
        } else {
            this.filledViews = new HashSet<>();
        }
    }

    public boolean viewFillGrids(@NonNull GridsChecker gridsChecker, @NonNull View view, @NonNull Rect rect, int i) {
        Object[] objArr = {gridsChecker, view, rect, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f63907bb83983e286ce47f02280108b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f63907bb83983e286ce47f02280108b0")).booleanValue();
        }
        Rect newRect = GridsChecker.newRect();
        view.getHitRect(newRect);
        newRect.set(rect.left + newRect.left, rect.top + newRect.top, rect.left + newRect.right, rect.top + newRect.bottom);
        rectFillGrids(gridsChecker, newRect, i, view.getClass().getSimpleName() + view.toString(), view);
        GridsChecker.recycleRect(newRect);
        return false;
    }

    public void rectFillGrids(@NonNull GridsChecker gridsChecker, @NonNull Rect rect, int i, String str, View view) {
        Object[] objArr = {gridsChecker, rect, Integer.valueOf(i), str, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4ba7f3bd7f9f1090c5fec538d4c474a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4ba7f3bd7f9f1090c5fec538d4c474a");
            return;
        }
        for (int i2 = 0; i2 < gridsChecker.mGrids.length; i2++) {
            if (((1 << i2) & i) != 0) {
                GridsChecker.Grid grid = gridsChecker.mGrids[i2];
                if (!grid.isContainView && grid.isViewInGrid(rect)) {
                    grid.isContainView = true;
                    gridsChecker.mGridValidCount++;
                    this.filledViews.add(view);
                }
            }
        }
        if (gridsChecker.bottomGrid.isViewInGrid(rect)) {
            gridsChecker.bottomGrid.isContainView = true;
        }
    }

    public HashSet<View> getFilledViews() {
        return this.filledViews;
    }
}
