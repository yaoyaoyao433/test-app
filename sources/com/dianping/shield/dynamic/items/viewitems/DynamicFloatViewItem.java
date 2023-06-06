package com.dianping.shield.dynamic.items.viewitems;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.view.HoverViewInfoDiff;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.extensions.ExtensionsRegistry;
import com.dianping.shield.extensions.FloatViewNodeExtension;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener;
import com.dianping.shield.node.useritem.FloatViewItem;
import com.dianping.shield.node.useritem.ViewItem;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001fB\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\u0007JF\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0001J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001J\t\u0010\u001e\u001a\u00020\u000fH\u0096\u0001R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006 "}, d2 = {"Lcom/dianping/shield/dynamic/items/viewitems/DynamicFloatViewItem;", "Lcom/dianping/shield/node/useritem/FloatViewItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItemInterface;", "viewDiffProxy", "Lcom/dianping/shield/dynamic/diff/view/HoverViewInfoDiff;", "(Lcom/dianping/shield/dynamic/diff/view/HoverViewInfoDiff;)V", "viewItem", "Lcom/dianping/shield/node/useritem/ViewItem;", "getViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "Companion", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicFloatViewItem extends FloatViewItem implements DynamicDiff<HoverViewInfo>, DynamicViewItemInterface {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HoverViewInfoDiff<HoverViewInfo, FloatViewItem> viewDiffProxy;
    @NotNull
    private ViewItem viewItem;

    /* renamed from: diff  reason: avoid collision after fix types in other method */
    public final void diff2(@NotNull HoverViewInfo hoverViewInfo, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {hoverViewInfo, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "773755fad3af9e2241945e24000311f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "773755fad3af9e2241945e24000311f0");
            return;
        }
        h.b(hoverViewInfo, "newInfo");
        h.b(arrayList, "diffResult");
        this.viewDiffProxy.diff(hoverViewInfo, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84b68ab1f7a702d91222c75d349e01c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84b68ab1f7a702d91222c75d349e01c7");
        }
        h.b(str, "identifier");
        return this.viewDiffProxy.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1f4493fffa1748eccc2046e24508c42", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1f4493fffa1748eccc2046e24508c42") : this.viewDiffProxy.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7fe14cd374a1203ec033134d2b38e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7fe14cd374a1203ec033134d2b38e1c");
        } else {
            this.viewDiffProxy.onComputingComplete();
        }
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(HoverViewInfo hoverViewInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff2(hoverViewInfo, (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface, com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    @Nullable
    public final DynamicModuleViewItemData getViewItemData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fbc5f7dde2098a33cafeb0e160ab310", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleViewItemData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fbc5f7dde2098a33cafeb0e160ab310") : DynamicViewItemInterface.DefaultImpls.getViewItemData(this);
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface, com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    public final void setComputeViewInputListener(@Nullable ComputeViewInputListener computeViewInputListener) {
        Object[] objArr = {computeViewInputListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3d1509f55d90fae9ab04985a8ab9a94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3d1509f55d90fae9ab04985a8ab9a94");
        } else {
            DynamicViewItemInterface.DefaultImpls.setComputeViewInputListener(this, computeViewInputListener);
        }
    }

    public DynamicFloatViewItem(@NotNull HoverViewInfoDiff<HoverViewInfo, FloatViewItem> hoverViewInfoDiff) {
        h.b(hoverViewInfoDiff, "viewDiffProxy");
        Object[] objArr = {hoverViewInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f41fbcb31e6bd9ce7037f816170ad25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f41fbcb31e6bd9ce7037f816170ad25");
            return;
        }
        this.viewDiffProxy = hoverViewInfoDiff;
        DynamicFloatViewItem dynamicFloatViewItem = this;
        this.viewItem = dynamicFloatViewItem;
        this.viewStatusWithPrefetchListener = new ViewStatusWithPrefetchListener() { // from class: com.dianping.shield.dynamic.items.viewitems.DynamicFloatViewItem.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener
            public final void onStatusChanged(@NotNull AttachStatus attachStatus, @NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
                Object[] objArr2 = {attachStatus, scrollDirection, obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "231527c9023b263d4971350bb95fa376", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "231527c9023b263d4971350bb95fa376");
                    return;
                }
                h.b(attachStatus, "status");
                h.b(scrollDirection, "direction");
                if (!(obj instanceof DynamicModuleViewItemData)) {
                    obj = null;
                }
                DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
                if (dynamicModuleViewItemData != null) {
                    dynamicModuleViewItemData.viewData.onStatusChanged(attachStatus, scrollDirection);
                }
            }
        };
        this.viewDiffProxy.setViewItem(dynamicFloatViewItem);
        this.viewDiffProxy.setViewItem(dynamicFloatViewItem);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "355d59ba728c8e95b1817aed9cfe23cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "355d59ba728c8e95b1817aed9cfe23cb");
            return;
        }
        h.b(viewItem, "<set-?>");
        this.viewItem = viewItem;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/dianping/shield/dynamic/items/viewitems/DynamicFloatViewItem$Companion;", "", "()V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
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
        ExtensionsRegistry.INSTANCE.registerNodeExtension(DynamicFloatViewItem.class, new FloatViewNodeExtension());
    }
}
