package com.sankuai.waimai.platform.domain.core.Share;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShareTip implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_id")
    @Expose
    public long activityId;
    private short channelFlag;
    @SerializedName("channels")
    @Expose
    public List<Integer> channels;
    private int channelsInteger;
    @Expose(deserialize = false, serialize = false)
    public String[] channelsString;
    private String cid;
    @SerializedName("description_icon")
    @Expose
    public String desIcon;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName(JsBridgeResult.ARG_KEY_SHARE_MINI_PROGRAM_ID)
    public String miniProgramId;
    public String miniProgramImage;
    public String miniProgramPath;
    private int miniprogramType;
    public boolean miniprogramWithShareTicket;
    @SerializedName("share_button_icon")
    @Expose
    public String shareButtonIcon;
    @SerializedName("share_info")
    @Expose
    public ShareInfo shareInfo;

    public String getChannels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e368883b6e758ef3bab7a278dc97607", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e368883b6e758ef3bab7a278dc97607");
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; this.channelsString != null && i < this.channelsString.length; i++) {
            jSONArray.put(this.channelsString[i]);
        }
        return jSONArray.toString();
    }

    public String getIcon() {
        return this.shareInfo == null ? "" : this.shareInfo.icon;
    }

    public String getTitle() {
        return this.shareInfo == null ? "" : this.shareInfo.title;
    }

    public String getContent() {
        return this.shareInfo == null ? "" : this.shareInfo.content;
    }

    public String getUrl() {
        return this.shareInfo == null ? "" : this.shareInfo.url;
    }

    public String getDescription() {
        return this.description;
    }

    public String getShareButtonIcon() {
        return this.shareButtonIcon;
    }

    public String getShareButtonDes() {
        return this.desIcon;
    }

    public long getActivityId() {
        return this.activityId;
    }

    public int getChannelsInteger() {
        return this.channelsInteger;
    }

    public short getChannelFlag() {
        return this.channelFlag;
    }

    public short setChannelFlag(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65d504edcf2ff4463efac5e3591ab485", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65d504edcf2ff4463efac5e3591ab485")).shortValue();
        }
        this.channelFlag = s;
        return s;
    }

    public String getWeixinUrl() {
        return this.shareInfo == null ? "" : this.shareInfo.weixinUrl;
    }

    public void setWeixinUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6f5f6bbf0ff8e1e9f6eaa7d807cb9ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6f5f6bbf0ff8e1e9f6eaa7d807cb9ef");
            return;
        }
        if (this.shareInfo == null) {
            this.shareInfo = new ShareInfo();
        }
        this.shareInfo.weixinUrl = str;
    }

    public void setIcon(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3958cfdc827e95fc76688c03656d2173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3958cfdc827e95fc76688c03656d2173");
            return;
        }
        if (this.shareInfo == null) {
            this.shareInfo = new ShareInfo();
        }
        this.shareInfo.icon = str;
    }

    public void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3faa5deb4ceb5d2eafd8c9149d178616", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3faa5deb4ceb5d2eafd8c9149d178616");
            return;
        }
        if (this.shareInfo == null) {
            this.shareInfo = new ShareInfo();
        }
        this.shareInfo.title = str;
    }

    public void setContent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "353071f0aa07092c8cf9f8f772e248bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "353071f0aa07092c8cf9f8f772e248bc");
            return;
        }
        if (this.shareInfo == null) {
            this.shareInfo = new ShareInfo();
        }
        this.shareInfo.content = str;
    }

    public void setUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16afe82a2c4f1388bf9249137a2dfcdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16afe82a2c4f1388bf9249137a2dfcdb");
            return;
        }
        if (this.shareInfo == null) {
            this.shareInfo = new ShareInfo();
        }
        this.shareInfo.url = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setShareButtonDes(String str) {
        this.desIcon = str;
    }

    public void setChannelsInteger(int i) {
        this.channelsInteger = i;
    }

    public String getMiniProgramId() {
        return this.miniProgramId;
    }

    public void setMiniProgramId(String str) {
        this.miniProgramId = str;
    }

    public String getMiniProgramPath() {
        return this.miniProgramPath;
    }

    public void setMiniProgramPath(String str) {
        this.miniProgramPath = str;
    }

    public String getMiniProgramImage() {
        return this.miniProgramImage;
    }

    public void setMiniProgramImage(String str) {
        this.miniProgramImage = str;
    }

    public int getMiniprogramType() {
        return this.miniprogramType;
    }

    public void setMiniprogramType(int i) {
        this.miniprogramType = i;
    }

    public boolean miniprogramWithShareTicket() {
        return this.miniprogramWithShareTicket;
    }

    public void setMiniprogramWithShareTicket(boolean z) {
        this.miniprogramWithShareTicket = z;
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public int getDimType() {
        return this.activityId > 0 ? 2 : 1;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b95ceb13ba3ab4be76409647eb32eb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b95ceb13ba3ab4be76409647eb32eb4");
            return;
        }
        try {
            this.miniProgramId = jSONObject.optString(JsBridgeResult.ARG_KEY_SHARE_MINI_PROGRAM_ID);
            this.shareButtonIcon = jSONObject.optString("share_button_icon");
            this.desIcon = jSONObject.optString("description_icon");
            this.description = jSONObject.optString("description");
            this.activityId = jSONObject.optLong("activity_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.channelFlag = (short) 0;
                this.channelsString = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.channelsString[i] = String.valueOf(optJSONArray.optInt(i));
                    switch (optJSONArray.optInt(i)) {
                        case 1:
                            this.channelFlag = (short) (this.channelFlag | 4);
                            break;
                        case 2:
                            this.channelFlag = (short) (this.channelFlag | 2);
                            break;
                        case 3:
                            this.channelFlag = (short) (this.channelFlag | 1);
                            break;
                        case 4:
                            this.channelFlag = (short) (this.channelFlag | 8);
                            break;
                    }
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("share_info");
            if (optJSONObject != null) {
                this.shareInfo = new ShareInfo();
                this.shareInfo.parseJson(optJSONObject);
            }
        } catch (Exception unused) {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class ShareInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_label")
        public List<String> activityLabels;
        @SerializedName("content")
        @Expose
        public String content;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        @Expose
        public String icon;
        @SerializedName("labels")
        public List<String> labels;
        @SerializedName("original_price")
        public double originalPrice;
        @SerializedName("price")
        public double price;
        @SerializedName("score")
        public double score;
        @SerializedName("sub_title")
        public String subTitle;
        @SerializedName("title")
        @Expose
        public String title;
        @SerializedName("url")
        @Expose
        public String url;
        @SerializedName("weixin_url")
        public String weixinUrl;

        public ShareInfo() {
        }

        public void parseJson(JSONObject jSONObject) {
            int i = 0;
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62064589fef98a99ed76afaa9fc394c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62064589fef98a99ed76afaa9fc394c0");
                return;
            }
            try {
                this.labels = new ArrayList();
                this.activityLabels = new ArrayList();
                this.icon = jSONObject.optString(RemoteMessageConst.Notification.ICON);
                this.title = jSONObject.optString("title");
                this.content = jSONObject.optString("content");
                this.url = jSONObject.optString("url");
                this.weixinUrl = jSONObject.optString("weixin_url");
                this.score = jSONObject.optDouble("score", -1.0d);
                this.subTitle = jSONObject.optString("sub_title");
                this.price = jSONObject.optDouble("price", -1.0d);
                this.originalPrice = jSONObject.optDouble("original_price", -1.0d);
                JSONArray optJSONArray = jSONObject.optJSONArray("labels");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i2 = 0; optJSONArray != null && i2 < optJSONArray.length(); i2++) {
                        this.labels.add(optJSONArray.optString(i2));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("activity_label");
                if (optJSONArray == null || optJSONArray2.length() <= 0) {
                    return;
                }
                while (optJSONArray2 != null) {
                    if (i >= optJSONArray2.length()) {
                        return;
                    }
                    this.activityLabels.add(optJSONArray2.optString(i));
                    i++;
                }
            } catch (Exception unused) {
            }
        }

        public String getContent() {
            return this.content;
        }

        public String getIcon() {
            return this.icon;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }

        public String getWeixinUrl() {
            return this.weixinUrl;
        }
    }

    public int getShareChannel() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "114e24d68eee372a4be65ac2503edaf7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "114e24d68eee372a4be65ac2503edaf7")).intValue();
        }
        if (this.channelFlag <= 0) {
            if (this.channelsInteger <= 0) {
                if (this.channels == null || this.channels.size() <= 0) {
                    return 0;
                }
                for (Integer num : this.channels) {
                    switch (num.intValue()) {
                        case 1:
                            i |= 4;
                            break;
                        case 2:
                            i |= 2;
                            break;
                        case 3:
                            i |= 1;
                            break;
                        case 4:
                            i |= 8;
                            break;
                    }
                }
                return i;
            }
            return this.channelsInteger;
        }
        return this.channelFlag;
    }
}
