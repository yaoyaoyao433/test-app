package com.sankuai.waimai.store.poi.list.newp.bubble;

import android.text.TextUtils;
import android.text.format.Time;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Map a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4f480bc4570b2d8fbdba4f3fbec0ba1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4f480bc4570b2d8fbdba4f3fbec0ba1");
        }
        String b = ab.b().b(b.a(), "sc_bubble_cache", "");
        if (TextUtils.isEmpty(b)) {
            return new HashMap();
        }
        try {
            return (Map) i.a(b, new TypeToken<Map<String, PrimaryFilterCondList.Bubble>>() { // from class: com.sankuai.waimai.store.poi.list.newp.bubble.a.1
            }.getType());
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.e("BubbleHelper", th.getMessage(), new Object[0]);
            return new HashMap();
        }
    }

    public static void a(Map<String, PrimaryFilterCondList.Bubble> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c4c8b8271edc60be0cac72b42829427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c4c8b8271edc60be0cac72b42829427");
        } else if (map != null) {
            ab.b().a(b.a(), "sc_bubble_cache", i.a(map));
        }
    }

    public static void a(PrimaryFilterCondList.Bubble bubble) {
        Object[] objArr = {bubble};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7021b70a90f72d56fc134eed570b9771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7021b70a90f72d56fc134eed570b9771");
            return;
        }
        Map a2 = a();
        if (a2 == null || bubble == null) {
            return;
        }
        bubble.clickTime = c.b();
        PrimaryFilterCondList.Bubble bubble2 = (PrimaryFilterCondList.Bubble) a2.get(bubble.strategyId);
        if (bubble2 != null) {
            bubble2.clickTime = c.b();
            bubble2.isShow = false;
        } else {
            a2.put(bubble.strategyId, bubble);
        }
        a(a2);
    }

    public static boolean a(List<PrimaryFilterCondList> list, int i) {
        boolean z;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27f0ef69e8efa2c87d7d700465db24c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27f0ef69e8efa2c87d7d700465db24c2")).booleanValue();
        }
        PrimaryFilterCondList primaryFilterCondList = (PrimaryFilterCondList) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
        if (primaryFilterCondList == null || primaryFilterCondList.bubble == null) {
            return false;
        }
        PrimaryFilterCondList.Bubble bubble = primaryFilterCondList.bubble;
        Map a2 = a();
        Object[] objArr2 = {bubble, a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9ef5e2387e80953d67102c7cf9034dd0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9ef5e2387e80953d67102c7cf9034dd0")).booleanValue();
        }
        if (bubble == null || a2 == null || c.b() > bubble.etime * 1000 || c.b() < bubble.stime * 1000) {
            return false;
        }
        PrimaryFilterCondList.Bubble bubble2 = (PrimaryFilterCondList.Bubble) a2.get(bubble.strategyId);
        if (bubble2 == null) {
            if (bubble.strategyId != null) {
                a2.put(bubble.strategyId, bubble);
                return true;
            }
            return false;
        }
        bubble2.parseBubble(bubble);
        if (bubble2.clickTime <= 0) {
            bubble2.isShow = true;
            return true;
        } else if (bubble2.showLoop()) {
            long j = bubble2.clickTime;
            Object[] objArr3 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "67138ed8dc69361e5b69982ef7ca0616", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "67138ed8dc69361e5b69982ef7ca0616")).booleanValue();
            } else {
                Time time = new Time();
                time.set(j);
                int i2 = time.year;
                int i3 = time.month;
                int i4 = time.monthDay;
                time.set(c.b());
                z = i2 == time.year && i3 == time.month && i4 == time.monthDay;
            }
            bubble2.isShow = !z;
            return !z;
        } else {
            bubble2.isShow = false;
            return false;
        }
    }
}
