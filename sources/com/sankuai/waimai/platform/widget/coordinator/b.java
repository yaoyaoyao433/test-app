package com.sankuai.waimai.platform.widget.coordinator;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static Map<String, List<WeakReference<ExpandableHeaderBehavior.c>>> b = new HashMap();

    public static void a(String str, ExpandableHeaderBehavior.c cVar) {
        List<WeakReference<ExpandableHeaderBehavior.c>> list;
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71da155fca094721b98efee83ba9a734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71da155fca094721b98efee83ba9a734");
        } else if (TextUtils.isEmpty(str) || cVar == null) {
        } else {
            if (b.containsKey(str)) {
                list = b.get(str);
            } else {
                ArrayList arrayList = new ArrayList();
                b.put(str, arrayList);
                list = arrayList;
            }
            list.add(new WeakReference<>(cVar));
        }
    }

    public static void b(String str, ExpandableHeaderBehavior.c cVar) {
        ExpandableHeaderBehavior.c cVar2;
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04830aca3656a2f224f33eb785f39685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04830aca3656a2f224f33eb785f39685");
        } else if (!TextUtils.isEmpty(str) && cVar != null && b.containsKey(str)) {
            List<WeakReference<ExpandableHeaderBehavior.c>> list = b.get(str);
            if (com.sankuai.waimai.foundation.utils.b.b(list)) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                WeakReference<ExpandableHeaderBehavior.c> weakReference = list.get(size);
                if (weakReference == null || (cVar2 = weakReference.get()) == null) {
                    list.remove(size);
                } else if (cVar2 == cVar) {
                    list.remove(size);
                }
            }
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, int i5) {
        ExpandableHeaderBehavior.c cVar;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a602d45173319aaad3c47deb109dc9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a602d45173319aaad3c47deb109dc9d");
        } else if (!TextUtils.isEmpty(str) && b.containsKey(str)) {
            List<WeakReference<ExpandableHeaderBehavior.c>> list = b.get(str);
            if (com.sankuai.waimai.foundation.utils.b.b(list)) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                WeakReference<ExpandableHeaderBehavior.c> weakReference = list.get(size);
                if (weakReference == null || (cVar = weakReference.get()) == null) {
                    list.remove(size);
                } else {
                    cVar.a(i, i2, i3, i4, i5);
                }
            }
        }
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4110ca0baacd0474f89f7fd444dfcf7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4110ca0baacd0474f89f7fd444dfcf7d");
        } else if (!TextUtils.isEmpty(str) && b.containsKey(str)) {
            List<WeakReference<ExpandableHeaderBehavior.c>> list = b.get(str);
            if (com.sankuai.waimai.foundation.utils.b.b(list)) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                WeakReference<ExpandableHeaderBehavior.c> weakReference = list.get(size);
                if (weakReference == null || weakReference.get() == null) {
                    list.remove(size);
                }
            }
        }
    }
}
