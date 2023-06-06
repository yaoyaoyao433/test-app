package com.dianping.gcmrnmodule.utils;

import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.aq;
import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ReusableViewInfoProps;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.facebook.react.uimanager.as;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/dianping/gcmrnmodule/utils/MRNComputeUtils;", "", "()V", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final a b = new a(null);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0007J\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0003¨\u0006\u000e"}, d2 = {"Lcom/dianping/gcmrnmodule/utils/MRNComputeUtils$Companion;", "", "()V", "compute", "", "dynamicChassisInterface", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "comuteUnits", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "createViewInput", "viewItem", "Lcom/dianping/shield/dynamic/protocols/IDynamicModuleViewItem;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void a(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull ArrayList<ComputeUnit> arrayList) {
        int i;
        int i2;
        com.dianping.gcmrnmodule.objects.c cVar;
        Integer estimatedHeight;
        Object[] objArr = {dynamicChassisInterface, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "189e40d5dd5783b213837246762e8df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "189e40d5dd5783b213837246762e8df3");
            return;
        }
        a aVar = b;
        Object[] objArr2 = {dynamicChassisInterface, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8686adf982b9e2d20dd7253d528e9631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8686adf982b9e2d20dd7253d528e9631");
            return;
        }
        h.b(dynamicChassisInterface, "dynamicChassisInterface");
        h.b(arrayList, "comuteUnits");
        Iterator<ComputeUnit> it = arrayList.iterator();
        while (it.hasNext()) {
            ComputeUnit next = it.next();
            h.a((Object) next, "computeUnit");
            if (next.getViewItemData().viewData != null) {
                DynamicModuleViewData dynamicModuleViewData = next.getViewItemData().viewData;
                a aVar2 = aVar;
                ComputeUnit computeUnit = next;
                Object[] objArr3 = {dynamicChassisInterface, computeUnit};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "944493659c24672d69d48839925f8a74", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "944493659c24672d69d48839925f8a74");
                } else if (!TextUtils.isEmpty(computeUnit.getViewItemData().reuseId) && (dynamicChassisInterface.getDynamicHost() instanceof com.dianping.gcmrnmodule.hostwrapper.a)) {
                    DynamicHostInterface dynamicHost = dynamicChassisInterface.getDynamicHost();
                    if (!(dynamicHost instanceof com.dianping.gcmrnmodule.hostwrapper.a)) {
                        dynamicHost = null;
                    }
                    com.dianping.gcmrnmodule.hostwrapper.a aVar3 = (com.dianping.gcmrnmodule.hostwrapper.a) dynamicHost;
                    com.dianping.gcmrnmodule.wrapperviews.reuse.b b2 = aVar3 != null ? aVar3.b() : null;
                    com.dianping.gcmrnmodule.wrapperviews.a<?> a2 = aVar3 != null ? aVar3.a() : null;
                    if (!(a2 instanceof com.dianping.gcmrnmodule.wrapperviews.items.modules.c)) {
                        a2 = null;
                    }
                    com.dianping.gcmrnmodule.wrapperviews.items.modules.c cVar2 = (com.dianping.gcmrnmodule.wrapperviews.items.modules.c) a2;
                    com.dianping.gcmrnmodule.skeleton.a skeletonReusePool = cVar2 != null ? cVar2.getSkeletonReusePool() : null;
                    String str = computeUnit.getViewItemData().reuseId;
                    h.a((Object) str, "viewItem.viewItemData.reuseId");
                    com.dianping.gcmrnmodule.objects.a aVar4 = new com.dianping.gcmrnmodule.objects.a(str, dynamicChassisInterface.getHostContext(), b2, skeletonReusePool);
                    BaseViewInfo baseViewInfo = computeUnit.getViewItemData().newViewInfo;
                    if (!(baseViewInfo instanceof ReusableViewInfoProps)) {
                        baseViewInfo = null;
                    }
                    ReusableViewInfoProps reusableViewInfoProps = (ReusableViewInfoProps) baseViewInfo;
                    aVar4.c = reusableViewInfoProps != null ? reusableViewInfoProps.getWillDisplayCallback() : null;
                    aVar4.d = reusableViewInfoProps != null ? reusableViewInfoProps.getDidEndDisplayingCallback() : null;
                    aVar4.h = aq.a(dynamicChassisInterface.getHostContext(), (reusableViewInfoProps == null || (estimatedHeight = reusableViewInfoProps.getEstimatedHeight()) == null) ? 0 : estimatedHeight.intValue());
                    aVar4.g = aq.a(dynamicChassisInterface.getHostContext(), computeUnit.getViewItemData().width);
                    aVar4.f = aq.a(dynamicChassisInterface.getHostContext(), computeUnit.getViewItemData().height);
                    aVar4.i = reusableViewInfoProps != null ? reusableViewInfoProps.getReuseIdentifier() : null;
                    cVar = aVar4;
                } else {
                    com.dianping.gcmrnmodule.objects.c cVar3 = new com.dianping.gcmrnmodule.objects.c();
                    Integer viewReactTag = computeUnit.getViewItemData().newViewInfo.getViewReactTag();
                    if (viewReactTag != null) {
                        i = viewReactTag.intValue();
                    } else {
                        b.a aVar5 = com.dianping.gcmrnmodule.wrapperviews.b.f;
                        i = com.dianping.gcmrnmodule.wrapperviews.b.e;
                    }
                    b.a aVar6 = com.dianping.gcmrnmodule.wrapperviews.b.f;
                    i2 = com.dianping.gcmrnmodule.wrapperviews.b.e;
                    cVar = cVar3;
                    if (i != i2) {
                        DynamicHostInterface dynamicHost2 = dynamicChassisInterface.getDynamicHost();
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
                dynamicModuleViewData.setViewInput(cVar);
            }
            next.getViewItemData().onLoad();
        }
    }
}
