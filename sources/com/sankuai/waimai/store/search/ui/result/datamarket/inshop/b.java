package com.sankuai.waimai.store.search.ui.result.datamarket.inshop;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.ab;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private final Map<String, LinkedList<a>> c;
    private final DateFormat d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e09f50244149b1f177cd0b5ce2e261d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e09f50244149b1f177cd0b5ce2e261d");
            return;
        }
        this.c = new HashMap();
        this.d = DateFormat.getDateInstance();
    }

    public static b a() {
        Set<String> set;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8a11a033f6e256aae76f23cf31b92a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8a11a033f6e256aae76f23cf31b92a6");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b bVar = new b();
                    b = bVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "03de95bea7df5b3c393d45024b9fe97b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "03de95bea7df5b3c393d45024b9fe97b");
                    } else {
                        com.sankuai.waimai.store.search.ui.result.datamarket.a a2 = com.sankuai.waimai.store.search.ui.result.datamarket.a.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.ui.result.datamarket.a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "3e944f560403f92708ddd2d428ea31ee", RobustBitConfig.DEFAULT_VALUE)) {
                            set = (Set) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "3e944f560403f92708ddd2d428ea31ee");
                        } else {
                            if (a2.e.isEmpty()) {
                                a2.h();
                            }
                            set = a2.e;
                        }
                        for (String str : set) {
                            if (!TextUtils.isEmpty(str)) {
                                bVar.c.put(str, null);
                            }
                        }
                    }
                }
            }
        }
        return b;
    }

    public final void a(@NonNull EventInfo eventInfo) {
        boolean z = true;
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4951c1661bda0f56170f4d4df6caaa4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4951c1661bda0f56170f4d4df6caaa4b");
            return;
        }
        Object obj = eventInfo.val_lab.get("stid");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = eventInfo.val_lab.get("poisearch_global_id");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        a(str, str2);
        if (TextUtils.equals(eventInfo.val_bid, "b_bx5fhk5t")) {
            Object obj3 = eventInfo.val_lab.get("has_result");
            boolean z2 = (obj3 instanceof Number) && ((Number) obj3).intValue() == 1;
            z = ((obj3 instanceof String) && TextUtils.equals((String) obj3, "1")) ? false : false;
            if (z2 || z) {
                b(str, str2);
            }
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da639dd097ae63de3404e0093a0fb7e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da639dd097ae63de3404e0093a0fb7e2");
        } else if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                a(str);
                return;
            }
            for (Map.Entry<String, LinkedList<a>> entry : this.c.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && str.contains(entry.getKey())) {
                    LinkedList<a> value = entry.getValue();
                    if (value == null) {
                        value = new LinkedList<>();
                    }
                    if (!a(value, str2)) {
                        if (value.size() == 10) {
                            value.removeLast();
                        }
                        value.addFirst(new a(str2, true));
                        this.c.put(entry.getKey(), value);
                        HashMap hashMap = new HashMap();
                        hashMap.put("desc", entry.getKey());
                        com.sankuai.waimai.store.util.monitor.c.a(InShopChainExp.Denominator, null, null, hashMap);
                    }
                }
            }
        }
    }

    private boolean a(@NonNull LinkedList<a> linkedList, String str) {
        Object[] objArr = {linkedList, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4afa1b50e59deb60b1d0b69d19d05814", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4afa1b50e59deb60b1d0b69d19d05814")).booleanValue();
        }
        Iterator<a> it = linkedList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().a, str)) {
                return true;
            }
        }
        return false;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec23de9b64e24571979cc6bd8bf059a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec23de9b64e24571979cc6bd8bf059a3");
        } else if (!TextUtils.isEmpty(str)) {
            String format = this.d.format(new Date());
            for (Map.Entry<String, LinkedList<a>> entry : this.c.entrySet()) {
                if (entry != null && !TextUtils.isEmpty(entry.getKey()) && str.contains(entry.getKey()) && !TextUtils.equals(format, ab.b().b(com.sankuai.waimai.store.util.b.a(), entry.getKey(), (String) null))) {
                    ab.b().a(com.sankuai.waimai.store.util.b.a(), entry.getKey(), format);
                    HashMap hashMap = new HashMap();
                    hashMap.put("desc", entry.getKey());
                    com.sankuai.waimai.store.util.monitor.c.a(InShopChainExp.DenominatorError, null, null, hashMap);
                }
            }
        }
    }

    private void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b35db8c6eb2c390ef1ee45d44c376ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b35db8c6eb2c390ef1ee45d44c376ac");
        } else if (!TextUtils.isEmpty(str)) {
            for (Map.Entry<String, LinkedList<a>> entry : this.c.entrySet()) {
                if (entry != null && entry.getValue() != null && !TextUtils.isEmpty(entry.getKey()) && str.contains(entry.getKey())) {
                    Iterator<a> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        a next = it.next();
                        if (next.b && TextUtils.equals(next.a, str2)) {
                            next.b = false;
                            HashMap hashMap = new HashMap();
                            hashMap.put("desc", entry.getKey());
                            com.sankuai.waimai.store.util.monitor.c.a(InShopChainExp.Molecule, null, null, hashMap);
                        }
                    }
                }
            }
        }
    }
}
