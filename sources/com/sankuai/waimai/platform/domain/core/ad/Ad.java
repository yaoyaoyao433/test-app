package com.sankuai.waimai.platform.domain.core.ad;

import android.support.annotation.Keep;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Ad implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activityId")
    private int activityId;
    @SerializedName("ad_extra")
    private a adExtra;
    private b adShowContent;
    @SerializedName("banner_act_id")
    private long ad_id;
    @SerializedName("default_template_id")
    public String defaultTemplateId;
    @SerializedName("extra_data")
    private LogData extraData;
    @SerializedName("h5_url")
    private String h5_url;
    private boolean isSelfRefreshAd;
    private int machAdSign;
    @SerializedName("banner_pic_url")
    private String pic_url;
    @SerializedName("provider_type")
    private int providerType;
    private d qualificationRule;
    @SerializedName("show_content")
    private String showContentStr;
    @SerializedName("show_type")
    private int showType;
    @SerializedName("template_id")
    public String templateId;
    @SerializedName("json_string")
    public String templateJson;
    @SerializedName("template_type")
    public int templateType;
    @SerializedName("type")
    private int type;
    @SerializedName("ys")
    private int ys;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LogData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("activity_id_weien")
        public int activityIdWeien;
        @SerializedName("activity_type")
        public int activityType;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName("ad_type")
        public int a;
        @SerializedName("ad_charge_info")
        public String b;
        @SerializedName("banner_id")
        public long c;
        @SerializedName("banner_type")
        public int d;
        @SerializedName("banner_name")
        public String e;
        @SerializedName("wm_poi_id")
        public long f;
        @SerializedName("monitor_imp_url")
        public String g;
        @SerializedName("monitor_click_url")
        public String h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class d implements Serializable {
        @SerializedName("title")
        public String a;
        @SerializedName("click_url")
        public String b;
    }

    public Ad() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70e128871984b10026842647e892eaf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70e128871984b10026842647e892eaf7");
        } else {
            this.machAdSign = -1;
        }
    }

    public int getActivityIdWeien() {
        if (this.extraData != null) {
            return this.extraData.activityIdWeien;
        }
        return 0;
    }

    public int getActivityType() {
        if (this.extraData != null) {
            return this.extraData.activityType;
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName("subTitle")
        public c b;
        @SerializedName("mainTitle")
        public c c;
        public String d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa079bfc348040fcdc2ed7f9a17ba2ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa079bfc348040fcdc2ed7f9a17ba2ff");
            } else {
                this.d = "";
            }
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705bcf0e061a43ec71bf8b942d8c7d44", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705bcf0e061a43ec71bf8b942d8c7d44");
            }
            return "mainTitle=" + this.c + ",subTitle=" + this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c implements Serializable {
        public static ChangeQuickRedirect a;
        @SerializedName(DynamicTitleParser.PARSER_KEY_FONT_COLOR)
        public String b;
        @SerializedName("fontSize")
        public int c;
        @SerializedName("text")
        public String d;
        @SerializedName("locationX")
        public float e;
        @SerializedName("locationY")
        public float f;
        @SerializedName("imgH")
        public int g;
        @SerializedName("imgW")
        public int h;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d7c497d2540f097248a11e46eda761", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d7c497d2540f097248a11e46eda761");
            }
            return CommonConstant.Symbol.BIG_BRACKET_LEFT + this.b + CommonConstant.Symbol.COMMA + this.c + CommonConstant.Symbol.COMMA + this.d + CommonConstant.Symbol.COMMA + this.e + CommonConstant.Symbol.COMMA + this.f + CommonConstant.Symbol.COMMA + this.g + CommonConstant.Symbol.COMMA + this.h + '}';
        }
    }

    public String getPic_url() {
        return this.pic_url;
    }

    public void setPic_url(String str) {
        this.pic_url = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public long getAd_id() {
        return this.ad_id;
    }

    public void setAd_id(long j) {
        this.ad_id = j;
    }

    public String getH5_url() {
        return this.h5_url;
    }

    public void setH5_url(String str) {
        this.h5_url = str;
    }

    public int getProviderType() {
        return this.providerType;
    }

    public void setProviderType(int i) {
        this.providerType = i;
    }

    public void setYs(int i) {
        this.ys = i;
    }

    public void setActivityId(int i) {
        this.activityId = i;
    }

    public int getYs() {
        return this.ys;
    }

    public int getActivityId() {
        return this.activityId;
    }

    public a getAdExtra() {
        return this.adExtra;
    }

    public void setAdExtra(a aVar) {
        this.adExtra = aVar;
    }

    public int getShowType() {
        return this.showType;
    }

    public void setShowType(int i) {
        this.showType = i;
    }

    public String getShowContentStr() {
        return this.showContentStr;
    }

    public void setShowContentStr(String str) {
        this.showContentStr = str;
    }

    public b getAdShowContent() {
        return this.adShowContent;
    }

    public void setAdShowContent(b bVar) {
        this.adShowContent = bVar;
    }

    public d getQualificationRule() {
        return this.qualificationRule;
    }

    public void setQualificationRule(d dVar) {
        this.qualificationRule = dVar;
    }

    public void setIsSelfRefreshAd(boolean z) {
        this.isSelfRefreshAd = z;
    }

    public boolean isSelfRefreshAd() {
        return this.isSelfRefreshAd;
    }

    public int getMachAdSign() {
        return this.machAdSign;
    }

    public void setMachAdSign(int i) {
        this.machAdSign = i;
    }
}
