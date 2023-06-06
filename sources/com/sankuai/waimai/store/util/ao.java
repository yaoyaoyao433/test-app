package com.sankuai.waimai.store.util;

import android.media.AudioManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Formatter;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ao {
    public static ChangeQuickRedirect a;

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35d8383c76b6c7eed24de926ebbb5530", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35d8383c76b6c7eed24de926ebbb5530");
        }
        if (j <= 0 || j >= 86400000) {
            return "00:00";
        }
        long j2 = j / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
        return j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e66aa9668f0ba9a7e26c3fc1125d048", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e66aa9668f0ba9a7e26c3fc1125d048")).floatValue();
        }
        AudioManager audioManager = (AudioManager) com.meituan.android.singleton.b.a.getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(1) / audioManager.getStreamMaxVolume(1);
        }
        return 0.0f;
    }
}
