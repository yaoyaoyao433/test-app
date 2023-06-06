package com.sankuai.waimai.alita.core.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    String b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, String str);
    }

    public d(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d674dfb8f18a141ff344b241add92c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d674dfb8f18a141ff344b241add92c");
            return;
        }
        this.b = "alita_conf_" + str;
    }

    @NonNull
    public final String a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2050c6e01749427588d2ad40ba58d3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2050c6e01749427588d2ad40ba58d3") : b.a(this.b).b("sp_key_horn_data", "");
    }

    public final void a(@Nullable Map<String, Object> map, @Nullable a aVar) {
        Object[] objArr = {map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1409d82596f011148821e11182230009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1409d82596f011148821e11182230009");
            return;
        }
        final a[] aVarArr = {aVar};
        b(map, new a() { // from class: com.sankuai.waimai.alita.core.config.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.config.d.a
            public final void a(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37f9b6ba23a3c5daac37d5ba1a365d47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37f9b6ba23a3c5daac37d5ba1a365d47");
                } else if (aVarArr[0] != null) {
                    aVarArr[0].a(z, str);
                    aVarArr[0] = null;
                }
            }
        });
    }

    private void b(@Nullable Map<String, Object> map, @Nullable final a aVar) {
        Object[] objArr = {map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f1266cae70f39a53170e8eee2ba09c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f1266cae70f39a53170e8eee2ba09c");
            return;
        }
        HashMap hashMap = new HashMap();
        b(hashMap);
        if (map != null) {
            hashMap.putAll(map);
        }
        HornCallback hornCallback = new HornCallback() { // from class: com.sankuai.waimai.alita.core.config.d.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "197a4daf7cc67f9e40c5bd6400e12cbd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "197a4daf7cc67f9e40c5bd6400e12cbd");
                } else if (aVar != null) {
                    aVar.a(z, str);
                }
            }
        };
        if (com.sankuai.waimai.alita.platform.init.c.c()) {
            boolean c = com.sankuai.waimai.alita.platform.debug.a.a().c();
            Horn.debug(com.meituan.android.singleton.b.a.getApplicationContext(), this.b, c);
            StringBuilder sb = new StringBuilder("Alita Horn[biz = ");
            sb.append(this.b);
            sb.append("]环境为");
            sb.append(c ? "Develop" : "Release");
            com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
        }
        Horn.register(this.b, hornCallback, hashMap);
    }

    private void b(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82924a85a478fb3e13147b64f206eb0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82924a85a478fb3e13147b64f206eb0a");
            return;
        }
        map.put("alita_app", com.sankuai.waimai.alita.platform.init.c.a().a());
        map.put("alita_userid", com.sankuai.waimai.alita.platform.init.c.a().i());
    }
}
