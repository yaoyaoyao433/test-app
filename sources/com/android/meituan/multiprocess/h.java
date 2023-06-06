package com.android.meituan.multiprocess;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class h {
    private static volatile h c;
    ExecutorService b;
    private String d = "";
    Map<String, List<Object>> a = new ConcurrentHashMap();

    public static h a() {
        if (c == null) {
            synchronized (h.class) {
                if (c == null) {
                    c = new h();
                }
            }
        }
        return c;
    }

    private h() {
        this.b = null;
        this.b = com.sankuai.android.jarvis.c.a("IPCEvent-Thread");
    }

    private boolean a(String str, String str2, WrapperParcelable wrapperParcelable) {
        ArrayList arrayList;
        if (str2 == null || str2.length() == 0 || wrapperParcelable == null) {
            return false;
        }
        List<Object> list = this.a.get(str2);
        if (list == null || list.isEmpty()) {
            return true;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return true;
    }

    static /* synthetic */ boolean a(h hVar, String str, Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        hVar.a(bundle.getString("__inner_key_from"), str, (WrapperParcelable) bundle.getParcelable("__inner_key_data"));
        return true;
    }
}
