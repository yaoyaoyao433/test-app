package com.sankuai.waimai.platform.config.horn;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.alita.platform.knbbridge.StartBizJsHandler;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    @SerializedName("black_full")
    public Map<String, C1044a> a;
    @SerializedName("black_fuzzy")
    public Map<String, C1044a> b;
    @SerializedName(StartBizJsHandler.PARAM_NAME_FILTER_WHITE_LIST)
    public List<String> c;
    @SerializedName("regular")
    public Map<String, List<String>> d;
    @SerializedName("privacy_api_white_list_switch")
    public int e = 0;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.config.horn.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1044a {
        @SerializedName("regular")
        public String a;
    }
}
