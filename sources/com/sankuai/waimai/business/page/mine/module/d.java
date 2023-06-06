package com.sankuai.waimai.business.page.mine.module;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.mrn.engine.k;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
import com.sankuai.waimai.business.page.mine.model.FunctionCategory;
import com.sankuai.waimai.business.page.mine.model.FunctionItem;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static ArrayList<FunctionCategory> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79e07567194847f64ee2aa19fe4fc08a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79e07567194847f64ee2aa19fe4fc08a");
        }
        ArrayList<FunctionCategory> arrayList = new ArrayList<>();
        FunctionItem functionItem = new FunctionItem();
        functionItem.setCode(1);
        functionItem.setTitle("我的收藏");
        functionItem.setClickUrl(com.sankuai.waimai.foundation.router.interfaces.b.c + "/likedpoi");
        functionItem.setNeedLogin(1);
        functionItem.setSecondDesc(null);
        functionItem.setSecondDescStatus(0);
        functionItem.setBubble(null);
        functionItem.setIconUrl("http://p1.meituan.net/xianfu/9c1388ba5fbb367c1a93996f39c2fba94506.jpg");
        FunctionItem functionItem2 = new FunctionItem();
        functionItem2.setCode(4);
        functionItem2.setTitle("我的足迹");
        functionItem2.setClickUrl(com.sankuai.waimai.foundation.router.interfaces.b.c + "/footprint");
        functionItem2.setNeedLogin(1);
        functionItem2.setSecondDesc(null);
        functionItem2.setSecondDescStatus(0);
        functionItem2.setBubble(null);
        functionItem2.setIconUrl("http://p1.meituan.net/xianfu/7ad7da19bfadd5e6081b7606025214254582.jpg");
        FunctionItem functionItem3 = new FunctionItem();
        functionItem3.setCode(2);
        functionItem3.setTitle("我的评价");
        functionItem3.setClickUrl(com.sankuai.waimai.foundation.router.interfaces.b.c + "/mycommentlist");
        functionItem3.setNeedLogin(1);
        functionItem3.setSecondDesc(null);
        functionItem3.setSecondDescStatus(0);
        functionItem3.setBubble(null);
        functionItem3.setIconUrl("http://p0.meituan.net/xianfu/5d02f44df0f9f26ea0eca95957824bae4444.jpg");
        FunctionItem functionItem4 = new FunctionItem();
        functionItem4.setCode(6);
        functionItem4.setTitle("我的地址");
        functionItem4.setClickUrl(com.sankuai.waimai.foundation.router.interfaces.b.c + "/mineaddress");
        functionItem4.setNeedLogin(1);
        functionItem4.setSecondDesc(null);
        functionItem4.setSecondDescStatus(0);
        functionItem4.setBubble(null);
        functionItem4.setIconUrl("http://p0.meituan.net/xianfu/a813bff1813024b05ff45422deac24bd4276.jpg");
        ArrayList<FunctionItem> arrayList2 = new ArrayList<>();
        arrayList2.add(functionItem);
        arrayList2.add(functionItem2);
        arrayList2.add(functionItem3);
        arrayList2.add(functionItem4);
        FunctionCategory functionCategory = new FunctionCategory();
        functionCategory.setShowTitle(0);
        functionCategory.setFunctionItems(arrayList2);
        FunctionItem functionItem5 = new FunctionItem();
        functionItem5.setCode(7);
        functionItem5.setTitle("红包");
        functionItem5.setClickUrl(com.sankuai.waimai.foundation.router.interfaces.b.c + "/coupons");
        functionItem5.setNeedLogin(1);
        functionItem5.setSecondDesc(null);
        functionItem5.setSecondDescStatus(0);
        functionItem5.setBubble(null);
        functionItem5.setIconUrl("http://p1.meituan.net/xianfu/a361ce97f9f00f2715bb960a789d925e2315.jpg");
        FunctionItem functionItem6 = new FunctionItem();
        functionItem6.setCode(8);
        functionItem6.setTitle("代金券");
        functionItem6.setClickUrl(com.sankuai.waimai.foundation.router.interfaces.b.c + "/poicoupons");
        functionItem6.setNeedLogin(1);
        functionItem6.setSecondDesc(null);
        functionItem6.setSecondDescStatus(0);
        functionItem6.setBubble(null);
        functionItem6.setIconUrl("http://p0.meituan.net/xianfu/875f13a76045b7f6862a2b7149babec32329.jpg");
        FunctionItem functionItem7 = new FunctionItem();
        functionItem7.setCode(9);
        functionItem7.setTitle("钱包");
        functionItem7.setClickUrl("meituanpayment://wallet/launch");
        functionItem7.setNeedLogin(1);
        functionItem7.setSecondDesc(null);
        functionItem7.setSecondDescStatus(0);
        functionItem7.setBubble(null);
        functionItem7.setIconUrl("http://p1.meituan.net/xianfu/2c14b3425c7bf1f3d63d11f47a7ef9ea2230.jpg");
        FunctionItem functionItem8 = new FunctionItem();
        functionItem8.setCode(10);
        functionItem8.setTitle("余额");
        functionItem8.setClickUrl("meituanwaimai://waimai.meituan.com/browser?inner_url=https%3A%2F%2Fnpay.meituan.com%2Fresource%2Fibalance%2Findex.html%3Fscene%3Dwaimai_home");
        functionItem8.setNeedLogin(1);
        functionItem8.setSecondDesc(null);
        functionItem8.setSecondDescStatus(0);
        functionItem8.setBubble(null);
        functionItem8.setIconUrl("http://p0.meituan.net/xianfu/7b3e3fb4fc9b45dcda74d7e916f025ea2878.jpg");
        ArrayList<FunctionItem> arrayList3 = new ArrayList<>();
        arrayList3.add(functionItem5);
        arrayList3.add(functionItem6);
        arrayList3.add(functionItem7);
        arrayList3.add(functionItem8);
        FunctionCategory functionCategory2 = new FunctionCategory();
        functionCategory2.setShowTitle(1);
        functionCategory2.setTitle("我的资产");
        functionCategory2.setFunctionItems(arrayList3);
        arrayList.add(functionCategory);
        arrayList.add(functionCategory2);
        return arrayList;
    }

    public static boolean a(Context context, FunctionItem functionItem) {
        com.sankuai.waimai.business.page.mine.model.a bubble;
        Object[] objArr = {context, functionItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2bc254907e743971167768290e48f053", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2bc254907e743971167768290e48f053")).booleanValue();
        }
        if (functionItem == null) {
            return false;
        }
        int code = functionItem.getCode();
        String.valueOf(functionItem.getCode());
        com.sankuai.waimai.platform.domain.manager.bubble.a a2 = com.sankuai.waimai.platform.domain.manager.bubble.a.a();
        if (code == 2) {
            return a2.e;
        }
        if (code == 3) {
            return false;
        }
        if (code == 7) {
            return a2.c;
        }
        if (code != 13) {
            if (code != 14 && (bubble = functionItem.getBubble()) != null && com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                if (!(context != null ? com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, a(code, bubble.c), false) : false)) {
                    if (bubble.a != 1) {
                        return !TextUtils.isEmpty(bubble.b);
                    } else if (code == 8) {
                        return a2.d;
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return a2.b;
    }

    public static void a(final MPContext mPContext, final com.sankuai.waimai.machpro.instance.a aVar, final Activity activity, boolean z, final UnReadMsgEntity unReadMsgEntity) {
        Object[] objArr = {mPContext, aVar, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), unReadMsgEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b87916cbbaa09220388a662afdf30bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b87916cbbaa09220388a662afdf30bc6");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            if (!z || !b()) {
                a(activity, false);
                b(mPContext, aVar, 0);
            } else if (unReadMsgEntity == null) {
                a(activity, b);
            } else {
                com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterSysCount(unReadMsgEntity.unReadCount);
                if (!com.sankuai.waimai.imbase.manager.b.a().b()) {
                    b(activity, unReadMsgEntity, 0);
                    b(mPContext, aVar, 0);
                    return;
                }
                com.sankuai.waimai.imbase.manager.b.a().a(new d.a() { // from class: com.sankuai.waimai.business.page.mine.module.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58c3e13252d0224790ed5a1c9599d650", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58c3e13252d0224790ed5a1c9599d650");
                        } else if (activity == null || activity.isFinishing()) {
                        } else {
                            com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterImCount(i);
                            d.b(activity, unReadMsgEntity, i);
                            d.b(mPContext, aVar, i);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(MPContext mPContext, com.sankuai.waimai.machpro.instance.a aVar, int i) {
        Object[] objArr = {mPContext, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa9625ec50e61141b31bdcaca0d52fcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa9625ec50e61141b31bdcaca0d52fcd");
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("count", Integer.valueOf(i));
        if (mPContext != null) {
            mPContext.getInstance().a("updateUnReadCount", machMap);
        } else if (aVar != null) {
            aVar.a("updateUnReadCount", machMap);
        }
    }

    public static void a(final ReactContext reactContext, final k kVar, final Activity activity, boolean z, final UnReadMsgEntity unReadMsgEntity) {
        Object[] objArr = {reactContext, kVar, activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), unReadMsgEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d958bc41a3fdec935711f14047edd7a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d958bc41a3fdec935711f14047edd7a3");
        } else if (activity == null || activity.isFinishing()) {
        } else {
            if (!z || !b()) {
                a(activity, false);
                b(reactContext, kVar, 0);
            } else if (unReadMsgEntity == null) {
                a(activity, b);
            } else {
                com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterSysCount(unReadMsgEntity.unReadCount);
                if (!com.sankuai.waimai.imbase.manager.b.a().b()) {
                    b(activity, unReadMsgEntity, 0);
                    b(reactContext, kVar, 0);
                    return;
                }
                com.sankuai.waimai.imbase.manager.b.a().a(new d.a() { // from class: com.sankuai.waimai.business.page.mine.module.d.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.a
                    public final void a(int i) {
                        Object[] objArr2 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7401335771bdf92f458883cc225f41d1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7401335771bdf92f458883cc225f41d1");
                        } else if (activity == null || activity.isFinishing()) {
                        } else {
                            com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterImCount(i);
                            d.b(activity, unReadMsgEntity, i);
                            d.b(reactContext, kVar, i);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ReactContext reactContext, k kVar, int i) {
        Object[] objArr = {reactContext, kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50f89f37862a1fb1c020eb767af8045e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50f89f37862a1fb1c020eb767af8045e");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("count", i);
        if (reactContext != null) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("updateUnReadCount", writableNativeMap);
            } catch (Exception unused) {
            }
        } else if (kVar != null) {
            n.a(kVar, "updateUnReadCount", writableNativeMap);
        }
    }

    private static void a(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5e33564a8fad4561e159c36d6bbb86a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5e33564a8fad4561e159c36d6bbb86a");
            return;
        }
        b = z;
        com.sankuai.waimai.platform.domain.manager.bubble.a.a().i = z;
        ((com.sankuai.waimai.business.page.home.interfacer.c) activity).a(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Activity activity, UnReadMsgEntity unReadMsgEntity, int i) {
        boolean z = false;
        Object[] objArr = {activity, unReadMsgEntity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c2037836e9ef99a85a53d1b721b29f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c2037836e9ef99a85a53d1b721b29f1");
            return;
        }
        boolean showMsgCenterDot = com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot();
        if (i > 0) {
            a(activity, true);
        } else if (showMsgCenterDot || (unReadMsgEntity != null && unReadMsgEntity.msgType == UnReadMsgEntity.MSG_TYPE_DOT)) {
            if (unReadMsgEntity != null && unReadMsgEntity.msgType == UnReadMsgEntity.MSG_TYPE_DOT) {
                z = true;
            }
            a(activity, z);
        } else {
            a(activity, false);
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e22d8136677641ce9b151b21f20ff6d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e22d8136677641ce9b151b21f20ff6d")).booleanValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().a();
    }

    public static String a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a921fc065b7a1e86d41b605e1128b47a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a921fc065b7a1e86d41b605e1128b47a");
        }
        return "function_clicked_time_" + com.sankuai.waimai.platform.domain.manager.user.a.i().d() + CommonConstant.Symbol.UNDERLINE + i + CommonConstant.Symbol.UNDERLINE + i2;
    }
}
