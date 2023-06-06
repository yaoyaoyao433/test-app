package com.xiaomi.push;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.util.Collection;
/* loaded from: classes6.dex */
public final class js {

    /* loaded from: classes6.dex */
    public static class a {
        private final StringBuilder a;
        private final String b;
        private final String c;

        public a() {
            this(CommonConstant.Symbol.COLON, CommonConstant.Symbol.COMMA);
        }

        public a(String str, String str2) {
            this.a = new StringBuilder();
            this.b = str;
            this.c = str2;
        }

        public final a a(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.a.length() > 0) {
                    this.a.append(this.c);
                }
                StringBuilder sb = this.a;
                sb.append(str);
                sb.append(this.b);
                sb.append(obj);
            }
            return this;
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public static int a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
