package com.dianping.shield.dynamic.items.rowitems.grid;

import com.dianping.shield.component.extensions.grid.GridRowExtension;
import com.dianping.shield.component.extensions.grid.GridRowItem;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.cell.GridCellInfoDiff;
import com.dianping.shield.dynamic.model.cell.GridCellInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J\t\u0010\u0019\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/grid/DynamicGridRowItem;", "Lcom/dianping/shield/component/extensions/grid/GridRowItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/cell/GridCellInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "gridCellInfoDiff", "Lcom/dianping/shield/dynamic/diff/cell/GridCellInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/cell/GridCellInfoDiff;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/GridCellInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicGridRowItem extends GridRowItem implements DynamicDiff<GridCellInfo> {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final GridCellInfoDiff gridCellInfoDiff;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull GridCellInfo gridCellInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {gridCellInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fad3deedafd3e84e357dc7c8ea7d1444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fad3deedafd3e84e357dc7c8ea7d1444");
            return;
        }
        h.b(gridCellInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.gridCellInfoDiff.diff(gridCellInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "835e7b774ea04ad5c4cda7188c086e46", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "835e7b774ea04ad5c4cda7188c086e46");
        }
        h.b(str, "identifier");
        return this.gridCellInfoDiff.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed3591c54d61880ffbd4e5112f2e077b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed3591c54d61880ffbd4e5112f2e077b") : this.gridCellInfoDiff.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8606c5451dbba9d52d186fb1db344b0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8606c5451dbba9d52d186fb1db344b0d");
        } else {
            this.gridCellInfoDiff.onComputingComplete();
        }
    }

    public /* synthetic */ DynamicGridRowItem(DynamicChassisInterface dynamicChassisInterface, GridCellInfoDiff gridCellInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new GridCellInfoDiff(dynamicChassisInterface) : gridCellInfoDiff);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(GridCellInfo gridCellInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(gridCellInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/grid/DynamicGridRowItem$Companion;", "", "()V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DynamicGridRowItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull GridCellInfoDiff gridCellInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(gridCellInfoDiff, "gridCellInfoDiff");
        Object[] objArr = {dynamicChassisInterface, gridCellInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be5319a63fd3da2d4a29bb208ee4a6d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be5319a63fd3da2d4a29bb208ee4a6d5");
            return;
        }
        this.gridCellInfoDiff = gridCellInfoDiff;
        this.gridCellInfoDiff.setDynamicRowItem(this);
    }

    static {
        ExtensionsRegistry.INSTANCE.registerRowExtension(DynamicGridRowItem.class, new GridRowExtension());
    }
}
