package com.dianping.shield.extensions.staggeredgrid;

import com.dianping.shield.entity.IndexPath;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/dianping/shield/extensions/staggeredgrid/StaggerGirdShieldRow;", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "()V", "getIndexPath", "Lcom/dianping/shield/entity/IndexPath;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class StaggerGirdShieldRow extends ShieldRow {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.shield.node.cellnode.ShieldRow
    @NotNull
    public final IndexPath getIndexPath() {
        IndexPath indexPath;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11669441e4a5609225452576c1069c4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (IndexPath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11669441e4a5609225452576c1069c4f");
        }
        ArrayList<ShieldDisplayNode> arrayList = this.shieldDisplayNodes;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                ShieldDisplayNode shieldDisplayNode = arrayList.get(0);
                indexPath = shieldDisplayNode != null ? shieldDisplayNode.getIndexPath() : null;
            } else {
                indexPath = super.getIndexPath();
            }
            if (indexPath != null) {
                return indexPath;
            }
        }
        return super.getIndexPath();
    }
}
