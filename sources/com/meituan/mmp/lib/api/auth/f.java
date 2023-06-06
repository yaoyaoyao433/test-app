package com.meituan.mmp.lib.api.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.meituan.mmp.lib.model.Event;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface f {
    Dialog a(Context context, com.meituan.mmp.lib.config.a aVar);

    String a(String str);

    Map<String, Boolean> a(Context context, String str);

    void a(Activity activity, com.meituan.mmp.lib.config.a aVar, Event event, i iVar);

    void a(Activity activity, com.meituan.mmp.lib.config.a aVar, String str, i iVar);

    void a(Activity activity, com.meituan.mmp.lib.config.a aVar, String str, String str2, i iVar);

    boolean a(com.meituan.mmp.lib.config.a aVar, String str);
}
