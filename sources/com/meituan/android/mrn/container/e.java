package com.meituan.android.mrn.container;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.mrn.config.q;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.j;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.l;
import com.meituan.android.mrn.engine.m;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.engine.v;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    a b;
    String c;
    private Context d;
    private String e;
    private String f;
    private String g;
    private boolean h;
    private List<i> i;
    private boolean j;
    private boolean k;
    private l l;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public void a(ReactContext reactContext) {
        }

        public void a(ReactContext reactContext, q qVar) {
        }

        public void a(k kVar, q qVar) {
        }

        public void b(ReactContext reactContext) {
        }
    }

    public e(Context context, String str, String str2, List<i> list, boolean z, a aVar) {
        this(context, str, str2, null, list, false, false, false, aVar);
        Object[] objArr = {context, str, str2, list, (byte) 0, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee95eade486074404b19af488c9f117", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee95eade486074404b19af488c9f117");
        }
    }

    public e(Context context, String str, String str2, String str3, List<i> list, boolean z, boolean z2, boolean z3, a aVar) {
        Object[] objArr = {context, str, str2, str3, list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a8a1e9954f65c6a6d6373681dcae05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a8a1e9954f65c6a6d6373681dcae05");
            return;
        }
        this.l = new l() { // from class: com.meituan.android.mrn.container.e.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.engine.l
            public final void a(k kVar) {
                Object[] objArr2 = {kVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58de200accfa038718129b1fc0ec3adc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58de200accfa038718129b1fc0ec3adc");
                    return;
                }
                p.a("[MRNInstanceGetter@onSuccess]", "delegate eventlistener onSuccess");
                if (kVar.b == null || kVar.b.getCurrentReactContext() == null) {
                    return;
                }
                p.a("[MRNInstanceGetter@onSuccess]", "delegate eventlistener onSuccess1");
                e.this.a(kVar);
            }
        };
        this.d = context.getApplicationContext();
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.i = list;
        this.h = z;
        this.b = aVar;
        this.k = z2;
        this.j = z3;
    }

    public final synchronized void a() {
        k a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5292918e4d30a4b297850506a4db70e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5292918e4d30a4b297850506a4db70e6");
        } else if (TextUtils.isEmpty(this.e)) {
            throw new j("bundleName sholud not be null");
        } else {
            try {
                p.a("[MRNInstanceGetter@fetchMRNInstance]", "MRNInstanceGetter：getMRNInstance");
                if (this.h) {
                    a2 = n.a(this.d).a(this.e, this.f, true, this.k, null);
                    Object[] objArr2 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect2 = k.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b8c0afe13b63d3d5550f6568f9e80df2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b8c0afe13b63d3d5550f6568f9e80df2");
                    } else if (com.meituan.android.mrn.debug.a.a() || !com.meituan.android.mrn.debug.a.c()) {
                        a2.m = true;
                    }
                } else {
                    a2 = n.a(this.d).a(this.e, this.f, this.j, this.k, this.g);
                }
                this.b.a(a2, q.ERROR_CREATE_MRN_INSTANCE);
            } catch (UnsatisfiedLinkError e) {
                com.meituan.android.mrn.utils.c.a("[MRNInstanceGetter@fetchMRNInstance]", e);
                this.b.a((k) null, q.LOAD_SO_FAILED);
            }
            if (a2 == null) {
                return;
            }
            if (a2.b != null && a2.b.hasInitializeReactContext() && a2.b.getCurrentReactContext() != null) {
                p.a("[MRNInstanceGetter@fetchMRNInstance]", "：MRNInstance is ready");
                a(a2);
                return;
            }
            p.a("[MRNInstanceGetter@fetchMRNInstance]", "：MRNInstance is not ready");
            a2.a(this.l);
        }
    }

    void a(final k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37431f49af9190f6ced756c79d3195ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37431f49af9190f6ced756c79d3195ea");
            return;
        }
        a(kVar, this.i);
        if (this.h) {
            ai.a(new Runnable() { // from class: com.meituan.android.mrn.container.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95ba590a23716b38ac740594b60ecabe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95ba590a23716b38ac740594b60ecabe");
                        return;
                    }
                    final e eVar = e.this;
                    final ReactInstanceManager reactInstanceManager = kVar.b;
                    Object[] objArr3 = {reactInstanceManager};
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "d3184f0515d0e7b4629ebe6b53c85c7b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "d3184f0515d0e7b4629ebe6b53c85c7b");
                    } else if (reactInstanceManager != null) {
                        reactInstanceManager.getDevSupportManager();
                        reactInstanceManager.addReactInstanceEventListenerForce(new ReactInstanceManager.b() { // from class: com.meituan.android.mrn.container.e.4
                            public static ChangeQuickRedirect a;

                            @Override // com.facebook.react.ReactInstanceManager.b
                            public final void onReactContextInitialized(ReactContext reactContext) {
                                Object[] objArr4 = {reactContext};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e5ccd01d3d0257c0a386efe6e4076b49", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e5ccd01d3d0257c0a386efe6e4076b49");
                                    return;
                                }
                                reactInstanceManager.removeReactInstanceEventListener(this);
                                e.this.b.b(reactContext);
                            }
                        });
                        reactInstanceManager.getDevSupportManager();
                    }
                }
            });
        } else if (kVar != null && kVar.b != null && kVar.b.getCurrentReactContext() != null) {
            this.b.a(kVar.b.getCurrentReactContext(), (q) null);
        } else {
            this.b.a((ReactContext) null, q.ERROR_CREATE_MRN_INSTANCE);
        }
    }

    private void a(k kVar, List<i> list) {
        Object[] objArr = {kVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eb71007df9a0a94098d614846bde16d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eb71007df9a0a94098d614846bde16d");
            return;
        }
        p.a("[MRNInstanceGetter@registerAdditionalPackages]", list);
        if (list == null) {
            return;
        }
        p.a("[MRNInstanceGetter@registerAdditionalPackages]", "registerAdditionalPackages1 " + list.size());
        if (kVar == null || kVar.b == null) {
            p.a("[MRNInstanceGetter@registerAdditionalPackages]", "mMRNInstance.getReactInstanceManager() is null");
            return;
        }
        p.a("[MRNInstanceGetter@registerAdditionalPackages]", "registerAdditionalPackages2");
        kVar.b.registerAdditionalPackages(list);
        if (kVar.b.getCurrentReactContext() != null) {
            p.a("[MRNInstanceGetter@registerAdditionalPackages]", "无context添加ViewManager success");
            b(kVar, list);
        }
    }

    public final void a(final ReactInstanceManager reactInstanceManager) {
        Object[] objArr = {reactInstanceManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78b7e9658f9ee6b09b4c270f39707d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78b7e9658f9ee6b09b4c270f39707d4");
        } else if (reactInstanceManager == null) {
        } else {
            reactInstanceManager.recreateReactContextInBackground();
            reactInstanceManager.addReactInstanceEventListenerForce(new ReactInstanceManager.b() { // from class: com.meituan.android.mrn.container.e.3
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.ReactInstanceManager.b
                public final void onReactContextInitialized(ReactContext reactContext) {
                    Object[] objArr2 = {reactContext};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f54b22dbbe1e1e8204e9ee06b78046ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f54b22dbbe1e1e8204e9ee06b78046ca");
                        return;
                    }
                    if (reactInstanceManager.getNativeModuleCallExceptionHandler() instanceof v) {
                        ((v) reactInstanceManager.getNativeModuleCallExceptionHandler()).b = false;
                    }
                    p.a("[MRNInstanceGetter@onReactContextInitialized]", ":引擎重新创建完成");
                    e.this.b.a(reactContext);
                }
            });
            Object[] objArr2 = {reactInstanceManager};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1a145e9ca514eeb9b0be0332bd86434", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1a145e9ca514eeb9b0be0332bd86434");
                return;
            }
            p.a("[MRNInstanceGetter@runCommonBundle]", reactInstanceManager);
            com.meituan.android.mrn.engine.e commonBundle = MRNBundleManager.sharedInstance().getCommonBundle(MRNBundleManager.BASE_BUNDLE_NAME);
            if (commonBundle == null || TextUtils.isEmpty(commonBundle.c) || !commonBundle.d()) {
                return;
            }
            reactInstanceManager.runCommonJSBundle(commonBundle.f());
            com.meituan.android.mrn.codecache.c.a().a(commonBundle);
            m.a(reactInstanceManager, (String) null, 1);
            com.meituan.hotel.android.hplus.diagnoseTool.b.b();
            if (TextUtils.isEmpty(null)) {
                return;
            }
            reactInstanceManager.runCommonJSBundle(JSBundleLoader.createFileLoader(null));
        }
    }

    private void b(k kVar, List<i> list) {
        char c = 0;
        int i = 1;
        Object[] objArr = {kVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d38b374c51fcfa8fcd50ae175ac163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d38b374c51fcfa8fcd50ae175ac163");
        } else if (list != null && kVar != null && kVar.b != null && kVar.b.getCurrentReactContext() != null) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) kVar.b.getCurrentReactContext();
            UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                ArrayList arrayList = new ArrayList();
                for (i iVar : list) {
                    if (!kVar.a(iVar)) {
                        arrayList.addAll(iVar.createViewManagers(reactApplicationContext));
                        Object[] objArr2 = new Object[i];
                        objArr2[c] = iVar;
                        ChangeQuickRedirect changeQuickRedirect2 = k.a;
                        if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "b6263d3affd29ebcfa740cf44f9fb256", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "b6263d3affd29ebcfa740cf44f9fb256");
                        } else if (iVar != null) {
                            if (kVar.p == null) {
                                kVar.p = new ArrayList();
                            }
                            kVar.p.add(iVar);
                        }
                    }
                    i = 1;
                    c = 0;
                }
                if (arrayList.size() > 0) {
                    uIManagerModule.addViewManagers(arrayList);
                }
            }
        }
    }
}
