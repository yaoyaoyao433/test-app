package com.dianping.jscore.model;

import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JSONBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final JSONObject jsonObject;

    public JSONBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23006ebe37adfb02fb0dad2a15b80487", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23006ebe37adfb02fb0dad2a15b80487");
        } else {
            this.jsonObject = new JSONObject();
        }
    }

    public JSONBuilder(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b386d613cdd474cdd10d25f47171281d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b386d613cdd474cdd10d25f47171281d");
        } else {
            this.jsonObject = jSONObject;
        }
    }

    public JSONBuilder put(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26c709b5ec042c3260000e4721cf1739", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26c709b5ec042c3260000e4721cf1739");
        }
        try {
            if (obj == null) {
                this.jsonObject.put(str, JSONObject.NULL);
            } else if (obj instanceof Encoding) {
                this.jsonObject.put(str, ((Encoding) obj).encode());
            } else if (obj instanceof Encoding[]) {
                JSONArray jSONArray = new JSONArray();
                for (Encoding encoding : (Encoding[]) obj) {
                    jSONArray.put(encoding.encode());
                }
                this.jsonObject.put(str, jSONArray);
            } else {
                this.jsonObject.put(str, obj);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd0c3b2ae7aba9b5ec8bddd39eb8d2c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd0c3b2ae7aba9b5ec8bddd39eb8d2c2") : this.jsonObject.toString();
    }

    public JSONObject toJSONObject() {
        return this.jsonObject;
    }

    public Value toValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30acf45be98fc510dae174fedc662465", RobustBitConfig.DEFAULT_VALUE) ? (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30acf45be98fc510dae174fedc662465") : new Value(this.jsonObject);
    }
}
