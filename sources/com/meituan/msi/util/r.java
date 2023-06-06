package com.meituan.msi.util;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class r {
    public static ChangeQuickRedirect a;
    private static final Gson b = new GsonBuilder().setLenient().create();
    private static a c = new a();

    public static /* synthetic */ void a(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4a2bca77accb1dc2e730b1880a4bf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4a2bca77accb1dc2e730b1880a4bf0f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                aVar = (a) b.fromJson(str, (Class<Object>) a.class);
            } catch (Exception e) {
                e.printStackTrace();
                aVar = null;
            }
            if (aVar != null) {
                synchronized (a.class) {
                    c = aVar;
                }
            }
        }
    }

    public static a a() {
        return c;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1addd515c644b9768f4bb188321f76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1addd515c644b9768f4bb188321f76d");
        } else {
            Horn.register("msi_dynamic_sampling_config", new HornCallback() { // from class: com.meituan.msi.util.r.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c214a74872b440938e5bb474e35ffa6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c214a74872b440938e5bb474e35ffa6");
                    } else if (z) {
                        r.a(str);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("bizSamplingWhiteList")
        public List<String> b;
        @SerializedName("enableDynamicSampling")
        public boolean c;
        @SerializedName("enableSamplingAPI")
        public boolean d;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1afd4d858924799dcfc5b6eef95cf3c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1afd4d858924799dcfc5b6eef95cf3c");
                return;
            }
            this.c = true;
            this.d = true;
        }
    }
}
