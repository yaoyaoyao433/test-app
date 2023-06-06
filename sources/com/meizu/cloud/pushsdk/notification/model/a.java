package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.meizu.cloud.pushsdk.notification.model.a.1
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
    public String b;

    public a() {
        this.a = 0;
    }

    protected a(Parcel parcel) {
        this.a = 0;
        this.a = parcel.readInt();
        this.b = parcel.readString();
    }

    public static a a(MessageV3 messageV3) {
        a b;
        try {
            b = !TextUtils.isEmpty(messageV3.getNotificationMessage()) ? a(new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject("extra").getJSONObject("no")) : null;
        } catch (Exception e) {
            DebugLogger.e("NotifyOption", "parse flyme NotifyOption setting error " + e.getMessage() + " so get from notificationMessage");
            b = b(messageV3.getNotificationMessage());
        }
        DebugLogger.i("NotifyOption", "current notify option is " + b);
        return b;
    }

    private static a a(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                DebugLogger.e("NotifyOption", "parse json string error " + e.getMessage());
            }
            return a(jSONObject);
        }
        jSONObject = null;
        return a(jSONObject);
    }

    private static a b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return a(new JSONObject(str).getString("no"));
        } catch (JSONException e) {
            DebugLogger.e("NotifyOption", "parse notificationMessage error " + e.getMessage());
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotifyOption{notifyId=" + this.a + ", notifyKey='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }

    private static a a(JSONObject jSONObject) {
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("ni")) {
                    aVar.a = jSONObject.getInt("ni");
                }
                if (!jSONObject.isNull("nk")) {
                    aVar.b = jSONObject.getString("nk");
                }
            } catch (JSONException e) {
                DebugLogger.e("NotifyOption", "parse json obj error " + e.getMessage());
            }
        } else {
            DebugLogger.e("NotifyOption", "no such tag NotifyOption");
        }
        return aVar;
    }

    public static int b(MessageV3 messageV3) {
        a a = a(messageV3);
        if (a != null) {
            return a.a;
        }
        return 0;
    }
}
