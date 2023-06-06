package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ke {
    public static SharedPreferences a(Context context, String str) {
        if (context != null) {
            return context.getSharedPreferences("TMS_".concat(String.valueOf(str)), 0);
        }
        return null;
    }

    public static a a(SharedPreferences sharedPreferences) {
        return new a(sharedPreferences.edit());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        private SharedPreferences.Editor a;

        public a(SharedPreferences.Editor editor) {
            this.a = editor;
        }

        private void a(String str, int i) {
            this.a.putInt(str, i);
            this.a.commit();
        }

        private void a(String str, boolean z) {
            this.a.putBoolean(str, z);
            this.a.commit();
        }

        private void a(String str, float f) {
            this.a.putFloat(str, f);
            this.a.commit();
        }

        private void a(String str, long j) {
            this.a.putLong(str, j);
            this.a.commit();
        }

        public final void a(String str, String str2) {
            this.a.putString(str, str2);
            this.a.commit();
        }

        private void a(String str, Set<String> set) {
            this.a.putStringSet(str, set);
            this.a.commit();
        }
    }
}
