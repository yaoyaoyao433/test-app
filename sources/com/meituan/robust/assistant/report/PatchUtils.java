package com.meituan.robust.assistant.report;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PatchUtils {
    public static void applyPatch(Context context, String str, String str2, String str3, long j, String str4) {
        com.meituan.robust.assistant.PatchUtils.applyPatch(context, str, str2, str3, j, str4, CoverageReporter.getInstance(context));
    }

    public static void applyPatchInLocal(Context context, String str, String str2, String str3, long j, String str4) {
        com.meituan.robust.assistant.PatchUtils.applyPatchInLocal(context, str, str2, str3, j, str4, CoverageReporter.getInstance(context));
    }
}
