package com.facebook.react;

import android.app.Service;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class HeadlessJsTaskService extends Service implements com.facebook.react.jstasks.c {
    private final Set<Integer> a = new CopyOnWriteArraySet();
}
