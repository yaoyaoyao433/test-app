package com.sankuai.waimai.router.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f extends com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect c;
    @NonNull
    private final com.sankuai.waimai.router.utils.a<com.sankuai.waimai.router.core.h> a;
    @Nullable
    private String b;
    @Nullable
    com.sankuai.waimai.router.core.h d;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a1ac5df3e734444fc95a063452e251", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a1ac5df3e734444fc95a063452e251");
            return;
        }
        this.a = new com.sankuai.waimai.router.utils.a<>();
        this.d = null;
    }

    public final void a(String str, Object obj, boolean z, com.sankuai.waimai.router.core.i... iVarArr) {
        String str2;
        Object[] objArr = {str, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), iVarArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6211df0402338d176a93d93cb9eb9a85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6211df0402338d176a93d93cb9eb9a85");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.router.utils.f.a;
            Object obj2 = null;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fd4b010545797cd21e88f402755cf531", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fd4b010545797cd21e88f402755cf531");
            } else if (str == null || str.startsWith("/")) {
                str2 = str;
            } else {
                str2 = "/" + str;
            }
            com.sankuai.waimai.router.core.h a = com.sankuai.waimai.router.components.j.a(obj, z, iVarArr);
            com.sankuai.waimai.router.utils.a<com.sankuai.waimai.router.core.h> aVar = this.a;
            Object[] objArr3 = {str2, a};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.router.utils.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "67db96a86fc7e1ca9dcb938395a0b378", RobustBitConfig.DEFAULT_VALUE)) {
                obj2 = PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "67db96a86fc7e1ca9dcb938395a0b378");
            } else if (!TextUtils.isEmpty(str2) && a != null) {
                obj2 = aVar.b.put(com.sankuai.waimai.router.utils.f.a(str2), a);
            }
            com.sankuai.waimai.router.core.h hVar = (com.sankuai.waimai.router.core.h) obj2;
            if (hVar != null) {
                com.sankuai.waimai.router.core.d.d("[%s] 重复注册path='%s'的UriHandler: %s, %s", this, str2, hVar, a);
            }
        }
    }

    public final void a(String str, Object obj, com.sankuai.waimai.router.core.i... iVarArr) {
        Object[] objArr = {str, obj, iVarArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2789fcad38dbe478feb0ec34d359b7ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2789fcad38dbe478feb0ec34d359b7ea");
        } else {
            a(str, obj, false, iVarArr);
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    public boolean a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12fa330a956c9e62e7fb7bc27675a677", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12fa330a956c9e62e7fb7bc27675a677")).booleanValue() : (this.d == null && b(jVar) == null) ? false : true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull final com.sankuai.waimai.router.core.j jVar, @NonNull final com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bfa989994af6d203b267c46595f8010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bfa989994af6d203b267c46595f8010");
            return;
        }
        com.sankuai.waimai.router.core.h b = b(jVar);
        if (b != null) {
            b.b(jVar, new com.sankuai.waimai.router.core.g() { // from class: com.sankuai.waimai.router.common.f.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.core.g
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66555932b722f839159edd4eb81b994c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66555932b722f839159edd4eb81b994c");
                    } else {
                        f.this.c(jVar, gVar);
                    }
                }

                @Override // com.sankuai.waimai.router.core.g
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "adc0d8526836caed5eb29eadfee51206", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "adc0d8526836caed5eb29eadfee51206");
                    } else {
                        gVar.a(i);
                    }
                }
            });
        } else {
            c(jVar, gVar);
        }
    }

    void c(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1fd947f8f1a77da98dcf3ebf7629b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1fd947f8f1a77da98dcf3ebf7629b9b");
            return;
        }
        com.sankuai.waimai.router.core.h hVar = this.d;
        if (hVar != null) {
            hVar.b(jVar, gVar);
        } else {
            gVar.a();
        }
    }

    private com.sankuai.waimai.router.core.h b(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2104922abab3cbcbaac0ed70499abfb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.router.core.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2104922abab3cbcbaac0ed70499abfb0");
        }
        String path = jVar.d.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        if (TextUtils.isEmpty(this.b)) {
            return this.a.a(path);
        }
        if (path.startsWith(this.b)) {
            return this.a.a(path.substring(this.b.length()));
        }
        return null;
    }
}
