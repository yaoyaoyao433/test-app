package com.sankuai.waimai.router.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;
    private final Map<String, f> c;
    private final String d;
    private final String e;
    private final com.sankuai.waimai.router.utils.c f;

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "UriAnnotationHandler";
    }

    public h(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb27a2aa8975c5df583ff79859ea3125", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb27a2aa8975c5df583ff79859ea3125");
            return;
        }
        this.c = new HashMap();
        this.f = new com.sankuai.waimai.router.utils.c("UriAnnotationHandler") { // from class: com.sankuai.waimai.router.common.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.utils.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4532602e7d396b3f40a721ef8ff48fc6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4532602e7d396b3f40a721ef8ff48fc6");
                    return;
                }
                h hVar = h.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "51090d8567add92a54e99842fef43553", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "51090d8567add92a54e99842fef43553");
                } else {
                    com.sankuai.waimai.router.components.h.a(hVar, IUriAnnotationInit.class);
                }
            }
        };
        this.d = com.sankuai.waimai.router.utils.f.b(str);
        this.e = com.sankuai.waimai.router.utils.f.b(str2);
    }

    public final void a(String str, String str2, String str3, Object obj, boolean z, com.sankuai.waimai.router.core.i... iVarArr) {
        Object[] objArr = {str, str2, str3, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), iVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8bfb2bc7df46ec4a913ece61604f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8bfb2bc7df46ec4a913ece61604f09");
            return;
        }
        String a2 = com.sankuai.waimai.router.utils.f.a(TextUtils.isEmpty(str) ? this.d : str, TextUtils.isEmpty(str2) ? this.e : str2);
        f fVar = this.c.get(a2);
        if (fVar == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ae2d9563ea44a04990ab6cccd1a9d27", RobustBitConfig.DEFAULT_VALUE)) {
                fVar = (f) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ae2d9563ea44a04990ab6cccd1a9d27");
            } else {
                fVar = new f();
                if (b) {
                    fVar.d = d.b;
                }
            }
            this.c.put(a2, fVar);
        }
        fVar.a(str3, obj, z, iVarArr);
    }

    private f b(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e039705f52907db59c9862ace9af13", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e039705f52907db59c9862ace9af13") : this.c.get(jVar.c());
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void b(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ca7910252219aefd181e991924a61d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ca7910252219aefd181e991924a61d");
            return;
        }
        this.f.b();
        super.b(jVar, gVar);
    }

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a98449bb04919bf583ae6a727383135", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a98449bb04919bf583ae6a727383135")).booleanValue() : b(jVar) != null;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a67179afd2cf2e89249927904fe513b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a67179afd2cf2e89249927904fe513b9");
            return;
        }
        f b2 = b(jVar);
        if (b2 != null) {
            b2.b(jVar, gVar);
        } else {
            gVar.a();
        }
    }
}
