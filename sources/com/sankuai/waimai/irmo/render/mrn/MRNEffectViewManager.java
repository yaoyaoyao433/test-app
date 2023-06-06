package com.sankuai.waimai.irmo.render.mrn;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.WMIrmoView;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.f;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MRNEffectViewManager extends SimpleViewManager<WMIrmoView> {
    private static final int COMMAND_PAUSE = 2;
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RESET = 3;
    private static final int COMMAND_STOP = 0;
    private static final String REACT_CLASS = "MRNEffectView";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<WMIrmoView, b> propManagersMap;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    public MRNEffectViewManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fe24ac2c5271ef9aade0c09d73e7d20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fe24ac2c5271ef9aade0c09d73e7d20");
        } else {
            this.propManagersMap = new WeakHashMap();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public WMIrmoView createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "975cf014554db61d2f7543a0f5174047", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMIrmoView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "975cf014554db61d2f7543a0f5174047");
        }
        WMIrmoView wMIrmoView = new WMIrmoView(aoVar);
        wMIrmoView.a("mrn");
        getOrCreatePropertyManager(wMIrmoView).c = aoVar.getCurrentActivity();
        return wMIrmoView;
    }

    @ReactProp(name = "effectUrl")
    public void setEffectUrl(WMIrmoView wMIrmoView, String str) {
        Object[] objArr = {wMIrmoView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82ecfae7ab1a5a22cc6755928d97a58b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82ecfae7ab1a5a22cc6755928d97a58b");
            return;
        }
        b orCreatePropertyManager = getOrCreatePropertyManager(wMIrmoView);
        orCreatePropertyManager.d = str;
        orCreatePropertyManager.h = true;
    }

    @ReactProp(name = "effectJson")
    public void setEffectJson(WMIrmoView wMIrmoView, String str) {
        Object[] objArr = {wMIrmoView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19a8a1b7aeeb0142b4a0d97fd840f99a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19a8a1b7aeeb0142b4a0d97fd840f99a");
            return;
        }
        b orCreatePropertyManager = getOrCreatePropertyManager(wMIrmoView);
        orCreatePropertyManager.e = str;
        orCreatePropertyManager.i = true;
    }

    @ReactProp(defaultInt = 1, name = "effectAction")
    public void setEffectAction(WMIrmoView wMIrmoView, int i) {
        Object[] objArr = {wMIrmoView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69c3aa463dfa40470420a59a63225e5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69c3aa463dfa40470420a59a63225e5b");
            return;
        }
        b orCreatePropertyManager = getOrCreatePropertyManager(wMIrmoView);
        orCreatePropertyManager.f = i;
        orCreatePropertyManager.j = true;
    }

    @ReactProp(name = "extraParams")
    public void setExtraParams(WMIrmoView wMIrmoView, ReadableMap readableMap) {
        Object[] objArr = {wMIrmoView, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e75daad8419df09143db0ca3d6b451f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e75daad8419df09143db0ca3d6b451f7");
        } else {
            getOrCreatePropertyManager(wMIrmoView).g = readableMap;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "192916b16c1a59a29e2158d1214029d8", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "192916b16c1a59a29e2158d1214029d8") : c.a("stop", 0, "play", 1, "pause", 2, "reset", 3);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull WMIrmoView wMIrmoView, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {wMIrmoView, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fcc139b4b2afaa532f788a5355a555f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fcc139b4b2afaa532f788a5355a555f");
        } else {
            getOrCreatePropertyManager(wMIrmoView).a(wMIrmoView, i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e5416455cef1396a3b59437d35e3a5f", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e5416455cef1396a3b59437d35e3a5f") : c.b().a("playStatusChange", c.a("phasedRegistrationNames", c.a("bubbled", "onEffectCallback"))).a();
    }

    private b getOrCreatePropertyManager(WMIrmoView wMIrmoView) {
        Object[] objArr = {wMIrmoView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7932fca0ade2fa348cfe30ead00cbf57", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7932fca0ade2fa348cfe30ead00cbf57");
        }
        b bVar = this.propManagersMap.get(wMIrmoView);
        if (bVar == null) {
            b bVar2 = new b(wMIrmoView);
            this.propManagersMap.put(wMIrmoView, bVar2);
            return bVar2;
        }
        return bVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull WMIrmoView wMIrmoView) {
        Object[] objArr = {wMIrmoView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ef43fc105cfaa3490e87d139945cae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ef43fc105cfaa3490e87d139945cae1");
            return;
        }
        super.onAfterUpdateTransaction((MRNEffectViewManager) wMIrmoView);
        final b orCreatePropertyManager = getOrCreatePropertyManager(wMIrmoView);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "bbc2a3ab205c8ccaf780f91b2fc36ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, orCreatePropertyManager, changeQuickRedirect3, false, "bbc2a3ab205c8ccaf780f91b2fc36ca3");
            return;
        }
        final WMIrmoView wMIrmoView2 = orCreatePropertyManager.b.get();
        if (wMIrmoView2 != null) {
            wMIrmoView2.a(orCreatePropertyManager.c, new f(orCreatePropertyManager.g));
            wMIrmoView2.a(new com.sankuai.waimai.irmo.render.a() { // from class: com.sankuai.waimai.irmo.render.mrn.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.render.a
                public final void a(@NonNull a.EnumC0973a enumC0973a, @Nullable Map<String, Object> map) {
                    Object[] objArr3 = {enumC0973a, map};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "754e3aa495ba1b7a77059aecc7185290", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "754e3aa495ba1b7a77059aecc7185290");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("eventName", enumC0973a.name());
                    if (map != null) {
                        WritableMap createMap2 = Arguments.createMap();
                        for (String str : map.keySet()) {
                            Object obj = map.get(str);
                            StringBuilder sb = new StringBuilder();
                            sb.append(obj);
                            createMap2.putString(str, sb.toString());
                        }
                        createMap.putMap("params", (ReadableMap) createMap2);
                    }
                    b.a(orCreatePropertyManager, wMIrmoView2, createMap);
                }
            });
            if (!TextUtils.isEmpty(orCreatePropertyManager.d)) {
                if (orCreatePropertyManager.h) {
                    wMIrmoView2.a(0, orCreatePropertyManager.d);
                    orCreatePropertyManager.h = false;
                }
            } else if (orCreatePropertyManager.e != null && orCreatePropertyManager.i) {
                wMIrmoView2.b(orCreatePropertyManager.e);
                orCreatePropertyManager.i = false;
            }
            if (orCreatePropertyManager.j) {
                orCreatePropertyManager.a(wMIrmoView2, orCreatePropertyManager.f);
                orCreatePropertyManager.j = false;
            }
        }
    }
}
