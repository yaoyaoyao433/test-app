package com.dianping.shield.lifecycle;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\n\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/dianping/shield/lifecycle/PageObserver;", "Lcom/dianping/shield/lifecycle/PageLifecycleObserver;", "dispatcher", "Lcom/dianping/shield/lifecycle/PageLifecycleDispatcher;", "(Lcom/dianping/shield/lifecycle/PageLifecycleDispatcher;)V", "DEBUG", "", "TAG", "", "callback", "com/dianping/shield/lifecycle/PageObserver$callback$1", "Lcom/dianping/shield/lifecycle/PageObserver$callback$1;", "isBackgroundLocked", "preEvent", "Lcom/dianping/shield/lifecycle/LifecycleEvent;", "prePreEvent", SnifferDBHelper.COLUMN_LOG, "", "msg", "moveToEvent", "newEvent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class PageObserver implements PageLifecycleObserver {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean DEBUG;
    private final String TAG;
    private final PageObserver$callback$1 callback;
    private final PageLifecycleDispatcher dispatcher;
    private boolean isBackgroundLocked;
    private LifecycleEvent preEvent;
    private LifecycleEvent prePreEvent;

    /* JADX WARN: Type inference failed for: r12v4, types: [com.dianping.shield.lifecycle.PageObserver$callback$1] */
    public PageObserver(@NotNull PageLifecycleDispatcher pageLifecycleDispatcher) {
        h.b(pageLifecycleDispatcher, "dispatcher");
        Object[] objArr = {pageLifecycleDispatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86a5157b4337fbfb426f542e107a5bd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86a5157b4337fbfb426f542e107a5bd6");
            return;
        }
        this.dispatcher = pageLifecycleDispatcher;
        this.TAG = "Page";
        this.prePreEvent = LifecycleEvent.ON_ANY;
        this.preEvent = LifecycleEvent.ON_ANY;
        this.callback = new AppSwitchCallback() { // from class: com.dianping.shield.lifecycle.PageObserver$callback$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.lifecycle.AppSwitchCallback
            public final void onForeground() {
            }

            @Override // com.dianping.shield.lifecycle.AppSwitchCallback
            public final void onBackground() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "141e0b28e04f130d518dfc457ab794b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "141e0b28e04f130d518dfc457ab794b3");
                } else {
                    PageObserver.this.isBackgroundLocked = true;
                }
            }
        };
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5bc64cace0288ba5da59cdecbaa2a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5bc64cace0288ba5da59cdecbaa2a11");
            return;
        }
        log("appear");
        moveToEvent(LifecycleEvent.ON_CREATE);
        AppObserver.INSTANCE.registerAppSwitchCallback(this.callback);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "223bc1e6634362143704bc608029dc9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "223bc1e6634362143704bc608029dc9f");
            return;
        }
        if (this.preEvent == LifecycleEvent.ON_CREATE) {
            this.dispatcher.dispatchPageAppear(PageAppearType.APPEAR);
        }
        moveToEvent(LifecycleEvent.ON_START);
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "304d8df578453ff1aa2f84a0750a5ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "304d8df578453ff1aa2f84a0750a5ed8");
            return;
        }
        log("onResume, " + this.preEvent + Constants.SPACE + this.prePreEvent);
        if (this.prePreEvent == LifecycleEvent.ON_STOP || this.preEvent == LifecycleEvent.ON_PAUSE) {
            if (this.isBackgroundLocked) {
                this.dispatcher.dispatchPageAppear(PageAppearType.BECOME_ACTIVE);
                log("become-active");
            } else {
                log("page-back");
                this.dispatcher.dispatchPageAppear(PageAppearType.PAGE_BACK);
            }
        }
        moveToEvent(LifecycleEvent.ON_RESUME);
        this.isBackgroundLocked = false;
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abb879a33e56399b33514c397d115bed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abb879a33e56399b33514c397d115bed");
        } else {
            moveToEvent(LifecycleEvent.ON_PAUSE);
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3345c571fdafcc19fd253ad80e2f721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3345c571fdafcc19fd253ad80e2f721");
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.dianping.shield.lifecycle.PageObserver$onStop$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    LifecycleEvent lifecycleEvent;
                    PageLifecycleDispatcher pageLifecycleDispatcher;
                    PageLifecycleDispatcher pageLifecycleDispatcher2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b88cc7b72eb008d3350c0d839e386f37", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b88cc7b72eb008d3350c0d839e386f37");
                        return;
                    }
                    lifecycleEvent = PageObserver.this.preEvent;
                    if (lifecycleEvent == LifecycleEvent.ON_PAUSE) {
                        if (!AppObserver.INSTANCE.isForeground()) {
                            PageObserver.this.isBackgroundLocked = true;
                            pageLifecycleDispatcher2 = PageObserver.this.dispatcher;
                            pageLifecycleDispatcher2.dispatchPageDisappear(PageDisappearType.RESIGN_ACTIVE);
                            PageObserver.this.log("resign-active");
                        } else {
                            PageObserver.this.log("go-ahead");
                            pageLifecycleDispatcher = PageObserver.this.dispatcher;
                            pageLifecycleDispatcher.dispatchPageDisappear(PageDisappearType.GO_AHEAD);
                        }
                    }
                    PageObserver.this.moveToEvent(LifecycleEvent.ON_STOP);
                }
            });
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleObserver
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c050daa1fef3effede278035a4d59eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c050daa1fef3effede278035a4d59eb");
            return;
        }
        log("go-back");
        this.dispatcher.dispatchPageDisappear(PageDisappearType.GO_BACK);
        moveToEvent(LifecycleEvent.ON_DESTROY);
        AppObserver.INSTANCE.unregisterAppSwitchCallback(this.callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveToEvent(LifecycleEvent lifecycleEvent) {
        this.prePreEvent = this.preEvent;
        this.preEvent = lifecycleEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7764125f1fb9394ffe853022bbaaac93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7764125f1fb9394ffe853022bbaaac93");
        } else if (this.DEBUG) {
            new StringBuilder("LifeCycle.Event ").append(str);
        }
    }
}
