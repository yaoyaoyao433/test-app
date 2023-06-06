package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.annotation.SuppressLint;
import com.dianping.gcmrnmodule.wrapperviews.events.t;
import com.dianping.shield.dynamic.model.vc.ModulesVCInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0014J\b\u0010\u0013\u001a\u00020\tH\u0014J\b\u0010\u0014\u001a\u00020\tH\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001aH\u0016J%\u0010\u001b\u001a\u00020\t2\u0016\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001e0\u001d\"\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0002\u0010\u001fJ\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010 \u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\tJ\b\u0010)\u001a\u00020\u0016H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCItemWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseHostWrapperView;", "Lcom/dianping/shield/dynamic/model/vc/ModulesVCInfo;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", DMKeys.KEY_MODULE_KEYS, "Lcom/dianping/gcmrnmodule/objects/ModuleKeys;", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "onScroll", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, DMKeys.KEY_ON_SCROLL_END_DRAG, DMKeys.KEY_THROTTLE, "", "waitRefresh", "createInfoInstance", "needDragEvent", "needMomentumEvent", "needOnScroll", "onPageAppear", "", "type", "Lcom/dianping/shield/lifecycle/PageAppearType;", "onPageDisappear", "Lcom/dianping/shield/lifecycle/PageDisappearType;", com.alipay.sdk.widget.d.p, "param", "", "", "([Ljava/lang/Object;)Z", "setModuleKeys", "setNeedBeginDrag", "setNeedEndDrag", "setNeedMomentumScrollBegin", "momentumScrollBegin", "setNeedMomentumScrollEnd", "setNeedScroll", "setScrollEventThrottle", "setWaitRefresh", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class d extends com.dianping.gcmrnmodule.wrapperviews.a<ModulesVCInfo> {
    public static ChangeQuickRedirect g;
    private com.dianping.gcmrnmodule.objects.d h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull ReactContext reactContext) {
        super(reactContext);
        kotlin.jvm.internal.h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4297968d5a5e3ac7f905090760618a10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4297968d5a5e3ac7f905090760618a10");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ Object g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0adf77652cf60ac795123066451ffa2", RobustBitConfig.DEFAULT_VALUE) ? (ModulesVCInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0adf77652cf60ac795123066451ffa2") : new ModulesVCInfo();
    }

    public final void setModuleKeys(@Nullable com.dianping.gcmrnmodule.objects.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f232aaa37de6b2ea5c051fd7030ac23f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f232aaa37de6b2ea5c051fd7030ac23f");
        } else if (dVar != null) {
            this.h = dVar;
            ((ModulesVCInfo) getInfo()).setModuleKeys(dVar.b);
        } else {
            this.h = null;
            ((ModulesVCInfo) getInfo()).setModuleKeys(null);
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d097e779ebd6c8d1af3067eba5df2ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d097e779ebd6c8d1af3067eba5df2ba");
            return;
        }
        super.h();
        ((ModulesVCInfo) getInfo()).setLoadingView(null);
        ((ModulesVCInfo) getInfo()).setLoadingFailView(null);
        ((ModulesVCInfo) getInfo()).setBackgroundView(null);
        ((ModulesVCInfo) getInfo()).setMaskView(null);
        ((ModulesVCInfo) getInfo()).setPageBackgroundView(null);
        ((ModulesVCInfo) getInfo()).setPageMaskView(null);
        ((ModulesVCInfo) getInfo()).setDragRefreshView(null);
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            com.dianping.gcmrnmodule.wrapperviews.b bVar = (com.dianping.gcmrnmodule.wrapperviews.b) it.next();
            if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) {
                com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a aVar = (com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) bVar;
                String moduleKey = aVar.getModuleKey();
                if (moduleKey != null) {
                    com.dianping.gcmrnmodule.objects.d dVar = this.h;
                    if (dVar != null) {
                        dVar.a(moduleKey, aVar.getInfo());
                    }
                    if (kotlin.jvm.internal.h.a((Object) moduleKey, (Object) ((ModulesVCInfo) getInfo()).getFrozenModuleKey())) {
                        ((ModulesVCInfo) getInfo()).setFrozenModuleKey(aVar.getInfo().getKey());
                    }
                }
            } else if (bVar instanceof com.dianping.gcmrnmodule.wrapperviews.modulevc.a) {
                com.dianping.gcmrnmodule.wrapperviews.modulevc.a aVar2 = (com.dianping.gcmrnmodule.wrapperviews.modulevc.a) bVar;
                ((ModulesVCInfo) getInfo()).setLoadingView(aVar2.getLoadingView());
                ((ModulesVCInfo) getInfo()).setLoadingFailView(aVar2.getLoadingFailView());
                ((ModulesVCInfo) getInfo()).setBackgroundView(aVar2.getBackgroundView());
                ((ModulesVCInfo) getInfo()).setMaskView(aVar2.getMaskView());
                ((ModulesVCInfo) getInfo()).setPageBackgroundView(aVar2.getPageBackgroundView());
                ((ModulesVCInfo) getInfo()).setPageMaskView(aVar2.getPageMaskView());
                ((ModulesVCInfo) getInfo()).setDragRefreshView(aVar2.getDragRefreshView());
            }
        }
    }

    public final void setNeedScroll(boolean z) {
        this.i = z;
    }

    public final void setNeedMomentumScrollBegin(boolean z) {
        this.k = z;
    }

    public final void setNeedMomentumScrollEnd(boolean z) {
        this.j = z;
    }

    public final void setNeedBeginDrag(boolean z) {
        this.l = z;
    }

    public final void setNeedEndDrag(boolean z) {
        this.m = z;
    }

    public final void setScrollEventThrottle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aeb967b5fa442493b566b5d7c4c59f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aeb967b5fa442493b566b5d7c4c59f9");
            return;
        }
        this.o = i;
        com.dianping.gcmrnmodule.wrapperviews.items.utils.b scrollEventDetector = getScrollEventDetector();
        if (scrollEventDetector != null) {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.gcmrnmodule.wrapperviews.items.utils.b.a;
            if (PatchProxy.isSupport(objArr2, scrollEventDetector, changeQuickRedirect2, false, "68eac8e3613145e579b8b0a9c955a88a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, scrollEventDetector, changeQuickRedirect2, false, "68eac8e3613145e579b8b0a9c955a88a");
            } else {
                scrollEventDetector.b.setThrottle(i);
            }
        }
    }

    public final void setWaitRefresh(boolean z) {
        this.n = z;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final boolean a(@NotNull Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "b85baa1121d885ca0fae17b7dadaeabb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "b85baa1121d885ca0fae17b7dadaeabb")).booleanValue();
        }
        kotlin.jvm.internal.h.b(objArr, "param");
        if (this.n && objArr.length == 1 && objArr[0] != null) {
            Object obj = objArr[0];
            if (obj == null) {
                throw new o("null cannot be cast to non-null type kotlin.Int");
            }
            a(new t(getId(), ((Integer) obj).intValue()));
            return true;
        }
        super.a(Arrays.copyOf(objArr, objArr.length));
        return false;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final void a(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f57afc0ca12cd801d52b1c0e4aa41f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f57afc0ca12cd801d52b1c0e4aa41f0");
            return;
        }
        kotlin.jvm.internal.h.b(pageAppearType, "type");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", pageAppearType.getId());
        } catch (JSONException unused) {
        }
        a(new com.dianping.gcmrnmodule.wrapperviews.events.c(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final void a(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0487c5ed7fb4919dbe3e9f7ca16a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0487c5ed7fb4919dbe3e9f7ca16a49");
            return;
        }
        kotlin.jvm.internal.h.b(pageDisappearType, "type");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", pageDisappearType.getId());
        } catch (JSONException unused) {
        }
        a(new com.dianping.gcmrnmodule.wrapperviews.events.g(getId(), jSONObject));
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f9476ed43d8a3a4fe4b40de032277b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f9476ed43d8a3a4fe4b40de032277b")).booleanValue() : this.i || d();
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final boolean d() {
        return this.j || this.k || this.o == 0;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final boolean e() {
        return this.l || this.m || this.o == 0;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.a
    public final int f() {
        return this.o;
    }
}
