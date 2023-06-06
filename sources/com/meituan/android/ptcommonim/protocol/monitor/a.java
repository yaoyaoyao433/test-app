package com.meituan.android.ptcommonim.protocol.monitor;

import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f6931b6d1695a5d05eb2e96d5347ed7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f6931b6d1695a5d05eb2e96d5347ed7");
        } else {
            a(str, str2, (Map) null);
        }
    }

    private static void a(String str, String str2, Map map) {
        Object[] objArr = {str, str2, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "026af904adc44e9d644874be58a2afac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "026af904adc44e9d644874be58a2afac");
            return;
        }
        try {
            Sniffer.normal("biz_pt_im", str, str2, "", null);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b727c317470918270c107fddaaa77537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b727c317470918270c107fddaaa77537");
        } else {
            a(str, str2, str3, null);
        }
    }

    private static void a(String str, String str2, String str3, Map map) {
        Object[] objArr = {str, str2, str3, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dbdbdb396b9d1544bc8f07c79e0633c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dbdbdb396b9d1544bc8f07c79e0633c");
            return;
        }
        try {
            Sniffer.smell("biz_pt_im", str, str2, str3, "", (Map<String, String>) null);
        } catch (Throwable unused) {
        }
    }
}
