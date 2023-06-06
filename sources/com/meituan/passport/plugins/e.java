package com.meituan.passport.plugins;

import android.text.TextUtils;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class e {
    public static ChangeQuickRedirect a;

    public abstract String c() throws IOException;

    public final rx.d<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb8abb44710ec8b9d405c6097bc392a", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb8abb44710ec8b9d405c6097bc392a") : e();
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf1988bbf4ab122fbb0526d5e48aa55d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf1988bbf4ab122fbb0526d5e48aa55d");
        }
        try {
            String c = c();
            if (TextUtils.isEmpty(c)) {
                com.meituan.passport.utils.m.a(new IOException("fingerPrint is empty"));
            }
            return c;
        } catch (IOException e) {
            Utils.a(getClass(), e);
            return null;
        }
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52613a0e6d025a2f1651508ef912fd5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52613a0e6d025a2f1651508ef912fd5f");
        }
        try {
            return c();
        } catch (IOException unused) {
            return "";
        }
    }

    private rx.d<String> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "044cd2bc464613b4d6e2e11a62d68da2", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "044cd2bc464613b4d6e2e11a62d68da2");
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        return rx.d.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1b88d366a9d69284e2485fd9ad7263ec", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1b88d366a9d69284e2485fd9ad7263ec") : new f(this)).b(rx.schedulers.a.e());
    }
}
