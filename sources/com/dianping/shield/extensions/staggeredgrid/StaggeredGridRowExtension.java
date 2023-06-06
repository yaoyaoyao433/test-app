package com.dianping.shield.extensions.staggeredgrid;

import com.dianping.shield.extensions.RowExtension;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/extensions/staggeredgrid/StaggeredGridRowExtension;", "Lcom/dianping/shield/extensions/RowExtension;", "()V", "createRowNodeInstance", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggeredGridRowExtension extends RowExtension {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.extensions.RowExtension
    @NotNull
    public final ShieldRow createRowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4d0456cd1339392791d20fab5f5469f", RobustBitConfig.DEFAULT_VALUE) ? (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4d0456cd1339392791d20fab5f5469f") : new StaggerGirdShieldRow();
    }
}
