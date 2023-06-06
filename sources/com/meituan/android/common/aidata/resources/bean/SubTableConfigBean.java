package com.meituan.android.common.aidata.resources.bean;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SubTableConfigBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mSubTableName;
    private List<String> mTableIndexList;

    public SubTableConfigBean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ede35afbd27e0c1b272c203d09796e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ede35afbd27e0c1b272c203d09796e3");
        } else {
            this.mSubTableName = str;
        }
    }

    public void addTableIndex(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dfa4823f6e36bb0f68df2cae072b7ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dfa4823f6e36bb0f68df2cae072b7ea");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.mTableIndexList == null) {
                this.mTableIndexList = new ArrayList();
            }
            this.mTableIndexList.add(str);
        }
    }

    @Nullable
    public String getSubTableName() {
        return this.mSubTableName;
    }

    @Nullable
    public List<String> getTableIndexList() {
        return this.mTableIndexList;
    }
}
