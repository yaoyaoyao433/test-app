package com.meituan.android.common.weaver.impl.natives;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.weaver.impl.WeaverProxy;
import com.meituan.android.common.weaver.impl.natives.matchers.AbstractViewMatcher;
import com.meituan.android.common.weaver.impl.utils.DisplayUtil;
import com.meituan.android.common.weaver.impl.utils.Logger;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GridsChecker {
    public static boolean ALL_GRID = false;
    public static ChangeQuickRedirect changeQuickRedirect;
    @GuardedBy("sNodePool")
    private static final LinkedList<ViewGroupNode> sNodePool = new LinkedList<>();
    @GuardedBy("sRectPool")
    private static final LinkedList<Rect> sRectPool = new LinkedList<>();
    public Grid bottomGrid;
    private int gridHeight;
    private int gridWidth;
    public boolean isAfterDraw;
    private int lastBottom;
    private long lastCheckFinishTime;
    public int lastChildCount;
    private int lastHeight;
    private int lastWidth;
    public int mGridValidCount;
    public final Grid[] mGrids;
    private boolean mIsMatchRule;
    private int miniPageHeight;
    private int miniPageWidth;
    private final int validGrids;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Grid {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean isContainView;
        @NonNull
        public final String name;
        @NonNull
        public final Rect rect;

        @VisibleForTesting
        public Grid(@NonNull String str, @NonNull Rect rect) {
            Object[] objArr = {str, rect};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f945756d214a100a09a30e158cc3e2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f945756d214a100a09a30e158cc3e2f");
                return;
            }
            this.name = str;
            this.rect = rect;
        }

        public boolean isViewInGrid(@NonNull Rect rect) {
            Object[] objArr = {rect};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28d324e60e10f2e635f55da18bef7476", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28d324e60e10f2e635f55da18bef7476")).booleanValue() : rect.right > this.rect.left && rect.bottom > this.rect.top && rect.left < this.rect.right && rect.top < this.rect.bottom;
        }
    }

    public GridsChecker(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c9b0fb2f4ff6c8729ea4f53cef77c50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c9b0fb2f4ff6c8729ea4f53cef77c50");
            return;
        }
        this.mGrids = new Grid[18];
        this.mGridValidCount = 0;
        this.isAfterDraw = false;
        this.lastChildCount = 0;
        this.miniPageWidth = 400;
        this.miniPageHeight = 400;
        this.validGrids = i;
        if (WeaverProxy.mConfig == null || WeaverProxy.mConfig.miniPageWidth() <= 0 || WeaverProxy.mConfig.miniPageHeight() <= 0) {
            return;
        }
        this.miniPageWidth = WeaverProxy.mConfig.miniPageWidth();
        this.miniPageHeight = WeaverProxy.mConfig.miniPageHeight();
    }

    public void onePiece(@NonNull Activity activity, @NonNull View view, @NonNull List<AbstractViewMatcher> list, boolean z) {
        boolean z2;
        ViewGroupNode generateViewGroupNode;
        Object[] objArr = {activity, view, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b534694ee0f935ef1589131554869678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b534694ee0f935ef1589131554869678");
        } else if (view.getMeasuredWidth() >= this.miniPageWidth && view.getMeasuredHeight() >= this.miniPageHeight) {
            this.isAfterDraw = z;
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            int i = rect.bottom;
            int min = Math.min(rect.height() + rect.top, view.getMeasuredHeight());
            int measuredWidth = view.getMeasuredWidth();
            if (this.lastWidth != measuredWidth || this.lastHeight != min) {
                int i2 = ((activity.getWindow().getAttributes().softInputMode & 240) != 32 || i >= this.lastBottom) ? 0 : this.lastBottom - i;
                this.lastBottom = i;
                this.lastWidth = measuredWidth;
                this.lastHeight = min;
                Logger logger = Logger.getLogger();
                logger.d("newHeight: " + min, " windowInsets:" + i2);
                generateGrids(view.getContext(), i2, this.lastWidth, this.lastHeight);
                Logger.getLogger().update18Grids(0, 0, this.lastWidth, this.lastHeight);
            }
            this.mGridValidCount = 0;
            this.mIsMatchRule = false;
            resetGrids();
            LinkedList linkedList = new LinkedList();
            if (view instanceof ViewGroup) {
                Rect newRect = newRect();
                newRect.set(0, 0, this.lastWidth, this.lastHeight);
                linkedList.push(newGroupNode((ViewGroup) view, newRect, Integer.MAX_VALUE));
            }
            int i3 = 0;
            while (!linkedList.isEmpty()) {
                ViewGroupNode viewGroupNode = (ViewGroupNode) linkedList.pop();
                i3 = i3 + 1 + viewGroupNode.view.getChildCount();
                for (int i4 = 0; i4 < viewGroupNode.view.getChildCount(); i4++) {
                    View childAt = viewGroupNode.view.getChildAt(i4);
                    Iterator<AbstractViewMatcher> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = true;
                            break;
                        }
                        AbstractViewMatcher next = it.next();
                        if (next.match(childAt)) {
                            z2 = next.viewFillGrids(this, childAt, viewGroupNode.rect, viewGroupNode.grids);
                            if (this.mGridValidCount >= this.validGrids) {
                                viewGroupNode.recycle();
                                this.mIsMatchRule = true;
                                return;
                            }
                        }
                    }
                    if (z2 && (childAt instanceof ViewGroup) && (generateViewGroupNode = generateViewGroupNode((ViewGroup) childAt, viewGroupNode.rect, viewGroupNode.grids)) != null) {
                        linkedList.addFirst(generateViewGroupNode);
                    }
                }
                viewGroupNode.recycle();
            }
            if (z && this.lastChildCount == i3) {
                Logger.getLogger().d("after draw but view is stable，ignore this time");
                return;
            }
            this.lastChildCount = i3;
            this.lastCheckFinishTime = FFPUtil.currentTimeMillis();
        }
    }

    public float getRenderRate() {
        return this.mGridValidCount / 18.0f;
    }

    public long getLastCheckFinishTime() {
        return this.lastCheckFinishTime;
    }

    public boolean getReachBottom() {
        return this.bottomGrid != null && this.bottomGrid.isContainView;
    }

    public int getCurrentWidth() {
        return this.lastWidth;
    }

    public int getCurrentHeight() {
        return this.lastHeight;
    }

    @Nullable
    private ViewGroupNode generateViewGroupNode(ViewGroup viewGroup, Rect rect, int i) {
        int i2;
        Object[] objArr = {viewGroup, rect, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c41e8662390a43882deba107014c2e20", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroupNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c41e8662390a43882deba107014c2e20");
        }
        if (viewGroup.getVisibility() != 0) {
            return null;
        }
        Rect newRect = newRect();
        viewGroup.getHitRect(newRect);
        newRect.set(rect.left + newRect.left, rect.top + newRect.top, rect.left + newRect.right, rect.top + newRect.bottom);
        if (ALL_GRID) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = 0;
            for (int i3 = 0; i3 < this.mGrids.length; i3++) {
                int i4 = 1 << i3;
                if ((i4 & i) != 0) {
                    Grid grid = this.mGrids[i3];
                    if (!grid.isContainView && grid.isViewInGrid(newRect)) {
                        i2 |= i4;
                    }
                }
            }
        }
        newRect.set(newRect.left - viewGroup.getScrollX(), newRect.top - viewGroup.getScrollY(), newRect.right - viewGroup.getScrollX(), newRect.bottom - viewGroup.getScrollY());
        if (i2 == 0) {
            recycleRect(newRect);
            return null;
        }
        return newGroupNode(viewGroup, newRect, i2);
    }

    private void generateGrids(Context context, int i, int i2, int i3) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c33a1b36a859f5e22ad66447a8c59f3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c33a1b36a859f5e22ad66447a8c59f3d");
            return;
        }
        Logger.getLogger().d("width:", Integer.valueOf(i2), ", height:", Integer.valueOf(i3));
        this.gridWidth = i2 / 3;
        this.gridHeight = i3 / 6;
        int i4 = 0;
        for (int i5 = 3; i4 < i5; i5 = 3) {
            for (int i6 = 0; i6 < 6; i6++) {
                int i7 = (i6 * 3) + i4;
                Rect newRect = newRect();
                newRect.set(this.gridWidth * i4, i + (this.gridHeight * i6), (this.gridWidth * i4) + this.gridWidth, i + (this.gridHeight * i6) + this.gridHeight);
                Grid grid = new Grid(String.valueOf(i7), newRect);
                Logger.getLogger().d("generateGrid: ", Integer.valueOf(i7), ", ", newRect);
                this.mGrids[i7] = grid;
            }
            i4++;
        }
        int dp2Px = DisplayUtil.dp2Px(context, 70.0f);
        Rect newRect2 = newRect();
        newRect2.set(0, i3 - dp2Px, i2, i3);
        this.bottomGrid = new Grid("bottom", newRect2);
    }

    private void resetGrids() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e570ca7d7eb639a6b88af917734af877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e570ca7d7eb639a6b88af917734af877");
            return;
        }
        for (Grid grid : this.mGrids) {
            grid.isContainView = false;
        }
        if (this.bottomGrid != null) {
            this.bottomGrid.isContainView = false;
        }
    }

    public boolean isMatchRule() {
        return this.mIsMatchRule;
    }

    private ViewGroupNode newGroupNode(@NonNull ViewGroup viewGroup, @NonNull Rect rect, int i) {
        ViewGroupNode pop;
        Object[] objArr = {viewGroup, rect, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a43dba01039432eda77793f8ddfcd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroupNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a43dba01039432eda77793f8ddfcd2");
        }
        synchronized (sNodePool) {
            pop = sNodePool.isEmpty() ? null : sNodePool.pop();
        }
        if (pop == null) {
            pop = new ViewGroupNode();
        }
        pop.view = viewGroup;
        pop.rect = rect;
        pop.grids = i;
        return pop;
    }

    public static void recycleRect(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4bbcd46218f102acd1963eb4746738b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4bbcd46218f102acd1963eb4746738b2");
            return;
        }
        synchronized (sRectPool) {
            if (sRectPool.size() <= 100) {
                sRectPool.add(rect);
            }
        }
    }

    public static Rect newRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "960d7637a5181e2f470062253a7f4b22", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "960d7637a5181e2f470062253a7f4b22");
        }
        synchronized (sRectPool) {
            if (!sRectPool.isEmpty()) {
                return sRectPool.pop();
            }
            return new Rect();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ViewGroupNode {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int grids;
        private Rect rect;
        private ViewGroup view;

        public void recycle() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7a798fa31f447d8b352847057435f25", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7a798fa31f447d8b352847057435f25");
                return;
            }
            if (this.rect != null) {
                GridsChecker.recycleRect(this.rect);
                this.rect = null;
            }
            if (this.view != null) {
                this.view = null;
            }
            synchronized (GridsChecker.sNodePool) {
                if (GridsChecker.sNodePool.size() <= 100) {
                    GridsChecker.sNodePool.add(this);
                }
            }
        }
    }
}
