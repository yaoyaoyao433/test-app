package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.neohybrid.storage.MemoryStorage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q extends b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return "SessionStorageBridgePresenter";
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String k() {
        return "storage";
    }

    public q(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12bae8b70cc7915358ffd02c42e3feb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12bae8b70cc7915358ffd02c42e3feb2");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2331ce4bb239cc3e45abda0ab45ca190", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2331ce4bb239cc3e45abda0ab45ca190");
        }
        if ("set".equals(this.c)) {
            MemoryStorage.a().a(e(), (Map) com.meituan.android.neohybrid.util.gson.b.a().fromJson(this.d, new TypeToken<Map<String, Object>>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.q.1
            }.getType()));
            return h();
        } else if ("get".equals(this.c)) {
            Map<String, Object> a2 = MemoryStorage.a().a(e(), (Set) com.meituan.android.neohybrid.util.gson.b.a().fromJson(this.d, new TypeToken<Set<String>>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.q.2
            }.getType()));
            return (a2 == null || a2.isEmpty()) ? h() : a((JsonObject) com.meituan.android.neohybrid.util.gson.b.a().fromJson(com.meituan.android.neohybrid.util.gson.b.a().toJson(a2), JsonObject.class));
        } else {
            return d();
        }
    }
}
