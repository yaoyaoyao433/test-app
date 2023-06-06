package com.sankuai.waimai.imbase.monitor;

import android.support.annotation.NonNull;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IMessageVerificationService {
    @NonNull
    c doVerify(@NonNull IMMessage iMMessage, boolean z, int i);

    String getSnifferBizName();
}
