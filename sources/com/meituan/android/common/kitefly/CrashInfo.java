package com.meituan.android.common.kitefly;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CrashInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Map<String, Object> mCrashOption;
    public final String mCrashVersion;
    public final String mSource;

    public CrashInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e0292e5c01fadafc249cc6178ae6160", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e0292e5c01fadafc249cc6178ae6160");
            return;
        }
        this.mSource = str;
        this.mCrashVersion = str2;
        this.mCrashOption = new HashMap();
    }

    public CrashInfo(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c807f34708fc852abf891d2140ec9966", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c807f34708fc852abf891d2140ec9966");
            return;
        }
        this.mSource = str;
        this.mCrashVersion = str2;
        this.mCrashOption = map == null ? new HashMap<>() : map;
    }

    public static CrashInfo newCrashInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae67be472c23e1f2f03ecc50b4cb7c8e", 6917529027641081856L) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae67be472c23e1f2f03ecc50b4cb7c8e") : new CrashInfo(str, str2);
    }

    public static CrashInfo newCrashInfo(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3c08abd7210640f302c0c02fb6affb6", 6917529027641081856L) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3c08abd7210640f302c0c02fb6affb6") : new CrashInfo(str, str2, map);
    }
}
