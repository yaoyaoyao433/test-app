package com.sankuai.waimai.ugc.creator.utils;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(List<String> list);

        void a(List<String> list, List<String> list2);

        void b(List<String> list);

        void c(List<String> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void a(String str, int i);
    }

    public static void a(final Activity activity, String str, String[] strArr, final a aVar) {
        Object[] objArr = {activity, str, strArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cede33068b0850b6cd1e418fd5819cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cede33068b0850b6cd1e418fd5819cf");
        } else if (strArr.length == 0) {
            aVar.b(new ArrayList());
        } else {
            c cVar = new c(strArr[0]);
            if (strArr.length > 1) {
                c cVar2 = cVar;
                for (int i = 1; i < strArr.length; i++) {
                    cVar2.b = new c(strArr[i]);
                    cVar2 = cVar2.b;
                }
            }
            final HashMap hashMap = new HashMap();
            cVar.a(activity, str, new b() { // from class: com.sankuai.waimai.ugc.creator.utils.i.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.utils.i.b
                public final void a(String str2, int i2) {
                    Object[] objArr2 = {str2, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e2da4183650c0513b44848a68504067", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e2da4183650c0513b44848a68504067");
                    } else {
                        hashMap.put(str2, Integer.valueOf(i2));
                    }
                }

                @Override // com.sankuai.waimai.ugc.creator.utils.i.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87a8303ad3e95861bac7db4f120c3252", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87a8303ad3e95861bac7db4f120c3252");
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        int intValue = ((Integer) entry.getValue()).intValue();
                        if (intValue > 0) {
                            arrayList.add(str2);
                        } else {
                            switch (intValue) {
                                case -15:
                                case -10:
                                case -9:
                                case -7:
                                case -6:
                                case -4:
                                case -3:
                                case 0:
                                    arrayList2.add(str2);
                                    continue;
                                default:
                                    arrayList3.add(str2);
                                    continue;
                            }
                        }
                    }
                    if (aVar == null || !o.a(activity)) {
                        return;
                    }
                    if (arrayList3.size() > 0) {
                        aVar.a(arrayList3);
                    } else if (arrayList2.size() == 0 && arrayList.size() > 0) {
                        aVar.b(arrayList);
                    } else if (arrayList2.size() > 0 && arrayList.size() == 0) {
                        aVar.c(arrayList2);
                    } else if (arrayList2.size() > 0 && arrayList.size() > 0) {
                        aVar.a(arrayList, arrayList2);
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public c b;
        final String c;

        public static /* synthetic */ void a(c cVar, Activity activity, int i, String str, b bVar) {
            Object[] objArr = {activity, Integer.valueOf(i), str, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "aae3b9af098da6655d82b92764b91b56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "aae3b9af098da6655d82b92764b91b56");
                return;
            }
            bVar.a(cVar.c, i);
            if (cVar.b != null) {
                cVar.b.a(activity, str, bVar);
            } else {
                bVar.a();
            }
        }

        public c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56b6688ef8bb2797ad90bcffc9300ba6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56b6688ef8bb2797ad90bcffc9300ba6");
            } else {
                this.c = str;
            }
        }

        public final void a(final Activity activity, final String str, final b bVar) {
            Object[] objArr = {activity, str, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d5876882991df234453d9ef28f25ac1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d5876882991df234453d9ef28f25ac1");
                return;
            }
            try {
                Privacy.createPermissionGuard().a((Context) activity, this.c, str, (com.meituan.android.privacy.interfaces.d) new com.meituan.android.privacy.interfaces.g() { // from class: com.sankuai.waimai.ugc.creator.utils.i.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str2, int i) {
                        Object[] objArr2 = {str2, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5414b6800e1988c3caf2cf9b6c41d5c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5414b6800e1988c3caf2cf9b6c41d5c");
                        } else if (i > 0) {
                            c.a(c.this, activity, i, str, bVar);
                        } else {
                            Privacy.createPermissionGuard().a(activity, c.this.c, str, (com.meituan.android.privacy.interfaces.d) new com.meituan.android.privacy.interfaces.g() { // from class: com.sankuai.waimai.ugc.creator.utils.i.c.1.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.privacy.interfaces.d
                                public final void onResult(String str3, int i2) {
                                    Object[] objArr3 = {str3, Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "799ff4e07a250b965f2d57a23d5e5ed8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "799ff4e07a250b965f2d57a23d5e5ed8");
                                    } else {
                                        c.a(c.this, activity, i2, str, bVar);
                                    }
                                }
                            });
                        }
                    }
                });
            } catch (Exception unused) {
            }
        }
    }
}
