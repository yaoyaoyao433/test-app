package com.sankuai.waimai.machpro.animator;

import android.content.Context;
import android.util.SparseArray;
import com.meituan.msc.modules.api.msi.components.coverview.CoverViewAnimateUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public SparseArray<d> b;
    public SparseArray<d> c;
    public SparseArray<i> d;
    public ArrayList<Integer> e;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51b550bcfc0514a624c20e20cc25ea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51b550bcfc0514a624c20e20cc25ea2");
            return;
        }
        this.b = new SparseArray<>();
        this.c = new SparseArray<>();
        this.d = new SparseArray<>();
        this.e = new ArrayList<>();
        com.sankuai.waimai.mach.utils.i.a(context);
    }

    public final ArrayList<Map<String, Object>> a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad35025978a211a8e44d2463aa08dfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad35025978a211a8e44d2463aa08dfc");
        }
        if (map == null) {
            return null;
        }
        Object obj = map.get("transition");
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "25cae40512d87bfbb4fbffc8d825db9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "25cae40512d87bfbb4fbffc8d825db9b");
        }
        if (obj instanceof String) {
            ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
            for (String str : ((String) obj).split(CommonConstant.Symbol.COMMA)) {
                String[] split = str.trim().split(StringUtil.SPACE);
                int length = split.length;
                HashMap hashMap = new HashMap();
                switch (length) {
                    case 2:
                        hashMap.put("propertyName", split[0]);
                        hashMap.put("animation-duration", Long.valueOf(c.b(split[1])));
                        break;
                    case 3:
                        hashMap.put("propertyName", split[0]);
                        String str2 = split[1];
                        if (str2.contains(CoverViewAnimateUtil.MSCAnimatedParams.EASING_EASE) || str2.equals(CoverViewAnimateUtil.MSCAnimatedParams.EASING_LINEAR)) {
                            hashMap.put("animation-timing-function", str2);
                            hashMap.put("animation-duration", split[2]);
                            break;
                        } else {
                            hashMap.put("animation-duration", Long.valueOf(c.b(str2)));
                            hashMap.put("animation-delay", Long.valueOf(c.b(split[2])));
                            break;
                        }
                        break;
                    case 4:
                        hashMap.put("propertyName", split[0]);
                        hashMap.put("animation-duration", Long.valueOf(c.b(split[1])));
                        hashMap.put("animation-timing-function", split[2]);
                        hashMap.put("animation-delay", Long.valueOf(c.b(split[3])));
                        break;
                }
                arrayList.add(hashMap);
            }
            return arrayList;
        }
        return null;
    }

    public final ArrayList<String> a(ArrayList<Map<String, Object>> arrayList, Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {arrayList, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361dbdf7feb904645f3ed05e7761d202", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361dbdf7feb904645f3ed05e7761d202");
        }
        if (arrayList == null) {
            return null;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<Map<String, Object>> it = arrayList.iterator();
        while (it.hasNext()) {
            String valueOf = String.valueOf(it.next().get("propertyName"));
            if (Objects.equals(valueOf, "transform")) {
                Object obj = map.get(valueOf);
                Object obj2 = map2.get(valueOf);
                if (obj == null) {
                    map.put(valueOf, c.a(obj2));
                }
                if (obj2 == null) {
                    map2.put(valueOf, c.a(obj));
                }
            }
            arrayList2.add(valueOf);
        }
        return arrayList2;
    }

    public final void a(com.facebook.yoga.d dVar, Map<String, Object> map, Map<String, Object> map2) {
        Object[] objArr = {dVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ee2d7427894bc5b5795eb63996caab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ee2d7427894bc5b5795eb63996caab");
            return;
        }
        try {
            if (this.b.get(dVar.hashCode()) != null) {
                this.b.remove(dVar.hashCode());
            }
            this.b.put(dVar.hashCode(), new e(dVar, map, map2));
        } catch (Exception unused) {
            com.sankuai.waimai.machpro.util.a.a("MPAnim", "CSSAnim init Error");
        }
    }
}
