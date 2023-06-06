package com.sankuai.waimai.business.page.home.list.future.ad;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.business.page.common.list.popuplayer.e b;
    a c;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public ViewGroup a;
        public String b;
        public String c;
        public String d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(String str, long j);
    }

    public d(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5b9c60613c50e3f5965cf318a45efba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5b9c60613c50e3f5965cf318a45efba");
        } else {
            this.c = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T a(Map<String, Object> map, String str, Class<T> cls) {
        Object[] objArr = {map, str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bca03f06a396744eac68607a1c30174", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bca03f06a396744eac68607a1c30174");
        }
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }
}
