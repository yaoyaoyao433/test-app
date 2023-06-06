package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PermissionInfo implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<PermissionInfo> CREATOR = new a();
    @Packed
    private String appID;
    @Packed
    private String packageName;
    @Packed
    private String permission;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<PermissionInfo> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PermissionInfo createFromParcel(Parcel parcel) {
            return new PermissionInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PermissionInfo[] newArray(int i) {
            return new PermissionInfo[i];
        }
    }

    public PermissionInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppID() {
        return this.appID;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPermission(String str) {
        this.permission = str;
    }

    public PermissionInfo setPermissionUri(String str) {
        this.permission = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appID);
        parcel.writeString(this.packageName);
        parcel.writeString(this.permission);
    }

    public PermissionInfo(String str, String str2, String str3) {
        this.appID = str;
        this.packageName = str2;
        this.permission = str3;
    }

    public PermissionInfo(Parcel parcel) {
        this.appID = parcel.readString();
        this.packageName = parcel.readString();
        this.permission = parcel.readString();
    }
}
