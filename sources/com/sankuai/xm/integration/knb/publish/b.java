package com.sankuai.xm.integration.knb.publish;

import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.js.JsHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.smtt.sdk.TbsReaderView;
import java.io.File;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends c implements com.sankuai.xm.base.voicemail.c {
    public static ChangeQuickRedirect a;
    private com.sankuai.xm.base.voicemail.c h;

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void b() {
    }

    public b(JsHost jsHost, short s, String str) {
        super(jsHost, "dxsdk.audioRecord", s, str);
        Object[] objArr = {jsHost, Short.valueOf(s), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ed4ba2a470728bdbfa9e9ea7e17352", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ed4ba2a470728bdbfa9e9ea7e17352");
        } else {
            this.h = null;
        }
    }

    @Override // com.sankuai.xm.base.voicemail.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f41b999f039753f25d7caa734d2fb07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f41b999f039753f25d7caa734d2fb07");
        } else {
            this.h.a(str);
        }
    }

    @Override // com.sankuai.xm.base.voicemail.c
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70227a1d62d081dfba1153338fe6ab08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70227a1d62d081dfba1153338fe6ab08");
        } else {
            this.h.b(str);
        }
    }

    @Override // com.sankuai.xm.base.voicemail.c
    public final void a(long j, long j2, File file) {
        Object[] objArr = {new Long(j), new Long(j2), file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef7ab6d52cf164aa95f34fb4084ac8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef7ab6d52cf164aa95f34fb4084ac8b");
        } else {
            this.h.a(j, j2, file);
        }
    }

    @Override // com.sankuai.xm.integration.knb.publish.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9df257b48d10f98326a617a511b13d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9df257b48d10f98326a617a511b13d");
            return;
        }
        final com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar = this.g;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.im.bridge.business.proto.im.a.a;
        this.h = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5f3293ac0589696dfb45047c42552aed", 6917529027641081856L) ? (com.sankuai.xm.base.voicemail.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5f3293ac0589696dfb45047c42552aed") : new com.sankuai.xm.base.voicemail.c() { // from class: com.sankuai.xm.im.bridge.business.proto.im.a.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.voicemail.c
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09f2a30330065aa6af560a0b81f04e0e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09f2a30330065aa6af560a0b81f04e0e");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 1);
                    hashMap.put(TbsReaderView.KEY_FILE_PATH, str);
                    a.a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a.this, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("audioRecord::onStart exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.base.voicemail.c
            public final void b(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bed237850224a807ee92db25740201a7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bed237850224a807ee92db25740201a7");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", 3);
                    hashMap.put(TbsReaderView.KEY_FILE_PATH, str);
                    a.a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a.this, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("audioRecord::onError exception:" + th, new Object[0]);
                }
            }

            @Override // com.sankuai.xm.base.voicemail.c
            public final void a(long j, long j2, File file) {
                Object[] objArr3 = {new Long(j), new Long(j2), file};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb779a9f4de003e9c70e1c01de387fe4", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb779a9f4de003e9c70e1c01de387fe4");
                    return;
                }
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("status", Integer.valueOf(file != null ? 2 : 4));
                    hashMap.put(TbsReaderView.KEY_FILE_PATH, file != null ? file : "");
                    hashMap.put("duration", Long.valueOf(j));
                    hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Long.valueOf(j2));
                    a.a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a.this, hashMap);
                } catch (Throwable th) {
                    com.sankuai.xm.im.bridge.base.util.a.c("audioRecord::onFinish exception:" + th, new Object[0]);
                }
            }
        };
    }
}
