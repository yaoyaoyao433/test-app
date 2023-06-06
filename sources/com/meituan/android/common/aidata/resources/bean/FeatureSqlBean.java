package com.meituan.android.common.aidata.resources.bean;

import android.text.TextUtils;
import com.meituan.android.common.aidata.database.SQLPlaceholder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureSqlBean {
    private static final String TAG = "FeatureSqlBean";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mSql;

    public FeatureSqlBean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b351a4794e9ae4064ac86ecaf542257e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b351a4794e9ae4064ac86ecaf542257e");
        } else {
            this.mSql = str;
        }
    }

    public String toSqlStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71cfdc63fe3a71d4b8eb562e4d485ae4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71cfdc63fe3a71d4b8eb562e4d485ae4") : replaceHolder(this.mSql);
    }

    public static String replaceHolder(String str) {
        SQLPlaceholder[] valuesCustom;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71d04f7c0fdf59e32e4340d6bc770999", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71d04f7c0fdf59e32e4340d6bc770999");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        for (SQLPlaceholder sQLPlaceholder : SQLPlaceholder.valuesCustom()) {
            String placeHolder = sQLPlaceholder.getPlaceHolder();
            if (str.contains(placeHolder)) {
                StringBuilder sb = new StringBuilder("start replace placeholder ");
                sb.append(placeHolder);
                sb.append(" for ");
                sb.append(str);
                str = str.replace(placeHolder, SQLPlaceholder.getReplacement(sQLPlaceholder));
                StringBuilder sb2 = new StringBuilder("after replace placeholder ");
                sb2.append(placeHolder);
                sb2.append(": ");
                sb2.append(str);
            }
        }
        return str;
    }
}
