package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.a.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };
    public int a;
    private int b;
    private int c;

    public a() {
    }

    protected a(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Control{pushType=" + this.a + ", cached=" + this.b + ", cacheNum=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public static a a(JSONObject jSONObject) {
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("pushType")) {
                    aVar.a = jSONObject.getInt("pushType");
                }
                if (!jSONObject.isNull(NetLogConstants.Details.CACHED)) {
                    aVar.b = jSONObject.getInt(NetLogConstants.Details.CACHED);
                }
                if (!jSONObject.isNull("cacheNum")) {
                    aVar.c = jSONObject.getInt("cacheNum");
                }
            } catch (JSONException e) {
                DebugLogger.e("ctl", " parse control message error " + e.getMessage());
            }
        } else {
            DebugLogger.e("ctl", "no control message can parse ");
        }
        return aVar;
    }
}
