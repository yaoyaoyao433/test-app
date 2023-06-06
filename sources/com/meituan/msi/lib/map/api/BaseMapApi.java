package com.meituan.msi.lib.map.api;

import android.util.SparseArray;
import android.view.View;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.MapParam;
import com.meituan.msi.lib.map.utils.e;
import com.meituan.msi.lib.map.utils.h;
import com.meituan.msi.lib.map.utils.j;
import com.meituan.msi.lib.map.view.map.c;
import com.meituan.msi.view.MsiNativeViewApi;
import com.meituan.msi.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Proxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseMapApi extends MsiNativeViewApi<com.meituan.msi.lib.map.view.map.b, MapParam> implements com.meituan.msi.lib.map.api.interfaces.b, com.meituan.msi.lifecycle.b {
    public static ChangeQuickRedirect a;
    private final SparseArray<com.meituan.msi.lib.map.api.a> b;
    private final SparseArray<com.meituan.msi.lib.map.api.interfaces.b> c;
    private MsiContext g;

    @Override // com.meituan.msi.lifecycle.b
    public final void b(int i) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindcallouttap")
    public void bindCallOutTap(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindclick")
    public void bindClick(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindcontrolclick")
    public void bindControlClick(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindindoorchange")
    public void bindIndoorChange(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindindoorhide")
    public void bindIndoorHide(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindindoorshow")
    public void bindIndoorShow(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindloaded")
    public void bindLoaded(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindlongclick")
    public void bindLongClick(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindmaperror")
    public void bindMapError(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindmarkerclick")
    public void bindMarkerClick(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindmarkerdeselect")
    public void bindMarkerDeSelect(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindmarkerselect")
    public void bindMarkerSelect(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindmovedend")
    public void bindMovedEnd(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindmovedstart")
    public void bindMovedStart(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindpoiclick")
    public void bindPoiClick(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindpolylineclick")
    public void bindPolyLineClick(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindpolygonclick")
    public void bindPolygonClick(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.COMMON_EVENT, isCallback = true, name = "mapFlowLineAnimEnd")
    public void mapFlowLineAnimEnd(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.COMMON_EVENT, isCallback = true, name = "mapMarkerTransAnimEnd")
    public void mapMarkerTransAnimEnd(MsiContext msiContext) {
    }

    @MsiApiMethod(eventType = EventType.VIEW_EVENT, isCallback = true, name = "map.bindregionchange")
    public void regionChange(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ com.meituan.msi.lib.map.view.map.b a(final MsiContext msiContext, final JsonObject jsonObject, MapParam mapParam) {
        int i;
        double d;
        boolean a2;
        boolean z;
        boolean z2;
        String str;
        Object[] objArr = {msiContext, jsonObject, mapParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ecd34237a4029380e1dce58a0c8db4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.lib.map.view.map.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ecd34237a4029380e1dce58a0c8db4");
        }
        if (msiContext == null || msiContext.getActivity() == null) {
            return null;
        }
        JsonObject asJsonObject = msiContext.getArgs().getAsJsonObject();
        if (asJsonObject != null) {
            if (asJsonObject.has("mpView_embed_render")) {
                jsonObject.addProperty("mpView_embed_render", Boolean.valueOf(asJsonObject.get("mpView_embed_render").getAsBoolean()));
            }
            if (asJsonObject.has("mpView_viewId")) {
                jsonObject.addProperty("mpView_viewId", Long.valueOf(asJsonObject.get("mpView_viewId").getAsLong()));
            }
        }
        this.g = msiContext;
        long currentTimeMillis = System.currentTimeMillis();
        long a3 = j.a(msiContext.getUIArgs());
        final int f = f(msiContext.getUIArgs());
        int g = g(msiContext.getUIArgs());
        h.a().b.put(f, g);
        b bVar = new b(this);
        final com.meituan.msi.lib.map.api.a aVar = new com.meituan.msi.lib.map.api.a(bVar);
        this.b.put(g, aVar);
        this.c.put(g, (com.meituan.msi.lib.map.api.interfaces.b) Proxy.newProxyInstance(bVar.getClass().getClassLoader(), new Class[]{com.meituan.msi.lib.map.api.interfaces.b.class}, aVar));
        JsonObject b = b(msiContext);
        if (b.has("centerLatitude")) {
            i = g;
            d = b.get("centerLatitude").getAsDouble();
        } else {
            i = g;
            d = 0.0d;
        }
        if (!e.a(d, b.has("centerLongitude") ? b.get("centerLongitude").getAsDouble() : 0.0d)) {
            msiContext.onError(1201, "centerLatitude or centerLongitude value is error!");
            return null;
        }
        final com.meituan.msi.lib.map.view.map.b bVar2 = new com.meituan.msi.lib.map.view.map.b(msiContext);
        bVar2.a(a3, 0);
        bVar2.a(currentTimeMillis, 1);
        Object[] objArr2 = {"map", Integer.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = MsiNativeViewApi.d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e3ce5ff604b839d99242a51cce021cc", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e3ce5ff604b839d99242a51cce021cc")).booleanValue();
        } else {
            a2 = this.f == null ? false : this.f.a("map", f);
        }
        if (a2) {
            z = b.has("preferEmbed") && b.get("preferEmbed").getAsBoolean();
        } else {
            z = false;
        }
        a aVar2 = new a(msiContext);
        bVar2.setOversea(e(b));
        Object[] objArr3 = {b};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "06d7d3c9d19f893952d8d63b1b4dcad5", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "06d7d3c9d19f893952d8d63b1b4dcad5")).booleanValue();
        } else {
            if (b != null && b.has("_mt")) {
                JsonObject asJsonObject2 = b.get("_mt").getAsJsonObject();
                if (asJsonObject2.has("switchTencent") && asJsonObject2.get("switchTencent").getAsBoolean()) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        bVar2.H = z2;
        Object[] objArr4 = {b};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "45f04d9ed93a65281d050c1d41e01dfe", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "45f04d9ed93a65281d050c1d41e01dfe");
        } else if (b == null || !b.has("_mt")) {
            str = "";
        } else {
            JsonObject asJsonObject3 = b.get("_mt").getAsJsonObject();
            str = asJsonObject3.has("reuseEngineTag") ? asJsonObject3.get("reuseEngineTag").getAsString() : "";
        }
        bVar2.setReuseEngineTag(str);
        bVar2.setToken(a(b));
        bVar2.setBusinessName(b(b));
        bVar2.setLocationKey(c(b));
        bVar2.setLocationStrategy(d(b));
        if (b.has("vendor")) {
            bVar2.setMapType(b.get("vendor").getAsString());
        }
        if (b.has("zoomMode")) {
            bVar2.setZoomMode(b.get("zoomMode").getAsString());
        }
        if (b.has("engineMode")) {
            bVar2.setEngineMode(b.get("engineMode").getAsString());
        }
        bVar2.setMapkey(b.has("mapKey") ? b.get("mapKey").getAsString() : "70719c38-06c7-43fc-ac9e-9cf97f9ebb98");
        bVar2.setBiz(b.has("biz") ? b.get("biz").getAsString() : "");
        bVar2.a(z);
        bVar2.setListener(aVar2);
        bVar2.a(bVar2, msiContext, b, i, false, f);
        bVar2.setImportantForAccessibility(4);
        bVar2.setEmbedSurface(new com.meituan.msi.lib.map.api.interfaces.a() { // from class: com.meituan.msi.lib.map.api.BaseMapApi.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.lib.map.api.interfaces.a
            public final void a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "317c3fa78b246ddee2293d88f76e0ac5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "317c3fa78b246ddee2293d88f76e0ac5");
                    return;
                }
                aVar.b = 2;
                aVar.a();
            }
        });
        if (z) {
            f fVar = new f();
            fVar.d = msiContext.getContainerInfo().containerId;
            fVar.a = "map";
            fVar.b = f;
            if (b.has("mpView_viewId")) {
                fVar.c = b.get("mpView_viewId").getAsString();
            }
            aVar.b = 1;
            final int i2 = i;
            com.meituan.msi.view.b bVar3 = new com.meituan.msi.view.b() { // from class: com.meituan.msi.lib.map.api.BaseMapApi.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.view.b
                public final void a() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b0393d015e07f9d967d18d37c16f9316", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b0393d015e07f9d967d18d37c16f9316");
                    } else {
                        msiContext.onSuccess(null);
                    }
                }

                @Override // com.meituan.msi.view.b
                public final void a(String str2, Exception exc) {
                    Object[] objArr5 = {str2, exc};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1b35989fdaf07853096e0f0c012411a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1b35989fdaf07853096e0f0c012411a0");
                    } else {
                        BaseMapApi.a(BaseMapApi.this, bVar2, msiContext, jsonObject, f, i2);
                    }
                }
            };
            Object[] objArr5 = {bVar2, fVar, bVar3};
            ChangeQuickRedirect changeQuickRedirect5 = MsiNativeViewApi.d;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b4602b57d5085ee6253bd5ab6366bbf6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b4602b57d5085ee6253bd5ab6366bbf6");
            } else if (this.f != null) {
                this.f.a(bVar2, fVar, bVar3);
            } else {
                bVar3.a("container not support embed", null);
            }
        } else {
            msiContext.onSuccess(null);
        }
        return bVar2;
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ void a(MsiContext msiContext, View view, int i, JsonObject jsonObject, MapParam mapParam) {
        MapParam mapParam2 = mapParam;
        Object[] objArr = {msiContext, view, Integer.valueOf(i), jsonObject, mapParam2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bef1d52fffde6c38d06bb1e5b531f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bef1d52fffde6c38d06bb1e5b531f07");
        } else {
            super.a(msiContext, view, i, jsonObject, (JsonObject) mapParam2);
        }
    }

    @Override // com.meituan.msi.view.MsiNativeViewApi
    public final /* synthetic */ boolean a(final MsiContext msiContext, com.meituan.msi.lib.map.view.map.b bVar, final int i, final int i2, final JsonObject jsonObject, MapParam mapParam) {
        final com.meituan.msi.lib.map.view.map.b bVar2 = bVar;
        Object[] objArr = {msiContext, bVar2, Integer.valueOf(i), Integer.valueOf(i2), jsonObject, mapParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50693a783887c7cb3fffe6acc50aeac5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50693a783887c7cb3fffe6acc50aeac5")).booleanValue();
        }
        if (msiContext != null) {
            Runnable runnable = new Runnable() { // from class: com.meituan.msi.lib.map.api.BaseMapApi.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean a2;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "820b2b148d2eaeae0dbde162cf8f9120", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "820b2b148d2eaeae0dbde162cf8f9120");
                    } else if (bVar2 == null) {
                        msiContext.onError("map is null!");
                    } else {
                        if (bVar2.a()) {
                            msiContext.onError(1201, "map has been destroyed!");
                        }
                        BaseMapApi.this.a(msiContext, i, i2, jsonObject);
                        final JsonObject b = BaseMapApi.this.b(msiContext);
                        bVar2.setToken(BaseMapApi.a(b));
                        bVar2.setBusinessName(BaseMapApi.b(b));
                        bVar2.setLocationKey(BaseMapApi.c(b));
                        bVar2.setLocationStrategy(BaseMapApi.d(b));
                        bVar2.setOversea(BaseMapApi.e(b));
                        if (!bVar2.e) {
                            BaseMapApi baseMapApi = BaseMapApi.this;
                            com.meituan.msi.lib.map.view.map.b bVar3 = bVar2;
                            Object[] objArr3 = {bVar3};
                            ChangeQuickRedirect changeQuickRedirect3 = MsiNativeViewApi.d;
                            if (PatchProxy.isSupport(objArr3, baseMapApi, changeQuickRedirect3, false, "b511a36359b3783776e062ab8409cb41", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = ((Boolean) PatchProxy.accessDispatch(objArr3, baseMapApi, changeQuickRedirect3, false, "b511a36359b3783776e062ab8409cb41")).booleanValue();
                            } else {
                                a2 = baseMapApi.f != null ? baseMapApi.f.a(bVar3) : false;
                            }
                            if (a2) {
                                BaseMapApi baseMapApi2 = BaseMapApi.this;
                                com.meituan.msi.lib.map.view.map.b bVar4 = bVar2;
                                com.meituan.msi.view.b bVar5 = new com.meituan.msi.view.b() { // from class: com.meituan.msi.lib.map.api.BaseMapApi.3.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.msi.view.b
                                    public final void a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "96dad160cae1873fb13c0a71f171adb1", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "96dad160cae1873fb13c0a71f171adb1");
                                            return;
                                        }
                                        bVar2.a(bVar2, msiContext, b, i2, true, i);
                                        msiContext.onSuccess(null);
                                    }

                                    @Override // com.meituan.msi.view.b
                                    public final void a(String str, Exception exc) {
                                        Object[] objArr4 = {str, exc};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "80879534deb5ad84d801f3d63043fbff", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "80879534deb5ad84d801f3d63043fbff");
                                        } else {
                                            msiContext.onError(1201, "updateCoverView rebind client failed");
                                        }
                                    }
                                };
                                Object[] objArr4 = {bVar4, bVar5};
                                ChangeQuickRedirect changeQuickRedirect4 = MsiNativeViewApi.d;
                                if (PatchProxy.isSupport(objArr4, baseMapApi2, changeQuickRedirect4, false, "f63f04d8751aedd0ac6690e72c131e47", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, baseMapApi2, changeQuickRedirect4, false, "f63f04d8751aedd0ac6690e72c131e47");
                                } else if (bVar4 == null) {
                                    bVar5.a("view is null", null);
                                } else if (baseMapApi2.f == null) {
                                    bVar5.a("container not support embed", null);
                                } else {
                                    baseMapApi2.f.a(bVar4, bVar5);
                                }
                            }
                        }
                        bVar2.a(bVar2, msiContext, b, i2, true, i);
                        msiContext.onSuccess(null);
                    }
                }
            };
            com.meituan.msi.lib.map.api.a aVar = this.b.get(i2);
            if (aVar != null) {
                if (aVar.b != 1) {
                    runnable.run();
                } else {
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.api.a.a;
                    if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e235fa35162602dcc6df9ab20de1783a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e235fa35162602dcc6df9ab20de1783a");
                    } else {
                        aVar.c.add(runnable);
                    }
                }
            }
        }
        return true;
    }

    public BaseMapApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c3ca95ed8c6c83205d9c9b18a16b10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c3ca95ed8c6c83205d9c9b18a16b10");
            return;
        }
        this.b = new SparseArray<>();
        this.c = new SparseArray<>();
    }

    public static /* synthetic */ void a(BaseMapApi baseMapApi, com.meituan.msi.lib.map.view.map.b bVar, MsiContext msiContext, JsonObject jsonObject, int i, int i2) {
        Object[] objArr = {bVar, msiContext, jsonObject, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, baseMapApi, changeQuickRedirect, false, "55dfd520645b53906a078c9b83407d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, baseMapApi, changeQuickRedirect, false, "55dfd520645b53906a078c9b83407d74");
            return;
        }
        bVar.a(false);
        baseMapApi.a(msiContext, i, i2, jsonObject);
        com.meituan.msi.lib.map.api.a aVar = baseMapApi.b.get(i2);
        if (aVar != null) {
            aVar.b = 3;
            aVar.a();
        }
    }

    @MsiApiMethod(name = "map", onUiThread = true, request = MapParam.class)
    public void beforeOperation(MapParam mapParam, MsiContext msiContext) {
        Object[] objArr = {mapParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e717deae59cbf986bc18ece9ed4e776a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e717deae59cbf986bc18ece9ed4e776a");
        } else {
            a(msiContext, (MsiContext) mapParam);
        }
    }

    public final int a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e95baeb5186a79c85eed7158548643e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e95baeb5186a79c85eed7158548643e")).intValue() : g(msiContext.getUIArgs());
    }

    public final JsonObject b(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bca66bd8d11d6499d68e9ef336242b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bca66bd8d11d6499d68e9ef336242b5");
        }
        JsonElement args = msiContext.getArgs();
        JsonObject jsonObject = new JsonObject();
        try {
            return args.getAsJsonObject();
        } catch (IllegalStateException unused) {
            msiContext.onError(1201, "not JsonObject");
            return jsonObject;
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void a(int i) {
        com.meituan.msi.lib.map.view.map.b bVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e7fe15e427e476f69f5f6865a6dc3f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e7fe15e427e476f69f5f6865a6dc3f1");
            return;
        }
        int i2 = h.a().b.get(i, -1);
        if (i2 == -1 || (bVar = (com.meituan.msi.lib.map.view.map.b) a(this.g, i, i2)) == null || bVar.a()) {
            return;
        }
        bVar.setExtLocationSource(bVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a implements c {
        public static ChangeQuickRedirect a;
        private final MsiContext b;

        public a(MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a007bc38ed96b743c448587a3b522d09", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a007bc38ed96b743c448587a3b522d09");
            } else {
                this.b = msiContext;
            }
        }

        @Override // com.meituan.msi.lib.map.view.map.c
        public final void a(String str, JsonObject jsonObject) {
            Object[] objArr = {str, jsonObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a326dc7a2173684e5de44600d6d50ec4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a326dc7a2173684e5de44600d6d50ec4");
            } else {
                this.b.dispatchEvent(str, jsonObject);
            }
        }
    }

    public static String a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77c4f236e7274126aad1e3e7b437f834", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77c4f236e7274126aad1e3e7b437f834");
        }
        if (jsonObject != null && jsonObject.has("_mt")) {
            JsonObject asJsonObject = jsonObject.get("_mt").getAsJsonObject();
            return asJsonObject.has("sceneToken") ? asJsonObject.get("sceneToken").getAsString() : "";
        }
        return "";
    }

    public static String b(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dc7701364f766a830cf3597683a3d86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dc7701364f766a830cf3597683a3d86");
        }
        if (jsonObject != null && jsonObject.has("_mt")) {
            JsonObject asJsonObject = jsonObject.get("_mt").getAsJsonObject();
            return asJsonObject.has("businessName") ? asJsonObject.get("businessName").getAsString() : "";
        }
        return "";
    }

    public static String c(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8269b342564d1c230f81e3dc51ea850f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8269b342564d1c230f81e3dc51ea850f");
        }
        if (jsonObject != null && jsonObject.has("_mt")) {
            JsonObject asJsonObject = jsonObject.get("_mt").getAsJsonObject();
            return asJsonObject.has("locationSourceKey") ? asJsonObject.get("locationSourceKey").getAsString() : "";
        }
        return "";
    }

    public static int d(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "254079c6d79e0819bbd1b2ac42120b2b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "254079c6d79e0819bbd1b2ac42120b2b")).intValue();
        }
        if (jsonObject != null && jsonObject.has("_mt")) {
            JsonObject asJsonObject = jsonObject.get("_mt").getAsJsonObject();
            if (asJsonObject.has("locationStrategy")) {
                return asJsonObject.get("locationStrategy").getAsInt();
            }
            return -1;
        }
        return -1;
    }

    public static boolean e(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a26e57989c0159435a24a2a2a38f1574", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a26e57989c0159435a24a2a2a38f1574")).booleanValue();
        }
        if (jsonObject == null || !jsonObject.has("_mt")) {
            return false;
        }
        JsonObject asJsonObject = jsonObject.get("_mt").getAsJsonObject();
        return asJsonObject.has("useOverseasMap") && asJsonObject.get("useOverseasMap").getAsBoolean();
    }

    public final com.meituan.msi.lib.map.view.map.b c(MsiContext msiContext) {
        int f;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "135f4e57da00516265f78227d3c8dded", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.lib.map.view.map.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "135f4e57da00516265f78227d3c8dded");
        }
        int g = g(msiContext.getUIArgs());
        Object[] objArr2 = {msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9355db652ba00e5d0d3dc9d3f4ea45c8", RobustBitConfig.DEFAULT_VALUE)) {
            f = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9355db652ba00e5d0d3dc9d3f4ea45c8")).intValue();
        } else {
            JsonObject innerArgs = msiContext.getInnerArgs();
            if (innerArgs.has("pageId")) {
                f = innerArgs.get("pageId").getAsInt();
            } else {
                f = f(msiContext.getUIArgs());
            }
        }
        com.meituan.msi.lib.map.view.map.b bVar = (com.meituan.msi.lib.map.view.map.b) a(msiContext, f, g);
        if (bVar == null) {
            msiContext.onError(1201, "view not found");
            return null;
        } else if (bVar.a()) {
            msiContext.onError(1201, "map has released");
            return null;
        } else {
            return bVar;
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "Map.addMapMarkers", onUiThread = true)
    public void addMapMarkers(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d8ff61714a2ec2c12535b5bd93ff85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d8ff61714a2ec2c12535b5bd93ff85");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addMapMarkers(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "Map.addMapLines", onUiThread = true)
    public void addMapLines(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4177404d22105cdf77f3cc28d777653a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4177404d22105cdf77f3cc28d777653a");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addMapLines(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "Map.addMapCircles", onUiThread = true)
    public void addMapCircles(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e911066d0cb8e052349a9917dcf6f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e911066d0cb8e052349a9917dcf6f8");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addMapCircles(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "Map.addMapPolygons", onUiThread = true)
    public void addMapPolygons(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ebd4e49fce0c614259706d31a587249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ebd4e49fce0c614259706d31a587249");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addMapPolygons(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "Map.addMapHeatOverlays", onUiThread = true)
    public void addMapHeatOverlays(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96aa9f84936a96243c684d9a2faa63a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96aa9f84936a96243c684d9a2faa63a4");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addMapHeatOverlays(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "Map.includeMapPoints", onUiThread = true, request = MapParam.class)
    public void includeMapPoints(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f32939d48d396831de4de95c9dd6048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f32939d48d396831de4de95c9dd6048");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.includeMapPoints(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addMarkers", onUiThread = true)
    public void addMarkers(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad79385bc1863965ed287d3ce56a8272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad79385bc1863965ed287d3ce56a8272");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addMarkers(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.moveToLocation", onUiThread = true, request = MapParam.class)
    public void moveToMapLocation(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a70c92970af6a7ede413cbe07f6c7bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a70c92970af6a7ede413cbe07f6c7bc");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.moveToMapLocation(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.getCenterLocation", onUiThread = true)
    public void getMapCenterLocation(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d16551986a39bbed851f5f50bd096b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d16551986a39bbed851f5f50bd096b");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.getMapCenterLocation(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.getRegion", onUiThread = true)
    public void getMapRegion(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db0fd717eb613680244a2e17f47a4146", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db0fd717eb613680244a2e17f47a4146");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.getMapRegion(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.getScale", onUiThread = true)
    public void getMapScale(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59a65c71756b51aabad8f0863917219", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59a65c71756b51aabad8f0863917219");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.getMapScale(msiContext);
        }
    }

    @MsiApiMethod(name = "MapContext.includePoints", onUiThread = true, request = MapParam.class)
    public void includeMapPoints(MapParam mapParam, MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {mapParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "396430a6b59b9924914e1cd9164b5ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "396430a6b59b9924914e1cd9164b5ac2");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.includeMapPoints(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.translateMarker", onUiThread = true, request = MapParam.class)
    public void translateMapMarker(MapParam mapParam, MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {mapParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "572164f254a610979e3c016e35063ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "572164f254a610979e3c016e35063ae5");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.translateMapMarker(mapParam, msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.getRotate", onUiThread = true)
    public void getMapRotate(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4beafbc498859dab45cc1e06d96cb8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4beafbc498859dab45cc1e06d96cb8b0");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.getMapRotate(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.setCenterOffset", onUiThread = true)
    public void setMapCenterOffset(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f73457d741eb6db90a423c96fcb42c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f73457d741eb6db90a423c96fcb42c");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.setMapCenterOffset(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.setLocMarkerIcon", onUiThread = true)
    public void setMapLocMarkerIcon(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e354f3cbb1d9903f0050e286e7233bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e354f3cbb1d9903f0050e286e7233bbe");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.setMapLocMarkerIcon(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removeMarkers", onUiThread = true)
    public void removeMapMarkers(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8379408780985768d4b9383d3fe65f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8379408780985768d4b9383d3fe65f");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removeMapMarkers(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.createDynamicMap", onUiThread = true)
    public void createDynamicMap(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73ef90ea2aff34088f966a04f5fd1f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73ef90ea2aff34088f966a04f5fd1f9");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.createDynamicMap(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addDynamicMapResources", onUiThread = true)
    public void addDynamicMapResources(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cba685554536bdc6bfcbe5588642e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cba685554536bdc6bfcbe5588642e3");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addDynamicMapResources(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addDynamicMapGeoJSON", onUiThread = true)
    public void addDynamicMapGeoJSON(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86ddbefe395e9a39766453e72cebd4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86ddbefe395e9a39766453e72cebd4d");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addDynamicMapGeoJSON(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removeDynamicMapResources", onUiThread = true)
    public void removeDynamicMapResources(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4264ff18e0d096143d96269d97e1e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4264ff18e0d096143d96269d97e1e06");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removeDynamicMapResources(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removeDynamicMap", onUiThread = true)
    public void removeDynamicMap(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b86e58f5ef4a81a4a03f3689104e7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b86e58f5ef4a81a4a03f3689104e7da");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removeDynamicMap(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.setCamera", onUiThread = true)
    public void setCamera(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef1ced40893f472a104870b59bddf9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef1ced40893f472a104870b59bddf9c");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.setCamera(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.getMapOptions", onUiThread = true)
    public void getMapOptions(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e073f43bb7a3290e71892249dcb496ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e073f43bb7a3290e71892249dcb496ea");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.getMapOptions(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.selectMarkers", onUiThread = true)
    public void selectMarkers(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f37706edda59af65b28d7771796217", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f37706edda59af65b28d7771796217");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.selectMarkers(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.fromScreenLocation", onUiThread = true)
    public void fromScreenLocation(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a52605aec5330e5a6cf7513e1c9c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a52605aec5330e5a6cf7513e1c9c93");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.fromScreenLocation(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.toScreenLocation", onUiThread = true)
    public void toScreenLocation(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c42bb08ff1585b2d4641d7697d83d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c42bb08ff1585b2d4641d7697d83d2");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.toScreenLocation(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.getAllOverlays")
    public void getAllOverlays(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd2ae0d2e6c69c6067f2af98f32fa0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd2ae0d2e6c69c6067f2af98f32fa0a");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.getAllOverlays(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.updateLocation", onUiThread = true)
    public void updateLocation(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a7b5410f9d232f2f1a8f7eeefb980d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a7b5410f9d232f2f1a8f7eeefb980d");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.updateLocation(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addFlowLine", onUiThread = true)
    public void addFlowLine(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25088c8732f22fdd98a2d7b1fd452f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25088c8732f22fdd98a2d7b1fd452f54");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addFlowLine(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removeLines", onUiThread = true)
    public void removeLines(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c23805a8af519e8e564b1723f0f689b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c23805a8af519e8e564b1723f0f689b0");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removeLines(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addRipplesGroup", onUiThread = true)
    public void addRipples(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4997877a5ce0410651443b97753ca93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4997877a5ce0410651443b97753ca93e");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addRipples(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removeRipplesGroup", onUiThread = true)
    public void removeRipples(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1e9e7fa17eacd05f25e4eb2254682a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1e9e7fa17eacd05f25e4eb2254682a");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removeRipples(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.takeSnapshot", onUiThread = true)
    public void takeSnapshot(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5beeb41c83c0dfec77a69c74d437c559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5beeb41c83c0dfec77a69c74d437c559");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.takeSnapshot(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.setMapStyle", onUiThread = true)
    public void setMapStyle(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35914e96931f7d5d468307560a0cce4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35914e96931f7d5d468307560a0cce4a");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.setMapStyle(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.clear", onUiThread = true)
    public void clear(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff4a162f644a6f3a03fd7724edc3cd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff4a162f644a6f3a03fd7724edc3cd3f");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.clear(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.setBoundary", onUiThread = true)
    public void setBoundary(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d03bae4fcd37a44a3965e31cb9dbdf4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d03bae4fcd37a44a3965e31cb9dbdf4e");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.setBoundary(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addGroundOverlay", onUiThread = true)
    public void addGroundOverlay(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e70eee0bb90a11e0403276ffc3a98c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e70eee0bb90a11e0403276ffc3a98c3");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addGroundOverlay(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.updateGroundOverlay", onUiThread = true)
    public void updateGroundOverlay(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa35de23df8ad5dab200f87535a7905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa35de23df8ad5dab200f87535a7905");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.updateGroundOverlay(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removeGroundOverlay", onUiThread = true)
    public void removeGroundOverlay(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9856233f1ce827c680ba78c00cf55dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9856233f1ce827c680ba78c00cf55dbb");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removeGroundOverlay(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addArc", onUiThread = true)
    public void addArc(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c68f95dddad8457ed2a449778d6fefd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c68f95dddad8457ed2a449778d6fefd");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addArc(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removeArc", onUiThread = true)
    public void removeArc(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accfebf5a645a3329138457514d03116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accfebf5a645a3329138457514d03116");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removeArc(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.setMapStyleColor", onUiThread = true)
    public void setMapStyleColor(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e841367923e9f20926a3c8eeeecdb6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e841367923e9f20926a3c8eeeecdb6d0");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.setMapStyleColor(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.resume", onUiThread = true)
    public void resume(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f176c6dd052af67da2e25219da032f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f176c6dd052af67da2e25219da032f18");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.resume(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.addPolylines", onUiThread = true)
    public void addPolylines(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9308142da82f9768ef6b502cb9eee4ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9308142da82f9768ef6b502cb9eee4ca");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.addPolylines(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.updatePolylines", onUiThread = true)
    public void updatePolylines(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3578a32b24f10e3740ad94db76576384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3578a32b24f10e3740ad94db76576384");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.updatePolylines(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.removePolylines", onUiThread = true)
    public void removePolylines(MsiContext msiContext) {
        com.meituan.msi.lib.map.api.interfaces.b bVar;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "117d600f54ba45327d2c3491c2e3ad29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "117d600f54ba45327d2c3491c2e3ad29");
        } else if (msiContext == null || (bVar = this.c.get(a(msiContext))) == null) {
        } else {
            bVar.removePolylines(msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @MsiApiMethod(name = "MapContext.moveAlong", onUiThread = true)
    public void moveAlong(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63ce8593a5286d9f2a58737dc825a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63ce8593a5286d9f2a58737dc825a0f");
            return;
        }
        com.meituan.msi.lib.map.api.interfaces.b bVar = this.c.get(a(msiContext));
        if (bVar != null) {
            bVar.moveAlong(msiContext);
        }
    }
}
