package com.sankuai.waimai.store.platform.domain.core.poi;

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
    public static final Parcelable.Creator<ActivityItem> CREATOR = new Parcelable.Creator<ActivityItem>() { // from class: com.sankuai.waimai.store.platform.domain.core.poi.ActivityItem.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActivityItem createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d30b0f6c6c7ebe6237277baaed1c5c40", RobustBitConfig.DEFAULT_VALUE) ? (ActivityItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d30b0f6c6c7ebe6237277baaed1c5c40") : new ActivityItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityItem[] newArray(int i) {
            return new ActivityItem[i];
        }
    };
    public static final int RECEIVE_POI_COUPON = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public String activityId;
    @SerializedName("sg_capi_scheme")
    public String apiScheme;
    @SerializedName("display_code")
    public int displayCode;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("info")
    public String info;
    public long poiId;
    public String poiIdStr;
    @SerializedName("promotion_type")
    public int promotionType;
    public String schemeUrl;
    public long spuId;
    @SerializedName("tag_id")
    public String tagId;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b283b7495f89102229faa5b8192cc978", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b283b7495f89102229faa5b8192cc978");
            return;
        }
        this.type = parcel.readInt();
        this.info = parcel.readString();
        this.iconUrl = parcel.readString();
        this.useIconFromServer = parcel.readByte();
        this.displayCode = parcel.readInt();
        this.promotionType = parcel.readInt();
        this.tagId = parcel.readString();
        this.schemeUrl = parcel.readString();
        this.poiId = parcel.readLong();
        this.poiIdStr = parcel.readString();
        this.spuId = parcel.readLong();
        this.activityId = parcel.readString();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "130cf998ebe479cdf449ec4113c47373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "130cf998ebe479cdf449ec4113c47373");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "031ded2a83a1de0cc379e2f2b5aa01cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "031ded2a83a1de0cc379e2f2b5aa01cc");
            return;
        }
        parcel.writeInt(this.type);
        parcel.writeString(this.info);
        parcel.writeString(this.iconUrl);
        parcel.writeInt(this.useIconFromServer);
        parcel.writeInt(this.displayCode);
        parcel.writeInt(this.promotionType);
        parcel.writeString(this.tagId);
        parcel.writeString(this.schemeUrl);
        parcel.writeLong(this.poiId);
        parcel.writeString(this.poiIdStr);
        parcel.writeLong(this.spuId);
        parcel.writeString(this.activityId);
    }

    public void setPromotionType(int i) {
        this.promotionType = i;
    }

    public void setTagId(String str) {
        this.tagId = str;
    }

    public boolean isCouponType() {
        return this.promotionType == 1;
    }
}
