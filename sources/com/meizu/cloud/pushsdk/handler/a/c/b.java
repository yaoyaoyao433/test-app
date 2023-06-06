package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.b.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b[] newArray(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };
    public a a;
    public f b;
    private String c;

    public b() {
    }

    protected b(Parcel parcel) {
        this.c = parcel.readString();
        this.a = (a) parcel.readParcelable(a.class.getClassLoader());
        this.b = (f) parcel.readParcelable(f.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ControlMessage{controlMessage='" + this.c + "', control=" + this.a + ", statics=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public b(String str, String str2, String str3) {
        this.c = str;
        if (TextUtils.isEmpty(str)) {
            this.a = new a();
            this.b = new f();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = a.a(jSONObject.getJSONObject("ctl"));
            this.b = f.a(jSONObject.getJSONObject("statics"));
            this.b.d = str2;
            this.b.e = str3;
        } catch (JSONException e) {
            this.a = new a();
            this.b = new f();
            DebugLogger.e("ControlMessage", "parse control message error " + e.getMessage());
        }
    }

    public static b a(String str) {
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.a = a.a(jSONObject.getJSONObject("ctl"));
            bVar.b = f.a(jSONObject.getJSONObject("statics"));
        } catch (Exception e) {
            DebugLogger.e("ControlMessage", "parse control message error " + e.getMessage());
            bVar.b = new f();
            bVar.a = new a();
        }
        return bVar;
    }
}
