package com.meituan.android.mrn.engine;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MRNInstanceRecord implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bundleName;
    public long pageEnterTime;
    public long pageExitTime;

    public MRNInstanceRecord(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a04a8eaf41689d0f71f2038dddcd72a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a04a8eaf41689d0f71f2038dddcd72a7");
            return;
        }
        this.bundleName = str;
        this.pageEnterTime = j;
        this.pageExitTime = j2;
    }

    public boolean equals(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7f72878907d3d2a64f232ad1ce5b8a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7f72878907d3d2a64f232ad1ce5b8a0")).booleanValue();
        }
        if (obj instanceof MRNInstanceRecord) {
            MRNInstanceRecord mRNInstanceRecord = (MRNInstanceRecord) obj;
            if (TextUtils.equals(this.bundleName, mRNInstanceRecord.bundleName) && this.pageEnterTime == mRNInstanceRecord.pageEnterTime) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ace1cf38ee2a152e4c23b5b6efcbbf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ace1cf38ee2a152e4c23b5b6efcbbf")).intValue();
        }
        if (this.bundleName != null) {
            return (this.bundleName + this.pageEnterTime).hashCode();
        }
        return 0;
    }
}
