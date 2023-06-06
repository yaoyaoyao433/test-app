package com.dianping.gcmrnmodule.wrapperviews.containers.section;

import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/section/MRNModuleCellsContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/base/MRNModuleBaseListContainerWrapperView;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "assertIsChildAndGetInfo", "childWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.containers.base.b<CellInfo> {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8490404acacb0921fe0f701e45fd16fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8490404acacb0921fe0f701e45fd16fd");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.base.b
    public final /* synthetic */ CellInfo a(com.dianping.gcmrnmodule.wrapperviews.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c047c8a894b0344c15a731ce59799670", RobustBitConfig.DEFAULT_VALUE)) {
            return (CellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c047c8a894b0344c15a731ce59799670");
        }
        h.b(bVar, "childWrapperView");
        if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a) {
            return (CellInfo) ((com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a) bVar).getInfo();
        }
        return null;
    }
}
