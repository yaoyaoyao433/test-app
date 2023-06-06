package com.dianping.gcmrnmodule.processor;

import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.aq;
import com.dianping.gcmrnmodule.objects.c;
import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ReusableViewInfoProps;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.processor.InputComputeProcessor;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.node.processor.OnAsyncProcessorFinishListener;
import com.facebook.react.uimanager.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/gcmrnmodule/processor/MRNComputeProcessor;", "Lcom/dianping/shield/dynamic/processor/InputComputeProcessor;", "hostContainer", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "computeInput", "", "listener", "Lcom/dianping/shield/node/processor/OnAsyncProcessorFinishListener;", "diffViewItems", "", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "paintingErrorSet", "", "", "createViewInput", "", "viewItem", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends InputComputeProcessor {
    public static ChangeQuickRedirect a;
    private final DynamicChassisInterface b;

    public a(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        h.b(dynamicChassisInterface, "hostContainer");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480cc0adbe084d6b17639222fd633558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480cc0adbe084d6b17639222fd633558");
        } else {
            this.b = dynamicChassisInterface;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.processor.InputComputeProcessor
    public final void computeInput(@NotNull OnAsyncProcessorFinishListener onAsyncProcessorFinishListener, @NotNull List<? extends IDynamicModuleViewItem> list, @NotNull Set<String> set) {
        DynamicModuleViewItemData viewItemData;
        DynamicModuleViewData dynamicModuleViewData;
        int i;
        int i2;
        com.dianping.gcmrnmodule.objects.a aVar;
        Integer estimatedHeight;
        c cVar;
        char c = 0;
        int i3 = 1;
        Object[] objArr = {onAsyncProcessorFinishListener, list, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082fd2fe3ea9014771003686cf82c7d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082fd2fe3ea9014771003686cf82c7d1");
            return;
        }
        h.b(onAsyncProcessorFinishListener, "listener");
        h.b(list, "diffViewItems");
        h.b(set, "paintingErrorSet");
        List<IDynamicModuleViewItem> filterViewItemByViewType = DMViewUtils.filterViewItemByViewType(list, DMConstant.DynamicModuleViewType.MRNView);
        if (filterViewItemByViewType.isEmpty()) {
            onAsyncProcessorFinishListener.onDataHandleComplete(false);
            return;
        }
        h.a((Object) filterViewItemByViewType, "diffViewItemsForPicassoView");
        int i4 = 0;
        for (Object obj : filterViewItemByViewType) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.h.a();
            }
            IDynamicModuleViewItem iDynamicModuleViewItem = (IDynamicModuleViewItem) obj;
            IDynamicModuleViewItem iDynamicModuleViewItem2 = filterViewItemByViewType.get(i4);
            if (iDynamicModuleViewItem2 != null && (viewItemData = iDynamicModuleViewItem2.getViewItemData()) != null && (dynamicModuleViewData = viewItemData.viewData) != null) {
                h.a((Object) iDynamicModuleViewItem, "picassoInput");
                Object[] objArr2 = new Object[i3];
                objArr2[c] = iDynamicModuleViewItem;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2e21f6e3c27d894932ac3db4a57503d", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2e21f6e3c27d894932ac3db4a57503d");
                } else if (!TextUtils.isEmpty(iDynamicModuleViewItem.getViewItemData().reuseId) && (this.b.getDynamicHost() instanceof com.dianping.gcmrnmodule.hostwrapper.a)) {
                    DynamicHostInterface dynamicHost = this.b.getDynamicHost();
                    if (!(dynamicHost instanceof com.dianping.gcmrnmodule.hostwrapper.a)) {
                        dynamicHost = null;
                    }
                    com.dianping.gcmrnmodule.hostwrapper.a aVar2 = (com.dianping.gcmrnmodule.hostwrapper.a) dynamicHost;
                    com.dianping.gcmrnmodule.wrapperviews.reuse.b b = aVar2 != null ? aVar2.b() : null;
                    com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = aVar2 != null ? aVar2.a() : null;
                    if (!(a2 instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.c)) {
                        a2 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.modules.c cVar2 = (com.dianping.gcmrnmodule.wrapperviews.items.modules.c) a2;
                    com.dianping.gcmrnmodule.skeleton.a skeletonReusePool = cVar2 != null ? cVar2.getSkeletonReusePool() : null;
                    String str = iDynamicModuleViewItem.getViewItemData().reuseId;
                    h.a((Object) str, "viewItem.viewItemData.reuseId");
                    aVar = new com.dianping.gcmrnmodule.objects.a(str, this.b.getHostContext(), b, skeletonReusePool);
                    BaseViewInfo baseViewInfo = iDynamicModuleViewItem.getViewItemData().newViewInfo;
                    if (!(baseViewInfo instanceof ReusableViewInfoProps)) {
                        baseViewInfo = null;
                    }
                    ReusableViewInfoProps reusableViewInfoProps = (ReusableViewInfoProps) baseViewInfo;
                    aVar.c = reusableViewInfoProps != null ? reusableViewInfoProps.getWillDisplayCallback() : null;
                    aVar.d = reusableViewInfoProps != null ? reusableViewInfoProps.getDidEndDisplayingCallback() : null;
                    aVar.h = aq.a(this.b.getHostContext(), (reusableViewInfoProps == null || (estimatedHeight = reusableViewInfoProps.getEstimatedHeight()) == null) ? 0 : estimatedHeight.intValue());
                    aVar.g = aq.a(this.b.getHostContext(), iDynamicModuleViewItem.getViewItemData().width);
                    aVar.f = aq.a(this.b.getHostContext(), iDynamicModuleViewItem.getViewItemData().height);
                    aVar.i = reusableViewInfoProps != null ? reusableViewInfoProps.getReuseIdentifier() : null;
                    dynamicModuleViewData.setViewInput(aVar);
                } else {
                    c cVar3 = new c();
                    Integer viewReactTag = iDynamicModuleViewItem.getViewItemData().newViewInfo.getViewReactTag();
                    if (viewReactTag != null) {
                        i = viewReactTag.intValue();
                    } else {
                        b.a aVar3 = com.dianping.gcmrnmodule.wrapperviews.b.f;
                        i = com.dianping.gcmrnmodule.wrapperviews.b.e;
                    }
                    b.a aVar4 = com.dianping.gcmrnmodule.wrapperviews.b.f;
                    i2 = com.dianping.gcmrnmodule.wrapperviews.b.e;
                    cVar = cVar3;
                    if (i != i2) {
                        DynamicHostInterface dynamicHost2 = this.b.getDynamicHost();
                        cVar = cVar3;
                        if (dynamicHost2 instanceof com.dianping.gcmrnmodule.hostwrapper.a) {
                            as asVar = ((com.dianping.gcmrnmodule.hostwrapper.a) dynamicHost2).c;
                            View j = asVar != null ? asVar.j(i) : null;
                            cVar = cVar3;
                            if (j instanceof com.dianping.gcmrnmodule.wrapperviews.c) {
                                cVar3.a = (com.dianping.gcmrnmodule.wrapperviews.c) j;
                                cVar = cVar3;
                            }
                        }
                    }
                }
                aVar = cVar;
                dynamicModuleViewData.setViewInput(aVar);
            }
            IDynamicModuleViewItem iDynamicModuleViewItem3 = filterViewItemByViewType.get(i4);
            h.a((Object) iDynamicModuleViewItem3, "diffViewItemsForPicassoView[index]");
            iDynamicModuleViewItem3.getViewItemData().onLoad();
            i4 = i5;
            c = 0;
            i3 = 1;
        }
        onAsyncProcessorFinishListener.onDataHandleComplete(false);
    }
}
