package com.dianping.shield.extensions;

import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.dianping.shield.node.cellnode.ShieldRow;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.useritem.RowItem;
import com.dianping.shield.node.useritem.SectionItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\rJ\u0016\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0011J\u0016\u0010$\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u001d\u0010%\u001a\u0004\u0018\u00010\b2\u0013\u0010&\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005J\u001d\u0010'\u001a\u0004\u0018\u00010\u000e2\u0013\u0010(\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\r¢\u0006\u0002\b\u00070\u0005J\u000e\u0010)\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\rJ\u001d\u0010+\u001a\u0004\u0018\u00010\u00122\u0013\u0010,\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u0005J#\u0010-\u001a\u00020.2\u0013\u0010&\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u00052\u0006\u0010/\u001a\u00020\bJ#\u00100\u001a\u00020.2\u0013\u0010(\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\r¢\u0006\u0002\b\u00070\u00052\u0006\u00101\u001a\u00020\u000eJ#\u00102\u001a\u00020.2\u0013\u0010,\u001a\u000f\u0012\u000b\b\u0001\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u00052\u0006\u00103\u001a\u00020\u0012RJ\u0010\u0003\u001a8\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005\u0012\u0004\u0012\u00020\b0\u0004j\u001b\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005\u0012\u0004\u0012\u00020\b`\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bRJ\u0010\f\u001a8\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\r¢\u0006\u0002\b\u00070\u0005\u0012\u0004\u0012\u00020\u000e0\u0004j\u001b\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\r¢\u0006\u0002\b\u00070\u0005\u0012\u0004\u0012\u00020\u000e`\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bRJ\u0010\u0010\u001a8\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u0005\u0012\u0004\u0012\u00020\u00120\u0004j\u001b\u0012\u0011\u0012\u000f\u0012\u000b\b\u0001\u0012\u00070\u0011¢\u0006\u0002\b\u00070\u0005\u0012\u0004\u0012\u00020\u0012`\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u00064"}, d2 = {"Lcom/dianping/shield/extensions/ExtensionsRegistry;", "", "()V", "nodeExtensions", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lkotlin/jvm/JvmWildcard;", "Lcom/dianping/shield/extensions/NodeExtension;", "Lkotlin/collections/HashMap;", "getNodeExtensions$shieldCore_release", "()Ljava/util/HashMap;", "rowExtensions", "Lcom/dianping/shield/node/useritem/RowItem;", "Lcom/dianping/shield/extensions/RowExtension;", "getRowExtensions$shieldCore_release", "sectionExtensions", "Lcom/dianping/shield/node/useritem/SectionItem;", "Lcom/dianping/shield/extensions/SectionExtension;", "getSectionExtensions$shieldCore_release", "createDisplayNodeInstance", "Lcom/dianping/shield/node/cellnode/ShieldDisplayNode;", "viewItem", "createDisplayNodeWithMapping", "shieldRow", "Lcom/dianping/shield/node/cellnode/ShieldRow;", "createImmediateNodeInstanceWithMapping", "cellParent", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "createRowNodeInstance", "rowItem", "createRowNodeInstanceWithMapping", "shieldSection", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "createSectionNodeInstance", "sectionItem", "createSectionNodeInstanceWithMapping", "getNodeExtension", "viewItemClass", "getRowExtension", "rowItemClass", "getRowNodeCount", "", "getSectionExtension", "sectionItemClass", "registerNodeExtension", "", "nodeExtension", "registerRowExtension", "rowExtension", "registerSectionExtension", "sectionExtension", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ExtensionsRegistry {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ExtensionsRegistry INSTANCE = new ExtensionsRegistry();
    @NotNull
    private static final HashMap<Class<? extends SectionItem>, SectionExtension> sectionExtensions = new HashMap<>();
    @NotNull
    private static final HashMap<Class<? extends RowItem>, RowExtension> rowExtensions = new HashMap<>();
    @NotNull
    private static final HashMap<Class<? extends ViewItem>, NodeExtension> nodeExtensions = new HashMap<>();

    @NotNull
    public final HashMap<Class<? extends SectionItem>, SectionExtension> getSectionExtensions$shieldCore_release() {
        return sectionExtensions;
    }

    @NotNull
    public final HashMap<Class<? extends RowItem>, RowExtension> getRowExtensions$shieldCore_release() {
        return rowExtensions;
    }

    @NotNull
    public final HashMap<Class<? extends ViewItem>, NodeExtension> getNodeExtensions$shieldCore_release() {
        return nodeExtensions;
    }

    public final void registerSectionExtension(@NotNull Class<? extends SectionItem> cls, @NotNull SectionExtension sectionExtension) {
        Object[] objArr = {cls, sectionExtension};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c27a13349ae0ea66c564141a44b17d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c27a13349ae0ea66c564141a44b17d06");
            return;
        }
        h.b(cls, "sectionItemClass");
        h.b(sectionExtension, "sectionExtension");
        sectionExtensions.put(cls, sectionExtension);
    }

    public final void registerRowExtension(@NotNull Class<? extends RowItem> cls, @NotNull RowExtension rowExtension) {
        Object[] objArr = {cls, rowExtension};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "332e7a89473e7da3a4a5b8e0df5faa85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "332e7a89473e7da3a4a5b8e0df5faa85");
            return;
        }
        h.b(cls, "rowItemClass");
        h.b(rowExtension, "rowExtension");
        rowExtensions.put(cls, rowExtension);
    }

    public final void registerNodeExtension(@NotNull Class<? extends ViewItem> cls, @NotNull NodeExtension nodeExtension) {
        Object[] objArr = {cls, nodeExtension};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ebcde59e5ce418267d555e2330da909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ebcde59e5ce418267d555e2330da909");
            return;
        }
        h.b(cls, "viewItemClass");
        h.b(nodeExtension, "nodeExtension");
        nodeExtensions.put(cls, nodeExtension);
    }

    @Nullable
    public final SectionExtension getSectionExtension(@NotNull Class<? extends SectionItem> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "755edc74cc22fa024fae440f89b75c6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SectionExtension) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "755edc74cc22fa024fae440f89b75c6c");
        }
        h.b(cls, "sectionItemClass");
        return sectionExtensions.get(cls);
    }

    @Nullable
    public final RowExtension getRowExtension(@NotNull Class<? extends RowItem> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59230330cf21c7a20cb6f87510678470", RobustBitConfig.DEFAULT_VALUE)) {
            return (RowExtension) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59230330cf21c7a20cb6f87510678470");
        }
        h.b(cls, "rowItemClass");
        return rowExtensions.get(cls);
    }

    @Nullable
    public final NodeExtension getNodeExtension(@NotNull Class<? extends ViewItem> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf63d91c81eae381de02224687b04ec2", RobustBitConfig.DEFAULT_VALUE)) {
            return (NodeExtension) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf63d91c81eae381de02224687b04ec2");
        }
        h.b(cls, "viewItemClass");
        return nodeExtensions.get(cls);
    }

    @NotNull
    public final ShieldSection createSectionNodeInstance(@NotNull SectionItem sectionItem) {
        ShieldSection createSectionNodeInstance;
        Object[] objArr = {sectionItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59f027e77c3e0f82a7aa3ea1d4775c02", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59f027e77c3e0f82a7aa3ea1d4775c02");
        }
        h.b(sectionItem, "sectionItem");
        SectionExtension sectionExtension = sectionExtensions.get(sectionItem.getClass());
        return (sectionExtension == null || (createSectionNodeInstance = sectionExtension.createSectionNodeInstance()) == null) ? new ShieldSection() : createSectionNodeInstance;
    }

    @NotNull
    public final ShieldSection createSectionNodeInstanceWithMapping(@NotNull SectionItem sectionItem, @NotNull ShieldViewCell shieldViewCell) {
        ShieldSection shieldSection;
        Object[] objArr = {sectionItem, shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba8e5be83cdffb75a23cbbf7dd19ff22", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldSection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba8e5be83cdffb75a23cbbf7dd19ff22");
        }
        h.b(sectionItem, "sectionItem");
        h.b(shieldViewCell, "cellParent");
        HashMap<SectionItem, ShieldSection> hashMap = shieldViewCell.sectionMap;
        if (hashMap != null && (shieldSection = hashMap.get(sectionItem)) != null) {
            shieldSection.clear();
            if (shieldSection != null) {
                return shieldSection;
            }
        }
        return createSectionNodeInstance(sectionItem);
    }

    @NotNull
    public final ShieldDisplayNode createImmediateNodeInstanceWithMapping(@NotNull ViewItem viewItem, @NotNull ShieldViewCell shieldViewCell) {
        ShieldDisplayNode shieldDisplayNode;
        Object[] objArr = {viewItem, shieldViewCell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9e3a6cb4439100774f4885a1525f61d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9e3a6cb4439100774f4885a1525f61d");
        }
        h.b(viewItem, "viewItem");
        h.b(shieldViewCell, "cellParent");
        HashMap<ViewItem, ShieldDisplayNode> hashMap = shieldViewCell.immediateNodeMap;
        if (hashMap != null && (shieldDisplayNode = hashMap.get(viewItem)) != null) {
            shieldDisplayNode.clear();
            if (shieldDisplayNode != null) {
                return shieldDisplayNode;
            }
        }
        return createDisplayNodeInstance(viewItem);
    }

    @NotNull
    public final ShieldRow createRowNodeInstance(@NotNull RowItem rowItem) {
        ShieldRow createRowNodeInstance;
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f21048406a56feb7150d2058999381b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f21048406a56feb7150d2058999381b6");
        }
        h.b(rowItem, "rowItem");
        RowExtension rowExtension = rowExtensions.get(rowItem.getClass());
        return (rowExtension == null || (createRowNodeInstance = rowExtension.createRowNodeInstance()) == null) ? new ShieldRow() : createRowNodeInstance;
    }

    @NotNull
    public final ShieldDisplayNode createDisplayNodeInstance(@NotNull ViewItem viewItem) {
        ShieldDisplayNode createDisplayNodeInstance;
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16a4127c851276837061c2a0e5ec8444", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16a4127c851276837061c2a0e5ec8444");
        }
        h.b(viewItem, "viewItem");
        NodeExtension nodeExtension = nodeExtensions.get(viewItem.getClass());
        return (nodeExtension == null || (createDisplayNodeInstance = nodeExtension.createDisplayNodeInstance()) == null) ? new ShieldDisplayNode() : createDisplayNodeInstance;
    }

    @NotNull
    public final ShieldRow createRowNodeInstanceWithMapping(@NotNull RowItem rowItem, @NotNull ShieldSection shieldSection) {
        ShieldRow shieldRow;
        Object[] objArr = {rowItem, shieldSection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27e368118c82a680819e9586d39dd29", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldRow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27e368118c82a680819e9586d39dd29");
        }
        h.b(rowItem, "rowItem");
        h.b(shieldSection, "shieldSection");
        HashMap<RowItem, ShieldRow> hashMap = shieldSection.rowMap;
        if (hashMap != null && (shieldRow = hashMap.get(rowItem)) != null) {
            shieldRow.clear();
            if (shieldRow != null) {
                return shieldRow;
            }
        }
        return createRowNodeInstance(rowItem);
    }

    @NotNull
    public final ShieldDisplayNode createDisplayNodeWithMapping(@NotNull ViewItem viewItem, @NotNull ShieldRow shieldRow) {
        ShieldDisplayNode shieldDisplayNode;
        Object[] objArr = {viewItem, shieldRow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "346743621f89b5e9dabf38f953381334", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldDisplayNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "346743621f89b5e9dabf38f953381334");
        }
        h.b(viewItem, "viewItem");
        h.b(shieldRow, "shieldRow");
        HashMap<ViewItem, ShieldDisplayNode> dNodeMap = shieldRow.getDNodeMap();
        if (dNodeMap != null && (shieldDisplayNode = dNodeMap.get(viewItem)) != null) {
            shieldDisplayNode.clear();
            if (shieldDisplayNode != null) {
                return shieldDisplayNode;
            }
        }
        return createDisplayNodeInstance(viewItem);
    }

    public final int getRowNodeCount(@NotNull RowItem rowItem) {
        Object[] objArr = {rowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81381e8672e53a9d957318ac98d15660", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81381e8672e53a9d957318ac98d15660")).intValue();
        }
        h.b(rowItem, "rowItem");
        RowExtension rowExtension = rowExtensions.get(rowItem.getClass());
        if (rowExtension != null) {
            return rowExtension.getRowNodeCount(rowItem);
        }
        if (rowItem.isLazyLoad) {
            return rowItem.viewCount;
        }
        ArrayList<ViewItem> arrayList = rowItem.viewItems;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
