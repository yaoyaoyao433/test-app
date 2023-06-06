package com.sankuai.waimai.store.convenient.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected C1142a b;
    final com.sankuai.waimai.store.param.a c;
    protected BaseModuleDesc d;
    int e;
    String f;
    private Context g;

    public a(@NonNull Context context, @NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf10a1994df2c89910197755ff61ea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf10a1994df2c89910197755ff61ea3");
            return;
        }
        this.e = -99;
        this.f = "";
        this.g = context;
        this.c = aVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7455cc363f30d3df5ed9ba45ec217e41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7455cc363f30d3df5ed9ba45ec217e41");
        } else {
            this.b = new C1142a(this.g);
        }
    }

    public final View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de8d28010dcb8c5be730faa5cfc1940", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de8d28010dcb8c5be730faa5cfc1940");
        }
        this.b = new C1142a(this.g);
        return this.b.d;
    }

    public final void a(BaseModuleDesc baseModuleDesc, int i, boolean z) {
        Object[] objArr = {baseModuleDesc, 0, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5583dcca5036034add1cd9d147723aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5583dcca5036034add1cd9d147723aa");
            return;
        }
        this.d = baseModuleDesc;
        if (p.a(baseModuleDesc.jsonData)) {
            return;
        }
        this.b.a(baseModuleDesc, 0, true);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.convenient.base.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1142a extends com.sankuai.waimai.store.mach.machfeed.b {
        public static ChangeQuickRedirect a;

        private C1142a(@NonNull Context context) {
            super(context);
            Object[] objArr = {a.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ada5fa4efc4817faccd044573225de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ada5fa4efc4817faccd044573225de");
            }
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, com.sankuai.waimai.store.mach.event.b> a(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d769c20d29931a0a036d19da5324df", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d769c20d29931a0a036d19da5324df");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("supermarket_convenient_landing_filter_click", new com.sankuai.waimai.store.poi.list.newp.methods.b());
            return hashMap;
        }

        @Override // com.sankuai.waimai.store.mach.machfeed.b
        public final Map<String, Object> b(BaseModuleDesc baseModuleDesc, int i) {
            Object[] objArr = {baseModuleDesc, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2681f703da7f9472b02837fabe9315f6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2681f703da7f9472b02837fabe9315f6");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("shelf_id", a.this.c.ar);
            hashMap.put("sort_code", Integer.valueOf(a.this.e));
            hashMap.put("filter_codes", a.this.f);
            hashMap.put("scheme_params", a.this.c.aA);
            return hashMap;
        }
    }
}
