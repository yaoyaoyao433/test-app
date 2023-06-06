package com.sankuai.android.share.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.aurora.ActivitySwitchMonitor;
import com.meituan.android.common.aidata.lightblue.FeatureRequestEntity;
import com.meituan.android.common.aidata.lightblue.IAIDataInitCompleteListener;
import com.meituan.android.common.aidata.lightblue.ICepArrayListener;
import com.meituan.android.common.aidata.lightblue.IGetFeatureListener;
import com.meituan.android.common.aidata.lightblue.ILightBlue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements com.sankuai.android.share.interfaces.a {
    public static ChangeQuickRedirect a;
    private static final Executor b = com.sankuai.android.jarvis.c.a("share-blue");
    private static volatile boolean h = false;
    private a c;
    private String d;
    private JsonObject e;
    private IAIDataInitCompleteListener f;
    private Handler g;
    private final ActivitySwitchMonitor i;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b69aa084ed2a86578cb03a29db46a60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b69aa084ed2a86578cb03a29db46a60");
            return;
        }
        this.g = new Handler(Looper.getMainLooper());
        this.i = new ActivitySwitchMonitor() { // from class: com.sankuai.android.share.util.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.aurora.ActivitySwitchCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                Object[] objArr2 = {activity, bundle};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61dc2d84df5d403cf3b8854f65369141", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61dc2d84df5d403cf3b8854f65369141");
                    return;
                }
                super.onActivityCreated(activity, bundle);
                if (activity != null) {
                    g.this.d = activity.getClass().getName();
                }
            }

            @Override // com.meituan.android.aurora.ActivitySwitchCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aaf32ef3009ae0b0df8fe08fbb7b3465", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aaf32ef3009ae0b0df8fe08fbb7b3465");
                    return;
                }
                super.onActivityResumed(activity);
                if (activity != null) {
                    g.this.d = activity.getClass().getName();
                }
            }
        };
    }

    public static /* synthetic */ void a(g gVar, final ILightBlue iLightBlue) {
        Object[] objArr = {iLightBlue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "e44802e03602fb9b72ff77da28854b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "e44802e03602fb9b72ff77da28854b81");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.android.share.util.g.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62397bcdafd7a9a1a85228c3a42b6010", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62397bcdafd7a9a1a85228c3a42b6010");
                        return;
                    }
                    iLightBlue.startServiceWithBiz("group");
                    iLightBlue.unsubscribeSpecificCepLinstener(g.this.c);
                    g.this.c = new a(g.this);
                    com.sankuai.android.share.a.b = g.this;
                    iLightBlue.subscribeCep(CollectionUtils.asList("scene_group_share_pv"), g.this.c);
                    String currentProcessName = ProcessUtils.getCurrentProcessName();
                    c.a("ShareTask CEP 注册进程: " + currentProcessName);
                    g.a(true);
                }
            });
        }
    }

    public static /* synthetic */ boolean a(boolean z) {
        h = true;
        return true;
    }

    public static void a(final Context context, final b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8d6355cb76481611f6cc2f7bad1a524", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8d6355cb76481611f6cc2f7bad1a524");
        } else if (h) {
            bVar.a();
        } else {
            g gVar = new g();
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "d2009cb13af4def39cc202594c923380", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "d2009cb13af4def39cc202594c923380");
            } else if (h || !com.sankuai.meituan.serviceloader.b.a()) {
                bVar.a();
            } else {
                List a2 = com.sankuai.meituan.serviceloader.b.a(ILightBlue.class, "light_blue");
                if (CollectionUtils.isEmpty(a2)) {
                    bVar.a();
                } else {
                    ILightBlue iLightBlue = (ILightBlue) a2.get(0);
                    iLightBlue.startServiceWithBiz("group");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new FeatureRequestEntity("group_share_pv", true));
                    iLightBlue.getFeature(arrayList, null, new IGetFeatureListener() { // from class: com.sankuai.android.share.util.g.4
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.common.aidata.lightblue.IGetFeatureListener
                        public final void onSuccess(@Nullable String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "89ba63554a8cfcc4ba5e37719ca86a2c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "89ba63554a8cfcc4ba5e37719ca86a2c");
                                return;
                            }
                            c.a(str);
                            g.this.e = com.sankuai.android.share.util.b.b(com.sankuai.android.share.util.b.a(str), "group_share_pv/0");
                            g.this.g.post(new Runnable() { // from class: com.sankuai.android.share.util.g.4.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5ee6cf836bf631fdebbdc37be14eff70", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5ee6cf836bf631fdebbdc37be14eff70");
                                    } else {
                                        bVar.a();
                                    }
                                }
                            });
                        }

                        @Override // com.meituan.android.common.aidata.lightblue.IGetFeatureListener
                        public final void onFailed(@Nullable Exception exc) {
                            Object[] objArr3 = {exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63e75921a6a0f835da9e70af9c43b9b2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63e75921a6a0f835da9e70af9c43b9b2");
                            } else {
                                g.this.g.post(new Runnable() { // from class: com.sankuai.android.share.util.g.4.2
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "07f430bfe0b78105b497aa67094c3d00", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "07f430bfe0b78105b497aa67094c3d00");
                                        } else {
                                            bVar.a();
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "c50f97229924eb01f087489892c38d37", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "c50f97229924eb01f087489892c38d37");
            } else if (h) {
            } else {
                Object[] objArr4 = {context};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "f30a48de99e3455ca7f6aff6752b8e3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "f30a48de99e3455ca7f6aff6752b8e3a");
                } else if (gVar.f == null && com.sankuai.meituan.serviceloader.b.a()) {
                    List a3 = com.sankuai.meituan.serviceloader.b.a(ILightBlue.class, "light_blue");
                    if (CollectionUtils.isEmpty(a3)) {
                        return;
                    }
                    final ILightBlue iLightBlue2 = (ILightBlue) a3.get(0);
                    IAIDataInitCompleteListener iAIDataInitCompleteListener = new IAIDataInitCompleteListener() { // from class: com.sankuai.android.share.util.g.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.common.aidata.lightblue.IAIDataInitCompleteListener
                        public final void onComplete() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1503aaedcde914ad1116982fba09e7f2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1503aaedcde914ad1116982fba09e7f2");
                                return;
                            }
                            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(g.this.i);
                            g.a(g.this, iLightBlue2);
                        }
                    };
                    gVar.f = iAIDataInitCompleteListener;
                    iLightBlue2.registerInitCompleteListener(iAIDataInitCompleteListener);
                }
            }
        }
    }

    @Override // com.sankuai.android.share.interfaces.a
    public final JsonObject a() {
        return this.e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a implements ICepArrayListener {
        public static ChangeQuickRedirect a;
        private final g b;

        public a(g gVar) {
            this.b = gVar;
        }

        @Override // com.meituan.android.common.aidata.lightblue.ICepArrayListener
        public final void onRuleMatchSucceed(String str, String str2, String str3, int i) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da4f7161f4b169907d1a504a796453f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da4f7161f4b169907d1a504a796453f");
                return;
            }
            c.a("ShareTask CEP 监听，当前进程： " + ProcessUtils.getCurrentProcessName());
            if (!"scene_group_share_pv".equalsIgnoreCase(str) || TextUtils.equals(this.b.d, "com.sankuai.android.share.ShareActivity") || TextUtils.equals(this.b.d, "com.meituan.android.screenshot.ScreenShotFloatWindowActivity")) {
                return;
            }
            c.a("ShareTask CEP 回调进程： " + ProcessUtils.getCurrentProcessName());
            this.b.e = com.sankuai.android.share.util.b.b(com.sankuai.android.share.util.b.b(str3), "0");
        }
    }
}
