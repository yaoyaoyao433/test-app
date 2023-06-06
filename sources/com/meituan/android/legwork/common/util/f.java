package com.meituan.android.legwork.common.util;

import android.text.TextUtils;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements HornCallback {
    public static ChangeQuickRedirect a;
    private final String b;
    private final HornCallback c;

    private f(String str, HornCallback hornCallback) {
        this.b = str;
        this.c = hornCallback;
    }

    public static HornCallback a(String str, HornCallback hornCallback) {
        Object[] objArr = {str, hornCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c26f30b6cdd17ed0bc8ceab542c09af", RobustBitConfig.DEFAULT_VALUE) ? (HornCallback) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c26f30b6cdd17ed0bc8ceab542c09af") : new f(str, hornCallback);
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public final void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b4fd2b83a6d5bf0e98ad91c9b66985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b4fd2b83a6d5bf0e98ad91c9b66985");
            return;
        }
        String str2 = this.b;
        HornCallback hornCallback = this.c;
        Object[] objArr2 = {str2, hornCallback, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8abcf8706a9eca1a4ded8289468c9569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8abcf8706a9eca1a4ded8289468c9569");
        } else if (!z || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            z.a(com.meituan.android.legwork.a.a(), str2, str);
            if (hornCallback != null) {
                hornCallback.onChanged(z, str);
            }
        }
    }
}
