package com.sankuai.waimai.alita.core.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.config.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaBizConfigManager {
    public static ChangeQuickRedirect a;
    String b;
    d c;
    int d;
    public com.sankuai.waimai.alita.core.config.a e;
    boolean f;
    private String g;
    private a h;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LoadStrategy {
        public static final int CACHE_FIRST = 0;
        public static final int CACHE_ONLY = 1;
        public static final int REMOTE_ONLY = 2;
    }

    public static a a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a91a045cde146273752ce814481ad357", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a91a045cde146273752ce814481ad357") : new a(str);
    }

    private AlitaBizConfigManager(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd6ef51772a1e3923391f1f1a46375a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd6ef51772a1e3923391f1f1a46375a");
            return;
        }
        this.f = false;
        this.b = aVar.b;
        this.c = new d(this.b);
        this.d = aVar.c;
        this.e = new com.sankuai.waimai.alita.core.config.a();
        this.h = aVar;
    }

    boolean a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "928eb43dd9ea7959c9163c26f59a760e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "928eb43dd9ea7959c9163c26f59a760e")).booleanValue();
        }
        String a2 = this.c.a(map);
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        b(a2);
        return true;
    }

    void a(@Nullable Map<String, Object> map, final a.InterfaceC0698a interfaceC0698a) {
        Object[] objArr = {map, interfaceC0698a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0436d3ad5c9b26e63a0f786e85716854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0436d3ad5c9b26e63a0f786e85716854");
        } else {
            this.c.a(map, new d.a() { // from class: com.sankuai.waimai.alita.core.config.AlitaBizConfigManager.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.config.d.a
                public final void a(boolean z, String str) {
                    boolean z2 = false;
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebb5884dc7356eb2edc4177b71ce6735", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebb5884dc7356eb2edc4177b71ce6735");
                        return;
                    }
                    if (z && !TextUtils.isEmpty(str)) {
                        AlitaBizConfigManager.this.b(str);
                        d dVar = AlitaBizConfigManager.this.c;
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = d.a;
                        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "85a250eb55e9cff4265a0ad406bf3ffc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "85a250eb55e9cff4265a0ad406bf3ffc");
                        } else if (!TextUtils.isEmpty(str)) {
                            b.a(dVar.b).a("sp_key_horn_data", str);
                        }
                        z2 = true;
                    }
                    AlitaBizConfigManager.this.a(AlitaBizConfigManager.this, z2, interfaceC0698a);
                }
            });
        }
    }

    void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d82b2d533ed4e95626ddf9133053aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d82b2d533ed4e95626ddf9133053aa");
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
        }
        if (jSONObject != null) {
            this.e.a(jSONObject);
            this.g = str;
        }
    }

    void a(@NonNull AlitaBizConfigManager alitaBizConfigManager, boolean z, @Nullable a.InterfaceC0698a interfaceC0698a) {
        Object[] objArr = {alitaBizConfigManager, Byte.valueOf(z ? (byte) 1 : (byte) 0), interfaceC0698a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55afb1b095a7d519509bf8be04ec8adb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55afb1b095a7d519509bf8be04ec8adb");
        } else if (interfaceC0698a != null) {
            interfaceC0698a.a(alitaBizConfigManager, z, this.g);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        public int c;
        public Map<String, Object> d;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.alita.core.config.AlitaBizConfigManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public interface InterfaceC0698a {
            void a(@NonNull AlitaBizConfigManager alitaBizConfigManager, boolean z, String str);
        }

        public a(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6ea55ea52946e2428862b6b48110cc7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6ea55ea52946e2428862b6b48110cc7");
            } else {
                this.b = str;
            }
        }

        public final void a(InterfaceC0698a interfaceC0698a) {
            Object[] objArr = {interfaceC0698a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d774ebfa59d5ba25275a2d968a7ee8ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d774ebfa59d5ba25275a2d968a7ee8ab");
                return;
            }
            AlitaBizConfigManager alitaBizConfigManager = new AlitaBizConfigManager(this);
            Object[] objArr2 = {this, interfaceC0698a};
            ChangeQuickRedirect changeQuickRedirect2 = AlitaBizConfigManager.a;
            if (PatchProxy.isSupport(objArr2, alitaBizConfigManager, changeQuickRedirect2, false, "409e15e3bacecd3015eadca52ae4581f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, alitaBizConfigManager, changeQuickRedirect2, false, "409e15e3bacecd3015eadca52ae4581f");
                return;
            }
            switch (alitaBizConfigManager.d) {
                case 1:
                    alitaBizConfigManager.f = alitaBizConfigManager.a(this.d);
                    alitaBizConfigManager.a(alitaBizConfigManager, alitaBizConfigManager.f, interfaceC0698a);
                    return;
                case 2:
                    alitaBizConfigManager.a(this.d, interfaceC0698a);
                    return;
                default:
                    alitaBizConfigManager.f = alitaBizConfigManager.a(this.d);
                    if (alitaBizConfigManager.f) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaBizConfigManager.init(): Horn配置有缓存 ");
                        alitaBizConfigManager.a(alitaBizConfigManager, true, interfaceC0698a);
                        alitaBizConfigManager.a(this.d, null);
                        return;
                    }
                    com.sankuai.waimai.alita.core.utils.c.a("AlitaBizConfigManager.init(): Horn配置无缓存，从服务器获取 ");
                    alitaBizConfigManager.a(this.d, interfaceC0698a);
                    return;
            }
        }
    }
}
