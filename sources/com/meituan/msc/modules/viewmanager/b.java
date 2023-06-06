package com.meituan.msc.modules.viewmanager;

import com.meituan.metrics.common.Constants;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.MSCWritableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "BindingX")
/* loaded from: classes3.dex */
public final class b extends k {
    public static ChangeQuickRedirect a;
    private final com.meituan.msc.uimanager.bingingx.d b;

    public b(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c4a3e25d228e1c5fd13ecd8911dd67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c4a3e25d228e1c5fd13ecd8911dd67");
        } else {
            this.b = new com.meituan.msc.uimanager.bingingx.d(reactApplicationContext);
        }
    }

    @MSCMethod(isSync = true)
    public final JSONObject bind(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5115b96851131d30b969e94a865e0da6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5115b96851131d30b969e94a865e0da6");
        }
        WritableMap a2 = this.b.a(new MSCReadableMap(jSONObject));
        if (a2 == null) {
            return new JSONObject();
        }
        return ((MSCWritableMap) a2).getRealData();
    }

    @MSCMethod
    public final void unbind(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cd6cecea6d7c4b781ec22a75f7b2de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cd6cecea6d7c4b781ec22a75f7b2de");
            return;
        }
        final com.meituan.msc.uimanager.bingingx.d dVar = this.b;
        final MSCReadableMap mSCReadableMap = new MSCReadableMap(jSONObject);
        Object[] objArr2 = {mSCReadableMap};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.uimanager.bingingx.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "70eee741bd89ba2569309347bc3a2c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "70eee741bd89ba2569309347bc3a2c06");
        } else if (!mSCReadableMap.hasKey("eventType") || mSCReadableMap.getType("eventType") != ReadableType.String || !mSCReadableMap.getString("eventType").equals(Constants.FPS_TYPE_SCROLL) || !mSCReadableMap.hasKey("token") || mSCReadableMap.getType("token") != ReadableType.String) {
            throw new RuntimeException("bindingx params is not valid");
        } else {
            dVar.a(new Runnable() { // from class: com.meituan.msc.uimanager.bingingx.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c3fff078a3172fc392b8013b2849ad55", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c3fff078a3172fc392b8013b2849ad55");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("eventType", mSCReadableMap.getString("eventType"));
                    hashMap.put("source", mSCReadableMap.getString("token"));
                    if (dVar.c != null) {
                        dVar.c.a(hashMap);
                    }
                }
            });
        }
    }
}
