package com.sankuai.waimai.business.im.group.cache;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.model.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Map<Long, e.a> b;
    private final Map<String, Boolean> c;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8120c0a62ed0179be113ab0d0c8216b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8120c0a62ed0179be113ab0d0c8216b2");
            return;
        }
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99adb24388b3e857d7a01e6583518de8", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99adb24388b3e857d7a01e6583518de8") : a.a;
    }

    public final void a(long j, e.a aVar) {
        Object[] objArr = {new Long(j), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "818d561bd4ac04dbf91b2810c4b46e44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "818d561bd4ac04dbf91b2810c4b46e44");
        } else {
            this.b.put(Long.valueOf(j), aVar);
        }
    }

    public final void a(@Nullable Map<String, Boolean> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "118a564698f1643210933ed5e96b3321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "118a564698f1643210933ed5e96b3321");
            return;
        }
        this.c.clear();
        if (map == null || map.isEmpty()) {
            return;
        }
        this.c.putAll(map);
    }

    public final e.a a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7962ae92b1a6f9dc501be0df9e17d1f", RobustBitConfig.DEFAULT_VALUE)) {
            return (e.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7962ae92b1a6f9dc501be0df9e17d1f");
        }
        if (this.b.containsKey(Long.valueOf(j))) {
            return this.b.get(Long.valueOf(j));
        }
        return null;
    }

    @NonNull
    public final Map<String, Boolean> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11294452cd98e831afae6a85e48c7120", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11294452cd98e831afae6a85e48c7120") : new HashMap(this.c);
    }
}
