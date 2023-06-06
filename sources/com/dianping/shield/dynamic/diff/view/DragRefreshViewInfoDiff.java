package com.dianping.shield.dynamic.diff.view;

import com.dianping.agentsdk.framework.ab;
import com.dianping.shield.component.interfaces.OnDragRefreshStatusChangedListener;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.component.widgets.container.ContainerPullToRefreshMode;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.DragRefreshViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/DragRefreshViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/ViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "updateProps", "", "info", "(Lcom/dianping/shield/dynamic/model/view/DragRefreshViewInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DragRefreshViewInfoDiff<T extends DragRefreshViewInfo, V extends ViewItem> extends ViewInfoDiff<T, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragRefreshViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7fd673faca5e74c6441b903c6f9c9fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7fd673faca5e74c6441b903c6f9c9fc");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((DragRefreshViewInfoDiff<T, V>) ((DragRefreshViewInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((DragRefreshViewInfoDiff<T, V>) ((DragRefreshViewInfo) baseViewInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(ViewInfo viewInfo) {
        updateProps((DragRefreshViewInfoDiff<T, V>) ((DragRefreshViewInfo) viewInfo));
    }

    public final void updateProps(@NotNull final T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06f993b1bad9c6da7089e501ac7f21bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06f993b1bad9c6da7089e501ac7f21bf");
            return;
        }
        h.b(t, "info");
        super.updateProps((DragRefreshViewInfoDiff<T, V>) t);
        ab<?> pageContainer = getHostChassis().getPageContainer();
        if (pageContainer == null || !(pageContainer instanceof CommonPageContainer)) {
            return;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
        commonPageContainer.setRefreshHeight(t.getThreshold());
        commonPageContainer.setRefreshStatusChangedListener(new OnDragRefreshStatusChangedListener() { // from class: com.dianping.shield.dynamic.diff.view.DragRefreshViewInfoDiff$updateProps$$inlined$let$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.component.interfaces.OnDragRefreshStatusChangedListener
            public final void onDragRefreshStatusChanged(@NotNull ContainerPullToRefreshMode.DragRefreshStatus dragRefreshStatus) {
                Object[] objArr2 = {dragRefreshStatus};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "70a22b25c887e872aadca2d13f1f8d23", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "70a22b25c887e872aadca2d13f1f8d23");
                    return;
                }
                h.b(dragRefreshStatus, "status");
                String onDragRefreshStatusChanged = t.getOnDragRefreshStatusChanged();
                if (onDragRefreshStatusChanged != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("dragRefreshStatus", dragRefreshStatus.ordinal());
                    } catch (JSONException unused) {
                    }
                    DynamicChassisInterface hostChassis = DragRefreshViewInfoDiff.this.getHostChassis();
                    if (!(hostChassis instanceof ICommonHost)) {
                        hostChassis = null;
                    }
                    ICommonHost iCommonHost = (ICommonHost) hostChassis;
                    if (iCommonHost != null) {
                        iCommonHost.callMethod(onDragRefreshStatusChanged, jSONObject);
                    }
                }
            }
        });
    }
}
