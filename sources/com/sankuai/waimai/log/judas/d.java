package com.sankuai.waimai.log.judas;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Map b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1cceb2ef06867fee44c708592147dee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1cceb2ef06867fee44c708592147dee");
        } else {
            this.b = new HashMap();
        }
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6396e30a734768ff66f515dafd365f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6396e30a734768ff66f515dafd365f")).booleanValue();
        }
        ArrayList arrayList = (ArrayList) this.b.get(str);
        if (arrayList == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return arrayList.contains(str2);
    }

    public void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5222c5a3811a12c378da46efb25298ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5222c5a3811a12c378da46efb25298ec");
            return;
        }
        ArrayList arrayList = (ArrayList) this.b.get(str);
        if (arrayList == null || TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str2);
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b128f469fa654aeb7eb8956c8d4a7ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b128f469fa654aeb7eb8956c8d4a7ef7");
        } else if (((ArrayList) this.b.get(str)) != null || TextUtils.isEmpty(str)) {
        } else {
            this.b.put(str, new ArrayList());
        }
    }

    public final void a(String str, String str2, Map map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc43c508c355d4bb769261234b4cfec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc43c508c355d4bb769261234b4cfec");
        } else {
            a(str, str2, map, null, null);
        }
    }

    private void a(String str, String str2, Map map, String str3, String str4) {
        Object[] objArr = {str, str2, map, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e5dd294c5c2a12bc51d6edf4ad9399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e5dd294c5c2a12bc51d6edf4ad9399");
        } else if (a(str, str2)) {
        } else {
            a(str);
            b(str, str2);
            JudasManualManager.a b = JudasManualManager.b(str).b(map);
            if (!TextUtils.isEmpty(null)) {
                b.a((String) null);
            }
            b.b = null;
            b.a();
        }
    }
}
