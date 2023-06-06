package com.meituan.msc.modules.container;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface r extends android.arch.lifecycle.f {
    Intent a(@NonNull String str, @Nullable Bundle bundle);

    boolean a();

    Activity c();

    boolean d();

    boolean e();

    String f();

    <T extends View> T findViewById(int i);

    View g();

    Intent getIntent();

    Window getWindow();

    String h();

    String i();

    Map<String, String> j();

    String k();

    void l();

    void startActivityForResult(Intent intent, int i, @Nullable Bundle bundle);
}
