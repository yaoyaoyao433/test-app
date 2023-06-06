package com.meituan.itc.android.mtnn;

import android.content.Context;
import com.dianping.monitor.impl.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private m b;

    public g(int i, Context context) {
        Object[] objArr = {Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d112ae331349f3de50e75936a4b70f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d112ae331349f3de50e75936a4b70f8");
        } else if (i == -1 || context == null) {
            this.b = null;
        } else {
            this.b = new m(i, context);
        }
    }

    public final synchronized void a(Map<String, String> map, String str, float f) {
        Object[] objArr = {map, str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16440c0bd11602e3869fd0670cab31ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16440c0bd11602e3869fd0670cab31ca");
        } else if (this.b != null) {
            if (map != null) {
                try {
                    if (map.size() > 0) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            this.b.a(entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.b.a(str, Collections.singletonList(Float.valueOf(f)));
            this.b.a();
            StringBuilder sb = new StringBuilder();
            sb.append(f);
            String sb2 = sb.toString();
            com.dianping.networklog.c.a(sb2, 3, new String[]{"MTNN_" + str});
        }
    }

    public final synchronized void a(Map<String, String> map, String str, float f, String str2) {
        Object[] objArr = {map, str, Float.valueOf(f), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c3bc1d0e08b33c4bd9c4f6b8043fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c3bc1d0e08b33c4bd9c4f6b8043fc9");
        } else if (this.b != null) {
            if (map != null) {
                try {
                    if (map.size() > 0) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            this.b.a(entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.b.a("status", str2);
            this.b.a(str, Collections.singletonList(Float.valueOf(f)));
            this.b.a();
            StringBuilder sb = new StringBuilder();
            sb.append(f);
            String sb2 = sb.toString();
            com.dianping.networklog.c.a(sb2, 3, new String[]{"MTNN_" + str});
        }
    }
}
