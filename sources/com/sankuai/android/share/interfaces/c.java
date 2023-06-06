package com.sankuai.android.share.interfaces;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.interfaces.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface c {
    void a(b.a aVar, a aVar2);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        COMPLETE,
        FAILED,
        CANCEL;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f177a468aaa311b2f22e3555d67323b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f177a468aaa311b2f22e3555d67323b2");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f700f23ff8210da7c777b027ab5e4c1", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f700f23ff8210da7c777b027ab5e4c1") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62fed20fbbd3530835731448ff9125d0", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62fed20fbbd3530835731448ff9125d0") : (a[]) values().clone();
        }
    }
}
