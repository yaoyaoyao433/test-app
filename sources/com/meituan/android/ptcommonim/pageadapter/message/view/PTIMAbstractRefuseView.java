package com.meituan.android.ptcommonim.pageadapter.message.view;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.ptcommonim.base.network.BaseApiRetrofitService;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.model.PTIMExtensionBean;
import com.meituan.android.singleton.k;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.c;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class PTIMAbstractRefuseView extends AbstractMsgSideView {
    public static ChangeQuickRedirect a;
    private String b;
    private ImageView e;
    private TextView f;
    private LinearLayout g;
    private boolean h;
    private boolean i;
    private boolean j;
    private Context k;

    public abstract Map<String, Object> getBusinessMap();

    public static /* synthetic */ void a(PTIMAbstractRefuseView pTIMAbstractRefuseView, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, pTIMAbstractRefuseView, changeQuickRedirect, false, "c74d7ab3ccd70cc5aaaec8e80ec19e88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, pTIMAbstractRefuseView, changeQuickRedirect, false, "c74d7ab3ccd70cc5aaaec8e80ec19e88");
        } else if (pTIMAbstractRefuseView.k instanceof Activity) {
            com.meituan.android.ptcommonim.base.util.b.a((Activity) pTIMAbstractRefuseView.k, str);
        }
    }

    public static /* synthetic */ boolean a(PTIMAbstractRefuseView pTIMAbstractRefuseView, boolean z) {
        pTIMAbstractRefuseView.i = false;
        return false;
    }

    public PTIMAbstractRefuseView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c6c6f2f4afff5d92541a159e06fecf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c6c6f2f4afff5d92541a159e06fecf");
        }
    }

    public PTIMAbstractRefuseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbd3cb4ee5171abf11e9a78b5f0aa979", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbd3cb4ee5171abf11e9a78b5f0aa979");
        }
    }

    public PTIMAbstractRefuseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "516e8a1c01d0d585b571bafe138bf6d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "516e8a1c01d0d585b571bafe138bf6d1");
            return;
        }
        this.b = "PTIMRefuseView";
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = context;
        inflate(context, R.layout.ptitm_refuse_layout, this);
        this.e = (ImageView) findViewById(R.id.refuse_img);
        this.f = (TextView) findViewById(R.id.refuse_tv);
        this.g = (LinearLayout) findViewById(R.id.refuse_lin);
        com.meituan.android.ptcommonim.protocol.util.a.a("PTIMAbstractRefuseView init");
        this.g.setOnClickListener(a.a(this));
    }

    public static /* synthetic */ void a(PTIMAbstractRefuseView pTIMAbstractRefuseView, View view) {
        Call<BaseDataEntity> saveRefuseStatus;
        Object[] objArr = {pTIMAbstractRefuseView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdfa01db19e8582ec5ef259d46929ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdfa01db19e8582ec5ef259d46929ec9");
            return;
        }
        if (!pTIMAbstractRefuseView.h && !pTIMAbstractRefuseView.i) {
            pTIMAbstractRefuseView.i = true;
            com.meituan.android.ptcommonim.base.network.a a2 = com.meituan.android.ptcommonim.base.network.a.a();
            Map<String, Object> bodyMap = pTIMAbstractRefuseView.getBodyMap();
            Object[] objArr2 = {bodyMap};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.ptcommonim.base.network.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b93f3ceddbad8b6e559fc792308a45b3", RobustBitConfig.DEFAULT_VALUE)) {
                saveRefuseStatus = (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b93f3ceddbad8b6e559fc792308a45b3");
            } else {
                HashMap hashMap = new HashMap();
                if (a2.c != null && a2.c.isLogin()) {
                    hashMap.put("token", a2.c.getToken());
                }
                saveRefuseStatus = ((BaseApiRetrofitService) a2.b.a(BaseApiRetrofitService.class)).saveRefuseStatus(hashMap, bodyMap);
            }
            saveRefuseStatus.a(new f<BaseDataEntity>() { // from class: com.meituan.android.ptcommonim.pageadapter.message.view.PTIMAbstractRefuseView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<BaseDataEntity> call, Response<BaseDataEntity> response) {
                    String str;
                    Object[] objArr3 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "933d919696554db2f4512b1726b40ea1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "933d919696554db2f4512b1726b40ea1");
                        return;
                    }
                    Map<String, Object> businessMap = PTIMAbstractRefuseView.this.getBusinessMap();
                    if (response != null && response.e() != null && response.e().code == 0) {
                        com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_refuse_button", "ptim_operation_refuse_button_success");
                        if (businessMap != null) {
                            String str2 = (String) businessMap.get("sceneTypeDesc");
                            Object[] objArr4 = {str2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.pageadapter.message.manager.a.a;
                            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2f63a59bb793da4747d93ccc2d4eae46", RobustBitConfig.DEFAULT_VALUE)) {
                                str = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2f63a59bb793da4747d93ccc2d4eae46");
                            } else {
                                String str3 = "";
                                if (TextUtils.equals(com.meituan.android.ptcommonim.protocol.env.a.b, "3")) {
                                    str3 = "[点击|meituanwaimai://waimai.meituan.com/mmp?appId=eb875e401c1046b4&targetPath=%2Fpages%2Findex%2Findex%3FpageType%3DstoreMsgRejectConfig]";
                                } else if (TextUtils.equals(com.meituan.android.ptcommonim.protocol.env.a.b, "7")) {
                                    str3 = "[点击|imeituan://www.meituan.com/mmp?appId=eb875e401c1046b4&targetPath=%2Fpages%2Findex%2Findex%3FpageType%3DstoreMsgRejectConfig]";
                                }
                                str = "已拒收全部商家的“" + str2 + "”，" + str3 + "管理更多消息";
                            }
                            IMUIManager.a().c(PTIMAbstractRefuseView.this.a(c.b(str)));
                            PTIMAbstractRefuseView.a(PTIMAbstractRefuseView.this, "已拒收全部商家的“" + str2 + "”");
                            com.meituan.android.ptcommonim.protocol.util.a.a("PTIMAbstractRefuseView insert 点此");
                        } else {
                            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_refuse_button", "ptim_operation_refuse_button_failed", "业务侧传参异常");
                        }
                    } else {
                        com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_refuse_button", "ptim_operation_refuse_button_failed", "response数据异常");
                        PTIMAbstractRefuseView.a(PTIMAbstractRefuseView.this, "拒收失败，请稍后再试");
                    }
                    PTIMAbstractRefuseView.a(PTIMAbstractRefuseView.this, false);
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<BaseDataEntity> call, Throwable th) {
                    Object[] objArr3 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c6b4f8c9cdf78a8e27866ac1e24fc1c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c6b4f8c9cdf78a8e27866ac1e24fc1c0");
                        return;
                    }
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_refuse_button", "ptim_operation_refuse_button_failed", "调用接口异常");
                    PTIMAbstractRefuseView.a(PTIMAbstractRefuseView.this, "拒收失败，请稍后再试");
                    PTIMAbstractRefuseView.a(PTIMAbstractRefuseView.this, false);
                }
            });
            com.meituan.android.ptcommonim.protocol.util.a.a("PTIMAbstractRefuseView onClick refuse");
        }
        if (pTIMAbstractRefuseView.h) {
            Map<String, Object> reportGeneralMge = pTIMAbstractRefuseView.getReportGeneralMge();
            reportGeneralMge.put("button_name", "已拒收");
            com.meituan.android.ptcommonim.utils.f.a("b_group_m86zyh1b_mc", "c_group_74zpfj6k", reportGeneralMge, (Map) null);
            return;
        }
        Map<String, Object> reportGeneralMge2 = pTIMAbstractRefuseView.getReportGeneralMge();
        reportGeneralMge2.put("button_name", "点此拒收");
        com.meituan.android.ptcommonim.utils.f.a("b_group_m86zyh1b_mc", "c_group_74zpfj6k", reportGeneralMge2, (Map) null);
    }

    private Map<String, Object> getBodyMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f43ac91ab2f3f7cd1b9c576f4a11d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f43ac91ab2f3f7cd1b9c576f4a11d8");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, Object> businessMap = getBusinessMap();
        UserCenter a2 = k.a();
        if (!businessMap.isEmpty()) {
            hashMap.put("idKey", "user_" + businessMap.get("sceneType") + "_all_all");
            hashMap.put("buId", businessMap.get("buId"));
            hashMap2.put("chatType", businessMap.get("sceneType"));
        }
        hashMap.put(DeviceInfo.USER_ID, Long.valueOf(a2 != null ? a2.getUserId() : 0L));
        hashMap.put("key", "switch");
        hashMap.put("value", "2");
        hashMap2.put("type", "user");
        if (!g(getMessage())) {
            hashMap.put("msgId", Long.valueOf(getMessage().a().getMsgId()));
            hashMap2.put(Message.PEER_APPID, getMessage().a().getPeerAppId() == 0 ? com.meituan.android.ptcommonim.protocol.env.a.b : Short.valueOf(getMessage().a().getPeerAppId()));
            hashMap2.put("receiverUid", Long.valueOf(getMessage().a().getToUid()));
            hashMap2.put("channel", Short.valueOf(getMessage().a().getChannel()));
            hashMap2.put("category", Integer.valueOf(getMessage().a().getCategory()));
            hashMap2.put("chatID", Long.valueOf(getMessage().a().getChatId()));
            hashMap2.put(Message.PEER_UID, Long.valueOf(getMessage().a().getPeerUid()));
        }
        hashMap2.put(Message.SID, "all_all");
        hashMap.put("sessionInfo", hashMap2);
        hashMap.put("appId", com.meituan.android.ptcommonim.protocol.env.a.b);
        return hashMap;
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView, com.sankuai.xm.imui.common.view.message.a
    public final void a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa40fb91d9feef0ae968ff6f1e2b9941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa40fb91d9feef0ae968ff6f1e2b9941");
            return;
        }
        super.a(bVar);
        f(bVar);
    }

    @Override // com.sankuai.xm.imui.common.view.message.AbstractMsgSideView
    public final void b(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a471466d8f18bb8ea4383ed79e5a73b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a471466d8f18bb8ea4383ed79e5a73b");
            return;
        }
        super.b(bVar);
        f(bVar);
    }

    private Map<String, Object> getReportGeneralMge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3861640258bee53bd12e37376897b083", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3861640258bee53bd12e37376897b083");
        }
        Map<String, Object> businessMap = getBusinessMap();
        HashMap hashMap = new HashMap();
        if (!g(getMessage())) {
            IMMessage a2 = getMessage().a();
            hashMap.put("chat_type", MessageUtils.categoryToPushChatType(a2.getCategory(), a2.getPubCategory()));
            hashMap.put("message_body_id", Long.valueOf(a2.getChatId()));
            hashMap.put("peer_uid", Long.valueOf(a2.getPeerUid()));
            hashMap.put("channel_id", Short.valueOf(a2.getChannel()));
            hashMap.put(Message.SID, !TextUtils.isEmpty(a2.getSID()) ? a2.getSID() : "-999");
        }
        if (!businessMap.isEmpty()) {
            hashMap.put(Constants.Business.KEY_BU_ID, businessMap.get("buId"));
            hashMap.put("poi_id", TextUtils.isEmpty((String) businessMap.get("poiId")) ? "-999" : businessMap.get("poiId"));
            hashMap.put("real_cid", businessMap.get("realCid"));
            hashMap.put("scene_type", businessMap.get("sceneTypeDesc"));
        }
        return hashMap;
    }

    private void f(com.sankuai.xm.imui.session.entity.b bVar) {
        String additionData;
        List<PTIMExtensionBean.Attacher> a2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b135f548afb2080fbaabba7cabd1576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b135f548afb2080fbaabba7cabd1576");
        } else if (g(bVar) || a(bVar.i()) || !h(bVar)) {
            if (g(bVar)) {
                com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_show_refuse_button", "ptim_show_refuse_button_failed", "msg数据异常");
            } else if (a(bVar.i())) {
                com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_show_refuse_button", "ptim_show_refuse_button_failed", "消息超过30天不能操作拒收");
            } else if (h(bVar)) {
                com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_show_refuse_button", "ptim_show_refuse_button_failed", "拒收开关未打开");
            }
            this.g.setVisibility(8);
        } else {
            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_show_refuse_button", "ptim_show_refuse_button_success");
            if (bVar.j() != null && (additionData = bVar.j().getAdditionData()) != null && (a2 = com.meituan.android.ptcommonim.utils.c.a(additionData)) != null) {
                setRefuseStatus(TextUtils.equals(com.meituan.android.ptcommonim.utils.c.a(a2).getValue(), "refused"));
            } else {
                setRefuseStatus(false);
            }
            this.g.setVisibility(0);
            a();
        }
    }

    private boolean g(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511b06b61ab44d93d814f87be1aced6c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511b06b61ab44d93d814f87be1aced6c")).booleanValue() : bVar == null || bVar.a() == null;
    }

    private boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f72f6ae61a9379cab4c2315c78450b9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f72f6ae61a9379cab4c2315c78450b9")).booleanValue() : new Date().getTime() - j > 2592000000L;
    }

    private boolean h(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1853b2bbe897ea8b3d843f761195e806", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1853b2bbe897ea8b3d843f761195e806")).booleanValue() : com.meituan.android.ptcommonim.utils.c.a(com.meituan.android.ptcommonim.utils.c.b(bVar.a().getExtension())) != null;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c783ef0c12f3e64b661d9eb33ae761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c783ef0c12f3e64b661d9eb33ae761");
        } else if (this.j) {
            com.meituan.android.ptcommonim.utils.f.b("b_group_m86zyh1b_mv", "c_group_74zpfj6k", getReportGeneralMge(), null);
            this.j = false;
        }
    }

    private void setRefuseStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979e103a8269c79e86cd8512633411f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979e103a8269c79e86cd8512633411f3");
            return;
        }
        this.e.setImageResource(z ? R.drawable.ptim_refuse_checked : R.drawable.ptim_refuse_unchecked);
        this.f.setText(z ? "已拒收" : "点此拒收");
        this.h = z;
        if (z) {
            com.meituan.android.ptcommonim.protocol.util.a.a("PTIMAbstractRefuseView button status = 已拒收");
        } else {
            com.meituan.android.ptcommonim.protocol.util.a.a("PTIMAbstractRefuseView button status = 点此拒收");
        }
    }

    public IMMessage a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125326cdbc3081c67802300793b66745", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125326cdbc3081c67802300793b66745");
        }
        if (iMMessage == null) {
            iMMessage = new IMMessage();
        }
        com.sankuai.xm.imui.b a2 = com.sankuai.xm.imui.b.a();
        if (a2 != null) {
            iMMessage.setFromUid(a2.d());
            iMMessage.setChatId(a2.d());
            iMMessage.setCategory(a2.e());
            iMMessage.setToUid(a2.d());
            iMMessage.setToAppId(a2.g());
            iMMessage.setPeerAppId(a2.g());
            iMMessage.setChannel(a2.f() != null ? a2.f().d() : (short) 0);
            iMMessage.setMsgStatus(9);
        }
        return iMMessage;
    }
}
