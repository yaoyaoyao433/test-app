package com.meituan.android.ptcommonim.message.recall.manager;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.android.ptcommonim.base.manager.a;
import com.meituan.android.ptcommonim.base.network.BaseApiRetrofitService;
import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.video.utils.g;
import com.meituan.android.ptcommonim.video.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.b;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    IMMessage b;
    Context c;
    Activity d;
    CountDownTimer e;
    boolean f;
    c g;
    private PTIMCommonBean h;
    private boolean i;

    private static boolean a(IMMessage iMMessage) {
        return iMMessage == null;
    }

    public a(Context context, PTIMCommonBean pTIMCommonBean, IMMessage iMMessage) {
        Object[] objArr = {context, pTIMCommonBean, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e754d7962b7093546ffef01771da8c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e754d7962b7093546ffef01771da8c4");
            return;
        }
        this.i = true;
        this.f = false;
        this.h = pTIMCommonBean;
        this.b = iMMessage;
        this.c = context;
        SessionFragment a2 = b.a(context);
        if (a2 != null) {
            this.d = a2.getActivity();
        }
    }

    public static boolean a(View view, String str) {
        EditText editText;
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4cb7b1c316666dc6ac1e2b0eeb1e874", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4cb7b1c316666dc6ac1e2b0eeb1e874")).booleanValue();
        }
        com.meituan.android.ptcommonim.protocol.util.a.a("ptcommonimbus-logan-tag", "PTIMRecallManager ptImReeditMessage：" + str);
        if (view != null && !TextUtils.isEmpty(str) && str.contains("ptim_withdraw_reedit")) {
            String b = q.a(view.getContext(), "cip_pt_commonimbus_recall").b(str.substring(str.indexOf("ptim_withdraw_reedit") + 20, str.length()), "");
            if (!TextUtils.isEmpty(b) && (editText = ((com.sankuai.xm.imui.common.panel.plugin.b) b.a(view, com.sankuai.xm.imui.common.panel.plugin.b.class)).getEditText()) != null) {
                editText.setText(((Object) editText.getText()) + b);
                editText.setSelection(editText.getText().length());
                return true;
            }
        }
        return false;
    }

    public static String a(Context context, com.sankuai.xm.imui.session.entity.b<EventMessage> bVar) {
        String str;
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e83de441798cf67f02557b8ac46dd05", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e83de441798cf67f02557b8ac46dd05");
        }
        com.meituan.android.ptcommonim.base.manager.a.a();
        a.C0356a b = com.meituan.android.ptcommonim.base.manager.a.b();
        if (bVar == null || bVar.a() == null || context == null) {
            return "";
        }
        if (!TextUtils.equals(String.valueOf(IMClient.a().k()), String.valueOf(bVar.a().getFromUid()))) {
            if (bVar.a().getCategory() == 3 && bVar.e() == 15 && b != null && b.b == PTIMCommonBean.UserType.TYPE_C) {
                JsonObject jsonObject = JsonHelper.toJsonObject(bVar.a().getExtension());
                String string = JsonHelper.getString(jsonObject, "cancelOperator");
                String string2 = JsonHelper.getString(jsonObject, AgainManager.EXTRA_POI_NAME);
                if (TextUtils.isEmpty(string2)) {
                    str = "对方";
                } else {
                    str = string2 + "撤回了一条消息";
                }
                if (!TextUtils.equals(string, "USER") || TextUtils.equals(str, bVar.a().getText())) {
                    return "";
                }
                bVar.a().setText(str);
                IMClient.a().a((IMMessage) bVar.a(), false, (IMClient.g<IMMessage>) null);
                return "";
            }
            return "";
        }
        com.meituan.android.ptcommonim.protocol.util.a.a("ptcommonimbus-logan-tag", "PTIMRecallManager ptImChangeEventMessageText：" + bVar.toString());
        String valueOf = String.valueOf(bVar.a().getMsgId());
        if (!a(bVar.i(), com.meituan.android.ptcommonim.base.manager.b.a().e())) {
            if (TextUtils.isEmpty(q.a(context, "cip_pt_commonimbus_recall").b(valueOf, ""))) {
                return "";
            }
            return "你撤回了一条消息 [重新编辑|ptim_withdraw_reedit" + bVar.a().getMsgId() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
        q.a(context, "cip_pt_commonimbus_recall").b(valueOf);
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.meituan.android.ptcommonim.message.recall.manager.a$1] */
    public final void a() {
        HashMap hashMap;
        Map<String, Object> map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38b3e86240825feacf2c682a1f29cab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38b3e86240825feacf2c682a1f29cab0");
            return;
        }
        Map<String, String> d = com.meituan.android.ptcommonim.base.manager.b.a().d();
        if (d == null || d.isEmpty() || !d.containsKey("default") || a(this.b)) {
            return;
        }
        if (a(this.b.getSts(), d.get("default"))) {
            com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_withdraw_button", "ptim_operation_withdraw_button_failed", "超过撤回时效，消息无法撤回");
            com.meituan.android.ptcommonim.base.util.b.a(this.c, "已超时，消息无法撤回");
            return;
        }
        if (!this.f) {
            this.f = true;
            this.e = new CountDownTimer(15000L, 1000L) { // from class: com.meituan.android.ptcommonim.message.recall.manager.a.1
                public static ChangeQuickRedirect a;

                {
                    super(15000L, 1000L);
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe4e4ecf13da764bb8f737f9d646b97e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe4e4ecf13da764bb8f737f9d646b97e");
                    } else if (j <= 14000) {
                        if (a.this.f) {
                            if (com.meituan.android.ptcommonim.video.utils.a.a(a.this.d)) {
                                if (a.this.g == null) {
                                    a.this.g = new c(a.this.d, 2, true);
                                    a.this.g.a(a.this.c.getResources().getString(R.string.ptim_commonbus_recall_message));
                                    c cVar = a.this.g;
                                    Object[] objArr3 = {Integer.valueOf((int) R.drawable.ptim_commonbus_recall_dialog_bg)};
                                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c0359bf8394628e8f7206d7a20baa8dd", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c0359bf8394628e8f7206d7a20baa8dd");
                                    } else {
                                        cVar.c.setBackgroundResource(R.drawable.ptim_commonbus_recall_dialog_bg);
                                    }
                                }
                                if (a.this.g.a()) {
                                    return;
                                }
                                a.this.g.a(a.this.d);
                            }
                        } else if (a.this.e != null) {
                            a.this.e.onFinish();
                            a.this.e.cancel();
                        }
                    }
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5c848c743d35537dbab48d0def435d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5c848c743d35537dbab48d0def435d6");
                    } else if (a.this.g != null) {
                        a.this.g.b();
                    }
                }
            }.start();
            com.meituan.android.ptcommonim.base.network.a a2 = com.meituan.android.ptcommonim.base.network.a.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2acaf1e6f1f5f62c388f4ca54f795ef", RobustBitConfig.DEFAULT_VALUE)) {
                hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2acaf1e6f1f5f62c388f4ca54f795ef");
            } else {
                com.meituan.android.ptcommonim.base.manager.a.a();
                a.C0356a b = com.meituan.android.ptcommonim.base.manager.a.b();
                HashMap hashMap2 = new HashMap();
                if (this.c != null && b != null) {
                    int i = b.b == PTIMCommonBean.UserType.TYPE_B ? 3 : 2;
                    hashMap2.put("access-token", b.a);
                    hashMap2.put("token-type", Integer.valueOf(i));
                }
                hashMap = hashMap2;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e9ef36bcd8c80b432904065acba5044", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e9ef36bcd8c80b432904065acba5044");
            } else if (a(this.b)) {
                com.meituan.android.ptcommonim.protocol.util.a.a("ptcommonimbus-logan-tag", "getBodyMap:msg is illegal");
                map = null;
            } else {
                IMMessage iMMessage = this.b;
                HashMap hashMap3 = new HashMap();
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                hashMap4.put("force", Boolean.FALSE);
                hashMap4.put("chatType", MessageUtils.categoryToPushChatType(iMMessage.getCategory(), iMMessage.getPubCategory()));
                hashMap4.put("fromName", IMClient.a().l());
                hashMap4.put("fromUid", Long.valueOf(IMClient.a().k()));
                hashMap4.put("msgIdUidList", a(Long.valueOf(iMMessage.getMsgId()), String.valueOf(IMClient.a().k())));
                hashMap4.put("withdrawReason", "");
                hashMap4.put("extensionList", a(Long.valueOf(iMMessage.getMsgId()), iMMessage.getExtension()));
                hashMap4.put("msgInfoData", JsonHelper.toJsonString(iMMessage));
                hashMap4.put("administrator", Boolean.FALSE);
                hashMap5.put("channels", Arrays.asList(Short.valueOf(iMMessage.getChannel())));
                hashMap5.put("appIds", Arrays.asList(Short.valueOf(IMClient.a().g())));
                hashMap3.put("withdrawRequest", hashMap4);
                hashMap3.put("accessData", hashMap5);
                map = hashMap3;
            }
            Object[] objArr4 = {hashMap, map};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.ptcommonim.base.network.a.a;
            (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "08029a049ae00fc074a8a7a044e0dbc5", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "08029a049ae00fc074a8a7a044e0dbc5") : ((BaseApiRetrofitService) a2.b.a(BaseApiRetrofitService.class)).recallMessage(hashMap, map)).a(new f<BaseDataEntity>() { // from class: com.meituan.android.ptcommonim.message.recall.manager.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<BaseDataEntity> call, Response<BaseDataEntity> response) {
                    Object[] objArr5 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8a264fc68965601c732805d449a62015", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8a264fc68965601c732805d449a62015");
                        return;
                    }
                    if (response != null && response.e() != null && response.e().code == 0) {
                        com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_withdraw_button", "ptim_operation_withdraw_button_success");
                        if (a.this.b instanceof TextMessage) {
                            TextMessage textMessage = (TextMessage) a.this.b;
                            q.a(a.this.c, "cip_pt_commonimbus_recall").a(String.valueOf(textMessage.getMsgId()), textMessage.getText());
                            q.a(a.this.c, "cip_pt_commonimbus_recall").a("cip_recall", a.this.b.getSts());
                        }
                    } else {
                        com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_withdraw_button", "ptim_operation_withdraw_button_failed", "接口response异常");
                        com.meituan.android.ptcommonim.base.util.b.a(a.this.c, "撤回失败，请重试~");
                    }
                    a.this.f = false;
                    if (a.this.e != null) {
                        a.this.e.onFinish();
                        a.this.e.cancel();
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<BaseDataEntity> call, Throwable th) {
                    Object[] objArr5 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "49f33be28df2514212cbfcbcb5c498c1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "49f33be28df2514212cbfcbcb5c498c1");
                        return;
                    }
                    com.meituan.android.ptcommonim.protocol.monitor.a.a("ptim_operation_withdraw_button", "ptim_operation_withdraw_button_failed", "接口异常");
                    com.meituan.android.ptcommonim.base.util.b.a(a.this.c, "撤回失败，请重试~");
                    a.this.f = false;
                    if (a.this.e != null) {
                        a.this.e.onFinish();
                        a.this.e.cancel();
                    }
                }
            });
        }
        PTIMCommonBean pTIMCommonBean = this.h;
        IMMessage iMMessage2 = this.b;
        Object[] objArr5 = {pTIMCommonBean, iMMessage2, "撤回"};
        ChangeQuickRedirect changeQuickRedirect5 = g.a;
        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "21f8023c039a525c74c1da3452171998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "21f8023c039a525c74c1da3452171998");
        } else {
            HashMap hashMap6 = new HashMap();
            Map<String, Object> a3 = g.a(pTIMCommonBean, iMMessage2);
            a3.put("button_name", "撤回");
            hashMap6.putAll(a3);
            Statistics.getChannel("group").writeModelClick("pt_common_im_page", "b_group_8iqftkev_mc", hashMap6, "c_group_74zpfj6k");
        }
        com.meituan.android.ptcommonim.protocol.util.a.a("ptcommonimbus-logan-tag", "PTIMRecallManager ptImGoRecallMessage：" + this.b.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.ptcommonim.message.recall.manager.a.b():boolean");
    }

    public static boolean a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2070723d3e2576eedcfe218a92abfb3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2070723d3e2576eedcfe218a92abfb3")).booleanValue();
        }
        try {
            return new Date().getTime() - j > NumberUtils.parseLong(str, 0L) * 1000;
        } catch (Exception unused) {
            return false;
        }
    }

    private JsonArray a(Number number, String str) {
        Object[] objArr = {number, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3151e23a9108ba149cb755aea7d7fb37", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3151e23a9108ba149cb755aea7d7fb37");
        }
        JsonArray jsonArray = new JsonArray();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("key", number);
        jsonObject.addProperty("value", str);
        jsonArray.add(jsonObject);
        return jsonArray;
    }
}
