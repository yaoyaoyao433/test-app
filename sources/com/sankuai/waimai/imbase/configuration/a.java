package com.sankuai.waimai.imbase.configuration;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.base.lifecycle.d;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.cache.DBProxy;
import com.sankuai.xm.im.cache.bean.DBSession;
import com.sankuai.xm.im.message.bean.EmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.NoticeMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.session.c;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.common.util.e;
import com.sankuai.xm.imui.session.SessionProvider;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.ui.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public a() {
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0ef8e57bbf81b6922161adc1d4a7131", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0ef8e57bbf81b6922161adc1d4a7131") : C0957a.a;
    }

    public final void a(short s, int i) {
        Object[] objArr = {Short.valueOf(s), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef153b45917065950eb011087db542f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef153b45917065950eb011087db542f");
        } else {
            com.sankuai.xm.ui.a.a().a(s, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.configuration.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0957a {
        private static final a a = new a();
    }

    public final void a(final IMClient.g<b> gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0bf24a44313a5f54e5b7499338db9bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0bf24a44313a5f54e5b7499338db9bc");
            return;
        }
        final com.sankuai.xm.ui.a a2 = com.sankuai.xm.ui.a.a();
        Object[] objArr2 = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.ui.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8ff9c64d17ef3ccd80fe813c6f856331", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8ff9c64d17ef3ccd80fe813c6f856331");
        } else if (gVar != null) {
            IMClient a3 = IMClient.a();
            IMClient.g<com.sankuai.xm.im.session.entry.a> gVar2 = new IMClient.g<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.xm.ui.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(com.sankuai.xm.im.session.entry.a aVar) {
                    IMClient.g gVar3;
                    String str;
                    com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                    Object[] objArr3 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f02107392e2dc1c25e255fea9a8b1337", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f02107392e2dc1c25e255fea9a8b1337");
                        return;
                    }
                    String str2 = null;
                    b bVar = null;
                    str2 = null;
                    if (aVar2 == null) {
                        gVar3 = gVar;
                    } else {
                        gVar3 = gVar;
                        Object[] objArr4 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.ui.chatbridge.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "5ef81ec96cde39b887ed1230f2057fa6", 6917529027641081856L)) {
                            bVar = (b) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "5ef81ec96cde39b887ed1230f2057fa6");
                        } else {
                            b bVar2 = new b();
                            if (aVar2 != null) {
                                bVar2.a = aVar2.b.getCategory();
                                bVar2.i = aVar2.b.getMsgType();
                                bVar2.j = aVar2.b.getMsgStatus();
                                bVar2.c = aVar2.d;
                                bVar2.e = aVar2.b;
                                bVar2.k = aVar2.b.getFromName();
                                bVar2.g = aVar2.b.getMsgUuid();
                                bVar2.b = aVar2.b.getChatId();
                                bVar2.h = aVar2.b.getFromUid();
                                bVar2.f = aVar2.b.getSts();
                                bVar2.n = aVar2.b.getGroupName();
                                bVar2.m = aVar2.b.getPeerAppId();
                                bVar2.o = aVar2.b.getPeerUid();
                                bVar2.l = aVar2.b.getExtension();
                                Object[] objArr5 = {bVar2};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.ui.chatbridge.a.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "af2af0674a23239b24888948e8a22044", 6917529027641081856L)) {
                                    str = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "af2af0674a23239b24888948e8a22044");
                                } else {
                                    IMMessage iMMessage = bVar2.e;
                                    Application a4 = d.d().a();
                                    Object[] objArr6 = {iMMessage, a4};
                                    ChangeQuickRedirect changeQuickRedirect6 = e.a;
                                    if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "ab051d87d119eb811a58a67b053579c6", 6917529027641081856L)) {
                                        str2 = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "ab051d87d119eb811a58a67b053579c6");
                                    } else if (iMMessage != null && a4 != null) {
                                        int msgType = iMMessage.getMsgType();
                                        if (msgType == 17) {
                                            String summary = ((GeneralMessage) iMMessage).getSummary();
                                            if (TextUtils.isEmpty(summary)) {
                                                if (TextUtils.isEmpty(iMMessage.getCompatibleContent())) {
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_general);
                                                } else {
                                                    str2 = iMMessage.getCompatibleContent();
                                                }
                                            } else {
                                                str2 = e.a(summary);
                                            }
                                        } else if (msgType != 19) {
                                            switch (msgType) {
                                                case 1:
                                                    str2 = e.a(((TextMessage) iMMessage).getText());
                                                    break;
                                                case 2:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_voice);
                                                    break;
                                                case 3:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_video);
                                                    break;
                                                case 4:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_img);
                                                    break;
                                                case 5:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_calendar);
                                                    break;
                                                case 6:
                                                case 7:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_link);
                                                    break;
                                                case 8:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_file);
                                                    break;
                                                case 9:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_location);
                                                    break;
                                                case 10:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_vcard);
                                                    break;
                                                case 11:
                                                    str2 = "[" + ((EmotionMessage) iMMessage).getName() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                                                    break;
                                                case 12:
                                                    str2 = e.a(((EventMessage) iMMessage).getText());
                                                    break;
                                                case 13:
                                                    str2 = a4.getResources().getString(R.string.xm_sdk_msg_template);
                                                    break;
                                                case 14:
                                                    str2 = a4.getString(R.string.xm_sdk_msg_notice) + ((NoticeMessage) iMMessage).getTitle();
                                                    break;
                                                default:
                                                    if (TextUtils.isEmpty(iMMessage.getCompatibleContent())) {
                                                        str2 = a4.getResources().getString(R.string.xm_sdk_msg_unknown_tips);
                                                        break;
                                                    } else {
                                                        str2 = iMMessage.getCompatibleContent();
                                                        break;
                                                    }
                                            }
                                        } else {
                                            String name = ((EmotionMessage) iMMessage).getName();
                                            if (!TextUtils.isEmpty(name)) {
                                                str2 = "[" + name + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                                            } else {
                                                str2 = a4.getResources().getString(R.string.xm_sdk_msg_emotion);
                                            }
                                        }
                                    }
                                    bVar2.p = str2;
                                    str = bVar2.p;
                                }
                                bVar2.p = str;
                                bVar2.q = aVar2.b.getChannel();
                                bVar2.r = aVar2.b.getSID();
                                bVar2.s = aVar2.b.getFromPubId();
                                bVar2.t = aVar2.b.getFromPubName();
                                bVar2.u = aVar2.b.getMsgSource();
                            }
                            bVar = bVar2;
                        }
                    }
                    gVar3.a(bVar);
                }
            };
            Object[] objArr3 = {gVar2};
            ChangeQuickRedirect changeQuickRedirect3 = IMClient.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "f79cb7bb858d38e9f22c6b90a7a638bf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "f79cb7bb858d38e9f22c6b90a7a638bf");
            } else if (a3.a(gVar2)) {
            } else {
                final com.sankuai.xm.im.a a4 = com.sankuai.xm.im.notifier.a.a(gVar2, new com.sankuai.xm.im.session.entry.a(), 1);
                final c cVar = (c) a3.E().a();
                Object[] objArr4 = {a4};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "d801606c0ab327ea30639ca4ccf26c09", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "d801606c0ab327ea30639ca4ccf26c09");
                } else {
                    DBProxy.l().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.session.c.10
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7cc598e83aa513fd859dd2730c583d6a", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7cc598e83aa513fd859dd2730c583d6a");
                                return;
                            }
                            DBSession a5 = DBProxy.l().m.a();
                            if (a5 == null) {
                                a4.onSuccess(null);
                            } else {
                                a4.onSuccess(MessageUtils.dbSessionToSession(a5));
                            }
                        }
                    }), a4);
                }
            }
        }
    }

    public final void a(IMMessage iMMessage, boolean z, IMClient.g<Integer> gVar) {
        Object[] objArr = {iMMessage, (byte) 0, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b50db61560876dab07e2fcc3771657f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b50db61560876dab07e2fcc3771657f9");
        } else {
            com.sankuai.xm.ui.a.a().a(iMMessage, false, null);
        }
    }

    public final void a(short s, com.sankuai.xm.im.desensitization.c cVar) {
        Object[] objArr = {(short) 1013, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5d349efed8589d935c329ecd1c880b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5d349efed8589d935c329ecd1c880b3");
        } else {
            com.sankuai.xm.ui.a.a().a((short) 1013, cVar);
        }
    }

    public final int a(Context context, @NonNull SessionId sessionId, SessionProvider sessionProvider) {
        Object[] objArr = {context, sessionId, sessionProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9f0868e7dc588ceb90803a0e36472f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9f0868e7dc588ceb90803a0e36472f")).intValue() : a(context, sessionId, sessionProvider, (SessionParams) null);
    }

    public final int a(Context context, @NonNull SessionId sessionId, SessionProvider sessionProvider, SessionParams sessionParams) {
        Object[] objArr = {context, sessionId, sessionProvider, sessionParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ef15dafb189d499dd7d0f2dbedddf0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ef15dafb189d499dd7d0f2dbedddf0")).intValue() : com.sankuai.xm.ui.a.a().a(context, sessionId, sessionProvider, sessionParams);
    }

    public final void a(short s, long j, int i, com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar) {
        Object[] objArr = {(short) 1013, new Long(j), 1, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7443886340f7dc24d5ca7014fec3a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7443886340f7dc24d5ca7014fec3a2");
        } else {
            com.sankuai.xm.ui.a.a().a(com.sankuai.xm.im.vcard.d.a(j, 1, (short) 1013), aVar);
        }
    }
}
