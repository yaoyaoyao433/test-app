package com.dianping.gcmrnmodule.wrapperviews.containers.section;

import android.annotation.SuppressLint;
import com.dianping.shield.dynamic.model.cell.CellInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/section/MRNModuleFooterCellContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/base/MRNModuleBaseItemContainerWrapperView;", "Lcom/dianping/shield/dynamic/model/cell/CellInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "assertIsChildAndGetInfo", "childWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class b extends com.dianping.gcmrnmodule.wrapperviews.containers.base.a<CellInfo> {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a08cc2efc648f79ec4e6f83b7751ca2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a08cc2efc648f79ec4e6f83b7751ca2f");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.containers.base.a
    public final /* synthetic */ CellInfo a(com.dianping.gcmrnmodule.wrapperviews.b bVar) {
        CellInfo cellInfo;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84782eae02743f66fd99962ab50006e9", RobustBitConfig.DEFAULT_VALUE)) {
            cellInfo = (CellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84782eae02743f66fd99962ab50006e9");
        } else {
            h.b(bVar, "childWrapperView");
            cellInfo = bVar instanceof com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a ? (CellInfo) ((com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a) bVar).getInfo() : null;
        }
        return cellInfo;
    }
}
