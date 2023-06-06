package com.dianping.widget.view;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static String b;
    public String c;
    public c d;
    private d e;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a94dbeb7ee05a1f778add7abb8d2b81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a94dbeb7ee05a1f778add7abb8d2b81");
            return;
        }
        this.c = "1";
        this.e = new d();
    }

    @Deprecated
    private synchronized void a(View view, int i, String str) {
        Object[] objArr = {view, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57fc49be96314c1c41dcc65900741d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57fc49be96314c1c41dcc65900741d79");
            return;
        }
        d b2 = com.dianping.judas.util.b.b(view);
        if (b2 == null) {
            com.dianping.judas.util.a.b("invalid gaView, must implements GAViewDotter interface", new Object[0]);
            return;
        }
        if (i == Integer.MAX_VALUE) {
            if (b2.r != null && Integer.MAX_VALUE == b2.r.intValue()) {
                b2.r = null;
            }
        } else {
            b2.r = Integer.valueOf(i);
        }
        a(view, view.getContext(), com.dianping.judas.util.b.c(view), str, b2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033a  */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.dianping.widget.view.d] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.Map<java.lang.String, java.lang.Object>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void a(android.view.View r21, android.content.Context r22, java.lang.String r23, java.lang.String r24, com.dianping.widget.view.d r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.widget.view.b.a(android.view.View, android.content.Context, java.lang.String, java.lang.String, com.dianping.widget.view.d, boolean):void");
    }

    private static Map<String, Object> a(Activity activity) {
        Uri uri;
        String[] split;
        int i;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            uri = activity.getIntent().getData();
        } catch (Throwable unused) {
            uri = null;
        }
        if (uri != null && !TextUtils.isEmpty(uri.getEncodedQuery())) {
            try {
                for (String str : uri.getEncodedQuery().split("&")) {
                    int indexOf = str.indexOf("=");
                    hashMap2.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? "" : URLDecoder.decode(str.substring(i), "UTF-8"));
                }
            } catch (Throwable unused2) {
            }
        }
        try {
            hashMap.putAll(hashMap2);
        } catch (Throwable unused3) {
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a84a6de96fd99ff37c6355b8c74ffd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a84a6de96fd99ff37c6355b8c74ffd")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (str.startsWith(CommonConstant.Symbol.UNDERLINE + str2 + CommonConstant.Symbol.UNDERLINE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.dianping.judas.interfaces.a aVar, View view, String str) {
        Object[] objArr = {aVar, view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6f090330295f38749226af0a7997b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6f090330295f38749226af0a7997b3");
        } else if (a(str, aVar.b()) && a(aVar, view) && !a(str, aVar)) {
            a(view, Integer.valueOf(str.substring(str.lastIndexOf(CommonConstant.Symbol.UNDERLINE) + 1)).intValue(), Constants.EventType.VIEW);
        }
    }

    private boolean a(com.dianping.judas.interfaces.a aVar, View view) {
        Object[] objArr = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f12b066d6ee932dd5abc999b816888", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f12b066d6ee932dd5abc999b816888")).booleanValue();
        }
        if (view == null || aVar == null) {
            return false;
        }
        int[] iArr = {0, 0};
        try {
            view.getLocationOnScreen(iArr);
            return iArr[1] >= 0 && iArr[1] + 0 <= aVar.a();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(String str, com.dianping.judas.interfaces.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8484cc60e7dc51efa48a8e0acfd629dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8484cc60e7dc51efa48a8e0acfd629dc")).booleanValue();
        }
        if (aVar == null || Statistics.getRequestId() == null) {
            return true;
        }
        List list = null;
        if (list.size() == 0 || !Statistics.getRequestId().equals(list.get(0))) {
            list.clear();
            list.add(0, Statistics.getRequestId());
            list.add(str);
            return false;
        } else if (list.contains(str)) {
            return true;
        } else {
            list.add(str);
            return false;
        }
    }
}
