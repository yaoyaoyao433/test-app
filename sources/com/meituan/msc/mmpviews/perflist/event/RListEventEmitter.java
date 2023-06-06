package com.meituan.msc.mmpviews.perflist.event;

import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.MSCWritableArray;
import com.meituan.msc.jse.bridge.MSCWritableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.mmpviews.list.c;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.events.ReactEventEmitter;
import com.meituan.msc.uimanager.list.MSCListEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RListEventEmitter extends MSCListEventEmitter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSInstance mJSInstance;
    private c touchIndex;

    public RListEventEmitter(ReactApplicationContext reactApplicationContext, com.meituan.msc.uimanager.list.c cVar, ReactEventEmitter reactEventEmitter, JSInstance jSInstance, c cVar2) {
        super(reactApplicationContext, cVar, reactEventEmitter);
        Object[] objArr = {reactApplicationContext, cVar, reactEventEmitter, jSInstance, cVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7516968573a0ed27a10836ef7102dad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7516968573a0ed27a10836ef7102dad");
            return;
        }
        this.touchIndex = cVar2;
        this.mJSInstance = jSInstance;
    }

    @Override // com.meituan.msc.uimanager.list.MSCListEventEmitter, com.meituan.msc.uimanager.events.ReactEventEmitter, com.meituan.msc.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, int i2, String str, @Nullable WritableMap writableMap, View view) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, writableMap, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65dcebc2871b3cfdf5546b00fcfac157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65dcebc2871b3cfdf5546b00fcfac157");
        } else if (writableMap == null) {
        } else {
            if (view == null) {
                g.b("[RListEventEmitter@receiveEvent]", null, "host view null", Integer.valueOf(i), Integer.valueOf(i2), str, writableMap);
                return;
            }
            com.meituan.msc.mmpviews.list.event.g a = com.meituan.msc.mmpviews.list.event.g.a();
            a.i = view;
            this.touchIndex.a(a);
            if (a.h == 0 || a.b < 0) {
                g.b("[RListEventEmitter@receiveEvent]", null, "receiveEvent get a detached view:", str);
                return;
            }
            writableMap.putInt("index", a.b);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("EventEmitter");
            jSONArray.put("receiveEvent");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageId", i);
                jSONObject.put("listId", a.h);
                jSONObject.put("viewId", i2);
                jSONObject.put("eventName", str);
                jSONObject.put("eventData", ((MSCWritableMap) writableMap).getRealData());
            } catch (JSONException e) {
                g.a("[RListEventEmitter@receiveEvent]", e);
            }
            jSONArray.put(jSONObject.toString());
            g.d("[RListEventEmitter@receiveEvent]", "event: ", str);
            dispatchToMainThread(jSONArray);
        }
    }

    @Override // com.meituan.msc.uimanager.list.MSCListEventEmitter, com.meituan.msc.uimanager.events.ReactEventEmitter, com.meituan.msc.uimanager.events.RCTEventEmitter
    public void receiveTouches(int i, String str, WritableArray writableArray, WritableArray writableArray2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, writableArray, writableArray2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df3cd13c601c77b22ae29b6138ba3b82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df3cd13c601c77b22ae29b6138ba3b82");
        } else if (writableArray == null) {
        } else {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("EventEmitter");
            jSONArray.put("receiveTouches");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageId", i);
                jSONObject.put("listId", this.uiImplementation.A);
                jSONObject.put("eventName", str);
                jSONObject.put("touches", ((MSCWritableArray) writableArray).getRealData());
                jSONObject.put("changedIndices", ((MSCWritableArray) writableArray2).getRealData());
            } catch (JSONException e) {
                g.a("[RListEventEmitter@receiveTouches]", e);
            }
            jSONArray.put(jSONObject.toString());
            g.d("[RListEventEmitter@receiveTouches]", "event: ", str);
            dispatchToMainThread(jSONArray);
        }
    }

    private void dispatchToMainThread(final Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7defe83cfb3bf006b8db5ba260e2195f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7defe83cfb3bf006b8db5ba260e2195f");
        } else if (!this.uiImplementation.e().isOnUiQueueThread()) {
            this.uiImplementation.e().runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.mmpviews.perflist.event.RListEventEmitter.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "077a39f358292830824423580bc0a2e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "077a39f358292830824423580bc0a2e4");
                    } else {
                        RListEventEmitter.this.mJSInstance.executeJSFunction("JSBridge", "invoke", obj.toString());
                    }
                }
            });
        } else {
            this.mJSInstance.executeJSFunction("JSBridge", "invoke", obj.toString());
        }
    }
}
