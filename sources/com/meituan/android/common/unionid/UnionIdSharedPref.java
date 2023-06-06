package com.meituan.android.common.unionid;

import android.content.Context;
import com.meituan.android.cipstorage.x;
import com.meituan.android.common.unionid.oneid.cache.CIPStorageManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UnionIdSharedPref {
    private static final String SHARED_FILE_NAME = "shared_unionid";
    private static final String SHARED_KEY = "unionid";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static x sCIPStorageSPAdapter;
    private static UnionIdSharedPref sUnionIdSharedPref;

    public UnionIdSharedPref(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4f1190bdfe5f9bdd6aed0c50ce1d2ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4f1190bdfe5f9bdd6aed0c50ce1d2ed");
        } else {
            sCIPStorageSPAdapter = CIPStorageManager.getApdater(context);
        }
    }

    public static synchronized UnionIdSharedPref getInstance(Context context) {
        synchronized (UnionIdSharedPref.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8bc2895c2405e1e6d39afb011dea55ea", RobustBitConfig.DEFAULT_VALUE)) {
                return (UnionIdSharedPref) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8bc2895c2405e1e6d39afb011dea55ea");
            } else if (sUnionIdSharedPref == null) {
                UnionIdSharedPref unionIdSharedPref = new UnionIdSharedPref(context);
                sUnionIdSharedPref = unionIdSharedPref;
                return unionIdSharedPref;
            } else {
                return sUnionIdSharedPref;
            }
        }
    }

    public boolean hasUnionIdKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "224bbc57b7ad5e55de5e78664143f5ae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "224bbc57b7ad5e55de5e78664143f5ae")).booleanValue() : sCIPStorageSPAdapter.a("unionid", SHARED_FILE_NAME);
    }

    public String getUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfe335dcc0142803828f504a62901a86", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfe335dcc0142803828f504a62901a86") : sCIPStorageSPAdapter.b("unionid", "", SHARED_FILE_NAME);
    }

    public boolean setUnionId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b0e10051928292494aaab8c2a46a847", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b0e10051928292494aaab8c2a46a847")).booleanValue() : sCIPStorageSPAdapter.a("unionid", str, SHARED_FILE_NAME);
    }

    public void deleteUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33db210b1d5def55dc350dcd9b426371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33db210b1d5def55dc350dcd9b426371");
        } else {
            sCIPStorageSPAdapter.b("unionid", SHARED_FILE_NAME);
        }
    }
}
