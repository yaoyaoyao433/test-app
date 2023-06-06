package com.meituan.android.ptcommonim.mach;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.android.ptcommonim.pageadapter.message.mach.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private final Context b;
    private List<b> c;

    public e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950df383abb4ce2f63fd010f63b68565", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950df383abb4ce2f63fd010f63b68565");
            return;
        }
        this.c = new ArrayList();
        this.b = context;
    }

    private final f b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc50e47448207aa851b18e36600844f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc50e47448207aa851b18e36600844f0");
        }
        f.a aVar = new f.a();
        aVar.a(this.b);
        aVar.a(new com.meituan.android.ptcommonim.base.mach.a());
        aVar.d = new a();
        return aVar.b(this.b);
    }

    public final void a(View view, String str, MachInfo machInfo) {
        Object[] objArr = {view, str, machInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4888e2d1b24cea67067c44aba8e7ece8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4888e2d1b24cea67067c44aba8e7ece8");
        } else if (view instanceof MachViewGroup) {
            MachViewGroup machViewGroup = (MachViewGroup) view;
            try {
                b bVar = new b(this.b, b(), a(str), machInfo);
                bVar.a(machViewGroup);
                this.c.add(bVar);
            } catch (Exception unused) {
            }
        }
    }

    private Map<String, Object> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb81af0e6ef777a5157295ccb4f8a08", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb81af0e6ef777a5157295ccb4f8a08");
        }
        Map<String, Object> map = (Map) com.meituan.android.ptcommonim.video.utils.e.a(str, Map.class);
        try {
            String str2 = (String) map.get("reportDict");
            if (!TextUtils.isEmpty(str2)) {
                map.remove("reportDict");
                map.put("reportDict", com.meituan.android.ptcommonim.video.utils.e.a(str2, Map.class));
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bfb4b157e2482a8b0177d47c9e8e744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bfb4b157e2482a8b0177d47c9e8e744");
            return;
        }
        for (b bVar : this.c) {
            if (bVar != null) {
                try {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ae7457b78281e0de7e5fd73cedca39de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ae7457b78281e0de7e5fd73cedca39de");
                    } else if (bVar.b != null && bVar.b.b != null) {
                        bVar.b.b.release();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        this.c.clear();
    }
}
