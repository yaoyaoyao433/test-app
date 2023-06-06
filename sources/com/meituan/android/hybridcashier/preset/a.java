package com.meituan.android.hybridcashier.preset;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.hybridcashier.config.bean.HybridCashierConfig;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static HybridCashierConfig b;

    @Nullable
    public static HybridCashierConfig a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6148d74312eb49f42f1558ffa65ba5d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (HybridCashierConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6148d74312eb49f42f1558ffa65ba5d8");
        }
        f.a("HybridCashierPresetConfig_getPresetHybridCashierConfig");
        String a2 = a(com.meituan.android.neohybrid.init.a.d(), "hybrid_cashier_preset_config.json");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        if (b == null) {
            b = (HybridCashierConfig) b.a().fromJson(a2, (Class<Object>) HybridCashierConfig.class);
        }
        return b;
    }

    private static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "220bb8f627670a92aa0cd4308c8b4fd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "220bb8f627670a92aa0cd4308c8b4fd3");
        }
        try {
            return a(context.getAssets().open(str));
        } catch (IOException unused) {
            return null;
        }
    }

    private static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8688c32b1097ef5686895060948be53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8688c32b1097ef5686895060948be53");
        }
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] bArr = new byte[inputStream.available()];
            for (int i = 0; i != -1; i = bufferedInputStream.read(bArr)) {
            }
            return new String(bArr);
        } catch (IOException unused) {
            return null;
        }
    }
}
