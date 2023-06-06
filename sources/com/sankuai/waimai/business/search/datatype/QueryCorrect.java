package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class QueryCorrect implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isExposed = false;
    @SerializedName("correct_keyword")
    public String sCorrectKey;
    @SerializedName("origin_keyword")
    public String sOriginKey;
    @SerializedName("query_correct_context")
    public String sQueryContext;
}
