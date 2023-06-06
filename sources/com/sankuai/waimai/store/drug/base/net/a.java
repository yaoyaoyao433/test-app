package com.sankuai.waimai.store.drug.base.net;

import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.config.d;
import com.sankuai.waimai.store.drug.util.monitor.DrugCommonMonitor;
import com.sankuai.waimai.store.util.i;
import java.util.Collection;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T> implements j<T> {
    public static ChangeQuickRedirect a;
    private j<T> b;

    public a(j<T> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41a6a293d7e5441b8288304534b9c46e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41a6a293d7e5441b8288304534b9c46e");
        } else {
            this.b = jVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0602b8c081f0677181df383ba75719a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0602b8c081f0677181df383ba75719a8");
        } else if (this.b != null) {
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public final void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20cc8685dbef577a5d7ac5b8fb699602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20cc8685dbef577a5d7ac5b8fb699602");
        } else if (this.b != null) {
            this.b.a((j<T>) t);
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fccdddf9f8994a82057381bb1bc1cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fccdddf9f8994a82057381bb1bc1cb");
        } else if (this.b != null) {
            if (!d.h().a("drug_common_config/pageCode", true)) {
                this.b.a(bVar);
                return;
            }
            if (bVar.c == 801 && !TextUtils.isEmpty(bVar.f)) {
                com.sankuai.waimai.store.util.monitor.b.a().a(new DrugCommonMonitor("MEDAPICrawler")).b("命中反扒801").a(DeviceInfo.USER_ID, String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d())).a("uuid", OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId()).a("path", "未知").a("status_code", BasicPushStatus.SUCCESS_CODE).a("code", bVar.f).a();
                bVar = new com.sankuai.waimai.store.repository.net.b(r.a(bVar.f, 801), bVar.b, bVar.e, bVar.f);
            } else {
                int a2 = a(bVar.g);
                if (a2 > 0) {
                    bVar = new com.sankuai.waimai.store.repository.net.b(a2, "");
                }
            }
            this.b.a(bVar);
            com.sankuai.waimai.store.drug.util.a.b(bVar);
        }
    }

    @Override // com.sankuai.waimai.store.base.net.j
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3531284d89bd48d227dd1d2505ca49fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3531284d89bd48d227dd1d2505ca49fd");
        } else if (this.b != null) {
            this.b.b();
        }
    }

    private int a(Throwable th) {
        Response<?> b;
        int i;
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f8d0ad8ef4c7065b96d7b6c29340d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f8d0ad8ef4c7065b96d7b6c29340d6")).intValue();
        }
        if (th instanceof com.sankuai.meituan.retrofit2.exception.c) {
            com.sankuai.meituan.retrofit2.exception.c cVar = (com.sankuai.meituan.retrofit2.exception.c) th;
            if (cVar.a() == 403 && (b = cVar.b()) != null) {
                ap g = b.g();
                Object[] objArr2 = {-1, b};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0baee420fc52ae13b078139249b3cd1f", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0baee420fc52ae13b078139249b3cd1f")).intValue();
                } else {
                    if (b != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) b.d())) {
                        for (q qVar : b.d()) {
                            if (qVar != null && "X-Forbid-Reason".equals(qVar.a()) && TextUtils.equals(qVar.b(), CommonConstant.Symbol.DOT)) {
                                i = 10403;
                                break;
                            }
                        }
                    }
                    i = -1;
                }
                if (i < 0 && g != null) {
                    try {
                        if (i.a(g.toString())) {
                            if (new JSONObject(g.toString()).has("reason")) {
                                i = 11403;
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                }
                if (i != -1) {
                    com.sankuai.waimai.store.util.monitor.b.a().a(new DrugCommonMonitor("MEDAPICrawler")).b("命中反扒限频或限流").a(DeviceInfo.USER_ID, String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d())).a("uuid", OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId()).a("path", b.a()).a("status_code", String.valueOf(cVar.a())).a("code", String.valueOf(i)).a();
                    return i;
                }
                return i;
            }
        }
        return -1;
    }
}
