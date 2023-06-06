package com.meituan.msc.modules.container.fusion;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.y;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.AppBrandMSCActivity;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.container.fusion.c;
import com.meituan.msc.modules.reporter.g;
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af88ee5b6313a2586caa91f1a8f6733c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af88ee5b6313a2586caa91f1a8f6733c")).booleanValue();
        }
        Object[] objArr2 = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c5d8502daa2c5986e5d172362b68d144", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c5d8502daa2c5986e5d172362b68d144")).booleanValue();
        } else {
            Class<? extends MSCActivity> b2 = b(context, intent);
            z = (b2 == null || AppBrandMSCActivity.class.isAssignableFrom(b2)) ? false : true;
        }
        if (z) {
            String a2 = a(intent);
            if (TextUtils.isEmpty(a2) || (aVar = c.get(a2)) == null) {
                return false;
            }
            String a3 = y.a(intent, "targetPath");
            if (TextUtils.isEmpty(a3)) {
                return aVar.b;
            }
            return aVar.a.contains(am.b(a3));
        }
        return false;
    }

    public static String a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab5d66415a3f245f56f43f98e98ace19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab5d66415a3f245f56f43f98e98ace19");
        }
        String a2 = y.a(intent, "appId");
        return TextUtils.isEmpty(a2) ? MSCEnvHelper.getDefaultAppID() : a2;
    }

    public static Class<? extends MSCActivity> b(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a2a351b63aeea41094f7f545980bb9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a2a351b63aeea41094f7f545980bb9f");
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            return null;
        }
        try {
            Class cls = Class.forName(resolveActivity.activityInfo.name);
            if (MSCActivity.class.isAssignableFrom(cls)) {
                if (TextUtils.equals(resolveActivity.activityInfo.processName, ProcessUtils.getCurrentProcessName(context))) {
                    return cls;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    public static void a(String str, Intent intent) {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        c.a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be055f7c6e5bab4aa92f607b2f03605d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be055f7c6e5bab4aa92f607b2f03605d");
        } else if (MSCEnvHelper.isInited()) {
            Iterator<c.a> it = c.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c.a next = it.next();
                if (TextUtils.equals(next.b, str)) {
                    aVar = next;
                    break;
                }
            }
            if (aVar == null) {
                g.b("IFusionPageManager", "returnToFirstActivity: no living & reusable activity found for appId ", str);
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
                c.d.put(aVar2, intent);
                MSCActivity a2 = aVar2.a();
                if (a2 == null || a2.isDestroyed()) {
                    g.b("clearToFirstActivity: activity ", Integer.valueOf(aVar2.d), " of appId ", aVar2.b, " already destroyed, will finish it after recreate");
                } else {
                    g.b("clearToFirstActivity: finish activity ", Integer.valueOf(aVar2.d), " of appId ", aVar2.b, " for appId ", str);
                    a2.finish();
                }
            }
        }
    }

    public static void b(String str, Intent intent) {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01452e6628f6375f25f84127b5e8c991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01452e6628f6375f25f84127b5e8c991");
        } else if (MSCEnvHelper.isInited()) {
            for (int size = c.b.size() - 1; size >= 0; size--) {
                c.a aVar = c.b.get(size);
                if (TextUtils.equals(aVar.b, str)) {
                    aVar.e = true;
                }
                c.d.put(aVar, intent);
                MSCActivity a2 = aVar.a();
                if (a2 == null || a2.isDestroyed()) {
                    g.b("clearAllActivity: activity ", Integer.valueOf(aVar.d), " of appId ", aVar.b, " already destroyed, will finish it after ", "recreate");
                } else {
                    g.b("clearAllActivity: finish activity ", Integer.valueOf(aVar.d), " of appId ", aVar.b, " for appId ", str);
                    a2.finish();
                }
            }
        }
    }
}
