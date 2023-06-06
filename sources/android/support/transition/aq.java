package android.support.transition;

import android.graphics.Matrix;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public interface aq {
    aj a(@NonNull View view);

    void a(@NonNull View view, float f);

    void a(View view, int i, int i2, int i3, int i4);

    void a(@NonNull View view, @NonNull Matrix matrix);

    at b(@NonNull View view);

    void b(@NonNull View view, @NonNull Matrix matrix);

    float c(@NonNull View view);

    void d(@NonNull View view);

    void e(@NonNull View view);
}
