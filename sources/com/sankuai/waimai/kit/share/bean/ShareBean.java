package com.sankuai.waimai.kit.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShareBean implements Parcelable {
    public static final Parcelable.Creator<ShareBean> CREATOR = new Parcelable.Creator<ShareBean>() { // from class: com.sankuai.waimai.kit.share.bean.ShareBean.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBean createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7ce5de66a6d4eb32a32001a3083116a", RobustBitConfig.DEFAULT_VALUE) ? (ShareBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7ce5de66a6d4eb32a32001a3083116a") : new ShareBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBean[] newArray(int i) {
            return new ShareBean[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activityName;
    private int channel;
    private String content;
    private int dimType;
    private String imagePath;
    private String imgUrl;
    private boolean isLocalImage;
    private boolean isMiniProgramLocalImage;
    private String miniProgramId;
    private String miniProgramPath;
    private boolean miniProgramWithShareTicket;
    private int miniprogramType;
    private String orderId;
    private String packageName;
    private String shortUrl;
    private int sourceId;
    private String title;
    private String url;
    private String wxTimeLineTitle;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ShareBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58d25dd7abaad6ae7b7fba2f8e3a1614", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58d25dd7abaad6ae7b7fba2f8e3a1614");
        } else {
            this.dimType = 1;
        }
    }

    public ShareBean(String str, String str2) {
        this(str, str2, null);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cb9fa0be107130aaa275cc2f831ad37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cb9fa0be107130aaa275cc2f831ad37");
        }
    }

    public ShareBean(String str, String str2, String str3) {
        this(str, str2, str3, null);
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c47204e1ae6725155f1a185e1adf57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c47204e1ae6725155f1a185e1adf57");
        }
    }

    public ShareBean(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ef1b544b838023a9ab9931cef7ce626", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ef1b544b838023a9ab9931cef7ce626");
            return;
        }
        this.dimType = 1;
        this.title = str;
        this.content = str2;
        this.url = str3;
        this.imgUrl = str4;
    }

    public String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd6318bf18a836a1d09aa2cd71515598", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd6318bf18a836a1d09aa2cd71515598") : TextUtils.isEmpty(this.title) ? "" : this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d5e8259ed2c089cfd815349cbbf00dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d5e8259ed2c089cfd815349cbbf00dd") : TextUtils.isEmpty(this.content) ? "" : this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21511a5b4417a6f460dbb995d4068fab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21511a5b4417a6f460dbb995d4068fab");
        }
        if (!TextUtils.isEmpty(this.shortUrl)) {
            return this.shortUrl;
        }
        return getOriginUrl();
    }

    public String getOriginUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "970d575590ec97b1503b6017f03b47fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "970d575590ec97b1503b6017f03b47fe") : TextUtils.isEmpty(this.url) ? "" : this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getImgUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "922c20ab38afd29487d076be0ee6dd7d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "922c20ab38afd29487d076be0ee6dd7d") : TextUtils.isEmpty(this.imgUrl) ? "" : this.imgUrl;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public boolean isLocalImage() {
        return this.isLocalImage;
    }

    public boolean isMiniProgramLocalImage() {
        return this.isMiniProgramLocalImage;
    }

    public void setLocalImage(boolean z) {
        this.isLocalImage = z;
    }

    public void setMiniProgramLocalImage(boolean z) {
        this.isMiniProgramLocalImage = z;
    }

    public boolean miniProgramWithShareTicket() {
        return this.miniProgramWithShareTicket;
    }

    public void setMiniProgramWithShareTicket(boolean z) {
        this.miniProgramWithShareTicket = z;
    }

    public ShareBean(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a812655c480867727c602cbbc616ceef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a812655c480867727c602cbbc616ceef");
            return;
        }
        this.dimType = 1;
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.url = parcel.readString();
        this.imgUrl = parcel.readString();
        this.channel = parcel.readInt();
        this.dimType = parcel.readInt();
        this.sourceId = parcel.readInt();
        this.orderId = parcel.readString();
        this.shortUrl = parcel.readString();
        this.wxTimeLineTitle = parcel.readString();
        this.activityName = parcel.readString();
        this.packageName = parcel.readString();
        this.isLocalImage = parcel.readByte() != 0;
        this.miniProgramId = parcel.readString();
        this.miniProgramPath = parcel.readString();
        this.miniprogramType = parcel.readInt();
        this.isMiniProgramLocalImage = parcel.readByte() != 0;
        this.miniProgramWithShareTicket = parcel.readByte() != 0;
        this.imagePath = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84b42dd67039e327069901ea7d3837e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84b42dd67039e327069901ea7d3837e0");
            return;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.url);
        parcel.writeString(this.imgUrl);
        parcel.writeInt(this.channel);
        parcel.writeInt(this.dimType);
        parcel.writeInt(this.sourceId);
        parcel.writeString(this.orderId);
        parcel.writeString(this.shortUrl);
        parcel.writeString(this.wxTimeLineTitle);
        parcel.writeString(this.activityName);
        parcel.writeString(this.packageName);
        parcel.writeByte(this.isLocalImage ? (byte) 1 : (byte) 0);
        parcel.writeString(this.miniProgramId);
        parcel.writeString(this.miniProgramPath);
        parcel.writeInt(this.miniprogramType);
        parcel.writeByte(this.isMiniProgramLocalImage ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.miniProgramWithShareTicket ? (byte) 1 : (byte) 0);
        parcel.writeString(this.imagePath);
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int i) {
        this.channel = i;
    }

    public int getDimType() {
        return this.dimType;
    }

    public void setDimType(int i) {
        this.dimType = i;
    }

    public int getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(int i) {
        this.sourceId = i;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setShortUrl(String str) {
        this.shortUrl = str;
    }

    public String getShortUrl() {
        return this.shortUrl;
    }

    public boolean hasShortUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea72fcd940a82679dd956bbc09d17369", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea72fcd940a82679dd956bbc09d17369")).booleanValue() : !TextUtils.isEmpty(this.shortUrl);
    }

    public String getWxTimeLineTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5d838a1f9684ef4439f290cced4cc46", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5d838a1f9684ef4439f290cced4cc46") : TextUtils.isEmpty(this.wxTimeLineTitle) ? "" : this.wxTimeLineTitle;
    }

    public void setWxTimeLineTitle(String str) {
        this.wxTimeLineTitle = str;
    }

    public boolean hasWxTimeLineTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74bc1835bbe5b8729d16e9ad46c03c22", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74bc1835bbe5b8729d16e9ad46c03c22")).booleanValue() : !TextUtils.isEmpty(this.wxTimeLineTitle);
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String getActivityName() {
        return this.activityName;
    }

    public void setActivityName(String str) {
        this.activityName = str;
    }

    public String getMiniProgramPath() {
        return this.miniProgramPath;
    }

    public void setMiniProgramPath(String str) {
        this.miniProgramPath = str;
    }

    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public void setMiniProgramId(String str) {
        this.miniProgramId = str;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String str) {
        this.imagePath = str;
    }

    public int getMiniprogramType() {
        return this.miniprogramType;
    }

    public void setMiniprogramType(int i) {
        this.miniprogramType = i;
    }
}
