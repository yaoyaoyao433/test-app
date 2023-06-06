package com.meituan.android.recce.host;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface HostInterface {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class SystemEvent {
        public static final int RenderEndEvent = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    void appendViewManagerNameList(String[] strArr);

    boolean dispatchAppEvent(String str, String str2);

    boolean dispatchEvent(int i, int i2, String str);

    boolean dispatchEvent(String str, String str2);

    boolean dispatchViewEvent(View view, int i, String str);

    void drop();

    boolean isValid();

    void runStart(byte[] bArr);

    void sendSystemEvent(int i);
}
