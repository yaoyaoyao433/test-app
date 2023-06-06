package com.sankuai.waimai.alita.core.mlmodel.operator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    String b;
    private g<String, a> c;

    public b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3b98cdeb8cf1910ae8e81b7e6dec6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3b98cdeb8cf1910ae8e81b7e6dec6d");
            return;
        }
        this.c = new g<>();
        this.b = str;
    }

    public final void a(@NonNull f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b14dd158c5e7ce6f8ba03bf0079f623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b14dd158c5e7ce6f8ba03bf0079f623");
        } else {
            this.c.a((g<String, a>) new a(fVar));
        }
    }

    public final void a(@NonNull Object obj, @NonNull final com.sankuai.waimai.alita.core.mlmodel.operator.a aVar, @Nullable final d dVar) {
        Object[] objArr = {obj, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab505cf85f585cff14fe685b7215b52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab505cf85f585cff14fe685b7215b52");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaOperatorManager.operate(): opName = " + aVar.c + ", feature =" + com.sankuai.waimai.alita.core.base.util.b.a(obj) + ", params = " + com.sankuai.waimai.alita.core.base.util.b.a(aVar.d));
        if (!TextUtils.isEmpty(aVar.c)) {
            a a2 = this.c.a((g<String, a>) aVar.c);
            if (a2 != null) {
                ((f) a2.d).a(obj, aVar, new d() { // from class: com.sankuai.waimai.alita.core.mlmodel.operator.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.d
                    public final void a(@Nullable List<Object> list) {
                        Object[] objArr2 = {list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6004fed687de72878680da6e3dc9ddf4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6004fed687de72878680da6e3dc9ddf4");
                            return;
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaOperatorManager.operate(): success, opName = " + aVar.c + ", result = " + com.sankuai.waimai.alita.core.base.util.b.a(list));
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, list);
                    }

                    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.d
                    public final void a(@Nullable Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63a45e7e0c22c0b182bbcbbc457c9f63", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63a45e7e0c22c0b182bbcbbc457c9f63");
                            return;
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaOperatorManager.operate(): failed, opName = " + aVar.c + ", e = " + com.sankuai.waimai.alita.core.base.util.b.a(exc));
                        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, exc);
                    }
                });
                return;
            }
            com.sankuai.waimai.alita.core.utils.c.a("AlitaOperatorManager.operate(): failed, opName = " + aVar.c + ", operator not found");
            com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.b(aVar.c, "operator not found"));
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaOperatorManager.operate(): failed, opName = " + aVar.c + ", operator name is empty");
        com.sankuai.waimai.alita.core.mlmodel.operator.util.a.a(dVar, new com.sankuai.waimai.alita.core.mlmodel.operator.exception.b("operator name is empty"));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<f> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.alita.core.base.c, com.sankuai.waimai.alita.core.base.f
        public final boolean a(String str) {
            List<String> a2;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b604c4f9e5178068782822db419222", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b604c4f9e5178068782822db419222")).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && (a2 = ((f) this.d).a()) != null) {
                for (String str2 : a2) {
                    if (str2 != null && TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public a(@NonNull f fVar) {
            super("", fVar);
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c305da7e230434d28d8d34864138b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c305da7e230434d28d8d34864138b8");
            }
        }
    }
}
