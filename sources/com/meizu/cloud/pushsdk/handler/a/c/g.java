package com.meizu.cloud.pushsdk.handler.a.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.meizu.cloud.pushsdk.handler.a.c.g.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ g[] newArray(int i) {
            return new g[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }
    };
    public int a;
    public boolean b;
    public List<String> c;
    public b d;
    private String e;

    protected g(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readByte() != 0;
        this.c = parcel.createStringArrayList();
        this.d = (b) parcel.readParcelable(b.class.getClassLoader());
        this.e = parcel.readString();
    }

    public g(String str, String str2, String str3, String str4) {
        this.e = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("max_size")) {
                this.a = jSONObject.getInt("max_size");
            }
            if (!jSONObject.isNull("wifi_upload")) {
                this.b = jSONObject.getBoolean("wifi_upload");
            }
            if (!jSONObject.isNull("upload_files")) {
                JSONArray jSONArray = jSONObject.getJSONArray("upload_files");
                this.c = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.c.add(jSONArray.getString(i));
                }
            }
        } catch (JSONException e) {
            DebugLogger.e("UploadLogMessage", "parse upload message error " + e.getMessage());
        }
        this.d = new b(str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UploadLogMessage{maxSize=" + this.a + ", wifiUpload=" + this.b + ", fileList=" + this.c + ", controlMessage=" + this.d + ", uploadMessage='" + this.e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }
}
