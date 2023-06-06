package com.dianping.shield.node.cellnode.callback.lazyload;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.itemcallbacks.lazy.LazyLoadRowItemProvider;
import com.dianping.shield.node.processor.ShieldProcessingUnit;
import com.dianping.shield.node.useritem.LayoutType;
import com.dianping.shield.node.useritem.RowItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.h;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/lazyload/DefaultShieldRowProvider;", "Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadShieldRowProvider;", "itemProvider", "Lcom/dianping/shield/node/itemcallbacks/lazy/LazyLoadRowItemProvider;", "shieldProcessingUnit", "Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "(Lcom/dianping/shield/node/itemcallbacks/lazy/LazyLoadRowItemProvider;Lcom/dianping/shield/node/processor/ShieldProcessingUnit;)V", "getRowNodeCount", "", "row", "sectionParent", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "getShieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "isPreLoad", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultShieldRowProvider implements LazyLoadShieldRowProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final LazyLoadRowItemProvider itemProvider;
    private final ShieldProcessingUnit shieldProcessingUnit;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[LayoutType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LayoutType.LINEAR_FULL_FILL.ordinal()] = 1;
        }
    }

    public DefaultShieldRowProvider(@NotNull LazyLoadRowItemProvider lazyLoadRowItemProvider, @NotNull ShieldProcessingUnit shieldProcessingUnit) {
        h.b(lazyLoadRowItemProvider, "itemProvider");
        h.b(shieldProcessingUnit, "shieldProcessingUnit");
        Object[] objArr = {lazyLoadRowItemProvider, shieldProcessingUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5288d0ba6c4d12cdcd6a08f8cc8a5818", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5288d0ba6c4d12cdcd6a08f8cc8a5818");
            return;
        }
        this.itemProvider = lazyLoadRowItemProvider;
        this.shieldProcessingUnit = shieldProcessingUnit;
    }

    @Override // com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider
    public final boolean isPreLoad(int i, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40149731e86aa43e1ffa0b79dd971041", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40149731e86aa43e1ffa0b79dd971041")).booleanValue();
        }
        h.b(shieldSection, "sectionParent");
        return this.itemProvider.isPreLoad(shieldSection.currentSectionIndex(), i);
    }

    @Override // com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider
    public final int getRowNodeCount(int i, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ac978825027e4384bc2ec696b7f061c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ac978825027e4384bc2ec696b7f061c")).intValue();
        }
        h.b(shieldSection, "sectionParent");
        if (WhenMappings.$EnumSwitchMapping$0[this.itemProvider.getRowLayoutType(shieldSection.currentSectionIndex(), i).ordinal()] != 1) {
            return this.itemProvider.getRowViewCount(shieldSection.currentSectionIndex(), i);
        }
        return 1;
    }

    @Override // com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider
    @NotNull
    public final ShieldRow getShieldRow(int i, @NotNull ShieldSection shieldSection) {
        ShieldViewCell shieldViewCell;
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5cfdd2f7e778b719b0ae9eb006c0e5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5cfdd2f7e778b719b0ae9eb006c0e5e");
        }
        h.b(shieldSection, "sectionParent");
        RowItem rowItem = this.itemProvider.getRowItem(shieldSection.currentSectionIndex(), i);
        ShieldRow createRowNodeInstanceWithMapping = ExtensionsRegistry.INSTANCE.createRowNodeInstanceWithMapping(rowItem, shieldSection);
        createRowNodeInstanceWithMapping.sectionParent = shieldSection;
        createRowNodeInstanceWithMapping.shieldDisplayNodes = new ArrayList<>(b.a(new ShieldDisplayNode[getRowNodeCount(i, shieldSection)]));
        createRowNodeInstanceWithMapping.cellType = CellType.NORMAL;
        ShieldSection shieldSection2 = createRowNodeInstanceWithMapping.sectionParent;
        createRowNodeInstanceWithMapping.typePrefix = (shieldSection2 == null || (shieldViewCell = shieldSection2.cellParent) == null) ? null : shieldViewCell.name;
        this.shieldProcessingUnit.processShieldRow(rowItem, createRowNodeInstanceWithMapping);
        if (shieldSection.rowMap == null) {
            shieldSection.rowMap = new HashMap<>();
            r rVar = r.a;
        }
        HashMap<RowItem, ShieldRow> hashMap = shieldSection.rowMap;
        if (hashMap != null) {
            hashMap.put(rowItem, createRowNodeInstanceWithMapping);
        }
        return createRowNodeInstanceWithMapping;
    }
}
