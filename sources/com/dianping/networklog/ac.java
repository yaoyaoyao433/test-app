package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes.dex */
public final class ac {
    public static ChangeQuickRedirect a;
    public a b;
    public l c;
    public af d;
    public String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum a {
        WRITE,
        SEND,
        FLUSH,
        ROLLOVER;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa63ff5dda3b295d31f5072af13345c7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa63ff5dda3b295d31f5072af13345c7");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8f82263eca99963b6413dd60955a56b", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8f82263eca99963b6413dd60955a56b") : Enum.valueOf(a.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24105038f8f7bdcb4f503adc6d64c036", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24105038f8f7bdcb4f503adc6d64c036") : values().clone());
        }
    }
}
