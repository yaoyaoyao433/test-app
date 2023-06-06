package com.dianping.gcmrnmodule.wrapperviews;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.ar;
import com.dianping.gcmrnmodule.protocols.i;
import com.dianping.gcmrnmodule.wrapperviews.events.n;
import com.dianping.gcmrnmodule.wrapperviews.events.p;
import com.dianping.gcmrnmodule.wrapperviews.events.r;
import com.dianping.shield.component.widgets.PageContainerRecyclerView;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0019H\u0014J#\u0010\u001e\u001a\u00020\u001b2\u0016\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 \"\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u001bJ#\u0010$\u001a\u00020\u001b2\u0016\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 \"\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020)H\u0016J%\u0010*\u001a\u00020\u00192\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 \"\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001bH\u0016J\b\u0010.\u001a\u00020/H\u0014R*\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8G@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00060"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "T", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleContainerProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", "value", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "hostInterface", "getHostInterfaceField", "()Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "setHostInterface", "(Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;)V", "scrollEventDetector", "Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector;", "getScrollEventDetector", "()Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector;", "setScrollEventDetector", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/utils/MRNModuleScrollEventDetector;)V", "getHostInterface", "getWhiteboard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "needDragEvent", "", "needLoadMore", "", "needMomentumEvent", "needOnScroll", "onAppear", "params", "", "", "([Ljava/lang/Object;)V", "onDestroy", "onDisappear", "onPageAppear", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "onPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", d.p, "param", "([Ljava/lang/Object;)Z", "retryForLoadingFail", DMKeys.KEY_THROTTLE, "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public abstract class a<T extends DiffableInfo> extends b<T> implements i {
    public static ChangeQuickRedirect a;
    @Nullable
    private com.dianping.gcmrnmodule.wrapperviews.items.utils.b g;
    @Nullable
    private com.dianping.gcmrnmodule.hostwrapper.a h;

    public void a() {
    }

    public void b() {
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public int f() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45ce4c32b7609da51e484b48f55052ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45ce4c32b7609da51e484b48f55052ad");
        }
    }

    @Nullable
    public final com.dianping.gcmrnmodule.wrapperviews.items.utils.b getScrollEventDetector() {
        return this.g;
    }

    public final void setScrollEventDetector(@Nullable com.dianping.gcmrnmodule.wrapperviews.items.utils.b bVar) {
        this.g = bVar;
    }

    @JvmName(name = "getHostInterfaceField")
    @Nullable
    public final com.dianping.gcmrnmodule.hostwrapper.a getHostInterfaceField() {
        return this.h;
    }

    public final void setHostInterface(@Nullable com.dianping.gcmrnmodule.hostwrapper.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88200715d72eb247e273a8b12a910d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88200715d72eb247e273a8b12a910d00");
            return;
        }
        this.h = aVar;
        com.dianping.gcmrnmodule.hostwrapper.a aVar2 = this.h;
        if (aVar2 == null || !(aVar2.getPageContainer() instanceof CommonPageContainer)) {
            return;
        }
        ab<?> pageContainer = aVar2.getPageContainer();
        if (!(pageContainer instanceof CommonPageContainer)) {
            pageContainer = null;
        }
        CommonPageContainer commonPageContainer = (CommonPageContainer) pageContainer;
        ViewGroup agentContainerView = commonPageContainer != null ? commonPageContainer.getAgentContainerView() : null;
        if (agentContainerView instanceof PageContainerRecyclerView) {
            this.g = new com.dianping.gcmrnmodule.wrapperviews.items.utils.b(getReactContext(), (PageContainerRecyclerView) agentContainerView, getId(), f());
            if (c()) {
                com.dianping.gcmrnmodule.wrapperviews.items.utils.b bVar = this.g;
                if (bVar != null) {
                    commonPageContainer.addContentScrollOffsetListener(bVar.d);
                    if (d()) {
                        com.dianping.gcmrnmodule.wrapperviews.items.utils.b bVar2 = this.g;
                        if (bVar2 == null) {
                            throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.utils.MRNModuleScrollEventDetector");
                        }
                        commonPageContainer.addFlingListener(bVar2.e);
                    }
                } else {
                    throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.utils.MRNModuleScrollEventDetector");
                }
            }
            if (e()) {
                com.dianping.gcmrnmodule.wrapperviews.items.utils.b bVar3 = this.g;
                if (bVar3 == null) {
                    throw new o("null cannot be cast to non-null type com.dianping.gcmrnmodule.wrapperviews.items.utils.MRNModuleScrollEventDetector");
                }
                commonPageContainer.addDragStatusListener(bVar3.c);
            }
        }
    }

    public boolean a(@NotNull Object... objArr) {
        r rVar;
        boolean z = true;
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "77bbef2dd20b9748c6d67685480cd0a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "77bbef2dd20b9748c6d67685480cd0a6")).booleanValue();
        }
        h.b(objArr, "param");
        if (objArr.length == 1 && objArr[0] != null) {
            Object obj = objArr[0];
            if (obj == null) {
                throw new o("null cannot be cast to non-null type kotlin.Int");
            }
            rVar = new r(getId(), ((Integer) obj).intValue());
        } else {
            rVar = new r(getId());
            z = false;
        }
        a(rVar);
        return z;
    }

    public void a(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5119aa8fd8f9ba2a45c5eb62152b5812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5119aa8fd8f9ba2a45c5eb62152b5812");
            return;
        }
        h.b(pageAppearType, "type");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", pageAppearType.getId());
        } catch (JSONException unused) {
        }
        a(new n(getId(), jSONObject));
    }

    public void a(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea38d95d77ccecb9702c74cd77b0777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea38d95d77ccecb9702c74cd77b0777");
            return;
        }
        h.b(pageDisappearType, "type");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", pageDisappearType.getId());
        } catch (JSONException unused) {
        }
        a(new p(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.protocols.i
    @Nullable
    public com.dianping.gcmrnmodule.hostwrapper.a getHostInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc6e603f22acdc6fa94bb6410663637", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.gcmrnmodule.hostwrapper.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc6e603f22acdc6fa94bb6410663637") : getHostInterfaceField();
    }

    @Nullable
    public ar getWhiteboard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a9d0b6c2ab180c1449028da24fa6a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a9d0b6c2ab180c1449028da24fa6a5");
        }
        if (getHostInterface() != null) {
            com.dianping.gcmrnmodule.hostwrapper.a hostInterface = getHostInterface();
            if (hostInterface == null) {
                h.a();
            }
            return hostInterface.getBridge().getWhiteBoard();
        }
        return null;
    }
}
