package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import com.dianping.gcmrnmodule.protocols.g;
import com.dianping.gcmrnmodule.wrapperviews.events.l;
import com.dianping.gcmrnmodule.wrapperviews.events.v;
import com.dianping.shield.dynamic.model.module.BaseTabModuleInfo;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0011J\b\u0010\u0018\u001a\u00020\rH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperView;", "T", "Lcom/dianping/shield/dynamic/model/module/BaseTabModuleInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnSelectProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnScrollEventProtocol;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleBaseWrapperViewOnHoverStatusChangedProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "tabViewContainerWrapperView", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabViewContainerWrapperView;", "addChildWrapperView", "", "child", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "index", "", "onHoverStatusChanged", "params", "Lorg/json/JSONObject;", "onSelect", "onTabButtonsNeedUpdate", "showTabCount", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public abstract class a<T extends BaseTabModuleInfo> extends com.dianping.gcmrnmodule.wrapperviews.a<T> implements com.dianping.gcmrnmodule.protocols.f, com.dianping.gcmrnmodule.protocols.g, com.dianping.gcmrnmodule.protocols.h {
    public static ChangeQuickRedirect g;
    public com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a515698166305daaec5a719942485639", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a515698166305daaec5a719942485639");
        } else {
            setVisibility(4);
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void a(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc84c570cc9556f594ae6b4b6846443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc84c570cc9556f594ae6b4b6846443");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.a(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void b(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b16c408bc5715a5563ad2d861b7dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b16c408bc5715a5563ad2d861b7dde");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.b(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void c(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b8cd296f6d39a447b801de3734ab0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b8cd296f6d39a447b801de3734ab0c");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.c(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void d(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fbfe2492c61db10e0ba2839a557ae2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fbfe2492c61db10e0ba2839a557ae2b");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.d(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.g
    public final void e(@Nullable Object obj, @NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar) {
        Object[] objArr = {obj, bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489f428ca6cb4c79c0964c1bf7206e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489f428ca6cb4c79c0964c1bf7206e9a");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        g.a.e(this, obj, bVar);
    }

    @Override // com.dianping.gcmrnmodule.protocols.h
    public final void d(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521396edc48691aabd4287f33b059fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521396edc48691aabd4287f33b059fa1");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new v(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.f
    public void a_(@NotNull JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "413a3cb40b4ad53490a5adba7ff3a76a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "413a3cb40b4ad53490a5adba7ff3a76a");
            return;
        }
        kotlin.jvm.internal.h.b(jSONObject, "params");
        a(new l(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void a(@NotNull com.dianping.gcmrnmodule.wrapperviews.b<?> bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4496c08b0a7c6e55a835523357201f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4496c08b0a7c6e55a835523357201f00");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, "child");
        super.a(bVar, i);
        if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.b) {
            this.h = (com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.b) bVar;
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f730517834f673bbe6aaceb266598aa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f730517834f673bbe6aaceb266598aa1");
            return;
        }
        super.h();
        ((BaseTabModuleInfo) getInfo()).setTabConfigs(null);
        ((BaseTabModuleInfo) getInfo()).setChildren(null);
        ((BaseTabModuleInfo) getInfo()).setBackgroundView(null);
        ((BaseTabModuleInfo) getInfo()).setMaskView(null);
        ((BaseTabModuleInfo) getInfo()).setSlideBar(null);
        ((BaseTabModuleInfo) getInfo()).setTabScrollEvent(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            com.dianping.gcmrnmodule.wrapperviews.b bVar = (com.dianping.gcmrnmodule.wrapperviews.b) it.next();
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.c) {
                ((BaseTabModuleInfo) getInfo()).setTabConfigs((ArrayList) ((com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.c) bVar).getInfo());
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.b) {
                com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.b bVar2 = (com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.b) bVar;
                ((BaseTabModuleInfo) getInfo()).setChildren(bVar2.getChildren());
                ((BaseTabModuleInfo) getInfo()).setBackgroundView(bVar2.getBackgroundView());
                ((BaseTabModuleInfo) getInfo()).setMaskView(bVar2.getMaskView());
                ((BaseTabModuleInfo) getInfo()).setSlideBar(bVar2.getSlideBar());
                ((BaseTabModuleInfo) getInfo()).setTabScrollEvent(bVar2.getTabScrollEvent());
            }
        }
    }
}
