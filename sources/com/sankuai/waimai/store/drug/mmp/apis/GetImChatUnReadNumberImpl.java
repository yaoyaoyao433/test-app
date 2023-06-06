package com.sankuai.waimai.store.drug.mmp.apis;

import android.text.TextUtils;
import com.meituan.msi.api.extension.medicine.ChatMessageChangeResponse;
import com.meituan.msi.api.extension.medicine.ChatMessageParam;
import com.meituan.msi.api.extension.medicine.ChatMessageResponse;
import com.meituan.msi.api.extension.medicine.IImChatMessage;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.drug.c;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GetImChatUnReadNumberImpl extends IImChatMessage implements com.sankuai.waimai.store.im.number.a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.store.im.number.a
    public final void a(int i) {
    }

    @Override // com.meituan.msi.api.extension.medicine.IImChatMessage
    public final void a(MsiCustomContext msiCustomContext, ChatMessageParam chatMessageParam, final i<ChatMessageResponse> iVar) {
        Object[] objArr = {msiCustomContext, chatMessageParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcdc1954be10dde9653c05896474fe07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcdc1954be10dde9653c05896474fe07");
        } else if (chatMessageParam != null) {
            int i = chatMessageParam.business_type;
            if (i == 3 && !t.a(chatMessageParam.poi_im_info)) {
                GetMenuResponse.MenuInfo.AdditionalInfo.d dVar = (GetMenuResponse.MenuInfo.AdditionalInfo.d) com.sankuai.waimai.store.util.i.a(chatMessageParam.poi_im_info, GetMenuResponse.MenuInfo.AdditionalInfo.d.class);
                if (dVar == null) {
                    return;
                }
                com.sankuai.waimai.business.im.api.a.a().a(dVar.a, dVar.b, "pub-service", new d.a() { // from class: com.sankuai.waimai.store.drug.mmp.apis.GetImChatUnReadNumberImpl.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.a
                    public final void a(int i2) {
                        Object[] objArr2 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "680e83a5df78f1a26ee48303f05b6c41", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "680e83a5df78f1a26ee48303f05b6c41");
                            return;
                        }
                        ChatMessageResponse chatMessageResponse = new ChatMessageResponse();
                        chatMessageResponse.im_chat_unRead_message_count = i2;
                        iVar.a(chatMessageResponse);
                    }
                });
            } else if (i == 2) {
                b.a().a((short) 1024, new d.c() { // from class: com.sankuai.waimai.store.drug.mmp.apis.GetImChatUnReadNumberImpl.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.c
                    public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
                        Object[] objArr2 = {list};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "babeeeb74f04e917f3a62cf487c345a0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "babeeeb74f04e917f3a62cf487c345a0");
                            return;
                        }
                        int b2 = GetImChatUnReadNumberImpl.b(list);
                        ChatMessageResponse chatMessageResponse = new ChatMessageResponse();
                        chatMessageResponse.im_chat_unRead_message_count = b2;
                        iVar.a(chatMessageResponse);
                    }
                });
            } else if (i == 4) {
                final int[] iArr = {0};
                b.a().a((short) 1024, new d.a() { // from class: com.sankuai.waimai.store.drug.mmp.apis.GetImChatUnReadNumberImpl.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.a
                    public final void a(int i2) {
                        Object[] objArr2 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10853011083e0e18c3c69110c544cf93", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10853011083e0e18c3c69110c544cf93");
                            return;
                        }
                        iArr[0] = i2;
                        b.a().a((short) 1031, new d.a() { // from class: com.sankuai.waimai.store.drug.mmp.apis.GetImChatUnReadNumberImpl.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.imbase.manager.d.a
                            public final void a(int i3) {
                                Object[] objArr3 = {Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4297c8f4d764fa3b0a2fab88bc8b6ba8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4297c8f4d764fa3b0a2fab88bc8b6ba8");
                                    return;
                                }
                                ChatMessageResponse chatMessageResponse = new ChatMessageResponse();
                                chatMessageResponse.im_chat_unRead_message_count = iArr[0] + i3;
                                iVar.a(chatMessageResponse);
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(List<com.sankuai.xm.im.session.entry.a> list) {
        IMMessage iMMessage;
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d14e5fab85b49538d7f791cd6f822ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d14e5fab85b49538d7f791cd6f822ec")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((List) list) > 0) {
            for (com.sankuai.xm.im.session.entry.a aVar : list) {
                if (aVar != null && (iMMessage = aVar.b) != null) {
                    String extension = iMMessage.getExtension();
                    if (!TextUtils.isEmpty(extension)) {
                        try {
                            if (TextUtils.isEmpty(new JSONObject(extension).optString("inquiryId"))) {
                                i += aVar.d;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return i;
    }

    @Override // com.meituan.msi.api.extension.medicine.IImChatMessage
    public final void a(MsiCustomContext msiCustomContext, j<ChatMessageChangeResponse> jVar) {
        Object[] objArr = {msiCustomContext, jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2f73197fc033be337a87c0d8b11fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2f73197fc033be337a87c0d8b11fc3");
            return;
        }
        Object[] objArr2 = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bda88fee23be91c72a257592c3305ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bda88fee23be91c72a257592c3305ae5");
            return;
        }
        com.sankuai.waimai.drug.im.number.a.a().c = jVar;
        com.sankuai.waimai.drug.im.number.a.a().b();
    }
}
