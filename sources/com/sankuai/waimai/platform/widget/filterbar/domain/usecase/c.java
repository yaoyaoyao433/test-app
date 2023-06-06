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
public final class c extends com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c<a, b> {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.platform.widget.filterbar.domain.repository.b e;
    private int f;

    @Override // com.sankuai.waimai.platform.widget.filterbar.clean.usecase.c
    public final /* synthetic */ void a(a aVar) {
        a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30b7c21ab2fcc1ab6654dc4c5b82f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30b7c21ab2fcc1ab6654dc4c5b82f8c");
        } else if (this.e == null) {
            this.c.a(new Error("repository is null!"));
        } else if (aVar2 == null) {
            this.c.a(new Error("request value is null!"));
        } else {
            String str = aVar2.b;
            Set<String> j = this.e.j();
            if (j != null) {
                for (String str2 : j) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.e.a(str2);
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
            this.e.a(str, this.f, new b.a<com.sankuai.waimai.platform.widget.filterbar.domain.model.b>() { // from class: com.sankuai.waimai.platform.widget.filterbar.domain.usecase.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final /* synthetic */ void a(com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar) {
                    com.sankuai.waimai.platform.widget.filterbar.domain.model.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cd70f526b43dcf6b412de6bafd8cffa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cd70f526b43dcf6b412de6bafd8cffa");
                    } else if (bVar2 == null) {
                        a(new Exception("data is null!"));
                    } else {
                        ArrayList<b.a> arrayList = bVar2.b;
                        if (arrayList != null) {
                            for (b.a aVar3 : arrayList) {
                                if (aVar3 != null && aVar3.c != null) {
                                    for (b.a.C1086a c1086a : aVar3.c) {
                                        if (c1086a != null && !TextUtils.isEmpty(c1086a.a) && c1086a.g != null && c1086a.g.a) {
                                            c1086a.g.a = !c.this.e.a(6, c1086a.a, c1086a.g.b);
                                        }
                                    }
                                }
                            }
                        }
                        c.this.c.a((c.InterfaceC1084c<P>) new b(bVar2));
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.domain.repository.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd6d466fcb95dac4c888ab761f8f9e08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd6d466fcb95dac4c888ab761f8f9e08");
                    } else {
                        c.this.c.a(new Error(exc.getMessage()));
                    }
                }
            });
        }
    }

    public c(int i, com.sankuai.waimai.platform.widget.filterbar.domain.repository.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83dd67ab0c023a63b9b9f4c012ed32a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83dd67ab0c023a63b9b9f4c012ed32a9");
            return;
        }
        this.f = i;
        this.e = bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends c.a {
        public static ChangeQuickRedirect a;
        String b;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0549e2c3ce34d657c5881cda22a9ba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0549e2c3ce34d657c5881cda22a9ba");
            } else {
                this.b = str;
            }
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2751009d0dbfb654aa0b5414aa9aec2c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2751009d0dbfb654aa0b5414aa9aec2c");
            } else {
                this.b = bVar;
            }
        }
    }
}
