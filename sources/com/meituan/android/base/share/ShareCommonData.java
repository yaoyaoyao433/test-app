package com.meituan.android.base.share;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ShareCommonData implements Parcelable {
    public static final Parcelable.Creator<ShareCommonData> CREATOR = new Parcelable.Creator<ShareCommonData>() { // from class: com.meituan.android.base.share.ShareCommonData.1
        public static ChangeQuickRedirect a;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareCommonData createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba291d9da37b82971e308c557ee26344", RobustBitConfig.DEFAULT_VALUE) ? (ShareCommonData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba291d9da37b82971e308c557ee26344") : new ShareCommonData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareCommonData[] newArray(int i) {
            return new ShareCommonData[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private String channel;
    private String cid;
    private String content;
    private String content_1;
    private String content_128;
    private String content_256;
    private String content_32;
    private String content_512;
    private String content_64;
    private String content_8;
    private String detailURL;
    private String ieic;
    private String imageURL;
    private String title;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareCommonData() {
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setContent_1(String str) {
        this.content_1 = str;
    }

    public void setContent_8(String str) {
        this.content_8 = str;
    }

    public void setContent_32(String str) {
        this.content_32 = str;
    }

    public void setContent_64(String str) {
        this.content_64 = str;
    }

    public void setContent_128(String str) {
        this.content_128 = str;
    }

    public void setContent_256(String str) {
        this.content_256 = str;
    }

    public void setContent_512(String str) {
        this.content_512 = str;
    }

    public void setDetailURL(String str) {
        this.detailURL = str;
    }

    public void setImageURL(String str) {
        this.imageURL = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setIeic(String str) {
        this.ieic = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getContent_1() {
        return this.content_1;
    }

    public String getContent_8() {
        return this.content_8;
    }

    public String getContent_32() {
        return this.content_32;
    }

    public String getContent_64() {
        return this.content_64;
    }

    public String getContent_128() {
        return this.content_128;
    }

    public String getContent_256() {
        return this.content_256;
    }

    public String getContent_512() {
        return this.content_512;
    }

    public String getDetailURL() {
        return this.detailURL;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getIeic() {
        return this.ieic;
    }

    public String getCid() {
        return this.cid;
    }

    public ShareCommonData(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80d3bea8aadb0ec9276ddee3834b7a44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80d3bea8aadb0ec9276ddee3834b7a44");
            return;
        }
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.content_1 = parcel.readString();
        this.content_8 = parcel.readString();
        this.content_32 = parcel.readString();
        this.content_64 = parcel.readString();
        this.content_128 = parcel.readString();
        this.content_256 = parcel.readString();
        this.content_512 = parcel.readString();
        this.detailURL = parcel.readString();
        this.imageURL = parcel.readString();
        this.channel = parcel.readString();
        this.ieic = parcel.readString();
        this.cid = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d10945652dde4a76ffdab236fa6541c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d10945652dde4a76ffdab236fa6541c5");
            return;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.content_1);
        parcel.writeString(this.content_8);
        parcel.writeString(this.content_32);
        parcel.writeString(this.content_64);
        parcel.writeString(this.content_128);
        parcel.writeString(this.content_256);
        parcel.writeString(this.content_512);
        parcel.writeString(this.detailURL);
        parcel.writeString(this.imageURL);
        parcel.writeString(this.channel);
        parcel.writeString(this.ieic);
        parcel.writeString(this.cid);
    }
}
