package com.sankuai.android.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MiniProgramBaseBean implements Parcelable {
    public static final Parcelable.Creator<MiniProgramBaseBean> CREATOR = new Parcelable.Creator<MiniProgramBaseBean>() { // from class: com.sankuai.android.share.bean.MiniProgramBaseBean.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MiniProgramBaseBean createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3940c338eac6d9c4aafa2ed70451686", RobustBitConfig.DEFAULT_VALUE) ? (MiniProgramBaseBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3940c338eac6d9c4aafa2ed70451686") : new MiniProgramBaseBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MiniProgramBaseBean[] newArray(int i) {
            return new MiniProgramBaseBean[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public String addressName;
    public String dealGroupName;
    public String dealGroupPrice;
    public String dealMarketPrice;
    public String dealPoiName;
    public String filmName;
    public String filmType;
    public String hotelArea;
    public String hotelDescription;
    public String hotelLevel;
    public String hotelScore;
    public String imageUrl;
    public String landMarkName;
    public String movieDuration;
    public String movieLanguageType;
    public String movieName;
    public String moviePlayTime;
    public String moviePlayer;
    public String movieScoreOrHeat;
    public String poiCategory;
    public String poiPerPrice;
    public String poiPhone;
    public float poiStar;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96b2a59f151407ad7a4b01d0cdd79ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96b2a59f151407ad7a4b01d0cdd79ddf");
            return;
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.addressName);
        parcel.writeString(this.landMarkName);
        parcel.writeFloat(this.poiStar);
        parcel.writeString(this.poiPerPrice);
        parcel.writeString(this.poiCategory);
        parcel.writeString(this.poiPhone);
        parcel.writeString(this.dealPoiName);
        parcel.writeString(this.dealGroupName);
        parcel.writeString(this.dealGroupPrice);
        parcel.writeString(this.dealMarketPrice);
        parcel.writeString(this.hotelScore);
        parcel.writeString(this.hotelDescription);
        parcel.writeString(this.hotelLevel);
        parcel.writeString(this.hotelArea);
        parcel.writeString(this.filmName);
        parcel.writeString(this.movieScoreOrHeat);
        parcel.writeString(this.moviePlayer);
        parcel.writeString(this.movieDuration);
        parcel.writeString(this.filmType);
        parcel.writeString(this.movieName);
        parcel.writeString(this.moviePlayTime);
        parcel.writeString(this.movieLanguageType);
    }

    public MiniProgramBaseBean() {
    }

    public MiniProgramBaseBean(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1799c27bf87b598e7181ff94c026581d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1799c27bf87b598e7181ff94c026581d");
            return;
        }
        this.imageUrl = parcel.readString();
        this.addressName = parcel.readString();
        this.landMarkName = parcel.readString();
        this.poiStar = parcel.readFloat();
        this.poiPerPrice = parcel.readString();
        this.poiCategory = parcel.readString();
        this.poiPhone = parcel.readString();
        this.dealPoiName = parcel.readString();
        this.dealGroupName = parcel.readString();
        this.dealGroupPrice = parcel.readString();
        this.dealMarketPrice = parcel.readString();
        this.hotelScore = parcel.readString();
        this.hotelDescription = parcel.readString();
        this.hotelLevel = parcel.readString();
        this.hotelArea = parcel.readString();
        this.filmName = parcel.readString();
        this.movieScoreOrHeat = parcel.readString();
        this.moviePlayer = parcel.readString();
        this.movieDuration = parcel.readString();
        this.filmType = parcel.readString();
        this.movieName = parcel.readString();
        this.moviePlayTime = parcel.readString();
        this.movieLanguageType = parcel.readString();
    }
}
