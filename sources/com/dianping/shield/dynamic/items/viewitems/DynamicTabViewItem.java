package com.dianping.shield.dynamic.items.viewitems;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.view.TabViewInfoDiff;
import com.dianping.shield.dynamic.items.itemdata.DynamicTabData;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface;
import com.dianping.shield.dynamic.model.view.TabViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007JF\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0001J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u000eH\u0096\u0001J\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0001X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006%"}, d2 = {"Lcom/dianping/shield/dynamic/items/viewitems/DynamicTabViewItem;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/TabViewInfo;", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItemInterface;", "viewDiffProxy", "Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff;", "(Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff;)V", "viewItem", "getViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/TabViewInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "getViewItemData", "Lcom/dianping/shield/dynamic/objects/DynamicModuleViewItemData;", "isSingleButton", "", "onComputingComplete", "setAnchorIndexPathClickCallback", "anchorIndexPathClickCallback", "Lcom/dianping/shield/dynamic/diff/view/TabViewInfoDiff$AnchorIndexPathClickCallback;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicTabViewItem extends ViewItem implements DynamicDiff<TabViewInfo>, DynamicViewItemInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final TabViewInfoDiff<TabViewInfo, ViewItem> viewDiffProxy;
    @NotNull
    private ViewItem viewItem;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull TabViewInfo tabViewInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {tabViewInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c10b8597c83b92f8e4ce4a38c79d38ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c10b8597c83b92f8e4ce4a38c79d38ed");
            return;
        }
        h.b(tabViewInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.viewDiffProxy.diff(tabViewInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b553dafee01a296fe8e68e4bd8d17e10", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b553dafee01a296fe8e68e4bd8d17e10");
        }
        h.b(str, "identifier");
        return this.viewDiffProxy.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c22692adfff530249f25283591a4d22d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c22692adfff530249f25283591a4d22d") : this.viewDiffProxy.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9652d664b91b32ac246b821240d57841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9652d664b91b32ac246b821240d57841");
        } else {
            this.viewDiffProxy.onComputingComplete();
        }
    }

    public DynamicTabViewItem(@NotNull TabViewInfoDiff<TabViewInfo, ViewItem> tabViewInfoDiff) {
        h.b(tabViewInfoDiff, "viewDiffProxy");
        Object[] objArr = {tabViewInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b818500c97bcee94867a3cb4cd7ccee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b818500c97bcee94867a3cb4cd7ccee");
            return;
        }
        this.viewDiffProxy = tabViewInfoDiff;
        DynamicTabViewItem dynamicTabViewItem = this;
        this.viewItem = dynamicTabViewItem;
        this.viewDiffProxy.setViewItem(dynamicTabViewItem);
        this.viewStatusWithPrefetchListener = new ViewStatusWithPrefetchListener() { // from class: com.dianping.shield.dynamic.items.viewitems.DynamicTabViewItem.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener
            public final void onStatusChanged(@NotNull AttachStatus attachStatus, @NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
                DynamicModuleViewData dynamicModuleViewData;
                Object[] objArr2 = {attachStatus, scrollDirection, obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "06102737c79bb7671c9ae2aa91d2986c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "06102737c79bb7671c9ae2aa91d2986c");
                    return;
                }
                h.b(attachStatus, "status");
                h.b(scrollDirection, "direction");
                if (!(obj instanceof DynamicTabData)) {
                    obj = null;
                }
                DynamicTabData dynamicTabData = (DynamicTabData) obj;
                if (dynamicTabData == null || (dynamicModuleViewData = dynamicTabData.normalData.viewData) == null) {
                    return;
                }
                dynamicModuleViewData.onStatusChanged(attachStatus, scrollDirection);
            }
        };
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(TabViewInfo tabViewInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(tabViewInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface, com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    public final void setComputeViewInputListener(@Nullable ComputeViewInputListener computeViewInputListener) {
        Object[] objArr = {computeViewInputListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d41355a59d98c18447153d320c9cd9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d41355a59d98c18447153d320c9cd9d7");
        } else {
            DynamicViewItemInterface.DefaultImpls.setComputeViewInputListener(this, computeViewInputListener);
        }
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface
    @NotNull
    public final ViewItem getViewItem() {
        return this.viewItem;
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface
    public final void setViewItem(@NotNull ViewItem viewItem) {
        Object[] objArr = {viewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac487dd92139acbaeebb318366d7678d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac487dd92139acbaeebb318366d7678d");
            return;
        }
        h.b(viewItem, "<set-?>");
        this.viewItem = viewItem;
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface, com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    @Nullable
    public final DynamicModuleViewItemData getViewItemData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c5107fae690e1e3746f64f911f5c1de", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicModuleViewItemData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c5107fae690e1e3746f64f911f5c1de");
        }
        Object obj = getViewItem().data;
        if (!(obj instanceof DynamicTabData)) {
            obj = null;
        }
        DynamicTabData dynamicTabData = (DynamicTabData) obj;
        if (dynamicTabData != null) {
            return dynamicTabData.normalData;
        }
        return null;
    }

    public final boolean isSingleButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ed62b964f43fc5d356ae0c9b7a0d338", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ed62b964f43fc5d356ae0c9b7a0d338")).booleanValue() : this.viewDiffProxy.isSingleButton();
    }

    public final void setAnchorIndexPathClickCallback(@NotNull TabViewInfoDiff.AnchorIndexPathClickCallback anchorIndexPathClickCallback) {
        Object[] objArr = {anchorIndexPathClickCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cde7419c4cdaa92b32e1cb76414f8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cde7419c4cdaa92b32e1cb76414f8cd");
            return;
        }
        h.b(anchorIndexPathClickCallback, "anchorIndexPathClickCallback");
        this.viewDiffProxy.setAnchorIndexPathClickCallback(anchorIndexPathClickCallback);
    }
}
