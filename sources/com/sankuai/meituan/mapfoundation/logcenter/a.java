package com.sankuai.meituan.mapfoundation.logcenter;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static boolean b;
    private static final String c;
    private static final SimpleDateFormat d;
    private static boolean e;

    static {
        try {
            c.f();
            b = true;
        } catch (Error unused) {
            b = false;
        }
        c("Logan 集成:" + b);
        c = "MTMapFoundation-" + "release".toUpperCase();
        d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        e = false;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapfoundation.logcenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0601a {
        DAY,
        HOUR,
        MINUTE;
        
        public static ChangeQuickRedirect a;

        EnumC0601a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d87e00928491481627423f03fbb1ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d87e00928491481627423f03fbb1ab");
            }
        }

        public static EnumC0601a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "609e74bb34214f24973c6431d53be706", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0601a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "609e74bb34214f24973c6431d53be706") : (EnumC0601a) Enum.valueOf(EnumC0601a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0601a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d64fdea566ea1bdcc487a977484fd3b0", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0601a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d64fdea566ea1bdcc487a977484fd3b0") : (EnumC0601a[]) values().clone();
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3819d7ee9f5dac619bb8bbec05bdd66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3819d7ee9f5dac619bb8bbec05bdd66");
        } else {
            a(3, str);
        }
    }

    private static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0aa788f96aed3fa3411bacf9a3e0955c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0aa788f96aed3fa3411bacf9a3e0955c");
        } else {
            a(4, str);
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7b5444f4ea92256bd55a7f4bcecf9ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7b5444f4ea92256bd55a7f4bcecf9ed");
            return;
        }
        c(str);
        Object[] objArr2 = {str, null, EnumC0601a.DAY};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c7f1ea4977688232831deabe16fda086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c7f1ea4977688232831deabe16fda086");
            return;
        }
        c(str);
        if (b) {
            c.a(str, 3);
        }
    }

    private static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0defadb2248510997c1d6287dc5efe8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0defadb2248510997c1d6287dc5efe8f");
        } else if ((e || i > 3) && !TextUtils.isEmpty(str)) {
            String str2 = Thread.currentThread().toString() + "\t" + str;
            switch (i) {
                case 2:
                    return;
                case 3:
                    return;
                case 4:
                    return;
                case 5:
                    return;
                case 6:
                    Log.e(c, str2);
                    return;
                default:
                    return;
            }
        }
    }
}
