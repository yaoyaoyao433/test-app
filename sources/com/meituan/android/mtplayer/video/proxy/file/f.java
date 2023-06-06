package com.meituan.android.mtplayer.video.proxy.file;

import android.text.TextUtils;
import com.meituan.android.mtplayer.video.proxy.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f implements c {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mtplayer.video.proxy.file.c
    public final String a(String str) {
        String substring;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454b908e099e0b43d97954c1b078eae5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454b908e099e0b43d97954c1b078eae5");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4a0689e2d6393960561ba729443baa8", RobustBitConfig.DEFAULT_VALUE)) {
            substring = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4a0689e2d6393960561ba729443baa8");
        } else {
            int lastIndexOf = str.lastIndexOf(46);
            substring = (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
        }
        String a2 = q.a(str);
        if (TextUtils.isEmpty(substring)) {
            return a2;
        }
        return a2 + CommonConstant.Symbol.DOT + substring;
    }
}
