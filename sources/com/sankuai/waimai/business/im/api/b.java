package com.sankuai.waimai.business.im.api;

import android.app.Activity;
import android.os.Bundle;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(boolean z);
    }

    void a(long j, short s, String str, d.a aVar);

    void a(Activity activity, long j, long j2, String str, String str2, int i, int i2, boolean z, a aVar, int i3);

    void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, int i2, String str2, boolean z);

    void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, int i2, String str2, boolean z, Bundle bundle);

    void a(Activity activity, SessionId sessionId, int i, long j, long j2, String str, long j3, HashSet<String> hashSet, int i2, String str2, boolean z, Bundle bundle);

    void a(Activity activity, SessionId sessionId, long j, String str, int i, long j2, boolean z, boolean z2);

    void a(Activity activity, SessionId sessionId, long j, String str, int i, long j2, boolean z, boolean z2, Bundle bundle);

    void a(Activity activity, String str, int i, boolean z, long j, int i2, int i3);

    void a(Activity activity, String str, int i, boolean z, long j, int i2, long j2, String str2);

    void b(Activity activity, String str, int i, boolean z, long j, int i2, int i3);
}
