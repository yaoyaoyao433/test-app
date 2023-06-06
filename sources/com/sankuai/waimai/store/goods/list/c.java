package com.sankuai.waimai.store.goods.list;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.msc.common.utils.ay;
import com.meituan.msc.modules.engine.q;
import com.meituan.msc.modules.update.pkg.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.router.components.h;
import com.sankuai.waimai.router.components.i;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c {
    public static ChangeQuickRedirect b;

    public abstract void a(@NonNull j jVar, @NonNull g gVar, @Nullable Bundle bundle);

    public abstract boolean a(@NonNull j jVar);

    public abstract boolean b(@NonNull j jVar);

    public final String a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf8020b2467a8da2ff9ff67c0eb8465", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf8020b2467a8da2ff9ff67c0eb8465");
        }
        if (uri == null) {
            return "";
        }
        String b2 = af.b(uri, "poi_id", "-1");
        return !com.sankuai.waimai.store.platform.domain.manager.poi.a.b(b2) ? af.b(uri, "restaurant_id", "-1") : b2;
    }

    public final String b(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346397ef7f18d932ff4a470be5eb66a5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346397ef7f18d932ff4a470be5eb66a5") : uri == null ? "" : af.b(uri, FoodDetailNetWorkPreLoader.URI_POI_STR, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, j jVar, g gVar) {
        Object[] objArr = {str, str2, jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73ed4b6f249544742fa07c556faf6ed8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73ed4b6f249544742fa07c556faf6ed8");
            return;
        }
        Bundle bundle = new Bundle();
        a(jVar.d, bundle, str, str2);
        a(jVar, gVar, bundle);
    }

    private void a(Uri uri, Bundle bundle, String str, String str2) {
        Object[] objArr = {uri, bundle, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd778de3c4fe14ceccdd63c12aa3658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd778de3c4fe14ceccdd63c12aa3658");
            return;
        }
        bundle.putInt("need_add", af.a(uri, "add_to_shopcart", 0));
        bundle.putLong("foodId", af.a(uri, "foodId", -1L));
        bundle.putString("order_again", af.b(uri, "order_again", ""));
        bundle.putString("from", af.b(uri, "from", ""));
        bundle.putString("poiId", str);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str2);
        String b2 = af.b(uri, "g_source", "");
        if (TextUtils.isEmpty(b2) || "0".equals(b2)) {
            String b3 = af.b(uri, "source", "");
            if ("1".equals(b3)) {
                b2 = "8";
            } else if ("2".equals(b3)) {
                b2 = "10";
            } else if ("3".equals(b3)) {
                b2 = "9";
            } else if ("6".equals(b3)) {
                b2 = "7";
            }
        }
        bundle.putString("gSource", b2);
    }

    public final void a(@NonNull final j jVar, @NonNull final g gVar, @Nullable Bundle bundle, boolean z) {
        Object[] objArr = {jVar, gVar, bundle, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "791c578efc5b0b9dd724c8e337fdff24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "791c578efc5b0b9dd724c8e337fdff24");
        } else if (z) {
            jVar.a("com.sankuai.waimai.router.common.try_start_uri", (String) Boolean.TRUE);
            final String uri = jVar.d.toString();
            com.sankuai.shangou.stone.util.log.a.b("msc-store scheme", uri, new Object[0]);
            if (!b() && (jVar.c instanceof Activity)) {
                com.sankuai.waimai.store.locate.a.a((Activity) jVar.c, "dj-2d4b04dd8aa72700", new com.sankuai.waimai.store.i.locate.c() { // from class: com.sankuai.waimai.store.goods.list.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.i.locate.c
                    public final void a(@Nullable WMLocation wMLocation) {
                        Object[] objArr2 = {wMLocation};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc30cd2f78b07a06f8fac9618013cd12", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc30cd2f78b07a06f8fac9618013cd12");
                        } else if (((Activity) jVar.c).isFinishing()) {
                        } else {
                            com.sankuai.waimai.store.router.d.a(jVar, uri);
                            gVar.a(200);
                        }
                    }
                });
                return;
            }
            com.sankuai.waimai.store.router.d.a(jVar, uri);
            gVar.a(200);
        } else {
            try {
                Intent intent = new Intent(jVar.c, Class.forName("com.sankuai.waimai.store.goods.list.SCSuperMarketActivity"));
                intent.setData(jVar.d);
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                i.a(intent, jVar);
                jVar.b("com.sankuai.waimai.router.activity.limit_package", (String) Boolean.FALSE);
                gVar.a(h.a(jVar, intent));
            } catch (ClassNotFoundException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2ea75d1f61dc16a25f1eee8b3ad841", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2ea75d1f61dc16a25f1eee8b3ad841")).booleanValue() : com.sankuai.waimai.store.locate.a.c() != null;
    }

    public final String a(j jVar, Map<String, String> map) {
        Set<String> queryParameterNames;
        Object[] objArr = {jVar, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722b5fefdd93698c695d98ad27e7dbcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722b5fefdd93698c695d98ad27e7dbcb");
        }
        String a = com.sankuai.waimai.store.msc.a.a();
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        f.a(hashMap);
        HashMap hashMap2 = new HashMap(hashMap);
        Uri uri = jVar.d;
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null) {
            for (String str : queryParameterNames) {
                hashMap2.put(str, uri.getQueryParameter(str));
            }
        }
        return com.sankuai.waimai.store.router.g.a(a, hashMap2);
    }

    public final boolean a() {
        a.C0476a c0476a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d21eb7e4be015ee28cfea1f4322d92", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d21eb7e4be015ee28cfea1f4322d92")).booleanValue();
        }
        if (com.sankuai.waimai.store.config.i.h().a("check_msc_basic_library_on/value", false)) {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.pkg.a.a;
                c0476a = null;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9155f725c7214370d9db53058272d438", RobustBitConfig.DEFAULT_VALUE)) {
                    c0476a = (a.C0476a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9155f725c7214370d9db53058272d438");
                } else if (com.meituan.msc.modules.update.pkg.a.b == null) {
                    com.meituan.msc.modules.reporter.g.d("MSCBaseInfoHelper", "getBasePackageInfoCached basePackageInfoCached is null");
                } else {
                    String str = null;
                    String str2 = null;
                    for (Pair<String, String> pair : q.b()) {
                        if (str == null) {
                            str2 = (String) pair.first;
                            str = (String) pair.second;
                        } else if (!TextUtils.equals(str2, (CharSequence) pair.first) || !TextUtils.equals(str, (CharSequence) pair.second)) {
                            com.meituan.msc.modules.reporter.g.d("MSCBaseInfoHelper", "getBasePackageInfoCached has different base package version1");
                            break;
                        }
                    }
                    a.C0476a.C0477a c0477a = new a.C0476a.C0477a();
                    c0477a.b = "base_package_env_prod";
                    c0477a.c = str2;
                    c0477a.d = str;
                    a.C0476a a = c0477a.a();
                    if (a.equals(com.meituan.msc.modules.update.pkg.a.b)) {
                        com.meituan.msc.modules.reporter.g.d("MSCBaseInfoHelper", "getBasePackageInfoCached", a);
                        c0476a = com.meituan.msc.modules.update.pkg.a.b;
                    } else {
                        com.meituan.msc.modules.reporter.g.d("MSCBaseInfoHelper", "getBasePackageInfoCached has different base package version2");
                    }
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
            if (c0476a == null) {
                return false;
            }
            if (TextUtils.equals("base_package_env_test", c0476a.b)) {
                return true;
            }
            if (TextUtils.equals("base_package_env_prod", c0476a.b)) {
                return ay.a(c0476a.d, "1.8.0") >= 0;
            }
            return false;
        }
        return true;
    }

    public final boolean a(j jVar, boolean z, Map<String, String> map) {
        Object[] objArr = {jVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4890e5b7611f344d1e980ab8fcf147b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4890e5b7611f344d1e980ab8fcf147b3")).booleanValue();
        }
        if (z && jVar.d != null) {
            String a = a(jVar, map);
            if (t.a(a) || TextUtils.equals(jVar.d.toString(), a)) {
                return false;
            }
            jVar.a(Uri.parse(a));
            return true;
        }
        return false;
    }
}
