package com.meituan.android.mrn.module.jshandler;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.mrn.utils.al;
import com.meituan.android.mrn.utils.c;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RegisterHornJsHandler extends MRNBaseJsHandler {
    public static final String KEY = "MRN.registerHorn";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Set<String> mRegisteredTypes;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Q7bzx5nkK4R5brmSOAyxI/tLb7fignGa0+Yb6ZHZr04Lc9PC/G4+w76ZdQWCc3LUVK3d/4hJmfcQ/wqrCdeOXw==";
    }

    public RegisterHornJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dd21f194b882c77c5e4197fe538c92c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dd21f194b882c77c5e4197fe538c92c");
        } else {
            this.mRegisteredTypes = new HashSet();
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5ca9fbb96761cc754a28535fc19e3b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5ca9fbb96761cc754a28535fc19e3b2");
            return;
        }
        JSONObject paramJSONObject = getParamJSONObject();
        if (paramJSONObject == null) {
            jsCallbackErrorMsg("RegisterHornJsHandler: params should not null");
            return;
        }
        try {
            String optString = paramJSONObject.optString("registerType");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("RegisterHornJsHandler: registerType should not empty");
                return;
            }
            Horn.register(optString, new a(this, optString), toMap(paramJSONObject.optJSONObject("parameters")));
            this.mRegisteredTypes.add(optString);
        } catch (Throwable th) {
            c.a("[RegisterHornJsHandler@exec]", th);
            jsCallbackErrorMsg(th.getMessage());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a extends al<BaseJsHandler> implements HornCallback {
        public static ChangeQuickRedirect a;
        private String d;

        public a(BaseJsHandler baseJsHandler, String str) {
            super(baseJsHandler);
            Object[] objArr = {baseJsHandler, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b52c3996ba01e9b6f4c94e5f55fd0eb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b52c3996ba01e9b6f4c94e5f55fd0eb");
            } else {
                this.d = str;
            }
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7a1e5ef0cbf8434e5847cbbcb00ff03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7a1e5ef0cbf8434e5847cbbcb00ff03");
                return;
            }
            BaseJsHandler a2 = a();
            if (a2 == null) {
                return;
            }
            p.a("[RegisterHornJsHandler@onChanged]", "RegisterHornJsHandler: result" + str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("data", str);
                jSONObject.put("enable", z);
                jSONObject.put("type", this.d);
                a2.jsCallback(jSONObject);
            } catch (JSONException e) {
                c.a("[RegisterHornJsHandler@onChanged]", e);
                a2.jsCallbackErrorMsg(e.getMessage());
            }
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a8a47e441720daf62e8dd0c808a7f9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a8a47e441720daf62e8dd0c808a7f9f");
            return;
        }
        super.onDestroy();
        if (this.mRegisteredTypes != null) {
            for (String str : this.mRegisteredTypes) {
                Horn.register(str, null);
            }
        }
    }

    private Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43ffe5c1fc6d3e49f6790acf8e6a190c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43ffe5c1fc6d3e49f6790acf8e6a190c");
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONArray) {
                    obj = toList((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = toMap((JSONObject) obj);
                }
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    private List<Object> toList(JSONArray jSONArray) throws JSONException {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f64eac4f78140f44ecbaba0be14dab58", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f64eac4f78140f44ecbaba0be14dab58");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = toList((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = toMap((JSONObject) obj);
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
