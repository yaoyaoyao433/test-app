package com.meituan.android.common.horn.extra.sharkpush;

import android.content.Context;
import android.support.annotation.NonNull;
import com.dianping.sharkpush.b;
import com.dianping.sharkpush.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SharkPushServiceImpl implements ISharkPushService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.horn.extra.sharkpush.ISharkPushService
    public void init(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49cd53a61d13a6bbe30e1ae7bf21818d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49cd53a61d13a6bbe30e1ae7bf21818d");
        } else {
            b.a();
        }
    }

    @Override // com.meituan.android.common.horn.extra.sharkpush.ISharkPushService
    public int registerPush(String str, final ISharkPushListener iSharkPushListener) {
        Object[] objArr = {str, iSharkPushListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e40ef486469c632c9f58c75213915264", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e40ef486469c632c9f58c75213915264")).intValue() : b.a(str, new d.a() { // from class: com.meituan.android.common.horn.extra.sharkpush.SharkPushServiceImpl.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.sharkpush.d.a, dianping.com.nvlinker.stub.ISharkPushReceiver
            public void onReceive(String str2, byte[] bArr) {
                Object[] objArr2 = {str2, bArr};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4c8a42a7bcdb8c931c0af50bee1465fd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4c8a42a7bcdb8c931c0af50bee1465fd");
                } else if (iSharkPushListener != null) {
                    iSharkPushListener.onReceive(str2, bArr);
                }
            }

            @Override // dianping.com.nvlinker.stub.ISharkPushReceiver
            public void onError(String str2, int i, String str3) {
                Object[] objArr2 = {str2, Integer.valueOf(i), str3};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7d6610c1c8aa1a784823774b2cb3ac66", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7d6610c1c8aa1a784823774b2cb3ac66");
                } else if (iSharkPushListener != null) {
                    iSharkPushListener.onError(str2, i, str3);
                }
            }
        });
    }
}
