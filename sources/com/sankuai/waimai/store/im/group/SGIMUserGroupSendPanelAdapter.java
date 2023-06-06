package com.sankuai.waimai.store.im.group;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.expose.v2.b;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.im.base.SGIMSendPanelAdapter;
import com.sankuai.waimai.store.im.base.mach.IMJSEventHandler;
import com.sankuai.waimai.store.im.group.model.GroupAdministrator;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.mach.d;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.xm.imui.common.entity.AtInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMUserGroupSendPanelAdapter extends SGIMSendPanelAdapter {
    public static ChangeQuickRedirect h;
    protected d i;
    public BaseModuleDesc j;
    private FrameLayout k;
    @Nullable
    private List<GroupAdministrator> m;
    private UserGroupImInfo n;
    private com.sankuai.waimai.mach.d o;
    private com.sankuai.waimai.store.expose.v2.a p;
    private com.sankuai.waimai.store.im.poi.contract.a q;

    @Override // com.sankuai.waimai.store.im.base.SGIMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter
    public final int a(Context context) {
        return R.layout.wm_sc_user_group_im_send_panel_input_bar;
    }

    public static /* synthetic */ void b(SGIMUserGroupSendPanelAdapter sGIMUserGroupSendPanelAdapter) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, sGIMUserGroupSendPanelAdapter, changeQuickRedirect, false, "0ab3427b316b626579bebf40999ebc3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGIMUserGroupSendPanelAdapter, changeQuickRedirect, false, "0ab3427b316b626579bebf40999ebc3f");
        } else if (sGIMUserGroupSendPanelAdapter.k != null) {
            sGIMUserGroupSendPanelAdapter.k.post(new Runnable() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d61ec1e5c3141049dd1694662305a3f6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d61ec1e5c3141049dd1694662305a3f6");
                        return;
                    }
                    com.sankuai.waimai.store.expose.v2.entity.a aVar = new com.sankuai.waimai.store.expose.v2.entity.a(SGIMUserGroupSendPanelAdapter.this.k);
                    aVar.a(new c.a() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.5.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "12da2c568dbda2b0dddb7d379baf9372", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "12da2c568dbda2b0dddb7d379baf9372");
                            } else if (SGIMUserGroupSendPanelAdapter.this.i != null) {
                                SGIMUserGroupSendPanelAdapter.this.i.g();
                            }
                        }
                    });
                    b.a().a(SGIMUserGroupSendPanelAdapter.this.p, aVar);
                }
            });
        }
    }

    public static /* synthetic */ void c(SGIMUserGroupSendPanelAdapter sGIMUserGroupSendPanelAdapter) {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, sGIMUserGroupSendPanelAdapter, changeQuickRedirect, false, "4c4788fe59699c6008213f885b07b1a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGIMUserGroupSendPanelAdapter, changeQuickRedirect, false, "4c4788fe59699c6008213f885b07b1a2");
        } else if (!com.sankuai.shangou.stone.util.a.b(sGIMUserGroupSendPanelAdapter.m)) {
            long[] jArr = new long[sGIMUserGroupSendPanelAdapter.m.size()];
            for (GroupAdministrator groupAdministrator : sGIMUserGroupSendPanelAdapter.m) {
                jArr[i] = groupAdministrator.uid;
                i++;
            }
            sGIMUserGroupSendPanelAdapter.b.a(new AtInfo(jArr, "商家"), true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SGIMUserGroupSendPanelAdapter(@android.support.annotation.Nullable com.sankuai.waimai.store.im.group.model.UserGroupImInfo r12, com.sankuai.waimai.store.expose.v2.a r13, com.sankuai.waimai.store.im.poi.contract.a r14) {
        /*
            r11 = this;
            if (r12 != 0) goto L5
            java.lang.String r0 = ""
            goto L12
        L5:
            java.lang.String r0 = r12.poiIdStr
            boolean r0 = com.sankuai.shangou.stone.util.t.a(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = "-999"
            goto L12
        L10:
            java.lang.String r0 = r12.poiIdStr
        L12:
            r11.<init>(r0)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.h
            java.lang.String r10 = "5d09e0f839c4b4feece4fe1d227a832c"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L36
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L36:
            java.util.List<com.sankuai.waimai.store.im.group.model.GroupAdministrator> r0 = r12.administrators
            r11.m = r0
            r11.n = r12
            r11.p = r13
            r11.q = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.<init>(com.sankuai.waimai.store.im.group.model.UserGroupImInfo, com.sankuai.waimai.store.expose.v2.a, com.sankuai.waimai.store.im.poi.contract.a):void");
    }

    @Override // com.sankuai.waimai.store.im.base.SGIMSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.DefaultSendPanelAdapter, com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter
    public View createView(Context context, ViewGroup viewGroup) {
        Map<String, com.sankuai.waimai.store.mach.event.b> hashMap;
        Map hashMap2;
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78f5c047e694da253d54783eb970826", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78f5c047e694da253d54783eb970826");
        }
        View createView = super.createView(context, viewGroup);
        this.g.setVisibility(0);
        com.sankuai.waimai.store.im.poi.debug.a.a().a((ViewStub) createView.findViewById(R.id.v_im_debug_panel));
        Object[] objArr2 = {createView};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91760d07ef47b41a6b2efc85e05a530c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91760d07ef47b41a6b2efc85e05a530c");
        } else {
            this.k = (FrameLayout) createView.findViewById(R.id.fl_button_list_container);
            if (com.sankuai.shangou.stone.util.a.b(this.m) || this.n == null || com.sankuai.shangou.stone.util.a.b(this.n.moduleDescList) || this.n.groupState != 0) {
                a();
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = h;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6078704c00d6668b36e92e1a2da85f5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6078704c00d6668b36e92e1a2da85f5c");
                } else {
                    u.a(this.k);
                }
                BaseModuleDesc baseModuleDesc = (BaseModuleDesc) com.sankuai.shangou.stone.util.a.a((List<Object>) this.n.moduleDescList, 0);
                Object[] objArr4 = {baseModuleDesc};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1c6e249ab0019fe833ac0a9beb93cdae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1c6e249ab0019fe833ac0a9beb93cdae");
                } else if (p.a(baseModuleDesc) || TextUtils.isEmpty(baseModuleDesc.templateId) || TextUtils.isEmpty(baseModuleDesc.moduleId) || p.a(this.k)) {
                    a();
                } else {
                    this.j = baseModuleDesc;
                    String bt_ = this.q.bt_();
                    this.o = new com.sankuai.waimai.store.im.base.mach.a("c_waimai_4pe066t1");
                    if (this.i == null) {
                        this.i = new d(this.p, bt_) { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.mach.d
                            public final com.sankuai.waimai.mach.d aZ_() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "238f1d5e2e95cb2c1ba1a00b8472ab2d", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "238f1d5e2e95cb2c1ba1a00b8472ab2d") : SGIMUserGroupSendPanelAdapter.this.o;
                            }
                        };
                    }
                    com.sankuai.waimai.store.mach.medhod.a aVar = new com.sankuai.waimai.store.mach.medhod.a();
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = h;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4be1ed56250239aadeb1d66e49bd7280", RobustBitConfig.DEFAULT_VALUE)) {
                        hashMap = (Map) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4be1ed56250239aadeb1d66e49bd7280");
                    } else {
                        hashMap = new HashMap<>();
                        IMJSEventHandler iMJSEventHandler = new IMJSEventHandler(this.q);
                        iMJSEventHandler.c = new IMJSEventHandler.a() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.im.base.mach.IMJSEventHandler.a
                            public final void a() {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ad1d22bf8b3711bbe3e2a5223a3dbb55", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ad1d22bf8b3711bbe3e2a5223a3dbb55");
                                } else {
                                    SGIMUserGroupSendPanelAdapter.c(SGIMUserGroupSendPanelAdapter.this);
                                }
                            }
                        };
                        hashMap.put("jump", iMJSEventHandler);
                        hashMap.put("mach_im_normal_data", iMJSEventHandler);
                        hashMap.put("mach_im_normal_send_msg", iMJSEventHandler);
                        hashMap.put("mach_im_delete_normal_msg_data", iMJSEventHandler);
                        hashMap.put("mach_im_normal_send_tip_msg", iMJSEventHandler);
                        hashMap.put("mach_im_group_at_poi_msg", iMJSEventHandler);
                        hashMap.put("mach_im_general_local_msg", iMJSEventHandler);
                    }
                    aVar.a(hashMap);
                    this.i.g = aVar;
                    this.i.a(this.k, String.format("sm_mach_im_%s", baseModuleDesc.moduleId), "supermarket");
                    this.i.a(new e() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                        public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                        }

                        @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
                        public final void d() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2cee59bc94ea8872d7555322e0d1f531", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2cee59bc94ea8872d7555322e0d1f531");
                            } else {
                                SGIMUserGroupSendPanelAdapter.b(SGIMUserGroupSendPanelAdapter.this);
                            }
                        }
                    });
                    Object[] objArr6 = {baseModuleDesc};
                    ChangeQuickRedirect changeQuickRedirect6 = h;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "856b5a6b0bfbb4d73d29da336d40a548", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "856b5a6b0bfbb4d73d29da336d40a548");
                    } else if (!p.a(baseModuleDesc.jsonData)) {
                        a.C1015a c1015a = new a.C1015a();
                        c1015a.c = baseModuleDesc.templateId;
                        c1015a.b = baseModuleDesc.templateId;
                        c1015a.d = String.format("sm_mach_im_%s", baseModuleDesc.moduleId);
                        c1015a.e = "supermarket";
                        com.sankuai.waimai.mach.manager.load.a a = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
                        final HashMap hashMap3 = new HashMap(baseModuleDesc.jsonData);
                        Object[] objArr7 = {baseModuleDesc, 0};
                        ChangeQuickRedirect changeQuickRedirect7 = h;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f10d841ad4cdb2892fabf659993a60a2", RobustBitConfig.DEFAULT_VALUE)) {
                            hashMap2 = (Map) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f10d841ad4cdb2892fabf659993a60a2");
                        } else {
                            hashMap2 = new HashMap();
                            if (this.n != null) {
                                hashMap2.put("poi_id", TextUtils.isEmpty(this.n.poiId) ? "-999" : this.n.poiId);
                                hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, TextUtils.isEmpty(this.n.poiIdStr) ? "-999" : this.n.poiIdStr);
                                hashMap2.put("group_id", TextUtils.isEmpty(this.n.groupId) ? "-999" : this.n.groupId);
                            } else {
                                hashMap2.put("poi_id", "-999");
                                hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, "-999");
                                hashMap2.put("group_id", "-999");
                            }
                        }
                        hashMap3.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap2);
                        this.i.a(a, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupSendPanelAdapter.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                                Object[] objArr8 = {eVar};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "e5d9648466c1ad43f9e3c65a45e023cf", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "e5d9648466c1ad43f9e3c65a45e023cf");
                                } else {
                                    SGIMUserGroupSendPanelAdapter.this.i.a(eVar, hashMap3);
                                }
                            }

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                                Object[] objArr8 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect8 = a;
                                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "5539b47eebe7ca511b7d62cf3b529e48", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "5539b47eebe7ca511b7d62cf3b529e48");
                                    return;
                                }
                                bVar.printStackTrace();
                                SGIMUserGroupSendPanelAdapter.this.a();
                            }
                        });
                    }
                }
            }
        }
        return createView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cc3543a021729df9a8589182f339387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cc3543a021729df9a8589182f339387");
        } else {
            u.c(this.k);
        }
    }
}
