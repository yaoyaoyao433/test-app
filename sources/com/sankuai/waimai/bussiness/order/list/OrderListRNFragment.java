package com.sankuai.waimai.bussiness.order.list;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager;
import com.sankuai.waimai.bussiness.order.list.rn.RNOrderListLogicModule;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.location.v2.listener.c;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderListRNFragment extends WMRNBaseFragment implements a.b, com.sankuai.waimai.business.order.api.submit.a, b, c, com.sankuai.waimai.platform.domain.manager.bubble.b, com.sankuai.waimai.platform.model.b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String g;
    public String h;
    private boolean m;
    private RNOrderListLogicModule n;

    public OrderListRNFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "179dbddec336410974a1e547c977550e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "179dbddec336410974a1e547c977550e");
        } else {
            this.m = false;
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f893b311e980e8a0379dfc5efccb64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f893b311e980e8a0379dfc5efccb64");
            return;
        }
        super.onCreate(bundle);
        com.sankuai.waimai.platform.domain.manager.bubble.a a2 = com.sankuai.waimai.platform.domain.manager.bubble.a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.domain.manager.bubble.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "37c29f13421128a9e1154ae7126d2471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "37c29f13421128a9e1154ae7126d2471");
        } else {
            if (a2.j == null) {
                a2.j = new ArrayList();
            }
            a2.j.add(this);
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        SubmitOrderManager.getInstance().registerOrderStatusObserver(this);
        g.a().a(this, "OrderListRNFagment");
        com.sankuai.waimai.business.im.api.msgcenter.a.a().registerMsgCenterUnreadChangeListener(this);
        com.sankuai.waimai.platform.model.a.a().a(this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf977f16a86cfeccdbf8a200116ce53e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf977f16a86cfeccdbf8a200116ce53e");
        } else {
            com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterUnReadCount();
        }
        this.b = AppUtil.generatePageInfoKey(this);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48db4e155ad3599376ab22e707e105ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48db4e155ad3599376ab22e707e105ce");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        getActivity();
        return onCreateView;
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment
    public final boolean as_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d0dc38a3e08314f047d021f704dc60d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d0dc38a3e08314f047d021f704dc60d")).booleanValue() : com.sankuai.waimai.foundation.core.a.e();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void e() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6bd9bc23dff696f0443a9f326be4c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6bd9bc23dff696f0443a9f326be4c6");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d6b4450b9b69422be86215c52336d79", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d6b4450b9b69422be86215c52336d79");
        } else {
            com.meituan.android.mrn.container.g n = n();
            if (!p.a(com.meituan.android.singleton.b.a)) {
                str = "N_10000";
            } else if (n == null || n.d() == null) {
                str = "M_10011";
            } else {
                str = "M_" + n.d().a();
            }
        }
        i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_list_mrn_view").b(str).c("订单列表页面加载失败").b(true).b());
        super.e();
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e458504f2079f198ecc3137956135b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e458504f2079f198ecc3137956135b");
            return;
        }
        super.onResume();
        if (this.m) {
            q();
            this.m = false;
        }
        if (((WMRNBaseFragment) this).l) {
            com.sankuai.waimai.bussiness.order.b.a(getActivity());
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c7b5ea00cda250e360965e7efa57d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c7b5ea00cda250e360965e7efa57d2");
            return;
        }
        super.onPause();
        if (((WMRNBaseFragment) this).l) {
            com.sankuai.waimai.bussiness.order.b.b(getActivity());
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05f861655b609a7ed5c004292224cc7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05f861655b609a7ed5c004292224cc7d");
            return;
        }
        SubmitOrderManager.getInstance().unregisterOrderStatusObserver(this);
        com.sankuai.waimai.platform.domain.manager.bubble.a a2 = com.sankuai.waimai.platform.domain.manager.bubble.a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.domain.manager.bubble.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "bd99ba043e0300f57215f45335331e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "bd99ba043e0300f57215f45335331e59");
        } else if (a2.j != null && a2.j.contains(this)) {
            a2.j.remove(this);
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        g.a().b(this, "OrderListRNFagment");
        com.sankuai.waimai.business.im.api.msgcenter.a.a().unregisterMsgCenterUnreadChangeListener(this);
        com.sankuai.waimai.platform.model.a.a().b(this);
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d070580a53e1a3d39c4297a89fa67329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d070580a53e1a3d39c4297a89fa67329");
            return;
        }
        super.a(z);
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("visible", z);
        a("onVisibilityChanged", createMap);
        if (this.n != null) {
            this.n.onVisibilityChanged(z);
        }
    }

    @Override // com.sankuai.waimai.reactnative.fragment.WMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a42fe7bf562c75f80332d61199666b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a42fe7bf562c75f80332d61199666b4");
            return;
        }
        super.onHiddenChanged(z);
        FragmentActivity activity = getActivity();
        Object[] objArr2 = {activity, "OrderListRNFagment", Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "19a9ae7dd57faa058ed6eb94d098feb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "19a9ae7dd57faa058ed6eb94d098feb6");
        } else if (!z) {
            com.sankuai.waimai.bussiness.order.b.a(activity);
            com.sankuai.waimai.foundation.utils.log.a.b("OrderListRNFagment", "showCSFloating", new Object[0]);
        } else {
            com.sankuai.waimai.bussiness.order.b.b(activity);
            com.sankuai.waimai.foundation.utils.log.a.b("OrderListRNFagment", "hideCSFloating", new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        int i = 1;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dec695042e90de4dc12b5ad1154ad36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dec695042e90de4dc12b5ad1154ad36");
            return;
        }
        if (aVar == b.a.LOGIN) {
            if (com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_ORDER_LIST_PREORDER) {
                SubmitOrderManager.getInstance().preOrder(getActivity(), "from_order_list");
            }
            i = 0;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("status", i);
        a("loginStatusChanged", createMap);
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a13a7e4a6c077bd85b4c11fa169fb7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a13a7e4a6c077bd85b4c11fa169fb7e");
        } else if (enumC0948b == b.EnumC0948b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_ORDER_LIST_PREORDER) {
            SubmitOrderManager.getInstance().preOrder(getActivity(), "from_order_list");
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d32c54861967b1a92941bdc02686ea6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d32c54861967b1a92941bdc02686ea6");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        q();
    }

    @Override // com.sankuai.waimai.platform.domain.manager.bubble.b
    public final void b(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75522ab72b8c27b87e3ec2f52e081f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75522ab72b8c27b87e3ec2f52e081f52");
        } else if (isResumed()) {
            q();
        } else {
            this.m = true;
        }
    }

    @Override // com.sankuai.waimai.business.order.api.submit.a
    public final void a(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "188dddc423dcb2326d164f055693ec2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "188dddc423dcb2326d164f055693ec2a");
        } else if (isResumed()) {
            q();
        } else {
            this.m = true;
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "809c6b89ab61c9aa210f7ff57e8db09c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "809c6b89ab61c9aa210f7ff57e8db09c");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 111) {
            a(i, i2);
        } else if (i == 112) {
            if (i2 == -1) {
                SubmitOrderManager.getInstance().preOrder(getActivity(), "from_order_list");
            }
        } else if (i == 114 && intent != null) {
            if (!TextUtils.isEmpty(f.a(intent, "resultData", ""))) {
                try {
                    i3 = new JsonParser().parse(f.a(intent, "resultData", "")).getAsJsonObject().get("another_pay_result").getAsInt();
                } catch (Exception e) {
                    e.printStackTrace();
                    i3 = -1;
                }
            } else {
                i3 = f.a(intent, "another_pay_result", -1);
            }
            com.sankuai.waimai.foundation.utils.log.a.b("FriendPay-OrderList", "resultCode=" + i2 + " payResult=" + i3, new Object[0]);
            if (i3 != 0 && i3 != -1) {
                SubmitOrderManager.getInstance().updateOrderStatus();
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da7b078de98237be0140f8c86d60b09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da7b078de98237be0140f8c86d60b09");
            return;
        }
        try {
            n.a(o(), str, writableMap);
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.a.b
    public final void a(boolean z, boolean z2, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2d1c94f44bfd8e225b11657046ff1d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2d1c94f44bfd8e225b11657046ff1d8");
        } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            if (b() != null) {
                b().post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.OrderListRNFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb2aff3b44037958ce273ed8400cbcb0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb2aff3b44037958ce273ed8400cbcb0");
                        } else {
                            com.sankuai.waimai.imbase.manager.b.a().a(new d.a() { // from class: com.sankuai.waimai.bussiness.order.list.OrderListRNFragment.2.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.imbase.manager.d.a
                                public final void a(int i2) {
                                    Object[] objArr3 = {Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2468c2e41c9ba42ac0b020537edc60c5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2468c2e41c9ba42ac0b020537edc60c5");
                                    } else {
                                        OrderListRNFragment.this.a(i2, com.sankuai.waimai.business.im.api.msgcenter.a.a().getUnReadMsgInfo());
                                    }
                                }
                            });
                        }
                    }
                });
            }
        } else {
            a(0, (UnReadMsgEntity) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, UnReadMsgEntity unReadMsgEntity) {
        Object[] objArr = {Integer.valueOf(i), unReadMsgEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a155756f45bfb399a460458e542591e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a155756f45bfb399a460458e542591e3");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("im_count", i);
        if (unReadMsgEntity != null) {
            createMap.putBoolean("show_icon", unReadMsgEntity.showIcon == 1);
            createMap.putInt(RemoteMessageConst.MSGTYPE, unReadMsgEntity.msgType);
            createMap.putInt("unread_count", unReadMsgEntity.unReadCount);
            createMap.putString("h5_url", unReadMsgEntity.h5Url);
        }
        a("updateMessageCenterInfo", createMap);
    }

    @Override // com.sankuai.waimai.platform.model.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7090ccce55f55ca3c4c892046aee9582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7090ccce55f55ca3c4c892046aee9582");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("appModel", i);
        a("onAppModelChanged", createMap);
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        String jsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e049aba4581c5751d462330a44777d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e049aba4581c5751d462330a44777d");
        }
        int a2 = f.a(((WMRNBaseFragment) this).j.getIntent(), "source", 0);
        boolean a3 = com.sankuai.waimai.platform.domain.manager.user.a.i().a();
        String a4 = ListIDHelper.a.a.a();
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "wm-order-list").appendQueryParameter("mrn_component", "wm-order-list").appendQueryParameter("page_info_key", this.b);
        StringBuilder sb = new StringBuilder();
        sb.append(a2);
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("source", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a3 ? 1 : 0);
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("userAvailable", sb2.toString()).appendQueryParameter("rankListID", a4).appendQueryParameter("pageInfoKey", this.b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a54bbb5e9da081eef5240c8a20809616", RobustBitConfig.DEFAULT_VALUE)) {
            jsonObject = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a54bbb5e9da081eef5240c8a20809616");
        } else {
            LocationUtils.TransformData transformData = null;
            double[] e = com.sankuai.waimai.foundation.location.g.e();
            if (e != null) {
                Double valueOf = Double.valueOf(e[0]);
                Double valueOf2 = Double.valueOf(e[1]);
                LocationUtils.TransformData a5 = LocationUtils.a(valueOf2.doubleValue(), valueOf.doubleValue());
                valueOf.doubleValue();
                valueOf2.doubleValue();
                transformData = a5;
            }
            if (transformData == null) {
                transformData = LocationUtils.a(0.0d, 0.0d);
            }
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("ji", Long.valueOf(transformData.ji));
            jsonObject2.addProperty("jf", transformData.jf);
            jsonObject2.addProperty("wi", Long.valueOf(transformData.wi));
            jsonObject2.addProperty("wf", transformData.wf);
            jsonObject2.addProperty(Constants.Environment.KEY_PUSHID, com.sankuai.waimai.platform.b.A().t());
            jsonObject = jsonObject2.toString();
        }
        return appendQueryParameter3.appendQueryParameter("pvLog", jsonObject).appendQueryParameter("orderH5Env", com.sankuai.waimai.platform.capacity.abtest.f.b()).appendQueryParameter("refundstatus", com.sankuai.waimai.platform.capacity.abtest.f.a(((WMRNBaseFragment) this).j, "order_h5_refundstatus_android") ? "1" : "0").appendQueryParameter("payByAnother", com.sankuai.waimai.platform.capacity.abtest.f.a(((WMRNBaseFragment) this).j, "order_h5_pay_by_friend_android") ? "1" : "0").appendQueryParameter("appModel", String.valueOf(com.sankuai.waimai.platform.model.c.a().b())).build();
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd26b7c95f9f028238ad01901f7fc5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd26b7c95f9f028238ad01901f7fc5e");
        } else if (((WMRNBaseFragment) this).j == null) {
            i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_list_refresh").c("not_attached_to_activity").b());
        } else {
            WritableMap createMap = Arguments.createMap();
            Intent intent = ((WMRNBaseFragment) this).j.getIntent();
            int a2 = f.a(intent, "source", 0);
            WritableMap createMap2 = Arguments.createMap();
            String a3 = f.a(intent, "order_id");
            int a4 = f.a(intent, "order_status", -1);
            int a5 = f.a(intent, "order_pay_status", -1);
            int a6 = f.a(intent, "order_delivery_status", -1);
            createMap2.putString("order_id", a3);
            createMap2.putInt("order_status", a4);
            createMap2.putInt("order_pay_status", a5);
            createMap2.putInt("order_delivery_status", a6);
            createMap.putInt("source", a2);
            createMap.putMap("order_base_info", createMap2);
            a("refreshOrders", createMap);
        }
    }

    public void a(final int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bad5debe58af2bf1e3ec0c09a30b93c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bad5debe58af2bf1e3ec0c09a30b93c");
        } else {
            OrderPayResultManager.handleResult(((WMRNBaseFragment) this).j, i2, this.c, this.g, this.h, new com.sankuai.waimai.business.order.api.pay.f() { // from class: com.sankuai.waimai.bussiness.order.list.OrderListRNFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.order.api.pay.f
                public final void a(Activity activity, String str, String str2) {
                    Object[] objArr2 = {activity, str, str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b429ef3a6bc230ca85d35adf8c2843ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b429ef3a6bc230ca85d35adf8c2843ec");
                        return;
                    }
                    if (!aa.a(str2) && !str2.contains("mach_pro_waimai_order_middle")) {
                        com.sankuai.waimai.foundation.router.a.a(activity, str2);
                    } else {
                        com.sankuai.waimai.bussiness.order.base.utils.i.a((Context) activity, str, true, i);
                    }
                    com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                }
            });
        }
    }
}
