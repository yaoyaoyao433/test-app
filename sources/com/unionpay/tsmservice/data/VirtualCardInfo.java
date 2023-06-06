package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.unionpay.tsmservice.AppID;
/* loaded from: classes6.dex */
public class VirtualCardInfo implements Parcelable {
    public static final Parcelable.Creator<VirtualCardInfo> CREATOR = new Parcelable.Creator<VirtualCardInfo>() { // from class: com.unionpay.tsmservice.data.VirtualCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualCardInfo createFromParcel(Parcel parcel) {
            return new VirtualCardInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VirtualCardInfo[] newArray(int i) {
            return new VirtualCardInfo[i];
        }
    };
    private AppID mAppID;
    private String mBalance;
    private String mCVN2;
    private String mCardNo;
    private String mReferenceID;
    private String mValidDate;

    public VirtualCardInfo() {
        this.mReferenceID = "";
        this.mCardNo = "";
        this.mValidDate = "";
        this.mCVN2 = "";
        this.mBalance = "";
    }

    public VirtualCardInfo(Parcel parcel) {
        this.mReferenceID = "";
        this.mCardNo = "";
        this.mValidDate = "";
        this.mCVN2 = "";
        this.mBalance = "";
        this.mAppID = (AppID) parcel.readParcelable(AppID.class.getClassLoader());
        this.mReferenceID = parcel.readString();
        this.mCardNo = parcel.readString();
        this.mValidDate = parcel.readString();
        this.mCVN2 = parcel.readString();
        this.mBalance = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppID getAppID() {
        return this.mAppID;
    }

    public String getBalance() {
        return this.mBalance;
    }

    public String getCVN2() {
        return this.mCVN2;
    }

    public String getCardNo() {
        return this.mCardNo;
    }

    public String getReferenceID() {
        return this.mReferenceID;
    }

    public String getValidDate() {
        return this.mValidDate;
    }

    public void setAppID(AppID appID) {
        this.mAppID = appID;
    }

    public void setBalance(String str) {
        this.mBalance = str;
    }

    public void setCVN2(String str) {
        this.mCVN2 = str;
    }

    public void setCardNo(String str) {
        this.mCardNo = str;
    }

    public void setReferenceID(String str) {
        this.mReferenceID = str;
    }

    public void setValidDate(String str) {
        this.mValidDate = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mAppID, i);
        parcel.writeString(this.mReferenceID);
        parcel.writeString(this.mCardNo);
        parcel.writeString(this.mValidDate);
        parcel.writeString(this.mCVN2);
        parcel.writeString(this.mBalance);
    }
}
