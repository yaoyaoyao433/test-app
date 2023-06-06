package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.InputStream;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static int a(q qVar) {
        int i = 0;
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22375f04e22f827328fe3dbfc5837ac7", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22375f04e22f827328fe3dbfc5837ac7")).intValue();
        }
        if (qVar == null) {
            return 0;
        }
        try {
            i = 0 + (qVar.result() != null ? qVar.result().length : 0);
            return i + a(qVar.headers());
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    private static int a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fe61978cfb86ed3379c51bea492fe93", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fe61978cfb86ed3379c51bea492fe93")).intValue();
        }
        if (map == null || map.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            sb.append(str);
            sb.append(map.get(str));
        }
        return sb.toString().getBytes().length;
    }

    public static int a(Request request) {
        int i = 0;
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fcdc42c3c7b179f8cfd6d82f1f1f99a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fcdc42c3c7b179f8cfd6d82f1f1f99a")).intValue();
        }
        if (request == null) {
            return 0;
        }
        try {
            InputStream inputStream = request.i;
            if (inputStream != null && inputStream.markSupported()) {
                inputStream.reset();
            }
            i = 0 + (inputStream != null ? inputStream.available() : 0);
            return i + a(request.g) + request.d.getBytes().length;
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }
}
