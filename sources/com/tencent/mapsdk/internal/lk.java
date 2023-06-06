package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lk extends le {
    @Override // com.tencent.mapsdk.internal.le
    public final byte[] f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        NetResponse doGet = NetManager.getInstance().builder().url(str).doGet();
        if (doGet != null && doGet.available()) {
            return doGet.data;
        }
        return super.f(str);
    }
}
