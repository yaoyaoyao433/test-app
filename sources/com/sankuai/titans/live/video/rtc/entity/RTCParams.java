package com.sankuai.titans.live.video.rtc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RTCParams implements Parcelable {
    public static final Parcelable.Creator<RTCParams> CREATOR = new Parcelable.Creator<RTCParams>() { // from class: com.sankuai.titans.live.video.rtc.entity.RTCParams.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RTCParams createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc759ab1224c29d54282554544937910", RobustBitConfig.DEFAULT_VALUE) ? (RTCParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc759ab1224c29d54282554544937910") : new RTCParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RTCParams[] newArray(int i) {
            return new RTCParams[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @Expose
    public String businessInfo;
    @Expose
    public String privateMapKey;
    @Expose
    public int projectId;
    @Expose
    public int role;
    @Expose
    public int roomId;
    @Expose
    public int scene;
    @Expose
    public String sceneToken;
    @Expose
    public int sdkAppId;
    @Expose
    public String streamId;
    @Expose
    public String userDefineRecordId;
    @Expose
    public String userId;
    @Expose
    public String userSig;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RTCParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0244ad3d867c5d08ed4900734bc22223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0244ad3d867c5d08ed4900734bc22223");
            return;
        }
        this.sdkAppId = 0;
        this.userId = "";
        this.userSig = "";
        this.roomId = 0;
        this.scene = 0;
        this.role = 20;
        this.privateMapKey = "";
        this.businessInfo = "";
    }

    public RTCParams(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "286805c27998b9f637934f0ad771396e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "286805c27998b9f637934f0ad771396e");
            return;
        }
        this.sdkAppId = 0;
        this.userId = "";
        this.userSig = "";
        this.roomId = 0;
        this.scene = 0;
        this.role = 20;
        this.privateMapKey = "";
        this.businessInfo = "";
        this.sdkAppId = parcel.readInt();
        this.userId = parcel.readString();
        this.userSig = parcel.readString();
        this.roomId = parcel.readInt();
        this.scene = parcel.readInt();
        this.role = parcel.readInt();
        this.streamId = parcel.readString();
        this.userDefineRecordId = parcel.readString();
        this.privateMapKey = parcel.readString();
        this.businessInfo = parcel.readString();
        this.projectId = parcel.readInt();
        this.sceneToken = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "afbe260945c84248188d3d21504c8b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "afbe260945c84248188d3d21504c8b33");
            return;
        }
        parcel.writeInt(this.sdkAppId);
        parcel.writeString(this.userId);
        parcel.writeString(this.userSig);
        parcel.writeInt(this.roomId);
        parcel.writeInt(this.scene);
        parcel.writeInt(this.role);
        parcel.writeString(this.streamId);
        parcel.writeString(this.userDefineRecordId);
        parcel.writeString(this.privateMapKey);
        parcel.writeString(this.businessInfo);
        parcel.writeInt(this.projectId);
        parcel.writeString(this.sceneToken);
    }
}
