package com.sankuai.waimai.store.search.ui.result.datamarket;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d e;
    public Set<Integer> b;
    public Set<Integer> c;
    public boolean d;
    private final Handler f;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a9961d32d3479d59f0a8cb0ecb9eb76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a9961d32d3479d59f0a8cb0ecb9eb76");
        } else {
            this.f = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.search.ui.result.datamarket.d.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11c2cbf8d6139ec270ab7982a85ea518", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11c2cbf8d6139ec270ab7982a85ea518");
                        return;
                    }
                    super.handleMessage(message);
                    if (message.obj instanceof EventInfo) {
                        d.this.a((EventInfo) message.obj);
                    }
                }
            };
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4f843b3a9c57af80936ea7013324fc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4f843b3a9c57af80936ea7013324fc8");
        }
        if (e == null) {
            synchronized (d.class) {
                if (e == null) {
                    e = new d();
                }
            }
        }
        return e;
    }

    public final void a(List<OasisModule> list, SearchShareData searchShareData) {
        Object[] objArr = {list, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f2804c997183a5ece392c2258d4e7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f2804c997183a5ece392c2258d4e7f");
        } else if (this.d) {
            c.a().a(list, a(searchShareData));
            b.a().a(list, a(searchShareData), b(searchShareData));
            e.a().b();
        }
    }

    public final void a(EventInfo eventInfo, int i) {
        Object[] objArr = {eventInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ac8e5ad962a3de51ef3742ed22b4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ac8e5ad962a3de51ef3742ed22b4db");
        } else if (this.d) {
            if (i == 1) {
                a(eventInfo);
            }
            if (i == 2) {
                Message.obtain(this.f, 0, eventInfo).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(EventInfo eventInfo) {
        Object[] objArr = {eventInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f642edb7a44a7e573325367aa84d1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f642edb7a44a7e573325367aa84d1a");
        } else if (!this.d || eventInfo == null || TextUtils.isEmpty(eventInfo.val_cid) || TextUtils.isEmpty(eventInfo.val_bid) || eventInfo.val_lab == null) {
        } else {
            if (TextUtils.equals(eventInfo.val_cid, "c_nfqbfvw")) {
                c.a().a(eventInfo);
                b.a().a(eventInfo);
                e.a().a(eventInfo);
            }
            if ("rn_sgc_flashbuy-restaurant-search-new".equals(eventInfo.val_lab.get("mrn_bundle_name"))) {
                com.sankuai.waimai.store.search.ui.result.datamarket.inshop.c.a().a(eventInfo);
                com.sankuai.waimai.store.search.ui.result.datamarket.inshop.b.a().a(eventInfo);
                e.a().a(eventInfo);
            }
        }
    }

    public boolean a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b848674ca94224ba42f423d1244a6ffd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b848674ca94224ba42f423d1244a6ffd")).booleanValue();
        }
        if (searchShareData == null) {
            return true;
        }
        return this.c.contains(Integer.valueOf(searchShareData.z));
    }

    public String b(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c312c1943a509a3c270ea6e512c38902", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c312c1943a509a3c270ea6e512c38902") : searchShareData == null ? "" : g.f(searchShareData);
    }
}
