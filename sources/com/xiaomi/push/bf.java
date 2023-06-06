package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.bm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class bf implements Runnable {
    private String a;
    private WeakReference<Context> b;

    public bf(String str, WeakReference<Context> weakReference) {
        this.a = str;
        this.b = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        bg bgVar;
        if (this.b == null || (context = this.b.get()) == null) {
            return;
        }
        if (bs.a(this.a) <= be.b) {
            com.xiaomi.channel.commonutils.logger.c.b("=====> do not need clean db");
            return;
        }
        String str = this.a;
        bi biVar = new bi(str, "status = ?", new String[]{"2"}, "a job build to delete uploaded job");
        String str2 = this.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        bh bhVar = new bh(str2, arrayList, null, null, null, null, null, 0, "job to get count of all message");
        biVar.e = bhVar;
        String str3 = this.a;
        com.xiaomi.channel.commonutils.logger.c.b("delete  messages when db size is too bigger");
        String a = bm.a(context).a(str3).a();
        if (TextUtils.isEmpty(a)) {
            bgVar = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("rowDataId in (select ");
            sb.append("rowDataId from " + a);
            sb.append(" order by createTimeStamp asc");
            sb.append(" limit ?)");
            bgVar = new bg(str3, sb.toString(), new String[]{"1000"}, "a job build to delete history message");
        }
        bhVar.e = bgVar;
        bm.a(context).a((bm.a) biVar);
    }
}
