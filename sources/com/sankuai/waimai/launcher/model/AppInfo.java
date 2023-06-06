package com.sankuai.waimai.launcher.model;

import android.app.Activity;
import android.app.Service;
import android.support.annotation.MainThread;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.router.method.Func1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AppInfo implements Func1<Void, Boolean> {
    private static final int MAX_BROWSE_URL_COUNT = 10;
    private static final int MAX_MRN_URL_COUNT = 10;
    private static final int MAX_RECENT_PAGE_COUNT;
    private static final int STARTUP_TRACK_SIZE = 2;
    public static final String WAIMAI_APP_ID = "11";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final LinkedList<String> sBroadcastActions;
    private static long sCityId = 0;
    private static String sCityName = "";
    private static final LinkedList<String> sKNBUrls;
    private static final LinkedList<String> sMRNUrls;
    private static final LinkedList<String> sPageName;
    private static final LinkedList<String> sServiceName;
    private static final ArrayList<Class> sStartupPageTrack;

    static {
        MAX_RECENT_PAGE_COUNT = com.sankuai.meituan.takeoutnew.a.f ? 9999 : 1000;
        sPageName = new LinkedList<>();
        sServiceName = new LinkedList<>();
        sKNBUrls = new LinkedList<>();
        sMRNUrls = new LinkedList<>();
        sBroadcastActions = new LinkedList<>();
        sStartupPageTrack = new ArrayList<>(2);
    }

    @MainThread
    public static void onActivityCreate(Class<? extends Activity> cls) {
        boolean z = false;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "05449b7040649d188e307ed63cfdcd3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "05449b7040649d188e307ed63cfdcd3c");
        } else if (cls == null) {
        } else {
            addActivePageName(cls.getSimpleName(), false);
            if (sStartupPageTrack.size() < 2) {
                com.sankuai.waimai.launcher.config.a a = com.sankuai.waimai.launcher.config.a.a();
                Object[] objArr2 = {cls};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.launcher.config.a.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "4d5aa5a89f9721211fb1afe34905c122", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "4d5aa5a89f9721211fb1afe34905c122")).booleanValue();
                } else if (a.b != null) {
                    z = a.b.b(cls);
                }
                if (z) {
                    return;
                }
                sStartupPageTrack.add(cls);
            }
        }
    }

    @MainThread
    public static void onActivityStart(Class<? extends Activity> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e66477a8974dcc2ef61296894294495f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e66477a8974dcc2ef61296894294495f");
        } else if (cls == null) {
        } else {
            addActivePageName(cls.getSimpleName(), true);
        }
    }

    @MainThread
    public static void onFragmentVisibilityChanged(Class<? extends Fragment> cls, boolean z) {
        Object[] objArr = {cls, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb13cd6f083425a0145a1d372cb5b45f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb13cd6f083425a0145a1d372cb5b45f");
        } else if (cls != null && z) {
            addActivePageName(cls.getSimpleName(), true);
        }
    }

    @MainThread
    public static void onKNBWebViewCreate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e709fb9e7561cc2ccf4cc1df722e2e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e709fb9e7561cc2ccf4cc1df722e2e70");
            return;
        }
        sKNBUrls.add(str);
        if (sKNBUrls.size() > 10) {
            sKNBUrls.removeFirst();
        }
    }

    @MainThread
    public static void onMRNCreate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fc82fa8b5b66e1b44843bccca662793", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fc82fa8b5b66e1b44843bccca662793");
            return;
        }
        sMRNUrls.add(str);
        if (sMRNUrls.size() > 10) {
            sMRNUrls.removeFirst();
        }
    }

    public static void onSendBroadcast(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb9fb03f8113965c10fb6c41c0a595cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb9fb03f8113965c10fb6c41c0a595cc");
            return;
        }
        sBroadcastActions.add(str);
        if (com.sankuai.meituan.takeoutnew.a.f) {
            com.sankuai.waimai.foundation.utils.log.a.c("AppInfo", "sending broadcast: %s", str);
        }
        if (sBroadcastActions.size() > 10) {
            sBroadcastActions.removeFirst();
        }
    }

    @MainThread
    private static void addActivePageName(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b6e4ef39a74d589fb9fb8fd770d3f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b6e4ef39a74d589fb9fb8fd770d3f72");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            int size = sPageName.size();
            if (z && size > 0 && TextUtils.equals(str, sPageName.getLast())) {
                return;
            }
            if (size == MAX_RECENT_PAGE_COUNT) {
                sPageName.removeFirst();
            }
            sPageName.add(str);
        }
    }

    public static String getRecentPageNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "adb2cd412ccc3515ede20656bf11e2ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "adb2cd412ccc3515ede20656bf11e2ac");
        }
        try {
            int size = sPageName.size();
            if (size == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder(size * 15);
            Iterator<String> descendingIterator = sPageName.descendingIterator();
            sb.append(descendingIterator.next());
            while (descendingIterator.hasNext()) {
                String next = descendingIterator.next();
                if (!TextUtils.isEmpty(next)) {
                    sb.append(" < ");
                    sb.append(next);
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static JSONArray getBroadcastActions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf51d000b439fb625cf01fdbe2004edb", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf51d000b439fb625cf01fdbe2004edb");
        }
        try {
            return new JSONArray((Collection) sBroadcastActions);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONArray getUrlHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff1237bc7bb78f3cfd16f3428144deda", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff1237bc7bb78f3cfd16f3428144deda");
        }
        try {
            return new JSONArray((Collection) sKNBUrls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONArray getMRNUrlHistory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e6b6b31d6ca7c8d6fe4a9d86445aee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e6b6b31d6ca7c8d6fe4a9d86445aee6");
        }
        try {
            return new JSONArray((Collection) sMRNUrls);
        } catch (Exception unused) {
            return null;
        }
    }

    @Deprecated
    public static long getCityID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0bc71ef4128a12f200651b93c87f626", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0bc71ef4128a12f200651b93c87f626")).longValue();
        }
        if (sCityId != 0) {
            return sCityId;
        }
        long a = g.a();
        sCityId = a;
        return a;
    }

    public static String getCityName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a55e6cb90d3da6dd402b7b8388ff42a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a55e6cb90d3da6dd402b7b8388ff42a");
        }
        if (!TextUtils.isEmpty(sCityName)) {
            return sCityName;
        }
        String b = g.b();
        sCityName = b;
        return b;
    }

    public static void addCreatedService(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38564b7040c3b7a7249b9633f19aeb64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38564b7040c3b7a7249b9633f19aeb64");
            return;
        }
        if (sServiceName.size() >= MAX_RECENT_PAGE_COUNT) {
            sServiceName.removeFirst();
        }
        LinkedList<String> linkedList = sServiceName;
        linkedList.add("+" + service.getClass().getName());
    }

    public static void addDestroyedService(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1580aed755dd5936eccffa9dc43593ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1580aed755dd5936eccffa9dc43593ce");
            return;
        }
        if (sServiceName.size() >= MAX_RECENT_PAGE_COUNT) {
            sServiceName.removeFirst();
        }
        LinkedList<String> linkedList = sServiceName;
        linkedList.add(CommonConstant.Symbol.MINUS + service.getClass().getName());
    }

    public static String getRecentServiceNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8d9642f3effd93f253fac3f1c7717ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8d9642f3effd93f253fac3f1c7717ce");
        }
        if (sServiceName.isEmpty()) {
            return null;
        }
        Iterator<String> descendingIterator = sServiceName.descendingIterator();
        StringBuilder sb = new StringBuilder();
        while (descendingIterator.hasNext()) {
            sb.append(descendingIterator.next());
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (com.sankuai.waimai.business.page.homepage.MainActivity.class == com.sankuai.waimai.launcher.model.AppInfo.sStartupPageTrack.get(1)) goto L14;
     */
    @Override // com.sankuai.waimai.router.method.Func1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean call(java.lang.Void r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.waimai.launcher.model.AppInfo.changeQuickRedirect
            java.lang.String r10 = "89344bd98c1c430b0b7f6c191b1bd1f2"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r14
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r14, r9, r10)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            return r14
        L1e:
            java.util.ArrayList<java.lang.Class> r14 = com.sankuai.waimai.launcher.model.AppInfo.sStartupPageTrack
            int r14 = r14.size()
            r1 = 2
            if (r14 != r1) goto L6c
            com.sankuai.waimai.launcher.config.a r14 = com.sankuai.waimai.launcher.config.a.a()
            java.util.ArrayList<java.lang.Class> r1 = com.sankuai.waimai.launcher.model.AppInfo.sStartupPageTrack
            java.lang.Object r1 = r1.get(r9)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.launcher.config.a.a
            java.lang.String r12 = "cb49a6e960605dd335c66eba78ea013c"
            r5 = 0
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r3 = r14
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L53
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r10, r14, r11, r9, r12)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            goto L5f
        L53:
            com.sankuai.waimai.launcher.config.a$a r2 = r14.b
            if (r2 == 0) goto L5e
            com.sankuai.waimai.launcher.config.a$a r14 = r14.b
            boolean r14 = r14.a(r1)
            goto L5f
        L5e:
            r14 = 0
        L5f:
            if (r14 == 0) goto L6c
            java.lang.Class<com.sankuai.waimai.business.page.homepage.MainActivity> r14 = com.sankuai.waimai.business.page.homepage.MainActivity.class
            java.util.ArrayList<java.lang.Class> r1 = com.sankuai.waimai.launcher.model.AppInfo.sStartupPageTrack
            java.lang.Object r1 = r1.get(r0)
            if (r14 != r1) goto L6c
            goto L6d
        L6c:
            r0 = 0
        L6d:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.launcher.model.AppInfo.call(java.lang.Void):java.lang.Boolean");
    }
}
