package com.sankuai.waimai.store.im.number;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static final String b = "d";
    private static volatile d c;
    private e d;
    private int e;
    private int f;
    private int g;
    private final List<a> h;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4aebd248cf05063dace332aeff1d9233", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4aebd248cf05063dace332aeff1d9233");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    d dVar = new d();
                    c = dVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "67886da6d35d77da68ec3ed4cf18e40d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "67886da6d35d77da68ec3ed4cf18e40d");
                    } else {
                        dVar.d = new e(b);
                        dVar.d.a(new com.sankuai.waimai.store.base.d<Integer>() { // from class: com.sankuai.waimai.store.im.number.d.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.base.d
                            public final /* synthetic */ void a(Integer num) {
                                Integer num2 = num;
                                Object[] objArr3 = {num2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "44e5929c37d59a597abeeed4d56b6182", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "44e5929c37d59a597abeeed4d56b6182");
                                } else if (num2 != null) {
                                    d.this.e = num2.intValue();
                                    d.this.c();
                                }
                            }
                        });
                        al.a(new Runnable() { // from class: com.sankuai.waimai.store.im.number.d.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "84e984dcac53a732da9f625c30260526", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "84e984dcac53a732da9f625c30260526");
                                } else {
                                    d.this.b();
                                }
                            }
                        }, 100, b);
                    }
                }
            }
        }
        return c;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc3820c8a341f411f1d52fa82727827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc3820c8a341f411f1d52fa82727827");
        } else if (aVar == null || this.h.contains(aVar)) {
        } else {
            c(aVar);
            this.h.add(aVar);
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0be7518079e1e6a575ab6447dc0212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0be7518079e1e6a575ab6447dc0212");
        } else {
            this.h.remove(aVar);
        }
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2ec6a27d015dda7d852e271ca78c56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2ec6a27d015dda7d852e271ca78c56");
            return;
        }
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = new LinkedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0794f031355b5564ae866fe5b2a64a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0794f031355b5564ae866fe5b2a64a5");
            return;
        }
        Iterator it = new ArrayList(this.h).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                c(aVar);
            }
        }
    }

    private void c(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10bcc0385d9c4b08d52db86c9cb276bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10bcc0385d9c4b08d52db86c9cb276bd");
            return;
        }
        int i = this.e;
        if (aVar instanceof b) {
            i += this.f;
        } else if (aVar instanceof c) {
            i += this.g;
        }
        try {
            aVar.a(i);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c38b519ed415e67985e94532f6cbe9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c38b519ed415e67985e94532f6cbe9e");
        } else if (this.d != null) {
            this.d.a();
        }
    }

    public final void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c00fb918968ae34b38be44db3bdbd786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c00fb918968ae34b38be44db3bdbd786");
        } else if (getMenuResponse != null) {
            this.g = getMenuResponse.getMsgCenterUnreadCount();
            c();
        }
    }
}
