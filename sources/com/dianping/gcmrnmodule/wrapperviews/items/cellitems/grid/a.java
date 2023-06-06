package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid;

import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.l;
import com.dianping.shield.dynamic.model.cell.GridCellInfo;
import com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/grid/MRNModuleGridCellItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;", "Lcom/dianping/shield/dynamic/model/cell/GridCellInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createInfoInstance", "updateInfo", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a<GridCellInfo> {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5690af3cae632041f367538a1d3e960", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5690af3cae632041f367538a1d3e960");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc8f36fdc5b91db91300889aa19661f", RobustBitConfig.DEFAULT_VALUE) ? (GridCellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc8f36fdc5b91db91300889aa19661f") : new GridCellInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b9e59ec44f33c614c5095249a46097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b9e59ec44f33c614c5095249a46097");
            return;
        }
        super.h();
        ((GridCellInfo) getInfo()).setChildren(null);
        ((GridCellInfo) getInfo()).setBackgroundView(null);
        ((GridCellInfo) getInfo()).setMaskView(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof l) {
                GridCellInfo gridCellInfo = (GridCellInfo) getInfo();
                RandomAccess info = ((l) bVar).getInfo();
                if (info == null) {
                    throw new o("null cannot be cast to non-null type kotlin.collections.ArrayList<com.dianping.shield.dynamic.model.view.GridItemViewInfo> /* = java.util.ArrayList<com.dianping.shield.dynamic.model.view.GridItemViewInfo> */");
                }
                gridCellInfo.setChildren((ArrayList) info);
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) {
                com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a aVar = (com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) bVar;
                ViewInfo childInfo = aVar.getChildInfo();
                if (childInfo instanceof ExtraReusableViewInfo) {
                    GridCellInfo gridCellInfo2 = (GridCellInfo) getInfo();
                    ViewInfo childInfo2 = aVar.getChildInfo();
                    if (childInfo2 == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo");
                    }
                    gridCellInfo2.setBackgroundView(new ExtraViewUnionType.ExtraReusableViewInfo((ExtraReusableViewInfo) childInfo2));
                } else if (childInfo instanceof ExtraViewInfo) {
                    GridCellInfo gridCellInfo3 = (GridCellInfo) getInfo();
                    ViewInfo childInfo3 = aVar.getChildInfo();
                    if (childInfo3 == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.model.view.ExtraViewInfo");
                    }
                    gridCellInfo3.setBackgroundView(new ExtraViewUnionType.ExtraViewInfo((ExtraViewInfo) childInfo3));
                } else {
                    continue;
                }
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) {
                com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h hVar = (com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) bVar;
                ViewInfo childInfo4 = hVar.getChildInfo();
                if (childInfo4 instanceof ExtraReusableViewInfo) {
                    GridCellInfo gridCellInfo4 = (GridCellInfo) getInfo();
                    ViewInfo childInfo5 = hVar.getChildInfo();
                    if (childInfo5 == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo");
                    }
                    gridCellInfo4.setMaskView(new ExtraViewUnionType.ExtraReusableViewInfo((ExtraReusableViewInfo) childInfo5));
                } else if (childInfo4 instanceof ExtraViewInfo) {
                    GridCellInfo gridCellInfo5 = (GridCellInfo) getInfo();
                    ViewInfo childInfo6 = hVar.getChildInfo();
                    if (childInfo6 == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.model.view.ExtraViewInfo");
                    }
                    gridCellInfo5.setMaskView(new ExtraViewUnionType.ExtraViewInfo((ExtraViewInfo) childInfo6));
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
    }
}
