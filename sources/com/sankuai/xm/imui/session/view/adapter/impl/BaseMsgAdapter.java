package com.sankuai.xm.imui.session.view.adapter.impl;

import android.content.Context;
import android.support.annotation.CallSuper;
import com.sankuai.xm.imui.session.view.adapter.IMsgAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseMsgAdapter implements IMsgAdapter {
    public Context e;

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    @CallSuper
    public void init(Context context) {
        this.e = context;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.IMsgAdapter
    @CallSuper
    public void release() {
        this.e = null;
    }

    public final Context a() {
        return this.e;
    }
}
