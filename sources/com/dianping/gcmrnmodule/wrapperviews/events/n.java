package com.dianping.gcmrnmodule.wrapperviews.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class n extends com.facebook.react.uimanager.events.b<n> {
    public static ChangeQuickRedirect a;
    private JSONObject b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "onPageAppear";
    }

    public n(int i, JSONObject jSONObject) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad111575f819c25f55bcc53d7a5a3609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad111575f819c25f55bcc53d7a5a3609");
        } else {
            this.b = jSONObject;
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa65a10a9918c223fc5b19721e9c827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa65a10a9918c223fc5b19721e9c827");
        } else if (this.b == null) {
            rCTEventEmitter.receiveEvent(e(), a(), null);
        } else {
            try {
                writableMap = com.meituan.android.mrn.utils.g.a(this.b);
            } catch (JSONException e) {
                e.printStackTrace();
                writableMap = null;
            }
            rCTEventEmitter.receiveEvent(e(), a(), writableMap);
        }
    }
}
