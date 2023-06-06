package com.meituan.msc.modules.viewmanager;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.MSCReadableArray;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.mmpviews.perflist.JSBridge;
import com.meituan.msc.mmpviews.perflist.view.PerfListView;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.animate.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "AnimationManager")
/* loaded from: classes3.dex */
public final class a extends k {
    public static ChangeQuickRedirect a;
    public final ReactApplicationContext b;
    public volatile boolean c;
    public ConcurrentLinkedQueue<Runnable> d;
    public com.meituan.msc.modules.manager.h e;
    private com.meituan.msc.uimanager.animate.f f;

    public static /* synthetic */ void a(a aVar, int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0cb0da5fdfe9ff82aa1844924d150882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0cb0da5fdfe9ff82aa1844924d150882");
            return;
        }
        JSInstance d = ((com.meituan.msc.modules.engine.k) aVar.U_().c(com.meituan.msc.modules.engine.k.class)).d();
        if (d != null) {
            ((JSBridge) d.getJSModule(JSBridge.class)).invokeCallback(i, str);
        }
    }

    public a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1685910ede53e33792fea49b41df38df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1685910ede53e33792fea49b41df38df");
            return;
        }
        this.c = false;
        this.d = new ConcurrentLinkedQueue<>();
        this.e = new com.meituan.msc.modules.manager.h() { // from class: com.meituan.msc.modules.viewmanager.a.1
            public static ChangeQuickRedirect c;

            @Override // com.meituan.msc.modules.manager.h
            public final void a(Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fb768441f3b82dc40e0e9909789652b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fb768441f3b82dc40e0e9909789652b");
                    return;
                }
                a aVar = a.this;
                Object[] objArr3 = {runnable};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "937b9b21d42171d9fa16e3fb25f90c79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "937b9b21d42171d9fa16e3fb25f90c79");
                } else if (aVar.c) {
                    aVar.d.add(runnable);
                } else {
                    aVar.b.runOnNativeModulesQueueThread(runnable);
                }
            }
        };
        if (reactApplicationContext == null) {
            throw new RuntimeException("context is null in  MSCAnimationModule!!");
        }
        this.b = reactApplicationContext;
        this.f = new com.meituan.msc.uimanager.animate.f(reactApplicationContext);
    }

    @Override // com.meituan.msc.modules.manager.k
    public final com.meituan.msc.modules.manager.h q() {
        return this.e;
    }

    @MSCMethod
    public final void createKeyframesAnimation(JSONArray jSONArray, JSONArray jSONArray2, final int i, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {jSONArray, jSONArray2, Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6839b9a95f2fa47798a4a5eb68c3141e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6839b9a95f2fa47798a4a5eb68c3141e");
            return;
        }
        final com.meituan.msc.uimanager.animate.f fVar = this.f;
        final MSCReadableArray mSCReadableArray = new MSCReadableArray(jSONArray);
        final MSCReadableArray mSCReadableArray2 = new MSCReadableArray(jSONArray2);
        final Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.Callback
            public final void invoke(Object... objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "0a214683f69941818e3bb555c4dcae72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "0a214683f69941818e3bb555c4dcae72");
                } else {
                    bVar.a(objArr2);
                }
            }
        };
        Object[] objArr2 = {mSCReadableArray, mSCReadableArray2, Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.animate.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "a994c799639c3b596ed38892dc5398db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "a994c799639c3b596ed38892dc5398db");
            return;
        }
        fVar.b.add(new f.a() { // from class: com.meituan.msc.uimanager.animate.f.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.uimanager.animate.f.a
            public final void a(e eVar) {
                Object[] objArr3 = {eVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "256c42d734c62cc608ace05adc5c48df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "256c42d734c62cc608ace05adc5c48df");
                } else {
                    f.this.f.a(f.this.c.getUIManagerModule().b().h().a(), mSCReadableArray, mSCReadableArray2, i, callback);
                }
            }
        });
        fVar.a(fVar.c.getUIManagerModule());
    }

    @MSCMethod
    public final void clearKeyframesAnimation(JSONArray jSONArray, JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {jSONArray, jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be537f9e045552415852d28ddb916fa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be537f9e045552415852d28ddb916fa5");
            return;
        }
        final com.meituan.msc.uimanager.animate.f fVar = this.f;
        final MSCReadableArray mSCReadableArray = new MSCReadableArray(jSONArray);
        final MSCReadableMap mSCReadableMap = jSONObject == null ? null : new MSCReadableMap(jSONObject);
        final Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.Callback
            public final void invoke(Object... objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "7f7fb420d4fe639b319f6f852caa9c9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "7f7fb420d4fe639b319f6f852caa9c9b");
                } else {
                    bVar.a(objArr2);
                }
            }
        };
        Object[] objArr2 = {mSCReadableArray, mSCReadableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.animate.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "7980d92b82cdd1bca28ea7b2ab307f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "7980d92b82cdd1bca28ea7b2ab307f04");
            return;
        }
        fVar.b.add(new f.a() { // from class: com.meituan.msc.uimanager.animate.f.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.uimanager.animate.f.a
            public final void a(e eVar) {
                Object[] objArr3 = {eVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "176893a30700fecd2fcec68d1119ebee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "176893a30700fecd2fcec68d1119ebee");
                } else {
                    f.this.f.a(f.this.c.getUIManagerModule().b().h().a(), mSCReadableArray, mSCReadableMap, callback);
                }
            }
        });
        fVar.a(fVar.c.getUIManagerModule());
    }

    @MSCMethod
    public final void createListKeyframesAnimation(final int i, final int i2, final String str, JSONArray jSONArray, final int i3, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, jSONArray, Integer.valueOf(i3), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa60de1921014baf4ba6cc4f667e80ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa60de1921014baf4ba6cc4f667e80ae");
            return;
        }
        final com.meituan.msc.uimanager.animate.f fVar = this.f;
        final MSCReadableArray mSCReadableArray = new MSCReadableArray(jSONArray);
        final Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.Callback
            public final void invoke(Object... objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "559aad936f8908b9b751a3eb6d48a1f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "559aad936f8908b9b751a3eb6d48a1f6");
                } else {
                    bVar.a(objArr2);
                }
            }
        };
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), str, mSCReadableArray, Integer.valueOf(i3), callback};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.animate.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "dbcaef9da6ccf73eed989771ae5b03cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "dbcaef9da6ccf73eed989771ae5b03cd");
            return;
        }
        final UIImplementation b = fVar.c.getUIManagerModule().b();
        if (b != null) {
            fVar.c.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.animate.f.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d46b45ebcc871547b09a90230abfb00", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d46b45ebcc871547b09a90230abfb00");
                        return;
                    }
                    Pair a2 = f.a(f.this, b, i, i2, str);
                    if (a2 == null) {
                        return;
                    }
                    f.a(f.this).a(((UIImplementation) a2.first).h().a(), (ReadableArray) a2.second, mSCReadableArray, i3, callback);
                }
            });
        }
    }

    @MSCMethod
    public final void clearListKeyframesAnimation(final int i, final int i2, final String str, JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f378742402d0321c7b909b9a1a7a033", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f378742402d0321c7b909b9a1a7a033");
            return;
        }
        final com.meituan.msc.uimanager.animate.f fVar = this.f;
        final MSCReadableMap mSCReadableMap = new MSCReadableMap(jSONObject);
        final Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.a.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.Callback
            public final void invoke(Object... objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "4f693e80ddd59236480de81329df93d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "4f693e80ddd59236480de81329df93d5");
                } else {
                    bVar.a(objArr2);
                }
            }
        };
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), str, mSCReadableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.animate.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "47731136226ae675aa41073168e537da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "47731136226ae675aa41073168e537da");
            return;
        }
        final UIImplementation b = fVar.c.getUIManagerModule().b();
        if (b != null) {
            fVar.c.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.animate.f.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "97d7a6b11209fcf39df343255ca6d948", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "97d7a6b11209fcf39df343255ca6d948");
                        return;
                    }
                    Pair a2 = f.a(f.this, b, i, i2, str);
                    if (a2 == null) {
                        return;
                    }
                    f.a(f.this).a(((UIImplementation) a2.first).h().a(), (ReadableArray) a2.second, mSCReadableMap, callback);
                }
            });
        }
    }

    @MSCMethod
    public final void createRListKeyframesAnimation(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8afcf0eeb04105b616c721b4616518cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8afcf0eeb04105b616c721b4616518cd");
        } else if (jSONObject == null) {
        } else {
            final int optInt = jSONObject.optInt("viewId");
            final int optInt2 = jSONObject.optInt("index");
            final String optString = jSONObject.optString("selector");
            JSONArray optJSONArray = jSONObject.optJSONArray("keyframes");
            final int optInt3 = jSONObject.optInt("duration");
            if (TextUtils.isEmpty(optString) || optJSONArray == null) {
                return;
            }
            final com.meituan.msc.uimanager.animate.f fVar = this.f;
            final MSCReadableArray mSCReadableArray = new MSCReadableArray(optJSONArray);
            final Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.a.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "9561e33f4651a37e6b916143e9b470f8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "9561e33f4651a37e6b916143e9b470f8");
                    } else if (jSONObject.has("successCallID")) {
                        a.a(a.this, jSONObject.optInt("successCallID"), com.meituan.msc.modules.manager.e.a(objArr2).toString());
                    }
                }
            };
            Object[] objArr2 = {Integer.valueOf(optInt), Integer.valueOf(optInt2), optString, mSCReadableArray, Integer.valueOf(optInt3), callback};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.animate.f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "d3f874c369e334caf75419f044f2a677", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "d3f874c369e334caf75419f044f2a677");
                return;
            }
            final UIImplementation b = fVar.c.getUIManagerModule().b();
            if (b != null) {
                fVar.c.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.animate.f.7
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Pair<NativeViewHierarchyManager, JSONArray> a2;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "70ea8534750bb1bf3e7b8dc505a3911f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "70ea8534750bb1bf3e7b8dc505a3911f");
                            return;
                        }
                        View h = b.h(optInt);
                        if (!(h instanceof PerfListView) || (a2 = com.meituan.msc.mmpviews.perflist.common.a.a((PerfListView) h, optInt2, optString)) == null || a2.first == null || a2.second == null) {
                            return;
                        }
                        f.a(f.this).a((NativeViewHierarchyManager) a2.first, new MSCReadableArray((JSONArray) a2.second), mSCReadableArray, optInt3, callback);
                    }
                });
            }
        }
    }

    @MSCMethod
    public final void clearRListKeyframesAnimation(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d3c76f09ef7990a287a2861ba01e8e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d3c76f09ef7990a287a2861ba01e8e1");
            return;
        }
        final int optInt = jSONObject.optInt("viewId");
        final int optInt2 = jSONObject.optInt("index");
        final String optString = jSONObject.optString("selector");
        JSONObject optJSONObject = jSONObject.optJSONObject("options");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        final com.meituan.msc.uimanager.animate.f fVar = this.f;
        MSCReadableMap mSCReadableMap = optJSONObject == null ? null : new MSCReadableMap(optJSONObject);
        final Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.a.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.Callback
            public final void invoke(Object... objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "4f8484d552e6de13e390c25e71cf252a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "4f8484d552e6de13e390c25e71cf252a");
                } else if (jSONObject.has("successCallID")) {
                    a.a(a.this, jSONObject.optInt("successCallID"), com.meituan.msc.modules.manager.e.a(objArr2).toString());
                }
            }
        };
        Object[] objArr2 = {Integer.valueOf(optInt), Integer.valueOf(optInt2), optString, mSCReadableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.animate.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "bd5eeaf2de65858c02404ba164ce566e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "bd5eeaf2de65858c02404ba164ce566e");
            return;
        }
        final UIImplementation b = fVar.c.getUIManagerModule().b();
        if (b != null) {
            final MSCReadableMap mSCReadableMap2 = mSCReadableMap;
            fVar.c.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.animate.f.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Pair<NativeViewHierarchyManager, JSONArray> a2;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0638f20f47cef4989ac61001ca5269a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0638f20f47cef4989ac61001ca5269a4");
                        return;
                    }
                    View h = b.h(optInt);
                    if (!(h instanceof PerfListView) || (a2 = com.meituan.msc.mmpviews.perflist.common.a.a((PerfListView) h, optInt2, optString)) == null || a2.first == null || a2.second == null) {
                        return;
                    }
                    f.a(f.this).a((NativeViewHierarchyManager) a2.first, new MSCReadableArray((JSONArray) a2.second), mSCReadableMap2, callback);
                }
            });
        }
    }
}
