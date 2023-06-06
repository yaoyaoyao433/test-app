package com.dianping.imagemanager.utils.downloadphoto.urlcompleter;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.imagemanager.utils.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final c b = new c();

    public static String a(j jVar, int i, int i2) {
        boolean z;
        a aVar;
        boolean z2;
        String str;
        boolean z3 = false;
        Object[] objArr = {jVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd877bba3c2d25f10ce523f7caa600d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd877bba3c2d25f10ce523f7caa600d5");
        }
        if (jVar == null || jVar.b == null || jVar.b.length() == 0) {
            return null;
        }
        String str2 = jVar.b;
        if ((com.dianping.imagemanager.base.a.a().g & 4) != 0 && jVar.c == j.a.HTTP) {
            j.a aVar2 = j.a.HTTPS;
            String a2 = jVar.a();
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = j.a.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "86675d7a50d7fbbccf41dcf68f6f4dc4", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "86675d7a50d7fbbccf41dcf68f6f4dc4");
            } else {
                str = aVar2.h + a2;
            }
            str2 = str;
        }
        if ((com.dianping.imagemanager.base.a.a().g & 3) != 0) {
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7f2edd9d94001d5c6f1bc62a289a232d", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7f2edd9d94001d5c6f1bc62a289a232d");
            } else {
                String host = Uri.parse(str2).getHost();
                Object[] objArr4 = {host};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "60ed47bb909073c5b08c0845f157bc2f", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "60ed47bb909073c5b08c0845f157bc2f")).booleanValue();
                } else {
                    z = !TextUtils.isEmpty(host) && (host.equals("p0.meituan.net") || host.equals("p1.meituan.net") || host.equals("img.meituan.net"));
                }
                aVar = z ? b : null;
            }
            if (aVar != null) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "9bacf5d521bab852184e1b9a15fc795f", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "9bacf5d521bab852184e1b9a15fc795f")).booleanValue();
                } else {
                    z2 = (com.dianping.imagemanager.base.a.a().g & 2) != 0;
                }
                if (z2) {
                    str2 = aVar.a(str2, i, i2);
                }
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "7d9605f4e28238627eecd68421035654", RobustBitConfig.DEFAULT_VALUE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "7d9605f4e28238627eecd68421035654")).booleanValue();
                } else if ((com.dianping.imagemanager.base.a.a().g & 1) != 0) {
                    z3 = true;
                }
                return z3 ? aVar.a(str2) : str2;
            }
            return str2;
        }
        return str2;
    }
}
