package com.meituan.android.loader.impl.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.loader.impl.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final List<String> b = Arrays.asList(":PinProcess");

    public static boolean a(Context context, String str) {
        Bundle bundle;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f96bfa065cdb6114125691ffdebdbfa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f96bfa065cdb6114125691ffdebdbfa")).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (ProcessUtils.isMainProcess(context)) {
            f.d(">>>DynLoader LoadUtil getLoadStatus isMainProcess, time=" + System.nanoTime() + ", soName:" + str + ",LoadStatusProvider.sLoadStatusMap=" + LoadStatusProvider.b);
            if (LoadStatusProvider.b == null || LoadStatusProvider.b.get(str) == null) {
                return false;
            }
            return LoadStatusProvider.b.get(str).booleanValue();
        } else if (a()) {
            return false;
        } else {
            try {
                bundle = context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + ".LoadStatusProvider"), "get_load_status", str, (Bundle) null);
            } catch (Throwable unused) {
                f.d(">>>DynLoader LoadUtil getLoadStatus call exception, time=" + System.nanoTime() + ", soName:" + str);
                bundle = null;
            }
            if (bundle != null) {
                f.d(">>>DynLoader LoadUtil getLoadStatus other process, time=" + System.nanoTime() + ", soName:" + str + ",result=" + bundle);
                return bundle.getBoolean("load_status", false);
            }
            return false;
        }
    }

    public static void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e8a027d7e24edf6319541ad9b4e4c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e8a027d7e24edf6319541ad9b4e4c56");
        } else if (ProcessUtils.isMainProcess(context)) {
            f.d(">>>DynLoader LoadUtil setLoadStatus isMainProcess, time=" + System.nanoTime() + ", soName:" + str + ",loaded=true");
            LoadStatusProvider.b.put(str, Boolean.TRUE);
        } else if (a()) {
        } else {
            try {
                Uri parse = Uri.parse("content://" + context.getPackageName() + ".LoadStatusProvider");
                Bundle bundle = new Bundle();
                bundle.putString("so_name", str);
                bundle.putBoolean("load_status", true);
                context.getContentResolver().call(parse, "set_load_status", (String) null, bundle);
                f.d(">>>DynLoader LoadUtil setLoadStatus other process, time=" + System.nanoTime() + ", soName:" + str + ",loaded=true");
            } catch (Throwable unused) {
                f.d(">>>DynLoader LoadUtil setLoadStatus call exception, time=" + System.nanoTime() + ", soName:" + str);
            }
        }
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "742aeb32003973f537e75b0e45df18f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "742aeb32003973f537e75b0e45df18f1")).booleanValue();
        }
        String currentProcessName = ProcessUtils.getCurrentProcessName();
        if (currentProcessName != null) {
            for (String str : b) {
                if (currentProcessName.endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
