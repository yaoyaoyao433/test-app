package com.facebook.react.views.switchview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.SwitchCompat;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends SwitchCompat {
    private boolean a;
    @Nullable
    private Integer b;
    @Nullable
    private Integer c;

    public a(Context context) {
        super(context);
        this.a = true;
        this.b = null;
        this.c = null;
    }

    @Override // android.support.v7.widget.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.a && isChecked() != z) {
            this.a = false;
            super.setChecked(z);
            setTrackColor(z);
            return;
        }
        super.setChecked(isChecked());
    }

    private static void a(Drawable drawable, @Nullable Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void setTrackColor(@Nullable Integer num) {
        a(super.getTrackDrawable(), num);
    }

    public final void setThumbColor(@Nullable Integer num) {
        a(super.getThumbDrawable(), num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            setTrackColor(z);
        }
        this.a = true;
    }

    public final void setTrackColorForTrue(@Nullable Integer num) {
        if (num == this.c) {
            return;
        }
        this.c = num;
        if (isChecked()) {
            setTrackColor(this.c);
        }
    }

    public final void setTrackColorForFalse(@Nullable Integer num) {
        if (num == this.b) {
            return;
        }
        this.b = num;
        if (isChecked()) {
            return;
        }
        setTrackColor(this.b);
    }

    private void setTrackColor(boolean z) {
        if (this.c == null && this.b == null) {
            return;
        }
        setTrackColor(z ? this.c : this.b);
    }
}
