package com.sankuai.meituan.mtlive.core;

import android.content.Context;
import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.d;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends h {
    public static ChangeQuickRedirect a;
    private volatile boolean f;
    private Map<String, Boolean> g;
    private boolean h;

    @Override // com.sankuai.meituan.mtlive.core.h
    public void b() {
    }

    public abstract String[] c();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9184e2e58d4dc101f2ab9147f2b052", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9184e2e58d4dc101f2ab9147f2b052");
        } else {
            this.h = false;
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.h, com.sankuai.meituan.mtlive.core.d
    public void a(Context context, i iVar) {
        Object[] objArr = {context, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f757e8a7dd9feedd6feff6957ed15627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f757e8a7dd9feedd6feff6957ed15627");
            return;
        }
        super.a(context, iVar);
        if (this.h) {
            return;
        }
        this.h = true;
        if (this.g == null) {
            this.g = new LinkedHashMap();
            if (c() != null) {
                for (String str : c()) {
                    this.g.put(str, Boolean.FALSE);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mtlive.core.h
    public final void a(final d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f4d1066c78fc5ea117a03216e1b13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f4d1066c78fc5ea117a03216e1b13b");
            return;
        }
        super.a(aVar);
        DynLoader.toggleDownload(new com.meituan.android.loader.a() { // from class: com.sankuai.meituan.mtlive.core.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.loader.a
            public final void onDynDownloadSuccess() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "886bae6b330b6a81baf9e21525b50e00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "886bae6b330b6a81baf9e21525b50e00");
                } else if (a.this.a()) {
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (aVar != null) {
                    aVar.b();
                }
            }

            @Override // com.meituan.android.loader.a
            public final void onDynDownloadFailure() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9475e48b1eea31745eb2b38a0d7bc634", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9475e48b1eea31745eb2b38a0d7bc634");
                } else if (aVar != null) {
                    aVar.b();
                }
            }
        }, new c.a().a(Arrays.asList(c())).b, true);
    }

    @Override // com.sankuai.meituan.mtlive.core.h, com.sankuai.meituan.mtlive.core.d
    public synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc00e537cb76d3970b16f7bade493e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc00e537cb76d3970b16f7bade493e0")).booleanValue();
        }
        if (!this.f && c() != null && this.g != null && this.g.size() != 0) {
            int i = 0;
            for (Map.Entry<String, Boolean> entry : this.g.entrySet()) {
                boolean booleanValue = entry.getValue().booleanValue();
                String key = entry.getKey();
                if (booleanValue) {
                    i++;
                } else if (DynLoader.available(key, 1)) {
                    boolean load = DynLoader.load(key);
                    if (load) {
                        i++;
                    }
                    this.g.put(key, Boolean.valueOf(load));
                }
                this.f = i == this.g.size();
            }
            StringBuilder sb = new StringBuilder("succeedCount: ");
            sb.append(i);
            sb.append(" , ");
            sb.append(this.g.toString());
            if (this.f) {
                b();
            }
            return this.f;
        }
        b();
        return true;
    }
}
