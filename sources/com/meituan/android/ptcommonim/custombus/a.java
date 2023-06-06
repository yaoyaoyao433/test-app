package com.meituan.android.ptcommonim.custombus;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.ptcommonim.PTSessionFragmentV2;
import com.meituan.android.ptcommonim.model.PTSessionInfo;
import com.meituan.android.ptcommonim.pageadapter.v2.PTSendPanelAdapterV2;
import com.meituan.android.ptcommonim.pageadapter.widget.e;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.coredata.bean.DataMessage;
import com.sankuai.xm.coredata.processor.a;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements a.InterfaceC1380a {
    public static ChangeQuickRedirect a;
    final PTSessionFragmentV2 b;
    public volatile IMMessage c;
    private final SessionId d;
    private final Handler e;

    @Override // com.sankuai.xm.coredata.processor.a.InterfaceC1380a
    public final void a(int i, DataMessage dataMessage) {
    }

    public a(PTSessionFragmentV2 pTSessionFragmentV2, PTSessionInfo.CustomerServiceInfo customerServiceInfo) {
        Object[] objArr = {pTSessionFragmentV2, customerServiceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4df23d4f8be2ed9704d79c71de40488", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4df23d4f8be2ed9704d79c71de40488");
            return;
        }
        this.e = new Handler(Looper.getMainLooper());
        this.b = pTSessionFragmentV2;
        this.d = pTSessionFragmentV2.i();
        Object[] objArr2 = {customerServiceInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f9c7d0fceccf6122fe7c449ed2cb13a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f9c7d0fceccf6122fe7c449ed2cb13a");
        } else if (customerServiceInfo == null || TextUtils.isEmpty(customerServiceInfo.info)) {
        } else {
            a(customerServiceInfo.info, true);
        }
    }

    @Override // com.sankuai.xm.coredata.processor.a.InterfaceC1380a
    public final void a(List<DataMessage> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7d1c1c821e6288e18acdf8d667689fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7d1c1c821e6288e18acdf8d667689fe");
        } else if (!this.b.isAdded() || CollectionUtils.isEmpty(list) || list.get(0) == null) {
        } else {
            JsonObject jsonObject = (JsonObject) JsonHelper.fromJson(new String(list.get(0).getData()), JsonObject.class);
            if (a(this.d, jsonObject)) {
                JsonObject jsonObject2 = JsonHelper.getJsonObject(jsonObject, "data");
                switch (JsonHelper.getInt(jsonObject, "code", -1)) {
                    case 1000200:
                        if (this.c != null) {
                            IMUIManager.a().a(this.c);
                            this.c = null;
                            return;
                        }
                        return;
                    case 1000201:
                        a(JsonHelper.getString(jsonObject2, "userTips"), this.c == null);
                        return;
                    case 1000204:
                        PTSessionFragmentV2 pTSessionFragmentV2 = this.b;
                        Object[] objArr2 = {"聊天已结束，退出再进入可重新发起会话"};
                        ChangeQuickRedirect changeQuickRedirect2 = PTSessionFragmentV2.e;
                        if (PatchProxy.isSupport(objArr2, pTSessionFragmentV2, changeQuickRedirect2, false, "9417f1da565c65b8304b16a02495b018", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, pTSessionFragmentV2, changeQuickRedirect2, false, "9417f1da565c65b8304b16a02495b018");
                        } else if (pTSessionFragmentV2.f != null) {
                            PTSendPanelAdapterV2 pTSendPanelAdapterV2 = pTSessionFragmentV2.f;
                            Object[] objArr3 = {"聊天已结束，退出再进入可重新发起会话"};
                            ChangeQuickRedirect changeQuickRedirect3 = PTSendPanelAdapterV2.b;
                            if (PatchProxy.isSupport(objArr3, pTSendPanelAdapterV2, changeQuickRedirect3, false, "33b998a50e9719660da4fb268c40b81e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, pTSendPanelAdapterV2, changeQuickRedirect3, false, "33b998a50e9719660da4fb268c40b81e");
                            } else if (!TextUtils.isEmpty("聊天已结束，退出再进入可重新发起会话")) {
                                pTSendPanelAdapterV2.a(true, "聊天已结束，退出再进入可重新发起会话");
                            }
                        }
                        e.a(this.b.getContext());
                        Context context = this.b.getContext();
                        Object[] objArr4 = {context, "聊天已结束，退出再进入可重新发起会话", "-999"};
                        ChangeQuickRedirect changeQuickRedirect4 = f.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "3a17ae14704f5947253aacc23f27b699", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "3a17ae14704f5947253aacc23f27b699");
                            return;
                        }
                        Map<String, Object> a2 = f.a(context);
                        a2.put("item_title", "聊天已结束，退出再进入可重新发起会话");
                        a2.put("button_name", "-999");
                        Statistics.getChannel("group").writeModelView("pt_common_im_page", "b_group_zjg5qjc1_mv", a2, "c_group_hjkzttqg");
                        return;
                    case 2000901:
                        LimitMessage limitMessage = (LimitMessage) JsonHelper.fromJson((JsonElement) jsonObject2, (Class<Object>) LimitMessage.class);
                        if (limitMessage != null && limitMessage.isValid() && d.b(this.d, limitMessage)) {
                            d.a(this.d, limitMessage);
                            EventMessage b = com.sankuai.xm.imui.common.util.c.b(limitMessage.userTips);
                            if (limitMessage.alwaysShow == 1) {
                                SessionId sessionId = this.d;
                                Object[] objArr5 = {sessionId, b};
                                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.ptcommonim.utils.e.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "629e256af88ceee8241e72ae36ae3396", RobustBitConfig.DEFAULT_VALUE)) {
                                    IMMessage iMMessage = (IMMessage) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "629e256af88ceee8241e72ae36ae3396");
                                    return;
                                } else {
                                    com.meituan.android.ptcommonim.utils.e.a(sessionId, b, null);
                                    return;
                                }
                            }
                            com.meituan.android.ptcommonim.utils.e.a(this.d, b);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private boolean a(SessionId sessionId, JsonObject jsonObject) {
        Object[] objArr = {sessionId, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c86993eb5b3e82a9a6cc29069dbdf6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c86993eb5b3e82a9a6cc29069dbdf6")).booleanValue();
        }
        try {
            if (sessionId.d() == JsonHelper.getInt(jsonObject, "data/channel", 0)) {
                if (sessionId.b() == JsonHelper.getLong(jsonObject, "data/chatID", 0L)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c1ac94ebfad7d2063d5ce9e4b7af26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c1ac94ebfad7d2063d5ce9e4b7af26");
            return;
        }
        this.b.a(str);
        EventMessage eventMessage = new EventMessage();
        eventMessage.setText(str);
        eventMessage.setType("event_type_lining");
        if (z) {
            this.c = com.meituan.android.ptcommonim.utils.e.a(this.d, eventMessage, new AnonymousClass1());
            return;
        }
        IMMessage iMMessage = this.c;
        if (iMMessage != null) {
            a(b.a(this, iMMessage));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.ptcommonim.custombus.a$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends IMClient.g<Integer> {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.sankuai.xm.im.IMClient.g
        public final /* synthetic */ void a(Integer num) {
            Object[] objArr = {num};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91198b80ec5161de7edb23be5912c49e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91198b80ec5161de7edb23be5912c49e");
            } else {
                a.this.a(c.a(this));
            }
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1) {
            Object[] objArr = {anonymousClass1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3873e7d513a8ab1d4e85235452a96027", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3873e7d513a8ab1d4e85235452a96027");
            } else {
                a.this.b.b(a.this.c.getMsgUuid());
            }
        }
    }

    void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e0bc658715e50fe98d564da822f1deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e0bc658715e50fe98d564da822f1deb");
        } else {
            this.e.post(runnable);
        }
    }
}
