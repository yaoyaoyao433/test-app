package com.dianping.shield.dynamic.items.viewitems;

import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.agent.node.DynamicDiff;
import com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface;
import com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.ComputeViewInputListener;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.cellnode.AttachStatus;
import com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJF\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$H\u0096\u0001J\u000b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0001J\t\u0010&\u001a\u00020\u0017H\u0096\u0001J\u000e\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u0015\u0010*\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010+J\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u000202R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00063"}, d2 = {"Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItem;", "T", "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/agent/node/DynamicDiff;", "Lcom/dianping/shield/dynamic/items/viewitems/DynamicViewItemInterface;", "viewDiffProxy", "Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff;", "(Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff;)V", "itemFromMapping", "", "getItemFromMapping", "()Z", "setItemFromMapping", "(Z)V", "getViewDiffProxy", "()Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff;", "viewItem", "getViewItem", "()Lcom/dianping/shield/node/useritem/ViewItem;", "setViewItem", "(Lcom/dianping/shield/node/useritem/ViewItem;)V", "diff", "", "newInfo", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "findPicassoViewItemByIdentifier", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "identifier", "", "getId", "onComputingComplete", "setComputingStep", Constants.SPEED_METER_STEP, "Lcom/dianping/shield/dynamic/utils/DMConstant$VCViewComputeStep;", "setComputingSuggestHeight", "(Ljava/lang/Integer;)V", "setComputingSuggestWidth", "setComputingViewInputListener", "viewInputListener", "Lcom/dianping/shield/dynamic/protocols/ComputeViewInputListener;", "setDynamicPaintingListener", "dynamicPaitingInterface", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicViewItem<T extends BaseViewInfo> extends ViewItem implements DynamicDiff<T>, DynamicViewItemInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean itemFromMapping;
    @NotNull
    private final BaseViewInfoDiff<T, ViewItem> viewDiffProxy;
    @NotNull
    private ViewItem viewItem;

    public final void diff(@NotNull T t, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a5a13485f427cb5e15d8ec0178246b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a5a13485f427cb5e15d8ec0178246b2");
            return;
        }
        h.b(t, "newInfo");
        h.b(arrayList, "diffResult");
        this.viewDiffProxy.diff(t, arrayList, num, num2);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicViewItemsHolderInterface
    @Nullable
    public final IDynamicModuleViewItem findPicassoViewItemByIdentifier(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd2383e76e4a9c7372986931074dcd18", RobustBitConfig.DEFAULT_VALUE)) {
            return (IDynamicModuleViewItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd2383e76e4a9c7372986931074dcd18");
        }
        h.b(str, "identifier");
        return this.viewDiffProxy.findPicassoViewItemByIdentifier(str);
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    @Nullable
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d247154d4bb26cea445ae9a3e982a03", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d247154d4bb26cea445ae9a3e982a03") : this.viewDiffProxy.getId();
    }

    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final void onComputingComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ab8da014cd483229e723dbb90ea9064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ab8da014cd483229e723dbb90ea9064");
        } else {
            this.viewDiffProxy.onComputingComplete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.agent.node.DynamicDiff
    public final /* bridge */ /* synthetic */ void diff(DiffableInfo diffableInfo, ArrayList arrayList, Integer num, Integer num2) {
        diff((DynamicViewItem<T>) ((BaseViewInfo) diffableInfo), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    @NotNull
    public final BaseViewInfoDiff<T, ViewItem> getViewDiffProxy() {
        return this.viewDiffProxy;
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface, com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    @Nullable
    public final DynamicModuleViewItemData getViewItemData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df5adb74578cd79829769b2fa92fef3a", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleViewItemData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df5adb74578cd79829769b2fa92fef3a") : DynamicViewItemInterface.DefaultImpls.getViewItemData(this);
    }

    @Override // com.dianping.shield.dynamic.items.viewitems.DynamicViewItemInterface, com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem
    public final void setComputeViewInputListener(@Nullable ComputeViewInputListener computeViewInputListener) {
        Object[] objArr = {computeViewInputListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57402fd700b15860c88d5c62e89a8656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57402fd700b15860c88d5c62e89a8656");
        } else {
            DynamicViewItemInterface.DefaultImpls.setComputeViewInputListener(this, computeViewInputListener);
        }
    }

    public DynamicViewItem(@NotNull BaseViewInfoDiff<T, ViewItem> baseViewInfoDiff) {
        h.b(baseViewInfoDiff, "viewDiffProxy");
        Object[] objArr = {baseViewInfoDiff};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e05d046b46fad2a666d809eaac9d4e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e05d046b46fad2a666d809eaac9d4e2");
            return;
        }
        this.viewDiffProxy = baseViewInfoDiff;
        DynamicViewItem<T> dynamicViewItem = this;
        this.viewItem = dynamicViewItem;
        this.viewStatusWithPrefetchListener = new ViewStatusWithPrefetchListener() { // from class: com.dianping.shield.dynamic.items.viewitems.DynamicViewItem.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ViewStatusWithPrefetchListener
            public final void onStatusChanged(@NotNull AttachStatus attachStatus, @NotNull ScrollDirection scrollDirection, @Nullable Object obj) {
                Object[] objArr2 = {attachStatus, scrollDirection, obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c4eb7523f6c545d0def141e43fd2dc22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c4eb7523f6c545d0def141e43fd2dc22");
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
        this.viewDiffProxy.setViewItem(dynamicViewItem);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "248e570b42db028e215f6fe7b9b2d89c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "248e570b42db028e215f6fe7b9b2d89c");
            return;
        }
        h.b(viewItem, "<set-?>");
        this.viewItem = viewItem;
    }

    public final boolean getItemFromMapping() {
        return this.itemFromMapping;
    }

    public final void setItemFromMapping(boolean z) {
        this.itemFromMapping = z;
    }

    public final void setComputingSuggestHeight(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6d6efab8bfdf6111e5b711fd3d42a6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6d6efab8bfdf6111e5b711fd3d42a6e");
        } else {
            this.viewDiffProxy.setComputingSuggestHeight(num);
        }
    }

    public final void setComputingSuggestWidth(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6765bc5a8b0908c6dd6cc26017b0bab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6765bc5a8b0908c6dd6cc26017b0bab1");
        } else {
            this.viewDiffProxy.setComputingSuggestWidth(num);
        }
    }

    public final void setComputingStep(@NotNull DMConstant.VCViewComputeStep vCViewComputeStep) {
        Object[] objArr = {vCViewComputeStep};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84e4cb9cb5b55fcbc0fd6bcd8b9590c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84e4cb9cb5b55fcbc0fd6bcd8b9590c2");
            return;
        }
        h.b(vCViewComputeStep, Constants.SPEED_METER_STEP);
        DynamicModuleViewItemData computingViewItemData = this.viewDiffProxy.getComputingViewItemData();
        if (computingViewItemData != null) {
            computingViewItemData.computePriority = vCViewComputeStep.ordinal();
        }
    }

    public final void setComputingViewInputListener(@NotNull ComputeViewInputListener computeViewInputListener) {
        Object[] objArr = {computeViewInputListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1119e0427faad8b144dae636137e7066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1119e0427faad8b144dae636137e7066");
            return;
        }
        h.b(computeViewInputListener, "viewInputListener");
        DynamicModuleViewItemData computingViewItemData = this.viewDiffProxy.getComputingViewItemData();
        if (computingViewItemData != null) {
            computingViewItemData.computeViewInputListener = computeViewInputListener;
        }
    }

    public final void setDynamicPaintingListener(@NotNull DynamicPaitingInterface dynamicPaitingInterface) {
        Object[] objArr = {dynamicPaitingInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4cddf356fd83ba95051c01a112407a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4cddf356fd83ba95051c01a112407a8");
            return;
        }
        h.b(dynamicPaitingInterface, "dynamicPaitingInterface");
        this.viewDiffProxy.setDynamicPaitingInterface(dynamicPaitingInterface);
    }
}
