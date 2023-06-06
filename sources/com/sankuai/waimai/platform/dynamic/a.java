package com.sankuai.waimai.platform.dynamic;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.mach.dialog.AlertInfo;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
import com.sankuai.waimai.platform.mach.dialog.k;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.platform.mach.a {
    private static List<String> a = Arrays.asList("task_area_module", "new_user_area_card_module", "brand_promotion_module", "new_user_popular_module");
    public static ChangeQuickRedirect b;
    private com.sankuai.waimai.mach.container.d A;
    String c;
    boolean d;
    public boolean e;
    Mach.d f;
    private final String g;
    private final String x;
    private com.sankuai.waimai.mach.d y;
    private k z;

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.e = true;
        return true;
    }

    public a(Activity activity, String str, String str2, String str3) {
        super(activity, str);
        Object[] objArr = {activity, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a8050f4239d644e0d09348a2396e32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a8050f4239d644e0d09348a2396e32");
            return;
        }
        this.d = false;
        this.g = "openDynamicDialog";
        this.x = "jumpPage";
        this.e = true;
        this.A = new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.platform.dynamic.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4273428e3a8e9264b01d3262f22d0f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4273428e3a8e9264b01d3262f22d0f6");
                    return;
                }
                super.d();
                if (a.this.e) {
                    return;
                }
                a.this.b();
                a.a(a.this, true);
            }
        };
        this.y = new b(str2, str3);
        a(this.A);
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(String str) {
        this.c = str;
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public void a(Mach.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eae0846dba828501342e3c5460e1f6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eae0846dba828501342e3c5460e1f6f");
            return;
        }
        super.a(aVar);
        aVar.a(new WebpImageTagProcessor());
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57de8aa0ea2d9bce8c5f28947c2b9148", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57de8aa0ea2d9bce8c5f28947c2b9148")).booleanValue() : (this.d && a.contains(this.c)) ? false : true;
    }

    public final void a(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac632c0170f2207da3b1aaa2260a76bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac632c0170f2207da3b1aaa2260a76bd");
            return;
        }
        a("rank_list_id", str);
        a("ab_info", (Object) map);
        a("module_id", str2);
        this.k.synchronizeEnvironment();
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final com.sankuai.waimai.mach.d d() {
        return this.y;
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4361eed4c2086c13360f78e44f5f17d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4361eed4c2086c13360f78e44f5f17d7");
            return;
        }
        if (this.f != null) {
            this.f.a(str, map);
        }
        super.a(str, map);
        if ("jumpPage".equals(str)) {
            if (map == null || map.get("url") == null || TextUtils.isEmpty(map.get("url").toString())) {
                return;
            }
            com.sankuai.waimai.foundation.router.a.a(this.j, map.get("url").toString());
        } else if ("openDynamicDialog".equals(str)) {
            if (this.z == null) {
                this.z = new k();
            }
            if (this.z.a()) {
                DynamicDialog.a aVar = new DynamicDialog.a(this.j);
                aVar.i = (AlertInfo) com.sankuai.waimai.foundation.utils.k.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map), (Class<Object>) AlertInfo.class);
                this.z.c = aVar.a();
                this.z.a(this.j);
            }
        }
    }
}
