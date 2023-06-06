package com.dianping.shield.dynamic.diff.view;

import android.view.View;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicWrapperView;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.node.adapter.ShieldViewHolder;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/dianping/shield/dynamic/diff/view/ExtraViewInfoDiff$updateProps$dynamicPaintingInterface$1", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicPaitingInterface;", "onPaintingInputComplete", "", "viewHolder", "Lcom/dianping/shield/node/adapter/ShieldViewHolder;", "data", "", "path", "Lcom/dianping/shield/node/cellnode/NodePath;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ExtraViewInfoDiff$updateProps$dynamicPaintingInterface$1 implements DynamicPaitingInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ExtraViewInfoDiff this$0;

    public ExtraViewInfoDiff$updateProps$dynamicPaintingInterface$1(ExtraViewInfoDiff extraViewInfoDiff) {
        this.this$0 = extraViewInfoDiff;
    }

    @Override // com.dianping.shield.dynamic.items.paintingcallback.DynamicPaitingInterface
    public final void onPaintingInputComplete(@NotNull final ShieldViewHolder shieldViewHolder, @Nullable final Object obj, @Nullable final NodePath nodePath) {
        boolean needSetClickListener;
        View dynamicInnerView;
        Object[] objArr = {shieldViewHolder, obj, nodePath};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc4283a950df869cf604e6513866b23f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc4283a950df869cf604e6513866b23f");
            return;
        }
        h.b(shieldViewHolder, "viewHolder");
        DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) (!(obj instanceof DynamicModuleViewItemData) ? null : obj);
        if (dynamicModuleViewItemData != null) {
            ExtraViewInfoDiff extraViewInfoDiff = this.this$0;
            BaseViewInfo baseViewInfo = dynamicModuleViewItemData.newViewInfo;
            if (!(baseViewInfo instanceof ExtraViewInfo)) {
                baseViewInfo = null;
            }
            needSetClickListener = extraViewInfoDiff.needSetClickListener((ExtraViewInfo) baseViewInfo);
            if (needSetClickListener) {
                View view = shieldViewHolder.itemView;
                DynamicWrapperView dynamicWrapperView = view instanceof DynamicWrapperView ? view : null;
                if (dynamicWrapperView == null || (dynamicInnerView = dynamicWrapperView.dynamicInnerView(this.this$0.getHostChassis(), dynamicModuleViewItemData)) == null) {
                    return;
                }
                dynamicInnerView.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.shield.dynamic.diff.view.ExtraViewInfoDiff$updateProps$dynamicPaintingInterface$1$onPaintingInputComplete$$inlined$let$lambda$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr2 = {view2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "64497b43825d739dba6dab3123edefa2", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "64497b43825d739dba6dab3123edefa2");
                            return;
                        }
                        ViewClickCallbackWithData viewClickCallbackWithData = ExtraViewInfoDiff$updateProps$dynamicPaintingInterface$1.this.this$0.getViewItem().clickCallback;
                        if (viewClickCallbackWithData != null) {
                            h.a((Object) view2, AdvanceSetting.NETWORK_TYPE);
                            viewClickCallbackWithData.onViewClicked(view2, obj, nodePath);
                        }
                    }
                });
            }
        }
    }
}
