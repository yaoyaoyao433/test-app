package com.unionpay.tsmservice.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;
/* loaded from: classes6.dex */
public class GetTransElementsRequestParams extends RequestParams {
    public static final Parcelable.Creator<GetTransElementsRequestParams> CREATOR = new Parcelable.Creator<GetTransElementsRequestParams>() { // from class: com.unionpay.tsmservice.request.GetTransElementsRequestParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetTransElementsRequestParams createFromParcel(Parcel parcel) {
            return new GetTransElementsRequestParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetTransElementsRequestParams[] newArray(int i) {
            return new GetTransElementsRequestParams[i];
        }
    };
    public static final String TRANS_TYPE_DELETE = "0112";
    public static final String TRANS_TYPE_DOWNLOAD_APPLY = "0101";
    private AppID mAppID;
    private String mTransType;

    public GetTransElementsRequestParams() {
    }

    public GetTransElementsRequestParams(Parcel parcel) {
        super(parcel);
        this.mAppID = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.mTransType = parcel.readString();
    }

    public AppID getAppID() {
        return this.mAppID;
    }

    public String getTransType() {
        return this.mTransType;
    }

    public void setAppID(AppID appID) {
        this.mAppID = appID;
    }

    public void setTransType(String str) {
        this.mTransType = str;
    }

    @Override // com.unionpay.tsmservice.request.RequestParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mAppID, i);
        parcel.writeString(this.mTransType);
    }
}
