package com.meituan.msi.api.extension.medicine;

import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiCustomApi;
import com.meituan.msi.api.i;
import com.meituan.msi.api.j;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class IImChatMessage implements IMsiCustomApi {
    public static ChangeQuickRedirect a;

    public abstract void a(MsiCustomContext msiCustomContext, ChatMessageParam chatMessageParam, i<ChatMessageResponse> iVar);

    public abstract void a(MsiCustomContext msiCustomContext, j<ChatMessageChangeResponse> jVar);

    @MsiApiMethod(isCallback = true, name = "onImUnreadCountChange", response = ChatMessageChangeResponse.class, scope = "medicine")
    public void onImUnreadCountChange(MsiCustomContext msiCustomContext) {
    }

    @MsiApiMethod(name = "getImChatUnReadMessage", request = ChatMessageParam.class, response = ChatMessageResponse.class, scope = "medicine")
    public void msiGetImChatUnReadMessage(ChatMessageParam chatMessageParam, final MsiCustomContext msiCustomContext) {
        Object[] objArr = {chatMessageParam, msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91849bc9f69ee77d20fe77a994e0ca1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91849bc9f69ee77d20fe77a994e0ca1");
        } else {
            a(msiCustomContext, chatMessageParam, new i<ChatMessageResponse>() { // from class: com.meituan.msi.api.extension.medicine.IImChatMessage.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.i
                public final /* synthetic */ void a(ChatMessageResponse chatMessageResponse) {
                    ChatMessageResponse chatMessageResponse2 = chatMessageResponse;
                    Object[] objArr2 = {chatMessageResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a23be7a33f9b40294053dd5a1d1c8009", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a23be7a33f9b40294053dd5a1d1c8009");
                    } else {
                        msiCustomContext.onSuccess(chatMessageResponse2);
                    }
                }

                @Override // com.meituan.msi.api.i
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d332f960c25543f63b75c79c4eda708", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d332f960c25543f63b75c79c4eda708");
                    } else {
                        msiCustomContext.onError(i, str);
                    }
                }
            });
        }
    }

    @MsiApiMethod(name = "addImUnreadCountChangeListener", scope = "medicine")
    public void msiAddImUnreadCountChangeListener(final MsiCustomContext msiCustomContext) {
        Object[] objArr = {msiCustomContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0809a63eec7ea8b7e41f7f806335e9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0809a63eec7ea8b7e41f7f806335e9b");
        } else {
            a(msiCustomContext, new j<ChatMessageChangeResponse>() { // from class: com.meituan.msi.api.extension.medicine.IImChatMessage.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.api.j
                public final /* synthetic */ void a(ChatMessageChangeResponse chatMessageChangeResponse) {
                    ChatMessageChangeResponse chatMessageChangeResponse2 = chatMessageChangeResponse;
                    Object[] objArr2 = {chatMessageChangeResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c7f394c59018215631a91d7078dfa6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c7f394c59018215631a91d7078dfa6d");
                    } else {
                        msiCustomContext.dispatchEvent("medicine", "onImUnreadCountChange", chatMessageChangeResponse2);
                    }
                }
            });
        }
    }
}
