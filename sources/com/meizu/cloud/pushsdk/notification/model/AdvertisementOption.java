package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class AdvertisementOption implements Parcelable {
    public static final String ADVERTISEMENT_OPTION = "ado";
    public static final String AD_INSTALL_PACKAGE = "aip";
    public static final String AD_PACKAGE = "ap";
    public static final Parcelable.Creator<AdvertisementOption> CREATOR = new Parcelable.Creator<AdvertisementOption>() { // from class: com.meizu.cloud.pushsdk.notification.model.AdvertisementOption.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AdvertisementOption[] newArray(int i) {
            return new AdvertisementOption[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AdvertisementOption createFromParcel(Parcel parcel) {
            return new AdvertisementOption(parcel);
        }
    };
    public static final String PRIORITY_VALID_TIME = "pt";
    public static final String TAG = "AdvertisementOption";
    private String mAdInstallPackage;
    private String mAdPackage;
    private int mPriorityValidTime;

    public AdvertisementOption() {
    }

    protected AdvertisementOption(Parcel parcel) {
        this.mAdPackage = parcel.readString();
        this.mPriorityValidTime = parcel.readInt();
        this.mAdInstallPackage = parcel.readString();
    }

    public static AdvertisementOption parse(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                DebugLogger.e(TAG, "parse json string error " + e.getMessage());
            }
            return parse(jSONObject);
        }
        jSONObject = null;
        return parse(jSONObject);
    }

    public static AdvertisementOption parse(JSONObject jSONObject) {
        AdvertisementOption advertisementOption = new AdvertisementOption();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull(AD_PACKAGE)) {
                    advertisementOption.setAdPackage(jSONObject.getString(AD_PACKAGE));
                }
                if (!jSONObject.isNull(PRIORITY_VALID_TIME)) {
                    advertisementOption.setPriorityValidTime(jSONObject.getInt(PRIORITY_VALID_TIME));
                }
                if (!jSONObject.isNull(AD_INSTALL_PACKAGE)) {
                    advertisementOption.setAdInstallPackage(jSONObject.getString(AD_INSTALL_PACKAGE));
                }
            } catch (JSONException e) {
                DebugLogger.e(TAG, "parse json obj error " + e.getMessage());
            }
        } else {
            DebugLogger.e(TAG, "no such tag AdvertisementOption");
        }
        return advertisementOption;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdInstallPackage() {
        return this.mAdInstallPackage;
    }

    public String getAdPackage() {
        return this.mAdPackage;
    }

    public int getPriorityValidTime() {
        return this.mPriorityValidTime;
    }

    public void setAdInstallPackage(String str) {
        this.mAdInstallPackage = str;
    }

    public void setAdPackage(String str) {
        this.mAdPackage = str;
    }

    public void setPriorityValidTime(int i) {
        this.mPriorityValidTime = i;
    }

    public String toString() {
        return "AdvertisementOption{mAdPackage=" + this.mAdPackage + "mPriorityValidTime=" + this.mPriorityValidTime + "mAdInstallPackage=" + this.mAdInstallPackage + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAdPackage);
        parcel.writeInt(this.mPriorityValidTime);
        parcel.writeString(this.mAdInstallPackage);
    }
}
