package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Porcelain implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("acrossLabel")
    public AcrossLabel acrossLabel;
    @SerializedName("activityId")
    public String activityId;
    @SerializedName("bgPic")
    public String bgPic;
    private boolean bigCard;
    @SerializedName("blockId")
    public String blockId;
    @SerializedName("blockPromotion")
    public BlockPromotion blockPromotion;
    @SerializedName("blockType")
    public int blockType;
    private boolean fullShow;
    @SerializedName("h5Url")
    public String h5Url;
    @SerializedName("picImage")
    public String picImage;
    @SerializedName("skus")
    public List<Sku> skus;
    @SerializedName("subTitle")
    public String subTitle;
    @SerializedName("subTitleColor")
    public String subTitleColor;
    @SerializedName("title")
    public String title;
    @SerializedName("titleColor")
    public String titleColor;
    @SerializedName("titleIcon")
    public String titleIcon;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class AcrossLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("frontPicture")
        public String frontPicture;
        @SerializedName("frontText")
        public String frontText;
        @SerializedName("lastText")
        public String lastText;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class BlockPromotion implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bigBgPic")
        public String bigBgPic;
        @SerializedName("darkColor")
        public String darkColor;
        @SerializedName("lightColor")
        public String lightColor;
        @SerializedName("smallBgPic")
        public String smallBgPic;
        @SerializedName("superBgPic")
        public String superBgPic;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Sku implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("labelInfo")
        public AcrossLabel labelInfo;
        @SerializedName("picture")
        public String picture;
        @SerializedName("poiId")
        public String poiId;
        @SerializedName("skuId")
        public String skuId;
    }

    public boolean isBigCard() {
        return this.bigCard;
    }

    public void setBigCard(boolean z) {
        this.bigCard = z;
    }

    public boolean isFullShow() {
        return this.fullShow;
    }

    public void setFullShow(boolean z) {
        this.fullShow = z;
    }
}
