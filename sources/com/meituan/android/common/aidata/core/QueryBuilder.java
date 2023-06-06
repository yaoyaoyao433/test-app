package com.meituan.android.common.aidata.core;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class QueryBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private static final Pattern sLimitPattern2 = Pattern.compile("\\s*\\d+\\s+offset\\s+\\d+\\s*");

    public static String buildQueryString(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f33cab0e40f68e9f24230081411d44a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f33cab0e40f68e9f24230081411d44a2");
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("invalid params: SELECT and FROM are all empty");
        }
        if (TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        if (!TextUtils.isEmpty(str7) && !sLimitPattern.matcher(str7).matches() && !sLimitPattern2.matcher(str7.toLowerCase()).matches()) {
            throw new IllegalArgumentException("invalid LIMIT clauses: " + str7);
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        } else {
            sb.append("* ");
        }
        sb.append(" FROM ");
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        } else {
            sb.append("BaseTable");
        }
        appendClause(sb, " WHERE ", str3);
        appendClause(sb, " GROUP BY ", str4);
        appendClause(sb, " HAVING ", str5);
        appendClause(sb, " ORDER BY ", str6);
        appendClause(sb, " LIMIT ", str7);
        String sb2 = sb.toString();
        if (sb2.toLowerCase().contains(" insert ") || sb2.toLowerCase().contains(" update ") || sb2.toLowerCase().contains(" delete ")) {
            throw new IllegalArgumentException("invalid clauses: SQL query can't contains INSERT, UPDATE and DELETE");
        }
        return sb2;
    }

    private static void appendClause(StringBuilder sb, String str, String str2) {
        Object[] objArr = {sb, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e4ae8e6c05a9c78ca563e03f188039e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e4ae8e6c05a9c78ca563e03f188039e");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            sb.append(str);
            sb.append(str2);
        }
    }
}
