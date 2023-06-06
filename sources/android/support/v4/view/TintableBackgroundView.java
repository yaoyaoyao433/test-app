package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface TintableBackgroundView {
    @Nullable
    ColorStateList getSupportBackgroundTintList();

    @Nullable
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode);
}
