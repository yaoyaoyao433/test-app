package com.dianping.shield.node.cellnode;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.entity.IndexPath;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/node/cellnode/NodePath;", "", "()V", "cell", "", "cellType", "Lcom/dianping/shield/entity/CellType;", "group", "indexPath", "Lcom/dianping/shield/entity/IndexPath;", "node", "row", "section", "equals", "", "other", "hashCode", "toString", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NodePath {
    public static ChangeQuickRedirect changeQuickRedirect;
    @JvmField
    public int cell;
    @JvmField
    @Nullable
    public CellType cellType;
    @JvmField
    public int group;
    @JvmField
    @Nullable
    public IndexPath indexPath;
    @JvmField
    public int node;
    @JvmField
    public int row;
    @JvmField
    public int section;

    public NodePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83506a6043cb7aff3889b2818793ac49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83506a6043cb7aff3889b2818793ac49");
            return;
        }
        this.group = -1;
        this.cell = -1;
        this.section = -1;
        this.row = -3;
        this.node = -1;
    }

    public final boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6082dd02b6e3ca74d0e81fd06d184190", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6082dd02b6e3ca74d0e81fd06d184190")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!h.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            NodePath nodePath = (NodePath) obj;
            return this.group == nodePath.group && this.cell == nodePath.cell && this.section == nodePath.section && this.row == nodePath.row && this.cellType == nodePath.cellType;
        }
        throw new o("null cannot be cast to non-null type com.dianping.shield.node.cellnode.NodePath");
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f0aeddc81e637b5425dc8cb4b0932f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f0aeddc81e637b5425dc8cb4b0932f")).intValue();
        }
        int i = ((((((this.group * 31) + this.cell) * 31) + this.section) * 31) + this.row) * 31;
        CellType cellType = this.cellType;
        return i + (cellType != null ? cellType.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "286945d9b357e0fa40928897afc7613c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "286945d9b357e0fa40928897afc7613c");
        }
        return "NodePath(group=" + this.group + ", cell=" + this.cell + ", section=" + this.section + ", row=" + this.row + ", cellType=" + this.cellType + ')';
    }
}
