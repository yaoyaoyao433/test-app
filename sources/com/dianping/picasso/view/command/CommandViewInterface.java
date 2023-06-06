package com.dianping.picasso.view.command;

import android.support.annotation.NonNull;
import android.view.View;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.picasso.model.PicassoModel;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface CommandViewInterface<M> {
    DecodingFactory<M> getCommandViewDecodingFactory();

    void handleCommandView(View view, @NonNull BaseViewCommandModel baseViewCommandModel, @NonNull PicassoModel picassoModel);
}
