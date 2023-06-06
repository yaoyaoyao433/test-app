package com.dianping.shield.dynamic.items.rowitems.hover;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.cell.HoverCellInfoDiff;
import com.dianping.shield.dynamic.model.cell.HoverCellInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.useritem.RowItem;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001J\t\u0010\u001b\u001a\u00020\fH\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/hover/DynamicHoverRowItem;", "Lcom/dianping/shield/node/useritem/RowItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/cell/HoverCellInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "hoverCellInfoDiff", "Lcom/dianping/shield/dynamic/diff/cell/HoverCellInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/cell/HoverCellInfoDiff;)V", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/HoverCellInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicHoverRowItem extends RowItem implements DynamicDiff<HoverCellInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final DynamicChassisInterface hostChassis;
    private final HoverCellInfoDiff hoverCellInfoDiff;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull HoverCellInfo hoverCellInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {hoverCellInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c367b57751b154269892cbd63626745a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c367b57751b154269892cbd63626745a");
            return;
        }
        h.b(hoverCellInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.hoverCellInfoDiff.diff(hoverCellInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944c272fd1ebb6e17171bbc616b1d42d", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944c272fd1ebb6e17171bbc616b1d42d");
        }
        h.b(str, "identifier");
        return this.hoverCellInfoDiff.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8f1b6263cbf19d9198fd9d67496cae4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8f1b6263cbf19d9198fd9d67496cae4") : this.hoverCellInfoDiff.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fab4e64170c226f2a3ecbdf6728c9a25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fab4e64170c226f2a3ecbdf6728c9a25");
        } else {
            this.hoverCellInfoDiff.onComputingComplete();
        }
    }

    public /* synthetic */ DynamicHoverRowItem(DynamicChassisInterface dynamicChassisInterface, HoverCellInfoDiff hoverCellInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new HoverCellInfoDiff(dynamicChassisInterface) : hoverCellInfoDiff);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(HoverCellInfo hoverCellInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(hoverCellInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    public DynamicHoverRowItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull HoverCellInfoDiff hoverCellInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(hoverCellInfoDiff, "hoverCellInfoDiff");
        Object[] objArr = {dynamicChassisInterface, hoverCellInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68d34c004c917f0417893b77ff17746e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68d34c004c917f0417893b77ff17746e");
            return;
        }
        this.hostChassis = dynamicChassisInterface;
        this.hoverCellInfoDiff = hoverCellInfoDiff;
        this.hoverCellInfoDiff.setDynamicRowItem(this);
    }
}
