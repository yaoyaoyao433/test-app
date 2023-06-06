package com.meituan.shadowsong.mss;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.q;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static String a(aj ajVar, String str, List<q> list) {
        String contentType;
        Object[] objArr = {ajVar, str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69514f907c58338ad8de9b14868558a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69514f907c58338ad8de9b14868558a4");
        }
        String a2 = ajVar.a("Content-MD5") == null ? "" : ajVar.a("Content-MD5");
        try {
            String b = ajVar.b();
            String c = ajVar.c();
            ak i = ajVar.i();
            Object[] objArr2 = {i};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ad62ccadce925fb8228489a156c7af7", RobustBitConfig.DEFAULT_VALUE)) {
                contentType = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6ad62ccadce925fb8228489a156c7af7");
            } else if (i == null) {
                contentType = "";
            } else {
                contentType = i.contentType() == null ? "" : i.contentType();
            }
            return c.a(b, c, a2, contentType, list, str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
