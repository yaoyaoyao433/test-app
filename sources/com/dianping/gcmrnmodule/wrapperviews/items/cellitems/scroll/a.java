package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.protocols.g;
import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.l;
import com.dianping.shield.dynamic.model.cell.ScrollCellInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/scroll/MRNModuleScrollCellItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;", "Lcom/dianping/shield/dynamic/model/cell/ScrollCellInfo;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnScrollEventProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createInfoInstance", "onAttachTriggered", "", "params", "Lorg/json/JSONObject;", "onPageChanged", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a<ScrollCellInfo> implements g {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc23bc87209663779952268aaab71dbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc23bc87209663779952268aaab71dbe");
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void a(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a4d1d9e6b0195baf3226e23bf08c38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a4d1d9e6b0195baf3226e23bf08c38");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.a(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void b(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a59145edf34c90d188e9ef7cbb64ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a59145edf34c90d188e9ef7cbb64ad");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.b(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void c(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db07c59176821e1c8117a953e94703f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db07c59176821e1c8117a953e94703f6");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.c(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void d(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c28057e6d6f3736e2edd3934b2b8596", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c28057e6d6f3736e2edd3934b2b8596");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.d(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void e(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "284a4b4d8958bcc61843ec51ebff5682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "284a4b4d8958bcc61843ec51ebff5682");
            return;
        }
        h.b(bVar, Constants.EventType.VIEW);
        g.a.e(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a4c9e0156057840dcb8cade76762bab", RobustBitConfig.DEFAULT_VALUE) ? (ScrollCellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a4c9e0156057840dcb8cade76762bab") : new ScrollCellInfo(null, 1, null);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d61bd240fa1bd03f4355cdde6980cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d61bd240fa1bd03f4355cdde6980cc5");
            return;
        }
        super.h();
        ((ScrollCellInfo) getInfo()).setChildren(null);
        ((ScrollCellInfo) getInfo()).setBackgroundView(null);
        ((ScrollCellInfo) getInfo()).setMaskView(null);
        ((ScrollCellInfo) getInfo()).setAttachView(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof l) {
                ((ScrollCellInfo) getInfo()).setChildren((ArrayList) ((l) bVar).getInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) {
                ScrollCellInfo scrollCellInfo = (ScrollCellInfo) getInfo();
                ViewInfo childInfo = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) bVar).getChildInfo();
                if (!(childInfo instanceof ExtraViewInfo)) {
                    childInfo = null;
                }
                ExtraViewInfo extraViewInfo = (ExtraViewInfo) childInfo;
                scrollCellInfo.setBackgroundView(extraViewInfo != null ? new ExtraViewUnionType.ExtraViewInfo(extraViewInfo) : null);
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) {
                ScrollCellInfo scrollCellInfo2 = (ScrollCellInfo) getInfo();
                ViewInfo childInfo2 = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) bVar).getChildInfo();
                if (!(childInfo2 instanceof ExtraViewInfo)) {
                    childInfo2 = null;
                }
                ExtraViewInfo extraViewInfo2 = (ExtraViewInfo) childInfo2;
                scrollCellInfo2.setMaskView(extraViewInfo2 != null ? new ExtraViewUnionType.ExtraViewInfo(extraViewInfo2) : null);
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.scrollcell.a) {
                ScrollCellInfo scrollCellInfo3 = (ScrollCellInfo) getInfo();
                ViewInfo childInfo3 = ((com.dianping.gcmrnmodule.wrapperviews.containers.scrollcell.a) bVar).getChildInfo();
                if (!(childInfo3 instanceof ScrollCellAttachViewInfo)) {
                    childInfo3 = null;
                }
                scrollCellInfo3.setAttachView((ScrollCellAttachViewInfo) childInfo3);
            }
        }
    }
}
