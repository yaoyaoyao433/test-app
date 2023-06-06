package com.meituan.android.ptcommonim.model;

import android.text.TextUtils;
import com.meituan.android.ptcommonim.PTIMMgeBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final SessionId b;
    public final PTIMMgeBean c;

    public b(SessionId sessionId, PTIMMgeBean pTIMMgeBean) {
        Object[] objArr = {sessionId, pTIMMgeBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6268611b08222e542ea6641931c324", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6268611b08222e542ea6641931c324");
            return;
        }
        this.b = sessionId;
        this.c = pTIMMgeBean;
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07722bc63483a65e7d7f7c456e187a17", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07722bc63483a65e7d7f7c456e187a17");
        }
        String string = JsonHelper.getString(this.b != null ? this.b.a() : null, "chatType");
        return TextUtils.isEmpty(string) ? "-999" : string;
    }

    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b3266047aa541d96c8b3d54e3e8243", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b3266047aa541d96c8b3d54e3e8243") : a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Short] */
    public final Map<String, Object> a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6ec918c44ddb5080166ba7c308ea6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6ec918c44ddb5080166ba7c308ea6e");
        }
        HashMap hashMap = new HashMap(16);
        if (this.c != null) {
            hashMap.putAll(this.c.a(z));
        }
        hashMap.put(z ? "channel" : "channel_id", this.b != null ? Short.valueOf(this.b.d()) : "-999");
        hashMap.put(z ? "chatType" : "chat_type", a());
        hashMap.put(z ? Message.CHAT_ID : "message_body_id", this.b != null ? Long.valueOf(this.b.b()) : "-999");
        hashMap.put(z ? Message.PEER_UID : "peer_uid", this.b != null ? Long.valueOf(this.b.c()) : "-999");
        hashMap.put(Message.SID, (this.b == null || TextUtils.isEmpty(this.b.g())) ? "-999" : this.b.g());
        return hashMap;
    }
}
