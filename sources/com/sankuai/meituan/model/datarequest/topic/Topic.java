package com.sankuai.meituan.model.datarequest.topic;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.model.NoProguard;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.io.Serializable;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public class Topic implements Serializable {
    public static final int BUSSINESS_CAT_AROUND_TRAVEL = 195;
    public static final int BUSSINESS_CAT_DEFAULT = 0;
    public static final int BUSSINESS_CAT_FOOD = 1;
    public static final int BUSSINESS_CAT_HOTEL = 20;
    public static final int BUSSINESS_CAT_MOVIE = 99;
    public static final int BUSSINESS_CAT_SHOPPING = 4;
    public static final int BUSSINESS_CAT_TAKEOUT = 394;
    public static final int BUSSINESS_CAT_TRAVEL = 78;
    public static final int TYPE_AD = 4;
    public static final int TYPE_BUWEI = 3;
    public static final int TYPE_DEAL = 0;
    public static final int TYPE_POI = 2;
    public static final int TYPE_WEB = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int bussinessCate;
    private String clickUrl;
    private String deputy_typeface_color;
    private String deputytitle;
    private String frontimgurl;
    private long id;
    String imageurl;
    private String impUrl;
    @SerializedName(ShowLogJsHandler.PARAM_NAME_MODULE)
    private boolean isTopicModule;
    private String maintitle;
    @SerializedName("listType")
    private int moduleType;
    private String monitorClickUrl;
    private String monitorImpUrl;
    private String newimageurl;
    private int position;
    private String rule;
    private Share share;
    private int showNewIcon;
    private int solds;
    private String subtitle;
    private String title;
    private String tplurl;
    private int type;
    private String typeface_color;

    /* compiled from: ProGuard */
    @NoProguard
    /* loaded from: classes4.dex */
    public static class Share implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String message;
        public String url;
    }
}
