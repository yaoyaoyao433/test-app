package com.sankuai.waimai.business.im.api;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.imbase.utils.e;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public b b;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0728a {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "987093952b55a8fe796e4b24539fee7d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "987093952b55a8fe796e4b24539fee7d") : C0728a.a;
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(long j, short s, String str, final d.a aVar) {
        Object[] objArr = {new Long(j), Short.valueOf(s), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431cead9ff9100f81982e4cac354aa50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431cead9ff9100f81982e4cac354aa50");
        } else if (this.b != null) {
            this.b.a(j, s, str, aVar);
        } else if (aVar != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar.a(0);
            } else {
                e.a().a(new Runnable() { // from class: com.sankuai.waimai.business.im.api.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "451cc566cfb6c369d9f9e888ef2a1985", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "451cc566cfb6c369d9f9e888ef2a1985");
                        } else {
                            aVar.a(0);
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, long j, String str, int i, long j2, boolean z, boolean z2) {
        Object[] objArr = {activity, sessionId, new Long(j), str, Integer.valueOf(i), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af6089600154c3ec941d95fd23bc795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af6089600154c3ec941d95fd23bc795");
        } else if (this.b != null) {
            this.b.a(activity, sessionId, j, str, i, j2, z, z2);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, long j, String str, int i, long j2, boolean z, boolean z2, Bundle bundle) {
        Object[] objArr = {activity, sessionId, new Long(j), str, Integer.valueOf(i), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ec24e5103fd20d35b693ce633e03f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ec24e5103fd20d35b693ce633e03f4");
        } else if (this.b != null) {
            this.b.a(activity, sessionId, j, str, i, j2, z, z2, bundle);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, HashSet<String> hashSet, int i2, String str2, boolean z, Bundle bundle) {
        Object[] objArr = {activity, sessionId, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), hashSet, Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f27c33c53f94957807240265ce116a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f27c33c53f94957807240265ce116a4");
        } else if (this.b != null) {
            this.b.a(activity, sessionId, i, j, j2, str, j3, hashSet, i2, str2, z, bundle);
        }
    }

    @Deprecated
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, long j3, int i2, String str, boolean z) {
        Object[] objArr = {activity, null, Integer.valueOf(i), new Long(j), new Long(j2), new Long(j3), 10, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755c356d65238be0a1d795c31feafeea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755c356d65238be0a1d795c31feafeea");
        } else {
            a(activity, (SessionId) null, i, j, j2, "", j3, 10, str, false);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, int i2, String str2, boolean z) {
        Object[] objArr = {activity, sessionId, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffe72b86a8af8054d0faf5779e57918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffe72b86a8af8054d0faf5779e57918");
        } else if (this.b != null) {
            this.b.a(activity, sessionId, i, j, j2, str, j3, i2, str2, z);
        }
    }

    @Deprecated
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, long j3, int i2, String str, boolean z, Bundle bundle) {
        Object[] objArr = {activity, null, Integer.valueOf(i), new Long(j), new Long(j2), new Long(j3), 10, str, (byte) 0, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e139594f7caf3135c92a40fffbf66b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e139594f7caf3135c92a40fffbf66b");
        } else {
            a(activity, null, i, j, j2, "", j3, 10, str, false, bundle);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, int i2, String str2, boolean z, Bundle bundle) {
        Object[] objArr = {activity, sessionId, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd13a33710f82b935a231706e9fb69e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd13a33710f82b935a231706e9fb69e");
        } else if (this.b != null) {
            this.b.a(activity, sessionId, i, j, j2, str, j3, i2, str2, z, bundle);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, long j, long j2, String str, String str2, int i, int i2, boolean z, b.a aVar, int i3) {
        Object[] objArr = {activity, new Long(j), new Long(j2), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e9a925adf527146572bcb51f6433d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e9a925adf527146572bcb51f6433d5");
        } else if (this.b != null) {
            this.b.a(activity, j, j2, str, str2, i, i2, z, aVar, i3);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, String str, int i, boolean z, long j, int i2, int i3) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca86a5ad745b2e9676d30076ac614c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca86a5ad745b2e9676d30076ac614c3");
        } else if (this.b != null) {
            this.b.a(activity, str, i, z, j, i2, i3);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, String str, int i, boolean z, long j, int i2, long j2, String str2) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e5e60cfadf65408e78a9f152ff6f693", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e5e60cfadf65408e78a9f152ff6f693");
        } else if (this.b != null) {
            this.b.a(activity, str, i, z, j, i2, j2, str2);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void b(Activity activity, String str, int i, boolean z, long j, int i2, int i3) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a377e4136c1fd94fcdfaac2e7a412fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a377e4136c1fd94fcdfaac2e7a412fe");
        } else if (this.b != null) {
            this.b.b(activity, str, i, z, j, i2, i3);
        }
    }
}
