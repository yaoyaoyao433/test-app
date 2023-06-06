package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGIMGoodsListData extends SGIMRobotPraiseData {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1821320059939961516L;
    public boolean isShowMore;
    public long mPoiId;
    @SerializedName("products")
    public IMProductInfo mProductInfo;
    public String msgId;
    @SerializedName("subType")
    public int subType;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class IMProductInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("productsRecommendTip")
        public String productsRecommendTip;
        @SerializedName("productsRecommendTitle")
        public String productsRecommendTitle;
        @SerializedName("spuList")
        public ArrayList<IMProductSpu> spus;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class IMProductSpu {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("jumpLink")
            public String jumpLink;
            @SerializedName("monthlySale")
            public String monthlySale;
            @SerializedName("poiId")
            public String poiId;
            @SerializedName("spuAmount")
            public String spuAmount;
            @SerializedName("spuId")
            public String spuId;
            @SerializedName("spuName")
            public String spuName;
            @SerializedName("spuOriginalAmount")
            public String spuOriginalAmount;
            @SerializedName("spuPic")
            public String spuPic;
            @SerializedName("spuSpecifications")
            public String spuSpecifications;
        }
    }
}
