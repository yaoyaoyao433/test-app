package com.sankuai.meituan.kernel.net.tunnel;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    static volatile b b;
    public static volatile a c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        @SerializedName("trace_id_switch")
        public boolean a = true;
        @SerializedName("trace_id_host_list")
        public List<String> b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b {
        @SerializedName("enable")
        public boolean a = false;
        @SerializedName("short_tunnel_white_list")
        public List<String> b;
        @SerializedName("long_tunnel_white_list")
        public List<String> c;
    }

    public static /* synthetic */ void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15e8f246119f033b4fe949a7fbf1175c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15e8f246119f033b4fe949a7fbf1175c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                b = (b) new Gson().fromJson(str, (Class<Object>) b.class);
            } catch (Exception e) {
                a(e);
            }
        }
    }

    static void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e511459f87aa7dd58b5a30c78f28d31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e511459f87aa7dd58b5a30c78f28d31");
            return;
        }
        String stackTraceString = Log.getStackTraceString(exc);
        if (com.sankuai.meituan.kernel.net.base.c.b()) {
            PrintStream printStream = System.out;
            printStream.println("catchException error: " + stackTraceString);
        }
        com.dianping.networklog.c.a(stackTraceString, 3);
    }
}
