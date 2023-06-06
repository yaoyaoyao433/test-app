package com.meituan.android.mrn.module.utils;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8d33e235de289510641eb191de345ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8d33e235de289510641eb191de345ab");
        } else {
            a(str).writePageView(str2, str3, map);
        }
    }

    public static void b(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0854ea89920f05f8f2de6bcbcea047e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0854ea89920f05f8f2de6bcbcea047e4");
        } else {
            a(str).writePageDisappear(str2, str3, map);
        }
    }

    public static Channel a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b845581bb2118a02ed04ac666509c76", RobustBitConfig.DEFAULT_VALUE)) {
            return (Channel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b845581bb2118a02ed04ac666509c76");
        }
        if (TextUtils.isEmpty(str)) {
            return Statistics.getChannel();
        }
        return Statistics.getChannel(str);
    }
}
