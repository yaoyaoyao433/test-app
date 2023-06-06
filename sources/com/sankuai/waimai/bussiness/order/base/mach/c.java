package com.sankuai.waimai.bussiness.order.base.mach;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    public static Map<String, Object> b;
    private Context c;
    private Dialog d;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddcc065be28681a5beaf19bcde7f556d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddcc065be28681a5beaf19bcde7f556d");
        } else {
            this.c = context;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r14.equals("dismiss_loading_event") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r14, java.util.Map<java.lang.String, java.lang.Object> r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.base.mach.c.a(java.lang.String, java.util.Map):void");
    }

    private void a(Uri uri, Bundle bundle) {
        Object[] objArr = {uri, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1eb33931c0be05c31d72de62001562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1eb33931c0be05c31d72de62001562");
            return;
        }
        String queryParameter = uri.getQueryParameter("extra_params");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        for (Map.Entry<String, Object> entry : com.sankuai.waimai.mach.utils.b.a(queryParameter).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (entry.getValue() instanceof Double) {
                bundle.putDouble(key, ((Double) value).doubleValue());
            } else if (entry.getValue() instanceof Integer) {
                bundle.putInt(key, ((Integer) value).intValue());
            } else if (entry.getValue() instanceof Long) {
                bundle.putLong(key, ((Long) value).longValue());
            } else if (entry.getValue() instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (entry.getValue() instanceof String) {
                bundle.putString(key, String.valueOf(value));
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f3dd47154e5177eed7d3931b3e4cd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f3dd47154e5177eed7d3931b3e4cd7");
        } else if (b != null) {
            b.clear();
            b = null;
        }
    }
}
