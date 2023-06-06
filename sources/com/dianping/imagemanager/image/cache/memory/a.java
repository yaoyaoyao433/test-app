package com.dianping.imagemanager.image.cache.memory;

import android.util.LruCache;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private LruCache<String, byte[]> b;

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.imagemanager.image.cache.memory.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0080a {
        public static final a a = new a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c170ddba7a64a68060cce4df9430fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c170ddba7a64a68060cce4df9430fa");
        } else {
            a(5);
        }
    }

    private void a(int i) {
        Object[] objArr = {5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b24f4425e4d272d59dec4fa9adf2275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b24f4425e4d272d59dec4fa9adf2275");
        } else {
            this.b = new LruCache<>(5);
        }
    }

    private LruCache<String, byte[]> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1628f36c762216767854a5e2f56e68a", RobustBitConfig.DEFAULT_VALUE)) {
            return (LruCache) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1628f36c762216767854a5e2f56e68a");
        }
        if (this.b == null) {
            a(5);
        }
        return this.b;
    }

    public final synchronized boolean a(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9ddd3e0bf06e0bacb6edcbf1fc9406", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9ddd3e0bf06e0bacb6edcbf1fc9406")).booleanValue();
        } else if (com.dianping.imagemanager.base.a.a().h) {
            if (str == null) {
                return false;
            }
            a().put(str, bArr);
            return true;
        } else {
            return false;
        }
    }

    public final synchronized byte[] a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848933038ec576f4090f6f7c127aab51", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848933038ec576f4090f6f7c127aab51");
        } else if (com.dianping.imagemanager.base.a.a().h) {
            if (str == null) {
                return null;
            }
            byte[] bArr = a().get(str);
            if (bArr == null) {
                a().remove(str);
                return null;
            }
            return bArr;
        } else {
            return null;
        }
    }
}
