package com.sankuai.waimai.bussiness.order.base.feedback;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.business.order.api.model.c b;
    public String c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z, int i, List<c.b> list, String str, long j, String str2);

        void a(boolean z, boolean z2, int i);
    }

    public static List<c.b> a(com.sankuai.waimai.business.order.api.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9c7e1873ba206f4d14103a395a38e53", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9c7e1873ba206f4d14103a395a38e53");
        }
        ArrayList arrayList = new ArrayList();
        if (cVar != null && cVar.d != null && com.sankuai.waimai.foundation.utils.b.a(cVar.d.a)) {
            List<c.b> list = cVar.d.a;
            for (c.b bVar : list) {
                if (bVar.j != 0 && com.sankuai.waimai.foundation.utils.b.a(bVar.f)) {
                    for (c.C0753c c0753c : bVar.f) {
                        c0753c.f = bVar.j;
                    }
                    bVar.j = 0L;
                }
            }
            c.b a2 = b.a(list.get(0), list);
            if (a2 != null) {
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    c.b bVar2 = list.get(i2);
                    if (bVar2.c == 0) {
                        arrayList.add(bVar2);
                        if (a2.a == bVar2.a) {
                            i = arrayList.size() - 1;
                        }
                    }
                }
                if (i > 0) {
                    Collections.swap(arrayList, 0, i);
                }
            }
        }
        return arrayList;
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b01b08672268214ef6df79a7d9e0a7e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b01b08672268214ef6df79a7d9e0a7e9");
        }
        return OrderFeedbackFragment.class.getSimpleName() + System.currentTimeMillis();
    }

    public static FragmentManager a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5ef9f782c47997581c770d51a9ab1b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (FragmentManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5ef9f782c47997581c770d51a9ab1b7");
        }
        if (context instanceof FragmentActivity) {
            return ((FragmentActivity) context).getSupportFragmentManager();
        }
        return null;
    }

    public final String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b435d00a7766fcec32e3dbdb6d242f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b435d00a7766fcec32e3dbdb6d242f8");
        }
        if (TextUtils.isEmpty(this.c)) {
            this.c = AppUtil.generatePageInfoKey(context);
        }
        return this.c;
    }
}
