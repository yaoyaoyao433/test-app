package com.dianping.shield.dynamic.diff;

import com.dianping.picassomodule.widget.normal.a;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.cell.NormalCellInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.useritem.ViewItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0015\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aR\u001b\u0010\t\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/dianping/shield/dynamic/diff/NormalViewInfoDiffCustom;", "T", "Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;", "V", "Lcom/dianping/shield/node/useritem/ViewItem;", "Lcom/dianping/shield/dynamic/diff/view/BaseViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "viewPaintingCallback", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "getViewPaintingCallback", "()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "viewPaintingCallback$delegate", "Lkotlin/Lazy;", "handleClick", "", "hostContainer", DMKeys.KEY_VIEW_INFO, "Lcom/dianping/shield/dynamic/model/view/BaseViewInfo;", "extraData", "Lorg/json/JSONObject;", "location", "", "updateProps", "info", "(Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;)V", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class NormalViewInfoDiffCustom<T extends NormalCellInfo, V extends ViewItem> extends BaseViewInfoDiff<T, V> {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(NormalViewInfoDiffCustom.class), "viewPaintingCallback", "getViewPaintingCallback()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final d viewPaintingCallback$delegate;

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    @NotNull
    public final DynamicViewPaintingCallback getViewPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (DynamicViewPaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "628650f20bd627796cc9a77d70f80f4f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "628650f20bd627796cc9a77d70f80f4f") : this.viewPaintingCallback$delegate.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((NormalViewInfoDiffCustom<T, V>) ((NormalCellInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((NormalViewInfoDiffCustom<T, V>) ((NormalCellInfo) baseViewInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalViewInfoDiffCustom(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8339aa3c559bbded864f9d77d3e5c4de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8339aa3c559bbded864f9d77d3e5c4de");
        } else {
            this.viewPaintingCallback$delegate = e.a(kotlin.i.NONE, new NormalViewInfoDiffCustom$viewPaintingCallback$2(this, dynamicChassisInterface));
        }
    }

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final void handleClick(@NotNull DynamicChassisInterface dynamicChassisInterface, @NotNull BaseViewInfo baseViewInfo, @NotNull JSONObject jSONObject, @Nullable int[] iArr) {
        a normalView;
        Object[] objArr = {dynamicChassisInterface, baseViewInfo, jSONObject, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c70955d3de65b192168a09426c53bdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c70955d3de65b192168a09426c53bdc");
            return;
        }
        h.b(dynamicChassisInterface, "hostContainer");
        h.b(baseViewInfo, DMKeys.KEY_VIEW_INFO);
        h.b(jSONObject, "extraData");
        super.handleClick(dynamicChassisInterface, baseViewInfo, jSONObject, iArr);
        DynamicChassisInterface hostChassis = getHostChassis();
        if (!(hostChassis instanceof DynamicAgent)) {
            hostChassis = null;
        }
        DynamicAgent dynamicAgent = (DynamicAgent) hostChassis;
        if (dynamicAgent == null || (normalView = dynamicAgent.getNormalView()) == null) {
            return;
        }
        normalView.a();
    }

    public final void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d647a82732eb2961cdf3fd4e8bbff74d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d647a82732eb2961cdf3fd4e8bbff74d");
            return;
        }
        h.b(t, "info");
        super.updateProps((NormalViewInfoDiffCustom<T, V>) t);
        getViewItem().viewType = t.getReuseIdentifier();
    }
}
