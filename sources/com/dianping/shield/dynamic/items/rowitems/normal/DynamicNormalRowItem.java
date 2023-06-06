package com.dianping.shield.dynamic.items.rowitems.normal;

import com.dianping.shield.component.extensions.normal.NormalRowExtension;
import com.dianping.shield.component.extensions.normal.NormalRowItem;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.cell.NormalCellInfoDiff;
import com.dianping.shield.dynamic.model.cell.NormalCellInfo;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001J\t\u0010\u001b\u001a\u00020\fH\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/normal/DynamicNormalRowItem;", "Lcom/dianping/shield/component/extensions/normal/NormalRowItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "normalCellInfoDiff", "Lcom/dianping/shield/dynamic/diff/cell/NormalCellInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/cell/NormalCellInfoDiff;)V", "getHostChassis", "()Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicNormalRowItem extends NormalRowItem implements DynamicDiff<NormalCellInfo> {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final /* synthetic */ NormalCellInfoDiff $$delegate_0;
    @NotNull
    private final DynamicChassisInterface hostChassis;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull NormalCellInfo normalCellInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {normalCellInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28cd45df5d6815b9ed00ddd01e4a6c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28cd45df5d6815b9ed00ddd01e4a6c50");
            return;
        }
        h.b(normalCellInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.$$delegate_0.diff(normalCellInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3f5175ef9864442295bae3de8f74226", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3f5175ef9864442295bae3de8f74226");
        }
        h.b(str, "identifier");
        return this.$$delegate_0.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22eec1de155b3150fd7047548d5034fc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22eec1de155b3150fd7047548d5034fc") : this.$$delegate_0.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "477c05e852d2610b10cd1ccef98f192f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "477c05e852d2610b10cd1ccef98f192f");
        } else {
            this.$$delegate_0.onComputingComplete();
        }
    }

    public DynamicNormalRowItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull NormalCellInfoDiff normalCellInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(normalCellInfoDiff, "normalCellInfoDiff");
        Object[] objArr = {dynamicChassisInterface, normalCellInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5d5adf7e44a140339ba3b32b240977b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5d5adf7e44a140339ba3b32b240977b");
            return;
        }
        this.$$delegate_0 = normalCellInfoDiff;
        this.hostChassis = dynamicChassisInterface;
        normalCellInfoDiff.setDynamicRowItem(this);
    }

    public /* synthetic */ DynamicNormalRowItem(DynamicChassisInterface dynamicChassisInterface, NormalCellInfoDiff normalCellInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new NormalCellInfoDiff(dynamicChassisInterface) : normalCellInfoDiff);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(NormalCellInfo normalCellInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(normalCellInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @NotNull
    public final DynamicChassisInterface getHostChassis() {
        return this.hostChassis;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/dynamic/items/rowitems/normal/DynamicNormalRowItem$Companion;", "", "()V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        ExtensionsRegistry.INSTANCE.registerRowExtension(DynamicNormalRowItem.class, new NormalRowExtension());
    }
}
