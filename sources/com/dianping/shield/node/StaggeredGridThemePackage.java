package com.dianping.shield.node;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dianping/shield/node/StaggeredGridThemePackage;", "", "()V", "defaultStaggeredBottomMargin", "", "defaultStaggeredLeftMargin", "defaultStaggeredRightMargin", "defaultStaggeredTopMargin", "defaultXStaggeredGridGap", "defaultYStaggeredGridGap", "reset", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridThemePackage {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public int defaultStaggeredBottomMargin;
    @JvmField
    public int defaultStaggeredLeftMargin;
    @JvmField
    public int defaultStaggeredRightMargin;
    @JvmField
    public int defaultStaggeredTopMargin;
    @JvmField
    public int defaultXStaggeredGridGap;
    @JvmField
    public int defaultYStaggeredGridGap;

    public final void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a918eeb00fcf09a4afac73874cb70b80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a918eeb00fcf09a4afac73874cb70b80");
            return;
        }
        this.defaultXStaggeredGridGap = 0;
        this.defaultYStaggeredGridGap = 0;
        this.defaultStaggeredLeftMargin = 0;
        this.defaultStaggeredRightMargin = 0;
        this.defaultStaggeredTopMargin = 0;
        this.defaultStaggeredBottomMargin = 0;
    }
}
