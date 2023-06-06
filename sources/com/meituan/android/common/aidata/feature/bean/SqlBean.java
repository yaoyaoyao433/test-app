package com.meituan.android.common.aidata.feature.bean;

import android.text.TextUtils;
import com.meituan.android.common.aidata.core.QueryBuilder;
import com.meituan.android.common.aidata.database.SQLPlaceholder;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SqlBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String from;
    public String groupBy;
    public String having;
    public String limit;
    public String orderBy;
    public String select;
    public String where;

    public SqlBean() {
    }

    public SqlBean(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49bb5416d70a3e74907b153e74dd96bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49bb5416d70a3e74907b153e74dd96bc");
            return;
        }
        this.select = jSONObject.optString(Constants.SQLConstants.KEY_SELECT);
        this.from = jSONObject.optString("from");
        this.where = jSONObject.optString(Constants.SQLConstants.KEY_WHERE);
        this.groupBy = jSONObject.optString(Constants.SQLConstants.KEY_GROUP_BY);
        this.having = jSONObject.optString(Constants.SQLConstants.KEY_HAVING);
        this.orderBy = jSONObject.optString(Constants.SQLConstants.KEY_ORDER_BY);
        this.limit = jSONObject.optString("limit");
    }

    public String toSqlStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a43869a855a78cf4943313ec4675d639", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a43869a855a78cf4943313ec4675d639") : QueryBuilder.buildQueryString(replaceHolder(this.select), replaceHolder(this.from), replaceHolder(this.where), replaceHolder(this.groupBy), replaceHolder(this.having), replaceHolder(this.orderBy), replaceHolder(this.limit));
    }

    public String replaceHolder(String str) {
        SQLPlaceholder[] valuesCustom;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40d174352360a1c7f76b76651c403c02", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40d174352360a1c7f76b76651c403c02");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        for (SQLPlaceholder sQLPlaceholder : SQLPlaceholder.valuesCustom()) {
            String placeHolder = sQLPlaceholder.getPlaceHolder();
            if (str.contains(placeHolder)) {
                str = str.replace(placeHolder, SQLPlaceholder.getReplacement(sQLPlaceholder));
            }
        }
        return str;
    }
}
