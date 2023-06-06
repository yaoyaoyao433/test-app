package com.meituan.android.legwork;

import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.legwork.bean.im.insertmassage.ImInsertMessageView;
import com.meituan.android.legwork.common.im.f;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.waimai.imbase.listener.model.a;
import com.sankuai.waimai.imbase.utils.e;
import com.sankuai.xm.im.desensitization.c;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.vcard.d;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LegworkIMSdkInitImple implements IMSdkInitService {
    public static final String AVATAR_DEFAULT = "http://p0.meituan.net/scarlett/d6f71d0d35fb36f67ba4b5df80f8b7783326.png";
    public static final String TITLE_DEFAULT = "骑手师傅";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final LongSparseArray<com.sankuai.xm.im.vcard.entity.a> mCache = new LongSparseArray<>();

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "430489703e456322e7a373dac6e07df6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "430489703e456322e7a373dac6e07df6");
        } else {
            com.sankuai.waimai.imbase.configuration.a.a().a((short) 1013, new c() { // from class: com.meituan.android.legwork.LegworkIMSdkInitImple.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.desensitization.b
                public final /* synthetic */ void a(com.sankuai.xm.im.vcard.entity.a aVar, d dVar, com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a> aVar2) {
                    com.sankuai.xm.im.vcard.entity.a aVar3 = aVar;
                    Object[] objArr2 = {aVar3, dVar, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e105571214242565819221cd4490f8e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e105571214242565819221cd4490f8e3");
                        return;
                    }
                    if (aVar3 != null) {
                        aVar3.d = f.b().a(aVar3.d);
                    }
                    if (aVar2 != null) {
                        aVar2.onSuccess(aVar3);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c68eca63f1935f97194b4292e7e80c6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c68eca63f1935f97194b4292e7e80c6") : new com.sankuai.waimai.imbase.init.model.a((short) 1013, b.a());
    }

    public static /* synthetic */ com.sankuai.waimai.imbase.listener.model.a lambda$createReceiveConfig$96(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e06b0a7f5db8f24607a26aabbcca4d57", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e06b0a7f5db8f24607a26aabbcca4d57");
        }
        if (iMMessage == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String a = f.b().a(iMMessage.getFromName());
        hashMap.put("from_backend_push", "1");
        return new com.sankuai.waimai.imbase.listener.model.a(new a.C0962a(a, getMessageBodyDigest(iMMessage), "", R.drawable.wm_imbase_launcher, iMMessage.getSts(), null, null), new a.b(a.a(), getMessageBodyDigest(iMMessage), hashMap, iMMessage.getChannel()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.xm.im.vcard.entity.a getRiderUIInfo(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0e32f1189abc6bb2f96d486a99e0e8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.xm.im.vcard.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0e32f1189abc6bb2f96d486a99e0e8a");
        }
        com.sankuai.xm.im.vcard.entity.a aVar = mCache.get(j);
        if (aVar == null || TextUtils.isEmpty(aVar.d)) {
            com.sankuai.waimai.imbase.configuration.a.a().a((short) 1013, j, 1, new com.sankuai.xm.im.a<com.sankuai.xm.im.vcard.entity.a>() { // from class: com.meituan.android.legwork.LegworkIMSdkInitImple.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    final com.sankuai.xm.im.vcard.entity.a aVar2 = (com.sankuai.xm.im.vcard.entity.a) obj;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "eee2b059bc101c5583b5e6dfffbfe40c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "eee2b059bc101c5583b5e6dfffbfe40c");
                    } else {
                        e.a().a(new Runnable() { // from class: com.meituan.android.legwork.LegworkIMSdkInitImple.2.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fd00534d9acbd7fbff4f2416457dac6f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fd00534d9acbd7fbff4f2416457dac6f");
                                } else if (aVar2 != null) {
                                    LegworkIMSdkInitImple.mCache.put(j, aVar2);
                                }
                            }
                        });
                    }
                }
            });
        }
        return aVar;
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.b createSessionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "859a66f5468f5a03096d5e72301c9dac", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "859a66f5468f5a03096d5e72301c9dac") : new com.sankuai.waimai.imbase.init.model.b((short) 1013, new com.sankuai.waimai.imbase.listener.b() { // from class: com.meituan.android.legwork.LegworkIMSdkInitImple.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.b
            public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5539de7fc949638a7faed297053affa5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5539de7fc949638a7faed297053affa5");
                }
                try {
                    com.sankuai.xm.im.vcard.entity.a riderUIInfo = LegworkIMSdkInitImple.this.getRiderUIInfo(aVar.a().getChatId());
                    String str = LegworkIMSdkInitImple.TITLE_DEFAULT;
                    String str2 = LegworkIMSdkInitImple.AVATAR_DEFAULT;
                    if (riderUIInfo != null) {
                        if (!TextUtils.isEmpty(riderUIInfo.d)) {
                            str = riderUIInfo.d;
                        }
                        if (!TextUtils.isEmpty(riderUIInfo.b)) {
                            str2 = riderUIInfo.b;
                        }
                    }
                    return new com.sankuai.waimai.imbase.listener.model.b(str, LegworkIMSdkInitImple.getMessageBodyDigest(aVar.a()), aVar.b(), str2, com.sankuai.waimai.imbase.register.b.UNREAD_BUBBLE, null);
                } catch (Exception e) {
                    x.a(e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getMessageBodyDigest(Object obj) {
        String optString;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0126b1132e2ce9dbbc1ea579f3a8459c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0126b1132e2ce9dbbc1ea579f3a8459c");
        }
        String a = com.sankuai.waimai.imbase.utils.f.a(obj);
        if (!(obj instanceof GeneralMessage)) {
            return obj instanceof GPSMessage ? "[位置]" : a;
        }
        GeneralMessage generalMessage = (GeneralMessage) obj;
        if (generalMessage.getType() == 1001) {
            try {
                optString = new JSONObject(new String(((GeneralMessage) obj).getData(), "utf-8")).optJSONObject("data").optString("message");
                if (TextUtils.isEmpty(optString)) {
                    return a;
                }
            } catch (Exception e) {
                x.e("LegworkIMSdkInitImple.getMessageBodyDigest()", "exception1 msg:", e);
                x.a(e);
                return a;
            }
        } else if (generalMessage.getType() != 2) {
            return a;
        } else {
            try {
                ImInsertMessageView imInsertMessageView = (ImInsertMessageView) new Gson().fromJson(new JSONObject(new String(((GeneralMessage) obj).getData(), "utf-8")).toString(), (Class<Object>) ImInsertMessageView.class);
                if (TextUtils.isEmpty(imInsertMessageView.content)) {
                    return a;
                }
                optString = imInsertMessageView.content;
            } catch (Exception e2) {
                x.e("LegworkIMSdkInitImple.getMessageBodyDigest()", "exception2 msg:", e2);
                x.a(e2);
                return a;
            }
        }
        return optString;
    }
}
