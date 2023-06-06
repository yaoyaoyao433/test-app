package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab;

import com.dianping.gcmrnmodule.protocols.f;
import com.dianping.gcmrnmodule.protocols.g;
import com.dianping.gcmrnmodule.protocols.h;
import com.dianping.gcmrnmodule.wrapperviews.b;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.l;
import com.dianping.gcmrnmodule.wrapperviews.events.v;
import com.dianping.shield.dynamic.model.cell.TabCellInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewInfo;
import com.dianping.shield.dynamic.model.view.ExtraViewUnionType;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/tab/MRNModuleTabCellItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemWrapperView;", "Lcom/dianping/shield/dynamic/model/cell/TabCellInfo;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnSelectProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnHoverStatusChangedProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnScrollEventProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "createInfoInstance", "onHoverStatusChanged", "", "params", "Lorg/json/JSONObject;", "onSelect", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a<TabCellInfo> implements f, g, h {
    public static ChangeQuickRedirect g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60fe11830fd81695089240910061006", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60fe11830fd81695089240910061006");
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void a(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eedf2c51ab21b53516ea57e7d24cbe34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eedf2c51ab21b53516ea57e7d24cbe34");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.a(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void b(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6d7ee5862b8f5ca969e87167848656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6d7ee5862b8f5ca969e87167848656");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.b(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void c(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06a87df3679205e5c4ecc103735613ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06a87df3679205e5c4ecc103735613ed");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.c(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void d(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd97a9c2f0331e587110b8dff2e9f72c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd97a9c2f0331e587110b8dff2e9f72c");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.d(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void e(@Nullable Object obj, @NotNull b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b685f11cb0bc58fe755c8bf50c03c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b685f11cb0bc58fe755c8bf50c03c27");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.e(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d73b0a1437a5bfe6e16933c7b38b208", RobustBitConfig.DEFAULT_VALUE) ? (TabCellInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d73b0a1437a5bfe6e16933c7b38b208") : new TabCellInfo();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.a, com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f823f0b01c33998d349f9cd87f6224a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f823f0b01c33998d349f9cd87f6224a");
            return;
        }
        super.h();
        ((TabCellInfo) getInfo()).setChildren(null);
        ((TabCellInfo) getInfo()).setBackgroundView(null);
        ((TabCellInfo) getInfo()).setMaskView(null);
        ((TabCellInfo) getInfo()).setSlideBar(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar instanceof l) {
                ((TabCellInfo) getInfo()).setChildren((ArrayList) ((l) bVar).getInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) {
                TabCellInfo tabCellInfo = (TabCellInfo) getInfo();
                ViewInfo childInfo = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.a) bVar).getChildInfo();
                if (childInfo == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.model.view.ExtraViewInfo");
                }
                tabCellInfo.setBackgroundView(new ExtraViewUnionType.ExtraViewInfo((ExtraViewInfo) childInfo));
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) {
                TabCellInfo tabCellInfo2 = (TabCellInfo) getInfo();
                ViewInfo childInfo2 = ((com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.h) bVar).getChildInfo();
                if (childInfo2 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.shield.dynamic.model.view.ExtraViewInfo");
                }
                tabCellInfo2.setMaskView(new ExtraViewUnionType.ExtraViewInfo((ExtraViewInfo) childInfo2));
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tab.a) {
                ((TabCellInfo) getInfo()).setSlideBar(((com.dianping.gcmrnmodule.wrapperviews.containers.tab.a) bVar).getChildInfo());
            }
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.h
    public final void d(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51622c1d2d0ca1c39800ff587f442c30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51622c1d2d0ca1c39800ff587f442c30");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new v(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.f
    public final void a_(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55e7f86bcad59914b13e1607309b5792", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55e7f86bcad59914b13e1607309b5792");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new com.dianping.gcmrnmodule.wrapperviews.events.l(getId(), jSONObject));
    }
}
