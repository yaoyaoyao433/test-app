package com.sankuai.xm.file.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f20657b566447efbc0c12769917abf8d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f20657b566447efbc0c12769917abf8d");
        }
        return com.sankuai.xm.network.setting.f.a().b().a(false) + "/pan/base" + str;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cb439de13797546976e77fa1a3dff0e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cb439de13797546976e77fa1a3dff0e");
        }
        return com.sankuai.xm.network.setting.f.a().b().a(false) + "/pan/ul" + str;
    }
}
