package com.dianping.shield.node.cellnode.callback.lazyload;

import com.dianping.shield.entity.CellType;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
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
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/node/cellnode/callback/lazyload/DefaultShieldRowProviderWithItem;", "Lcom/dianping/shield/node/cellnode/callback/lazyload/LazyLoadShieldRowProvider;", "rowItems", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/useritem/RowItem;", "Lkotlin/collections/ArrayList;", "shieldProcessingUnit", "Lcom/dianping/shield/node/processor/ShieldProcessingUnit;", "(Ljava/util/ArrayList;Lcom/dianping/shield/node/processor/ShieldProcessingUnit;)V", "innerRowItems", "getRowNodeCount", "", "row", "sectionParent", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "getShieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "isPreLoad", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DefaultShieldRowProviderWithItem implements LazyLoadShieldRowProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ArrayList<RowItem> innerRowItems;
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

    public DefaultShieldRowProviderWithItem(@NotNull ArrayList<RowItem> arrayList, @NotNull ShieldProcessingUnit shieldProcessingUnit) {
        h.b(arrayList, "rowItems");
        h.b(shieldProcessingUnit, "shieldProcessingUnit");
        Object[] objArr = {arrayList, shieldProcessingUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f5c8133bc09cb8eebe9e32b9501c687", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f5c8133bc09cb8eebe9e32b9501c687");
            return;
        }
        this.shieldProcessingUnit = shieldProcessingUnit;
        Object clone = arrayList.clone();
        if (clone == null) {
            throw new o("null cannot be cast to non-null type kotlin.collections.ArrayList<com.dianping.shield.node.useritem.RowItem> /* = java.util.ArrayList<com.dianping.shield.node.useritem.RowItem> */");
        }
        this.innerRowItems = (ArrayList) clone;
    }

    @Override // com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider
    public final boolean isPreLoad(int i, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e8fb8a8ee5f0b577bc8d9ac5346be3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e8fb8a8ee5f0b577bc8d9ac5346be3c")).booleanValue();
        }
        h.b(shieldSection, "sectionParent");
        return (this.innerRowItems.get(i).topInfo == null && this.innerRowItems.get(i).bottomInfo == null && this.innerRowItems.get(i).floatViewItem == null) ? false : true;
    }

    @Override // com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider
    public final int getRowNodeCount(int i, @NotNull ShieldSection shieldSection) {
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eabcb6d9c3cdfa04b7cec1c55aa0174", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eabcb6d9c3cdfa04b7cec1c55aa0174")).intValue();
        }
        h.b(shieldSection, "sectionParent");
        LayoutType layoutType = this.innerRowItems.get(i).layoutType;
        if (layoutType != null && WhenMappings.$EnumSwitchMapping$0[layoutType.ordinal()] == 1) {
            return 1;
        }
        ExtensionsRegistry extensionsRegistry = ExtensionsRegistry.INSTANCE;
        RowItem rowItem = this.innerRowItems.get(i);
        h.a((Object) rowItem, "innerRowItems[row]");
        return extensionsRegistry.getRowNodeCount(rowItem);
    }

    @Override // com.dianping.shield.node.cellnode.callback.lazyload.LazyLoadShieldRowProvider
    @NotNull
    public final ShieldRow getShieldRow(int i, @NotNull ShieldSection shieldSection) {
        ShieldViewCell shieldViewCell;
        Object[] objArr = {Integer.valueOf(i), shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a7829e8e1fb00026eaecc8fdef8b7e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a7829e8e1fb00026eaecc8fdef8b7e0");
        }
        h.b(shieldSection, "sectionParent");
        RowItem rowItem = this.innerRowItems.get(i);
        h.a((Object) rowItem, "innerRowItems[row]");
        RowItem rowItem2 = rowItem;
        ShieldRow createRowNodeInstanceWithMapping = ExtensionsRegistry.INSTANCE.createRowNodeInstanceWithMapping(rowItem2, shieldSection);
        createRowNodeInstanceWithMapping.sectionParent = shieldSection;
        createRowNodeInstanceWithMapping.shieldDisplayNodes = new ArrayList<>(b.a(new ShieldDisplayNode[getRowNodeCount(i, shieldSection)]));
        createRowNodeInstanceWithMapping.cellType = CellType.NORMAL;
        ShieldSection shieldSection2 = createRowNodeInstanceWithMapping.sectionParent;
        createRowNodeInstanceWithMapping.typePrefix = (shieldSection2 == null || (shieldViewCell = shieldSection2.cellParent) == null) ? null : shieldViewCell.name;
        this.shieldProcessingUnit.processShieldRow(rowItem2, createRowNodeInstanceWithMapping);
        if (shieldSection.rowMap == null) {
            shieldSection.rowMap = new HashMap<>();
            r rVar = r.a;
        }
        HashMap<RowItem, ShieldRow> hashMap = shieldSection.rowMap;
        if (hashMap != null) {
            hashMap.put(rowItem2, createRowNodeInstanceWithMapping);
        }
        return createRowNodeInstanceWithMapping;
    }
}
