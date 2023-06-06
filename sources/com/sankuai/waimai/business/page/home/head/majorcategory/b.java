package com.sankuai.waimai.business.page.home.head.majorcategory;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.helper.f;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public List<NavigateItem> b;
    public String c;
    public String d;
    public String e;
    public int f;
    public List<List<NavigateItem>> g;
    public String h;
    int i;
    public boolean j;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fe436d349335b9ec88a66a029fb0806", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fe436d349335b9ec88a66a029fb0806");
            return;
        }
        this.i = 15;
        a();
    }

    public b(List<NavigateItem> list, String str, String str2, String str3, int i, String str4, boolean z) {
        Object[] objArr = {list, str, str2, str3, Integer.valueOf(i), str4, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c562b395e3d912ef96214225835c8790", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c562b395e3d912ef96214225835c8790");
            return;
        }
        this.i = 15;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.h = str4;
        this.j = z;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1fd9ef29f011159d086c738e296e308", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1fd9ef29f011159d086c738e296e308");
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList(2);
        }
        if (com.sankuai.waimai.business.page.home.helper.b.a().c) {
            this.i = 10;
        } else {
            this.i = 15;
        }
        this.g.clear();
        if (!com.sankuai.waimai.foundation.utils.d.a(this.b)) {
            int size = this.b.size();
            if (TextUtils.isEmpty(this.h)) {
                ArrayList arrayList = new ArrayList();
                if (size <= this.i) {
                    arrayList.addAll(this.b);
                } else {
                    arrayList.addAll(this.b.subList(0, this.i - 1));
                    arrayList.add(this.b.get(size - 1));
                }
                this.g.add(arrayList);
                return;
            }
            boolean z = size > this.i;
            int min = Math.min(size, this.i * 2);
            this.g.add(new ArrayList(this.b.subList(0, z ? this.i : size)));
            if (z) {
                if (size <= this.i * 2) {
                    this.g.add(new ArrayList(this.b.subList(this.i, min)));
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.b.subList(this.i, (this.i * 2) - 1));
                arrayList2.add(this.b.get(size - 1));
                this.g.add(arrayList2);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(f.a());
        this.g.add(arrayList3);
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52f545daf070cb200402f0b1fd0d2412", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52f545daf070cb200402f0b1fd0d2412")).booleanValue() : this.g != null && this.g.size() == 2;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff45b35ede699c2679c712929da9c7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff45b35ede699c2679c712929da9c7f")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }
}
