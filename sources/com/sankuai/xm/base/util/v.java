package com.sankuai.xm.base.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Pair;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19fb2446953dcf782c3785620a67e10e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19fb2446953dcf782c3785620a67e10e")).booleanValue() : a(context, PermissionGuard.PERMISSION_MICROPHONE, "jcyf-e4b399808a333f25", z);
    }

    public static boolean b(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87ca30f386f82f7d48523fba4820f0cd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87ca30f386f82f7d48523fba4820f0cd")).booleanValue() : a(context, PermissionGuard.PERMISSION_STORAGE_WRITE, "jcyf-e4b399808a333f25", z);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20ad01c3fefd2fd0be41121628c8ecdd", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20ad01c3fefd2fd0be41121628c8ecdd") : new a();
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "149b4d5749bfa2ee7aa7160dff544d1c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "149b4d5749bfa2ee7aa7160dff544d1c")).booleanValue();
        }
        com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard == null) {
            return false;
        }
        if (createPermissionGuard.a(context, str, str2) > 0) {
            return true;
        }
        if (z) {
            createPermissionGuard.a(com.sankuai.xm.base.lifecycle.d.d().b(), str, str2, new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.xm.base.util.v.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str3, int i) {
                    Object[] objArr2 = {str3, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "224e1217f888080554e46385dd588412", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "224e1217f888080554e46385dd588412");
                    } else {
                        com.sankuai.xm.log.c.b("PermissionUtils", "req onResult: perm: %s, code: %s", str3, Integer.valueOf(i));
                    }
                }
            });
        }
        return false;
    }

    static void a(final Map<String, Pair<String, Runnable>> map, final Runnable runnable) {
        Object[] objArr = {map, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68686c524ab743df5580c5aa58b14a7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68686c524ab743df5580c5aa58b14a7a");
            return;
        }
        com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard == null) {
            com.sankuai.xm.log.c.d("PermissionUtils", "oneByOneRequest permGuard is null.", new Object[0]);
        } else if (map == null || map.isEmpty()) {
            if (runnable != null) {
                runnable.run();
            }
            com.sankuai.xm.log.c.b("PermissionUtils", "oneByOneRequest no more permission is need permitted, run final task.", new Object[0]);
        } else {
            Application a2 = com.sankuai.xm.base.lifecycle.d.d().a();
            String next = map.keySet().iterator().next();
            final Pair<String, Runnable> remove = map.remove(next);
            if (remove == null) {
                a(map, runnable);
            } else if (createPermissionGuard.a(a2, next, (String) remove.first) > 0) {
                a(map, runnable);
            } else {
                Activity b = com.sankuai.xm.base.lifecycle.d.d().b();
                if (!ActivityUtils.a(b)) {
                    com.sankuai.xm.log.c.d("PermissionUtils", "oneByOneRequest invalid activity", new Object[0]);
                } else {
                    createPermissionGuard.a(b, next, (String) remove.first, new com.meituan.android.privacy.interfaces.d() { // from class: com.sankuai.xm.base.util.v.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.privacy.interfaces.d
                        public final void onResult(String str, int i) {
                            Object[] objArr2 = {str, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "896c1948c68a5365f3420b53784aa1ff", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "896c1948c68a5365f3420b53784aa1ff");
                            } else if (i <= 0) {
                                if (remove.second != null) {
                                    ((Runnable) remove.second).run();
                                }
                            } else {
                                v.a(map, runnable);
                            }
                        }
                    });
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public Runnable b;
        private Map<String, Pair<String, Runnable>> c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba8954c207c04edd08ae491e068e706a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba8954c207c04edd08ae491e068e706a");
            } else {
                this.c = new LinkedHashMap();
            }
        }

        public final a a(String str, String str2, Runnable runnable) {
            Object[] objArr = {str, str2, runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b984d9a7f74ee2e0a0246eb970406114", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b984d9a7f74ee2e0a0246eb970406114");
            }
            this.c.put(str, Pair.create(str2, runnable));
            return this;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb4dd3e5b331fb6e95cb5ff7bac6ae78", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb4dd3e5b331fb6e95cb5ff7bac6ae78");
                return;
            }
            com.sankuai.xm.log.c.b("PermissionUtils", "request request permission: %s", this.c);
            v.a(this.c, this.b);
        }
    }
}
