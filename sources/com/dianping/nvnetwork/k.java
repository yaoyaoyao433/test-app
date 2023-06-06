package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static Request a(Request request, String str) {
        Object[] objArr = {request, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83ad2888b676ea23459f572963c68861", 6917529027641081856L)) {
            return (Request) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83ad2888b676ea23459f572963c68861");
        }
        try {
            if (request.g == null || !request.g.containsKey("MKOriginHost")) {
                String str2 = request.d;
                int indexOf = str2.indexOf("://");
                int i = indexOf + 3;
                int indexOf2 = str2.indexOf(47, i);
                String substring = str2.substring(0, indexOf);
                String substring2 = str2.substring(i, indexOf2);
                String substring3 = str2.substring(indexOf2 + 1);
                String str3 = substring3.split("\\?")[0];
                if (!str3.endsWith(".jpg") && !str3.endsWith(".png")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str.endsWith("/") ? "" : '/');
                    sb.append(substring3);
                    return request.a().url(sb.toString()).addHeaders("MKOriginHost", substring2).addHeaders("MKScheme", substring).addHeaders("MKUnionId", g.j()).ipUrl((String) null).build();
                }
                return request;
            }
            return request;
        } catch (Exception e) {
            e.printStackTrace();
            return request;
        }
    }
}
