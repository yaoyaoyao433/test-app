package com.meituan.mmp.lib.update;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile boolean c;
    private static volatile ConcurrentHashMap<String, DDResource> b = new ConcurrentHashMap<>();
    private static final Object d = new Object();
    private static final Object e = new Object();

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93174c6d4fb6d485595300848d3636c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93174c6d4fb6d485595300848d3636c5")).booleanValue();
        }
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        if ((PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "52da36d0f53dceb6493dd40fccf01c45", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "52da36d0f53dceb6493dd40fccf01c45")).intValue() : o.a(context, str).getInt("appVersion", 0)) != MMPEnvHelper.getEnvInfo().getAppVersionCode()) {
            Object[] objArr3 = {context, str};
            ChangeQuickRedirect changeQuickRedirect3 = o.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a98df00d1dd81012c41c0f4bb09d3b4d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a98df00d1dd81012c41c0f4bb09d3b4d");
            } else {
                o.a(context, str).edit().remove("latest").remove("current").apply();
            }
            File a2 = p.a(context, str);
            if (a2 != null) {
                s.a(a2.getAbsolutePath());
            }
            int appVersionCode = MMPEnvHelper.getEnvInfo().getAppVersionCode();
            Object[] objArr4 = {context, str, Integer.valueOf(appVersionCode)};
            ChangeQuickRedirect changeQuickRedirect4 = o.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "cc5ac92b7dba5192f5a676780521e88c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "cc5ac92b7dba5192f5a676780521e88c");
            } else {
                o.a(context, str).edit().putInt("appVersion", appVersionCode).apply();
            }
            return true;
        }
        return false;
    }

    public static DDResource a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fea26eea15859591d3bb8b3ca27d8233", RobustBitConfig.DEFAULT_VALUE)) {
            return (DDResource) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fea26eea15859591d3bb8b3ca27d8233");
        }
        if (b.containsKey(str)) {
            return b.get(str);
        }
        return null;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2289e0bd3b410733938f2df19cf4547", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2289e0bd3b410733938f2df19cf4547");
        }
        if (MMPEnvHelper.getBuildInPackage() == null || !MMPEnvHelper.getBuildInPackage().containsKey(str)) {
            return null;
        }
        return MMPEnvHelper.getBuildInPackage().get(str);
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2136e9a3fe4a442d968927a08bebd416", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2136e9a3fe4a442d968927a08bebd416")).booleanValue();
        }
        if (MMPEnvHelper.getBuildInPackage() == null || !MMPEnvHelper.getBuildInPackage().containsKey(str)) {
            a();
            return b.containsKey(str);
        }
        return true;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3332a52332fa9492518ed336108484b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3332a52332fa9492518ed336108484b3");
            return;
        }
        synchronized (d) {
            b.a.a("DDLoader loadFromDDD");
            if (c) {
                return;
            }
            c = true;
            com.meituan.met.mercury.load.core.d a2 = com.meituan.met.mercury.load.core.g.a("mmppreset");
            b.a.a("DDLoader loadFromDDD loadResources");
            a2.a(new com.meituan.met.mercury.load.core.n() { // from class: com.meituan.mmp.lib.update.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.met.mercury.load.core.n
                public final void onSuccess(List<DDResource> list) {
                    Object[] objArr2 = {list};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9928af25d09771efb3b12d42f2bc993c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9928af25d09771efb3b12d42f2bc993c");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("DDLoader onSuccess ");
                    sb.append(list != null ? list.size() : 0);
                    b.a.a(sb.toString());
                    if (!com.meituan.mmp.lib.utils.h.a((List) list)) {
                        for (DDResource dDResource : list) {
                            if (dDResource != null && !TextUtils.isEmpty(dDResource.getName()) && dDResource.getName().length() > 10) {
                                String substring = dDResource.getName().substring(10);
                                c.b.put(substring, dDResource);
                                com.meituan.mmp.lib.trace.b.c("DDLoader onSuccess " + substring + dDResource.getVersion());
                            }
                        }
                    }
                    synchronized (c.e) {
                        c.e.notifyAll();
                    }
                }

                @Override // com.meituan.met.mercury.load.core.n
                public final void onFail(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "821fee9275612d04234bc4522c7087a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "821fee9275612d04234bc4522c7087a4");
                        return;
                    }
                    b.a.c("DDLoader onFail");
                    synchronized (c.e) {
                        c.e.notifyAll();
                    }
                }
            });
            synchronized (e) {
                try {
                    e.wait(1000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            b.a.a("DDLoader wait notify");
        }
    }
}
