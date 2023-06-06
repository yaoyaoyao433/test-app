package com.meituan.android.mercury.msc.adaptor.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MSCCacheIndexInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String appId;
    public long getTime;
    public String publishId;

    public MSCCacheIndexInfo(String str, String str2, long j) {
        this.appId = str;
        this.publishId = str2;
        this.getTime = j;
    }
}
