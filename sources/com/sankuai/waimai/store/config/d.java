package com.sankuai.waimai.store.config;

import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.v;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends b {
    public static ChangeQuickRedirect c;
    public static final String d;
    public static final com.sankuai.waimai.store.abtest.a e;
    public static final String f;
    public static String g;
    public static boolean h;
    public static final com.sankuai.waimai.store.abtest.a i;

    @Override // com.sankuai.waimai.store.config.a
    public final String c() {
        return "drug_config_center";
    }

    @Override // com.sankuai.waimai.store.config.a
    public final String d() {
        return "drug_config_center";
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ float a(String str, float f2) {
        return super.a(str, f2);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ int a(String str, int i2) {
        return super.a(str, i2);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ long a(String str, long j) {
        return super.a(str, j);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ Object a(String str, Type type) {
        return super.a(str, type);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ Object a(String str, Type type, Object obj) {
        return super.a(str, type, obj);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ String a(String str, String str2) {
        return super.a(str, str2);
    }

    @Override // com.sankuai.waimai.store.config.a
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ void a(h hVar) {
        super.a(hVar);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ boolean a(String str, boolean z) {
        return super.a(str, z);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ String b(String str) {
        return super.b(str);
    }

    @Override // com.sankuai.waimai.store.config.a
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ int c(String str) {
        return super.c(str);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ boolean d(String str) {
        return super.d(str);
    }

    @Override // com.sankuai.waimai.store.config.b
    @Nullable
    public final /* bridge */ /* synthetic */ List e(String str) {
        return super.e(str);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ JsonObject g() {
        return super.g();
    }

    static {
        String str;
        String str2 = v.c ? "med_search_button_highlight_meituan" : v.b ? "med_search_button_highlight_waimai" : "med_search_button_highlight_dianping";
        d = str2;
        e = com.sankuai.waimai.store.manager.abtest.a.a(str2, "");
        StringBuilder sb = new StringBuilder();
        com.sankuai.waimai.store.abtest.a aVar = e;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = com.sankuai.waimai.store.abtest.a.a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "22d2670527a6d43ee3697f2f38e1bbc7", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "22d2670527a6d43ee3697f2f38e1bbc7");
        } else if (aVar.h) {
            str = aVar.b + ',' + aVar.c + ',' + aVar.d + ',' + aVar.e + ',' + aVar.f;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(";");
        f = sb.toString();
        g = e.e;
        h = ("A1".equals(g) || "A2".equals(g)) ? true : true;
        i = com.sankuai.waimai.store.manager.abtest.a.a(v.c ? "poi_page_798_meituan_android_group1" : v.b ? "poi_page_798_waimai_android_group1" : "poi_page_798_dianping_android_group1", "");
    }

    public d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final d a = new d();
    }

    public static d h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "587d2efcf25f34ce8c22bb6cdd163bdd", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "587d2efcf25f34ce8c22bb6cdd163bdd") : a.a;
    }
}
