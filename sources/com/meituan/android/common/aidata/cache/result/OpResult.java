package com.meituan.android.common.aidata.cache.result;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OpResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String rc;
    public int result;

    public OpResult(int i, String str) {
        this.rc = "";
        this.result = i;
        this.rc = str;
    }
}
