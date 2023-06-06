package com.sankuai.xm.integration.mediapicker;

import android.content.Context;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.IIntegrable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IMediaPicker extends IIntegrable {
    void a(Context context, a aVar, Callback<List<MediaResult>> callback);
}
