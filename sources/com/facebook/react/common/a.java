package com.facebook.react.common;

import android.net.Uri;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends RuntimeException {
    private a(String str, Throwable th) {
        super(str, th);
    }

    public static a a(String str, String str2, Throwable th) {
        String replace = "\n\nTry the following to fix the issue:\n• Ensure that the packager server is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT>' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n".replace("<PORT>", String.valueOf(Uri.parse(str).getPort()));
        return new a(str2 + replace + "", th);
    }
}
