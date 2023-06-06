package com.sankuai.waimai.platform.capacity.dj.city;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AddrInfo implements Parcelable {
    public static final Parcelable.Creator<AddrInfo> CREATOR = new Parcelable.Creator<AddrInfo>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.AddrInfo.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AddrInfo createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac4f96163b1b861165c2e7ef4ba59d22", RobustBitConfig.DEFAULT_VALUE) ? (AddrInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac4f96163b1b861165c2e7ef4ba59d22") : new AddrInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AddrInfo[] newArray(int i) {
            return new AddrInfo[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String admin_code;
    public int admin_level;
    public String level_desc;
    public String name;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AddrInfo(int i, String str, String str2, String str3) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae2fba8944f1af7c5d96ca5dc547138e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae2fba8944f1af7c5d96ca5dc547138e");
            return;
        }
        this.admin_level = i;
        this.name = str;
        this.admin_code = str2;
        this.level_desc = str3;
    }

    public AddrInfo(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0644416bbcec09cb5a02ba4ffefd4c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0644416bbcec09cb5a02ba4ffefd4c3");
            return;
        }
        this.admin_level = parcel.readInt();
        this.name = parcel.readString();
        this.admin_code = parcel.readString();
        this.level_desc = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a628fd9a65052c3046e366430aeca8cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a628fd9a65052c3046e366430aeca8cc");
            return;
        }
        parcel.writeInt(this.admin_level);
        parcel.writeString(this.name);
        parcel.writeString(this.admin_code);
        parcel.writeString(this.level_desc);
    }
}
