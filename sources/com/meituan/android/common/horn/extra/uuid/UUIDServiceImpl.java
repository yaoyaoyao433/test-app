package com.meituan.android.common.horn.extra.uuid;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.uuid.GetUUID;
import com.meituan.uuid.UUIDListener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UUIDServiceImpl implements IUUIDService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.horn.extra.uuid.IUUIDService
    public String getUUID(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6195ae153e969b47382b79de6dddd03", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6195ae153e969b47382b79de6dddd03") : GetUUID.getInstance().getUUID(context);
    }

    @Override // com.meituan.android.common.horn.extra.uuid.IUUIDService
    public void getUUID(@NonNull Context context, final IUUIDListener iUUIDListener) {
        Object[] objArr = {context, iUUIDListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f4c3b7a1abb7a25406cd62da2aa3db9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f4c3b7a1abb7a25406cd62da2aa3db9");
        } else {
            GetUUID.getInstance().getUUID(context, new UUIDListener() { // from class: com.meituan.android.common.horn.extra.uuid.UUIDServiceImpl.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.uuid.UUIDListener
                public void notify(Context context2, String str) {
                    Object[] objArr2 = {context2, str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c60b216a39d9602463def4887690f9c6", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c60b216a39d9602463def4887690f9c6");
                    } else if (iUUIDListener != null) {
                        iUUIDListener.notify(context2, str);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.horn.extra.uuid.IUUIDService
    public String loadUUIDFromSelfCache(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "279657bf38645ad6bbef46cb8a5a8e43", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "279657bf38645ad6bbef46cb8a5a8e43") : GetUUID.getInstance().loadUUIDFromSelfCache(context);
    }
}
