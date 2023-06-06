package com.sankuai.waimai.drug.im.b2c;

import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.waimai.imbase.init.model.b;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.vcard.d;
import com.sankuai.xm.im.vcard.entity.a;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MedB2CImSdkinitImpl implements IMSdkInitService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final LongSparseArray<a> mCache = new LongSparseArray<>();

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public void onInit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a getUserUiInfo(int i, final long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbf16bfba66da6104788a36e6d71dbfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbf16bfba66da6104788a36e6d71dbfb");
        }
        a aVar = mCache.get(j);
        if (aVar == null || TextUtils.isEmpty(aVar.d)) {
            com.sankuai.xm.ui.a.a().a(d.a(j, i, (short) 1057), new com.sankuai.xm.im.d<a>() { // from class: com.sankuai.waimai.drug.im.b2c.MedB2CImSdkinitImpl.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.d
                public final /* synthetic */ void b_(a aVar2) {
                    a aVar3 = aVar2;
                    Object[] objArr2 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a047274f12618ccd66ca076b82f37dca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a047274f12618ccd66ca076b82f37dca");
                    } else if (aVar3 == null) {
                        MedB2CImSdkinitImpl.mCache.put(j, new a());
                    } else {
                        MedB2CImSdkinitImpl.mCache.put(j, aVar3);
                    }
                }
            });
        }
        return aVar == null ? new a() : aVar;
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public com.sankuai.waimai.imbase.init.model.a createReceiveConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd3dce74fd948b2b180559434acedd79", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.init.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd3dce74fd948b2b180559434acedd79") : new com.sankuai.waimai.imbase.init.model.a((short) 1057, new com.sankuai.waimai.imbase.listener.a() { // from class: com.sankuai.waimai.drug.im.b2c.MedB2CImSdkinitImpl.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.a
            public final com.sankuai.waimai.imbase.listener.model.a a(IMMessage iMMessage, boolean z) {
                Object[] objArr2 = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5ff9e41ea2fce22c3e13e83c5982c96e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.listener.model.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5ff9e41ea2fce22c3e13e83c5982c96e") : new com.sankuai.waimai.imbase.listener.model.a(false);
            }
        });
    }

    @Override // com.sankuai.waimai.imbase.init.IMSdkInitService
    public b createSessionConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b059bc3aa92542385fd0e2e43bbe82b4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b059bc3aa92542385fd0e2e43bbe82b4") : new b((short) 1057, new com.sankuai.waimai.imbase.listener.b() { // from class: com.sankuai.waimai.drug.im.b2c.MedB2CImSdkinitImpl.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.listener.b
            public final com.sankuai.waimai.imbase.listener.model.b a(com.sankuai.xm.im.session.entry.a aVar) {
                String a2;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a5d24a3c4ab3899b66749307da78b1dc", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.imbase.listener.model.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a5d24a3c4ab3899b66749307da78b1dc");
                }
                try {
                    String str = "";
                    String str2 = "";
                    IMMessage iMMessage = aVar.b;
                    if (iMMessage != null) {
                        a userUiInfo = MedB2CImSdkinitImpl.this.getUserUiInfo(iMMessage.getCategory(), iMMessage.getChatId());
                        str2 = userUiInfo.b;
                        str = userUiInfo.d;
                    }
                    String str3 = str;
                    String str4 = str2;
                    IMMessage iMMessage2 = aVar.b;
                    Object[] objArr3 = {iMMessage2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6d877ab50cb672fe4efa18767eb92a1c", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6d877ab50cb672fe4efa18767eb92a1c");
                    } else if (iMMessage2 instanceof TextMessage) {
                        a2 = ((TextMessage) iMMessage2).getText();
                    } else if (iMMessage2 instanceof EventMessage) {
                        a2 = ((EventMessage) iMMessage2).getText();
                    } else if (iMMessage2 instanceof AudioMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_voice);
                    } else if (iMMessage2 instanceof ImageMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_pic);
                    } else if (iMMessage2 instanceof VideoMessage) {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_video);
                    } else if (iMMessage2 instanceof GeneralMessage) {
                        a2 = ((GeneralMessage) iMMessage2).getSummary();
                        if (TextUtils.isEmpty(a2)) {
                            a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_custom_msg);
                        }
                    } else {
                        a2 = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_unknown_msg);
                    }
                    return new com.sankuai.waimai.imbase.listener.model.b(str3, a2, aVar.d, str4, com.sankuai.waimai.imbase.register.b.WM_POI, new HashMap());
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                    return null;
                }
            }
        });
    }
}
