package com.meituan.android.legwork.common.im;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.android.legwork.bean.im.insertmassage.ImInsertMessageView;
import com.meituan.android.legwork.ui.fragment.IMSessionFragment;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.SessionFragment;
import com.sankuai.xm.imui.session.SessionProvider;
import java.util.List;
import rx.d;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements e {
    public static ChangeQuickRedirect a;
    IMInitializeData b;
    public rx.subscriptions.b c;
    public IMSessionFragment d;

    public boolean a() {
        return true;
    }

    public final int a(Context context, IMInitializeData iMInitializeData) {
        Object[] objArr = {context, iMInitializeData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b0e683871ab8af06ea42cec996dc75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b0e683871ab8af06ea42cec996dc75")).intValue();
        }
        if (context == null || iMInitializeData == null) {
            return -1;
        }
        this.b = iMInitializeData;
        return a(context, SessionId.a(iMInitializeData.peerId, 0L, 1, this.b.peerAppId, (short) 1013), new SessionProvider() { // from class: com.meituan.android.legwork.common.im.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.session.SessionProvider
            public final SessionFragment createSessionFragment() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "943a874394f6d2e2e3ef2cd9c1b20a39", RobustBitConfig.DEFAULT_VALUE)) {
                    return (SessionFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "943a874394f6d2e2e3ef2cd9c1b20a39");
                }
                IMSessionFragment iMSessionFragment = new IMSessionFragment();
                iMSessionFragment.b = a.this.b;
                return iMSessionFragment;
            }
        });
    }

    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01746c6998dfbd7f146e4c509efbaddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01746c6998dfbd7f146e4c509efbaddf");
            return;
        }
        if (this.c == null) {
            this.c = new rx.subscriptions.b();
        }
        this.c.a(kVar);
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "538c2fcbaba0839836a419b6f6a0ec7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "538c2fcbaba0839836a419b6f6a0ec7e");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1) + "师傅";
    }

    public final k a(String str, String str2, final SessionId sessionId) {
        int i;
        d.a cVar;
        Object[] objArr = {str, str2, sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b9f529f35a8a3a69bbbea80e73bb8de", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b9f529f35a8a3a69bbbea80e73bb8de");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return new k() { // from class: com.meituan.android.legwork.common.im.a.3
                @Override // rx.k
                public final boolean isUnsubscribed() {
                    return true;
                }

                @Override // rx.k
                public final void unsubscribe() {
                }
            };
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-1");
        sb.append(CommonConstant.Symbol.MINUS);
        sb.append(str2);
        Object[] objArr2 = {this, sb};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6dc8a5f87dae9af66c00102144e7f6d7", RobustBitConfig.DEFAULT_VALUE)) {
            i = 1;
            cVar = (d.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6dc8a5f87dae9af66c00102144e7f6d7");
        } else {
            i = 1;
            cVar = new c(this, sb);
        }
        rx.d a2 = rx.d.a(cVar);
        Object[] objArr3 = new Object[i];
        objArr3[0] = str;
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        return rx.d.a(new com.meituan.android.legwork.net.subscriber.a<List<ImInsertMessageView>>() { // from class: com.meituan.android.legwork.common.im.a.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final /* synthetic */ void a(List<ImInsertMessageView> list) {
                List<ImInsertMessageView> list2 = list;
                Object[] objArr4 = {list2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "14b58287832d5fe1163c595b6a6ed82b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "14b58287832d5fe1163c595b6a6ed82b");
                } else if (list2 != null && list2.size() > 0) {
                    for (ImInsertMessageView imInsertMessageView : list2) {
                        if (imInsertMessageView != null && imInsertMessageView.type == 1 && !a.this.b(sb.toString()) && !TextUtils.isEmpty(imInsertMessageView.title) && !TextUtils.isEmpty(imInsertMessageView.content) && !TextUtils.isEmpty(imInsertMessageView.buttonText)) {
                            a aVar = a.this;
                            SessionId sessionId2 = sessionId;
                            String imInsertMessageView2 = imInsertMessageView.toString();
                            String sb2 = sb.toString();
                            Object[] objArr5 = {sessionId2, 2, imInsertMessageView2, sb2};
                            ChangeQuickRedirect changeQuickRedirect5 = a.a;
                            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "a520a361b5105ea8db768bc2681868fd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "a520a361b5105ea8db768bc2681868fd");
                            } else {
                                GeneralMessage a3 = com.sankuai.xm.imui.common.util.c.a(imInsertMessageView2.getBytes(), 2);
                                a3.setSessionId(sessionId2);
                                a3.setMsgStatus(7);
                                a3.setMsgOppositeStatus(0);
                                a3.setSts(com.meituan.android.time.c.b());
                                a3.setMsgUuid(sb2);
                                a3.setFromUid(sessionId2.b());
                                IMUIManager.a().a(a3, false, null);
                            }
                        }
                    }
                }
            }

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final void a(boolean z, int i2, String str3) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), str3};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "195ef8ec566ffbc0c5169bdae7f9d4d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "195ef8ec566ffbc0c5169bdae7f9d4d8");
                    return;
                }
                x.e("BaseIMManager.getImInsertMessageList()", "errCode:" + i2 + ",msg: " + str3);
            }
        }, a2.c(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d6203b5cfd6a0522180cb33684a62fbb", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.g) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d6203b5cfd6a0522180cb33684a62fbb") : new d(str)).b(rx.schedulers.a.e()).a(rx.schedulers.a.e()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4230bdf51329aa4471fcad61f3a367d8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4230bdf51329aa4471fcad61f3a367d8")).booleanValue() : IMClient.a().a(1, str, true) != null;
    }
}
