package com.meituan.android.yoda;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.activity.YodaConfirmActivity;
import com.meituan.android.yoda.callbacks.g;
import com.meituan.android.yoda.util.aa;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class YodaConfirm {
    private static final int SYNC_DELAY = 500;
    private static final String TAG = "YodaConfirm";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static rx.subjects.b concurrencyInvokeSubject;
    private WeakReference<FragmentActivity> mActivityRef;
    private int mBusinessStyle;
    private com.meituan.android.yoda.callbacks.d mPageCallLoader;
    private String mToolbarTitle;
    private d mUIConfig;
    private com.meituan.android.yoda.callbacks.e pageDataCallback;
    private e verifyStrategyConfig;
    private a yodaConfirmLifecycle;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        public final FragmentActivity a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec56c1e2659f3fbd74436afaf38d5a4", RobustBitConfig.DEFAULT_VALUE)) {
                return (FragmentActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec56c1e2659f3fbd74436afaf38d5a4");
            }
            if (YodaConfirm.this.mActivityRef == null || y.a((Activity) YodaConfirm.this.mActivityRef.get())) {
                return null;
            }
            return (FragmentActivity) YodaConfirm.this.mActivityRef.get();
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a426fdeaf780b4de4227b78eec48ff6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a426fdeaf780b4de4227b78eec48ff6");
                return;
            }
            YodaConfirm.this.mActivityRef = null;
            YodaConfirm.this.mPageCallLoader = null;
            com.meituan.android.yoda.a.a();
        }
    }

    public YodaConfirm(FragmentActivity fragmentActivity, YodaResponseListener yodaResponseListener) {
        Object[] objArr = {fragmentActivity, yodaResponseListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e49c504c1a904b49559439873825bb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e49c504c1a904b49559439873825bb1");
            return;
        }
        this.mBusinessStyle = -1;
        com.meituan.android.yoda.horn.a.a();
        this.mActivityRef = new WeakReference<>(fragmentActivity);
        this.yodaConfirmLifecycle = new a();
        this.pageDataCallback = new com.meituan.android.yoda.callbacks.e(this.yodaConfirmLifecycle, new g(yodaResponseListener));
        if (isH5JumpInvoke()) {
            YodaConfirmActivity yodaConfirmActivity = (YodaConfirmActivity) this.mActivityRef.get();
            this.pageDataCallback.a(yodaConfirmActivity.o, yodaConfirmActivity.p);
        }
        this.mPageCallLoader = com.meituan.android.yoda.callbacks.d.a(fragmentActivity, this.pageDataCallback);
        this.verifyStrategyConfig = e.a();
    }

    public YodaConfirm(FragmentActivity fragmentActivity, IYodaVerifyListener iYodaVerifyListener) {
        Object[] objArr = {fragmentActivity, iYodaVerifyListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e461c4abc2ef2a14ece0baaf415e19c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e461c4abc2ef2a14ece0baaf415e19c5");
            return;
        }
        this.mBusinessStyle = -1;
        this.mActivityRef = new WeakReference<>(fragmentActivity);
        this.yodaConfirmLifecycle = new a();
        this.pageDataCallback = new com.meituan.android.yoda.callbacks.e(this.yodaConfirmLifecycle, iYodaVerifyListener);
        if (isH5JumpInvoke()) {
            YodaConfirmActivity yodaConfirmActivity = (YodaConfirmActivity) this.mActivityRef.get();
            this.pageDataCallback.a(yodaConfirmActivity.o, yodaConfirmActivity.p);
        }
        this.mPageCallLoader = com.meituan.android.yoda.callbacks.d.a(fragmentActivity, this.pageDataCallback);
    }

    public static YodaConfirm getInstance(@NonNull FragmentActivity fragmentActivity, @NonNull YodaResponseListener yodaResponseListener) throws Exception {
        Object[] objArr = {fragmentActivity, yodaResponseListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1b883e295e1d3bdf3de11b0b403a928", RobustBitConfig.DEFAULT_VALUE)) {
            return (YodaConfirm) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1b883e295e1d3bdf3de11b0b403a928");
        }
        if (y.a((Activity) fragmentActivity)) {
            throw new Exception("YodaConfirm init failed due to a destroyed activity !");
        }
        if (yodaResponseListener == null) {
            throw new Exception("YodaConfirm init failed due to a null listener !");
        }
        com.meituan.android.yoda.a.a(fragmentActivity);
        return new YodaConfirm(fragmentActivity, yodaResponseListener);
    }

    public static YodaConfirm getInstance(@NonNull FragmentActivity fragmentActivity, @NonNull IYodaVerifyListener iYodaVerifyListener) throws Exception {
        Object[] objArr = {fragmentActivity, iYodaVerifyListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17ddea19502405d188ae7e6b132ea1ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (YodaConfirm) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17ddea19502405d188ae7e6b132ea1ce");
        }
        if (y.a((Activity) fragmentActivity)) {
            throw new Exception("YodaConfirm init failed due to a destroyed activity !");
        }
        if (iYodaVerifyListener == null) {
            throw new Exception("YodaConfirm init failed due to a null listener !");
        }
        com.meituan.android.yoda.a.a(fragmentActivity);
        return new YodaConfirm(fragmentActivity, iYodaVerifyListener);
    }

    public final YodaConfirm registerBusinessUIConfig(d dVar) {
        this.mUIConfig = dVar;
        return this;
    }

    public final YodaConfirm registerVerifyStrategyConfig(e eVar) {
        this.verifyStrategyConfig = eVar;
        return this;
    }

    @Deprecated
    public final YodaConfirm setStyle(@StyleRes int i) {
        this.mBusinessStyle = i;
        return this;
    }

    @Deprecated
    public final YodaConfirm setTitle(@Nullable String str) {
        this.mToolbarTitle = str;
        return this;
    }

    public final void startConfirm(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfbe0dcf5321bc4a33032dd2a76f9dc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfbe0dcf5321bc4a33032dd2a76f9dc8");
        } else {
            getConcurrencyInvokeFilter().onNext(str);
        }
    }

    public static void interceptConfirm(@NonNull Context context, @NonNull String str, YodaResponseListener yodaResponseListener) {
        Object[] objArr = {context, str, yodaResponseListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d99d4d87f7da036dd4c0e7055c10ee65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d99d4d87f7da036dd4c0e7055c10ee65");
        } else {
            aa.a(context, str, com.meituan.android.yoda.plugins.d.a().b().getNetEnv(), -1, yodaResponseListener);
        }
    }

    public static boolean isInterceptReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5f268441757d1c366c73328a27a6e422", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5f268441757d1c366c73328a27a6e422")).booleanValue() : com.meituan.android.yoda.horn.a.a().b();
    }

    public static String getVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1426f43bbbf5ba92840ead8388fc8448", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1426f43bbbf5ba92840ead8388fc8448") : x.i();
    }

    private void registerConfig(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55699b58a6be6e92b07e54efcb18712a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55699b58a6be6e92b07e54efcb18712a");
            return;
        }
        com.meituan.android.yoda.a.a((com.meituan.android.yoda.config.launch.a) null);
        com.meituan.android.yoda.a.a(fragmentActivity, mergeUIConfig());
        com.meituan.android.yoda.a.a(fragmentActivity, this.verifyStrategyConfig);
        this.mUIConfig = null;
        try {
            com.meituan.android.yoda.plugins.d.a().e = fragmentActivity.getApplicationContext();
        } catch (Exception unused) {
        }
    }

    private d mergeUIConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e04abee14bf13fd348a74726fd3aca5", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e04abee14bf13fd348a74726fd3aca5");
        }
        d dVar = this.mUIConfig;
        if (this.mBusinessStyle == -1 && TextUtils.isEmpty(this.mToolbarTitle)) {
            return dVar;
        }
        if (dVar == null) {
            dVar = d.a();
        }
        if (this.mBusinessStyle != -1) {
            dVar.b = this.mBusinessStyle;
        }
        if (!TextUtils.isEmpty(this.mToolbarTitle)) {
            dVar.c = this.mToolbarTitle;
        }
        return dVar;
    }

    private void requestPage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90eacb0afbc2a4e5aa7d3ea005472a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90eacb0afbc2a4e5aa7d3ea005472a6b");
        } else {
            this.mPageCallLoader.a(str);
        }
    }

    private synchronized rx.subjects.b getConcurrencyInvokeFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22ecc32d36618be9c3de4392f3664ad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.subjects.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22ecc32d36618be9c3de4392f3664ad1");
        }
        if (concurrencyInvokeSubject == null) {
            rx.subjects.b g = rx.subjects.b.g();
            concurrencyInvokeSubject = g;
            rx.d a2 = g.c().c(500L, TimeUnit.MILLISECONDS).a(rx.android.schedulers.a.a());
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            a2.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "7597b883ed09903d95eb1663e72d744a", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "7597b883ed09903d95eb1663e72d744a") : new b(this), new rx.functions.b<Throwable>() { // from class: com.meituan.android.yoda.YodaConfirm.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr3 = {th2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2ae5a14d8d7c805673715d45920a606c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2ae5a14d8d7c805673715d45920a606c");
                    } else {
                        com.meituan.android.yoda.monitor.log.a.a(YodaConfirm.TAG, th2.getMessage(), true);
                    }
                }
            });
        }
        return concurrencyInvokeSubject;
    }

    public static /* synthetic */ void lambda$getConcurrencyInvokeFilter$0(YodaConfirm yodaConfirm, Object obj) {
        Object[] objArr = {yodaConfirm, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ceaf5fffd44454d099b3a80a0f845b7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ceaf5fffd44454d099b3a80a0f845b7b");
        } else if (obj == null || !(obj instanceof String)) {
        } else {
            String str = (String) obj;
            FragmentActivity fragmentActivity = yodaConfirm.mActivityRef == null ? null : yodaConfirm.mActivityRef.get();
            if (yodaConfirm.mPageCallLoader == null || TextUtils.isEmpty(str) || y.a((Activity) fragmentActivity)) {
                return;
            }
            Object[] objArr2 = {"yoda_verify_launch", 0, 0L, str};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.yoda.monitor.report.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "2a05685dd10036a8fe0ef0f91b84c8d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "2a05685dd10036a8fe0ef0f91b84c8d1");
            } else if (!TextUtils.isEmpty("yoda_verify_launch")) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str);
                com.meituan.android.yoda.monitor.report.a.a("yoda_verify_launch", 0, 0, jsonObject);
            }
            yodaConfirm.registerConfig(fragmentActivity);
            yodaConfirm.requestPage(str);
            yodaConfirm.clearConcurrencyInvokeFilter();
        }
    }

    private synchronized void clearConcurrencyInvokeFilter() {
        concurrencyInvokeSubject = null;
    }

    private boolean isH5JumpInvoke() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e49af201b45fb7df46de94f8255a81f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e49af201b45fb7df46de94f8255a81f4")).booleanValue() : (this.mActivityRef == null || this.mActivityRef.get() == null || !(this.mActivityRef.get() instanceof YodaConfirmActivity)) ? false : true;
    }
}
