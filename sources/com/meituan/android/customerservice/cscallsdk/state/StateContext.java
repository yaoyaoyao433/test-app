package com.meituan.android.customerservice.cscallsdk.state;

import android.content.Context;
import com.meituan.android.customerservice.callbase.avengine.b;
import com.meituan.android.customerservice.callbase.base.c;
import com.meituan.android.customerservice.cscallsdk.b;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface StateContext {
    boolean checkAction(int i, int... iArr);

    b getAVEngine();

    c getCallProvider();

    com.meituan.android.customerservice.callbase.protohelper.b getCallRequstHelper();

    com.meituan.android.customerservice.cscallsdk.inner.c getCallSession();

    Context getContext();

    int getCurAction();

    b.C0244b getListener();

    boolean moveToState(int i, Object obj);

    boolean moveToWaitState(Object obj, boolean z);

    void setCurAction(int i);

    void toEnd();

    void toEnd(short s, String str, boolean z);

    boolean toNextState(Object obj);
}
