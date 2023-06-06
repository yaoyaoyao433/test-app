package com.sankuai.waimai.platform.domain.core.poi;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ActivityItem implements Parcelable, Serializable {
    public static final int CODE_DISCOUNT = 2;
    public static final Parcelable.Creator<ActivityItem> CREATOR = new Parcelable.Creator<ActivityItem>() { // from class: com.sankuai.waimai.platform.domain.core.poi.ActivityItem.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActivityItem createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0cde317d5826842e2551c9352612db1", RobustBitConfig.DEFAULT_VALUE) ? (ActivityItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0cde317d5826842e2551c9352612db1") : new ActivityItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityItem[] newArray(int i) {
            return new ActivityItem[i];
        }
    };
    public static final int RECEIVE_POI_COUPON = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("display_code")
    public int displayCode;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("info")
    public String info;
    @SerializedName("promotion_type")
    public int promotionType;
    @SerializedName("type")
    public int type;
    @SerializedName("use_icon_from_server")
    public int useIconFromServer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ActivityItem() {
    }

    public ActivityItem(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e173e81cd8f9fdf547a73ab76fcb252f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e173e81cd8f9fdf547a73ab76fcb252f");
            return;
        }
        this.type = parcel.readInt();
        this.info = parcel.readString();
        this.iconUrl = parcel.readString();
        this.useIconFromServer = parcel.readByte();
        this.displayCode = parcel.readInt();
        this.promotionType = parcel.readInt();
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public boolean isUseIconFromServer() {
        return this.useIconFromServer != 0;
    }

    public void setUseIconFromServer(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c5fca0ad3ea4709a7ff39b2c4ef7f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c5fca0ad3ea4709a7ff39b2c4ef7f3");
        } else {
            this.useIconFromServer = z ? 1 : 0;
        }
    }

    public int getDisplayCode() {
        return this.displayCode;
    }

    public void setDisplayCode(int i) {
        this.displayCode = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa886584656d29341455c8601d94fdb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa886584656d29341455c8601d94fdb5");
            return;
        }
        parcel.writeInt(this.type);
        parcel.writeString(this.info);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.useIconFromServer);
        parcel.writeInt(this.displayCode);
        parcel.writeInt(this.promotionType);
    }

    public void setPromotionType(int i) {
        this.promotionType = i;
    }

    public boolean isCouponType() {
        return this.promotionType == 1;
    }
}
