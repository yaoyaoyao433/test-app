package com.sankuai.waimai.business.im.prepare;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements com.sankuai.waimai.business.im.api.b {
    public static ChangeQuickRedirect a;

    public f() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static f a = new f();
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(long j, short s, String str, d.a aVar) {
        Object[] objArr = {new Long(j), Short.valueOf(s), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3acfda0cb70c46068bc5511119a85c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3acfda0cb70c46068bc5511119a85c2");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a((short) 1001, j, 0L, s, str, aVar);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, long j, String str, int i, long j2, boolean z, boolean z2) {
        Object[] objArr = {activity, sessionId, new Long(j), str, Integer.valueOf(i), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209a35073a9b4a8a8ab5492c3d7c4876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209a35073a9b4a8a8ab5492c3d7c4876");
        } else {
            a(activity, sessionId, j, str, i, j2, z, z2, null);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, long j, String str, int i, long j2, boolean z, boolean z2, Bundle bundle) {
        Object[] objArr = {activity, sessionId, new Long(j), str, Integer.valueOf(i), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d010de9e6801bb01979fd521cc29a235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d010de9e6801bb01979fd521cc29a235");
        } else {
            new l(activity, j, str, i, j2, z, z2, bundle).a();
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, int i2, String str2, boolean z) {
        Object[] objArr = {activity, sessionId, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c4274014a620a821cc6c89c42e294b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c4274014a620a821cc6c89c42e294b9");
        } else {
            a(activity, sessionId, i, j, j2, str, j3, i2, str2, z, null);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, int i2, String str2, boolean z, Bundle bundle) {
        Object[] objArr = {activity, sessionId, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a90eae3b6611da5a145d2b7ea4dfa680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a90eae3b6611da5a145d2b7ea4dfa680");
        } else {
            new j(activity, i, j, j2, str, j3, null, i2, str2, z, bundle).a();
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, HashSet<String> hashSet, int i2, String str2, boolean z, Bundle bundle) {
        Object[] objArr = {activity, sessionId, Integer.valueOf(i), new Long(j), new Long(j2), str, new Long(j3), hashSet, Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a3c7b5479425b2a5e9f67c0b8a5d8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a3c7b5479425b2a5e9f67c0b8a5d8b");
        } else {
            new j(activity, i, j, j2, str, j3, hashSet, i2, str2, z, bundle).a();
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, long j, long j2, String str, String str2, int i, int i2, boolean z, b.a aVar, int i3) {
        Object[] objArr = {activity, new Long(j), new Long(j2), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "988a88f0288498e262d07324d6d41f26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "988a88f0288498e262d07324d6d41f26");
        } else {
            new com.sankuai.waimai.business.im.group.prepare.m(activity, j, j2, str, str2, i, i2, z, aVar, i3).a();
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, String str, int i, boolean z, long j, int i2, int i3) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeaa686faa4b645826ca44e375c3e239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeaa686faa4b645826ca44e375c3e239");
        } else {
            new com.sankuai.waimai.business.im.group.prepare.i(activity, str, i, z, j, i2, i3).a();
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void a(Activity activity, String str, int i, boolean z, long j, int i2, long j2, String str2) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), new Long(j2), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a20bd191a75226a3e8ff82aae326453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a20bd191a75226a3e8ff82aae326453");
        } else {
            new com.sankuai.waimai.business.im.group.prepare.k(activity, str, i, z, j, i2, j2, str2).a();
        }
    }

    @Override // com.sankuai.waimai.business.im.api.b
    public final void b(Activity activity, String str, int i, boolean z, long j, int i2, int i3) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2eb91cd1341a3183ad1cf6cd8ee315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2eb91cd1341a3183ad1cf6cd8ee315");
        } else {
            new com.sankuai.waimai.business.im.group.prepare.j(activity, str, i, z, j, i2, i3).a();
        }
    }
}
