package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import com.xiaomi.push.bm;
import java.util.List;
/* loaded from: classes6.dex */
public final class bh extends bm.b<Long> {
    private long a;
    private String f;

    public bh(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, null, null, null, null, null, 0);
        this.a = 0L;
        this.f = str6;
    }

    @Override // com.xiaomi.push.bm.a
    public final Object a() {
        return Long.valueOf(this.a);
    }

    @Override // com.xiaomi.push.bm.b
    public final void a(Context context, List<Long> list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        this.a = list.get(0).longValue();
    }

    @Override // com.xiaomi.push.bm.b
    public final /* synthetic */ Long a(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
