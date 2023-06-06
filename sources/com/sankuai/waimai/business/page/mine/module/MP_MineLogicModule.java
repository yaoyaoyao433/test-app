package com.sankuai.waimai.business.page.mine.module;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.passport.aq;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.business.page.mine.model.FunctionCategory;
import com.sankuai.waimai.business.page.mine.model.FunctionItem;
import com.sankuai.waimai.business.page.mine.model.b;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.imbase.manager.e;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import com.sankuai.waimai.platform.domain.manager.home.TabLoadManager;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MP_MineLogicModule extends MPModule implements com.sankuai.waimai.foundation.core.service.user.b, com.sankuai.waimai.imbase.d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long createTime;
    private Activity mActivity;
    private com.sankuai.waimai.business.page.mine.model.b mData;
    private final com.sankuai.waimai.business.page.mine.module.a mFactory;
    private final MPContext mpContext;
    private ArrayList<a> pendingActions;
    private boolean showMsgCenter;
    private boolean startObserve;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public static ChangeQuickRedirect a;
        String b;
        MachMap c;

        public a() {
        }
    }

    public MP_MineLogicModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40a55ae57fb4fd8c224ef4a57bc86b6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40a55ae57fb4fd8c224ef4a57bc86b6f");
            return;
        }
        this.showMsgCenter = true;
        this.mFactory = new com.sankuai.waimai.business.page.mine.module.a();
        this.pendingActions = new ArrayList<>();
        this.startObserve = false;
        this.mpContext = mPContext;
        this.createTime = SystemClock.uptimeMillis();
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        e.a().a(this);
        try {
            this.mActivity = (Activity) mPContext.getContext();
        } catch (Exception unused) {
        }
        if (!(this.mActivity instanceof MainActivity)) {
            this.mActivity = com.sankuai.waimai.foundation.utils.activity.a.a().b();
        }
        emitUserInfo(-1);
    }

    @JSMethod(methodName = "cacheMineData")
    public MachMap cacheMineData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78cfa6461e8aab24b21160b3b867821b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78cfa6461e8aab24b21160b3b867821b");
        }
        MachMap machMap = new MachMap();
        this.mData = this.mFactory.c();
        if (this.mData == null) {
            return null;
        }
        b.d dVar = this.mData.a;
        b.e eVar = this.mData.b;
        UnReadMsgEntity unReadMsgEntity = this.mData.d;
        ArrayList<FunctionCategory> arrayList = this.mData.f;
        b.c cVar = this.mData.c;
        b.C0814b c0814b = this.mData.e;
        b.a aVar = this.mData.g;
        b.f fVar = this.mData.h;
        MachMap machMap2 = new MachMap();
        if (dVar != null) {
            machMap2.put("click_desc", dVar.a);
            machMap.put("user_info", machMap2);
        }
        MachMap machMap3 = new MachMap();
        if (eVar != null) {
            machMap3.put("user_type", Integer.valueOf(eVar.a));
            machMap3.put("show_vip_entrance", Boolean.valueOf(eVar.b));
            machMap3.put("entrance_desc", eVar.c);
            machMap3.put("highlight", Boolean.valueOf(eVar.d));
            machMap3.put("h5_url", eVar.e);
            machMap.put("vip_info", machMap3);
        }
        MachMap machMap4 = new MachMap();
        if (unReadMsgEntity != null) {
            machMap4.put("show_icon", Integer.valueOf(unReadMsgEntity.showIcon));
            machMap4.put("unread_count", Integer.valueOf(unReadMsgEntity.unReadCount));
            machMap4.put("h5_url", unReadMsgEntity.h5Url);
            machMap4.put(RemoteMessageConst.MSGTYPE, Integer.valueOf(unReadMsgEntity.msgType));
            machMap.put("message_info", machMap4);
        }
        MachArray machArray = new MachArray();
        if (arrayList != null) {
            Iterator<FunctionCategory> it = arrayList.iterator();
            while (it.hasNext()) {
                FunctionCategory next = it.next();
                MachMap machMap5 = new MachMap();
                machMap5.put("show_title", Integer.valueOf(next.getShowTitle()));
                machMap5.put("cat_title", next.getTitle() != null ? next.getTitle() : "");
                machMap5.put("code", Integer.valueOf(next.getCode()));
                com.sankuai.waimai.business.page.mine.model.a bubble = next.getBubble();
                if (bubble != null) {
                    MachMap machMap6 = new MachMap();
                    machMap6.put("type", Integer.valueOf(bubble.a));
                    machMap6.put("description", bubble.b);
                    machMap6.put("version", Integer.valueOf(bubble.c));
                    machMap5.put("bubble", machMap6);
                }
                FunctionCategory.ClickButton clickButton = next.getClickButton();
                MachMap machMap7 = new MachMap();
                if (clickButton != null) {
                    machMap7.put("click_title", clickButton.clickTitle);
                    machMap7.put("click_url", clickButton.clickUrl);
                    machMap5.put("click_button", machMap7);
                }
                MachArray machArray2 = new MachArray();
                if (next.getFunctionItems() != null) {
                    Iterator<FunctionItem> it2 = next.getFunctionItems().iterator();
                    while (it2.hasNext()) {
                        FunctionItem next2 = it2.next();
                        MachMap machMap8 = new MachMap();
                        machMap8.put("fun_code", Integer.valueOf(next2.getCode()));
                        machMap8.put("fun_title", next2.getTitle());
                        machMap8.put(RemoteMessageConst.Notification.ICON, next2.getIconUrl());
                        machMap8.put("click_url", next2.getClickUrl());
                        machMap8.put("need_login", Integer.valueOf(next2.getNeedLogin()));
                        machMap8.put("desc_secd", next2.getSecondDesc());
                        machMap8.put("desc_secd_status", Integer.valueOf(next2.getSecondDescStatus()));
                        machMap8.put("high_light_desc", next2.getHighLightDesc());
                        if (next2.getBubble() != null) {
                            MachMap machMap9 = new MachMap();
                            machMap9.put("type", Integer.valueOf(bubble.a));
                            machMap9.put("description", bubble.b);
                            machMap9.put("version", Integer.valueOf(bubble.c));
                            machMap8.put("bubble", machMap9);
                        }
                        machArray2.add(machMap8);
                    }
                    machMap5.put("fun_list", machArray2);
                }
                machArray.add(machMap5);
            }
            machMap.put("category_list", machArray);
        }
        MachMap machMap10 = new MachMap();
        if (cVar != null) {
            machMap10.put("show_clean_cache", Boolean.valueOf(cVar.a));
            machMap10.put("show_auto_download", Boolean.valueOf(cVar.b));
            machMap10.put("mt_protocol_and_illustrate", cVar.c);
            machMap.put("settings_info", machMap10);
        }
        MachMap machMap11 = new MachMap();
        if (c0814b != null) {
            machMap11.put("draw_poi_coupon_h5_url", c0814b.a);
            machMap.put("other_info", machMap11);
        }
        MachMap machMap12 = new MachMap();
        if (aVar != null) {
            machMap12.put("show", Boolean.valueOf(aVar.a));
            machMap12.put("icon_url", aVar.b);
            machMap12.put("bg_url", aVar.c);
            machMap12.put("buy_status", Integer.valueOf(aVar.d));
            machMap12.put("text", aVar.e);
            machMap12.put(RegionLinkDao.TABLENAME, aVar.f);
            b.a.C0813a c0813a = aVar.g;
            MachMap machMap13 = new MachMap();
            if (c0813a != null) {
                machMap13.put("type", Integer.valueOf(c0813a.a));
                machMap13.put("description", c0813a.b);
                machMap13.put("version", Integer.valueOf(c0813a.c));
            }
            machMap12.put("bubble", machMap13);
            machMap.put("premium_campaign", machMap12);
        }
        MachMap machMap14 = new MachMap();
        if (fVar != null) {
            machMap14.put("title", fVar.a);
            machMap14.put("description", fVar.b);
            machMap14.put(RegionLinkDao.TABLENAME, fVar.c);
            machMap14.put("link_text", fVar.d);
            machMap14.put("link_show_type", Integer.valueOf(fVar.e));
            machMap14.put("show", Boolean.valueOf(fVar.f));
            machMap14.put("link_sub_text", fVar.g);
            machMap14.put("wmcard_status", Integer.valueOf(fVar.h));
            machMap14.put("background_url", fVar.i);
            machMap14.put("title_icon", fVar.j);
            machMap14.put("bubble", fVar.k);
            machMap14.put("link_text_type", Integer.valueOf(fVar.l));
            b.f.a aVar2 = fVar.m;
            MachMap machMap15 = new MachMap();
            if (aVar2 != null) {
                machMap15.put("pageVersion", aVar2.a);
                machMap15.put("memberStatus", aVar2.b);
                machMap15.put("mypage_v736_bottom_activity_desc_text", aVar2.c);
                machMap15.put("mypage_v736_bottom_activity_icon_text", aVar2.d);
            }
            machMap14.put("extra_map", machMap15);
            machMap.put("wm_card", machMap14);
        }
        return machMap;
    }

    @JSMethod(methodName = "isMessageCenterVisible")
    public Integer isMessageCenterVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81d761602432f1bca76a28bf3bec8588", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81d761602432f1bca76a28bf3bec8588");
        }
        if (this.mActivity != null && !this.mActivity.isFinishing()) {
            this.showMsgCenter = com.sankuai.waimai.touchmatrix.utils.d.a((Context) this.mActivity, "message_center_switch", true);
        }
        if (this.showMsgCenter) {
            return 1;
        }
        return 0;
    }

    @JSMethod(methodName = "createPageTime")
    public Integer createPageTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fefe93770bf1fb08c82483631ef50369", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fefe93770bf1fb08c82483631ef50369") : Integer.valueOf((int) this.createTime);
    }

    @JSMethod(methodName = "syncMineData")
    public void syncMineData(final MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d4f7fc694917a9ea97f09a3fda874e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d4f7fc694917a9ea97f09a3fda874e6");
        } else if (this.mActivity == null || this.mActivity.isFinishing()) {
        } else {
            final MachMap machMap2 = new MachMap();
            machMap2.put("code", "0");
            machMap2.put("msg", "invalid input");
            runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.MP_MineLogicModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    MachArray machArray;
                    boolean z = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d47d936f20513ececcbfe50989b26ad1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d47d936f20513ececcbfe50989b26ad1");
                        return;
                    }
                    if (machMap == null && machMap.size() == 0) {
                        MachMap machMap3 = machMap;
                        mPJSCallBack.invoke(machMap2);
                    }
                    try {
                        if (MP_MineLogicModule.this.mData != null) {
                            TabLoadManager.a().a(4, true);
                            MachArray machArray2 = (MachArray) machMap.get("category_list");
                            if (machArray2 != null && machArray2.size() != 0) {
                                MachMap machMap4 = new MachMap();
                                for (int i = 0; i < machArray2.size(); i++) {
                                    MachMap machMap5 = (MachMap) machArray2.get(i);
                                    if (machMap5 != null && (machArray = (MachArray) machMap5.get("fun_list")) != null && machArray.size() != 0) {
                                        for (int i2 = 0; i2 < machArray.size(); i2++) {
                                            MachMap machMap6 = (MachMap) machArray.get(i2);
                                            if (machMap6 != null) {
                                                FunctionItem functionItem = new FunctionItem();
                                                functionItem.setCode(((Integer) machMap6.get("fun_code")).intValue());
                                                com.sankuai.waimai.business.page.mine.model.a aVar = new com.sankuai.waimai.business.page.mine.model.a();
                                                MachMap machMap7 = (MachMap) machMap6.get("bubble");
                                                aVar.a = ((Integer) machMap7.get("type")).intValue();
                                                aVar.c = ((Integer) machMap7.get("version")).intValue();
                                                aVar.b = machMap7.get("description").toString();
                                                functionItem.setBubble(aVar);
                                                boolean a2 = d.a(MP_MineLogicModule.this.mActivity, functionItem);
                                                if (a2) {
                                                    machMap4.put(String.valueOf(functionItem.getCode()), Boolean.valueOf(a2));
                                                }
                                            }
                                        }
                                    }
                                }
                                mPJSCallBack.invoke(machMap4);
                            } else {
                                mPJSCallBack.invoke(machMap2);
                            }
                            boolean z2 = false;
                            boolean z3 = false;
                            for (int i3 = 0; i3 < machArray2.size(); i3++) {
                                MachMap machMap8 = (MachMap) machArray2.get(i3);
                                if (machMap8 != null) {
                                    MachArray machArray3 = (MachArray) machMap8.get("fun_list");
                                    boolean z4 = z3;
                                    boolean z5 = z2;
                                    for (int i4 = 0; i4 < machArray3.size(); i4++) {
                                        MachMap machMap9 = (MachMap) machArray3.get(i4);
                                        MachMap machMap10 = (MachMap) machMap9.get("bubble");
                                        if (machMap9 != null && ((Integer) machMap9.get("fun_code")).intValue() == 30 && machMap10 != null && ((Integer) machMap10.get("type")).intValue() != 0 && !com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) com.sankuai.waimai.foundation.utils.activity.a.a().c(), d.a(((Integer) machMap9.get("fun_code")).intValue(), ((Integer) machMap10.get("version")).intValue()), false)) {
                                            z5 = true;
                                        }
                                        if (machMap9 != null && ((Integer) machMap9.get("fun_code")).intValue() == 48 && machMap10 != null && ((Integer) machMap10.get("type")).intValue() != 0 && !com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) com.sankuai.waimai.foundation.utils.activity.a.a().c(), d.a(((Integer) machMap9.get("fun_code")).intValue(), ((Integer) machMap10.get("version")).intValue()), false)) {
                                            z4 = true;
                                        }
                                    }
                                    z2 = z5;
                                    z3 = z4;
                                }
                            }
                            com.sankuai.waimai.platform.domain.manager.bubble.a.a().g = z2 && com.sankuai.waimai.platform.domain.manager.user.a.i().a();
                            com.sankuai.waimai.platform.domain.manager.bubble.a a3 = com.sankuai.waimai.platform.domain.manager.bubble.a.a();
                            if (z3 && com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                                z = true;
                            }
                            a3.h = z;
                            if (MP_MineLogicModule.this.mActivity instanceof MainActivity) {
                                ((MainActivity) MP_MineLogicModule.this.mActivity).a(4);
                            }
                            UnReadMsgEntity unReadMsgEntity = new UnReadMsgEntity();
                            MachMap machMap11 = (MachMap) machMap.get("message_info");
                            if (machMap11 != null) {
                                unReadMsgEntity.msgType = ((Integer) machMap11.get(RemoteMessageConst.MSGTYPE)).intValue();
                                unReadMsgEntity.unReadCount = ((Integer) machMap11.get("unread_count")).intValue();
                                d.a(MP_MineLogicModule.this.mpContext, (com.sankuai.waimai.machpro.instance.a) null, MP_MineLogicModule.this.mActivity, MP_MineLogicModule.this.showMsgCenter, unReadMsgEntity);
                                int i5 = unReadMsgEntity.unReadCount;
                                MachMap machMap12 = new MachMap();
                                machMap12.put("count", Integer.valueOf(i5));
                                MP_MineLogicModule.this.readyToSendEvent("updateUnReadCount", machMap12);
                            }
                            MP_MineLogicModule.this.mData = MP_MineLogicModule.this.generateMinePageDataWithMap(machMap);
                            MP_MineLogicModule.this.mFactory.a(MP_MineLogicModule.this.mData, null);
                            return;
                        }
                        mPJSCallBack.invoke(machMap2);
                    } catch (Exception e) {
                        machMap2.put("msg", e.getMessage());
                        mPJSCallBack.invoke(machMap2);
                    }
                }
            });
        }
    }

    @JSMethod(methodName = "navigateTo")
    public void navigateTo(MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec687f83cf4ceeebce4e4c74c1b24e40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec687f83cf4ceeebce4e4c74c1b24e40");
        } else if (this.mActivity == null || this.mActivity.isFinishing()) {
        } else {
            final String str = (String) machMap.get("navigateToURL");
            final boolean booleanValue = new Boolean(((Boolean) machMap.get("needsLogin")).booleanValue()).booleanValue();
            final MachMap machMap2 = (MachMap) machMap.get("extraInfo");
            this.mActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.MP_MineLogicModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "01bf35ee3283a899276c6398c055009d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "01bf35ee3283a899276c6398c055009d");
                    } else if (TextUtils.isEmpty(str)) {
                        ae.a(MP_MineLogicModule.this.mActivity, "未知链接，无法跳转");
                    } else {
                        int intValue = (machMap2 == null || !machMap2.containsKey("code")) ? -10086 : ((Integer) machMap2.get("code")).intValue();
                        if (intValue != -10086) {
                            if (intValue == 991) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("isHideTitleBar", true);
                                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                                buildUpon.appendQueryParameter("no_back_button", "0");
                                StringBuilder sb = new StringBuilder();
                                sb.append(g.e(com.meituan.android.singleton.b.a));
                                buildUpon.appendQueryParameter("statusbar_height", sb.toString());
                                com.sankuai.waimai.foundation.router.a.a(MP_MineLogicModule.this.mActivity, buildUpon.build().toString(), bundle);
                                return;
                            } else if (intValue == 992) {
                                Bundle bundle2 = new Bundle();
                                if (machMap2.containsKey("extra_settings_url")) {
                                    bundle2.putString("extra_settings_url", (String) machMap2.get("extra_settings_url"));
                                }
                                bundle2.putBoolean("extra_settings_show_clear_cache", ((Boolean) machMap2.get("extra_settings_show_clear_cache")).booleanValue());
                                bundle2.putBoolean("extra_settings_show_auto_update", ((Boolean) machMap2.get("extra_settings_show_auto_download")).booleanValue());
                                bundle2.putString("extra_mt_protocol_and_illustrate", (String) machMap2.get("extra_settings_mt_protocol_and_illustrate"));
                                Activity activity = MP_MineLogicModule.this.mActivity;
                                com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.b.c + "/mrn?mrn_biz=waimai&mrn_entry=setting-page&mrn_component=setting-page", bundle2);
                                return;
                            } else if (intValue == 993) {
                                if (com.sankuai.waimai.foundation.core.a.b()) {
                                    com.sankuai.waimai.foundation.router.a.a(MP_MineLogicModule.this.mActivity, com.sankuai.waimai.foundation.router.interfaces.c.ae);
                                    return;
                                }
                                return;
                            } else if (intValue != 994) {
                                if (intValue == 995) {
                                    com.sankuai.waimai.business.im.api.msgcenter.a.a().clickMsgCenter(MP_MineLogicModule.this.mActivity);
                                    return;
                                } else if (booleanValue) {
                                    com.sankuai.waimai.platform.domain.manager.user.a.a(MP_MineLogicModule.this.mActivity, new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.MP_MineLogicModule.2.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr3 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cccac4161f2d1ae2e88899f5d64961b4", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cccac4161f2d1ae2e88899f5d64961b4");
                                            } else {
                                                MP_MineLogicModule.this.functionItemClick(MP_MineLogicModule.this.mActivity, str, machMap2, mPJSCallBack);
                                            }
                                        }
                                    });
                                    return;
                                } else {
                                    MP_MineLogicModule.this.functionItemClick(MP_MineLogicModule.this.mActivity, str, machMap2, mPJSCallBack);
                                    return;
                                }
                            } else if (!d.b()) {
                                com.sankuai.waimai.platform.domain.manager.user.a.a((Context) MP_MineLogicModule.this.mActivity);
                                return;
                            }
                        } else if (booleanValue) {
                            com.sankuai.waimai.platform.domain.manager.user.a.a(MP_MineLogicModule.this.mActivity, new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.MP_MineLogicModule.2.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a1bdf0b66959612a52549ae6a9b8b3a1", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a1bdf0b66959612a52549ae6a9b8b3a1");
                                    } else {
                                        com.sankuai.waimai.foundation.router.a.a(MP_MineLogicModule.this.mActivity, str);
                                    }
                                }
                            });
                            return;
                        }
                        com.sankuai.waimai.foundation.router.a.a(MP_MineLogicModule.this.mActivity, str);
                    }
                }
            });
        }
    }

    @JSMethod(methodName = "update")
    public void update() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68bbd327caed03dab2255f6ce006d819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68bbd327caed03dab2255f6ce006d819");
        } else if (this.mActivity == null || this.mActivity.isFinishing()) {
        } else {
            runUIThread(new Runnable() { // from class: com.sankuai.waimai.business.page.mine.module.MP_MineLogicModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6816f57b2c820d52df948454429f6e96", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6816f57b2c820d52df948454429f6e96");
                        return;
                    }
                    try {
                        aq.a(com.meituan.android.singleton.b.a).a(MP_MineLogicModule.this.mActivity);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @JSMethod(methodName = "startListener")
    public void startListener() {
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40a1c7c9516c4ca778b11afd411a29fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40a1c7c9516c4ca778b11afd411a29fb");
            return;
        }
        String.valueOf(this.pendingActions.size());
        char c2 = 1;
        this.startObserve = true;
        Iterator<a> it = this.pendingActions.iterator();
        while (it.hasNext()) {
            a next = it.next();
            String str = next.b;
            MachMap machMap = next.c;
            MPContext mPContext = this.mpContext;
            Object[] objArr2 = new Object[3];
            objArr2[c] = str;
            objArr2[c2] = machMap;
            objArr2[2] = mPContext;
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, next, changeQuickRedirect3, false, "fe5784982026e19018ef8df48a9de0e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect3, false, "fe5784982026e19018ef8df48a9de0e3");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(machMap);
                mPContext.getInstance();
                mPContext.getInstance().a(str, machMap);
            }
            c2 = 1;
            c = 0;
        }
        this.pendingActions.clear();
        String.valueOf(this.pendingActions.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void functionItemClick(android.app.Activity r20, java.lang.String r21, com.sankuai.waimai.machpro.base.MachMap r22, com.sankuai.waimai.machpro.bridge.MPJSCallBack r23) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.mine.module.MP_MineLogicModule.functionItemClick(android.app.Activity, java.lang.String, com.sankuai.waimai.machpro.base.MachMap, com.sankuai.waimai.machpro.bridge.MPJSCallBack):void");
    }

    private void runUIThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e20f4128d6f7e565c47adeebdada680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e20f4128d6f7e565c47adeebdada680");
        } else if (this.mActivity == null || this.mActivity.isFinishing()) {
        } else {
            this.mActivity.runOnUiThread(runnable);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b21fd03c09ddd7671a046fe3b79866fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b21fd03c09ddd7671a046fe3b79866fa");
            return;
        }
        emitUserInfo(aVar == b.a.LOGIN ? 0 : 1);
        if (aVar != b.a.CANCEL) {
            refreshAll(2);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b57b5e04af364fe0844ff09932a7d9ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b57b5e04af364fe0844ff09932a7d9ab");
            return;
        }
        emitUserInfo(-1);
        refreshAll(2);
    }

    @Override // com.sankuai.waimai.imbase.d
    public void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
        Object[] objArr = {longSparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59934039062b764a3026551c0031aeef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59934039062b764a3026551c0031aeef");
        } else if (this.mActivity == null || this.mActivity.isFinishing()) {
        } else {
            this.mFactory.c();
            d.a((MPContext) null, this.mpContext.getInstance(), this.mActivity, com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) this.mActivity, "message_center_switch", true), this.mData.d);
            int i = this.mData.d != null ? this.mData.d.unReadCount : 0;
            MachMap machMap = new MachMap();
            machMap.put("count", Integer.valueOf(i));
            readyToSendEvent("updateUnReadCount", machMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readyToSendEvent(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ee98e6fed8569b8809873a6bbad3608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ee98e6fed8569b8809873a6bbad3608");
        } else if (this.startObserve) {
            this.mpContext.getInstance().a(str, machMap);
        } else {
            a aVar = new a();
            aVar.b = str;
            aVar.c = machMap;
            this.pendingActions.add(aVar);
        }
    }

    private void emitUserInfo(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9e54241b87024168c442a4f58bb9426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9e54241b87024168c442a4f58bb9426");
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("status", Integer.valueOf(i));
        User b = com.sankuai.waimai.platform.domain.manager.user.a.i().b();
        if (b != null) {
            MachMap machMap2 = new MachMap();
            machMap2.put("avatarurl", b.avatarurl);
            machMap2.put("username", b.username);
            machMap.put("user", machMap2);
        }
        readyToSendEvent("onUserInfoUpdate", machMap);
    }

    private void refreshAll(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7eef3a9901e4b6ca29aab076f74402d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7eef3a9901e4b6ca29aab076f74402d2");
            return;
        }
        MachMap machMap = new MachMap();
        machMap.put("intent", Integer.valueOf(i));
        readyToSendEvent("setNeedsRequestData", machMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.waimai.business.page.mine.model.b generateMinePageDataWithMap(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5383901cce802613522274a76a801db7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.mine.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5383901cce802613522274a76a801db7");
        }
        com.sankuai.waimai.business.page.mine.model.b bVar = new com.sankuai.waimai.business.page.mine.model.b();
        MachMap machMap2 = (MachMap) machMap.get("message_info");
        if (machMap2 != null) {
            UnReadMsgEntity unReadMsgEntity = new UnReadMsgEntity();
            if (machMap2.get(RemoteMessageConst.MSGTYPE) != null) {
                unReadMsgEntity.msgType = ((Integer) machMap2.get(RemoteMessageConst.MSGTYPE)).intValue();
            }
            if (machMap2.get("unread_count") != null) {
                unReadMsgEntity.unReadCount = ((Integer) machMap2.get("unread_count")).intValue();
            }
            if (machMap2.get("h5_url") != null) {
                unReadMsgEntity.h5Url = (String) machMap2.get("h5_url");
            }
            if (machMap2.get("show_icon") != null) {
                unReadMsgEntity.showIcon = ((Integer) machMap2.get("show_icon")).intValue();
            }
            bVar.d = unReadMsgEntity;
        }
        MachMap machMap3 = (MachMap) machMap.get("vip_info");
        if (machMap3 != null) {
            b.e eVar = new b.e();
            if (machMap3.get("entrance_desc") != null) {
                eVar.c = (String) machMap3.get("entrance_desc");
            }
            if (machMap3.get("highlight") != null) {
                eVar.d = ((Boolean) machMap3.get("highlight")).booleanValue();
            }
            if (machMap3.get("h5_url") != null) {
                eVar.e = (String) machMap3.get("h5_url");
            }
            if (machMap3.get("show_vip_entrance") != null) {
                eVar.b = ((Boolean) machMap3.get("show_vip_entrance")).booleanValue();
            }
            if (machMap3.get("user_type") != null) {
                eVar.a = ((Integer) machMap3.get("user_type")).intValue();
            }
            bVar.b = eVar;
        }
        MachMap machMap4 = (MachMap) machMap.get("user_info");
        if (machMap4 != null) {
            b.d dVar = new b.d();
            if (machMap4.get("click_desc") != null) {
                dVar.a = (String) machMap4.get("click_desc");
            }
            bVar.a = dVar;
        }
        MachMap machMap5 = (MachMap) machMap.get("wm_card");
        if (machMap5 != null) {
            b.f fVar = new b.f();
            if (machMap5.get("description") != null) {
                fVar.b = (String) machMap5.get("description");
            }
            if (machMap5.get("title_icon") != null) {
                fVar.j = (String) machMap5.get("title_icon");
            }
            if (machMap5.get(RegionLinkDao.TABLENAME) != null) {
                fVar.c = (String) machMap5.get(RegionLinkDao.TABLENAME);
            }
            if (machMap5.get("link_text") != null) {
                fVar.d = (String) machMap5.get("link_text");
            }
            if (machMap5.get("title") != null) {
                fVar.a = (String) machMap5.get("title");
            }
            if (machMap5.get("show") != null) {
                fVar.f = ((Boolean) machMap5.get("show")).booleanValue();
            }
            if (machMap5.get("bubble") != null) {
                fVar.k = (String) machMap5.get("bubble");
            }
            if (machMap5.get("background_url") != null) {
                fVar.i = (String) machMap5.get("background_url");
            }
            if (machMap5.get("wmcard_status") != null) {
                fVar.h = ((Integer) machMap5.get("wmcard_status")).intValue();
            }
            if (machMap5.get("link_show_type") != null) {
                fVar.e = ((Integer) machMap5.get("link_show_type")).intValue();
            }
            MachMap machMap6 = (MachMap) machMap5.get("extra_map");
            if (machMap6 != null) {
                b.f.a aVar = new b.f.a();
                if (machMap6.get("memberStatus") != null) {
                    aVar.b = (String) machMap6.get("memberStatus");
                }
                if (machMap6.get("pageVersion") != null) {
                    aVar.a = (String) machMap6.get("pageVersion");
                }
                if (machMap6.get("mypage_v736_bottom_activity_desc_text") != null) {
                    aVar.c = (String) machMap6.get("mypage_v736_bottom_activity_desc_text");
                }
                if (machMap6.get("mypage_v736_bottom_activity_icon_text") != null) {
                    aVar.d = (String) machMap6.get("mypage_v736_bottom_activity_icon_text");
                }
                fVar.m = aVar;
            }
            if (machMap5.get("link_text_type") != null) {
                fVar.l = ((Integer) machMap5.get("link_text_type")).intValue();
            }
            if (machMap5.get("link_sub_text") != null) {
                fVar.g = (String) machMap5.get("link_sub_text");
            }
            bVar.h = fVar;
        }
        MachMap machMap7 = (MachMap) machMap.get("premium_campaign");
        if (machMap7 != null) {
            b.a aVar2 = new b.a();
            if (machMap7.get("bg_url") != null) {
                aVar2.c = (String) machMap7.get("bg_url");
            }
            if (machMap7.get("buy_status") != null) {
                aVar2.d = ((Integer) machMap7.get("buy_status")).intValue();
            }
            if (machMap7.get("show") != null) {
                aVar2.a = ((Boolean) machMap7.get("show")).booleanValue();
            }
            if (machMap7.get(RegionLinkDao.TABLENAME) != null) {
                aVar2.f = (String) machMap7.get(RegionLinkDao.TABLENAME);
            }
            if (machMap7.get("text") != null) {
                aVar2.e = (String) machMap7.get("text");
            }
            if (machMap7.get("icon_url") != null) {
                aVar2.b = (String) machMap7.get("icon_url");
            }
            MachMap machMap8 = (MachMap) machMap7.get("bubble");
            if (machMap8 != null) {
                b.a.C0813a c0813a = new b.a.C0813a();
                if (machMap8.get("description") != null) {
                    c0813a.b = (String) machMap8.get("description");
                }
                if (machMap8.get("type") != null) {
                    c0813a.a = ((Integer) machMap8.get("type")).intValue();
                }
                if (machMap8.get("version") != null) {
                    c0813a.c = ((Integer) machMap8.get("version")).intValue();
                }
                aVar2.g = c0813a;
            }
            bVar.g = aVar2;
        }
        MachMap machMap9 = (MachMap) machMap.get("settings_info");
        if (machMap9 != null) {
            b.c cVar = new b.c();
            if (machMap9.get("mt_protocol_and_illustrate") != null) {
                cVar.c = (String) machMap9.get("mt_protocol_and_illustrate");
            }
            if (machMap9.get("show_auto_download") != null) {
                cVar.b = ((Boolean) machMap9.get("show_auto_download")).booleanValue();
            }
            if (machMap9.get("show_clean_cache") != null) {
                cVar.a = ((Boolean) machMap9.get("show_clean_cache")).booleanValue();
            }
            bVar.c = cVar;
        }
        MachArray machArray = (MachArray) machMap.get("category_list");
        if (machArray != null) {
            ArrayList<FunctionCategory> arrayList = new ArrayList<>();
            for (int i = 0; i < machArray.size(); i++) {
                FunctionCategory functionCategory = new FunctionCategory();
                MachMap machMap10 = (MachMap) machArray.get(i);
                if (machMap10 != null) {
                    if (machMap10.get("code") != null) {
                        functionCategory.setCode(((Integer) machMap10.get("code")).intValue());
                    }
                    if (machMap10.get("show_title") != null) {
                        functionCategory.setShowTitle(((Integer) machMap10.get("show_title")).intValue());
                    }
                    if (machMap10.get("cat_title") != null) {
                        functionCategory.setTitle((String) machMap10.get("cat_title"));
                    }
                    MachMap machMap11 = (MachMap) machMap10.get("bubble");
                    if (machMap11 != null) {
                        com.sankuai.waimai.business.page.mine.model.a aVar3 = new com.sankuai.waimai.business.page.mine.model.a();
                        if (machMap11.get("description") != null) {
                            aVar3.b = (String) machMap11.get("description");
                        }
                        if (machMap11.get("version") != null) {
                            aVar3.c = ((Integer) machMap11.get("version")).intValue();
                        }
                        if (machMap11.get("type") != null) {
                            aVar3.a = ((Integer) machMap11.get("type")).intValue();
                        }
                        functionCategory.setBubble(aVar3);
                    }
                    MachMap machMap12 = (MachMap) machMap10.get("click_button");
                    if (machMap12 != null) {
                        FunctionCategory.ClickButton clickButton = new FunctionCategory.ClickButton();
                        if (machMap12.get("click_title") != null) {
                            clickButton.clickTitle = (String) machMap12.get("click_title");
                        }
                        if (machMap12.get("click_url") != null) {
                            clickButton.clickUrl = (String) machMap12.get("click_url");
                        }
                        functionCategory.setClickButton(clickButton);
                    }
                    MachArray machArray2 = (MachArray) machMap10.get("fun_list");
                    if (machArray2 != null) {
                        ArrayList<FunctionItem> arrayList2 = new ArrayList<>();
                        for (int i2 = 0; i2 < machArray2.size(); i2++) {
                            MachMap machMap13 = (MachMap) machArray2.get(i2);
                            if (machMap13 != null) {
                                FunctionItem functionItem = new FunctionItem();
                                if (machMap13.get("fun_code") != null) {
                                    functionItem.setCode(((Integer) machMap13.get("fun_code")).intValue());
                                }
                                if (machMap13.get("fun_title") != null) {
                                    functionItem.setTitle((String) machMap13.get("fun_title"));
                                }
                                if (machMap13.get(RemoteMessageConst.Notification.ICON) != null) {
                                    functionItem.setIconUrl((String) machMap13.get(RemoteMessageConst.Notification.ICON));
                                }
                                if (machMap13.get("click_url") != null) {
                                    functionItem.setClickUrl((String) machMap13.get("click_url"));
                                }
                                if (machMap13.get("need_login") != null) {
                                    functionItem.setNeedLogin(((Integer) machMap13.get("need_login")).intValue());
                                }
                                if (machMap13.get("desc_secd") != null) {
                                    functionItem.setSecondDesc((String) machMap13.get("desc_secd"));
                                }
                                if (machMap13.get("desc_secd_status") != null) {
                                    functionItem.setSecondDescStatus(((Integer) machMap13.get("desc_secd_status")).intValue());
                                }
                                if (machMap13.get("high_light_desc") != null) {
                                    functionItem.setHighLightDesc((String) machMap13.get("high_light_desc"));
                                }
                                MachMap machMap14 = (MachMap) machMap13.get("bubble");
                                if (machMap14 != null) {
                                    com.sankuai.waimai.business.page.mine.model.a aVar4 = new com.sankuai.waimai.business.page.mine.model.a();
                                    if (machMap14.get("type") != null) {
                                        aVar4.a = ((Integer) machMap14.get("type")).intValue();
                                    }
                                    if (machMap14.get("version") != null) {
                                        aVar4.c = ((Integer) machMap14.get("version")).intValue();
                                    }
                                    if (machMap14.get("description") != null) {
                                        aVar4.b = (String) machMap14.get("description");
                                    }
                                    functionItem.setBubble(aVar4);
                                }
                                arrayList2.add(functionItem);
                            }
                        }
                        functionCategory.setFunctionItems(arrayList2);
                    }
                }
                arrayList.add(functionCategory);
            }
            bVar.f = arrayList;
        }
        return bVar;
    }
}
