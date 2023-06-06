package com.sankuai.waimai.platform.widget.filterbar.domain.usecase;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.b;
import com.sankuai.waimai.platform.widget.filterbar.domain.repository.b;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<a, b> {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(a aVar) {
        final a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f66b22f3c19bd149909e1aab3ceda82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f66b22f3c19bd149909e1aab3ceda82");
        } else if (this.e == null) {
            this.c.a(new Error("repository is null!"));
        } else if (aVar2 == null) {
            this.c.a(new Error("request value is null!"));
        } else {
            long j = aVar2.b;
            long j2 = aVar2.c;
            int i = aVar2.d;
            Set<String> j3 = this.e.j();
            if (j3 != null) {
                for (String str : j3) {
                    if (!TextUtils.isEmpty(str)) {
                        this.e.a(str);
                    }
                }
            }
            Map<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> m = this.e.m();
            if (m != null) {
                for (Map.Entry<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> entry : m.entrySet()) {
                    String key = entry.getKey();
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.g value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value != null) {
                        this.e.a(key, value.b, value.c);
                    }
                }
            }
            b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b> aVar3 = new b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.d.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final /* synthetic */ void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf8a8adec67331ec94744c6e2379ad6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf8a8adec67331ec94744c6e2379ad6b");
                    } else if (bVar2 == null) {
                        a(new Exception("data is null!"));
                    } else {
                        ArrayList<b.a> arrayList = bVar2.b;
                        if (arrayList != null) {
                            for (b.a aVar4 : arrayList) {
                                if (aVar4 != null && aVar4.c != null) {
                                    for (b.a.C1086a c1086a : aVar4.c) {
                                        if (c1086a != null && !TextUtils.isEmpty(c1086a.a) && c1086a.g != null && c1086a.g.a) {
                                            if (aVar2.e) {
                                                c1086a.g.a = !d.this.e.a(6, c1086a.a, c1086a.g.b);
                                            } else {
                                                c1086a.g.a = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        d.this.c.a((c.InterfaceC1084c<P>) new b(bVar2));
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba84b7152ff41b4e53d2351e92f4f017", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba84b7152ff41b4e53d2351e92f4f017");
                    } else {
                        d.this.c.a(new Error(exc.getMessage()));
                    }
                }
            };
            if (aVar2.e) {
                this.e.a(j, j2, i, aVar2.f, aVar3);
            } else {
                this.e.a(j, j2, i, aVar3);
            }
        }
    }

    public d(com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88af74ed94706c63c0140abb35c4db1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88af74ed94706c63c0140abb35c4db1e");
        } else {
            this.e = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c.a {
        public static ChangeQuickRedirect a;
        long b;
        long c;
        int d;
        boolean e;
        int f;

        public a(boolean z, long j, long j2, int i) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), new Long(j2), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85bf7b562f154a67f5acd4841ad3a700", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85bf7b562f154a67f5acd4841ad3a700");
                return;
            }
            this.f = 0;
            this.b = j;
            this.c = j2;
            this.d = i;
            this.e = z;
        }

        public a(boolean z, long j, long j2, int i, int i2) {
            Object[] objArr = {(byte) 1, 0L, 0L, 0, 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d6576e6667f34b1bacec951f8327e7f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d6576e6667f34b1bacec951f8327e7f");
                return;
            }
            this.f = 0;
            this.b = 0L;
            this.c = 0L;
            this.d = 0;
            this.e = true;
            this.f = 1;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends c.b {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.platform.widget.filterbar.domain.model.b b;

        public b(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886965655ad45a83bf57e18c6e2fd28d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886965655ad45a83bf57e18c6e2fd28d");
            } else {
                this.b = bVar;
            }
        }
    }
}
