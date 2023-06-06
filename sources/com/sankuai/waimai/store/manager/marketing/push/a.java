package com.sankuai.waimai.store.manager.marketing.push;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.dianping.nvnetwork.g;
import com.dianping.sharkpush.b;
import com.dianping.sharkpush.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.StoreError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final SparseArray<List<InterfaceC1226a>> b = new SparseArray<>();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.manager.marketing.push.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1226a {
        void a(@NonNull MarketingPushModel marketingPushModel);
    }

    public static /* synthetic */ void a(MarketingPushModel marketingPushModel) {
        Object[] objArr = {marketingPushModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c99949a6e55a825ba5916938b658b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c99949a6e55a825ba5916938b658b9b");
        } else if (marketingPushModel == null) {
            ae.a("SGMarketingPushManager", "pushModel is null");
        } else {
            ArrayList<InterfaceC1226a> arrayList = new ArrayList();
            if (com.sankuai.shangou.stone.util.a.b(marketingPushModel.pageTypeList)) {
                for (int i = 0; i < b.size(); i++) {
                    List<InterfaceC1226a> valueAt = b.valueAt(i);
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) valueAt)) {
                        arrayList.addAll(valueAt);
                    }
                }
            } else {
                for (Integer num : marketingPushModel.pageTypeList) {
                    if (num != null) {
                        List<InterfaceC1226a> list = b.get(num.intValue());
                        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                            arrayList.addAll(list);
                        }
                    }
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                ae.a("SGMarketingPushManager", "callbackList is empty");
                return;
            }
            for (InterfaceC1226a interfaceC1226a : arrayList) {
                interfaceC1226a.a(marketingPushModel);
            }
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d996b7d4759576e8cf85b17c4001031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d996b7d4759576e8cf85b17c4001031");
            return;
        }
        ae.a("SGMarketingPushManager", "unionid = " + g.j());
        b.a("sg_walktone", new d.a() { // from class: com.sankuai.waimai.store.manager.marketing.push.a.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.sharkpush.d.a, dianping.com.nvlinker.stub.ISharkPushReceiver
            public final void onReceive(String str, byte[] bArr) {
                Object[] objArr2 = {str, bArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cff48fc1abc1a172e2c31ab83e91ffc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cff48fc1abc1a172e2c31ab83e91ffc");
                    return;
                }
                String str2 = new String(bArr);
                ae.a("SGMarketingPushManager", "cmd = " + str + ", data = " + str2);
                MarketingPushMessage marketingPushMessage = (MarketingPushMessage) i.a(str2, MarketingPushMessage.class);
                if (marketingPushMessage == null || marketingPushMessage.data == null) {
                    StoreError storeError = StoreError.MarketingPushParseError;
                    ah.a(storeError, str + CommonConstant.Symbol.COLON + str2);
                    return;
                }
                a.a(marketingPushMessage.data);
            }

            @Override // dianping.com.nvlinker.stub.ISharkPushReceiver
            public final void onError(String str, int i, String str2) {
                Object[] objArr2 = {str, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5487a173d69a76a9de8302e9029b7cf2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5487a173d69a76a9de8302e9029b7cf2");
                    return;
                }
                StoreError storeError = StoreError.PushError;
                ah.a(storeError, str + CommonConstant.Symbol.COLON + str2);
                ae.a("SGMarketingPushManager", "cmd = " + str + ", code = " + i + ", msg = " + str2);
            }
        });
    }

    public static synchronized void a(int i, InterfaceC1226a interfaceC1226a) {
        synchronized (a.class) {
            Object[] objArr = {Integer.valueOf(i), interfaceC1226a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d22685696778b8911d3598edbbb5bed4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d22685696778b8911d3598edbbb5bed4");
                return;
            }
            List<InterfaceC1226a> list = b.get(i);
            if (list == null) {
                list = new ArrayList<>();
                b.put(i, list);
            }
            if (list.contains(interfaceC1226a)) {
                return;
            }
            list.add(interfaceC1226a);
        }
    }

    public static synchronized void b(int i, InterfaceC1226a interfaceC1226a) {
        synchronized (a.class) {
            Object[] objArr = {Integer.valueOf(i), interfaceC1226a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a7db794ccbb95459256f1c893ab5e14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a7db794ccbb95459256f1c893ab5e14");
                return;
            }
            List<InterfaceC1226a> list = b.get(i);
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            list.remove(interfaceC1226a);
        }
    }
}
