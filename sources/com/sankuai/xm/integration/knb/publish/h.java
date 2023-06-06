package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.MediaMessage;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends c implements IMClient.m {
    public static ChangeQuickRedirect a;
    private IMClient.m h;

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
    }

    public h(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.messagesStatusChange", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb98bf0e477f7e4ca412abc4ae6111f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb98bf0e477f7e4ca412abc4ae6111f8");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.im.IMClient.m
    public final void a(IMMessage iMMessage, Callback<IMMessage> callback) {
        Object[] objArr = {iMMessage, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d146739d43c4948e7a09a6b23a88289e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d146739d43c4948e7a09a6b23a88289e");
        } else {
            this.h.a(iMMessage, callback);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
    public final void onProgress(MediaMessage mediaMessage, double d, double d2) {
        Object[] objArr = {mediaMessage, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1c8b438da7554eb67a0eb409c901b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1c8b438da7554eb67a0eb409c901b9");
        } else {
            this.h.onProgress(mediaMessage, d, d2);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
    public final void a(MediaMessage mediaMessage, int i) {
        Object[] objArr = {mediaMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d55fe51fc35a056192e40b8022a86e27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d55fe51fc35a056192e40b8022a86e27");
        } else {
            this.h.a(mediaMessage, i);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
    public final void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "421469f2595d58c93569cd3056758717", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "421469f2595d58c93569cd3056758717");
        } else {
            this.h.a(iMMessage);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
    public final void onFailure(IMMessage iMMessage, int i) {
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "471244a22b53639ce6e7cc448f142484", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "471244a22b53639ce6e7cc448f142484");
        } else {
            this.h.onFailure(iMMessage, i);
        }
    }

    @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
    public final void a(IMMessage iMMessage, int i) {
        Object[] objArr = {iMMessage, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f47dd24d0cef1531622bd879167a15e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f47dd24d0cef1531622bd879167a15e");
        } else {
            this.h.a(iMMessage, i);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7bcd8bf6b827780c2fbeb668d8100c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7bcd8bf6b827780c2fbeb668d8100c");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "206baaafd1eee4d1f75c48266e47be20", 6917529027641081856L) ? (IMClient.m) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "206baaafd1eee4d1f75c48266e47be20") : new IMClient.m() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
            public final void a(MediaMessage mediaMessage, int i) {
            }

            @Override // com.sankuai.xm.im.IMClient.SendMediaMessageCallback
            public final void onProgress(MediaMessage mediaMessage, double d, double d2) {
            }

            @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
            public final void a(IMMessage iMMessage) {
                Object[] objArr3 = {iMMessage};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fe4badfe5a2d0ba9c9d4ed501101cedd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fe4badfe5a2d0ba9c9d4ed501101cedd");
                    return;
                }
                try {
                    a.a(aVar, iMMessage);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("messagesStatusChange::onSuccess exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
            public final void onFailure(IMMessage iMMessage, int i) {
                Object[] objArr3 = {iMMessage, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b3bae25ca3e868ce761d115f89e06e85", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b3bae25ca3e868ce761d115f89e06e85");
                    return;
                }
                try {
                    a.a(aVar, iMMessage);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("messagesStatusChange::onFailure exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.SendMessageCallback
            public final void a(IMMessage iMMessage, int i) {
                Object[] objArr3 = {iMMessage, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35b3c0461d802eed15f08502de55d669", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35b3c0461d802eed15f08502de55d669");
                    return;
                }
                try {
                    a.a(aVar, iMMessage);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("messagesStatusChange::onStatusChanged exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.im.IMClient.m
            public final void a(IMMessage iMMessage, Callback<IMMessage> callback) {
                Object[] objArr3 = {iMMessage, callback};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "075d67c0ab5de15050640e963e9fee14", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "075d67c0ab5de15050640e963e9fee14");
                } else {
                    callback.onSuccess(iMMessage);
                }
            }
        };
    }
}
