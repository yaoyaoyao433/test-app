package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.xm.im.message.bean.Message;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ImRecommendScriptInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5593429124337646408L;
    @SerializedName("content")
    public String content;
    @SerializedName(Message.CTS)
    public String cts;
    @SerializedName("recom_statement_biz_id")
    public String recomStatementBizId;
    @SerializedName("reccom_statement_list")
    public List<RecommendStatementList> recommendStatementLists;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class RecommendStatementList implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -7925569127945520173L;
        @SerializedName("key_word_list")
        public List<String> keyWordList;
        @SerializedName("recom_statement_id")
        public String recomStatementId;
        @SerializedName("statement")
        public String statement;

        public RecommendStatementList() {
        }
    }
}
