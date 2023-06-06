package com.meituan.android.ptcommonim.cardrender;

import android.support.annotation.Nullable;
import com.meituan.android.ptcommonim.cardrender.model.MachData;
import com.meituan.android.ptcommonim.cardrender.model.MachInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static volatile c d;
    public final b b;
    public final ExecutorService c;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7bdb09a39852b2dd9520a9fc03d09af", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7bdb09a39852b2dd9520a9fc03d09af");
        }
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba2236a6b9f83967b358a22e145041e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba2236a6b9f83967b358a22e145041e4");
            return;
        }
        this.b = new b();
        this.c = com.sankuai.android.jarvis.c.b("MachInfoManager-thread");
    }

    public static /* synthetic */ void a(c cVar, String str, String str2) {
        Object[] objArr = {cVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d39ac05a9438db568c6a0acf64c93b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d39ac05a9438db568c6a0acf64c93b8");
            return;
        }
        b bVar = cVar.b;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2e8219b00249f6cca27da6f4a8d11390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2e8219b00249f6cca27da6f4a8d11390");
        } else {
            bVar.a(str, str2, true);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38f5071f5180bc954e16ca8f5aee50c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38f5071f5180bc954e16ca8f5aee50c");
        } else {
            this.c.execute(d.a(this, str, str2));
        }
    }

    @Nullable
    public final MachInfo a(String str, String str2, String str3, boolean z) {
        MachInfo a2;
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eedb55b3b6fa915eaf90e0d6a9744f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eedb55b3b6fa915eaf90e0d6a9744f9");
        }
        b bVar = this.b;
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a054cbcf0149f2be997ab4359677019a", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (MachInfo) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a054cbcf0149f2be997ab4359677019a");
        } else {
            Object[] objArr3 = {str, str2, str3, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "43bb4a3a7897a9fe4cd8339d07672b07", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (MachInfo) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "43bb4a3a7897a9fe4cd8339d07672b07");
            } else {
                Map<String, List<MachData.Data.Template>> a3 = bVar.b.a();
                a2 = bVar.a(a3, com.meituan.android.ptcommonim.protocol.env.a.b + CommonConstant.Symbol.UNDERLINE + str + CommonConstant.Symbol.UNDERLINE + str2, str3);
            }
        }
        if (a2 == null || z) {
            a(str, str2);
        }
        return a2;
    }
}
