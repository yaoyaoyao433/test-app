package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.f.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f[] newArray(int i) {
            return new f[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }
    };
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;

    public f() {
        this.c = false;
    }

    protected f(Parcel parcel) {
        this.c = false;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Statics{taskId='" + this.a + "', time='" + this.b + "', pushExtra=" + this.c + ", deviceId='" + this.d + "', seqId='" + this.e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }

    public static f a(JSONObject jSONObject) {
        f fVar = new f();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(ResponseWithInnerData.TASK_ID)) {
                    fVar.a = jSONObject.getString(ResponseWithInnerData.TASK_ID);
                }
                if (!jSONObject.isNull("time")) {
                    fVar.b = jSONObject.getString("time");
                }
                if (!jSONObject.isNull("pushExtra")) {
                    fVar.c = jSONObject.getInt("pushExtra") == 0;
                }
            } catch (JSONException e) {
                DebugLogger.e("statics", " parse statics message error " + e.getMessage());
            }
        } else {
            DebugLogger.e("statics", "no control statics can parse ");
        }
        return fVar;
    }
}
