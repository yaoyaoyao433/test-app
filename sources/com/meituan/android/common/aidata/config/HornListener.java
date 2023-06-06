package com.meituan.android.common.aidata.config;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class HornListener implements HornCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean callBackWhenContentNoChange;
    private String content;
    private final String hornName;

    public abstract void onChanged(@NonNull String str, boolean z);

    public HornListener(String str) {
        this(str, false);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3951f2a866086114ae4c00365c84f47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3951f2a866086114ae4c00365c84f47");
        }
    }

    public HornListener(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d97c22217a59187e9f90d95d1f4b2dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d97c22217a59187e9f90d95d1f4b2dd");
            return;
        }
        this.hornName = str;
        this.callBackWhenContentNoChange = z;
    }

    @Override // com.meituan.android.common.horn.HornCallback
    public void onChanged(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aeb2272109c93b89c1f70af7f3368346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aeb2272109c93b89c1f70af7f3368346");
            return;
        }
        StringBuilder sb = new StringBuilder("received ");
        sb.append(this.hornName);
        sb.append(" callback result enable:");
        sb.append(z);
        sb.append(" result:");
        sb.append(str);
        if (!z || TextUtils.isEmpty(str)) {
            return;
        }
        boolean z2 = this.content == null;
        if (this.callBackWhenContentNoChange) {
            onChanged(str, z2);
        } else if (this.content == null || !TextUtils.equals(this.content, str)) {
            this.content = str;
            onChanged(str, z2);
        }
    }
}
