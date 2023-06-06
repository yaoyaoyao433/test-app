package com.sankuai.waimai.foundation.core.service.order;

import android.content.Context;
import com.sankuai.waimai.foundation.core.service.user.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOrderSubmitService {
    public static final String KEY = "IOrderSubmitService";

    boolean checkAccount(Context context, long j, String str, a.EnumC0947a enumC0947a);

    void perOrder(d dVar);
}
