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
public class c extends com.facebook.react.uimanager.events.b<c> {
    public static ChangeQuickRedirect a;
    private JSONObject b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "onAppear";
    }

    public c(int i, JSONObject jSONObject) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eeb0a013567e1d8248afb59a5ed897e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eeb0a013567e1d8248afb59a5ed897e");
        } else {
            this.b = jSONObject;
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableMap;
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb61c93ac7b82cb3385073aa4690b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb61c93ac7b82cb3385073aa4690b10");
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
