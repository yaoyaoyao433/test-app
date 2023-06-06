package com.sankuai.model.notify;

import android.database.ContentObserver;
import android.net.Uri;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface DataNotifier {
    public static final Uri BASE_URI = new Uri.Builder().scheme("content").authority("group.meituan.com").build();

    Uri getBaseUri();

    void notifyChange(Uri uri, ContentObserver contentObserver);

    void registerContentObserver(Uri uri, boolean z, ContentObserver contentObserver);

    void unregisterContentObserver(ContentObserver contentObserver);
}
