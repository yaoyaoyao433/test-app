package com.sankuai.waimai.router.common;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.router.core.j {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.j
    public final /* synthetic */ com.sankuai.waimai.router.core.j a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d34857446a5f74cbae75ae93437d59c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d34857446a5f74cbae75ae93437d59c") : (b) super.a(str);
    }

    @Override // com.sankuai.waimai.router.core.j
    public final /* synthetic */ com.sankuai.waimai.router.core.j b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40a56e43cf94894121d588b8eb28d6f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40a56e43cf94894121d588b8eb28d6f") : (b) super.b(i);
    }

    public b(@NonNull Context context, @NonNull Uri uri) {
        super(context, uri);
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf2adf180bb2b454e7593c71faa64a08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf2adf180bb2b454e7593c71faa64a08");
        }
    }

    public b(@NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c98250d0a28e0383c4ee624d8c57f86c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c98250d0a28e0383c4ee624d8c57f86c");
        }
    }

    @Override // com.sankuai.waimai.router.core.j
    /* renamed from: a */
    public final b b(com.sankuai.waimai.router.core.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e1efd85b199b883856f5527d53b1430", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e1efd85b199b883856f5527d53b1430") : (b) super.b(eVar);
    }

    public final b a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1857c0da91692239a208c463eedb149e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1857c0da91692239a208c463eedb149e");
        }
        a("com.sankuai.waimai.router.activity.animation", (String) new int[]{i, i2});
        return this;
    }

    public final b a(int i) {
        Object[] objArr = {Integer.valueOf((int) y.a)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d35482ed7f5b2d8e84b54a9996e6807d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d35482ed7f5b2d8e84b54a9996e6807d");
        }
        a("com.sankuai.waimai.router.activity.flags", (String) Integer.valueOf((int) y.a));
        return this;
    }

    public final b a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f56ea7a63a4e6b28d28d66dc1a1e3c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f56ea7a63a4e6b28d28d66dc1a1e3c4");
        }
        i().putBoolean(str, z);
        return this;
    }

    public final b a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081677562dc8b57db36ab6f92c5fc442", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081677562dc8b57db36ab6f92c5fc442");
        }
        i().putInt(str, i);
        return this;
    }

    public final b a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14803f193a6deaafc8fa5aabf199647", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14803f193a6deaafc8fa5aabf199647");
        }
        i().putLong(str, j);
        return this;
    }

    public final b a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abbbf2da07f8e4c996c3e61a8f482453", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abbbf2da07f8e4c996c3e61a8f482453");
        }
        i().putString(str, str2);
        return this;
    }

    public final b a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb59dd571dc209941a54c1dbd1b83379", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb59dd571dc209941a54c1dbd1b83379");
        }
        if (bundle != null) {
            i().putAll(bundle);
        }
        return this;
    }

    @NonNull
    private synchronized Bundle i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13f16af1b7333530bd9cf4d15a4fa35", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13f16af1b7333530bd9cf4d15a4fa35");
        }
        Bundle bundle = (Bundle) a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
        if (bundle == null) {
            bundle = new Bundle();
            a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
        }
        return bundle;
    }
}
