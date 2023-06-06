package com.tencent.ijk.media.player;

import android.graphics.Rect;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class IjkTimedText {
    private Rect mTextBounds;
    private String mTextChars;

    public IjkTimedText(Rect rect, String str) {
        this.mTextBounds = null;
        this.mTextChars = null;
        this.mTextBounds = rect;
        this.mTextChars = str;
    }

    public final Rect getBounds() {
        return this.mTextBounds;
    }

    public final String getText() {
        return this.mTextChars;
    }
}
