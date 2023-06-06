package com.sankuai.xm.im.message.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.im.utils.a;
import com.sankuai.xm.im.utils.c;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class IMMessage extends Message {
    public static final String MSG_COMPATIBLE_TEXT = "text";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mDuplicateMsg;
    private int mRetries;

    public JSONObject toServerJson() {
        return null;
    }

    public IMMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84c4ef8dad2fd44be1e236e6f9465e20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84c4ef8dad2fd44be1e236e6f9465e20");
            return;
        }
        this.mRetries = 0;
        this.mMsgUuid = UUID.randomUUID().toString();
    }

    public int getRetries() {
        return this.mRetries;
    }

    public IMMessage setRetries(int i) {
        this.mRetries = i;
        return this;
    }

    public void appendExtension(Map<String, Object> map) {
        JSONObject jSONObject;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da9dbf83a42be4908d1c6dcf511c9d3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da9dbf83a42be4908d1c6dcf511c9d3e");
        } else if (map != null && !map.isEmpty()) {
            try {
                if (TextUtils.isEmpty(this.mExtension)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(this.mExtension);
                }
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                this.mExtension = jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bd2a178ee0669ffe02d0ce3ccd99c6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bd2a178ee0669ffe02d0ce3ccd99c6b");
            return;
        }
        super.copyTo((Message) iMMessage);
        iMMessage.mRetries = this.mRetries;
    }

    @Override // com.sankuai.xm.im.message.bean.Message
    public void setCompatible(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b9e55e2045262594ce581cbbade245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b9e55e2045262594ce581cbbade245");
        } else if (c.a(str)) {
            super.setCompatible(str);
        } else {
            a.c("IMMessage::setCompatible, compatible invalid = " + str, new Object[0]);
        }
    }

    public String getCompatibleContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d5079b82ca1b42f2bec0b09e306dde1", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d5079b82ca1b42f2bec0b09e306dde1");
        }
        if (TextUtils.isEmpty(this.mCompatible)) {
            return "";
        }
        try {
            return new JSONObject(this.mCompatible).optString("text", "");
        } catch (JSONException e) {
            a.c("IMMessage::getCompatibleContent, e = " + e.getMessage(), new Object[0]);
            return "";
        }
    }

    public void setCompatibleContent(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e261f58d28223f8715526b217b5d877d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e261f58d28223f8715526b217b5d877d");
        } else if (obj != null && (obj instanceof String)) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                super.setCompatible(str);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("text", str);
                super.setCompatible(jSONObject.toString());
            } catch (JSONException e) {
                a.c("IMMessage::setCompatibleContent, e = " + e.getMessage(), new Object[0]);
            }
        }
    }

    public long getDefaultSenderUid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d131a0ad89ebace0e50de3ec02489ac", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d131a0ad89ebace0e50de3ec02489ac")).longValue();
        }
        if (MessageUtils.isGroupService(this.mCategory)) {
            return this.mFromPubId == 0 ? this.mFromUid : this.mFromPubId;
        }
        return this.mFromUid;
    }

    public int getDefaultSenderType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bdace520ee59595832564cc2ad193c84", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bdace520ee59595832564cc2ad193c84")).intValue() : MessageUtils.isGroupService(this.mCategory) ? this.mFromPubId == 0 ? 1 : 3 : (!MessageUtils.isPubService(this.mCategory) || this.mPubCategory == 5 || this.mFromUid == com.sankuai.xm.login.a.a().e()) ? 1 : 3;
    }

    public boolean isDuplicateMsg() {
        return this.mDuplicateMsg;
    }

    public void setDuplicateMsg(boolean z) {
        this.mDuplicateMsg = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[Catch: JSONException -> 0x008f, TryCatch #0 {JSONException -> 0x008f, blocks: (B:6:0x001b, B:7:0x004c, B:8:0x004f, B:10:0x0053, B:12:0x0062, B:13:0x006a, B:14:0x0079), top: B:18:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[Catch: JSONException -> 0x008f, TRY_LEAVE, TryCatch #0 {JSONException -> 0x008f, blocks: (B:6:0x001b, B:7:0x004c, B:8:0x004f, B:10:0x0053, B:12:0x0062, B:13:0x006a, B:14:0x0079), top: B:18:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject baseServerJson() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.xm.im.message.bean.IMMessage.changeQuickRedirect
            java.lang.String r10 = "21c31172ecfaa1ca651d1d588a4e9089"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L1b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8f
            r0.<init>()     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "msgUuid"
            java.lang.String r2 = r11.mMsgUuid     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "type"
            int r2 = r11.mMsgType     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "channel"
            short r2 = r11.mChannel     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "extension"
            java.lang.String r2 = r11.mExtension     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "sid"
            java.lang.String r2 = r11.mSID     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "receipt"
            boolean r2 = r11.mReceipt     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            int r1 = r11.mCategory     // Catch: org.json.JSONException -> L8f
            switch(r1) {
                case 1: goto L79;
                case 2: goto L6a;
                case 3: goto L53;
                default: goto L4f;
            }     // Catch: org.json.JSONException -> L8f
        L4f:
            switch(r1) {
                case 9: goto L79;
                case 10: goto L53;
                case 11: goto L53;
                default: goto L52;
            }     // Catch: org.json.JSONException -> L8f
        L52:
            goto L8e
        L53:
            java.lang.String r1 = "pubId"
            long r2 = r11.mToUid     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            long r1 = r11.mPeerUid     // Catch: org.json.JSONException -> L8f
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L8e
            java.lang.String r1 = "peerUid"
            long r2 = r11.mPeerUid     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            goto L8e
        L6a:
            java.lang.String r1 = "guid"
            long r2 = r11.mToUid     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "name"
            java.lang.String r2 = r11.mFromName     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            goto L8e
        L79:
            java.lang.String r1 = "toUid"
            long r2 = r11.mToUid     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "toAppId"
            short r2 = r11.mPeerAppId     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
            java.lang.String r1 = "name"
            java.lang.String r2 = r11.mFromName     // Catch: org.json.JSONException -> L8f
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L8f
        L8e:
            return r0
        L8f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.message.bean.IMMessage.baseServerJson():org.json.JSONObject");
    }
}
