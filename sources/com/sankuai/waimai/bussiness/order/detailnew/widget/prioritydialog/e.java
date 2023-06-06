package com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog;

import android.app.Dialog;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static WeakHashMap<String, HashSet<a>> b = new WeakHashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public Dialog a;
        public Object b;
        public com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a c;

        public a(Dialog dialog, Object obj, com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a aVar) {
            this.a = dialog;
            this.b = obj;
            this.c = aVar;
        }
    }

    public static boolean a(String str, Dialog dialog, Object obj, com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog.a aVar) {
        boolean z = true;
        Object[] objArr = {str, dialog, obj, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "454dbba2c3a78f606d8543288171b667", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "454dbba2c3a78f606d8543288171b667")).booleanValue();
        }
        if (aVar != null && !TextUtils.isEmpty(str)) {
            HashSet<a> hashSet = b.get(str);
            if (com.sankuai.waimai.foundation.utils.b.b(hashSet)) {
                hashSet = new HashSet<>();
                b.put(str, hashSet);
            } else {
                Iterator<a> it = hashSet.iterator();
                boolean z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    a next = it.next();
                    if (next == null || next.a == null || !next.a.isShowing()) {
                        it.remove();
                    } else if (next.c.ordinal() > aVar.ordinal()) {
                        z = false;
                        break;
                    }
                    z2 = true;
                }
            }
            hashSet.add(new a(dialog, obj, aVar));
        }
        return z;
    }

    public static void a(String str, Dialog dialog) {
        Object[] objArr = {str, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79c239fd52fbeef1e690c1fe407d0b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79c239fd52fbeef1e690c1fe407d0b98");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            HashSet<a> hashSet = b.get(str);
            if (com.sankuai.waimai.foundation.utils.b.b(hashSet)) {
                b.remove(str);
                return;
            }
            Iterator<a> it = hashSet.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next == null || next.a == null || !next.a.isShowing()) {
                    it.remove();
                } else if (next.a == dialog) {
                    hashSet.remove(next);
                }
            }
            if (com.sankuai.waimai.foundation.utils.b.b(hashSet)) {
                b.remove(str);
            }
        }
    }

    public static boolean a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b774d21509e07441cf4a91e03a7c61d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b774d21509e07441cf4a91e03a7c61d")).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && b != null) {
            HashSet<a> hashSet = b.get(str);
            if (com.sankuai.waimai.foundation.utils.b.b(hashSet)) {
                return false;
            }
            Iterator<a> it = hashSet.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next == null || next.a == null || !next.a.isShowing()) {
                    it.remove();
                } else if (next.b == obj) {
                    return true;
                }
            }
        }
        return false;
    }
}
