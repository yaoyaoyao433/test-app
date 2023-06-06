package com.sankuai.waimai.business.page.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ReRankListBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("biz_trace_id")
    public String bizTraceId;
    @SerializedName("is_rerank")
    public boolean isReRank;
    @SerializedName("is_track")
    public boolean isTrack;
    @SerializedName("rerank_result")
    public ReRankResultBean reRankResult;
    @SerializedName("rerank_size")
    public int reRankSize;
    @SerializedName("start_index")
    public int startIndex;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class ReRankResultBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("edge_trace_id")
        public String edgeTraceId;
        @SerializedName("module_list")
        public List<RocksServerModel> moduleList;
        @SerializedName("rank_ctx")
        public Object rankCtx;
        @SerializedName("res_list")
        public List<ResListBean> resList;
        @SerializedName("user_feat")
        public Object userFeat;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static class ResListBean {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("id")
            public String id;
            @SerializedName("rank_ext")
            public Object rankExt;
        }
    }
}
