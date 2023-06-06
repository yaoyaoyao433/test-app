package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.os.Bundle;
import com.dianping.shield.lifecycle.AppObserver;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.lifecycle.PageLifecycleObserver;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.mrn.containerplugin.stage.IContainerLifeCycleStage;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0012\u0010 \u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\b\u0010#\u001a\u00020\u0015H\u0016J\b\u0010$\u001a\u00020\u0015H\u0016J\u0012\u0010%\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010&\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/VCPageEventDelegate;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/PageEventListener;", "Lcom/dianping/shield/lifecycle/PageLifecycleObserver;", "vcPage", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModulesVCPageView;Lcom/facebook/react/uimanager/ThemedReactContext;)V", "DEBUG", "", "activityCount", "", "appearState", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/PageAppearanceType;", "containerDisappearShouldCall", "isLifeCycleOnStop", "getAction", "", "payload", "Lcom/facebook/react/bridge/ReadableMap;", SnifferDBHelper.COLUMN_LOG, "", "tag", "msg", "onAppear", "onContainerAppear", "rootTag", IContainerLifeCycleStage.IContainerDisappearStage.NAME, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDisappear", "onPause", "onResume", "onStart", "onStop", "onWillAppear", "onWillDisappear", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class i implements PageLifecycleObserver {
    public static ChangeQuickRedirect a;
    public h b;
    public int c;
    public final e d;
    public final ao e;
    private boolean f;
    private boolean g;

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa156ba2e33a8fe418b7fce5a8defb6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa156ba2e33a8fe418b7fce5a8defb6f");
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2dfd18681275127aba344ba29f363bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2dfd18681275127aba344ba29f363bb");
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc62ea2ac1d54e035e6a709cbf12b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc62ea2ac1d54e035e6a709cbf12b2e");
        }
    }

    public i(@NotNull e eVar, @NotNull ao aoVar) {
        kotlin.jvm.internal.h.b(eVar, "vcPage");
        kotlin.jvm.internal.h.b(aoVar, "reactContext");
        Object[] objArr = {eVar, aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72adc3dd84908480ddc2da908a395c56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72adc3dd84908480ddc2da908a395c56");
            return;
        }
        this.d = eVar;
        this.e = aoVar;
        this.b = h.None;
    }

    public final void a(@Nullable ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faafffa7197ef965cd591bdbd3abb2fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faafffa7197ef965cd591bdbd3abb2fb");
            return;
        }
        a(AppearanceModule.NAME, "willAppear " + this.d.getId() + Constants.SPACE + c(readableMap));
        this.c = AppObserver.INSTANCE.getActivityCount();
        if (this.b == h.Appear || !this.d.b) {
            return;
        }
        String c = c(readableMap);
        PageAppearType pageAppearType = PageAppearType.APPEAR;
        if (this.b == h.Disappear) {
            pageAppearType = PageAppearType.PAGE_BACK;
        }
        StringBuilder sb = new StringBuilder("willAppear ");
        sb.append(this.d.getId());
        sb.append(Constants.SPACE);
        sb.append(c);
        sb.append(Constants.SPACE);
        sb.append(pageAppearType);
        sb.append(Constants.SPACE);
        sb.append(readableMap == null ? "fromNative" : "");
        a("AppearanceEvent", sb.toString());
        this.b = h.Appear;
        this.d.a(pageAppearType);
    }

    public final void b(@Nullable ReadableMap readableMap) {
        PageDisappearType pageDisappearType;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f678f37ca5177b48d77036e9085ea107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f678f37ca5177b48d77036e9085ea107");
            return;
        }
        a(AppearanceModule.NAME, "willDisappear " + this.d.getId() + Constants.SPACE + c(readableMap));
        this.c = AppObserver.INSTANCE.getActivityCount();
        if (this.b == h.Disappear) {
            return;
        }
        String c = c(readableMap);
        if (kotlin.jvm.internal.h.a((Object) c, (Object) "Navigation/PUSH") || kotlin.jvm.internal.h.a((Object) c, (Object) "Navigation/NAVIGATE") || kotlin.jvm.internal.h.a((Object) c, (Object) "Navigation/INIT")) {
            pageDisappearType = PageDisappearType.GO_AHEAD;
        } else {
            pageDisappearType = PageDisappearType.GO_BACK;
        }
        StringBuilder sb = new StringBuilder("willDisappear ");
        sb.append(this.d.getId());
        sb.append(Constants.SPACE);
        sb.append(c);
        sb.append(Constants.SPACE);
        sb.append(pageDisappearType);
        this.b = h.Disappear;
        this.d.a(pageDisappearType);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ t.b c;

        public a(t.b bVar) {
            this.c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [com.dianping.shield.lifecycle.PageDisappearType, T] */
        @Override // java.lang.Runnable
        public final void run() {
            T t;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6da88746f668c9e9c02186a11cbfa8a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6da88746f668c9e9c02186a11cbfa8a7");
                return;
            }
            if (!i.this.g) {
                i.this.f = true;
            }
            if (AppObserver.INSTANCE.isForeground()) {
                if (i.this.b == h.Disappear) {
                    return;
                }
                i.this.b = h.Disappear;
                t.b bVar = this.c;
                if (i.this.c == AppObserver.INSTANCE.getActivityCount()) {
                    t = PageDisappearType.GO_BACK;
                } else {
                    t = PageDisappearType.GO_AHEAD;
                }
                bVar.a = t;
            } else {
                i.this.b = h.ActiveChanged;
                this.c.a = PageDisappearType.RESIGN_ACTIVE;
            }
            i iVar = i.this;
            iVar.a("AppearanceEvent", "containerDidDisappear " + i.this.d.getId() + Constants.SPACE + ((PageDisappearType) this.c.a));
            i.this.d.a((PageDisappearType) this.c.a);
        }
    }

    public final String c(ReadableMap readableMap) {
        ReadableMap map;
        String string;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ae4c502e8d16f2b4a343072f246d66", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ae4c502e8d16f2b4a343072f246d66") : (readableMap == null || (map = readableMap.getMap("action")) == null || (string = map.getString("type")) == null) ? "" : string;
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c3a13f8e70c662f0cd596957d5e5541", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c3a13f8e70c662f0cd596957d5e5541");
        } else {
            this.g = false;
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d5d2249642d51f470277d8eb196b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d5d2249642d51f470277d8eb196b17");
        } else {
            this.g = false;
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97eab9269b85e786adff5414f98b9ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97eab9269b85e786adff5414f98b9ef3");
        } else {
            this.g = false;
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c146a5ce9499b5e3bfbdbb92a545d74e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c146a5ce9499b5e3bfbdbb92a545d74e");
            return;
        }
        this.g = true;
        if (this.f) {
            this.f = false;
            if (AppObserver.INSTANCE.isForeground()) {
                return;
            }
            this.b = h.ActiveChanged;
            this.d.a(PageDisappearType.RESIGN_ACTIVE);
        }
    }
}
