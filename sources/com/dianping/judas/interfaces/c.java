package com.dianping.judas.interfaces;

import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface c {
    String a(a aVar);

    void a(EventInfo eventInfo, a aVar);

    void a(String str, a aVar);

    EventInfo b(a aVar);

    @Deprecated
    String getGAString();

    @Deprecated
    com.dianping.widget.view.d getGAUserInfo();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        CLICK,
        VIEW;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f56690a2affc454788c95be730ad9f39", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f56690a2affc454788c95be730ad9f39");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fd579e5354786a02ef35b2295a4f951", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fd579e5354786a02ef35b2295a4f951") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77841b71dbf85f1c9dd12da16cb3166f", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77841b71dbf85f1c9dd12da16cb3166f") : (a[]) values().clone();
        }
    }
}
