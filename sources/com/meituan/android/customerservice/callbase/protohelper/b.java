package com.meituan.android.customerservice.callbase.protohelper;

import com.google.gson.Gson;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallACK;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallBye;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallProbe;
import com.meituan.android.customerservice.callbase.bean.proto.CSCallReInvite;
import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.pike.PikeClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public com.meituan.android.customerservice.callbase.base.c b;

    public b(com.meituan.android.customerservice.callbase.base.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57eb64b85dec59fd850b536291c4ee0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57eb64b85dec59fd850b536291c4ee0a");
        } else {
            this.b = cVar;
        }
    }

    public final void a(short s, String str, String str2, String str3) {
        Object[] objArr = {Short.valueOf(s), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637d91f6e225fbe63c5fa42518462fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637d91f6e225fbe63c5fa42518462fa1");
            return;
        }
        CSCallACK cSCallACK = new CSCallACK();
        cSCallACK.setCode(s);
        cSCallACK.setReason(str);
        cSCallACK.setSid(str2);
        cSCallACK.setLegid(str3);
        cSCallACK.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
        a(new Gson().toJson(cSCallACK));
    }

    public final void a(MeetingStatusItems[] meetingStatusItemsArr, long j, String str, String str2, HashMap<String, String> hashMap) {
        Object[] objArr = {meetingStatusItemsArr, new Long(j), str, str2, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e07fcbeb1aa77b74b55f74b1aefacd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e07fcbeb1aa77b74b55f74b1aefacd");
            return;
        }
        CSCallReInvite cSCallReInvite = new CSCallReInvite();
        cSCallReInvite.setMbers(meetingStatusItemsArr);
        cSCallReInvite.setGid(j);
        cSCallReInvite.setLegid(str2);
        cSCallReInvite.setSid(str);
        cSCallReInvite.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
        cSCallReInvite.setuData(hashMap);
        a(new Gson().toJson(cSCallReInvite));
    }

    public final void b(short s, String str, String str2, String str3) {
        Object[] objArr = {Short.valueOf(s), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1869531b607f6be52a2e34ee650183", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1869531b607f6be52a2e34ee650183");
            return;
        }
        CSCallBye cSCallBye = new CSCallBye();
        cSCallBye.setCode(s);
        cSCallBye.setReason(str);
        cSCallBye.setSid(str2);
        cSCallBye.setdType(this.b.d());
        cSCallBye.setLegid(str3);
        cSCallBye.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
        a(new Gson().toJson(cSCallBye));
    }

    public final void a(String str, String str2, byte b) {
        Object[] objArr = {str, str2, (byte) 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6feb99a91e6a2839389a7f5465339e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6feb99a91e6a2839389a7f5465339e3");
            return;
        }
        CSCallProbe cSCallProbe = new CSCallProbe();
        cSCallProbe.setSid(str);
        cSCallProbe.setLegid(str2);
        cSCallProbe.setType((byte) 2);
        cSCallProbe.setTs(PikeClient.c.a.a(System.currentTimeMillis()));
        a(new Gson().toJson(cSCallProbe));
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9367d266e78ef51527af86ee59c2feb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9367d266e78ef51527af86ee59c2feb6");
        } else {
            a(str, null);
        }
    }

    public void a(String str, final PikeClient.SendMessageCallback sendMessageCallback) {
        Object[] objArr = {str, sendMessageCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a25b90c8eb51b9637a93f772c3b2de5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a25b90c8eb51b9637a93f772c3b2de5e");
            return;
        }
        com.meituan.android.pike.message.a aVar = new com.meituan.android.pike.message.a();
        aVar.c = str;
        aVar.a(PikeClient.c.a.a(System.currentTimeMillis()));
        final long currentTimeMillis = System.currentTimeMillis();
        final HashMap hashMap = new HashMap();
        hashMap.put("messageId", aVar.b);
        PikeClient.c.a.a(aVar, new PikeClient.SendMessageCallback() { // from class: com.meituan.android.customerservice.callbase.protohelper.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.pike.PikeClient.SendMessageCallback
            public final void onSuccess(com.meituan.android.pike.message.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59ad95f1b0cafffca72f49353f23ae74", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59ad95f1b0cafffca72f49353f23ae74");
                    return;
                }
                if (sendMessageCallback != null) {
                    sendMessageCallback.onSuccess(aVar2);
                }
                Class<?> cls = getClass();
                CallLog.debug(cls, "Send message success id " + aVar2.b);
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(0, (int) (System.currentTimeMillis() - currentTimeMillis), hashMap, "cs_voip_sendmessage_success");
            }

            @Override // com.meituan.android.pike.PikeClient.SendMessageCallback
            public final void onFailure(com.meituan.android.pike.message.a aVar2, int i) {
                Object[] objArr2 = {aVar2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "076a3c74058b49d4c0663d6833fc7d38", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "076a3c74058b49d4c0663d6833fc7d38");
                    return;
                }
                if (sendMessageCallback != null) {
                    sendMessageCallback.onFailure(aVar2, i);
                }
                Class<?> cls = getClass();
                CallLog.error(cls, "Send message fail id = " + aVar2.b);
                com.meituan.android.customerservice.callbase.csmonitor.a.a().a(10001, (int) (System.currentTimeMillis() - currentTimeMillis), hashMap, "cs_voip_sendmessage_success");
            }
        });
    }
}
