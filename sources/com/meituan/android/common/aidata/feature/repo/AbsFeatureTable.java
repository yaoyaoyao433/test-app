package com.meituan.android.common.aidata.feature.repo;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsFeatureTable implements IFeatureTable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.aidata.feature.repo.IFeatureTable
    public abstract String getTableName();

    public boolean isAllowed(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f2a9d54115c2235acf50dedd75e630c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f2a9d54115c2235acf50dedd75e630c")).booleanValue();
        }
        String tableName = getTableName();
        return tableName != null && tableName.equals(str);
    }
}
