package com.sankuai.xm.base.tinyorm;

import android.content.ContentValues;
import android.database.Cursor;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface TableProxy<T> {
    d create(T t);

    ContentValues insert(T t);

    T query(Cursor cursor);

    ContentValues update(T t, String[] strArr);

    String where(T t);
}
