package com.sankuai.waimai.store.config;

import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.store.config.a
    public final String c() {
        return "supermarket_config_center";
    }

    @Override // com.sankuai.waimai.store.config.a
    public final String d() {
        return "sm_config_center_v2";
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ float a(String str, float f) {
        return super.a(str, f);
    }

    @Override // com.sankuai.waimai.store.config.b
    public final /* bridge */ /* synthetic */ int a(String str, int i) {
        return super.a(str, i);
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

    public j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final j a = new j();
    }

    public static j h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f5c071b6dbc4de43abf55d34cd4928d", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f5c071b6dbc4de43abf55d34cd4928d") : a.a;
    }
}
