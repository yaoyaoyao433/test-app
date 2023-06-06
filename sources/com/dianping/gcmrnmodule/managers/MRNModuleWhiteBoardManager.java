package com.dianping.gcmrnmodule.managers;

import android.text.TextUtils;
import android.view.View;
import com.dianping.agentsdk.framework.ar;
import com.dianping.gcmrnmodule.protocols.i;
import com.dianping.gcmrnmodule.utils.c;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.HostDestroyCallback;
import com.dianping.shield.dynamic.utils.DMWhiteBoardUtils;
import com.dianping.shield.env.ShieldEnvironment;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.d;
import rx.functions.k;
import rx.subjects.e;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleWhiteBoardManager.MODULE_NAME)
/* loaded from: classes.dex */
public class MRNModuleWhiteBoardManager extends ReactContextBaseJavaModule {
    private static final String MODULE_NAME = "MRNModuleWhiteBoardManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private ReactContext mReactContext;
    private HashMap<String, e> subjectMap;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, ar arVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MRNModuleWhiteBoardManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dff16025fb4f83d81aeb333da8200bfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dff16025fb4f83d81aeb333da8200bfd");
            return;
        }
        this.subjectMap = new HashMap<>();
        this.mReactContext = reactApplicationContext;
    }

    @ReactMethod
    public void get(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4baba1f185fd5f9afef27df89ceb8ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4baba1f185fd5f9afef27df89ceb8ff");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(readableMap, promise, new a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.a
                public final void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, final ar arVar) {
                    Object[] objArr2 = {aVar, arVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9152d7340652573e6f2add52504e9dcc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9152d7340652573e6f2add52504e9dcc");
                        return;
                    }
                    final List<String> changeParamsType = MRNModuleWhiteBoardManager.this.changeParamsType(readableMap.hasKey("requiredKeys") ? readableMap.getArray("requiredKeys").toArrayList() : null);
                    final List changeParamsType2 = MRNModuleWhiteBoardManager.this.changeParamsType(readableMap.hasKey("optionalKeys") ? readableMap.getArray("optionalKeys").toArrayList() : null);
                    ArrayList arrayList = new ArrayList();
                    for (String str : changeParamsType) {
                        arrayList.add(arVar.b(str));
                    }
                    if (arrayList.size() <= 0) {
                        MRNModuleWhiteBoardManager.this.sendResult(changeParamsType, changeParamsType2, arVar, promise);
                    } else {
                        aVar.addSubscription(d.a((List) arrayList, (k) new k<List>() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.1.2
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.k
                            public final /* synthetic */ List call(Object[] objArr3) {
                                Object[] objArr4 = {objArr3};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "82a7c9dfc86148d30aabcfc50463a365", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "82a7c9dfc86148d30aabcfc50463a365");
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : objArr3) {
                                    arrayList2.add(obj);
                                }
                                return arrayList2;
                            }
                        }).a(1).c(new rx.functions.b<List>() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.1.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.b
                            public final /* synthetic */ void call(List list) {
                                Object[] objArr3 = {list};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cf87f76b9046cd3bbba88f710e2e2764", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cf87f76b9046cd3bbba88f710e2e2764");
                                } else {
                                    MRNModuleWhiteBoardManager.this.sendResult(changeParamsType, changeParamsType2, arVar, promise);
                                }
                            }
                        }));
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResult(List<String> list, List<String> list2, ar arVar, Promise promise) {
        Object[] objArr = {list, list2, arVar, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c57a1e61eb280bb643cb1518827fec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c57a1e61eb280bb643cb1518827fec0");
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : arrayList) {
                Object c = arVar.c(str);
                if (c != null) {
                    jSONObject.put(str, DMWhiteBoardUtils.adaptWhiteBoardToJS(c));
                }
            }
            promise.resolve(g.a(jSONObject));
        } catch (JSONException e) {
            promise.reject("JSONError", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> changeParamsType(List<Object> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ba26139df83f865c11e38a230d2581f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ba26139df83f865c11e38a230d2581f");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList;
    }

    @ReactMethod
    public void set(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da471927a17c5b53f7435cab3732b05e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da471927a17c5b53f7435cab3732b05e");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(readableMap, promise, new a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.a
                public final void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, ar arVar) {
                    Object[] objArr2 = {aVar, arVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "71e10bb0ac284368fb4d71f1ca3f6d2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "71e10bb0ac284368fb4d71f1ca3f6d2d");
                        return;
                    }
                    String string = readableMap.getString("key");
                    HashMap<String, Object> hashMap = null;
                    try {
                        hashMap = readableMap.toHashMap();
                    } catch (ClassCastException e) {
                        ShieldEnvironment.INSTANCE.getShieldLogger().codeLogError(MRNModuleWhiteBoardManager.class, e.getMessage());
                    }
                    if (hashMap != null) {
                        DMWhiteBoardUtils.putMrnObjectToWhiteBoard(arVar, string, hashMap.get("value"));
                    }
                    promise.resolve(new WritableNativeMap());
                }
            }));
        }
    }

    @ReactMethod
    public void observe(final ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1caef305ce4908b36653a363d866d656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1caef305ce4908b36653a363d866d656");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(readableMap, promise, new a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.3
                public static ChangeQuickRedirect a;

                @Override // com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.a
                public final void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, ar arVar) {
                    Object[] objArr2 = {aVar, arVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2484a8120e51fd49d2bb797a9a5bf1f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2484a8120e51fd49d2bb797a9a5bf1f5");
                        return;
                    }
                    String string = readableMap.getString("key");
                    final String string2 = readableMap.getString("identifier");
                    aVar.addSubscription(arVar.b(string).c(new rx.functions.b() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.3.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final void call(Object obj) {
                            Object[] objArr3 = {obj};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "14f795c516b4965001a67fae34a340a3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "14f795c516b4965001a67fae34a340a3");
                            } else if (obj != null) {
                                WritableNativeMap writableNativeMap = new WritableNativeMap();
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("value", DMWhiteBoardUtils.adaptWhiteBoardToJS(obj));
                                    writableNativeMap.putString("identifier", MRNModuleWhiteBoardManager.this.emptyIfNull(string2));
                                    writableNativeMap.putMap("data", g.a(jSONObject));
                                    MRNModuleWhiteBoardManager.this.sendEvent("observe", writableNativeMap);
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }));
                }
            }));
        }
    }

    @ReactMethod
    public void queryMessage(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98eebf49e6f645344ac3bb7489ba9732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98eebf49e6f645344ac3bb7489ba9732");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(readableMap, promise, new a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.4
                public static ChangeQuickRedirect a;

                @Override // com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.a
                public final void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, ar arVar) {
                    Object[] objArr2 = {aVar, arVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8af581868252876f362c178d5e2cf891", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8af581868252876f362c178d5e2cf891");
                        return;
                    }
                    ArrayList<Object> a2 = arVar.a(readableMap.getString("key"), (readableMap.hasKey("param") && readableMap.getType("param") == ReadableType.Map) ? new JSONObject(g.a(readableMap.getMap("param"))) : null);
                    if (a2 != null && a2.size() > 0) {
                        final JSONArray jSONArray = new JSONArray();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : a2) {
                            if (obj instanceof d) {
                                arrayList.add((d) obj);
                            } else {
                                jSONArray.put(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("result", jSONArray);
                                promise.resolve(g.a(jSONObject));
                                return;
                            } catch (JSONException e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        aVar.addSubscription(d.a((List) arrayList, (k) new k<Object>() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.4.2
                            @Override // rx.functions.k
                            public final Object call(Object... objArr3) {
                                return objArr3;
                            }
                        }).c(new rx.functions.b<Object>() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.4.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.functions.b
                            public final void call(Object obj2) {
                                Object[] objArr3 = {obj2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "094a161e50b5eb6cda48f0d0b5603b68", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "094a161e50b5eb6cda48f0d0b5603b68");
                                } else if (obj2 instanceof Object[]) {
                                    try {
                                        for (Object obj3 : (Object[]) obj2) {
                                            jSONArray.put(c.a(obj3));
                                        }
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("result", jSONArray);
                                        promise.resolve(g.a(jSONObject2));
                                    } catch (JSONException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                        }));
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", new JSONArray());
                        promise.resolve(g.a(jSONObject2));
                    } catch (JSONException e2) {
                        promise.reject("JSONError", e2.getMessage());
                    }
                }
            }));
        }
    }

    @ReactMethod
    public void registMessage(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26a04da492b50e1147d936d11e4a2df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26a04da492b50e1147d936d11e4a2df0");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(readableMap, promise, new a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.5
                public static ChangeQuickRedirect a;

                @Override // com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.a
                public final void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, ar arVar) {
                    Object[] objArr2 = {aVar, arVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86973a3c5eb87f42aab7b8589cc4823a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86973a3c5eb87f42aab7b8589cc4823a");
                        return;
                    }
                    String string = readableMap.getString("key");
                    final String string2 = readableMap.getString("messageId");
                    final String string3 = readableMap.getString("identifier");
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    final String a2 = arVar.a(string, new ar.a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.5.1
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.agentsdk.framework.ar.a
                        public final Object handleMessage(Object obj) {
                            Object[] objArr3 = {obj};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "42807263aa16253a7fc74273fb74397d", RobustBitConfig.DEFAULT_VALUE)) {
                                return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "42807263aa16253a7fc74273fb74397d");
                            }
                            WritableNativeMap writableNativeMap = new WritableNativeMap();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("param", DMWhiteBoardUtils.adaptWhiteBoardToJS(obj));
                                writableNativeMap.putString("identifier", MRNModuleWhiteBoardManager.this.emptyIfNull(string3));
                                writableNativeMap.putMap("data", g.a(jSONObject));
                                MRNModuleWhiteBoardManager.this.sendEvent("registMessage", writableNativeMap);
                            } catch (JSONException e) {
                                promise.reject("JSONError", e.getMessage());
                            }
                            if (readableMap.hasKey("hasReturn") && readableMap.getType("hasReturn") == ReadableType.Boolean) {
                                readableMap.getBoolean("hasReturn");
                                rx.subjects.b g = rx.subjects.b.g();
                                MRNModuleWhiteBoardManager.this.subjectMap.put(string2, g);
                                return g;
                            }
                            return null;
                        }
                    });
                    aVar.addHostDestroyHook(new HostDestroyCallback() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.5.2
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.shield.dynamic.protocols.HostDestroyCallback
                        public final void onDestroy(@NotNull DynamicHostInterface dynamicHostInterface) {
                            Object[] objArr3 = {dynamicHostInterface};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5aea04e4b49edcc745594891798ef9fb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5aea04e4b49edcc745594891798ef9fb");
                            } else if (dynamicHostInterface.getBridge().getWhiteBoard() != null) {
                                dynamicHostInterface.getBridge().getWhiteBoard().a(a2);
                            }
                        }
                    });
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("handleId", a2);
                        promise.resolve(g.a(jSONObject));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }));
        }
    }

    @ReactMethod
    public void unRegistMessage(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9948a82d592d0dc2e6bd3962bd170651", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9948a82d592d0dc2e6bd3962bd170651");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(readableMap, promise, new a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.6
                public static ChangeQuickRedirect a;

                @Override // com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.a
                public final void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, ar arVar) {
                    Object[] objArr2 = {aVar, arVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fe23eabbf45dce95b804e64dd24f36fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fe23eabbf45dce95b804e64dd24f36fb");
                        return;
                    }
                    String string = readableMap.getString("handleId");
                    if (!TextUtils.isEmpty(string)) {
                        arVar.a(string);
                    }
                    try {
                        promise.resolve(g.a(new JSONObject()));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }));
        }
    }

    @ReactMethod
    public void sendBackMessageResult(final ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dce262de6336dcc9871712b530682947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dce262de6336dcc9871712b530682947");
        } else {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).addUIBlock(new b(readableMap, promise, new a() { // from class: com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.7
                public static ChangeQuickRedirect a;

                @Override // com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager.a
                public final void a(com.dianping.gcmrnmodule.hostwrapper.a aVar, ar arVar) {
                    Object obj;
                    Object[] objArr2 = {aVar, arVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1d3e5f595101d5ce286b90b88d6e6a33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1d3e5f595101d5ce286b90b88d6e6a33");
                        return;
                    }
                    String string = readableMap.getString("messageId");
                    e eVar = (e) MRNModuleWhiteBoardManager.this.subjectMap.get(string);
                    if (eVar != null) {
                        if (readableMap.hasKey("result")) {
                            obj = g.a(readableMap, "result");
                        } else {
                            obj = JSONObject.NULL;
                        }
                        eVar.onNext(obj);
                        eVar.onCompleted();
                        MRNModuleWhiteBoardManager.this.subjectMap.remove(string);
                    }
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3107e04f592b3c1c7753db31de806ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3107e04f592b3c1c7753db31de806ba9");
        } else {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class b implements com.facebook.react.uimanager.ar {
        public static ChangeQuickRedirect a;
        private ReadableMap b;
        private Promise c;
        private a d;

        public b(ReadableMap readableMap, Promise promise, a aVar) {
            Object[] objArr = {readableMap, promise, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "642a251187b15300dc45f70ee45cbc06", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "642a251187b15300dc45f70ee45cbc06");
                return;
            }
            this.b = readableMap;
            this.c = promise;
            this.d = aVar;
        }

        @Override // com.facebook.react.uimanager.ar
        public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
            Object[] objArr = {nativeViewHierarchyManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df472bc71aee24ccd0762514f771b84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df472bc71aee24ccd0762514f771b84");
                return;
            }
            try {
                int i = this.b.getInt("gdm_reactTag");
                View d = nativeViewHierarchyManager.d(i);
                if (d instanceof i) {
                    com.dianping.gcmrnmodule.hostwrapper.a hostInterface = ((i) d).getHostInterface();
                    if (hostInterface != null) {
                        ar whiteBoard = hostInterface.getBridge().getWhiteBoard();
                        if (d instanceof com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a) {
                            whiteBoard = ((com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a) d).getWhiteboard();
                        }
                        this.d.a(hostInterface, whiteBoard);
                    }
                } else if (d != null) {
                    Promise promise = this.c;
                    promise.reject("wrong_component", "Component must be MRNModule: Wrong gdm_reactTag: {" + i + "}, View: " + d.toString());
                }
            } catch (Exception e) {
                this.c.reject("Whiteboard Bridge Error", e.getMessage());
            }
        }
    }
}
