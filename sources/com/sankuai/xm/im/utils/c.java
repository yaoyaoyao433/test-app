package com.sankuai.xm.im.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.cache.bean.GroupDBMessage;
import com.sankuai.xm.im.cache.bean.PersonalDBMessage;
import com.sankuai.xm.im.cache.bean.PubDBMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static List<IMMessage> a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e24f5d36c8cab0856ae86065c0ea346", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e24f5d36c8cab0856ae86065c0ea346");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(iMMessage);
        return arrayList;
    }

    public static List<com.sankuai.xm.im.session.entry.a> a(com.sankuai.xm.im.session.entry.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8458ff4e08a51c63382b666c2c1a117", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8458ff4e08a51c63382b666c2c1a117");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        return arrayList;
    }

    public static void a(List<? extends Message> list, boolean z) {
        Object[] objArr = {list, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73feefc01707de167210a6963001b5ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73feefc01707de167210a6963001b5ec");
        } else {
            Collections.sort(list, new Comparator<Message>() { // from class: com.sankuai.xm.im.utils.c.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Message message, Message message2) {
                    Message message3 = message;
                    Message message4 = message2;
                    Object[] objArr2 = {message3, message4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dc3e20b5c9b1ca348a9888ff8f82e7a", 6917529027641081856L)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dc3e20b5c9b1ca348a9888ff8f82e7a")).intValue();
                    }
                    if (message3.getSts() <= 0) {
                        message3.setSts(message3.getCts());
                    }
                    if (message4.getSts() <= 0) {
                        message4.setSts(message4.getCts());
                    }
                    if (r1) {
                        if (message3.getSts() < message4.getSts()) {
                            return 1;
                        }
                        if (message3.getSts() == message4.getSts()) {
                            if (message3.getMsgId() < message4.getMsgId()) {
                                return 1;
                            }
                            return message3.getMsgId() == message4.getMsgId() ? 0 : -1;
                        }
                        return -1;
                    } else if (message4.getSts() < message3.getSts()) {
                        return 1;
                    } else {
                        if (message4.getSts() != message3.getSts() || message3.getMsgId() < message4.getMsgId()) {
                            return -1;
                        }
                        return message3.getMsgId() == message4.getMsgId() ? 0 : 1;
                    }
                }
            });
        }
    }

    public static void a(List<? extends Message> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82ca5ebc5d5e62df0da7a60d4d6e7afd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82ca5ebc5d5e62df0da7a60d4d6e7afd");
        } else if (com.sankuai.xm.base.util.b.a(list) || list.size() == 1) {
        } else {
            HashSet hashSet = new HashSet();
            Iterator<? extends Message> it = list.iterator();
            while (it.hasNext()) {
                Message next = it.next();
                if (hashSet.contains(next.getMsgUuid())) {
                    it.remove();
                } else {
                    hashSet.add(next.getMsgUuid());
                }
            }
        }
    }

    public static void a(List<? extends Message> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "402f79c34e35ea8efc5070d2ffd88649", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "402f79c34e35ea8efc5070d2ffd88649");
        } else if (com.sankuai.xm.base.util.b.a(list)) {
        } else {
            Iterator<? extends Message> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().getMsgUuid())) {
                    it.remove();
                    return;
                }
            }
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "893500dd15689e0f36f66594d892f0e0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "893500dd15689e0f36f66594d892f0e0")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b7b161b869854e5e359743f3ff489bf", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b7b161b869854e5e359743f3ff489bf")).intValue();
        }
        if (TextUtils.equals(PersonalDBMessage.TABLE_NAME, str)) {
            return z2 ? 9 : 1;
        } else if (TextUtils.equals(GroupDBMessage.TABLE_NAME, str)) {
            return 2;
        } else {
            if (TextUtils.equals(PubDBMessage.TABLE_NAME, str)) {
                if (z2) {
                    return z ? 10 : 11;
                }
                return 3;
            }
            return 0;
        }
    }
}
