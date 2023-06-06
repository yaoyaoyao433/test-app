package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends b {
    public static ChangeQuickRedirect c;
    public int d;

    public k(int i, Object obj, List<l> list, Object obj2) {
        super(i, obj, list, obj2);
        Object[] objArr = {Integer.valueOf(i), obj, list, obj2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e256736dbf63f6c017d84a9c272175", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e256736dbf63f6c017d84a9c272175");
        }
    }
}
