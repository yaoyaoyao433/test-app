package com.sankuai.xm.imui.listener;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.im.transfer.download.c;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements IMClient.f, IMClient.i, IMClient.n, IMClient.o, c {
    public static ChangeQuickRedirect a;
    private Context b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7789ca65df3e8846f1f494c7d95818da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7789ca65df3e8846f1f494c7d95818da");
        } else {
            this.b = context.getApplicationContext();
        }
    }

    @Override // com.sankuai.xm.im.IMClient.i
    public final void a(List<IMMessage> list, boolean z) {
        boolean z2;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3db858a52f48bbdfffda7ac9034896", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3db858a52f48bbdfffda7ac9034896");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            HashMap hashMap = new HashMap();
            for (IMMessage iMMessage : list) {
                if (iMMessage != null) {
                    Object[] objArr2 = {iMMessage};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba15748b13c285602f7f86de0f967349", 6917529027641081856L)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba15748b13c285602f7f86de0f967349")).booleanValue();
                    } else {
                        int c = com.sankuai.xm.imui.common.util.c.c(iMMessage) & (-1);
                        if (c != 0) {
                            AtMeInfo atMeInfo = new AtMeInfo();
                            atMeInfo.setGid(iMMessage.getChatId());
                            atMeInfo.setMsgId(iMMessage.getMsgId());
                            atMeInfo.setFromUid(iMMessage.getFromUid());
                            atMeInfo.setFromName(iMMessage.getFromName());
                            atMeInfo.setType(c);
                            atMeInfo.setTimeStamp(iMMessage.getSts());
                            atMeInfo.setUuid(iMMessage.getMsgUuid());
                            ((com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class)).a(atMeInfo);
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        List<IMMessage> list2 = hashMap.get(Short.valueOf(iMMessage.getChannel()));
                        if (list2 == null) {
                            list2 = new ArrayList<>();
                            hashMap.put(Short.valueOf(iMMessage.getChannel()), list2);
                        }
                        list2.add(iMMessage);
                    }
                    Object[] objArr3 = {iMMessage};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b08e28030790326dc8e3b99f26986481", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b08e28030790326dc8e3b99f26986481");
                    } else if (iMMessage != null && !TextUtils.isEmpty(iMMessage.getMsgUuid()) && (iMMessage.getMsgType() == -100 || (iMMessage instanceof EventMessage))) {
                        ((com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class)).a(SessionId.a(iMMessage), iMMessage.getMsgUuid());
                    }
                }
            }
            a(hashMap);
        }
    }

    @Override // com.sankuai.xm.im.transfer.download.c
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6bbb718a620d0ada9310accab4eeb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6bbb718a620d0ada9310accab4eeb6");
            return;
        }
        Iterator<Object> it = b.a().c().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.sankuai.xm.im.transfer.download.c
    public final void a(String str, String str2, int i, String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507f4d37cc2a3a127984af344e38ffdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507f4d37cc2a3a127984af344e38ffdd");
            return;
        }
        Iterator<Object> it = b.a().c().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.sankuai.xm.im.transfer.download.c
    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "163d93d5f030191dd516456dfc3e70c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "163d93d5f030191dd516456dfc3e70c0");
            return;
        }
        Iterator<Object> it = b.a().c().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.sankuai.xm.im.IMClient.f
    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e3de52fc671394e92d71aa7abd8b9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e3de52fc671394e92d71aa7abd8b9b");
            return;
        }
        Iterator<Object> it = b.a().b().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        Intent intent = new Intent("com.sankuai.xm.XM_SESSION_LIST_CHANGE");
        intent.putExtra("status", (short) 0);
        intent.setPackage(this.b.getPackageName());
        com.sankuai.meituan.takeoutnew.util.aop.b.a(this.b, intent);
    }

    @Override // com.sankuai.xm.im.IMClient.f
    public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a9678e7235800be8bb77b55e48b42a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a9678e7235800be8bb77b55e48b42a");
            return;
        }
        com.sankuai.xm.im.utils.a.b("IMClientListenerImpl::onSessionDeleted:: sessionList size = %d", Integer.valueOf(com.sankuai.xm.base.util.b.b(list)));
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b62b366e30e3d7550546eb5244ceb262", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b62b366e30e3d7550546eb5244ceb262");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            for (com.sankuai.xm.im.session.entry.a aVar : list) {
                if (aVar != null) {
                    a(aVar.c());
                }
            }
        }
        Iterator<Object> it = b.a().b().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
        Intent intent = new Intent("com.sankuai.xm.XM_SESSION_LIST_CHANGE");
        intent.putExtra("status", (short) 1);
        intent.setPackage(this.b.getPackageName());
        com.sankuai.meituan.takeoutnew.util.aop.b.a(this.b, intent);
    }

    @Override // com.sankuai.xm.im.IMClient.o
    public final void c(List<com.sankuai.xm.im.session.entry.b> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb110c49e0eb321d0090f5db49805fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb110c49e0eb321d0090f5db49805fa");
        } else if (!com.sankuai.xm.base.util.b.a(list)) {
            for (com.sankuai.xm.im.session.entry.b bVar : list) {
                if (bVar != null && bVar.c <= 0) {
                    a(bVar.b);
                }
            }
        }
    }

    private void a(Map<Short, List<IMMessage>> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159d9603245aaea62d316e57f4a9b479", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159d9603245aaea62d316e57f4a9b479");
        } else if (map.size() > 0) {
            for (Map.Entry<Short, List<IMMessage>> entry : map.entrySet()) {
                short shortValue = entry.getKey().shortValue();
                ((com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class)).a(shortValue, entry.getValue());
                if (shortValue != -1) {
                    ((com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class)).a((short) -1, entry.getValue());
                }
            }
        }
    }

    @Override // com.sankuai.xm.im.IMClient.n
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e6943488c0b588bf927aa0ddd9ed990", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e6943488c0b588bf927aa0ddd9ed990");
            return;
        }
        Intent intent = new Intent("com.sankuai.xm.XM_REMOTE_SYNC");
        intent.putExtra("status", (short) 0);
        intent.setPackage(this.b.getPackageName());
        com.sankuai.meituan.takeoutnew.util.aop.b.a(this.b, intent);
    }

    @Override // com.sankuai.xm.im.IMClient.n
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b44991af047977e8d2a48548b910360c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b44991af047977e8d2a48548b910360c");
            return;
        }
        Intent intent = new Intent("com.sankuai.xm.XM_REMOTE_SYNC");
        intent.putExtra("status", (short) 1);
        intent.setPackage(this.b.getPackageName());
        com.sankuai.meituan.takeoutnew.util.aop.b.a(this.b, intent);
    }

    private void a(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a525fe5f6e6cb2e187f0fbb85f8654", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a525fe5f6e6cb2e187f0fbb85f8654");
        } else if (sessionId.e == 2) {
            ((com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class)).a(sessionId);
        }
    }
}
