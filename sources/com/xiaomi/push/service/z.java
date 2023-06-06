package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public class z {
    private static volatile z c;
    protected SharedPreferences a;
    protected SharedPreferences b;
    private HashSet<a> d = new HashSet<>();

    /* loaded from: classes6.dex */
    public static abstract class a implements Runnable {
        private int a;
        private String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        protected abstract void a();

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a();
        }
    }

    private z(Context context) {
        this.a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    public static z a(Context context) {
        if (c == null) {
            synchronized (z.class) {
                if (c == null) {
                    c = new z(context);
                }
            }
        }
        return c;
    }

    private static String a(int i) {
        return "oc_" + i;
    }

    public final int a(int i, int i2) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getInt(a2, 0) : this.a.contains(a2) ? this.a.getInt(a2, 0) : i2;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(i + " oc int error " + e);
            return i2;
        }
    }

    public final int a(hh hhVar, int i) {
        try {
            return this.a.getInt(a(hhVar), i);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(hhVar + " version error " + e);
            return i;
        }
    }

    public final long a(int i, long j) {
        try {
            String a2 = a(i);
            if (this.b.contains(a2)) {
                return this.b.getLong(a2, 0L);
            }
            if (this.a.contains(a2)) {
                return this.a.getLong(a2, 0L);
            }
            return 777600000L;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(i + " oc long error " + e);
            return 777600000L;
        }
    }

    public final String a(int i, String str) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getString(a2, null) : this.a.contains(a2) ? this.a.getString(a2, null) : str;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(i + " oc string error " + e);
            return str;
        }
    }

    public final synchronized void a() {
        this.d.clear();
    }

    public final synchronized void a(a aVar) {
        if (!this.d.contains(aVar)) {
            this.d.add(aVar);
        }
    }

    public final void a(List<Pair<Integer, Object>> list) {
        if (com.xiaomi.push.g.a(list)) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        for (Pair<Integer, Object> pair : list) {
            if (pair.first != null) {
                String a2 = a(((Integer) pair.first).intValue());
                if (pair.second == null) {
                    edit.remove(a2);
                } else {
                    a(edit, pair, a2);
                }
            }
        }
        edit.apply();
    }

    public final void a(List<Pair<hh, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (com.xiaomi.push.g.a(list) || com.xiaomi.push.g.a(list2)) {
            com.xiaomi.channel.commonutils.logger.c.a("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.clear();
        for (Pair<hh, Integer> pair : list) {
            if (pair.first != null && pair.second != null) {
                edit.putInt(a((hh) pair.first), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            if (pair2.first != null && pair2.second != null) {
                a(edit, pair2, a(((Integer) pair2.first).intValue()));
            }
        }
        edit.apply();
    }

    public final boolean a(int i, boolean z) {
        try {
            String a2 = a(i);
            return this.b.contains(a2) ? this.b.getBoolean(a2, false) : this.a.contains(a2) ? this.a.getBoolean(a2, false) : z;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(i + " oc boolean error " + e);
            return z;
        }
    }

    public final void b() {
        com.xiaomi.channel.commonutils.logger.c.c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.d);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    private void a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        if (pair.second instanceof Integer) {
            editor.putInt(str, ((Integer) pair.second).intValue());
        } else if (pair.second instanceof Long) {
            editor.putLong(str, ((Long) pair.second).longValue());
        } else if (!(pair.second instanceof String)) {
            if (pair.second instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) pair.second).booleanValue());
            }
        } else {
            String str2 = (String) pair.second;
            if (str.equals(a(hg.AppIsInstalledList.by))) {
                editor.putString(str, com.xiaomi.push.ao.a(str2));
            } else {
                editor.putString(str, str2);
            }
        }
    }

    private static String a(hh hhVar) {
        return "oc_version_" + hhVar.c;
    }
}
