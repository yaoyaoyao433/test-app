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
public class a extends com.facebook.react.uimanager.events.b<a> {
    public static ChangeQuickRedirect a;
    private JSONObject b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "";
    }

    public a(int i, JSONObject jSONObject) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855c072b2c25daa428d605d0829f1db6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855c072b2c25daa428d605d0829f1db6");
        } else {
            this.b = jSONObject;
        }
    }

    @Override // com.facebook.react.uimanager.events.b
    public final void a(RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae11ef2e78789eecdde6f93aa7845c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae11ef2e78789eecdde6f93aa7845c5a");
            return;
        }
        WritableMap writableMap = null;
        try {
            writableMap = com.meituan.android.mrn.utils.g.a(this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        rCTEventEmitter.receiveEvent(e(), a(), writableMap);
    }
}
