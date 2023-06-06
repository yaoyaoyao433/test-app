package com.meituan.robust;

import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface RobustCallBack {
    void exceptionNotify(Throwable th, String str);

    void logNotify(String str, String str2);

    void onPatchApplied(boolean z, Patch patch);

    void onPatchFetched(boolean z, boolean z2, Patch patch);

    void onPatchListFetched(boolean z, boolean z2, List<Patch> list);
}
