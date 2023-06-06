package com.sankuai.waimai.alita.core.intention;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.config.observabledata.a;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements a.InterfaceC0700a<String> {
    public static ChangeQuickRedirect a;
    private final ConcurrentHashMap<String, com.sankuai.waimai.alita.core.intention.a> b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
        if (r4.o.contains("msid") != false) goto L37;
     */
    @Override // com.sankuai.waimai.alita.core.config.observabledata.a.InterfaceC0700a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void update(java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.intention.c.update(java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dfcea60178809821fe4a7a9c7353533", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dfcea60178809821fe4a7a9c7353533") : a.a;
    }

    @NonNull
    public final com.sankuai.waimai.alita.core.intention.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f802b611d83748fe44fe6b476f59f3de", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.alita.core.intention.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f802b611d83748fe44fe6b476f59f3de");
        }
        com.sankuai.waimai.alita.core.intention.a aVar = this.b.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.sankuai.waimai.alita.core.intention.a aVar2 = new com.sankuai.waimai.alita.core.intention.a(str);
        com.sankuai.waimai.alita.core.intention.a putIfAbsent = this.b.putIfAbsent(str, aVar2);
        return putIfAbsent == null ? aVar2 : putIfAbsent;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652ea3bae563bc6868fba0ef67cfb4f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652ea3bae563bc6868fba0ef67cfb4f7");
        } else {
            this.b = new ConcurrentHashMap<>();
        }
    }
}
