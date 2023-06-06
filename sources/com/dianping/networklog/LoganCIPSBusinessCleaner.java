package com.dianping.networklog;

import com.meituan.android.cipstorage.CIPSBusinessCleaner;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public class LoganCIPSBusinessCleaner extends CIPSBusinessCleaner {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onClearDataOver(String str) {
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onClearDataStart(String str) {
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onConfigExceed(String str, long j) {
    }

    @Override // com.meituan.android.cipstorage.CIPSBusinessCleaner
    public void onStorageExceed(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605b6640ff02b25bd48788789b23e63f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605b6640ff02b25bd48788789b23e63f");
        } else {
            t.a().d.e();
        }
    }
}
