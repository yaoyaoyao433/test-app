package com.sankuai.waimai.guidepop.utils;

import android.text.TextUtils;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final ExecutorService b = com.sankuai.android.jarvis.c.a("popup_logger");

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4e01f953ba62f1a8717df73edad51eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4e01f953ba62f1a8717df73edad51eb");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c(str, str2, new Object[0]);
            final String str3 = str + str2;
            Object[] objArr2 = {str3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "86b17eb56e6f28cbadfb246b18872dd0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "86b17eb56e6f28cbadfb246b18872dd0");
                return;
            }
            try {
                b.execute(new Runnable() { // from class: com.sankuai.waimai.guidepop.utils.e.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "960a6e3f6aa632f9bc6abd196bbcb5d4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "960a6e3f6aa632f9bc6abd196bbcb5d4");
                            return;
                        }
                        try {
                            com.dianping.networklog.c.a(str3, 3);
                        } catch (Exception unused) {
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5f0f1f803fbb888ab6910dbc3b72019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5f0f1f803fbb888ab6910dbc3b72019");
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b(str, str2, new Object[0]);
        }
    }

    public static void a(String str, Float f) {
        Object[] objArr = {str, f};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "466c6cc8d09375c71f9293f55557b6c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "466c6cc8d09375c71f9293f55557b6c5");
        } else {
            a(str, f, null, null);
        }
    }

    public static void a(String str, Float f, String str2, String str3) {
        Object[] objArr = {str, f, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "782c96be14ce98b1ea94bbe1ef59aeb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "782c96be14ce98b1ea94bbe1ef59aeb4");
            return;
        }
        m a2 = a();
        a2.a(str, Collections.singletonList(f));
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            a2.a(str2, str3);
        }
        a2.a();
    }

    public static void a(String str, Float f, HashMap<String, String> hashMap) {
        Object[] objArr = {str, f, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a65c8b42c5e3f431cb8fa46b37f8c137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a65c8b42c5e3f431cb8fa46b37f8c137");
            return;
        }
        m a2 = a();
        a2.a(str, Collections.singletonList(f));
        Object[] objArr2 = {a2, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f84153d2b3b493634b2134bf28a61634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f84153d2b3b493634b2134bf28a61634");
        } else if (a2 != null && hashMap != null && hashMap.size() > 0) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                a2.a(entry.getKey(), entry.getValue());
            }
        }
        a2.a();
    }

    private static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1d00b31e29cb63232aed61ebf24c1d1", RobustBitConfig.DEFAULT_VALUE) ? (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1d00b31e29cb63232aed61ebf24c1d1") : new m(com.sankuai.waimai.config.a.a().d(), com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c());
    }
}
