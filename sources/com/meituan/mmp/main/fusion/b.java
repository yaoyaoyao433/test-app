package com.meituan.mmp.main.fusion;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.utils.z;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.fusion.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect b;
    public static ConcurrentHashMap<String, a> c = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public ArrayList<String> a;
        public boolean b;
        public boolean c;
    }

    public boolean a(Context context, String str, String str2, Intent intent) {
        return false;
    }

    public boolean b(Context context, String str, String str2, Intent intent) {
        return false;
    }

    public static boolean a(Context context, Intent intent) {
        boolean z;
        a aVar;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec941f91560d6f6d604efa18ab09e259", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec941f91560d6f6d604efa18ab09e259")).booleanValue();
        }
        Object[] objArr2 = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c217ac9b55fb9edf9be0646b4610a10f", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c217ac9b55fb9edf9be0646b4610a10f")).booleanValue();
        } else {
            Class<? extends HeraActivity> b2 = b(context, intent);
            z = (b2 == null || AppBrandHeraActivity.class.isAssignableFrom(b2)) ? false : true;
        }
        if (z) {
            String a2 = a(intent);
            if (TextUtils.isEmpty(a2) || (aVar = c.get(a2)) == null) {
                return false;
            }
            String b3 = z.b(intent, "targetPath");
            if (TextUtils.isEmpty(b3)) {
                return aVar.b;
            }
            return aVar.a.contains(com.meituan.mmp.lib.config.a.p(b3));
        }
        return false;
    }

    public static String a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3a827a1ea14d53621db774e0bb9ae8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3a827a1ea14d53621db774e0bb9ae8f");
        }
        String b2 = z.b(intent, "appId");
        return TextUtils.isEmpty(b2) ? MMPEnvHelper.getDefaultAppID() : b2;
    }

    public static Class<? extends HeraActivity> b(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b9f4f60b1125e38df38838c2fa3aa72", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b9f4f60b1125e38df38838c2fa3aa72");
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            return null;
        }
        try {
            Class cls = Class.forName(resolveActivity.activityInfo.name);
            if (HeraActivity.class.isAssignableFrom(cls)) {
                if (TextUtils.equals(resolveActivity.activityInfo.processName, ProcessUtils.getCurrentProcessName(context))) {
                    return cls;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    public static void a(String str, Intent intent) {
        c.a aVar;
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "34c8f687eade9d50891695fefc3b3808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "34c8f687eade9d50891695fefc3b3808");
        } else if (MMPEnvHelper.isInited()) {
            Iterator<c.a> it = c.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (TextUtils.equals(aVar.b, str)) {
                    break;
                }
            }
            if (aVar == null) {
                com.meituan.mmp.lib.trace.b.b("IFusionPageManager", "returnToFirstActivity: no living & reusable activity found for appId " + str);
                return;
            }
            for (int size = c.b.size() - 1; size >= 0; size--) {
                c.a aVar2 = c.b.get(size);
                if (aVar2 == aVar) {
                    return;
                }
                if (TextUtils.equals(aVar2.b, str)) {
                    aVar2.e = true;
                }
                c.c.put(aVar2, intent);
                HeraActivity a2 = aVar2.a();
                if (a2 == null || a2.isDestroyed()) {
                    com.meituan.mmp.lib.trace.b.c("clearToFirstActivity: activity " + aVar2.d + " of appId " + aVar2.b + " already destroyed, will finish it after recreate");
                } else {
                    com.meituan.mmp.lib.trace.b.c("clearToFirstActivity: finish activity " + aVar2.d + " of appId " + aVar2.b + " for appId " + str);
                    a2.finish();
                }
            }
        }
    }

    public static void b(String str, Intent intent) {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1077595b082e26828e4ebafddc6ee12b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1077595b082e26828e4ebafddc6ee12b");
        } else if (MMPEnvHelper.isInited()) {
            for (int size = c.b.size() - 1; size >= 0; size--) {
                c.a aVar = c.b.get(size);
                if (TextUtils.equals(aVar.b, str)) {
                    aVar.e = true;
                }
                c.c.put(aVar, intent);
                HeraActivity a2 = aVar.a();
                if (a2 == null || a2.isDestroyed()) {
                    com.meituan.mmp.lib.trace.b.c("clearAllActivity: activity " + aVar.d + " of appId " + aVar.b + " already destroyed, will finish it after recreate");
                } else {
                    com.meituan.mmp.lib.trace.b.c("clearAllActivity: finish activity " + aVar.d + " of appId " + aVar.b + " for appId " + str);
                    a2.finish();
                }
            }
        }
    }
}
