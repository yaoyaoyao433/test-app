package com.sankuai.waimai.business.knb.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dianping.titansmodel.j;
import com.dianping.titansmodel.k;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends j {
    public static ChangeQuickRedirect n;
    public static final Parcelable.Creator<b> q = new Parcelable.Creator<b>() { // from class: com.sankuai.waimai.business.knb.model.b.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d39a3200a4bcccf2b2357d2e926270c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d39a3200a4bcccf2b2357d2e926270c") : new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i) {
            return new b[i];
        }
    };
    public static final k.a<b> r = new k.a<b>() { // from class: com.sankuai.waimai.business.knb.model.b.2
    };
    public String o;
    public String p;

    @Override // com.dianping.titansmodel.j, com.dianping.titansmodel.g
    public final void writeToJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7e3c54e9c17ffe4405a5e105614f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7e3c54e9c17ffe4405a5e105614f41");
            return;
        }
        try {
            jSONObject.put("status", this.status);
            jSONObject.put("errorCode", this.errorCode);
            jSONObject.put("errorMsg", this.errorMsg);
            jSONObject.put("result", this.result);
            jSONObject.put("token", this.e);
            jSONObject.put("unionId", this.c);
            jSONObject.put(DeviceInfo.USER_ID, this.b);
            jSONObject.put("type", this.o);
            jSONObject.put("hasPassword", this.i);
            jSONObject.put("avatarURL", this.j);
            jSONObject.put("userName", this.k);
            jSONObject.put("uuid", this.p);
            jSONObject.put("phoneNumber", this.h);
        } catch (JSONException unused) {
        }
    }

    @Override // com.dianping.titansmodel.j, com.dianping.titansmodel.g, com.dianping.titansmodel.a
    public final JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b5369b8b8d5885ea68d88e3691cf71b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b5369b8b8d5885ea68d88e3691cf71b");
        }
        JSONObject jSONObject = new JSONObject();
        writeToJSON(jSONObject);
        return jSONObject;
    }

    public b() {
    }

    private b(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "266b669ece0a78b43b4b9eaa07e237a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "266b669ece0a78b43b4b9eaa07e237a4");
            return;
        }
        this.status = parcel.readString();
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
        this.result = parcel.readString();
        this.e = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
        this.o = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.p = parcel.readString();
        this.h = parcel.readString();
    }
}
