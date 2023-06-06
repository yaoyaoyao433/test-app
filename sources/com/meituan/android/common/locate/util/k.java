package com.meituan.android.common.locate.util;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class k {
    private static volatile k b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static List<String> e;
    private Set<a> a;
    private boolean c;
    private boolean d;

    /* loaded from: classes2.dex */
    public interface a {
        void onAppBackground();

        void onAppForeground();
    }

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add("com.meituan.grocery.bd");
        e.add("com.meituan.grocery.gw");
        e.add("com.meituan.grocery.gh");
        e.add("com.dianping.v1");
        e.add("com.sankuai.meituan.takeoutnew");
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65be63d1b5025be28910151939ac7602", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65be63d1b5025be28910151939ac7602");
            return;
        }
        this.a = Collections.synchronizedSet(new HashSet());
        this.c = true;
        this.d = true;
    }

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3164ff5733c57f2ed2544b96e56aaee", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3164ff5733c57f2ed2544b96e56aaee");
        }
        if (b == null) {
            synchronized (k.class) {
                if (b == null) {
                    b = new k();
                }
            }
        }
        return b;
    }

    public synchronized void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33a1163f4c4e741afe08eec85885c96c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33a1163f4c4e741afe08eec85885c96c");
        } else if (aVar == null) {
        } else {
            this.a.add(aVar);
        }
    }

    public synchronized boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62afbf75a109b564bc0f83bd8df46e83", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62afbf75a109b564bc0f83bd8df46e83")).booleanValue();
        } else if (!this.d) {
            return this.c;
        } else {
            this.d = false;
            if (context == null) {
                this.c = false;
                return false;
            }
            if (TextUtils.isEmpty(com.meituan.android.common.locate.provider.l.a().b())) {
                com.meituan.android.common.locate.provider.l.a(context);
            }
            String b2 = com.meituan.android.common.locate.provider.l.a().b();
            if (TextUtils.isEmpty(b2)) {
                return this.c;
            } else if (b2.equals("com.sankuai.meituan")) {
                this.c = false;
                return false;
            } else if (b2.equals("com.sankuai.youxuan")) {
                this.c = false;
                return false;
            } else if (e.contains(b2)) {
                this.c = false;
                return false;
            } else {
                return this.c;
            }
        }
    }

    public synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7012c6c486c0c5252d8e022d71281fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7012c6c486c0c5252d8e022d71281fb");
            return;
        }
        this.c = true;
        this.d = false;
        for (a aVar : this.a) {
            aVar.onAppForeground();
        }
    }

    public synchronized void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37305584638f1367a0cada1917588e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37305584638f1367a0cada1917588e13");
        } else if (aVar == null) {
        } else {
            this.a.remove(aVar);
        }
    }

    public synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e85ca015fb709f5efa289d721f7216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e85ca015fb709f5efa289d721f7216");
            return;
        }
        this.c = false;
        this.d = false;
        for (a aVar : this.a) {
            aVar.onAppBackground();
        }
    }

    public boolean d() {
        return this.c;
    }
}
