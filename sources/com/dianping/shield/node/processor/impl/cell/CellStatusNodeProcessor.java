package com.dianping.shield.node.processor.impl.cell;

import com.dianping.agentsdk.framework.l;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.extensions.loading.LoadingSectionItem;
import com.dianping.shield.node.cellnode.ShieldSection;
import com.dianping.shield.node.cellnode.ShieldViewCell;
import com.dianping.shield.node.cellnode.callback.LoadingPaintingCallback;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.dianping.shield.node.processor.NodeCreator;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.shield.utils.RangeRemoveableArrayList;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0014¨\u0006\u0015"}, d2 = {"Lcom/dianping/shield/node/processor/impl/cell/CellStatusNodeProcessor;", "Lcom/dianping/shield/node/processor/impl/cell/CellNodeProcessor;", "()V", "createDefaultLoadingItem", "Lcom/dianping/shield/node/useritem/ViewItem;", DMKeys.KEY_VIEW_TYPE, "", "data", "", "clickCallback", "Lcom/dianping/shield/node/itemcallbacks/ViewClickCallbackWithData;", "handleShieldViewCell", "", "cellItem", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "shieldViewCell", "Lcom/dianping/shield/node/cellnode/ShieldViewCell;", "addList", "Ljava/util/ArrayList;", "Lcom/dianping/shield/node/cellnode/ShieldSection;", "Lkotlin/collections/ArrayList;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class CellStatusNodeProcessor extends CellNodeProcessor {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[l.b.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[l.b.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[l.b.FAILED.ordinal()] = 2;
            $EnumSwitchMapping$0[l.b.EMPTY.ordinal()] = 3;
            int[] iArr2 = new int[l.b.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[l.b.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[l.b.FAILED.ordinal()] = 2;
            $EnumSwitchMapping$1[l.b.EMPTY.ordinal()] = 3;
        }
    }

    @Override // com.dianping.shield.node.processor.impl.cell.CellNodeProcessor
    public final boolean handleShieldViewCell(@NotNull ShieldSectionCellItem shieldSectionCellItem, @NotNull ShieldViewCell shieldViewCell, @NotNull ArrayList<ShieldSection> arrayList) {
        Object[] objArr = {shieldSectionCellItem, shieldViewCell, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "740c19ee27aaeed59e601df336cce8d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "740c19ee27aaeed59e601df336cce8d3")).booleanValue();
        }
        h.b(shieldSectionCellItem, "cellItem");
        h.b(shieldViewCell, "shieldViewCell");
        h.b(arrayList, "addList");
        l.b bVar = shieldSectionCellItem.loadingStatus;
        if (bVar != null) {
            switch (WhenMappings.$EnumSwitchMapping$1[bVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList = shieldViewCell.shieldSections;
                    if (rangeRemoveableArrayList != null) {
                        rangeRemoveableArrayList.clear();
                    } else {
                        shieldViewCell.shieldSections = new RangeRemoveableArrayList<>();
                    }
                    LoadingSectionItem loadingSectionItem = new LoadingSectionItem();
                    String str = shieldViewCell.name;
                    l.b bVar2 = shieldSectionCellItem.loadingStatus;
                    ViewItem viewItem = null;
                    viewItem = null;
                    if (bVar2 != null) {
                        switch (WhenMappings.$EnumSwitchMapping$0[bVar2.ordinal()]) {
                            case 1:
                                ViewItem viewItem2 = shieldSectionCellItem.loadingViewItem;
                                if (viewItem2 != null && viewItem2.viewPaintingCallback != null) {
                                    if (shieldSectionCellItem.loadingViewItem.viewType != null) {
                                        str = "(loading)*" + str;
                                    }
                                    viewItem = shieldSectionCellItem.loadingViewItem;
                                    break;
                                } else {
                                    ViewItem viewItem3 = shieldSectionCellItem.loadingViewItem;
                                    Object obj = viewItem3 != null ? viewItem3.data : null;
                                    ViewItem viewItem4 = shieldSectionCellItem.loadingViewItem;
                                    viewItem = createDefaultLoadingItem(NodeCreator.LOADING_TYPE, obj, viewItem4 != null ? viewItem4.clickCallback : null);
                                    break;
                                }
                                break;
                            case 2:
                                ViewItem viewItem5 = shieldSectionCellItem.failedViewItem;
                                if (viewItem5 != null && viewItem5.viewPaintingCallback != null) {
                                    if (shieldSectionCellItem.failedViewItem.viewType != null) {
                                        str = "(failed)*" + str;
                                    }
                                    viewItem = shieldSectionCellItem.failedViewItem;
                                    break;
                                } else {
                                    ViewItem viewItem6 = shieldSectionCellItem.failedViewItem;
                                    Object obj2 = viewItem6 != null ? viewItem6.data : null;
                                    ViewItem viewItem7 = shieldSectionCellItem.failedViewItem;
                                    viewItem = createDefaultLoadingItem(NodeCreator.FAILED_TYPE, obj2, viewItem7 != null ? viewItem7.clickCallback : null);
                                    break;
                                }
                                break;
                            case 3:
                                ViewItem viewItem8 = shieldSectionCellItem.emptyViewItem;
                                if (viewItem8 != null && viewItem8.viewPaintingCallback != null) {
                                    if (shieldSectionCellItem.emptyViewItem.viewType != null) {
                                        str = "(empty)*" + str;
                                    }
                                    viewItem = shieldSectionCellItem.emptyViewItem;
                                    break;
                                } else {
                                    ViewItem viewItem9 = shieldSectionCellItem.emptyViewItem;
                                    Object obj3 = viewItem9 != null ? viewItem9.data : null;
                                    ViewItem viewItem10 = shieldSectionCellItem.emptyViewItem;
                                    viewItem = createDefaultLoadingItem(NodeCreator.EMPTY_TYPE, obj3, viewItem10 != null ? viewItem10.clickCallback : null);
                                    break;
                                }
                        }
                    }
                    loadingSectionItem.setTypePrefix(str);
                    loadingSectionItem.setViewItem(viewItem);
                    LoadingSectionItem loadingSectionItem2 = loadingSectionItem;
                    ShieldSection createSectionNodeInstance = ExtensionsRegistry.INSTANCE.createSectionNodeInstance(loadingSectionItem2);
                    createSectionNodeInstance.cellParent = shieldViewCell;
                    processShieldSection(loadingSectionItem2, createSectionNodeInstance);
                    RangeRemoveableArrayList<ShieldSection> rangeRemoveableArrayList2 = shieldViewCell.shieldSections;
                    if (rangeRemoveableArrayList2 != null) {
                        rangeRemoveableArrayList2.add(createSectionNodeInstance);
                    }
                    arrayList.add(createSectionNodeInstance);
                    return true;
            }
        }
        return false;
    }

    private final ViewItem createDefaultLoadingItem(String str, Object obj, ViewClickCallbackWithData viewClickCallbackWithData) {
        Object[] objArr = {str, obj, viewClickCallbackWithData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98f9a7f3268cd08628849a495497d85e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98f9a7f3268cd08628849a495497d85e");
        }
        ViewItem viewItem = new ViewItem();
        viewItem.viewType = str;
        viewItem.viewPaintingCallback = new LoadingPaintingCallback(getLoadingAndLoadingMoreCreator());
        if (viewClickCallbackWithData != null) {
            viewItem.data = obj;
            viewItem.clickCallback = viewClickCallbackWithData;
        }
        return viewItem;
    }
}
