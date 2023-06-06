package com.sankuai.waimai.store.search.ui.result.datamarket;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.search.model.OasisModule;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c o;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final Set<String> i;
    public final Set<String> j;
    private Set<String> k;
    private Set<String> l;
    private Set<Integer> m;
    private Set<String> n;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ec877df27b836e6e62eb8ac38a25b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ec877df27b836e6e62eb8ac38a25b0");
            return;
        }
        this.i = new HashSet();
        this.j = new HashSet();
    }

    public static c a() {
        Set<String> set;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c4e8e8efb2ace9f0a1764c5033806f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c4e8e8efb2ace9f0a1764c5033806f1");
        }
        if (o == null) {
            synchronized (c.class) {
                if (o == null) {
                    c cVar = new c();
                    o = cVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "81b4f028e023822035b76dc4df0cd9c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "81b4f028e023822035b76dc4df0cd9c8");
                    } else {
                        a a2 = a.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "0df81aed1a03dfc2f4b9a50062546f9e", RobustBitConfig.DEFAULT_VALUE)) {
                            set = (Set) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "0df81aed1a03dfc2f4b9a50062546f9e");
                        } else {
                            if (a2.c.isEmpty()) {
                                a2.c();
                            }
                            set = a2.c;
                        }
                        cVar.k = set;
                        cVar.l = a.a().m();
                        cVar.m = a.a().n();
                        cVar.n = a.a().o();
                    }
                }
            }
        }
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.android.common.statistics.entity.EventInfo r19) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.ui.result.datamarket.c.a(com.meituan.android.common.statistics.entity.EventInfo):void");
    }

    public final void a(List<OasisModule> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e865475d3b016f4aa1c7c561f210af9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e865475d3b016f4aa1c7c561f210af9b");
        } else if (a(list)) {
            String str = z ? DefaultHeaderService.KEY_DRUG : DefaultHeaderService.KEY_STORE;
            if (this.g) {
                this.g = false;
                StoreSearchChainErrorType storeSearchChainErrorType = StoreSearchChainErrorType.ProcessEnd;
                com.sankuai.waimai.store.util.monitor.c.b(storeSearchChainErrorType, null, str + "qv");
            }
            StoreSearchChainErrorType storeSearchChainErrorType2 = StoreSearchChainErrorType.ProcessEnd;
            com.sankuai.waimai.store.util.monitor.c.b(storeSearchChainErrorType2, null, str + "normal");
        }
    }

    public boolean a(List<OasisModule> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09da2ca357bd1c83a4898522cb7f74aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09da2ca357bd1c83a4898522cb7f74aa")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return false;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i = 0; i < a2; i++) {
            OasisModule oasisModule = (OasisModule) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (oasisModule != null) {
                String str = oasisModule.templateType == 0 ? oasisModule.nativeTemplateId : oasisModule.machTemplateId;
                if (!TextUtils.isEmpty(str) && this.n.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
