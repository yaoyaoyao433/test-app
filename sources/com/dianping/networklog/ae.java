package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.titans.widget.PickerBuilder;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ae {
    public static ChangeQuickRedirect a;
    public boolean b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public String j;
    public a k;

    /* loaded from: classes.dex */
    enum a {
        NONE,
        UPLOAD_ING,
        NOFile,
        UPLOAD_FAIL,
        UPLOAD_SUCCESS;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71aecf61d0f276af3ca7c14148303ecc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71aecf61d0f276af3ca7c14148303ecc");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0dae3c4899ecd350b67f6dea12d9cc24", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0dae3c4899ecd350b67f6dea12d9cc24") : Enum.valueOf(a.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29d28d2d8e33b914fa851b3f90c6bb41", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29d28d2d8e33b914fa851b3f90c6bb41") : values().clone());
        }
    }

    public ae() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "165bf2fa340188e5baee39e9beb8bece", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "165bf2fa340188e5baee39e9beb8bece");
            return;
        }
        this.i = true;
        this.k = a.NONE;
    }

    public static ae a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5772b9176f190e36f79af5c8d4488b58", 6917529027641081856L)) {
            return (ae) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5772b9176f190e36f79af5c8d4488b58");
        }
        ae aeVar = new ae();
        try {
            aeVar.b = jSONObject.getBoolean("isMustWifi");
            aeVar.d = jSONObject.getInt(PickerBuilder.EXTRA_MAX_FILE_SIZE);
            aeVar.g = 2;
            aeVar.c = jSONObject.getString("unionId");
            aeVar.e = jSONObject.getString("sendDate");
            aeVar.h = jSONObject.getInt("times");
            aeVar.f = jSONObject.getBoolean("isForce");
            aeVar.j = jSONObject.getString("source");
            aeVar.k = a.NONE;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return aeVar;
    }

    public static JSONObject a(ae aeVar) {
        Object[] objArr = {aeVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fac89a18c538dc125c075ebb3b8983eb", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fac89a18c538dc125c075ebb3b8983eb");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMustWifi", aeVar.b);
            jSONObject.put(PickerBuilder.EXTRA_MAX_FILE_SIZE, aeVar.d);
            jSONObject.put("unionId", aeVar.c);
            jSONObject.put("sendDate", aeVar.e);
            jSONObject.put("times", aeVar.h);
            jSONObject.put("isForce", aeVar.f);
            jSONObject.put("source", aeVar.j);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
