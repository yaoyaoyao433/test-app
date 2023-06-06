package com.sankuai.xm.imui.session.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IExtraViewAdapter<M extends IMMessage> extends IExtraAdapter<M> {
    void bindView(View view, b<M> bVar);

    @NonNull
    View createView(Context context, b<M> bVar, ViewGroup viewGroup);
}
