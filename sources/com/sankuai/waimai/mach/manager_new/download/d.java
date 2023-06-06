package com.sankuai.waimai.mach.manager_new.download;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.ptcommonim.protocol.message.PTIMMessageBeanEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.h;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.l;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    public static boolean c;
    private static String e;
    private static String f;
    private static int j;
    private static boolean k;
    private static int l;
    private static int m;
    private static int n;
    public com.sankuai.waimai.mach.manager_new.config.a b;
    private Context d;
    private final Map<String, Object> g;
    private final Map<String, com.sankuai.waimai.mach.manager.cache.e> h;
    private com.sankuai.waimai.mach.manager_new.ioq.c i;

    public d(Context context, h hVar, com.sankuai.waimai.mach.manager_new.ioq.c cVar) {
        boolean z = false;
        Object[] objArr = {context, hVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbc74394d3d21cc3e12a3a2bf54ba090", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbc74394d3d21cc3e12a3a2bf54ba090");
            return;
        }
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.d = context;
        this.i = cVar;
        e = q.a(context, "wm_mach", "mach" + File.separator + PTIMMessageBeanEntity.DATA_KEY_TEMPLATE + File.separator + com.sankuai.waimai.mach.manager_new.common.a.a(hVar.b.b), u.e).getAbsolutePath();
        f = q.a(context, "wm_mach", "machpro" + File.separator + PTIMMessageBeanEntity.DATA_KEY_TEMPLATE + File.separator + com.sankuai.waimai.mach.manager_new.common.a.a(hVar.b.b), u.e).getAbsolutePath();
        l = l.a(context, "waimai_platform", "move_bundle_fail_reboot_time", 0);
        m = m.i();
        int j2 = m.j();
        n = j2;
        if (j2 > 0 && l > n) {
            z = true;
        }
        c = z;
        if (z) {
            com.sankuai.waimai.mach.utils.e.a(d.class, "hasChangeBundleDir", "");
        }
    }

    public static String a() {
        return e;
    }

    public static String b() {
        return f;
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df9c103dae17614036d6fda95b8dd69d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df9c103dae17614036d6fda95b8dd69d");
        }
        return "mach" + File.separator + PTIMMessageBeanEntity.DATA_KEY_TEMPLATE + File.separator + com.sankuai.waimai.mach.manager_new.common.a.a(i.a().f.b);
    }

    private String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417a6e5da8757fccf37bea994542ba89", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417a6e5da8757fccf37bea994542ba89");
        }
        try {
            String[] list = i.a().c.getResources().getAssets().list(d() + File.separator + str);
            if (list != null && list.length != 0) {
                return list[0];
            }
            return null;
        } catch (Exception e2) {
            com.sankuai.waimai.mach.manager_new.common.c.c("获取Assert预置模板失败 " + e2.getMessage());
            return null;
        }
    }

    private void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91202711cc1dd819dda7529da1485256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91202711cc1dd819dda7529da1485256");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("presetMachId", str);
        hashMap.put("path", str2);
        hashMap.put("errorMsg", str3);
        i.a().e().a("mach_v2_preset_load_fail", "预置模版加载失败", str3, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.mach.manager.cache.e a(java.lang.String r20) throws com.sankuai.waimai.mach.manager_new.download.PresetLoadException {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.manager_new.download.d.a(java.lang.String):com.sankuai.waimai.mach.manager.cache.e");
    }

    public final com.sankuai.waimai.mach.manager.cache.e b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e84f46a7da9d41662f57766b968939", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e84f46a7da9d41662f57766b968939");
        }
        com.sankuai.waimai.mach.manager.cache.e eVar = null;
        synchronized (this.g) {
            LinkedList linkedList = new LinkedList();
            for (String str2 : this.g.keySet()) {
                if ((this.g.get(str2) instanceof SoftReference) && ((SoftReference) this.g.get(str2)).get() == null) {
                    linkedList.add(str2);
                }
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    this.g.remove((String) it.next());
                }
            }
            if (this.g.containsKey(str)) {
                Object obj = this.g.get(str);
                if (obj instanceof SoftReference) {
                    eVar = (com.sankuai.waimai.mach.manager.cache.e) ((SoftReference) obj).get();
                } else if (obj instanceof com.sankuai.waimai.mach.manager.cache.e) {
                    eVar = (com.sankuai.waimai.mach.manager.cache.e) obj;
                }
            }
        }
        return eVar;
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3b05cc38929564f3480dbf79b87e69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3b05cc38929564f3480dbf79b87e69");
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (this.g) {
                LinkedList linkedList = new LinkedList();
                for (String str2 : this.g.keySet()) {
                    if (str2.contains(str)) {
                        linkedList.add(str2);
                    }
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        this.g.remove((String) it.next());
                    }
                }
            }
        }
    }

    public final boolean d(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b117d17a575ba0adadfefdd4eed48e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b117d17a575ba0adadfefdd4eed48e")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this.g) {
            if (this.g.containsKey(str)) {
                Object obj = this.g.get(str);
                if (obj instanceof com.sankuai.waimai.mach.manager.cache.e) {
                    return true;
                }
                if (obj instanceof SoftReference) {
                    if (((SoftReference) obj).get() == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    public final com.sankuai.waimai.mach.manager.cache.e e(String str) {
        com.sankuai.waimai.mach.manager.cache.e eVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cceba093003e46873de848501958d384", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.manager.cache.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cceba093003e46873de848501958d384");
        }
        synchronized (this.h) {
            eVar = this.h.containsKey(str) ? this.h.get(str) : null;
        }
        return eVar;
    }

    public static String a(BundleInfo bundleInfo) {
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "646ca7dea3e54b2465eab608a44e5dcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "646ca7dea3e54b2465eab608a44e5dcb");
        }
        return e + File.separator + bundleInfo.getMachId() + File.separator + com.sankuai.waimai.mach.manager_new.common.a.b(bundleInfo);
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c67f49bbefa00c6891fcbfb43e954174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c67f49bbefa00c6891fcbfb43e954174");
            return;
        }
        j++;
        if (k || m <= 0 || j <= m) {
            return;
        }
        l++;
        Context context = com.meituan.android.singleton.b.a;
        int i = l;
        Object[] objArr2 = {context, "waimai_platform", "move_bundle_fail_reboot_time", Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = l.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "611c912af4dd4c6767a53b1daf63ca36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "611c912af4dd4c6767a53b1daf63ca36");
        } else {
            q.a(context, "waimai_platform", 1).a("move_bundle_fail_reboot_time", i);
        }
        k = true;
    }

    public final void a(String str, com.sankuai.waimai.mach.manager.cache.e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b58caf58a63079221ee73d91c062210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b58caf58a63079221ee73d91c062210");
        } else if (eVar.n) {
            synchronized (this.h) {
                this.h.put(str, eVar);
            }
        } else {
            synchronized (this.g) {
                if (!TextUtils.isEmpty(str) && (str.contains("mach_pro_waimai_restaurant_page") || str.contains("mach_pro_waimai_restaurant_food_list_sub_page"))) {
                    this.g.put(str, eVar);
                } else if (m.o()) {
                    this.g.put(str, new SoftReference(eVar));
                } else {
                    this.g.put(str, eVar);
                }
            }
        }
    }
}
