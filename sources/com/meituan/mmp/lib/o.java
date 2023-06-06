package com.meituan.mmp.lib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface o extends android.arch.lifecycle.f {
    Intent a(@NonNull String str, @Nullable Bundle bundle);

    boolean b();

    Activity e();

    boolean f();

    <T extends View> T findViewById(int i);

    Intent getIntent();

    String l();

    void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle);
}
