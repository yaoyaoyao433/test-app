package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import java.util.concurrent.Callable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class IntentCallable implements Callable<Void> {
    public Context a;
    public Intent b;
    public String c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.a = context;
        this.b = intent;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        b.a(this.a, this.b);
        PushBiUtil.reportExit(this.a, PushNaming.SET_NOTIFY_FLAG, this.c, ErrorEnum.SUCCESS);
        return null;
    }
}
