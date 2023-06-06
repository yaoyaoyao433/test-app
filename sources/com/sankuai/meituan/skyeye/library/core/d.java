package com.sankuai.meituan.skyeye.library.core;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.skyeye.library.core.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static d d;
    RuleParserImpl b;
    private volatile boolean c;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "557e64824dfee9b21a519c4fd1790926", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "557e64824dfee9b21a519c4fd1790926");
        }
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d();
                }
            }
        }
        return d;
    }

    public final boolean a(String str, String str2, boolean z) {
        String str3;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d56d0893b2a4cee25a1721d1f97292b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d56d0893b2a4cee25a1721d1f97292b0")).booleanValue();
        }
        if (!this.c) {
            this.c = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0112b335d0ca0de4d7f8215afcdb10a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0112b335d0ca0de4d7f8215afcdb10a1");
            } else {
                synchronized (this) {
                    String a2 = new a(new a.InterfaceC0646a() { // from class: com.sankuai.meituan.skyeye.library.core.d.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.skyeye.library.core.a.InterfaceC0646a
                        public final void a(String str4) {
                            Object[] objArr3 = {str4};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6b531e74039837fce8b445103454831", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6b531e74039837fce8b445103454831");
                            } else if (d.this.b != null) {
                                d.this.b.a(str4);
                            }
                        }
                    }).a();
                    Context d2 = e.d();
                    Object[] objArr3 = {d2};
                    ChangeQuickRedirect changeQuickRedirect3 = f.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "143b317a93ecdce4488f9139e5a41d92", RobustBitConfig.DEFAULT_VALUE)) {
                        str3 = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "143b317a93ecdce4488f9139e5a41d92");
                    } else {
                        if (TextUtils.isEmpty(f.b)) {
                            f.b = f.a(d2);
                        }
                        str3 = f.b;
                    }
                    this.b = new RuleParserImpl(str3, a2);
                    notifyAll();
                }
            }
        }
        if (this.b == null) {
            return false;
        }
        return this.b.a(str, str2, z);
    }
}
