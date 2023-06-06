package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.asl.annotation.constrains.Pattern;
import com.sankuai.asl.annotation.constrains.Required;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = "access")
/* loaded from: classes4.dex */
public class Access {
    private static final List<String> DEFAULT_WHITE_LIST = new ArrayList<String>() { // from class: com.sankuai.titans.config.Access.1
        public static ChangeQuickRedirect changeQuickRedirect;

        {
            add(".jchunuo.com");
            add("dpurl.cn");
            add(".dianping.com");
            add(".51ping.com");
            add(".dpfile.com");
            add(".alpha.dp");
            add(".dper.com");
            add(".kuxun.cn");
            add(".neixin.cn");
            add(".meituan.com");
            add(".meituan.net");
            add(".sankuai.com");
            add(".sankuai.info");
            add(".maoyan.com");
            add(".zhenguo.com");
            add("t8.pub");
            add(".mobike.io");
            add(".mobike.com");
            add(".gewara.com");
            add("vss.baobaoaichi.cn");
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("accessInternalWhiteList")
    @Expose
    private List<String> accessInternalWhiteList;
    @SerializedName("black")
    @Expose
    @Pattern(message = "支持多个配置；不得包含协议，且需要完整的 Host + path", regexp = "^([a-zA-Z0-9][a-zA-Z0-9\\-]*)(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]*)+(\\:\\d+)$")
    private List<String> black;
    @SerializedName("certificate")
    @Expose
    private List<Certificate> certificate;
    @SerializedName("webActionBlack")
    @Expose
    private List<String> webActionBlack;
    @SerializedName("white")
    @Required(message = "内部页面白名单 必填")
    @Expose
    @Pattern(message = "内部页面仅支持填写 Host, 不得包含协议头或者 path；支持多个，Enter 键分割；", regexp = "^[a-zA-Z0-9][a-zA-Z0-9\\-]*(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]*)+(\\:\\d+)$")
    private List<String> white;

    public List<String> getWhite() {
        return this.white != null ? this.white : DEFAULT_WHITE_LIST;
    }

    public List<String> getBlack() {
        return this.black;
    }

    public List<String> getWebActionBlack() {
        return this.webActionBlack;
    }

    public List<Certificate> getCertificate() {
        return this.certificate;
    }

    public List<String> getAccessInternalWhiteList() {
        return this.accessInternalWhiteList;
    }

    public void setAccessInternalWhiteList(List<String> list) {
        this.accessInternalWhiteList = list;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7760d16bc0adcdca99e59fb9c3f8c8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7760d16bc0adcdca99e59fb9c3f8c8d");
        }
        return "Access{white=" + this.white + ", black=" + this.black + ", web_action_black=" + this.webActionBlack + ", certificate=" + this.certificate + '}';
    }
}
