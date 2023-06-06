package com.meituan.met.mercury.load.core;

import android.support.annotation.Nullable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface n {
    void onFail(Exception exc);

    void onSuccess(@Nullable List<DDResource> list);
}
