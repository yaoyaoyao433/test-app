package com.sankuai.waimai.store.im.group;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.g;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.r;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.SGIMUserGroupCommonAdapter;
import com.sankuai.waimai.store.im.base.SGIMSessionFragment;
import com.sankuai.waimai.store.im.base.e;
import com.sankuai.waimai.store.im.group.adapter.GroupEventMessageAdapter;
import com.sankuai.waimai.store.im.group.manager.c;
import com.sankuai.waimai.store.im.group.model.ExitUserGroupEvent;
import com.sankuai.waimai.store.im.group.model.SGGeneralMessage;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.group.model.UserGroupNoticeShowData;
import com.sankuai.waimai.store.im.group.view.SGIMUserGroupTopBannerBlock;
import com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter;
import com.sankuai.waimai.store.im.poi.model.SGCommonDataInfo;
import com.sankuai.waimai.store.im.util.b;
import com.sankuai.waimai.store.manager.judas.d;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.c;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMUserGroupChatPageDelegateImpl extends e implements a, com.sankuai.waimai.store.im.poi.a, com.sankuai.waimai.store.im.poi.contract.a {
    public static ChangeQuickRedirect e;
    private SGIMUserGroupTopBannerBlock f;
    private UserGroupImInfo g;
    private com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a h;
    private com.sankuai.waimai.store.im.poi.presenter.a i;
    private SessionId j;
    private SGCommonDataInfo k;
    private volatile boolean l;
    private volatile boolean m;
    private Map<String, Object> n;
    private Map<String, Object> o;
    private com.sankuai.waimai.store.manager.marketing.a p;
    private SGIMTitleBarAdapter q;

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    @Nullable
    public final String C() {
        return null;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void a(com.sankuai.waimai.store.im.delegate.a aVar) {
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void a(Map<String, Object> map) {
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final ICommonAdapter bx_() {
        return null;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final String by_() {
        return "c_waimai_4pe066t1";
    }

    public static /* synthetic */ boolean a(SGIMUserGroupChatPageDelegateImpl sGIMUserGroupChatPageDelegateImpl, boolean z) {
        sGIMUserGroupChatPageDelegateImpl.l = true;
        return true;
    }

    public SGIMUserGroupChatPageDelegateImpl(SGIMSessionFragment sGIMSessionFragment, Bundle bundle) {
        super(sGIMSessionFragment, bundle);
        Object[] objArr = {sGIMSessionFragment, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e85249c871dedbf866d05117ff8e54a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e85249c871dedbf866d05117ff8e54a1");
            return;
        }
        this.j = null;
        this.n = null;
        this.o = null;
        this.g = b.a(bundle);
        Bundle arguments = sGIMSessionFragment.getArguments();
        if (arguments != null) {
            this.j = (SessionId) arguments.getParcelable("SessionId");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.b
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245a6907e033711b9f56ed1d2017d58a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245a6907e033711b9f56ed1d2017d58a");
            return;
        }
        super.a(bundle);
        com.meituan.android.ptcommonim.base.manager.a.a().a(bw_(), PTIMCommonBean.UserType.TYPE_C);
        com.meituan.android.bus.a.a().a(this);
        if (UserCenter.getInstance(this.b.getActivity()).getUser() == null) {
            this.b.getActivity().finish();
        }
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.b
    public final void a(@NonNull View view, @Nullable Bundle bundle) {
        boolean z;
        Object obj;
        boolean z2;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2adc6a6977739af8c406a250b63e40b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2adc6a6977739af8c406a250b63e40b");
            return;
        }
        super.a(view, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86ec5d719e9a1cf93d294956f95cc16c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86ec5d719e9a1cf93d294956f95cc16c");
        } else if (this.f != null) {
            SGIMUserGroupTopBannerBlock sGIMUserGroupTopBannerBlock = this.f;
            UserGroupImInfo userGroupImInfo = this.g;
            Object[] objArr3 = {userGroupImInfo, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect3 = SGIMUserGroupTopBannerBlock.a;
            if (PatchProxy.isSupport(objArr3, sGIMUserGroupTopBannerBlock, changeQuickRedirect3, false, "108f8c4732392df096fdd115812fb7c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, sGIMUserGroupTopBannerBlock, changeQuickRedirect3, false, "108f8c4732392df096fdd115812fb7c8");
            } else {
                sGIMUserGroupTopBannerBlock.g = userGroupImInfo.poiId;
                sGIMUserGroupTopBannerBlock.h = userGroupImInfo.groupId;
                if (userGroupImInfo.groupState != 0) {
                    sGIMUserGroupTopBannerBlock.a(Boolean.FALSE);
                } else {
                    if (!TextUtils.isEmpty(userGroupImInfo.warningText)) {
                        c cVar = c.a.a;
                        Context context = sGIMUserGroupTopBannerBlock.d.getContext();
                        String str = userGroupImInfo.groupId;
                        boolean z3 = userGroupImInfo.isFirstEnterPage;
                        Object[] objArr4 = {context, str, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), (byte) 0};
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "a54eca312cff7cccedcb80294a4805c5", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "a54eca312cff7cccedcb80294a4805c5")).booleanValue();
                        } else {
                            if (z3) {
                                cVar.a(context, str, false);
                            } else {
                                Object[] objArr5 = {context, str};
                                ChangeQuickRedirect changeQuickRedirect5 = c.a;
                                if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "3a901409703df973ca1655c73aa065b2", RobustBitConfig.DEFAULT_VALUE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "3a901409703df973ca1655c73aa065b2")).booleanValue();
                                } else {
                                    Object[] objArr6 = {context, str};
                                    ChangeQuickRedirect changeQuickRedirect6 = c.a;
                                    UserGroupNoticeShowData userGroupNoticeShowData = null;
                                    if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "08d320701e7d1b7951035a03e2c696c6", RobustBitConfig.DEFAULT_VALUE)) {
                                        userGroupNoticeShowData = (UserGroupNoticeShowData) PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "08d320701e7d1b7951035a03e2c696c6");
                                    } else if (!TextUtils.isEmpty(str)) {
                                        ab b = ab.b();
                                        String str2 = "key_show_user_group_notice_" + str;
                                        com.sankuai.waimai.store.im.group.model.a aVar = cVar.b;
                                        Object userGroupNoticeShowData2 = new UserGroupNoticeShowData();
                                        Object[] objArr7 = {context, str2, aVar, userGroupNoticeShowData2};
                                        ChangeQuickRedirect changeQuickRedirect7 = r.a;
                                        if (PatchProxy.isSupport(objArr7, b, changeQuickRedirect7, false, "eccb39a730cbfd6594f40a80a10052d7", RobustBitConfig.DEFAULT_VALUE)) {
                                            obj = PatchProxy.accessDispatch(objArr7, b, changeQuickRedirect7, false, "eccb39a730cbfd6594f40a80a10052d7");
                                        } else if (context == null) {
                                            r.a();
                                            obj = userGroupNoticeShowData2;
                                        } else {
                                            q a = b.a(context);
                                            u uVar = b.b;
                                            Object[] objArr8 = {str2, aVar, uVar};
                                            ChangeQuickRedirect changeQuickRedirect8 = q.a;
                                            obj = PatchProxy.isSupport(objArr8, a, changeQuickRedirect8, false, "582fefc4a7096544d503b4ec8724b487", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr8, a, changeQuickRedirect8, false, "582fefc4a7096544d503b4ec8724b487") : a.a(str2, aVar, uVar, (u) null);
                                        }
                                        userGroupNoticeShowData = (UserGroupNoticeShowData) obj;
                                    }
                                    z2 = userGroupNoticeShowData != null && userGroupNoticeShowData.isClose && g.b().equals(userGroupNoticeShowData.mShowDay);
                                }
                                if (z2) {
                                    z = false;
                                }
                            }
                            z = true;
                        }
                        if (z) {
                            sGIMUserGroupTopBannerBlock.a(Boolean.TRUE);
                            sGIMUserGroupTopBannerBlock.c.setVisible(false);
                            if (TextUtils.isEmpty(userGroupImInfo.warningText)) {
                                sGIMUserGroupTopBannerBlock.b.setVisibility(8);
                            } else {
                                sGIMUserGroupTopBannerBlock.b.setVisibility(0);
                                int a2 = h.a(sGIMUserGroupTopBannerBlock.b.getContext(), 12.0f);
                                if (sGIMUserGroupTopBannerBlock.e.getVisibility() != 8) {
                                    sGIMUserGroupTopBannerBlock.b.setPadding(0, a2, 0, a2);
                                } else {
                                    sGIMUserGroupTopBannerBlock.b.setPadding(0, a2, h.a(sGIMUserGroupTopBannerBlock.b.getContext(), 30.0f), a2);
                                }
                                sGIMUserGroupTopBannerBlock.b.setText(userGroupImInfo.warningText);
                            }
                            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a3.b = sGIMUserGroupTopBannerBlock.i.getContext();
                            a3.c = "https://p0.meituan.net/ingee/f48994326020e91803636a2c82ac1e09775.png";
                            a3.a(sGIMUserGroupTopBannerBlock.i);
                            b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                            a4.b = sGIMUserGroupTopBannerBlock.f.getContext();
                            a4.c = "http://s3plus.sankuai.com/v1/mss_90f1b843ded34009946a59b66198d302/production/mtd-sketch-assets/2022-03-25/6479477a0054e736e3f50b183449c34e6b9dbf83/8A6DF0F4-C926-4621-B265-726B139A0BE7/assets/ic_%E8%B7%B3%E8%BD%AC_2@2x.png";
                            a4.a(sGIMUserGroupTopBannerBlock.f);
                        }
                    }
                    sGIMUserGroupTopBannerBlock.a(Boolean.FALSE);
                }
            }
        }
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = e;
        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "4dd2bd69a85e5860cd3bc8a387fbb3e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "4dd2bd69a85e5860cd3bc8a387fbb3e6");
        } else if (this.p == null && this.b.getActivity() != null && this.b.getView() != null && TextUtils.equals(this.g.showGroupCoupon, "1") && this.g.isFirstEnterPage) {
            this.p = new com.sankuai.waimai.store.manager.marketing.a(this.b.getActivity(), this.b.getView(), 999);
            this.p.a(true);
            HashMap hashMap = new HashMap();
            hashMap.put("wm_poi_id", this.g.poiId);
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, TextUtils.isEmpty(this.g.poiIdStr) ? "-999" : this.g.poiIdStr);
            this.p.a(hashMap, bt_(), 999);
        }
        if (this.g.groupState != 0) {
            Object[] objArr10 = {(byte) 0, "您已退出群聊"};
            ChangeQuickRedirect changeQuickRedirect10 = e;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "79e6d71867ab3ca85fdf5f0311a96de8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "79e6d71867ab3ca85fdf5f0311a96de8");
            } else {
                this.b.a(false, "您已退出群聊");
            }
        }
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "788a97bb12cfc87fda7c02e1057851b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "788a97bb12cfc87fda7c02e1057851b0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", this.g.groupId);
        hashMap.put("poi_id", this.g.poiId);
        d.a(this, "c_waimai_4pe066t1", hashMap);
        super.c();
        int a = com.sankuai.waimai.store.im.group.manager.a.a().a(this.g.groupId);
        if (a == com.sankuai.waimai.store.im.group.manager.a.c) {
            if (this.g.noDisturbingStatus) {
                return;
            }
            this.g.noDisturbingStatus = true;
            x();
        } else if (a == com.sankuai.waimai.store.im.group.manager.a.b && this.g.noDisturbingStatus) {
            this.g.noDisturbingStatus = false;
            x();
        }
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb32865dff8b480398d3417a8fe8b01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb32865dff8b480398d3417a8fe8b01");
        } else {
            super.b();
        }
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abdbb9e16625640d438a803594cce3bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abdbb9e16625640d438a803594cce3bf");
            return;
        }
        super.e();
        com.meituan.android.bus.a.a().b(this);
        if (this.i != null) {
            this.i.b();
        }
        if (this.p != null) {
            this.p.j();
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8bb5aec2b7185bbc6b5e485e9b52e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8bb5aec2b7185bbc6b5e485e9b52e3");
        } else if (this.g != null) {
            this.q.a(this.g.noDisturbingStatus);
        }
    }

    @Subscribe
    public void onExitUserGroup(ExitUserGroupEvent exitUserGroupEvent) {
        Object[] objArr = {exitUserGroupEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f29fc075e3f49c720af34ceb9fa7a605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f29fc075e3f49c720af34ceb9fa7a605");
        } else if (exitUserGroupEvent == null || this.b == null || this.b.getActivity() == null || com.sankuai.waimai.store.util.b.a(this.b.getActivity())) {
        } else {
            this.b.getActivity().finish();
        }
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final TitleBarAdapter f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad3b36f0c1da07f4fa065cf14c57e45", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitleBarAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad3b36f0c1da07f4fa065cf14c57e45");
        }
        if (this.q == null) {
            this.q = new SGIMTitleBarAdapter(this.g);
        }
        this.q.c = new SGIMTitleBarAdapter.a() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupChatPageDelegateImpl.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.a
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e57c079414516ff187122dea74cd6f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e57c079414516ff187122dea74cd6f3");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a("c_waimai_4pe066t1", "b_waimai_gn7kkgdg_mc").a("poi_id", SGIMUserGroupChatPageDelegateImpl.this.g.poiId).a("group_id", SGIMUserGroupChatPageDelegateImpl.this.g.groupId).a();
                com.sankuai.waimai.store.router.d.a(SGIMUserGroupChatPageDelegateImpl.this.b.getContext(), SGIMUserGroupChatPageDelegateImpl.this.g.poiSchemeUrl);
            }

            @Override // com.sankuai.waimai.store.im.poi.adapter.SGIMTitleBarAdapter.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3ea1fc4786816bec028867c7263d6bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3ea1fc4786816bec028867c7263d6bd");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a("c_waimai_4pe066t1", "b_waimai_8j24fb63_mc").a("poi_id", SGIMUserGroupChatPageDelegateImpl.this.g.poiId).a("group_id", SGIMUserGroupChatPageDelegateImpl.this.g.groupId).a();
                com.sankuai.waimai.store.router.d.a(SGIMUserGroupChatPageDelegateImpl.this.b.getContext(), SGIMUserGroupChatPageDelegateImpl.this.g.groupSchemeUrl);
            }
        };
        return this.q;
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final IBannerAdapter g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6ad7b40ffe826a8bbaf8851908b3d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (IBannerAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6ad7b40ffe826a8bbaf8851908b3d6");
        }
        if (this.f == null) {
            this.f = new SGIMUserGroupTopBannerBlock();
        }
        return this.f;
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final void a(List<com.sankuai.xm.imui.session.entity.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc128c8e4b1c43303a2951c8022a9565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc128c8e4b1c43303a2951c8022a9565");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.b.a(list) && this.i != null) {
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.xm.imui.session.entity.b bVar : list) {
                if (bVar != null && bVar.b != 0 && bVar.b.getMsgType() == 17 && this.j != null && bVar.b.getChatId() == this.j.b) {
                    arrayList.add(bVar.b);
                }
            }
            com.meituan.android.ptcommonim.base.manager.d.a(arrayList, false, PTIMCommonBean.UserType.TYPE_C);
            this.i.a(arrayList);
        }
        super.a(list);
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final IMsgViewAdapter j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c9b44b2ddc81ad48e8a6e4ce9381a1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsgViewAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c9b44b2ddc81ad48e8a6e4ce9381a1a");
        }
        if (this.g != null && !t.a(this.g.group_dynamic_data)) {
            this.k = (SGCommonDataInfo) i.a(this.g.group_dynamic_data, SGCommonDataInfo.class);
            if (this.k != null && this.k.isUserDynamic) {
                String str = this.k.mIMDynamicCardsString;
                this.k.mIMDynamicCards = (List) i.a(str, new TypeToken<List<SGCommonDataInfo.IMDynamicCard>>() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupChatPageDelegateImpl.2
                }.getType());
                this.i = new com.sankuai.waimai.store.im.poi.presenter.a(this.j, a(), (Activity) this.c, this.k, this);
            }
        }
        return new IMsgViewAdapter() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupChatPageDelegateImpl.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public ICommonAdapter getCommonAdapter() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c988450d08de31a4f31c8b26dca9603f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (ICommonAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c988450d08de31a4f31c8b26dca9603f");
                }
                SGIMUserGroupCommonAdapter sGIMUserGroupCommonAdapter = new SGIMUserGroupCommonAdapter(SGIMUserGroupChatPageDelegateImpl.this.g);
                String s = SGIMUserGroupChatPageDelegateImpl.this.s();
                Object[] objArr3 = {s};
                ChangeQuickRedirect changeQuickRedirect3 = SGIMUserGroupCommonAdapter.a;
                if (PatchProxy.isSupport(objArr3, sGIMUserGroupCommonAdapter, changeQuickRedirect3, false, "607f8fa807d6ee3faceea3d16f05f8b6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, sGIMUserGroupCommonAdapter, changeQuickRedirect3, false, "607f8fa807d6ee3faceea3d16f05f8b6");
                } else if (!t.a(s)) {
                    sGIMUserGroupCommonAdapter.b = s;
                }
                return new SGIMUserGroupCommonAdapter(SGIMUserGroupChatPageDelegateImpl.this.g);
            }

            @Override // com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
            public IExtraAdapter getExtraAdapter(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c95a2159629b9046adf6904bb4b9a78", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IExtraAdapter) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c95a2159629b9046adf6904bb4b9a78");
                }
                if (i != 11) {
                    if (i != 16) {
                        switch (i) {
                            case 2:
                            case 3:
                                return new ImageMsgAdapter() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupChatPageDelegateImpl.3.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.xm.imui.session.view.adapter.impl.ImageMsgAdapter, com.sankuai.xm.imui.session.view.adapter.IImageMsgAdapter
                                    @ColorInt
                                    public int getShapeBorderColor(com.sankuai.xm.imui.session.entity.b<ImageMessage> bVar) {
                                        Object[] objArr3 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a92f9ef6672efdf4410042babcced22", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a92f9ef6672efdf4410042babcced22")).intValue() : this.e.getResources().getColor(R.color.wm_st_common_transparent);
                                    }
                                };
                            default:
                                return null;
                        }
                    }
                    return new SGIMUserGroupGeneralMsgAdapter(SGIMUserGroupChatPageDelegateImpl.this.b, SGIMUserGroupChatPageDelegateImpl.this.d, SGIMUserGroupChatPageDelegateImpl.this, SGIMUserGroupChatPageDelegateImpl.this.a(), SGIMUserGroupChatPageDelegateImpl.this.k, SGIMUserGroupChatPageDelegateImpl.this);
                }
                return new GroupEventMessageAdapter();
            }
        };
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final ISendPanelAdapter l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed9c8494b8fd4058e2854c691721a13", RobustBitConfig.DEFAULT_VALUE) ? (ISendPanelAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed9c8494b8fd4058e2854c691721a13") : new SGIMUserGroupSendPanelAdapter(this.g, this.b, this);
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "237e1c3002b123795a90bce3775f6de3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "237e1c3002b123795a90bce3775f6de3")).booleanValue();
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("groupId", this.g.groupId);
            hashMap.put("groupUrl", this.g.profilePhoto);
            hashMap.put(Message.GROUP_NAME, this.g.groupName);
            bVar.b.appendExtension(hashMap);
        } catch (Exception unused) {
        }
        if (this.i != null && bVar != null && bVar.b != 0 && bVar.b.getMsgType() == 17) {
            this.i.a(bVar.b);
        }
        return super.a(bVar);
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b61a7392e7dc6a1d1ad649bb9773f82", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b61a7392e7dc6a1d1ad649bb9773f82")).booleanValue() : super.a(i, bVar);
    }

    @Override // com.sankuai.waimai.store.im.group.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38609c68088a1381afac64acdaf8d15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38609c68088a1381afac64acdaf8d15");
        } else if (this.g != null) {
            com.sankuai.waimai.store.im.util.b.a(String.valueOf(j), this.g.poiId, this.g.poiBuzType, this.c);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.a
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a774fc458c9d22df2c9551f342ba2eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a774fc458c9d22df2c9551f342ba2eb7");
            return;
        }
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        if (this.g != null) {
            str2 = this.g.poiName;
            str3 = this.g.profilePhoto;
            str4 = this.g.poiId;
            str5 = this.g.groupId;
        }
        String str6 = str2;
        String str7 = str3;
        if (i == 11 || i == 12 || i == 13 || i == 14) {
            if (this.h == null) {
                this.h = new com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a(this.b.getActivity(), null, t.a(str4) ? 0L : Long.parseLong(str4), str, str6, str7);
            }
            final com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a aVar = this.h;
            long parseLong = Long.parseLong(str5);
            Object[] objArr2 = {new Long(parseLong), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "e7d3d50b5f39de287a531196b55578f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "e7d3d50b5f39de287a531196b55578f2");
                return;
            }
            aVar.i = i;
            long j = aVar.g;
            int i2 = aVar.i;
            Object[] objArr3 = {new Long(j), new Long(parseLong), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "1a9ff95fe294d0f60234d1b0df86d209", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "1a9ff95fe294d0f60234d1b0df86d209");
            } else {
                com.sankuai.waimai.store.im.base.net.b.a("SimpleListDialogDelegateImpl").a(j, parseLong, IMClient.a().k(), i2, new j<Object>() { // from class: com.sankuai.waimai.store.im.poi.ordersimplelist.delegate.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "23ad21efebb766dae0aea40740ae5099", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "23ad21efebb766dae0aea40740ae5099");
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(Object obj) {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr4 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "11dba94a3450066e246f214a099ac650", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "11dba94a3450066e246f214a099ac650");
                        } else if (!t.a(bVar.getMessage()) && !com.sankuai.waimai.store.util.b.a(a.this.b)) {
                            am.a(a.this.b, bVar.getMessage());
                        } else {
                            am.a(a.this.b, "网络连接异常");
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.im.base.e, com.sankuai.waimai.store.im.base.i.a
    public final void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
        c.a aVar;
        Object[] objArr = {Integer.valueOf(i), str, list, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9fea60e53e8384c047f255168aa532e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9fea60e53e8384c047f255168aa532e");
            return;
        }
        if (this.b != null && this.k != null && this.k.isUserDynamic && ((i2 == 1 || i2 == 2 || i2 == 4) && (aVar = this.b.u) != null)) {
            int c = com.sankuai.waimai.foundation.utils.b.c(aVar.c());
            com.sankuai.waimai.foundation.utils.b.c(list);
            if (this.i != null && this.i.a(c)) {
                View y = y();
                if (y != null) {
                    com.sankuai.shangou.stone.util.u.b(y);
                }
                this.i.a();
            }
        }
        super.a(i, str, list, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20598b7f8b08dfcb4fd9cde00df3c46f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20598b7f8b08dfcb4fd9cde00df3c46f");
        }
        if (this.b == null || this.b.getView() == null) {
            return null;
        }
        try {
            return this.b.getView().findViewById(R.id.xm_sdk_msg_list);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    @NonNull
    public final Map<String, Object> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3452104f95005f3a1a60716e8277c601", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3452104f95005f3a1a60716e8277c601");
        }
        if (this.n == null) {
            this.n = new HashMap();
        }
        return this.n;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final Map<String, Object> ak_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88775d63f86e6c62cc01e1cd420b554", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88775d63f86e6c62cc01e1cd420b554");
        }
        if (this.o == null) {
            this.o = new HashMap();
        }
        return this.o;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    @Nullable
    public final String r() {
        return this.g.poiId;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    @Nullable
    public final String s() {
        return this.g.poiIdStr;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final SGCommonDataInfo m() {
        return this.k;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void aj_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a71cdedac4e1b7da8993e3df2ea5a48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a71cdedac4e1b7da8993e3df2ea5a48");
            return;
        }
        try {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.im.group.SGIMUserGroupChatPageDelegateImpl.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6948c149c2503cb94a87325ba9753d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6948c149c2503cb94a87325ba9753d4");
                        return;
                    }
                    View y = SGIMUserGroupChatPageDelegateImpl.this.y();
                    if (SGIMUserGroupChatPageDelegateImpl.this.b != null && y != null && !SGIMUserGroupChatPageDelegateImpl.this.l) {
                        SGIMUserGroupChatPageDelegateImpl.this.b.A();
                        SGIMUserGroupChatPageDelegateImpl.this.b.y();
                        SGIMUserGroupChatPageDelegateImpl.a(SGIMUserGroupChatPageDelegateImpl.this, true);
                    }
                    if (y != null) {
                        com.sankuai.shangou.stone.util.u.a(y);
                    }
                }
            }, bt_());
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void ah_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e1003ff2d57ccba8f5b26e974c4da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e1003ff2d57ccba8f5b26e974c4da9");
        } else if (this.b == null || this.b.getHost() == null || this.m) {
        } else {
            this.b.y();
            this.m = true;
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final String bt_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee5f48d5eec6d54b166108a55065263", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee5f48d5eec6d54b166108a55065263") : a();
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final UserGroupImInfo bu_() {
        return this.g;
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void a_(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d68d6d44ae4b6f886d8beafd65e767bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d68d6d44ae4b6f886d8beafd65e767bd");
        } else if (map == null || map.isEmpty() || map.get("data") == null) {
        } else {
            try {
                Object obj = map.get("data");
                long longValue = ((Long) map.get("fromUid")).longValue();
                String str = (String) map.get("msgUuid");
                String str2 = (String) map.get("fromName");
                byte[] b = com.sankuai.waimai.store.im.util.b.b((String) obj);
                if (b != null) {
                    GeneralMessage a = com.sankuai.xm.imui.common.util.c.a(b);
                    a.setChatId(com.sankuai.xm.imui.b.a().d());
                    a.setCategory(com.sankuai.xm.imui.b.a().e());
                    a.setToUid(com.sankuai.xm.imui.b.a().d());
                    a.setToAppId(com.sankuai.xm.imui.b.a().g());
                    a.setMsgStatus(9);
                    a.setSts(com.meituan.android.time.c.b());
                    a.setGroupName(this.g.groupName);
                    a.setChannel(com.sankuai.xm.imui.b.a().f().g);
                    a.setFromUid(longValue);
                    a.setFromName(str2);
                    if (!t.a(c(map))) {
                        a.setSummary(c(map));
                    }
                    a.setMsgUuid(str);
                    a.setMsgId(com.meituan.android.time.c.b());
                    IMUIManager.a().a(a, false, null);
                }
                if (this.b != null) {
                    this.b.y();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final void bv_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c095ce740704ac22279ec3495e79aa1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c095ce740704ac22279ec3495e79aa1c");
        } else {
            com.sankuai.waimai.store.router.d.a(this.b.getContext(), this.g.poiSchemeUrl);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final Context bw_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5c290c015b26cbec42ffd7f3656b30", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5c290c015b26cbec42ffd7f3656b30") : this.b.getContext();
    }

    @Override // com.sankuai.waimai.store.im.poi.contract.a
    public final int v() {
        if (this.g != null) {
            return this.g.poiBuzType;
        }
        return 0;
    }

    private String c(@NotNull Map<String, Object> map) {
        SGGeneralMessage sGGeneralMessage;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236217b51db3877d698d9e474a70a07c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236217b51db3877d698d9e474a70a07c") : (map.get("data") == null || (sGGeneralMessage = (SGGeneralMessage) i.a(String.valueOf(map.get("data")), SGGeneralMessage.class)) == null) ? "" : sGGeneralMessage.summary;
    }
}
