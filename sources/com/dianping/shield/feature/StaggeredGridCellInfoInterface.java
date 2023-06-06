package com.dianping.shield.feature;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/dianping/shield/feature/StaggeredGridCellInfoInterface;", "", "spanCount", "", "section", "staggeredGridBottomMargin", "staggeredGridLeftMargin", "staggeredGridRightMargin", "staggeredGridTopMargin", "xStaggeredGridGap", "yStaggeredGridGap", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface StaggeredGridCellInfoInterface {

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static int spanCount(StaggeredGridCellInfoInterface staggeredGridCellInfoInterface, int i) {
            return 1;
        }

        public static int staggeredGridBottomMargin(StaggeredGridCellInfoInterface staggeredGridCellInfoInterface, int i) {
            return 0;
        }

        public static int staggeredGridLeftMargin(StaggeredGridCellInfoInterface staggeredGridCellInfoInterface, int i) {
            return 0;
        }

        public static int staggeredGridRightMargin(StaggeredGridCellInfoInterface staggeredGridCellInfoInterface, int i) {
            return 0;
        }

        public static int staggeredGridTopMargin(StaggeredGridCellInfoInterface staggeredGridCellInfoInterface, int i) {
            return 0;
        }

        public static int xStaggeredGridGap(StaggeredGridCellInfoInterface staggeredGridCellInfoInterface, int i) {
            return 0;
        }

        public static int yStaggeredGridGap(StaggeredGridCellInfoInterface staggeredGridCellInfoInterface, int i) {
            return 0;
        }
    }

    int spanCount(int i);

    int staggeredGridBottomMargin(int i);

    int staggeredGridLeftMargin(int i);

    int staggeredGridRightMargin(int i);

    int staggeredGridTopMargin(int i);

    int xStaggeredGridGap(int i);

    int yStaggeredGridGap(int i);
}
