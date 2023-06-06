package com.meituan.android.common.aidata.database;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected long id;

    public long getId() {
        return this.id;
    }

    public void setId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02ddbac1110618af26362f98c92c536a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02ddbac1110618af26362f98c92c536a");
        } else {
            this.id = j;
        }
    }
}
