package com.dianping.shield.dynamic.items.sectionitems.grid;

import com.dianping.shield.component.extensions.gridsection.GridSectionExtension;
import com.dianping.shield.component.extensions.gridsection.GridSectionItem;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.section.GridSectionInfoDiff;
import com.dianping.shield.dynamic.model.section.GridSectionInfo;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J\t\u0010\u0019\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/items/sectionitems/grid/DynamicGridSectionItem;", "Lcom/dianping/shield/component/extensions/gridsection/GridSectionItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/section/GridSectionInfo;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "gridSectionInfoDiff", "Lcom/dianping/shield/dynamic/diff/section/GridSectionInfoDiff;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;Lcom/dianping/shield/dynamic/diff/section/GridSectionInfoDiff;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/section/GridSectionInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicGridSectionItem extends GridSectionItem implements DynamicDiff<GridSectionInfo> {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final GridSectionInfoDiff gridSectionInfoDiff;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull GridSectionInfo gridSectionInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {gridSectionInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "124c721247e1f4f6a057e56cda874c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "124c721247e1f4f6a057e56cda874c40");
            return;
        }
        h.b(gridSectionInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.gridSectionInfoDiff.diff(gridSectionInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b06a4b7a71291eaefa8029c7cc19c44b", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b06a4b7a71291eaefa8029c7cc19c44b");
        }
        h.b(str, "identifier");
        return this.gridSectionInfoDiff.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9858989f35bbefa4f6c94a81c8bc3c6b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9858989f35bbefa4f6c94a81c8bc3c6b") : this.gridSectionInfoDiff.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df74f7104a08a096ca0325c7e9225ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df74f7104a08a096ca0325c7e9225ada");
        } else {
            this.gridSectionInfoDiff.onComputingComplete();
        }
    }

    public /* synthetic */ DynamicGridSectionItem(DynamicChassisInterface dynamicChassisInterface, GridSectionInfoDiff gridSectionInfoDiff, int i, f fVar) {
        this(dynamicChassisInterface, (i & 2) != 0 ? new GridSectionInfoDiff(dynamicChassisInterface) : gridSectionInfoDiff);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(GridSectionInfo gridSectionInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(gridSectionInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    public DynamicGridSectionItem(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull GridSectionInfoDiff gridSectionInfoDiff) {
        h.b(dynamicChassisInterface, "hostChassis");
        h.b(gridSectionInfoDiff, "gridSectionInfoDiff");
        Object[] objArr = {dynamicChassisInterface, gridSectionInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d8b39b950e01f0f8fc965fc4df6651d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d8b39b950e01f0f8fc965fc4df6651d");
            return;
        }
        this.gridSectionInfoDiff = gridSectionInfoDiff;
        this.gridSectionInfoDiff.setSectionItem(this);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/dynamic/items/sectionitems/grid/DynamicGridSectionItem$Companion;", "", "()V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
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
        ExtensionsRegistry.INSTANCE.registerSectionExtension(DynamicGridSectionItem.class, new GridSectionExtension());
    }
}
