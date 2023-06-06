package com.android.meituan.multiprocess;

import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return str != null && str.equals(ProcessUtils.getCurrentProcessName(e.a()));
    }
}
