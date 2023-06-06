package com.dianping.shield.dynamic.diff.module;

import android.view.View;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.l;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "com/dianping/shield/dynamic/diff/module/BaseModuleInfoDiff$failedViewClickCallback$2$1", "T", "V", "Lcom/dianping/shield/dynamic/model/module/BaseModuleInfo;", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "invoke", "()Lcom/dianping/shield/dynamic/diff/module/BaseModuleInfoDiff$failedViewClickCallback$2$1;"}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class BaseModuleInfoDiff$failedViewClickCallback$2 extends i implements a<AnonymousClass1> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseModuleInfoDiff this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseModuleInfoDiff$failedViewClickCallback$2(BaseModuleInfoDiff baseModuleInfoDiff) {
        super(0);
        this.this$0 = baseModuleInfoDiff;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff$failedViewClickCallback$2$1] */
    @Override // kotlin.jvm.functions.a
    @NotNull
    public final AnonymousClass1 invoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9a11b0c456fc1aafef4b537c7db803b", RobustBitConfig.DEFAULT_VALUE) ? (AnonymousClass1) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9a11b0c456fc1aafef4b537c7db803b") : new ViewClickCallbackWithData() { // from class: com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff$failedViewClickCallback$2.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.node.itemcallbacks.ViewClickCallbackWithData
            public final void onViewClicked(@NotNull View view, @Nullable Object obj, @Nullable NodePath nodePath) {
                Object[] objArr2 = {view, obj, nodePath};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4ce72be67811d73d38b5a8ea3537ef50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4ce72be67811d73d38b5a8ea3537ef50");
                    return;
                }
                h.b(view, Constants.EventType.VIEW);
                BaseModuleInfoDiff$failedViewClickCallback$2.this.this$0.getDynamicModuleItem().loadingStatus = l.b.LOADING;
                DynamicChassisInterface hostChassis = BaseModuleInfoDiff$failedViewClickCallback$2.this.this$0.getHostChassis();
                if (!(hostChassis instanceof HoloAgent)) {
                    hostChassis = null;
                }
                HoloAgent holoAgent = (HoloAgent) hostChassis;
                if (holoAgent != null) {
                    holoAgent.updateAgentCell();
                }
                DynamicChassisInterface hostChassis2 = BaseModuleInfoDiff$failedViewClickCallback$2.this.this$0.getHostChassis();
                if (!(hostChassis2 instanceof DynamicAgent)) {
                    hostChassis2 = null;
                }
                DynamicAgent dynamicAgent = (DynamicAgent) hostChassis2;
                if (dynamicAgent != null) {
                    dynamicAgent.callHostRetryForLoadingFail();
                }
            }
        };
    }
}
