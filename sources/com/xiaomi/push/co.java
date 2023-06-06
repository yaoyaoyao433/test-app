package com.xiaomi.push;

import android.util.Log;
import android.util.Pair;
import com.meituan.passport.UserCenter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/* loaded from: classes6.dex */
public final class co implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ cn c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public co(cn cnVar, String str, Throwable th) {
        this.c = cnVar;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        SimpleDateFormat simpleDateFormat;
        String str;
        List list2;
        String str2;
        List list3;
        List list4;
        SimpleDateFormat simpleDateFormat2;
        String str3;
        List list5;
        List list6;
        String unused;
        list = cn.f;
        simpleDateFormat = cn.b;
        str = this.c.c;
        list.add(new Pair(String.format("%1$s %2$s %3$s ", simpleDateFormat.format(new Date()), str, this.a), this.b));
        list2 = cn.f;
        if (list2.size() > 20000) {
            list3 = cn.f;
            int size = (list3.size() - UserCenter.TYPE_LOGOUT_NEGATIVE) + 50;
            for (int i = 0; i < size; i++) {
                try {
                    list5 = cn.f;
                    if (list5.size() > 0) {
                        list6 = cn.f;
                        list6.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused2) {
                }
            }
            list4 = cn.f;
            simpleDateFormat2 = cn.b;
            str3 = this.c.c;
            list4.add(new Pair(String.format("%1$s %2$s %3$s ", simpleDateFormat2.format(new Date()), str3, "flush " + size + " lines logs."), null));
        }
        try {
            if (d.c()) {
                cn.b(this.c);
            } else {
                unused = this.c.c;
            }
        } catch (Exception e) {
            str2 = this.c.c;
            Log.e(str2, "", e);
        }
    }
}
