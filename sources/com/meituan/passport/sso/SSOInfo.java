package com.meituan.passport.sso;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SSOInfo implements Parcelable {
    public static final Parcelable.Creator<SSOInfo> CREATOR = new Parcelable.Creator<SSOInfo>() { // from class: com.meituan.passport.sso.SSOInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SSOInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e57636ba64d890364ab649fde9b543b5", RobustBitConfig.DEFAULT_VALUE) ? (SSOInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e57636ba64d890364ab649fde9b543b5") : new SSOInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SSOInfo[] newArray(int i) {
            return new SSOInfo[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appName;
    public String appShowName;
    public boolean available;
    public String hasClickedSinkIcon;
    public String iconUrl;
    public long id;
    public String mobile;
    public String nickname;
    public String packagename;
    public String ticket;
    public String token;
    public String unClickedSinkIcon;
    public User user;
    public String username;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SSOInfo(String str, String str2, long j) {
        Object[] objArr = {str, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "513b1457d3ffa434c999fd1fdeb58a9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "513b1457d3ffa434c999fd1fdeb58a9b");
            return;
        }
        this.token = str;
        this.appName = str2;
        this.id = j;
    }

    public SSOInfo(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09dc0c2a250699d7750f4a6149947f73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09dc0c2a250699d7750f4a6149947f73");
            return;
        }
        this.appName = str;
        this.username = str2;
        this.mobile = str3;
        this.iconUrl = str4;
        this.ticket = str5;
    }

    public SSOInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3b7197959458549e15ca84881758e9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3b7197959458549e15ca84881758e9f");
            return;
        }
        this.appName = str;
        this.username = str2;
        this.mobile = str3;
        this.iconUrl = str4;
        this.ticket = str5;
        this.appShowName = str6;
        this.hasClickedSinkIcon = str7;
        this.unClickedSinkIcon = str8;
    }

    public SSOInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d06ef7ac1b0f6aebdec2b942a291c177", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d06ef7ac1b0f6aebdec2b942a291c177");
            return;
        }
        this.token = parcel.readString();
        this.appName = parcel.readString();
        this.id = parcel.readLong();
        this.username = parcel.readString();
        this.nickname = parcel.readString();
        this.mobile = parcel.readString();
        this.packagename = parcel.readString();
        this.iconUrl = parcel.readString();
        this.ticket = parcel.readString();
        this.appShowName = parcel.readString();
        this.unClickedSinkIcon = parcel.readString();
        this.hasClickedSinkIcon = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c2491ac9c07a7623aae408517f2959c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c2491ac9c07a7623aae408517f2959c");
            return;
        }
        parcel.writeString(this.token);
        parcel.writeString(this.appName);
        parcel.writeLong(this.id);
        parcel.writeString(this.username);
        parcel.writeString(this.nickname);
        parcel.writeString(this.mobile);
        parcel.writeString(this.packagename);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.ticket);
        parcel.writeString(this.appShowName);
        parcel.writeString(this.unClickedSinkIcon);
        parcel.writeString(this.hasClickedSinkIcon);
    }

    public boolean isEmptyToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63809438320d61f069504ed0a8608ed4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63809438320d61f069504ed0a8608ed4")).booleanValue() : TextUtils.isEmpty(this.token);
    }

    public String getSSOUserName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9713f9a0dca36788dde12f3c0b6e01ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9713f9a0dca36788dde12f3c0b6e01ba");
        }
        if (TextUtils.isEmpty(this.appName)) {
            return "";
        }
        if (TextUtils.isEmpty(this.nickname) || !this.appName.contains(context.getResources().getString(R.string.passport_business_partner))) {
            return !TextUtils.isEmpty(this.username) ? this.username : "";
        }
        return this.nickname;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e4d62339def9f74a6a8383f71f9d875", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e4d62339def9f74a6a8383f71f9d875");
        }
        return "SSOInfo { appName = " + this.appName + "', userName = " + this.username + "', mobile = " + this.mobile + "', ticket = " + this.ticket + " } ";
    }
}
