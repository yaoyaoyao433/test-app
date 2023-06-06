package com.sankuai.meituan.skyeye.library.core;

import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    volatile String b;
    InterfaceC0646a c;
    private volatile boolean d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.skyeye.library.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0646a {
        void a(String str);
    }

    public a(InterfaceC0646a interfaceC0646a) {
        Object[] objArr = {interfaceC0646a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3fc5910027e80fd70ca6f5bf3250878", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3fc5910027e80fd70ca6f5bf3250878");
            return;
        }
        this.d = false;
        this.b = "";
        this.c = interfaceC0646a;
    }

    @Override // com.sankuai.meituan.skyeye.library.core.b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27218f764c53f06752118f3b8a200f37", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27218f764c53f06752118f3b8a200f37");
        }
        if (!this.d) {
            this.d = true;
            if (e.b) {
                System.out.println("Bussiness-Monitor:LoadHornConfig:[Start]");
            }
            Horn.register(e.c(), new HornCallback() { // from class: com.sankuai.meituan.skyeye.library.core.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b4832d6f285e47a84aa2fc698579cab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b4832d6f285e47a84aa2fc698579cab");
                        return;
                    }
                    try {
                        if (e.b) {
                            PrintStream printStream = System.out;
                            printStream.println("Bussiness-Monitor:LoadHornConfig:[Finished]:" + str);
                        }
                        if (!TextUtils.isEmpty(str) && a.this.c != null) {
                            a.this.c.a(str);
                        }
                        a.this.b = str;
                    } catch (Throwable unused) {
                    }
                }
            });
            if (e.b) {
                System.out.println("Bussiness-Monitor:LoadHornConfig:[Wait]");
            }
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = Horn.accessCache(e.c());
        }
        return this.b;
    }
}
