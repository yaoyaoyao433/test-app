package com.sankuai.titans.result;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PermissionResultCode {
    private static final int DEFAULT_PREFIX = 900;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getResultCode(int i) {
        return i + 900;
    }
}
