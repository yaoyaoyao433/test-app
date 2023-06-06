package com.sankuai.waimai.ad.gray;

import android.app.Application;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static a b;
    private static final Gson c = new Gson();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("land_lx_report_switch")
        public boolean a = true;
        @SerializedName("mads_monitor")
        public C0676b b = new C0676b();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ad.gray.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0676b {
        @SerializedName("sh_lx_insert_template_info_switch")
        public boolean a = false;
        @SerializedName("sh_lx_raptor_monitor_switch")
        public boolean b = false;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4112b5142655e34876db92270edace2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4112b5142655e34876db92270edace2");
        }
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "680cfa2caa0113c2235cacc24123611c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "680cfa2caa0113c2235cacc24123611c");
        } else {
            Horn.register("waimai_ad_android", new HornCallback() { // from class: com.sankuai.waimai.ad.gray.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2c59942730bea3386958ecaf6302479", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2c59942730bea3386958ecaf6302479");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("AdHorn", "ad horn result" + str, new Object[0]);
                    if (z) {
                        try {
                            a unused = b.b = (a) b.c.fromJson(str, (Class<Object>) a.class);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
