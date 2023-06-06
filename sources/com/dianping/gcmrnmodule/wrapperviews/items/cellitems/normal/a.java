package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.protocols.b;
import com.dianping.gcmrnmodule.protocols.h;
import com.dianping.gcmrnmodule.wrapperviews.c;
import com.dianping.gcmrnmodule.wrapperviews.events.v;
import com.dianping.shield.dynamic.model.cell.NormalCellInfo;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0002H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/normal/MRNModuleNormalCellItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;", "Lcom/dianping/shield/dynamic/model/cell/NormalCellInfo;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnSelectProtocol;", "Lcom/dianping/gcmrnmodule/protocols/IMRNViewInterface;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "moduleView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleView;", "createInfoInstance", "getMRNView", "onContextualAction", "", "params", "Lorg/json/JSONObject;", "onSelect", "setMRNView", Constants.EventType.VIEW, "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a<NormalCellInfo> implements b, h {
    public static ChangeQuickRedirect g;
    private c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c15d0f83c3504a48d83499bd0c2e16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c15d0f83c3504a48d83499bd0c2e16");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d4cae3f5e8ee3c879be15cbb02f2664", RobustBitConfig.DEFAULT_VALUE)) {
            return (NormalCellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d4cae3f5e8ee3c879be15cbb02f2664");
        }
        NormalCellInfo normalCellInfo = new NormalCellInfo();
        normalCellInfo.setViewType(Integer.valueOf(DMConstant.DynamicModuleViewType.MRNView.ordinal()));
        return normalCellInfo;
    }

    @Override // com.dianping.gcmrnmodule.protocols.h
    public final void d(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab981d42584006b883574faabace991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab981d42584006b883574faabace991");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new v(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.b
    public final void setMRNView(@Nullable c cVar) {
        this.h = cVar;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f96683cb7a6640cc9ad4012aad3d3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f96683cb7a6640cc9ad4012aad3d3c1");
            return;
        }
        super.h();
        NormalCellInfo normalCellInfo = (NormalCellInfo) getInfo();
        StringBuilder sb = new StringBuilder("{\"viewWidth\":");
        c cVar = this.h;
        sb.append(cVar != null ? cVar.getWidth() : 0);
        sb.append(",\"viewHeight\":");
        c cVar2 = this.h;
        sb.append(cVar2 != null ? cVar2.getHeight() : 0);
        sb.append('}');
        normalCellInfo.setData(sb.toString());
        NormalCellInfo normalCellInfo2 = (NormalCellInfo) getInfo();
        c cVar3 = this.h;
        normalCellInfo2.setViewReactTag(Integer.valueOf(cVar3 != null ? cVar3.getId() : com.dianping.gcmrnmodule.wrapperviews.b.e));
    }

    @Nullable
    public final c getMRNView() {
        return this.h;
    }
}
