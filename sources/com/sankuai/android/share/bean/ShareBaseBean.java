package com.sankuai.android.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.interfaces.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShareBaseBean implements Parcelable {
    public static final Parcelable.Creator<ShareBaseBean> CREATOR = new Parcelable.Creator<ShareBaseBean>() { // from class: com.sankuai.android.share.bean.ShareBaseBean.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBaseBean createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47bf465a70d0f8834d7f65362f4effc2", RobustBitConfig.DEFAULT_VALUE) ? (ShareBaseBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47bf465a70d0f8834d7f65362f4effc2") : new ShareBaseBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareBaseBean[] newArray(int i) {
            return new ShareBaseBean[i];
        }
    };
    public static final int TEMPLATE_DEAL = 1;
    public static final int TEMPLATE_HOTEL = 2;
    public static final int TEMPLATE_MOVIE = 3;
    public static final int TEMPLATE_NONE = -1;
    public static final int TEMPLATE_POI = 0;
    public static final int TYPE_MINI_PROGRAM_PREVIEW = 2;
    public static final int TYPE_MINI_PROGRAM_RELEASE = 0;
    public static final int TYPE_MINI_PROGRAM_TEST = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activityTitleString;
    private String appTransformshare;
    private String appshare;
    private String bg;
    private String bu;
    private HashMap<String, String> bubbleMap;
    private String cid;
    private String content;
    private String contentType;
    private String extra;
    private String extraImage;
    private String extraJumpUrl;
    private boolean imageType;
    private String imgUrl;
    private boolean isImageShare;
    private boolean isLocalImage;
    private ShareMgeParams mgeParams;
    private String miniProgramId;
    private MiniProgramBaseBean miniProgramInfo;
    private String miniProgramPath;
    private int miniProgramType;
    private String mmpshare;
    private String originTransformAppShare;
    private String password;
    private String passwordUrl;
    private String platform;
    private String pwConfigBtn;
    private int pwTemplateIndex;
    private String pwTemplateKey;
    private String shortUrl;
    private String source;
    private int templateType;
    private String title;
    private String toast;
    private String transformBu;
    private String transformCid;
    private String url;
    private boolean withShareTicket;
    private String wxTimeLineTitle;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MiniProgramType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Type {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isImageType() {
        return this.imageType;
    }

    public ShareBaseBean(String str, String str2) {
        this(str, str2, null);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91fa362ed2898228b424318abc00a826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91fa362ed2898228b424318abc00a826");
        }
    }

    public ShareBaseBean(String str, String str2, String str3) {
        this(str, str2, str3, (String) null);
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4a36aeeb77eef3dd468ea43a43f5728", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4a36aeeb77eef3dd468ea43a43f5728");
        }
    }

    public ShareBaseBean(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null);
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbd709834be6aa6b2c932b52cf7cb3ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbd709834be6aa6b2c932b52cf7cb3ee");
        }
    }

    public ShareBaseBean(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf156c537acc7a6a0d5021dad4f484f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf156c537acc7a6a0d5021dad4f484f2");
            return;
        }
        this.miniProgramType = 0;
        this.templateType = -1;
        this.bubbleMap = new HashMap<>();
        this.isImageShare = false;
        this.imgUrl = str;
        this.isLocalImage = z;
    }

    public ShareBaseBean(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f60f4eebec44e2ddde8e512626f337cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f60f4eebec44e2ddde8e512626f337cb");
            return;
        }
        this.miniProgramType = 0;
        this.templateType = -1;
        this.bubbleMap = new HashMap<>();
        this.isImageShare = false;
        this.title = str;
        this.content = str2;
        if (z) {
            this.shortUrl = str3;
        } else {
            this.url = str3;
        }
    }

    public ShareBaseBean(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b3c2bcfbe46808c60c201d7f12697da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b3c2bcfbe46808c60c201d7f12697da");
            return;
        }
        this.miniProgramType = 0;
        this.templateType = -1;
        this.bubbleMap = new HashMap<>();
        this.isImageShare = false;
        this.title = str;
        this.content = str2;
        this.url = str3;
        this.imgUrl = str4;
        setExtra(str5);
    }

    public String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e1f174ce6556a025aaddd93b7ec0c8c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e1f174ce6556a025aaddd93b7ec0c8c") : TextUtils.isEmpty(this.title) ? "" : this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69772e4118f78cf5537c4251f8e62814", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69772e4118f78cf5537c4251f8e62814") : TextUtils.isEmpty(this.content) ? "" : this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public String getTitle(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e98f2da60490b39de3a7d09c5ef1c86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e98f2da60490b39de3a7d09c5ef1c86");
        }
        if (aVar.equals(b.a.WEIXIN_CIRCLE) && hasWxTimeLineTitle()) {
            return getWxTimeLineTitle();
        }
        return getTitle();
    }

    public String getUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e156ee4bc3472de1e088d2a53259b11e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e156ee4bc3472de1e088d2a53259b11e");
        }
        if (!TextUtils.isEmpty(this.shortUrl)) {
            return this.shortUrl;
        }
        return getOriginUrl();
    }

    public String getOriginUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51cbf7a5a79bfebbe7d45ee644f7e499", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51cbf7a5a79bfebbe7d45ee644f7e499") : TextUtils.isEmpty(this.url) ? "" : this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String getImgUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed39f6702620a674e4becdb5c72af099", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed39f6702620a674e4becdb5c72af099") : TextUtils.isEmpty(this.imgUrl) ? "" : this.imgUrl;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public boolean isLocalImage() {
        return this.isLocalImage;
    }

    public void setLocalImage(boolean z) {
        this.isLocalImage = z;
    }

    public ShareMgeParams getMgeParams() {
        return this.mgeParams;
    }

    public void setMgeParams(ShareMgeParams shareMgeParams) {
        this.mgeParams = shareMgeParams;
    }

    public String getAppshare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c223c185a6221dba6211ea96f9c75fde", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c223c185a6221dba6211ea96f9c75fde") : TextUtils.isEmpty(this.appshare) ? "" : this.appshare;
    }

    public void setAppshare(String str) {
        this.appshare = str;
    }

    public String getTransFormAppshare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "522d1192c05c749578d8b3befc029ef9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "522d1192c05c749578d8b3befc029ef9") : TextUtils.isEmpty(this.appTransformshare) ? "" : this.appTransformshare;
    }

    public void setTransFormAppshare(String str) {
        this.appTransformshare = str;
    }

    public void setOriginTransformAppShare(String str) {
        this.originTransformAppShare = str;
    }

    public void setTransformBu(String str) {
        this.transformBu = str;
    }

    public String getTransformBu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d5b86b7d268a30bc42c31098e24330f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d5b86b7d268a30bc42c31098e24330f") : TextUtils.isEmpty(this.transformBu) ? "" : this.transformBu;
    }

    public String getOriginTransformAppShare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f36c921166cb2a47a84a78d2ba122257", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f36c921166cb2a47a84a78d2ba122257") : TextUtils.isEmpty(this.originTransformAppShare) ? "" : this.originTransformAppShare;
    }

    public void setTransformCid(String str) {
        this.transformCid = str;
    }

    public String getTransformCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "896046e41d82e9bd5ca928a5a8e705dd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "896046e41d82e9bd5ca928a5a8e705dd") : TextUtils.isEmpty(this.transformCid) ? "" : this.transformCid;
    }

    public String getMmpshare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30ad7717df64af673bf63bffa73f9a46", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30ad7717df64af673bf63bffa73f9a46") : TextUtils.isEmpty(this.mmpshare) ? "" : this.mmpshare;
    }

    public void setMmpshare(String str) {
        this.mmpshare = str;
    }

    public String getPlatform() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b348aab38b3731c9c7bcc552e036a336", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b348aab38b3731c9c7bcc552e036a336") : TextUtils.isEmpty(this.platform) ? "" : this.platform;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public String getSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bad4c32b4ce7bf61ae5432eb6e3d8cfb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bad4c32b4ce7bf61ae5432eb6e3d8cfb") : TextUtils.isEmpty(this.source) ? "" : this.source;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setImageShare(boolean z) {
        this.isImageShare = z;
    }

    public boolean isImageShare() {
        return this.isImageShare;
    }

    public ShareBaseBean(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "013aef163bbb17a9a31324a7f4ca5a37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "013aef163bbb17a9a31324a7f4ca5a37");
            return;
        }
        this.miniProgramType = 0;
        this.templateType = -1;
        this.bubbleMap = new HashMap<>();
        this.isImageShare = false;
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.url = parcel.readString();
        this.imgUrl = parcel.readString();
        this.shortUrl = parcel.readString();
        this.wxTimeLineTitle = parcel.readString();
        this.isLocalImage = parcel.readByte() != 0;
        this.miniProgramId = parcel.readString();
        this.miniProgramPath = parcel.readString();
        this.miniProgramType = parcel.readInt();
        this.bg = parcel.readString();
        this.bu = parcel.readString();
        this.contentType = parcel.readString();
        this.cid = parcel.readString();
        this.mgeParams = (ShareMgeParams) parcel.readParcelable(ShareMgeParams.class.getClassLoader());
        this.miniProgramInfo = (MiniProgramBaseBean) parcel.readParcelable(MiniProgramBaseBean.class.getClassLoader());
        this.templateType = parcel.readInt();
        this.extra = parcel.readString();
        this.extraImage = parcel.readString();
        this.extraJumpUrl = parcel.readString();
        this.appshare = parcel.readString();
        this.mmpshare = parcel.readString();
        this.bubbleMap = parcel.readHashMap(HashMap.class.getClassLoader());
        this.activityTitleString = parcel.readString();
        this.passwordUrl = parcel.readString();
        this.password = parcel.readString();
        this.toast = parcel.readString();
        this.pwTemplateKey = parcel.readString();
        this.pwTemplateIndex = parcel.readInt();
        this.pwConfigBtn = parcel.readString();
        this.platform = parcel.readString();
        this.source = parcel.readString();
        this.withShareTicket = parcel.readByte() != 0;
        this.isImageShare = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90a8610a9fd34de1bf75a9576e5d045b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90a8610a9fd34de1bf75a9576e5d045b");
            return;
        }
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.url);
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.shortUrl);
        parcel.writeString(this.wxTimeLineTitle);
        parcel.writeByte(this.isLocalImage ? (byte) 1 : (byte) 0);
        parcel.writeString(this.miniProgramId);
        parcel.writeString(this.miniProgramPath);
        parcel.writeInt(this.miniProgramType);
        parcel.writeString(this.bg);
        parcel.writeString(this.bu);
        parcel.writeString(this.contentType);
        parcel.writeString(this.cid);
        parcel.writeParcelable(this.mgeParams, i);
        parcel.writeParcelable(this.miniProgramInfo, i);
        parcel.writeInt(this.templateType);
        parcel.writeString(this.extra);
        parcel.writeString(this.extraImage);
        parcel.writeString(this.extraJumpUrl);
        parcel.writeString(this.appshare);
        parcel.writeString(this.mmpshare);
        parcel.writeMap(this.bubbleMap);
        parcel.writeString(this.activityTitleString);
        parcel.writeString(this.passwordUrl);
        parcel.writeString(this.password);
        parcel.writeString(this.toast);
        parcel.writeString(this.pwTemplateKey);
        parcel.writeInt(this.pwTemplateIndex);
        parcel.writeString(this.pwConfigBtn);
        parcel.writeString(this.platform);
        parcel.writeString(this.source);
        parcel.writeByte(this.withShareTicket ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isImageShare ? (byte) 1 : (byte) 0);
    }

    public boolean isWithShareTicket() {
        return this.withShareTicket;
    }

    public void setWithShareTicket(boolean z) {
        this.withShareTicket = z;
    }

    public void setShortUrl(String str) {
        this.shortUrl = str;
    }

    public boolean hasShortUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0baac8ba16a12e41bf4580489481a8e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0baac8ba16a12e41bf4580489481a8e8")).booleanValue() : !TextUtils.isEmpty(this.shortUrl);
    }

    public String getWxTimeLineTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4766ff0aaea6d0291d023a4898e3b57", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4766ff0aaea6d0291d023a4898e3b57") : TextUtils.isEmpty(this.wxTimeLineTitle) ? "" : this.wxTimeLineTitle;
    }

    public void setWxTimeLineTitle(String str) {
        this.wxTimeLineTitle = str;
    }

    public boolean hasWxTimeLineTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9c5d44cf19e0b818635c2ba7b19f25f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9c5d44cf19e0b818635c2ba7b19f25f")).booleanValue() : !TextUtils.isEmpty(this.wxTimeLineTitle);
    }

    public String getMiniProgramPath() {
        return this.miniProgramPath;
    }

    public void setMiniProgramPath(String str) {
        this.miniProgramPath = str;
    }

    public MiniProgramBaseBean getMiniProgramInfo() {
        return this.miniProgramInfo;
    }

    public void setMiniProgramInfo(MiniProgramBaseBean miniProgramBaseBean) {
        this.miniProgramInfo = miniProgramBaseBean;
    }

    public int getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(int i) {
        this.templateType = i;
    }

    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public void setMiniProgramId(String str) {
        this.miniProgramId = str;
    }

    public int getMiniProgramType() {
        return this.miniProgramType;
    }

    public void setMiniProgramType(int i) {
        this.miniProgramType = i;
    }

    public void setBg(String str) {
        this.bg = str;
    }

    public String getBg() {
        return this.bg;
    }

    public void setBu(String str) {
        this.bu = str;
    }

    public String getBu() {
        return this.bu;
    }

    public String getCid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c9e2e092c5834d53f1e06db5188090e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c9e2e092c5834d53f1e06db5188090e") : TextUtils.isEmpty(this.cid) ? "" : this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d5211109b5e67b7583535ca28d71fde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d5211109b5e67b7583535ca28d71fde");
            return;
        }
        this.extra = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("image")) {
                this.extraImage = jSONObject.getString("image");
            }
            if (jSONObject.has("cid")) {
                this.cid = jSONObject.getString("cid");
            }
            if (jSONObject.has(DMKeys.KEY_JUMP_URL)) {
                this.extraJumpUrl = jSONObject.getString(DMKeys.KEY_JUMP_URL);
            }
            if (jSONObject.has("bubble")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("bubble");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.bubbleMap.put(next, jSONObject2.get(next).toString());
                }
            }
            if (jSONObject.has("activityTitleString")) {
                this.activityTitleString = jSONObject.getString("activityTitleString");
            }
            if (jSONObject.has("passwordURL")) {
                this.passwordUrl = jSONObject.getString("passwordURL");
            }
            if (jSONObject.has("password")) {
                this.password = jSONObject.getString("password");
            }
            if (jSONObject.has("toast")) {
                this.toast = jSONObject.getString("toast");
            }
            if (jSONObject.has("pwTemplateKey")) {
                this.pwTemplateKey = jSONObject.getString("pwTemplateKey");
            }
            if (jSONObject.has("pwTemplateIndex")) {
                this.pwTemplateIndex = jSONObject.getInt("pwTemplateIndex");
            }
            if (jSONObject.has("pwConfigBtn")) {
                this.pwConfigBtn = jSONObject.getString("pwConfigBtn");
            }
        } catch (JSONException unused) {
        }
    }

    public String getExtraImage() {
        return this.extraImage;
    }

    public String getExtraJumpUrl() {
        return this.extraJumpUrl;
    }

    public void setExtraImage(String str) {
        this.extraImage = str;
    }

    public void setExtraJumpUrl(String str) {
        this.extraJumpUrl = str;
    }

    public HashMap<String, String> getBubbleMap() {
        return this.bubbleMap;
    }

    public void setBubbleMap(HashMap<String, String> hashMap) {
        this.bubbleMap = hashMap;
    }

    public String getActivityTitleString() {
        return this.activityTitleString;
    }

    public void setActivityTitleString(String str) {
        this.activityTitleString = str;
    }

    public String getPasswordUrl() {
        return this.passwordUrl;
    }

    public void setPasswordUrl(String str) {
        this.passwordUrl = str;
    }

    public String getPassword() {
        return this.password;
    }

    public String getToast() {
        return this.toast;
    }

    public String getPwTemplateKey() {
        return this.pwTemplateKey;
    }

    public void setPwTemplateKey(String str) {
        this.pwTemplateKey = str;
    }

    public int getPwTemplateIndex() {
        return this.pwTemplateIndex;
    }

    public void setPwTemplateIndex(int i) {
        this.pwTemplateIndex = i;
    }

    public String getPwConfigBtn() {
        return this.pwConfigBtn;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setToast(String str) {
        this.toast = str;
    }

    public void setPwConfigBtn(String str) {
        this.pwConfigBtn = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0ba49530d6a8dc34e9bd9dfe1051fb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0ba49530d6a8dc34e9bd9dfe1051fb7");
        }
        return "ShareBaseBean{title=" + this.title + ", content=" + this.content + ", url=" + this.url + ", imgUrl=" + this.imgUrl + ", isLocalImage=" + this.isLocalImage + ", shortUrl=" + this.shortUrl + ", wxTimeLineTitle=" + this.wxTimeLineTitle + ", miniProgramPath=" + this.miniProgramPath + ", miniProgramId=" + this.miniProgramId + ", miniProgramType=" + this.miniProgramType + ", bg=" + this.bg + ", bu=" + this.bu + ", contentType=" + this.contentType + ", cid=" + this.cid + ", templateType=" + this.templateType + ", extra=" + this.extra + ", extraImage=" + this.extraImage + ", extraJumpUrl=" + this.extraJumpUrl + ", activityTitleString=" + this.activityTitleString + ", appshare=" + this.appshare + ", mmpshare=" + this.mmpshare + ", passwordUrl=" + this.passwordUrl + ", password=" + this.password + ", toast=" + this.toast + ", pwTemplateKey=" + this.pwTemplateKey + ", pwTemplateIndex=" + this.pwTemplateIndex + ", pwConfigBtn=" + this.pwConfigBtn + ", platform=" + this.platform + ", source=" + this.source + '}';
    }
}
