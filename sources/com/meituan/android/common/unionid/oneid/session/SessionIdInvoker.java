package com.meituan.android.common.unionid.oneid.session;

import com.android.meituan.multiprocess.invoker.c;
import com.meituan.android.common.unionid.oneid.util.TempIDGenerator;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SessionIdInvoker implements c<Void, String> {
    public static final String SESSIONID = TempIDGenerator.generate();
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.android.meituan.multiprocess.invoker.c
    public String invoke(Void r1) {
        return SESSIONID;
    }
}
